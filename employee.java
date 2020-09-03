//Q2 
public class employee
{
    String name;
    double base_salary, HRA;
    void initialize (String n, double base, double hra)
    {
        name = n;
        base_salary = base;
        HRA = hra;
    }
    void display()
    {
        System.out.println("The name of the employee is "+name);
        System.out.println("The total salary of the employee is " + (base_salary + (50*HRA)/100));
    }
    public static void main()
    {
        employee obj = new employee();
        obj.initialize ("Rittika", 50000.00, 12000.00);
        obj.display();
    }
}