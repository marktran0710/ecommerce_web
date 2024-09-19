package com.shopdev.ecommerce_web.entity.feed;

import com.mysql.cj.protocol.ColumnDefinition;
import com.shopdev.ecommerce_web.entity.user.UserEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "java_feed_001")
public class FeedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "feedId", nullable = false)
    private  Long id;

    @Column(nullable = false, length = 255)
    private String title;

    @Lob
    @Column(nullable = false)
    private String description;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name="userId", nullable = false) // foreign key FeedEntity
    private UserEntity user;
}
