package closet.domain.display.entity;

//import closet.global.config.jpa.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "project")
public class _Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fndn_prjt_mngm_srmb", nullable = false)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fndn_corner_mngm_srmb", referencedColumnName = "fndn_corner_mngm_srmb")
    private _Corner corner;


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
