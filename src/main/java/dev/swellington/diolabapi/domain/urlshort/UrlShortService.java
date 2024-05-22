package dev.swellington.diolabapi.domain.urlshort;

import dev.swellington.diolabapi.infra.IdGenerator;
import jakarta.persistence.EntityNotFoundException;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlShortService {

    @Autowired
    private UrlShortRepository urlShortRepository;

    public UrlShort createUrlShort(String url) {
        var urlShort = urlShortRepository.findByUrlIgnoreCase(url);
        if (urlShort.isPresent()) {
            return urlShort.get();
        }

        var nid = IdGenerator.getInstance().generateRandomId("AAAANNN-ANN");
        do {
            nid = IdGenerator.getInstance().generateRandomId("AAAANNN-ANN");
        } while (urlShortRepository.existsByShortUrlIgnoreCase(nid));

        var nurlShort = UrlShort.builder()
                .shortUrl(nid)
                .url(url).build();
        return urlShortRepository.save(nurlShort);
    }

    public UrlShort getUrlShort(String shortUrl) {
        return urlShortRepository.findByShortUrl(shortUrl).orElseThrow(EntityNotFoundException::new);
    }
}
