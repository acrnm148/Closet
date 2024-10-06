package closet.domain.display.entity;

import closet.global.config.jpa.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

import java.io.*;
import java.util.*;

import static jakarta.persistence.FetchType.EAGER;
import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.*;

@Builder
@AllArgsConstructor
@Entity
@Getter
@ToString
@NoArgsConstructor(access = PROTECTED)
@Table(name = "t_kh_fndg_dspl_mngm_m", schema = "eok")
public class DisplayEntity extends BaseTimeEntity implements Serializable{

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fndg_dspl_mngm_srmb")
    private Long fndgDispId;

    @Column(name = "fndg_dspl_patr_code")
    private String fndgDispCode;

    @Column(name = "fndg_dspl_name")
    private String fndgDispName;

    @Column(name = "fndg_meta_tite_name")
    private String metaTitleName;

    @Column(name = "fndg_meta_cntt")
    private String metaContent;

    @Column(name = "sale_cmdt_dvsn_code")
    private String saleCmdtDvsnCode;

    @Column(name = "dspl_ysno")
    private String dispYn;

    @Column(name = "crtr_id")
    private String creatorId;

    @Column(name = "amnr_id")
    private String amenderId;

    @Column(name = "dlt_ysno")
    private String deleteYn;
}