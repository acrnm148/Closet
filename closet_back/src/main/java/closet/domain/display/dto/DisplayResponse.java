package closet.domain.display.dto;

import closet.domain.display.entity.DisplayEntity;
import jakarta.persistence.Column;
import lombok.*;

@NoArgsConstructor
@Builder
@Getter
public class DisplayResponse {

    private Long fndgDispId;

    private String fndgDispCode;

    private String fndgDispName;

    private String metaTitleName;

    private String metaContent;

    private String saleCmdtDvsnCode;

    private String dispYn;

    private String creatorId;

    private String amenderId;

    private String deleteYn;

    public DisplayResponse(Long fndgDispId, String fndgDispCode, String fndgDispName, String metaTitleName, String metaContent, String saleCmdtDvsnCode, String dispYn, String creatorId, String amenderId, String deleteYn) {
        this.fndgDispId = fndgDispId;
        this.fndgDispCode = fndgDispCode;
        this.fndgDispName = fndgDispName;
        this.metaTitleName = metaTitleName;
        this.metaContent = metaContent;
        this.saleCmdtDvsnCode = saleCmdtDvsnCode;
        this.dispYn = dispYn;
        this.creatorId = creatorId;
        this.amenderId = amenderId;
        this.deleteYn = deleteYn;
    }

    public static DisplayResponse of(DisplayEntity displayEntity) {
        return new DisplayResponse(displayEntity.getFndgDispId(),
                displayEntity.getFndgDispCode(),
                displayEntity.getFndgDispName(),
                displayEntity.getMetaTitleName(),
                displayEntity.getMetaContent(),
                displayEntity.getSaleCmdtDvsnCode(),
                displayEntity.getDispYn(),
                displayEntity.getCreatorId(),
                displayEntity.getAmenderId(),
                displayEntity.getDeleteYn());
    }
}
