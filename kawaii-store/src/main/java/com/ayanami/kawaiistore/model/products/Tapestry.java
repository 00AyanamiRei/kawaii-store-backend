package com.ayanami.kawaiistore.model.products;

import com.ayanami.kawaiistore.model.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="tapestry")
public class Tapestry extends Product {

    @Column(name = "sizer")
    private String sizer;

    @Column(name = "color", columnDefinition = "jsonb")
    private String color;

    @Column(name = "material",columnDefinition = "jsonb")
    private String material;

}
