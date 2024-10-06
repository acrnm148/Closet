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
@Table(name = "t_kh_fndg_prjt_revw_reward_bnft_m", schema = "eok")
public class ProjectRevwRewardBnftEntity extends BaseTimeEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ProjectRevwRewardBnftPK id;

    @MapsId("id")
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "fndg_prjt_srmb", referencedColumnName = "fndg_prjt_srmb")
    private ProjectEntity project;

    @Column(name = "targ_amnt")
    private String targetAmount;

    @Column(name = "reward_acml_rate")
    private String rewardAcmlRate;

    @Column(name = "crtr_id", nullable = false, length = 100)
    private String creatorId;

    @Column(name = "amnr_id", nullable = false, length = 100)
    private String amenderId;

    @Column(name = "dlt_ysno")
    private String deleteYn;
}
