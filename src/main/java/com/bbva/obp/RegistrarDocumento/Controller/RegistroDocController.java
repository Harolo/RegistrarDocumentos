package com.bbva.obp.RegistrarDocumento.Controller;

import com.bbva.obp.RegistrarDocumento.DTOs.RegistroRegDocElement;
import com.bbva.obp.RegistrarDocumento.Services.RegistroSolicitudTxt;
import com.bbva.obp.RegistrarDocumento.wsdl.ResultadoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registro")
public class RegistroDocController {

    @Autowired
    RegistroSolicitudTxt registroSolicitudTxt;

    @PostMapping("/registrodoc")
    public ResponseEntity<ResultadoDTO> registroDocumentoPetition(@RequestBody RegistroRegDocElement registroDTO){
        return new ResponseEntity<>(registroSolicitudTxt.registrarSolicitud(registroDTO), HttpStatus.OK);
    }

}
