package closet.domain.display.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = PROTECTED)
@Table(name = "t_kh_fndg_eexh_mngm_m", schema = "eok")
public class ExhibitionEntity {

    @Id
    @GeneratedValue
    @Column(name = "fndg_eexh_mngm_srmb")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "fndg_corner_mngm_srmb")
    private CornerEntity corner;

    @Column(name = "fndg_eexh_tite_name")
    private String exhibitionName;

    @Column(name = "fndg_eexh_stl_name")
    private String exhibitionSubName;

    @Column(name = "dspl_sttg_date")
    private String displayStartDate;

    @Column(name = "dspl_end_date")
    private String displayEndDate;

    @Column(name = "prjt_random_expr_ysno")
    private String randomExposureYn;

    @Column(name = "expr_sqnc")
    private Long exposureSequence;

    @OneToMany(mappedBy = "id", fetch = LAZY)
    @ToString.Exclude
    private List<ProjectManageEntity> projects = new ArrayList<>();
    
    @Column(name = "dlt_ysno")
    private String deleteYn;
}
