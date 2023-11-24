package ArraysEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Demo {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee(1);

        Map<Employee, String> map = new HashMap<>();
        map.put(emp1, "Jack");
        map.put(emp2, "Jack");

        System.out.println(map.size());

        System.out.println("\nPrint map");
        for(Map.Entry<Employee, String> e : map.entrySet()) {
            System.out.println(e.getKey().hashCode() + " " + e.getValue());
        }

    }

}

class Employee {
    int id;
    static int i = 0;

    public Employee(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return i++;
    }
}