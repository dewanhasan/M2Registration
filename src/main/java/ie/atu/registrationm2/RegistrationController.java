package ie.atu.registrationm2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RegistrationController {

    @PostMapping("/approved")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Map<String, String> RegistrationRequest(@RequestBody StudentDetails studentDetails){
        System.out.println("Student Registered: " + studentDetails);
        Map<String, String> response = new HashMap<>();
        response.put("status", "accepted");
        response.put("message", "Student " + studentDetails.getFirstname() + " " + studentDetails.getLastname()
            + " Registered succesfully");
        return response;
    }
}
