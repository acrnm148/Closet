package closet.domain.display.entity;

import closet.global.config.jpa.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = PROTECTED)
@Table(name = "t_kh_fndg_corner_mngm_m", schema = "eok")
public class CornerEntity extends BaseTimeEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fndg_corner_mngm_srmb")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "fndg_dspl_mngm_srmb")
    @ToString.Exclude
    private DisplayEntity display;

   /* @OneToMany(mappedBy = "corner", fetch = LAZY)
    @ToString.Exclude
    private List<ExhibitionEntity> exhibitions = new ArrayList<>();*/

    /*@OneToMany(mappedBy = "corner", fetch = LAZY)
    @ToString.Exclude
    private List<ProjectManageEntity> projects = new ArrayList<>();*/

    /*@OneToMany(mappedBy = "corner", fetch = LAZY)
    @ToString.Exclude
    private List<BannerEntity> banners = new ArrayList<>();*/

    @Column(name = "fndg_corner_patr_code")
    private String cornerTypeCode;

    @Column(name = "fndg_corner_name")
    private String cornerName;

    @Column(name = "dspl_sttg_dttm")
    private String displayStartDate;

    @Column(name = "dspl_end_dttm")
    private String displayEndDate;

    @Column(name = "dspl_ysno")
    private String displayYn;

    @Column(name = "dlt_ysno")
    private String deleteYn;


}
