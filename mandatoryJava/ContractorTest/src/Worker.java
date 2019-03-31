public class Worker {

    private String firstName;
    private String lastName;
    private Address address;
    private double hoursWorked;
    private double hourlyRate;

    public void setHoursWorked(double){};
    public void setHourlyRate(double){};
    public String doWork(){};

    public double calculatePay(){};
    @Override
    public String toString(){};
}
