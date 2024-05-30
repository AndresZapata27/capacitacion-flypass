package com.courses.capacitacionesflypass.sesion1.f.solid.LiskovSubstitution.casoDos;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.jamiltonquintero.solid.l.sinl.casoDos.model.ReportEnum;


public interface IReporte {

    ReportEnum getReportType();
    void portada(Document document) throws DocumentException;
    PdfPTable tabla();
    void conclusion(Document document) throws DocumentException;
    void totalCredito(Document document)throws DocumentException;
    void auditoria(Document document)throws DocumentException;

}
