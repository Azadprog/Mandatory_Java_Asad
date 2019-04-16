public class Carpenter extends Worker {

    private double lumberCost;


    public Carpenter(String firstName, String lastName, Address address,
                     int idNumber, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, address, idNumber, hoursWorked, hourlyRate);


    }


    public void setLumberCosts(double ammount) {

        lumberCost = ammount;
    }

    ;

    public String doWork() {

        return "carpenter";

    }

    ;

    @Override
    public String toString() {
        return "Capenter : " + super.toString() + "\n" + doWork();
    }

    ;


    @Override
    public double calculatePay() {
        return super.calculatePay() + lumberCost;

    }

    ;


}