package Task5;

public class DeliveryDepartment {
    private String address;
    private boolean isAvailableForTruck;
    private boolean isAvailableForTrain;
    private boolean isAvailableForBus;


    public DeliveryDepartment(String address, boolean isAvailableForTruck, boolean isAvailableForTrain, boolean isAvailableForBus) {
        if (address.isEmpty()) {
            throw new IllegalArgumentException("emptyadress");
        }

        this.address = address;
        this.isAvailableForTruck = isAvailableForTruck;
        this.isAvailableForTrain = isAvailableForTrain;
        this.isAvailableForBus = isAvailableForBus;
    }

    public double getMaxWeight() {
        if (isAvailableForTrain) return 1000;
        if (isAvailableForTruck) return 500;
        if (isAvailableForBus) return 100;
        return 30;
    }

    public String getAddress() {
        return address;
    }
}
