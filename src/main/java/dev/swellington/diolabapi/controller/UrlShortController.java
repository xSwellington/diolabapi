package dev.swellington.diolabapi.controller;


import dev.swellington.diolabapi.domain.urlshort.UrlShortDataDto;
import dev.swellington.diolabapi.domain.urlshort.UrlShortResponseDto;
import dev.swellington.diolabapi.domain.urlshort.UrlShortService;
import jakarta.validation.Valid;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/short")
public class UrlShortController {

    @Autowired
    private UrlShortService urlShortService;


    @PostMapping
    protected ResponseEntity<UrlShortResponseDto> create(@RequestBody @Valid UrlShortDataDto dto, UriComponentsBuilder uriBuilder) {
        val response = urlShortService.createUrlShort(dto.url());
        val responseDto = UrlShortResponseDto.fromEntity(response);
        return ResponseEntity.created(uriBuilder.path("/short/{shorturl}").buildAndExpand(response.getShortUrl()).toUri()).body(responseDto);
    }

    @GetMapping("/{id}")
    protected ModelAndView getShortUrl(@PathVariable String id) {
        val response = urlShortService.getUrlShort(id);
        return new ModelAndView("redirect:"+response.getUrl());
    }
}
