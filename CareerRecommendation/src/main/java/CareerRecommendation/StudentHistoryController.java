package CareerRecommendation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5500")  // Match your HTML server port
@RestController
@RequestMapping("/api/student-history")
public class StudentHistoryController {

    @Autowired
    private StudentHistoryRepository repository;

    @PostMapping
    public ResponseEntity<?> saveOrUpdateStudent(@RequestBody StudentHistory student) {
        Optional<StudentHistory> existing = repository.findByEmail(student.getEmail());

        if (existing.isPresent()) {
            student.setId(existing.get().getId()); // Update existing
        }

        StudentHistory saved = repository.save(student);
        return ResponseEntity.ok(saved);
    }
}
