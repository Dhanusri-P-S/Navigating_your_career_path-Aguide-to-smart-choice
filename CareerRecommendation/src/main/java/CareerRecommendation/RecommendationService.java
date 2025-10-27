package CareerRecommendation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RecommendationService {

    @Autowired
    private RecommendationRepository repository;

    public void save(RecommendationDto dto) {
        // Convert List<String> to comma-separated String
        String courseString = String.join(",", dto.getRecommendedCourses());
        Recommendation rec = new Recommendation(courseString);
        repository.save(rec);
    }
}

