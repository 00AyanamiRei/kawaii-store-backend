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
@Table(name="pop_up_parades")
public class PopUpParade extends Product {

    @Column(name = "material", columnDefinition = "jsonb")
    private String material;

    @Column(name = "sizes", length = 64)
    private String sizes;

    @Column(name = "manufacturer", columnDefinition = "jsonb")
    private String manufacturer;

    @Column(name = "sculptor", columnDefinition = "jsonb")
    private String sculptor;

}
