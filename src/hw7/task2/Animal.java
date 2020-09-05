package hw7.task2;

public enum Animal {
    RABBIT(10), FOX(11), WOLF(21);

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Animal(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal {" +
                "age=" + age +
                '}';
    }
}
