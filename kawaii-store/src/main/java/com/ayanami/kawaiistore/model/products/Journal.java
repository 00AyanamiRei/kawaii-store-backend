package com.ayanami.kawaiistore.model.products;

import com.ayanami.kawaiistore.model.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="journals")
public class Journal extends Product {

    @CreationTimestamp
    @Column(name = "the_year_of_issue")
    private LocalDateTime theYearOfIssue;

    @Column(name = "series", columnDefinition = "jsonb")
    private String series;

    @Column(name = "number_of_pages")
    private int numberOfPages;

    @Column(name = "genres", columnDefinition = "jsonb")
    private String genres;

}
