package com.ayanami.kawaiistore.model;

import com.ayanami.kawaiistore.model.enums.OrderStatus;
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
@Builder
@Entity
@Table(name="orders")
public class Order {
    private static final String SEQ_NAME = "orders_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.UUID, generator = SEQ_NAME)
    @GenericGenerator(name = SEQ_NAME, strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", length = 36)
    private UUID id;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "sum", precision = 10, scale = 2)
    private BigDecimal sum;

    @Column(name = "address", length = 128)
    private String address;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderDetails> details;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 10)
    private OrderStatus status;
}
