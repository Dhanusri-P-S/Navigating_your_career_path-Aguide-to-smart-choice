package CareerRecommendation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/evaluation")
@CrossOrigin(origins = "*")
public class StudentEvaluationController {

    @Autowired
    private StudentEvaluationRepository repository;

    @PostMapping
    public ResponseEntity<String> saveEvaluation(@RequestBody StudentEvaluationDTO dto) {
        StudentEvaluation eval = new StudentEvaluation();
        eval.setPsychometricScore(dto.getPsychometricScore());
        eval.setChosenGroup(dto.getChosenGroup());
        eval.setGroupScore(dto.getGroupScore());
        eval.setChosenInterest(dto.getChosenInterest());
        eval.setInterestScore(dto.getInterestScore());
        repository.save(eval);
        return ResponseEntity.ok("Evaluation saved");
    }
}
