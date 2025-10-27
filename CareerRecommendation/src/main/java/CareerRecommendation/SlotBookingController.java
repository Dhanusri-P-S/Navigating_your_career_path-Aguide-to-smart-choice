package CareerRecommendation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mentor")
@CrossOrigin(origins = "*")
public class SlotBookingController {

    @Autowired
    private SlotBookingService bookingService;

    @PostMapping("/book-slot")
    public ResponseEntity<String> bookSlot(@RequestBody SlotBookingDto dto) {
        bookingService.save(dto);
        return ResponseEntity.ok("Slot booked successfully");
    }
}

