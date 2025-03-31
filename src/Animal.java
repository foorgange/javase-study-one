import java.util.Objects;

public class Animal {
    private  String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
        public String getName(){
            return name;
        }
        public void setName (String name){
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }
        public double getWeight(){
            return weight;
        }
        public void setWeight(double weight){
            this.weight = weight;
        }
        public void displayInfo(){
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Weight:"+weight);
        }
        public void makeSound(){
            System.out.println("Animal is making a sound.");
        }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Double.compare(weight, animal.weight) == 0 && Objects.equals(name, animal.name);
    }


}

