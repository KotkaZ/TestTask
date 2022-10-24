package com.github.kotkaz.meerkat.controller;

import com.github.kotkaz.meerkat.api.SectorApi;
import com.github.kotkaz.meerkat.dto.Test;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SectorApiImpl implements SectorApi {


    @Override
    public ResponseEntity<Test> initRepo() {
        return SectorApi.super.initRepo();
    }
}
