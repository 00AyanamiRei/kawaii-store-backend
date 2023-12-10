package com.ayanami.kawaiistore.model.products;

import com.ayanami.kawaiistore.model.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="acrylic_figures")
public class AcrylicFigures extends Product {

    @Column(name = "material", columnDefinition = "jsonb")
    private String material;

    @Column(name = "sizes", length = 64)
    private String sizes;
}