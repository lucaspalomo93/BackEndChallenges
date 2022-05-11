package com.mvc.crud.configuration;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;

import com.mvc.crud.model.Usuario;

public class ExportPDF {

	private final List<Usuario> usuarios;
	
	public ExportPDF(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	private void HeaderTable(PdfPTable table) {
		PdfPCell cell = new PdfPCell();
		
		cell.setPadding(5);
		cell.setPhrase(new Phrase("Id"));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Nombre"));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Apellido"));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Dni"));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Celular"));
		table.addCell(cell);
	}
	
	private void BodyTable(PdfPTable table) {
		for(Usuario usuarios: usuarios) {
			table.addCell(String.valueOf(usuarios.getId()));
			table.addCell(usuarios.getName());
			table.addCell(usuarios.getLastName());
			table.addCell(String.valueOf(usuarios.getDni()));
			table.addCell(String.valueOf(usuarios.getPhone()));
		}
	}
	
	public void createPdfFile(HttpServletResponse response) throws IOException, DocumentException {
		Document doc = new Document(PageSize.A4);
		PdfWriter.getInstance(doc, response.getOutputStream());
		doc.open();
		Paragraph paragraph = new Paragraph("usuarioss list");
		paragraph.setSpacingAfter(5);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		doc.add(paragraph);
		PdfPTable table = new PdfPTable(5);
		HeaderTable(table);
		BodyTable(table);
		doc.add(table);
		doc.close();
 	}
}
