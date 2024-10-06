package closet.domain.display.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Getter
@NoArgsConstructor
@EqualsAndHashCode
public class ProjectSponsorPK implements Serializable {

    @Column(name = "ordr_num")
    private String orderNumber;

    @Column(name = "mmbr_num")
    private String memberNumber;

}
