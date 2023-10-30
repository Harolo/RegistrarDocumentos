package com.bbva.obp.RegistrarDocumento.DTOs;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegistroRegDocElement {
    private String tipoDocumento;
    private String tipoIdentificacionC;
    private String tipoDocumentoC;
    private String tipoIdentificacionB;
    private String tipoDocumentoB;
    private String tipoArchivo;

    @Override
    public String toString() {


        return String.format("%s;%s;%s;%s;%s;%s",
                tipoDocumento, tipoIdentificacionC, tipoDocumentoC, tipoIdentificacionB, tipoDocumentoB, "S");
    }
}
