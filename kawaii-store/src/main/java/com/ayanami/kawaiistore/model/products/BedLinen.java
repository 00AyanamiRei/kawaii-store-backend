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
@Table(name="bed_linen")
public class BedLinen extends Product {
    @Column(name = "size_pillow")
    private String sizePillow;

    @Column(name = "size_blanet")
    private String sizeBlanet;

    @Column(name = "size_sheet")
    private String sizeSheet;

    @Column(name = "type_bed")
    private String typeBed;

    @Column(name = "color", columnDefinition = "jsonb")
    private String color;

    @Column(name = "material", columnDefinition = "jsonb")
    private String material;
}
