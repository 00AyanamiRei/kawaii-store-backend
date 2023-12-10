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
@Table(name="pencil_cases")
public class PencilCase extends Product {

    @Column(name = "sizes")
    private String sizes;

    @Column(name = "color", columnDefinition = "jsonb")
    private String color;

}
