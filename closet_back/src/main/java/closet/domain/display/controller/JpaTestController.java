package closet.domain.display.controller;

import closet.domain.display.dto.BannerResponse;
import closet.domain.display.dto.CornerResponse;
import closet.domain.display.dto.DisplayResponse;
import closet.domain.display.entity.*;
import closet.domain.display.service.JpaTestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class JpaTestController {

    private final JpaTestService service;

    @GetMapping("/test")
    public String test() {
        _Team team = service.saveTeam();
        _Member member = service.saveMember(team);
        return service.showInfo(member);
    }

    @GetMapping("/save")
    public String save() {
        service.saveBannerInfo();
        return "saved";
    }

    @GetMapping("/display")
    public List<DisplayResponse> display() {
        return service.getDisplayInfo();
    }

    @GetMapping("/corner")
    public List<CornerResponse> corner() {
        try{
            return service.getCornerInfo();
        } catch (Exception e) {
            log.error(e.getMessage());
            throw e;
        }
    }

    @GetMapping("/banner")
    public List<BannerResponse> banner() {
        return service.getBannerInfo();
    }
}
