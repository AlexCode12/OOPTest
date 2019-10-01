public class Employee {

private int id;
private String firstName;
private String lastName;
private int salary;

public Employee () {
    id = 1;
    firstName = "Alexander";
    lastName = "Olsson";
    salary = 40000;
}

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName (String name) {
    return lastName + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary (int salary) {
    return salary*12;
    }
    public int raiseSalary (int percent) {
    return this.salary * 20/100 + this.salary;
    }

    public String toString() {
    return id + firstName + lastName + raiseSalary(salary);
    }

    public static void main(String[] args) {
        Employee em = new Employee();
        System.out.println(em.toString());
    }
}