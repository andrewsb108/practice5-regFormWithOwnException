package worker;


import java.util.Objects;

public class Worker {
    private String name;
    private int age;
    private int category;

    public Worker() {
    }

    public Worker(String name, int age, int category) {
        this.name = name;
        this.age = age;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory() {
        this.category = category;
    }

    public String toString() {
        return getClass().getName() + " Name is: " + name + ", age is: " + age + ", category is: " + category;
    }
    @Override
    public boolean equals(Object o) {
        if(this == o) { return true;}
        if(o == null || getClass() != o.getClass()) { return false;}
        if(o instanceof Worker){
            Worker temp = (Worker)o;
            return this.name == temp.name && this.age == temp.age && this.category == temp.category;
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return (int)(31 * age + category + ((name == null) ? 0 : name.hashCode()));
    }

    public static void main(String[] args) {
        Worker worker = new Worker("James", 35, 4);
        System.out.println(worker);
    }
}
	
	
	