package com.example.PetAdopt;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class Pet {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", nullable = false)

    //    private Long id;
    @Id
    private Long id;
    private @Size(
            min = 2,
            max = 20
    ) String name;
    private String age;
    private String color;
    private String sex;
    private String size;
    private String family;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pet() {
    }

    public Pet(String age, String color, String sex, String size, String family) {
        this.age = age;
        this.color = color;
        this.sex = sex;
        this.size = size;
        this.family = family;
    }


    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;
        return Objects.equals(getId(), pet.getId()) && Objects.equals(getName(), pet.getName()) && Objects.equals(getAge(), pet.getAge()) && Objects.equals(getColor(), pet.getColor()) && Objects.equals(getSex(), pet.getSex()) && Objects.equals(getSize(), pet.getSize()) && Objects.equals(getFamily(), pet.getFamily());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge(), getColor(), getSex(), getSize(), getFamily());
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", age='" + age + '\'' +
                ", color='" + color + '\'' +
                ", sex='" + sex + '\'' +
                ", size='" + size + '\'' +
                ", family='" + family + '\'' +
                '}';
    }

    public interface FindByName {
    }
}
