package com.example.Employee.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "id", nullable = false)
    private String idnp;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "salariu", nullable = false)
    private Float salariu;

    public long getId() {
        return id;
    }

    public Employee(long id, String idnp, String name, Float salariu) {
        this.id = id;
        this.idnp = idnp;
        this.name = name;
        this.salariu = salariu;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdnp() {
        return idnp;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalariu() {
        return salariu;
    }

    public void setSalariu(Float salariu) {
        this.salariu = salariu;
    }
}
