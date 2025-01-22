// 主类
public class Main {
    // Dog 类
    static class Dog extends Animal<String> implements Behavior {
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
    static class Cat extends Animal<String> implements Behavior {
        public Cat(String name) {
            super(name);
        }

        @Override
        public void say() {
            System.out.println(name + " is saying");
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

    // 主方法
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        dog.say();
        dog.run();
        dog.sleep();

        cat.say();
        cat.run();
        cat.sleep();

        say(dog);
        runAndSleep(dog);
        say(cat);
        runAndSleep(cat);
    }

    // 静态方法 say
    public static void say(Animal<?> animal) {
        animal.say();
    }

    // 静态方法 runAndSleep
    public static void runAndSleep(Behavior behavior) {
        behavior.run();
        behavior.sleep();
    }
}