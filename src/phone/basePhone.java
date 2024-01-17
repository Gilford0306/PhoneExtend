package phone;

public class basePhone {

        private String name;
        private float price;
        private float battery;

        public basePhone(String name, float price, float battery){
            this.name = name;
            this.price = price;
            this.battery = battery;
        }

        public void setName(String name){
            this.name = name;
        }
        public void setPrice(float price) {
            this.price = price;
        }
        public void setBattery(float battery) {
            this.battery = battery;
        }

        public String getName() {
            return name;
        }
        public float getPrice() {
            return price;
        }
        public float getBattery() {
            return battery;
        }

        public String getInfo(){
            return String.format("Name: %s\tPrice: %s\tBattery: %s", this.name, String.valueOf(this.price), String.valueOf(this.battery));
        }
    }

