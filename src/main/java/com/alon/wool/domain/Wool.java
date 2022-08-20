package com.alon.wool.domain;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
public class Wool {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Material material;
    @ElementCollection(targetClass = Color.class)
    @JoinTable(name="wool_colors", joinColumns = @JoinColumn(name = "wool_id"))
    @Enumerated(EnumType.STRING)
    private Set<Color> colors;

    public Wool() {
    }

    public Wool(String name, Material material, Set<Color> colors) {
        this.name = name;
        this.material = material;
        this.colors = colors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Set<Color> getColors() {
        return colors;
    }

    public void setColors(Set<Color> colors) {
        this.colors = colors;
    }
}
