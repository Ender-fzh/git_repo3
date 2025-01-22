public class MainBefore {
    public static void say(Animal animal) {
        animal.say();
    }

    public static void runAndSleep(Behavior behavior) {
        behavior.run();
        behavior.sleep();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // 调用 Dog 和 Cat 的方法
        dog.say();
        dog.run();
        dog.sleep();

        cat.say();
        cat.run();
        cat.sleep();

        // 使用静态方法
        say(dog);
        runAndSleep(dog);
        say(cat);
        runAndSleep(cat);
    }
}