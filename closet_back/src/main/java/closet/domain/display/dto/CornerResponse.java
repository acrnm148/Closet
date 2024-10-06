package closet.domain.display.dto;

import closet.domain.display.entity.CornerEntity;
import closet.domain.display.entity.DisplayEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import static jakarta.persistence.FetchType.LAZY;

@Builder
//@NoArgsConstructor
//@AllArgsConstructor
@RequiredArgsConstructor
@Getter
public class CornerResponse {
    private final Long id;
//    private final DisplayResponse display;
    private final String cornerTypeCode;
    private final String cornerName;
    private final String displayStartDate;
    private final String displayEndDate;
    private final String displayYn;
    private final String deleteYn;

    public static CornerResponse of(CornerEntity cornerEntity) {
        return new CornerResponse(cornerEntity.getId(),
//                DisplayResponse.of(cornerEntity.getDisplay()),
                cornerEntity.getCornerTypeCode(),
                cornerEntity.getCornerName(),
                cornerEntity.getDisplayStartDate(),
                cornerEntity.getDisplayEndDate(),
                cornerEntity.getDisplayYn(),
                cornerEntity.getDeleteYn());
    }
}
