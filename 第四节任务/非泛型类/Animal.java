// Animal 类（非泛型）
class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public void say() {
        System.out.println(name + " is saying");
    }
}