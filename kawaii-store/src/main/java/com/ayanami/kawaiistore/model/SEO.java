package com.ayanami.kawaiistore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="seo")
public class SEO {
    private static final String SEQ_NAME = "seo_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.UUID, generator = SEQ_NAME)
    @GenericGenerator(name = SEQ_NAME, strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", length = 36)
    private UUID id;

    @Column(name = "slug", length = 71, unique = true)
    private String slug;

    @Column(name = "title", columnDefinition = "jsonb")
    public String title;

    @Column(name = "description", columnDefinition = "jsonb")
    private String description;

    @Column(name = "meta_title", columnDefinition = "jsonb", unique = true)
    private String metaTitle;

    @Column(name = "meta_description", columnDefinition = "jsonb")
    private String metaDescription;

    @Column(name = "image", length = 128)
    private String image;

    @Column(name = "image_alt", columnDefinition = "jsonb")
    private String imageAlt;

    @Column(name = "social_title", columnDefinition = "jsonb")
    private String socialTitle;

    @Column(name = "social_type", length = 64)
    private String socialType;

    @Column(name = "social_image", length = 128)
    private String socialImage;

    @Column(name = "social_image_alt", columnDefinition = "jsonb")
    private String socialImageAlt;
}