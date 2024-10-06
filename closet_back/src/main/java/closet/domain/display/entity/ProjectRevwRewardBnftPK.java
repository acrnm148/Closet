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
public class ProjectRevwRewardBnftPK implements Serializable {

    @Column(name = "expr_sqnc")
    private Long exprSqnc;
    private Long id;
}
