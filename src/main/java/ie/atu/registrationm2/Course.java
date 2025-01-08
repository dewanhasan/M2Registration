package ie.atu.registrationm2;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Course {

    @NotBlank(message = "CourseCode cannot be blank")
    @Size(min = 2, max = 60, message = "CourseCode must be between 2 and 60 characters")
    private String courseCode;

    @NotBlank(message = "CourseDetails cannot be blank")
    @Size(min = 2, max = 60, message = "CourseDetails must be between 2 and 60 characters")
    private String courseDetails;

    private Long studentId;
}
