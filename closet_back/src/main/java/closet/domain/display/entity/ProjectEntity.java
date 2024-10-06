package closet.domain.display.entity;

import closet.global.config.jpa.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = PROTECTED)
@Table(name = "t_kh_fndg_prjt_m", schema = "eok")
public class ProjectEntity extends BaseTimeEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "fndg_prjt_srmb")
    private Long id;

    @Column(name = "fndg_prjt_dspl_ysno")
    private String displayYn;

    @Column(name = "fndg_prjt_encore_ysno")
    private String encoreYn;

    @Column(name = "fndg_prjt_dspl_sttg_date")
    private String displayStartDate;

    @Column(name = "fndg_prjt_dspl_end_date")
    private String displayEndDate;

    @Column(name = "fndg_prjt_sttg_date")
    private String startDate;

    @Column(name = "fndg_prjt_end_date")
    private String endDate;

    @Column(name = "fndg_prjt_ttl_ordr_amnt")
    private Long totalOrderAmount;

    @Column(name = "fndg_prjt_targ_amnt")
    private Long targetAmount;

    @Column(name = "dlt_ysno", nullable = false, length = 1)
    private String deleteYn;

    @Column(name = "crtr_id", nullable = false, length = 100)
    private String creatorId;

    @Column(name = "amnr_id", nullable = false, length = 100)
    private String amenderId;

    @OneToOne(mappedBy = "project", fetch = LAZY)
    private ProjectDetailEntity projectDetail;

    @OneToMany(mappedBy = "project", fetch = LAZY)
    @ToString.Exclude
    private List<ProjectRevwRewardBnftEntity> projectRevwRewardBnft;

    @OneToMany(mappedBy = "project", fetch = LAZY)
    @ToString.Exclude
    private List<ProjectCmdtMngmEntity> projectCmdtMngm;
}
