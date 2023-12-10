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
@Table(name="board_games")
public class BoardGame extends Product {

    @Column(name = "type",  columnDefinition = "jsonb")
    private String type;

    @Column(name = "sizes")
    private String sizes;

    @Column(name = "number_of_people")
    private int numberOfPeople;

}
