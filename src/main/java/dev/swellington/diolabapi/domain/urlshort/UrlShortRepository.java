package dev.swellington.diolabapi.domain.urlshort;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UrlShortRepository extends JpaRepository<UrlShort, Long> {
    boolean existsByUrlIgnoreCase(String url);
    Optional<UrlShort> findByUrlIgnoreCase(String url);

    Optional<UrlShort> findByShortUrl(String shortUrl);

    boolean existsByShortUrlIgnoreCase(String shortUrl);
}
