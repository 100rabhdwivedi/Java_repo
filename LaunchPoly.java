class Animal {

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void running() {
        System.out.println("Animal is running");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void jump() {
        System.out.println("Animal can jump");
    }
}


class Lion extends Animal {

    @Override
    public void eat() {
        System.out.println("Lion is eating");
    }

    @Override
    public void running() {
        System.out.println("Lion is running");
    }

    @Override
    public void sleep() {
        System.out.println("Lion is sleeping");
    }
}


class Monkey extends Animal {

    @Override
    public void eat() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void running() {
        System.out.println("Monkey is running");
    }

    @Override
    public void sleep() {
        System.out.println("Monkey is sleeping");
    }
}


class Forest {

    public void permit(Animal animal) {

        animal.eat();
        animal.running();
        animal.sleep();
        animal.jump();
    }
}


public class LaunchPoly {

    public static void main(String[] args) {

        Monkey m = new Monkey();
        Lion l = new Lion();

        Forest f = new Forest();

        f.permit(m);
        System.out.println();

        f.permit(l);
    }
}