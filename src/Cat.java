public class Cat extends Animal {
    private String color;
    public Cat(String name ,int age, double weight, String color) {
        super(name, age, weight);
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    @Override
    public void makeSound(){
        System.out.println("喵喵喵！");
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Color:" + color);
    }

}