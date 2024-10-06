package closet.domain.display.entity;

import closet.global.config.jpa.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = PROTECTED)
@Table(name = "t_kh_fndg_prjt_mgr_mmbr_mngm_m", schema = "eok")
public class ProjectManagerEntity extends BaseTimeEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "fndg_prjt_srmb")
    private Long id;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "fndg_prjt_srmb")
    private ProjectEntity project;

    @Column(name = "mmbr_num")
    private String memberNumber;

    @Column(name = "mgr_athr_ysno", nullable = false, length = 1)
    private String managerAthrYn;

    @Column(name = "crtr_id", nullable = false, length = 100)
    private String creatorId;

    @Column(name = "amnr_id", nullable = false, length = 100)
    private String amenderId;

    @Column(name = "dlt_ysno", nullable = false, length = 1)
    private String deleteYn;
}
