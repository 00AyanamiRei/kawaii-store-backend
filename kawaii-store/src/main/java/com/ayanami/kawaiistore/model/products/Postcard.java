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
@Table(name="postcards")
public class Postcard extends Product {

    @Column(name = "material", columnDefinition = "jsonb")
    private String material;

    @Column(name = "sizes", length = 64)
    private String sizes;

}
