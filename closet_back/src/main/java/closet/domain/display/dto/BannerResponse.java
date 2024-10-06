package closet.domain.display.dto;

import closet.domain.display.entity.BannerEntity;
import closet.domain.display.entity.CornerEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import static jakarta.persistence.FetchType.LAZY;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BannerResponse {

    private Long bannerid;
    private CornerEntity corner;
    private String displayName;
    private String displYn;
    private String dsplStartDate;
    private String dsplEndDate;
    private String imgLinkUrl;
    private String textContent;
    private String bnnrTitleName;
    private String subTitleName;
    private String pcLinkUrl;
    private String mobLinkUrl;
    private String deleteYn;

    public BannerResponse(BannerEntity bannerEntity) {
        this.bannerid = bannerEntity.getBannerid();
        this.corner = bannerEntity.getCorner();
        this.displayName = bannerEntity.getDisplayName();
        this.displYn = bannerEntity.getDisplYn();
        this.dsplStartDate = bannerEntity.getDsplStartDate();
        this.dsplEndDate = bannerEntity.getDsplEndDate();
        this.imgLinkUrl = bannerEntity.getImgLinkUrl();
        this.textContent = bannerEntity.getTextContent();
        this.bnnrTitleName = bannerEntity.getBnnrTitleName();
        this.subTitleName = bannerEntity.getSubTitleName();
        this.pcLinkUrl = bannerEntity.getPcLinkUrl();
        this.mobLinkUrl = bannerEntity.getMobLinkUrl();
        this.deleteYn = bannerEntity.getDeleteYn();
    }
}
