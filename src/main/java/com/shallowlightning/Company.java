package com.shallowlightning;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Company implements Serializable{
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="name")
    @NotNull
    private String name;

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}

}