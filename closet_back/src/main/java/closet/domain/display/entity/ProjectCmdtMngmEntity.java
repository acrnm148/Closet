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
@Table(name = "t_kh_fndg_prjt_cmdt_mngm_m", schema = "eok")
public class ProjectCmdtMngmEntity extends BaseTimeEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ProjectCmdtMngmPK id;

    @MapsId("id")
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "fndg_prjt_srmb", referencedColumnName = "fndg_prjt_srmb")
    private ProjectEntity project;

    @Column(name = "rprs_ysno")
    private String rprsYsno;

    @Column(name = "rprs_sale_cmdtid")
    private String rprsSaleCmdtid;

    @Column(name = "sale_cmdt_grp_dvsn_code")
    private String saleCmdtGrpDvsnCode;

    @Column(name = "sale_cmdt_clst_code")
    private String saleCmdtClstCode;

    @Column(name = "sale_cmdt_dvsn_code")
    private String saleCmdtDvsnCode;

    @Column(name = "comb_cmdt_patr_code")
    private String combCmdtPatrCode;

    @Column(name = "sale_sttg_dttm")
    private String saleStartDate;

    @Column(name = "sale_end_dttm")
    private String saleEndDate;

    @Column(name = "acmt_sale_qntt")
    private String acmtSaleQuantity;

    @Column(name = "crtr_id", nullable = false, length = 100)
    private String creatorId;

    @Column(name = "amnr_id", nullable = false, length = 100)
    private String amenderId;

    @Column(name = "dlt_ysno")
    private String deleteYn;
}
