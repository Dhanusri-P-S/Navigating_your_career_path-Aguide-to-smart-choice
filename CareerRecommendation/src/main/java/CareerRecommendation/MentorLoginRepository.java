package CareerRecommendation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MentorLoginRepository extends JpaRepository<MentorLogin, Long> {
    MentorLogin findByEmail(String email);
}
