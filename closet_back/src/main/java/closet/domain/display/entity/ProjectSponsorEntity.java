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
@Table(name = "t_kh_fndg_spns_mngm_m", schema = "eok")
public class ProjectSponsorEntity extends BaseTimeEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ProjectSponsorPK id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "fndg_prjt_srmb")
    private ProjectEntity project;

    @Column(name = "mmbr_ncnm")
    private String memberNickname;

    @Column(name = "sponsh_terms_agrm_ysno")
    private String termsArgmYn;

    @Column(name = "dlt_ysno", nullable = false, length = 1)
    private String deleteYn;

    @Column(name = "crtr_id", nullable = false, length = 100)
    private String creatorId;

    @Column(name = "amnr_id", nullable = false, length = 100)
    private String amenderId;
}
