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
@Table(name="bookmarks")
public class Bookmark extends Product {

    @Column(name = "size")
    private String size;

    @Column(name = "amount")
    private int amount;

    @Column(name = "color", columnDefinition = "jsonb")
    private String color;
}
