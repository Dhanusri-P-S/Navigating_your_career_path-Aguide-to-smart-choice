package CareerRecommendation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mentor")
@CrossOrigin
public class MentorLoginController {

    @Autowired
    private MentorLoginService mentorService;

    @PostMapping("/save-login")
    public String saveOrUpdateMentor(@RequestBody MentorLogin mentor) {
        return mentorService.saveOrUpdateMentor(mentor);
    }

    @GetMapping("/{email}")
    public MentorLogin getMentorByEmail(@PathVariable String email) {
        return mentorService.getMentorByEmail(email);
    }
}
