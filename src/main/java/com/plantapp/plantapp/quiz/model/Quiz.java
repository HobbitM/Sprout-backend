package com.plantapp.plantapp.quiz.model;

import com.plantapp.plantapp.user.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Quiz {
    public Quiz(boolean toxicity, int sun, boolean air_purifying, double mature_size, int care_difficulty, User user) {
        this.toxicity = toxicity;
        this.sun = sun;
        this.air_purifying = air_purifying;
        this.mature_size = mature_size;
        this.care_difficulty = care_difficulty;
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quizId;
    private boolean toxicity;
    private int sun;
    private boolean air_purifying;
    private double mature_size;
    private int care_difficulty;
    @OneToOne
    @JoinColumn(name = "quizId", referencedColumnName = "userId")
    private User user;


}