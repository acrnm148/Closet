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
@Table(name = "t_kh_fndg_prjt_a", schema = "eok")
public class ProjectDetailEntity extends BaseTimeEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "fndg_prjt_srmb")
    private Long id;

    @Column(name = "fndg_prjt_tite_name")
    private String titleName;

    @Column(name = "fndg_prjt_stl_name")
    private String subTitleName;

    @Column(name = "fndg_prjt_rprs_img_atac_file_num")
    private String rprsImgAttachFileNumber;

    @Column(name = "fndg_prjt_rprs_img_file_name")
    private String rprsImgAttachFileName;

    @Column(name = "sale_cmdt_clst_code")
    private String commodityTypeCode;

    @Column(name = "fndg_prjt_rprs_img_atac_file_urladrs")
    private String attachFileUrlAddress;

    @Column(name = "story_dvsn_code")
    private String storyDivisionCode;

    @Column(name = "story_atac_file_num")
    private String storyAttachFileNumber;

    @Column(name = "story_html_cntt")
    private String storyHtmlContent;

    @Column(name = "annn_bltn_ysno")
    private String annnPostYn;

    @Column(name = "annn_expr_sttg_date")
    private String annnExprStartDate;

    @Column(name = "annn_expr_end_date")
    private String annnExprEndDate;

    @Column(name = "annn_cntt")
    private String annnContent;

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
