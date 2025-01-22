public class MainAfter {
    // 使用有界通配符 Animal<? extends Object>
    public static void say(Animal<?> animal) {
        // 调用 say 方法，不依赖于具体类型
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
        say(dog); // 传入 Dog 对象
        runAndSleep(dog);
        say(cat); // 传入 Cat 对象
        runAndSleep(cat);
    }
}