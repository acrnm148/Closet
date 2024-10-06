package closet.domain.display.controller;

import closet.domain.display.entity._Project;
import closet.domain.repository._CornerRepository;
import closet.domain.repository._DisplayRepository;
import closet.domain.repository._ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/project")
@RequiredArgsConstructor
public class ProjectController {

    private final _ProjectRepository projectRepository;
    private final _CornerRepository cornerRepository;
    private final _DisplayRepository displayRepository;

    @GetMapping("/sample")
    public ResponseEntity<String> getSampleData() {

//        List<Display> displayList = displayRepository.findAll();
//        System.out.println("displayList => " + displayList);

//        List<Corner> cornerList = cornerRepository.findAll();
//        System.out.println("cornerList => " + cornerList);

        List<_Project> projectList = projectRepository.findAll();
        System.out.println("projectList => " + projectList);

        return ResponseEntity.ok(projectList.toString());
    }
}
