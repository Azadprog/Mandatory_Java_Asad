public class Electrician extends Worker {

    private double wiringCost = 0.0;


    public Electrician(String firstName, String lastName, Address address,
                       int idNumber, double hoursWorked, double hourlyRate) {

        super(firstName, lastName, address, idNumber, hoursWorked, hourlyRate);


    }

    public void setWiringCosts(double ammount) {
        wiringCost = ammount;

    }

    ;

    public String doWork() {

        return "intall";
    }

    ;


    @Override
    public String toString() {

        return "Electrictian" + super.toString() + "\n" + doWork();
    }

    ;


    @Override
    public double calculatePay() {
        return super.calculatePay() + wiringCost;

    }
}
