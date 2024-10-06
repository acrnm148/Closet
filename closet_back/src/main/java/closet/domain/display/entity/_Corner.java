package closet.domain.display.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
//@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "corners")
public class _Corner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fndn_corner_mngm_srmb", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fndn_dspl_mngm_srmb", nullable = false)
    private _Display display;

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
