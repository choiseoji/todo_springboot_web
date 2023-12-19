package project.maybedo.image.imageDTO;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ImageResponseDTO {

    private String url;


    @Builder
    public ImageResponseDTO(String url) {
        this.url = url;
    }
}
