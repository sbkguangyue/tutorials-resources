/*
 * Copyright 2010-2017 Restlet S.A.S. All rights reserved.
 * Restlet is registered trademark of Restlet S.A.S.
 */

public class Contact {
    String name;

    int age;

    public String getName() {
        return name;
    }

    public Contact setName(final String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Contact setAge(final int age) {
        this.age = age;
        return this;
    }
}
