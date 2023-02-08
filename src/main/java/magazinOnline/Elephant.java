package magazinOnline;

public class Elephant {
    public String name;
    public char size;
    public int age;

    Elephant(String name, char size, int age) {
        this.name = name;
        this.size = size;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public char getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }
}
