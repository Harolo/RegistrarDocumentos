package com.bbva.obp.RegistrarDocumento.Services;

import com.bbva.obp.RegistrarDocumento.Controller.RegistroDocController;
import com.bbva.obp.RegistrarDocumento.DTOs.RegistroRegDocElement;
import com.bbva.obp.RegistrarDocumento.Utils.AppProperties;
import com.bbva.obp.RegistrarDocumento.Utils.RegistroDocMapper;
import com.bbva.obp.RegistrarDocumento.exception.ErrorException;
import com.bbva.obp.RegistrarDocumento.obp.SOAPRegistroClient;

import com.bbva.obp.RegistrarDocumento.wsdl.RegistroDocumentos;
import com.bbva.obp.RegistrarDocumento.wsdl.ResultadoDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class RegistroSolicitudTxt {
    @Autowired
    SOAPRegistroClient soapClient;

    @Autowired
    private AppProperties appProperties;
    private static final Logger logger = LogManager.getLogger(RegistroDocController.class);


    public ResultadoDTO registrarSolicitud(RegistroRegDocElement registroDTO) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String currentDate = dateFormat.format(new Date());

        String formatNameFile = "/logs"+"registrarDocLog-" + currentDate + ".txt";
        registrarEnLog(formatNameFile,"");

        RegistroDocumentos registroDocumentos= RegistroDocMapper.mapRegistroDoc(registroDTO);
        logger.info("Solicitud Renta OBP: {}", registroDocumentos);

        ResultadoDTO resultado = soapClient.registrarSolicitudRentas(registroDocumentos);

        String codigoTransaccion = resultado.getTipoCodigoTransaccion().getValue();



        String logToSave = registroDTO.getTipoDocumentoC() + "\t" + codigoTransaccion + "\n";

        if (codigoTransaccion.equals("00")){
            String path = appProperties.getResponsesLogsPath() + appProperties.getPrefixLogOk() + currentDate + ".txt";
            registrarEnLog(path, logToSave);
        }
        else {
            String path = appProperties.getResponsesLogsPath() + appProperties.getPrefixLogErr() + currentDate + ".txt";
            registrarEnLog(path, logToSave);
        }
        return resultado;
    }

    public void registrarEnLog(String archivoLog, String contenido) {
        try {
            File logFile = new File(archivoLog);
            File logDir = logFile.getParentFile();

            if (!logDir.exists() && !logDir.mkdirs()) {
                throw new ErrorException("Error al crear el directorio " + logDir);
            }

            if (!logFile.exists()) {
                if (!logFile.createNewFile()) {
                    throw new ErrorException("Error al crear el archivo " + logFile);
                }
            }

            try (PrintWriter printWriter = new PrintWriter(new FileWriter(archivoLog, true))) {
                printWriter.println(contenido);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
