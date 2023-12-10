package com.ayanami.kawaiistore.model;

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
@Table(name="buckets")
public class Bucket {
    private static final String SEQ_NAME = "buckets_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.UUID, generator = SEQ_NAME)
    @GenericGenerator(name = SEQ_NAME, strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", length = 36)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable(
        name = "buckets_products",
        joinColumns = @JoinColumn(name = "bucket_id"),
        inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> product;
}
