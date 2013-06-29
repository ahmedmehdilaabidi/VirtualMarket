/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.esprit.market.technic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 *
 * @salma
 */
public class GenererPDF {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // - Paramètres de connexion à la base de données
	 Class.forName("com.mysql.jdbc.Driver");
	
        try {
            // - Connexion à la base
        	 final String url = "jdbc:mysql://127.0.0.1:3306/market";
        	    Connection con = DriverManager.getConnection(url, "root", "root");
            // - Chargement et compilation du rapport
            JasperDesign jasperDesign = JRXmlLoader.load("marketReport.jrxml");
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            // - Paramètres à envoyer au rapport
           Map  parameters = new HashMap();
          parameters.put("Titre", "Titre");
            // - Execution du rapport
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, con);
            // - Création du rapport au format PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\Users\\mehdi\\Report\\myreport.pdf");
            System.out.println("success");
        }

        catch (JRException e) {
            System.out.println("erreur de compilation"+ e.getMessage());
         } 
}

}
