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
@Table(name="complete_models")
public class CompleteModels extends Product {

    @Column(name = "material", columnDefinition = "jsonb")
    private String material;

    @Column(name = "sizes", length = 64)
    private String sizes;

    @Column(name = "manufacturer", columnDefinition = "jsonb")
    private String manufacturer;

    @Column(name = "series", columnDefinition = "jsonb")
    private String series;

    @Column(name = "scale")
    private String scale;

    @Column(name = "sculptor", columnDefinition = "jsonb")
    private String sculptor;

}
