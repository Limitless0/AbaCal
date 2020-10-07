package AbaCal;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import static AbaCal.Main.calendar;
import static AbaCal.Main.weathers;

public class TabControl {
    public double slider = 1;
    private Integer count = 0;
    @FXML
    private Label tab2Lbl;
    @FXML
    private Button btn;
    @FXML
    private Slider varSlider;
    @FXML
    private Label sldDisp;
    @FXML
    private TextField weekLen;
    @FXML
    private TextField monthLen;
    @FXML
    private TextField seasonLen;
    @FXML
    private TextField yearLen;
    @FXML
    private ComboBox<Integer> seasonPicker;
    @FXML
    private TextField avgTemp;
    @FXML
    private TextField avgWind;
    @FXML
    private TextField avgPrecip;

    @FXML
    private void varOnPress() {
        slider = varSlider.getValue();
        sldDisp.setText(String.valueOf(slider));
    }

    @FXML
    private void setYearLength() {
       Main.calendar = new Calendar(Integer.parseInt(weekLen.getText()),
                Integer.parseInt(monthLen.getText()),
                Integer.parseInt(seasonLen.getText()),
                Integer.parseInt(yearLen.getText()));
       seasonPickerSetter();
    }

    @FXML
    private void seasonPickerSetter() {
        for (int ii = 0; ii < calendar.yearLength; ii++) {
            seasonPicker.getItems().add(ii);
        }
    }

    @FXML
    private void setSeason() {
        if (Main.weathers == null) {
            Main.weathers = new Weather[calendar.yearLength];
        }
        Main.weathers[seasonPicker.getValue()] = new Weather(Integer.parseInt(avgTemp.getText()),
                Integer.parseInt(avgWind.getText()),
                Integer.parseInt(avgPrecip.getText()),
                        (int) varSlider.getValue());
    }

    @FXML
    private void initialize() {
        if (Main.loaded) {
            seasonPickerSetter();
            Main.weathers = new Weather[calendar.yearLength];
        }
    }
}
