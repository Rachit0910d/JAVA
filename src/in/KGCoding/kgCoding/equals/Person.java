package in.kgCoding.equals;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    private String id;

    public Person(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(!(obj instanceof Person)){
//            return false;
//        }
//        Person per = (Person) obj;
//        return per.id.equals(id) &&
//                per.age == age &&
//                per.name.equals(name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }


}


