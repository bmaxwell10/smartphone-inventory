public class Smartphone {
    final private String mfg; // company
    final private String model; // specific model
    final private String os;// operating system
    final private int storage; // data storage capacity
    final private int ram; // memory in GB
    final private String color;// primary color
    final private int rearCameraLenses;// number of camera lenses
    private float price;// how much does it cost

    public Smartphone(String mfg,
                      String model,
                      String os,
                      int ram,
                      int storage,
                      String color,
                      int rearCameraLenses,
                      float price) {
        this.mfg = mfg;
        this.model = model;
        this.os = os;
        this.ram = ram;
        this.storage = storage;
        this.color = color;
        this.rearCameraLenses = rearCameraLenses;
        this.setPrice(price);
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getMfg() {
        return mfg;
    }

    public String getModel() {
        return model;
    }

    public String getOs() {
        return os;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    public int getRearCameraLenses() {
        return rearCameraLenses;
    }

    public float getPrice() {
        return price;
    }

    public void show() {
        System.out.println("Manufacturer: " + getMfg() + "," +
                "\tModel: " + getModel() + "," +
                "\tOS: " + getOs() + "," +
                "\tRam (GB): " + getRam() + "," +
                "\tStorage (GB): " + getStorage() + "," +
                "\tColor: " + getColor() + "," +
                "\tRear Camera Lenses: " + getRearCameraLenses() + "," +
                "\tPrice: $" + getPrice() + "\n");
    }
}