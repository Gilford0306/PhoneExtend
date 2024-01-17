
package phone;

import java.awt.geom.Point2D;

public class touchscreenPhone extends basePhone{

    private float display;
    public touchscreenPhone(String name, float price, float battery, float display) {
        super(name, price, battery);
        this.display = display;
    }

    public float getdisplay() {
        return display;
    }

    public void setdisplay(float display) {
        this.display = display;
    }

    @Override
    public String getInfo() {

            return  super.getInfo() + "\tDisplay: " + String.valueOf(this.display);
        }
    }






