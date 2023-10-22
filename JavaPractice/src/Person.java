public class Person <T extends Number, U> {
    private T id;
    private U age;

    public Person(T id, U age) {
        this.id = id;
        this.age = age;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public U getAge() {
        return age;
    }

    public void setAge(U age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" + id + "-" + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            if (this.id == ((Person<?, ?>) obj).getId() && this.age == ((Person<?, ?>) obj).getAge()) return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.id + "" + this.age).hashCode();
    }
}
