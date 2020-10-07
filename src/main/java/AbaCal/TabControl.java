package AbaCal;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TabControl {
    @FXML
    private Label tab2Lbl;
    @FXML
    private Button btn;
    public double slider = 1;
    private Integer count = 0;
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
    private void varOnPress() {
        slider = varSlider.getValue();
        sldDisp.setText(String.valueOf(slider));
    }


    @FXML
    private void setYearLength() {
        Calendar calendar = new Calendar(Integer.parseInt(weekLen.getText()),
                Integer.parseInt(monthLen.getText()),
                Integer.parseInt(seasonLen.getText()),
                Integer.parseInt(yearLen.getText()));
        for (int ii = 0; ii < Integer.parseInt(yearLen.getText()); ii++) {
            seasonPicker.getItems().add(ii);
        }
    }
}
