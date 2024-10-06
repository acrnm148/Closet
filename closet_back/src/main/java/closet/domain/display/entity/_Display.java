package closet.domain.display.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
//@EqualsAndHashCode
@NoArgsConstructor
@Table(name = "display")
public class _Display {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "fndn_dspl_mngm_srmb", nullable = false)
    private Long id;

}
