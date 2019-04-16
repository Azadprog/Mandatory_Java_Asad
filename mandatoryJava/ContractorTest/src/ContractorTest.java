import java.time.LocalDate;
import java.util.ArrayList;

public class ContractorTest {
    public static void main(String[] args) {


        Address client1 = new Address("123 Main Street", "Anywhere", "PA",
//#A
                "19001");
        Address client2 = new Address("44 South Main Street", "Cleveland", "OH",
                "42111");
        LocalDate start1 = LocalDate.parse("2019-11-03");
//#B
        LocalDate end1 = LocalDate.parse("2020-05-29");
        Project p1 = new Project("h", "helo", client1, start1, end1);
        LocalDate start2 = LocalDate.parse("2019-06-26");
        LocalDate end2 = LocalDate.parse("2019-07-27");
        Project p2 = new Project("Motion Lights", "Maggie Thygeson",
                client2, start2, end2);
        Address eAddress = new Address("467 Seminole Avenue", "Jenkintown",
                "PA", "19446");
        Address cAddress = new Address("88 Stallion Circle", "Horsham",
                "PA", "19022");
        Address pAddress = new Address("9821", "Apt B", "Siglerville",
                "PA", "19345");
        Worker e = new Electrician("Peg", "Fisher", eAddress, 1234, 15, 20);
        Worker c = new Carpenter("Yusef", "Eberly", cAddress, 2456, 17.40, 30);
        Worker p = new Plumber("Harley", "Davidson", pAddress, 3214, 25, 20);
        ArrayList<Worker> workers = new ArrayList<>();
//#E
        workers.add(c);
//#F
        workers.add(e);
        workers.add(p);
        ((Carpenter) c).setLumberCosts(2000);
//#G
        ((Electrician) e).setWiringCosts(3200);
        ((Plumber) p).setPlumbingCosts(2750);
        p1.addWorkes(workers); //house requires all three workers //#H
        p1.setOverhead(.18);
//the overhead is higher for a house
        System.out.println(p1.toString() +  p1.getName() +
                p1.getTotalCost() +  p1.getOverhead());
        System.out.println("***************************************************"
                + "\n***************************************************\n");
        workers.remove(p); //project 2 does not need a plumber //#I
        workers.remove(c); //project 2 does not need a carpenter
        ((Electrician) e).setWiringCosts(300); //#J
        workers.get(0).setHoursWorked(20); //set the hours worked to 20
        p2.addWorkes(workers);
        System.out.println(p2.toString()+ p2.getName()+
                p2.getTotalCost() + p2.getOverhead());

//#K
        if (p2.compareTo(p1) < 0) {
            System.out.println("\nThe " + p2.getName() + " project is "
                    + "scheduled before " + p1.getName());
        } else {
            System.out.println("\nThe " + p1.getName() + " project is "
                    + "scheduled prior to " + p2.getName());
        }
        System.out.println("\n");


        /*
        Huske liste :

style selv  - er separarete  ikke  store mellomrom  lesbart

egne navn  - varable navan

forhold til uml  skjema

kommentarer




         */
    }
}