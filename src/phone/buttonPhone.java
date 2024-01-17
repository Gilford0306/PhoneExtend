package phone;

import java.awt.geom.Point2D;

public class buttonPhone extends basePhone{

    private boolean ruButton;
    public buttonPhone(String name, float price, float battery, boolean ruButton) {
        super(name, price, battery);
        this.ruButton = ruButton;
    }

    public boolean getruButton() {
        return ruButton;
    }

    public void setRuButton(boolean ruButton) {
        this.ruButton = ruButton;
    }

    @Override
    public String getInfo() {

        if (this.ruButton == true){
            return  super.getInfo() + "\tRussian keybord: yes" ;
        }else {
            return  super.getInfo() + "\tRussian keybord: no" ;

        }

    }
}


