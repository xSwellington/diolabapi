package dev.swellington.diolabapi.domain.urlshort;

import java.time.LocalDateTime;

public record UrlShortResponseDto(
        String inputUrl,
        String shortUrlId,
        LocalDateTime createdAt
) {
    public static UrlShortResponseDto fromEntity(UrlShort response) {
        return new UrlShortResponseDto(response.getUrl(), response.getShortUrl(), response.getCreatedAt());
    }
}
