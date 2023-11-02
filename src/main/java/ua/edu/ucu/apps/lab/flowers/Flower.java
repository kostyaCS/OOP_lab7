package ua.edu.ucu.apps.lab.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@Entity
@NoArgsConstructor
public class Flower extends Item {
    @Id
    private Integer id;
    private String color;
    private double price;
    private double sepalLength;

    public double price() { return this.price; }
}
