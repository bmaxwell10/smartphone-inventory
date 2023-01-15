public class PhoneStore {
    private String name; // name of the store
    private String address; // street address of the store
    Smartphone[] inventory; // inventory of Smartphones in this store

    PhoneStore() {

    }
    PhoneStore(String name, String address) { // unused but allows for a store to just be a
        this.name = name;
        this.address = address;

    }

    PhoneStore(String name, String address, Smartphone[] inventory) {
        this.name = name;
        this.address = address;
        this.inventory = inventory;
    }

    public void setName(String name) {
        this.name = name;
    }  // unused

    public void setAddress(String address) {
        this.address = address;
    } // unused

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void show() {
        System.out.println(getName() + ": "  + getAddress());

        System.out.println();

        for (Smartphone smartphone : inventory) {
            smartphone.show();
        }

        System.out.println();
    }

    public void showStoreInfo() {
        System.out.println(getName() + ": " + getAddress() + "\n");

    }
}

