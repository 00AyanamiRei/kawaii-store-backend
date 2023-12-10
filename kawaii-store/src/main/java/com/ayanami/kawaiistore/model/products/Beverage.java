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
@Table(name="beverages")
public class Beverage extends Product {
    @Column(name = "volume", columnDefinition = "jsonb")
    private String volume;

    @Column(name = "flavor", columnDefinition = "jsonb")
    private String flavor;

}
