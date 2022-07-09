package pk.first.application.pkspringapplication.dto;

import lombok.Data;
import pk.first.application.pkspringapplication.model.Space;

import javax.validation.constraints.NotBlank;

@Data
public class SpaceDto {

    @NotBlank(message = "/galaxyName/ are required")
    private String  galaxyName;

    @NotBlank(message = "/note/ are required ")
    private String note;
    @NotBlank(message = "/universeName/ are required ")
    private String universeName;

    public Space  toSpace(){
        return new Space()
            .setGalaxyName(galaxyName)
            .setNote(note)
            .setUniverseName(universeName)
        ;


    }
}
