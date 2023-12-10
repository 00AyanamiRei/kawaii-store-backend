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
@Table(name="anime_names")
public class AnimeName {
    private static final String SEQ_NAME = "anime_names_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.UUID, generator = SEQ_NAME)
    @GenericGenerator(name = SEQ_NAME, strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", length = 36)
    private UUID id;

    @Column(name = "name", columnDefinition = "jsonb", unique = true)
    private String name;
}
