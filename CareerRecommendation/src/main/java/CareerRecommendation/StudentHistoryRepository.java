package CareerRecommendation;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentHistoryRepository extends JpaRepository<StudentHistory, Long> {
    Optional<StudentHistory> findByEmail(String email);
}
