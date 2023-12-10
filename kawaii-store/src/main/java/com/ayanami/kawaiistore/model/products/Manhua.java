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
@Table(name="manhua")
public class Manhua extends Product {

    @Column(name = "numberOfPages")
    private int numberOfPages;

    @CreationTimestamp
    @Column(name = "theYearOfIssue")
    private LocalDateTime theYearOfIssue;

    @Column(name = "author", columnDefinition = "jsonb")
    private String author;

    @Column(name = "publisher", columnDefinition = "jsonb")
    private String publisher;

    @Column(name = "genres", columnDefinition = "jsonb")
    private String genres;

    @Column(name = "type_pages", columnDefinition = "jsonb")
    private String typePages;

}
