// Animal 类（泛型类）
class Animal<T> {
    public T name;
    public Animal(T name) {
        this.name = name;
    }
    public void say() {
        System.out.println(name + " is saying");
    }
}

// Behavior 接口
interface Behavior {
    void run();
    void sleep();
}

// Dog 类
class Dog extends Animal<String> implements Behavior {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println(name);
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Cat 类
class Cat extends Animal<String> implements Behavior {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println(name);
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}