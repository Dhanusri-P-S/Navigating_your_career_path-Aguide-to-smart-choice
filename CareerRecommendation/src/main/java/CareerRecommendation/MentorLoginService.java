package CareerRecommendation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentorLoginService {

    @Autowired
    private MentorLoginRepository mentorRepository;

    public String saveOrUpdateMentor(MentorLogin mentor) {
        MentorLogin existing = mentorRepository.findByEmail(mentor.getEmail());

        if (existing != null) {
            // update fields
            existing.setMentorName(mentor.getMentorName());
            existing.setPassword(mentor.getPassword());
            mentorRepository.save(existing);
            return "Mentor updated successfully!";
        } else {
            mentorRepository.save(mentor);
            return "Mentor saved successfully!";
        }
    }

    public MentorLogin getMentorByEmail(String email) {
        return mentorRepository.findByEmail(email);
    }
}
