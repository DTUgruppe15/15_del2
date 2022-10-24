import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;

public class UIController {

    GUI gui;

    public UIController(){
        gui = new GUI(CustomFields());
    }

    public GUI_Field[] CustomFields(){
        GUI_Field[] fields = new GUI_Field[11];

        GUI_Street field0 = new GUI_Street();
        field0.setTitle("Tower");
        fields[0] = field0;

        GUI_Street field1 = new GUI_Street();
        field1.setTitle("Crater");
        fields[1] = field1;

        GUI_Street field2 = new GUI_Street();
        field2.setTitle("Palace gates");
        fields[2] = field2;

        GUI_Street field3 = new GUI_Street();
        field3.setTitle("Cold Desert");
        fields[3] = field3;

        GUI_Street field4 = new GUI_Street();
        field4.setTitle("Walled city");
        fields[4] = field4;

        GUI_Street field5 = new GUI_Street();
        field5.setTitle("Monastary");
        fields[5] = field5;

        GUI_Street field6 = new GUI_Street();
        field6.setTitle("Black cave");
        fields[6] = field6;

        GUI_Street field7 = new GUI_Street();
        field7.setTitle("Huts in the mountain");
        fields[7] = field7;

        GUI_Street field8 = new GUI_Street();
        field8.setTitle("The Werewall");
        fields[8] = field8;

        GUI_Street field9 = new GUI_Street();
        field9.setTitle("The pit");
        fields[9] = field9;

        GUI_Street field10 = new GUI_Street();
        field10.setTitle("Goldmine");
        fields[10] = field10;


        return fields;
    }


}
