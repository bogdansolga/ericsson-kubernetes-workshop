package com.ericsson.java.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Objects;

@Entity(name = "Person")
@Table(name = "person")
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "person_sequence_generator")
    @SequenceGenerator(name = "person_sequence_generator", sequenceName = "person_sequence", allocationSize = 1)
    private int id;

    @Column(name = "firstName", unique = false, nullable = false, insertable = true, updatable = false, length = 50)
    private String firstName;

    @Column(name = "lastName", unique = false, nullable = false, insertable = true, updatable = true, length = 10)
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected Person() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return id + ", " + firstName + " " + lastName;
    }
}
