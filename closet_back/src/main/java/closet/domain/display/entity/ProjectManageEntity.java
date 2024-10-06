package closet.domain.display.entity;

import closet.global.config.jpa.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.*;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = PROTECTED)
@Table(name = "t_kh_fndg_prjt_mngm_m", schema = "eok")
public class ProjectManageEntity extends BaseTimeEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fndg_prjt_mngm_srmb")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "fndg_corner_mngm_srmb")
    private CornerEntity corner;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "fndg_eexh_mngm_srmb")
    private ExhibitionEntity exhibition;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "fndg_prjt_srmb")
    private ProjectEntity project;

    @Column(name = "expr_sqnc")
    private Long exposureSequence;

    @Column(name = "crtr_id", nullable = false, length = 100)
    private String creatorId;

    @Column(name = "amnr_id", nullable = false, length = 100)
    private String amenderId;

    @Column(name = "dlt_ysno", nullable = false, length = 1)
    private String deleteYn;
}
