import phone.basePhone;

public class showcase {
    private basePhone[][] shelves;

    public showcase() {
        shelves = new basePhone[2][6];
    }
    public void setPhone(basePhone phone) {
        for (int i = 0; i < shelves.length; i++) {
            for (int j = 0; j < shelves[i].length; j++) {
                if (shelves[i][j] == null) {
                    shelves[i][j] = phone;
                    System.out.println("The phone has been successfully placed on the shelf " + (i + 1) + ", location " + (j + 1));
                    return;
                }
            }
        }
        System.out.println("No more space!");
    }

    public void setPhone(basePhone phone, int shelf, int place) {
        if (shelf > 0 && shelf <= shelves.length && place > 0 && place <= shelves[0].length) {
            if (shelves[shelf - 1][place - 1] == null) {
                shelves[shelf - 1][place - 1] = phone;
                System.out.println("The phone was successfully placed on the shelf " + shelf + ", place " + place);
            } else {
                System.out.println("The space is already taken.");
            }
        } else {
            System.out.println("Invalid shelf or location number.");
        }
    }

    public basePhone takePhone(int shelf, int place) {
        if (shelf > 0 && shelf <= shelves.length && place > 0 && place <= shelves[0].length) {
            basePhone phone = shelves[shelf - 1][place - 1];
            if (phone != null) {
                shelves[shelf - 1][place - 1] = null;
                System.out.println("The phone was successfully taken from the shelf " + shelf + ", place " + place);
                return phone;
            } else {
                System.out.println("There is no telephone at this location.");
                return null;
            }
        } else {
            System.out.println("Invalid location number.");
            return null;
        }
    }
    public void showShelves(){
        for (int i = 0; i < shelves.length; i++) {
            for (int j = 0; j < shelves[i].length; j++) {
                basePhone phone = shelves[i][j];
                if (phone == null) {
                    System.out.print("[Empty]\t");
                } else {
                    System.out.print("[" + phone.getName() + "]\t");
                }
            }
            System.out.println();
        }

    }
}


