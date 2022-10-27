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
        field0.setSubText("+250");
        fields[0] = field0;

        GUI_Street field1 = new GUI_Street();
        field1.setTitle("Crater");
        field1.setSubText("-100");
        fields[1] = field1;

        GUI_Street field2 = new GUI_Street();
        field2.setTitle("Palace gates");
        field2.setSubText("+100");
        fields[2] = field2;

        GUI_Street field3 = new GUI_Street();
        field3.setTitle("Cold Desert");
        field3.setSubText("-20");
        fields[3] = field3;

        GUI_Street field4 = new GUI_Street();
        field4.setTitle("Walled city");
        field4.setSubText("+180");
        fields[4] = field4;

        GUI_Street field5 = new GUI_Street();
        field5.setTitle("Monastery");
        field5.setSubText("0");
        fields[5] = field5;

        GUI_Street field6 = new GUI_Street();
        field6.setTitle("Black cave");
        field6.setSubText("-70");
        fields[6] = field6;

        GUI_Street field7 = new GUI_Street();
        field7.setTitle("Huts in the mountain");
        field7.setSubText("+60");
        fields[7] = field7;

        GUI_Street field8 = new GUI_Street();
        field8.setTitle("The Werewall");
        field8.setSubText("-80 +turn");
        fields[8] = field8;

        GUI_Street field9 = new GUI_Street();
        field9.setTitle("The pit");
        field9.setSubText("-50");
        fields[9] = field9;

        GUI_Street field10 = new GUI_Street();
        field10.setTitle("Goldmine");
        field10.setSubText("+650");
        fields[10] = field10;

        return fields;
    }


}
