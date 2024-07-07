package closet.domain.display.entity;

import closet.global.config.jpa.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
//@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_kh_fndn_corner_mngm_m")
public class Corner extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fndn_corner_mngm_srmb", nullable = false)
    private Long fndnCornerMngmSrmb;

//    @ManyToOne
//    @JoinColumn(name = "fndn_dspl_mngm_srmb", nullable = false)
//    private Display display;

    @Column(name = "fndn_corner_patr_code")
    private String fndnCornerPatrCode;

    @Column(name = "fndn_corner_name")
    private String fndnCornerName;

    @Column(name = "dspl_ysno")
    private String dsplYsno;

    @Column(name = "dspl_sttg_dttm")
    private String dsplSttgDttm;

    @Column(name = "dspl_end_dttm")
    private String dsplEndDttm;

    @Column(name = "crtr_id")
    private String crtrId;

    @Column(name = "amnr_id")
    private String amnrId;

    @Column(name = "dlt_ysno")
    private String dltYsno;

//    @Builder
//    public Corner(Long fndnCornerMngmSrmb, /*Display display,*/ String fndnCornerPatrCode, String fndnCornerName, String dsplYsno, String dsplSttgDttm, String dsplEndDttm, String crtrId, String amnrId, String dltYsno) {
//        this.fndnCornerMngmSrmb = fndnCornerMngmSrmb;
////        this.display = display;
//        this.fndnCornerPatrCode = fndnCornerPatrCode;
//        this.fndnCornerName = fndnCornerName;
//        this.dsplYsno = dsplYsno;
//        this.dsplSttgDttm = dsplSttgDttm;
//        this.dsplEndDttm = dsplEndDttm;
//        this.crtrId = crtrId;
//        this.amnrId = amnrId;
//        this.dltYsno = dltYsno;
//    }
}
