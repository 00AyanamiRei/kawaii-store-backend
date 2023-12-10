package com.ayanami.kawaiistore.model.products;

import com.ayanami.kawaiistore.model.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="backpacks")
public class Backpack extends Product {

    @Column(name = "volume")
    private String volume;

    @Column(name = "color", columnDefinition = "jsonb")
    private String color;

    @Column(name = "material", columnDefinition = "jsonb")
    private String material;
}
