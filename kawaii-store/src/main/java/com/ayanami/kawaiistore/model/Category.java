package com.ayanami.kawaiistore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="categories")
public class Category {
    private static final String SEQ_NAME = "categories_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.UUID, generator = SEQ_NAME)
    @GenericGenerator(name = SEQ_NAME, strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", length = 36)
    private UUID id;

    @Column(name = "name", columnDefinition = "jsonb", nullable = false, unique = true)
    private String name;

    @Column(name = "icon")
    private String icon;

    @Column(name = "background_color", length = 12)
    private String backgroundColor;

    @Column(name = "text_color", length = 12)
    private String textColor;

    @ManyToOne
    @JoinColumn(name = "seo_id")
    private SEO seo;

    @ManyToOne
    @JoinColumn(name = "child_id")
    private Category child;

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
