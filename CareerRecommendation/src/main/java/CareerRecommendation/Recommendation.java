package CareerRecommendation;

import jakarta.persistence.*;

@Entity
public class Recommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String recommendedCourses; // Stored as comma-separated values

    public Recommendation() {}

    public Recommendation(String recommendedCourses) {
        this.recommendedCourses = recommendedCourses;
    }

    public Long getId() {
        return id;
    }

    public String getRecommendedCourses() {
        return recommendedCourses;
    }

    public void setRecommendedCourses(String recommendedCourses) {
        this.recommendedCourses = recommendedCourses;
    }
}
