package com.ayanami.kawaiistore.model;

import com.ayanami.kawaiistore.model.enums.Role;
import com.ayanami.kawaiistore.model.locale.Locale;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="users")
public class User {
    private static final String SEQ_NAME = "users_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.UUID, generator = SEQ_NAME)
    @GenericGenerator(name = SEQ_NAME, strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", length = 36)
    private UUID id;

    @Column(name = "username", length = 64, unique = true)
    private String username;

    @Column(name = "email", length = 64, unique = true)
    private String email;

    @Column(name = "phone", length = 64, unique = true)
    private String phone;

    @Column(name = "first_name", length = 64)
    private String firstName;

    @Column(name = "last_name", length = 64)
    private String lastName;

    @Column(name = "middle_name", length = 64)
    private String middle_name;

    @Column(name = "password", length = 64)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "locale", length = 10)
    private Locale locale;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "archive")
    private boolean archive;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", length = 20)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "seo_id")
    private SEO seo;
}
