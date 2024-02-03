class Booking {
    private String customerName;
    private int numOfAdults;
    private int numOfChildren;
    private int numOfDays;

    public Booking(String details) {
        String[] tokens = details.split(":");
        this.customerName = tokens[0];
        this.numOfAdults = Integer.parseInt(tokens[1]);
        this.numOfChildren = Integer.parseInt(tokens[2]);
        this.numOfDays = Integer.parseInt(tokens[3]);
    }

    public void calculateBookingPrice() {
        if (numOfAdults < 0) {
            System.out.println("Invalid input for number of adults");
        } else if (numOfChildren < 0) {
            System.out.println("Invalid input for number of children");
        } else if (numOfDays <= 0) {
            System.out.println("Invalid input for number of days");
        } else {
            int totalCost = numOfAdults * 1000 + numOfChildren * 650;
            totalCost *= numOfDays;
            System.out.println(customerName + " your booking is confirmed and the total cost is " + totalCost);
        }
    }
}