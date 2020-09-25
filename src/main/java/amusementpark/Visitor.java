package amusementpark;

class Visitor {

    private final int age;
    private final int height;

    Visitor(int age, int height) {
        this.age = age;
        this.height = height;
    }

    int getAge() {
        return age;
    }

    int getHeight() {
        return height;
    }
}
