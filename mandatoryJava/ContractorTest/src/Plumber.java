public class Plumber extends  Worker {

    private  double plumbingMatrials = 0;

   public  Plumber(String firstName, String lastName, Address address,
                   int idnumber, double hours,double rate){

       super(firstName,lastName,address,idnumber,hours,rate);
   }




    public void setPlumbingCosts(double ammount){

       plumbingMatrials = ammount;
    };


    public String doWork(){
        return  "Install plumbing";
    };

    @Override
    public String toString(){
        return  "Plumber" + super.toString() + "\n" + doWork();
    };
    @Override
    public double calculatePay(){

        return  super.calculatePay() + plumbingMatrials;
    };




}