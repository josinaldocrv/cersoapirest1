package com.cursoapirest.modulos.status.rest;

import com.cursoapirest.modulos.status.dto.StatusDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusRest implements StatusApi {

    @APIResponses({
            @APIResponse(responseCode = "200", description = "Ok Api funcionando"),
            @APIResponse(responseCode = "404", description = "Não encontrou a Api"),
            @APIResponse(responseCode = "401", description = "Não tem permissão"),
    })
    @GetMapping(value = "status")
    @Override
    public ResponseEntity<StatusDTO> getStatus() {
        StatusDTO statusDTO = new StatusDTO();
        return ResponseEntity.ok().body(statusDTO);
    }
}
