package com.mvc.crud.configuration;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mvc.crud.model.Usuario;



public class ExportExcel {
	private XSSFSheet sheet;
	private XSSFWorkbook workbook;
	private List<Usuario> usuarios;
	
	public ExportExcel(List<Usuario> usuarios) {
		this.usuarios = usuarios;
		workbook = new XSSFWorkbook();
	}
	
	public void readHeader() {
		sheet = workbook.createSheet("Lista de usuarios");
		Row row = sheet.createRow(0);
		CellStyle style = workbook.createCellStyle();
		XSSFFont font = workbook.createFont();
		font.setFontHeight(16);
		font.setBold(true);
		style.setFont(font);
		createCell(row, 0,"Id",style);
		createCell(row, 0,"Nombre",style);
	}

	private void createCell(Row row, int i, Object string, CellStyle style) {
		sheet.autoSizeColumn(i);
		Cell cell = row.createCell(i);
		if(string instanceof Integer) cell.setCellValue((Integer) string);
		else if (string instanceof Boolean) cell.setCellValue((Boolean) string);
		else if (string instanceof Long) cell.setCellValue((Long) string);
		else cell.setCellValue((String) string);
	}
	
	private void readBody() {
		int rowCounter = 1;
		CellStyle style = workbook.createCellStyle();
		XSSFFont font = workbook.createFont();
		font.setFontHeight(12);
		style.setFont(font);
		
		for(Usuario usuario : usuarios) {
			Row row = sheet.createRow(rowCounter);
			createCell(row, rowCounter++, usuario.getId(), style);
			createCell(row, rowCounter++, usuario.getName(), style);
		}
	}
	
	public void CreateXcelFile(HttpServletResponse response) throws IOException{
		readHeader();
		readBody();
		ServletOutputStream stream = response.getOutputStream();
		workbook.write(stream);
		workbook.close();
		stream.close();
	}
}
