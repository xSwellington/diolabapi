package dev.swellington.diolabapi.domain.urlshort;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public record UrlShortDataDto(
        @NotBlank
        @URL
        String url
) {
}
