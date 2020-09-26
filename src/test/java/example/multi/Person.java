package example.multi;

class Person {
    private final String name;
    private final String surename;

    Person(String name, String surename) {
        this.name = name;
        this.surename = surename;
    }

    String getFullName() {
        return name + " " + surename;
    }
}
