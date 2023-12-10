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
@Table(name="workbooks")
public class Workbook extends Product {
    @Column(name = "sizes")
    private String sizes;

    @Column(name = "number_of_pages")
    private int numberOfPages;

    @Column(name = "type", columnDefinition = "jsonb")
    private String type;

    @Column(name = "color", columnDefinition = "jsonb")
    private String color;

}
