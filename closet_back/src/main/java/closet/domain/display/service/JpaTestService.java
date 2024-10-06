package closet.domain.display.service;

import closet.domain.display.dto.BannerResponse;
import closet.domain.display.dto.CornerResponse;
import closet.domain.display.dto.DisplayResponse;
import closet.domain.display.entity.*;
import closet.domain.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class JpaTestService {

    private final _TeamRepository teamRepository;
    private final _MemberRepository memberRepository;

    private final BannerRepository bannerRepository;
    private final DisplayRepository displayRepository;
    private final CornerRepository cornerRepository;
    private final ExhibitionRepository exhibitionRepository;
    private final ProjectManageRepository projectManageRepository;

    @Transactional
    public _Team saveTeam() {
        _Team team = new _Team();
        team.setName("TeamA");
        return teamRepository.save(team);
    }

    @Transactional
    public _Member saveMember(_Team team) {
        _Member member = new _Member();
        member.setName("hello");
        member.setTeam(team);
        return memberRepository.save(member);
    }

    @Transactional
    public String showInfo(_Member member) {
        log.info("======================================");
        _Team team2 = member.getTeam();
        return team2.getName();
    }

    @Transactional
    public void saveBannerInfo() {
        log.info("save banner==============>");
        DisplayEntity display1 = DisplayEntity.builder()
                .metaTitleName("DISPLAY : 메인 페이지")
                .build();
        DisplayEntity display2 = DisplayEntity.builder()
                .metaTitleName("DISPLAY : 목록 페이지")
                .build();
        displayRepository.save(display1);
        displayRepository.save(display2);
        CornerEntity corner1 = CornerEntity.builder()
                .display(display1)
                .cornerName("CORNER 1")
                .build();
        CornerEntity corner2 = CornerEntity.builder()
                .display(display1)
                .cornerName("CORNER 2")
                .build();
        cornerRepository.save(corner1);
        cornerRepository.save(corner2);
        BannerEntity banner1 = BannerEntity.builder()
                .corner(corner1)
                .displayName("BANNER 1")
                .build();
        BannerEntity banner2 = BannerEntity.builder()
                .corner(corner1)
                .displayName("BANNER 2")
                .build();
        bannerRepository.save(banner1);
        bannerRepository.save(banner2);
    }

    @Transactional
    public List<BannerResponse> getBannerInfo() {
        log.info("get banner==============>");
        List<BannerEntity> list = bannerRepository.findAll();
        return list.stream()
                .map(BannerResponse::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public List<CornerResponse> getCornerInfo() {
        log.info("get corner==============>");
        List<CornerEntity> list = cornerRepository.findAll();
        return list.stream()
                .map(CornerResponse::of)
                .collect(Collectors.toList());
    }

    @Transactional
    public List<DisplayResponse> getDisplayInfo() {
        log.info("get display==============>");
        List<DisplayEntity> list = displayRepository.findAll(); 
        /*for (DisplayEntity display : list) {
            System.out.println("display.getCorners().toString() = " + display.getCorners().toString());
        }*/
        return list.stream()
                .map(DisplayResponse::of)
                .collect(Collectors.toList());
    }
}
