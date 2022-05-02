package com.javatechie.crud.netflix.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Movie")
public class ImdbMovieEntity {

    @Id
    @Column(name="imdbId")
    private String imdbId;

    private String title;
    private String year;
    private String rated;
    private String released;
    private String runtime;
    private String genre;
    private String director;
    private String writer;
    private String actors;
    private String plot;
    private String language;
    private String country;
    private String awards;
    private String poster;

    @OneToMany(mappedBy = "rating", fetch = FetchType.EAGER)
    private List<ImdbRatingEntity> ratings;
    private String metascore;

    @Column(name="imdbRating")
    private String imdbRating;
    private String imdbVotes;

    private String type;
    private String dvd;

    @Column(name="boxOffice")
    private String boxOffice;
    private String production;
    private String website;
    private String response;

}
