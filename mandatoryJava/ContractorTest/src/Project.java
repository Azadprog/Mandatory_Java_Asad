import java.time.LocalDate;
import java.util.ArrayList;

public class Project implements Comparable {


    public ArrayList<Worker> workers = new ArrayList<>();
    private String projectName;
    private String owner;
    private Address projectAddress;
    private double overheadPercent = .10, overheadAmmount;
    private LocalDate startDate;
    private LocalDate endDate;

    public Project(String projectName, String owner, Address projectAddress,
                   LocalDate startDate, LocalDate endDate) {
        this.projectName = projectName;
        this.owner = owner;
        this.projectAddress = projectAddress;

        this.startDate = startDate;
        this.endDate = endDate;


    }


    public Project(String projectName, String owner, Address projectAddress) {

        this.projectAddress = projectAddress;
        this.projectName = projectName;
        this.owner = owner;

    }


    public String getName() {
        return projectName;
    }

    public double getOverhead() {
        return overheadAmmount;
    }

    public double getTotalCost() {
        return calculateProjectcost();
    }

    public void setOverhead(double overhead) {

        this.overheadPercent = overhead;
    }


    public void addWorkes(ArrayList<Worker> workers) {
        this.workers = workers;


    }

    public double calculateProjectcost() {
        double totalCost = 0;
        for (Worker w : workers) {
            totalCost += w.calculatePay();

        }
        overheadAmmount = overheadPercent * totalCost;
        totalCost += overheadAmmount;
        return totalCost;

    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Project) {
            if (((Project) o).startDate.isAfter(this.startDate))
                return -1;
        }
        return 1;

    }

    @Override
    public String toString() {

        String projectDetails;
        projectDetails = "Project name : $s" + "\nStart Date:" + startDate + "\nCustomer:" + owner + "\nAddress"
                + projectAddress.toString() + "\n" + "===========================\n";
        for (Worker w : workers) {

            projectDetails += w.toString() + "\n\n";


        }
        projectDetails += "Project total : $%.2f\n";
        projectDetails += "Contractor Overhead : $%.2f\n";
        return projectDetails;

    }
}








