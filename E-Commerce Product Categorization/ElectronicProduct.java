class ElectronicProduct extends Product {

    String brand;

    ElectronicProduct(int id, String name, String brand) {
        super(id, name);
        this.brand = brand;
    }

    boolean isMatch(String keyword) {
        return productName.contains(keyword) || brand.contains(keyword);
    }
}