package HT_J_6;

import java.util.Objects;

public class Person {
    

    private static int currentId = 0;
    private int id;
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private String nickname;

   
    public Person(String name, String surname, int age, Gender gender, String nickname){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.nickname = nickname;
        id = ++currentId;
    }
    
    public String getName() {
        return name;
    }

    public String getSurame() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getNickname() {
        return nickname;
    }

    public String getInfo() {
        return String.format("(%d) %s %s @%s [%s] [%d]", id, name, surname, nickname, gender, age);
    }

    @Override
    public  String toString() {
        return String.format("%s %s @%s",name, surname, nickname);
        }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person anotherPerson = (Person) obj;
        return Objects.equals(name, anotherPerson.name) &&
            Objects.equals(surname, anotherPerson.surname) &&
            Objects.equals(nickname, anotherPerson.nickname) &&
            id == anotherPerson.id &&
            age == anotherPerson.age &&
            gender == anotherPerson.gender;    
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, nickname, id);
    }


}
