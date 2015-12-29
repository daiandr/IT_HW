package task;


public class Person {

    private String name;
    private int age;
    private boolean isMale;

    Person(String name, int age, boolean isMale) {
        if (name != null) {
            this.name = name;
        }
        if (age > 0) {
            this.age = age;
        }
        this.isMale = isMale;
    }

    void showPersonInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("IsMale: " + this.isMale);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setMale(boolean male) {
        isMale = male;
    }

}

