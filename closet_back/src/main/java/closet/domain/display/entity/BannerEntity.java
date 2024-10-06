package closet.domain.display.entity;

import closet.global.config.jpa.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

import static jakarta.persistence.FetchType.EAGER;
import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.*;

@Builder
@Entity
@Getter
@ToString
@NoArgsConstructor(access = PROTECTED)
@Table(name = "t_kh_fndg_bnnr_mngm_m", schema = "eok")
@AllArgsConstructor
public class BannerEntity extends BaseTimeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fndg_bnnr_mngm_srmb")
    private Long bannerid;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "fndg_corner_mngm_srmb")
    @ToString.Exclude
    private CornerEntity corner;

    @Column(name = "bnnr_name")
    private String displayName;

    @Column(name = "dspl_ysno")
    private String displYn;

    @Column(name = "dspl_sttg_date")
    private String dsplStartDate;

    @Column(name = "dspl_end_date")
    private String dsplEndDate;

    @Column(name = "img_link_urladrs")
    private String imgLinkUrl;
    
    @Column(name = "trnf_txt_cntt")
    private String textContent;
    
    @Column(name = "bnnr_tite_name")
    private String bnnrTitleName;
    
    @Column(name = "sub_tite_name")
    private String subTitleName;
    
    @Column(name = "pc_web_link_urladrs")
    private String pcLinkUrl;
    
    @Column(name = "mobile_web_link_urladrs")
    private String mobLinkUrl;

    @Column(name = "dlt_ysno")
    private String deleteYn;

    public void setCorner(CornerEntity corner) {
        this.corner = corner;
    }
}
