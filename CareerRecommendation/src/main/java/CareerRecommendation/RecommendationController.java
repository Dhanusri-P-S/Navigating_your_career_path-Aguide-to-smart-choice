package CareerRecommendation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/student")
@CrossOrigin(origins = "*")
public class RecommendationController {

    @Autowired
    private RecommendationService service;

    @PostMapping("/save-recommendations")
    public ResponseEntity<String> save(@RequestBody RecommendationDto dto) {
        service.save(dto);
        return ResponseEntity.ok("Saved successfully");
    }
}
