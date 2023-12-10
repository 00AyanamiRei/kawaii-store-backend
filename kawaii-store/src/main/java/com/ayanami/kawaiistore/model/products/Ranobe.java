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
@Table(name="ranobe")
public class Ranobe extends Product {

    @Column(name = "numberOfPages")
    private int numberOfPages;

    @CreationTimestamp
    @Column(name = "theYearOfIssue")
    private LocalDateTime theYearOfIssue;

    @Column(name = "author", columnDefinition = "jsonb")
    private String author;

    @Column(name = "genres", columnDefinition = "jsonb")
    private String genres;

    @Column(name = "publisher", columnDefinition = "jsonb")
    private String publisher;

}
