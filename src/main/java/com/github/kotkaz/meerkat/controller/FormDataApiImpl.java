package com.github.kotkaz.meerkat.controller;

import com.github.kotkaz.meerkat.api.FormDataApi;
import com.github.kotkaz.meerkat.mapper.FormDataMapper;
import com.github.kotkaz.meerkat.model.FormData;
import com.github.kotkaz.meerkat.repository.FormDataRepository;
import com.github.kotkaz.meerkat.repository.SectorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class FormDataApiImpl implements FormDataApi {


    // For mocking purposes, we store form data in a one database row.
    public static Integer FORM_DATA_ID = 1;
    private final FormDataRepository formDataRepository;
    private final SectorRepository sectorRepository;
    private final FormDataMapper formDataMapper;


    @Override
    public ResponseEntity<Void> saveFormData(String name, Integer sector, Boolean userAgreement) {

        val sectorEntity = sectorRepository.findBySectorValue(sector);
        if (sectorEntity.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        val formData = formDataRepository
            .findById(FORM_DATA_ID)
            .orElse(FormData.builder().build());

        formData.setUserAgreement(userAgreement);
        formData.setUserName(name);
        formData.setSelectedSector(sectorEntity.get());

        FORM_DATA_ID = formDataRepository.saveAndFlush(formData).getId();
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<com.github.kotkaz.meerkat.dto.FormData> getSavedFormData() {
        val formData = formDataRepository.findById(FORM_DATA_ID);

        if (formData.isEmpty()) {
            return ResponseEntity.ok().build();
        }

        return ResponseEntity.ok(formDataMapper.entityToDto(formData.get()));
    }
}
