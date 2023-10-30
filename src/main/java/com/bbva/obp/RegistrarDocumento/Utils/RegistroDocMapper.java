package com.bbva.obp.RegistrarDocumento.Utils;

import com.bbva.obp.RegistrarDocumento.DTOs.RegistroRegDocElement;
import com.bbva.obp.RegistrarDocumento.wsdl.*;

import java.util.Calendar;
import java.util.TimeZone;

public class RegistroDocMapper {

    private static final ObjectFactory objectFactory=new ObjectFactory();
    public static RegistroDocumentos mapRegistroDoc(RegistroRegDocElement documentoDTO){
        System.out.println(documentoDTO.toString());
        RegistroDocumentos registro=new RegistroDocumentos();
        registro.setTipoDocumento(TipoDocumento.valueOf(documentoDTO.getTipoDocumento().toUpperCase()));
        registro.setTipoIdentificacionC(TipoIdentificacionC.valueOf(documentoDTO.getTipoIdentificacionC().toUpperCase()));
        registro.setTipoDocumentoC(documentoDTO.getTipoDocumentoC().toUpperCase());
        registro.setTipoIdentificacionB(objectFactory.createRegistroDocumentosTipoIdentificacionB(!documentoDTO.getTipoIdentificacionB().isEmpty()?TipoIdentificacionB.valueOf(documentoDTO.getTipoIdentificacionB()):null));
        registro.setTipoDocumentoB(objectFactory.createRegistroDocumentosTipoDocumentoB(documentoDTO.getTipoDocumentoB()));
        registro.setTipoArchivo(documentoDTO.getTipoArchivo());

        return registro;
    }

    public static String formatDateGeneric() {
        TimeZone tz = TimeZone.getTimeZone("GMT-5");
        Calendar c = Calendar.getInstance(tz);

        return String.format("%02d", c.get(Calendar.DAY_OF_MONTH)) +
                String.format("%02d", (c.get(Calendar.MONTH) + 1)) +
                String.format("%02d", c.get(Calendar.YEAR));
    }
}
