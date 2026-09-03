package nl.novi.les2.huiswerk.classes;

public class DogOwner {
    private String name;
    private String sex;
    private Dog dog;

    public DogOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void changeDogName(String name) {
        dog.setName(name);
    }

    public void addOneYearToDogAge() {
        dog.setAge(dog.getAge() + 1);
    }

    @Override
    public String toString() {
        return name + " heeft een " + dog.getSex() + ",\n" +
                "Deze is " + dog.getAge() + " jaar oud en van het ras: " + dog.getSpecies() + ".\n" +
                "De hond heet: " + dog.getName();
    }
}
