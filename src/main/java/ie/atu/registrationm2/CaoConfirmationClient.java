package ie.atu.registrationm2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(name = "confirmation", url = "http://localhost:8083" )
public interface CaoConfirmationClient {

    @PostMapping("/confirm")
    Map<String, String> confirmApplication(@RequestBody StudentCourseRequest studentCourseRequest);
}
