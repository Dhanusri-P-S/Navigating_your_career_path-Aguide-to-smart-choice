package CareerRecommendation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SlotBookingService {

    @Autowired
    private SlotBookingRepository repository;

    public void save(SlotBookingDto dto) {
        SlotBooking booking = new SlotBooking();
        booking.setStudentName(dto.getStudentName());
        booking.setStudentPhone(dto.getStudentPhone());
        booking.setMentorName(dto.getMentorName());
        booking.setSlot(dto.getSlot());

        repository.save(booking);
    }
}
