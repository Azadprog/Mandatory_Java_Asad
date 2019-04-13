public class Worker {


    public String firstName;
    public String lastName;
    public Address address;
    public int idnNmber;
    public double hoursWorked;
    public double hourlyRate;

    public String doWork() {
        return "Worker";
    }

    ;

    public Worker(String firstName, String lastName, Address address,
                  int idNumber, double hour, double rate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.idnNmber = idNumber;
        this.hoursWorked = hour;
        this.hourlyRate = rate;

    }

    public void setHoursWorked(double hours) {
        hoursWorked = hours;
    }

    ;

    public void setHourlyRate(double rate) {
        hourlyRate = rate;

    }

    ;


    public double calculatePay() {
        return hoursWorked * hourlyRate;

    }

    ;

    @Override
    public String toString() {
        return firstName + " " + lastName + " \ncCompensation: $" + calculatePay();

    }

};
