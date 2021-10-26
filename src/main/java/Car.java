public class Car {
    // Instance variables
    private int fuelLevel;
    private int fuelEfficiency;
    private String carBrand;
    private boolean isOn=false;

    public Car(int a, int b, String c){
        fuelLevel=a;
        fuelEfficiency=b;
        carBrand=c;
    }

    public void toggleSwitch(){
        this.isOn=! this.isOn;
    }

    public void refuel(int fuel){
        this.fuelLevel+=fuel;
    }

    public void drive(int miles){
        this.fuelLevel-=miles/this.fuelEfficiency;
    }

    public void increaseFuelEfficiency(int fuelEff){
        this.fuelEfficiency+=fuelEff;
    }

    public int remainingMile(){
        return this.fuelLevel*this.fuelEfficiency;
    }

    public int getFuelLevel(){
        return this.fuelLevel;
    }
    public int getFuelEfficiency(){
        return this.fuelEfficiency;
    }
    public String getCarBrand(){
        return this.carBrand;
    }
    public boolean getIsOn(){
        return this.isOn;
    }



}
