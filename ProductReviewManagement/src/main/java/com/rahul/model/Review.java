package com.rahul.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PreUpdate;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
public class Review {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;
    private String userId;
    private String description;
    private LocalDateTime cDate = LocalDateTime.now();
    private LocalDateTime uDate;
    @ManyToOne
    @JoinColumn(name = "product_id") // Define the foreign key column
    private Product product;
    @PreUpdate
    private void preUpdate() {
        uDate = LocalDateTime.now();
    }
}
