package ie.atu.registrationm2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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


    @PostMapping("/register")
    public Map<String, String> registerStudent(@RequestBody StudentCourseRequest studentCourseRequest){
        System.out.println("Student Details with Selected Courses: " + studentCourseRequest.getStudentDetails() + " || "
        + studentCourseRequest.getCourseList());
        Map<String, String> response = new HashMap<>();
        response.put("status", "accepted");
        response.put("message", "Student: " + studentCourseRequest.getStudentDetails().getFirstname() + " " +
                studentCourseRequest.getStudentDetails().getLastname() + " || Courses: " +
                studentCourseRequest.getCourseList() + " has been Registered");
        return response;
    }

    /*@PostMapping("/register")
    public ResponseEntity<String> registerStudent(@RequestBody StudentCourseRequest studentCourseRequest){
        String studentName = studentCourseRequest.getStudentDetails().getFirstname() + " " + studentCourseRequest.getStudentDetails().getLastname();
        String courses = studentCourseRequest.getCourseList().stream().map(Course::getCourseDetails).collect(Collectors.joining(", "));

        String message = "Registered Student Name: " + studentName + ", Selected Courses" + courses;
        return ResponseEntity.ok(message);
    }*/
}
