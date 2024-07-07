package closet.domain.display.entity;

import closet.global.config.jpa.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_kh_fndn_prjt_mngm_m")
public class Project extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fndn_prjt_mngm_srmb", nullable = false)
    private Long fndnPrjtMngmSrmb;

    @Column(name = "fndn_prjt_id", nullable = false)
    private Long fndnPrjtId;

    @Column(name = "expr_sqnc", nullable = false)
    private Long exprSqnc;

    @Column(name = "crtr_id")
    private String crtrId;

    @Column(name = "amnr_id")
    private String amnrId;

    @Column(name = "dlt_ysno")
    private String dltYsno;

//    @Builder
//    public Project(Long fndnPrjtMngmSrmb, Long fndnPrjtId, Long exprSqnc, String crtrId, String amnrId, String dltYsno) {
//        this.fndnPrjtMngmSrmb = fndnPrjtMngmSrmb;
//        this.fndnPrjtId = fndnPrjtId;
//        this.exprSqnc = exprSqnc;
//        this.crtrId = crtrId;
//        this.amnrId = amnrId;
//        this.dltYsno = dltYsno;
//    }
}
