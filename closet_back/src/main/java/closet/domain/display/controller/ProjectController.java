package closet.domain.display.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @GetMapping("/sample")
    public ResponseEntity<String> getSampleData() {
        return ResponseEntity.ok("test!");
    }
}
