package com.github.kotkaz.meerkat.controller;

import com.github.kotkaz.meerkat.api.SectorApi;
import com.github.kotkaz.meerkat.dto.Sector;
import com.github.kotkaz.meerkat.mapper.SectorMapper;
import com.github.kotkaz.meerkat.repository.SectorRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class SectorApiImpl implements SectorApi {

    private final SectorRepository sectorRepository;
    private final SectorMapper sectorMapper;

    @Override
    public ResponseEntity<List<Sector>> getSectors() {
        val sectors = sectorRepository.findAll();
        return ResponseEntity.ok(sectorMapper.entitiesToDtoList(sectors));
    }
}
