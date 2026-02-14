public class ZaraBonus {
    public static double[][] generateEmployeeData(int n) {
        double[][] data = new double[n][2];

        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000);
            data[i][1] = (int)(Math.random() * 11);
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] updated = new double[data.length][3];

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus;

            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            double newSalary = salary + bonus;

            updated[i][0] = salary;
            updated[i][1] = bonus;
            updated[i][2] = newSalary;
        }
        return updated;
    }

    public static void displayTotals(double[][] updated) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;

        System.out.println("Old Salary\tBonus\t\tNew Salary");

        for (int i = 0; i < updated.length; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\n",
                    updated[i][0], updated[i][1], updated[i][2]);

            totalOld += updated[i][0];
            totalBonus += updated[i][1];
            totalNew += updated[i][2];
        }

        System.out.println("---------------------------------------------");
        System.out.printf("Total\t\t%.2f\t%.2f\t%.2f\n",
                totalOld, totalBonus, totalNew);
    }

    public static void main(String[] args) {
        int employees = 10;

        double[][] data = generateEmployeeData(employees);
        double[][] updated = calculateBonus(data);
        displayTotals(updated);
    }
}
