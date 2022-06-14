public class DataTypes {
    public static void main(String[] args) {
        int b = 1234567890;
        long nL = 12345678901L;

        double nD = 123.456789123;
        float nF = 123.456F;

        var salary = 1000; //int
        // pension 3% del salario
        var pension = salary * 0.03; //double
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Jean Chuquispuma";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " +totalSalary);
    }
}
