package com.example.shoutreview.beans;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Columns;

import java.io.Serializable;
import java.util.List;

@Table (name = "movie_table")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
@ToString
public class Movie implements Serializable {
    @Id
    @Column( name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Enumerated(EnumType.STRING)
    private Genere genere;
    private Double rating;
    @OneToMany(mappedBy = "movie")
    private List<Review> reviews;

}
