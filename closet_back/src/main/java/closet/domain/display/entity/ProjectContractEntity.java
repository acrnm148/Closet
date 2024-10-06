package closet.domain.display.entity;

import closet.global.config.jpa.BaseTimeEntity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
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
@Table(name = "t_kh_fndg_prjt_ctrc_m", schema = "eok")
public class ProjectContractEntity extends BaseTimeEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "fndg_prjt_srmb")
    private Long id;

    @Column(name = "fndg_prjt_ctrc_name")
    private String contractName;

    @Column(name = "fndg_prjt_dvsn_code")
    private String divisionCode;

    @Column(name = "ctrc_atac_file_num")
    private String ctrcAtacFileNumber;

    @Column(name = "ctrc_atac_file_name")
    private String ctrcAtacFileName;

    @Column(name = "vndr_code")
    private String vendorCode;

    @Column(name = "bsnn_rgst_num")
    private String bsnnRgstNumber;

    @Column(name = "rppr_name")
    private String rpprName;

    @Column(name = "rppr_emladrs")
    private String rpprEmailAddress;

    @Column(name = "rppr_tlnm")
    private String rpprTelNum;

    @Column(name = "ctrc_main_mtr_cntt")
    private String ctrcMainMtrContent;

    @Column(name = "mgr_athr_ysno")
    private String managerAthrYn;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "fndg_prjt_srmb")
    private ProjectEntity project;

    @Column(name = "dlt_ysno", nullable = false, length = 1)
    private String deleteYn;

    @Column(name = "crtr_id", nullable = false, length = 100)
    private String creatorId;

    @Column(name = "amnr_id", nullable = false, length = 100)
    private String amenderId;
}
