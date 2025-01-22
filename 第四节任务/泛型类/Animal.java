// Animal 类（泛型）
class Animal<T> {
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public void say() {
        System.out.println(name + " is saying");
    }
}