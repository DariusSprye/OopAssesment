package buisness;

public class Buisness1 {
    public static void main(String[] args) {

            HourlyEmployee hourlyEmployee1 = new HourlyEmployee();
            hourlyEmployee1.name = "Bob";
            hourlyEmployee1.ID = "0";

            hourlyEmployee1.printBadge();

            SalariedEmployee salariedEmployee1 = new SalariedEmployee();
            salariedEmployee1.name = "Sarah";
            salariedEmployee1.ID = "1";

            salariedEmployee1.printBadge();

    }
}
