package com.foodygo.payment.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    Double amount;

    @Column(name = "customer_id")
    Integer customerId;

    @Column(name = "order_id")
    Integer orderId;

    Instant datetime = Instant.now();

    @Column(name = "is_deleted")
    Boolean isDeleted = false;

    @ManyToOne
    @JoinColumn(name = "payment_method_id")
    PaymentMethod paymentMethod;
}
