import phone.buttonPhone;
import phone.touchscreenPhone;


public class main{
    public static void main(String[] args){

        buttonPhone phone1 = new buttonPhone("Test", 2, 2, true);
        System.out.println(phone1.getInfo());
        touchscreenPhone phone2 = new touchscreenPhone("Test", 2, 2, 5);
        System.out.println(phone2.getInfo());

        showcase showcase1 = new showcase();
        showcase1.setPhone(phone1);
        showcase1.setPhone(phone2,1,1);
        showcase1.setPhone(phone2,3,0);
        showcase1.setPhone(phone2, 1,5);
        showcase1.takePhone(1,1);
        showcase1.setPhone(phone2,1,1);
        showcase1.showShelves();
    }
}

