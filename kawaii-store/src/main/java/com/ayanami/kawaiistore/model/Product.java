package com.ayanami.kawaiistore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="products")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Product {
    private static final String SEQ_NAME = "products_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.UUID, generator = SEQ_NAME)
    @GenericGenerator(name = SEQ_NAME, strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", length = 36)
    private UUID id;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductImage> images;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "name", columnDefinition = "jsonb")
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "article", length = 64)
    private String article;

    @Column(name = "weight", precision = 10, scale = 2)
    private BigDecimal weight;

    @ManyToOne
    @JoinColumn(name = "source_id")
    private AnimeName source;

    @Column(name = "description", columnDefinition = "jsonb")
    private String description;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "status")
    private boolean status;

    @Column(name = "hit")
    private boolean hit;

    @ManyToOne
    @JoinColumn(name = "seo_id")
    private SEO seo;
}
