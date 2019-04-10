public class Electrician extends  Worker {

    private double wiringCost;

    public void setWiringCost(double){};
    public String doWork(){};
    @Override
    public double calculatePay(){};
    @Override
    public String toString(){};


    public Electrician(String firstName, String lastName,Adress adress,int idNumber, double hoursWorked, double hourlyRate){


    }

    public void  calcultePay (hoursWorked,hourlyRate, wiringCosr){
        horusWorked *  hourlyRate + wiringCost;
    }
}
