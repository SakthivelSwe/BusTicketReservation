public class Bus {
    private int busNo;
    private boolean Ac;
    private int capacity;

    public Bus(int busNo, boolean ac, int capacity) {
        this.busNo = busNo;
        Ac = ac;
        this.capacity = capacity;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public boolean isAc() {
        return Ac;
    }

    public void setAc(boolean ac) {
        Ac = ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void displayBusInfo() {
        System.out.println("Bus No: "+busNo+" Ac: "+Ac+" Bus capacity: "+capacity);
    }
}
