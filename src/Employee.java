public class Employee {

    String name;
    int salary;
    int dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Employee(String name, int salary, int dob, int phone) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
        this.phone = phone;
    }

    int phone;

}
