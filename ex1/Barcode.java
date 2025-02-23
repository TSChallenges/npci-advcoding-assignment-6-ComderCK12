class Barcode {

    public Barcode() {
        System.out.println("In Barcode constructor");
    }

    public String createBarcode(Product p) {
        String bcode = "|";
        int hashcode = p.getId() + p.getName().hashCode();

        String numberStr = String.valueOf(hashcode);

        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);

            if (digit % 2 == 0) {
                bcode = bcode + "❚";
            } else {
                bcode = bcode + "|";
            }
        }

        return bcode + "|";
    }
}
