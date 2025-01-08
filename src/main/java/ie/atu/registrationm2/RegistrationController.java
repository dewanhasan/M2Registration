package ie.atu.registrationm2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
public class RegistrationController {

    private final CaoConfirmationClient caoConfirmationClient;

    @Autowired
    public RegistrationController(CaoConfirmationClient caoConfirmationClient) {
        this.caoConfirmationClient = caoConfirmationClient;
    }


    @PostMapping("/register")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Map<String, String> registerStudent(@RequestBody StudentCourseRequest studentCourseRequest){
        System.out.println("Selected Courses: " + studentCourseRequest.getCourseList());
        return caoConfirmationClient.confirmApplication(studentCourseRequest);
    }
}
