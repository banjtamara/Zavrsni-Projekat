package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.text.DateFormatter;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class Excel {

	// reference na privatna polja
	private static HSSFSheet ExcelWSheet;
	private static HSSFWorkbook ExcelWBook;
	private static HSSFCell Cell;
	private static HSSFRow Row;

	// Formatiramo u String
	private static DataFormatter formatter;

	// Exel fajl i postavlja Worksheet
	// Ucitavamo neki fajl preko Path putanje
	public static void setExcelFile(String Path, String SheetName) throws Exception {
		try {

			FileInputStream ExcelFile = new FileInputStream(Path);

			// Otvaramo Exel fajl
			ExcelWBook = new HSSFWorkbook(ExcelFile);

			// Otvaramo WorkSheet iz Exela
			ExcelWSheet = ExcelWBook.getSheet(SheetName);

			// Formatiramo
			formatter = new DataFormatter();
		} catch (Exception e) {

			throw (e);
		}
	}

	// Uzimam podatak iz Exela za odredjenu kolonu i red
	public static String getCellData(int RowNum, int ColNum) throws Exception {
		try {

			// Citamo celiju tj uzimamo podatak iz zadatog reda i kolone
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			// Formatira u String sadrzaj celije
			String CellData = formatter.formatCellValue(Cell);

			return CellData;
		} catch (Exception e) {
			return "";
		}
	}

	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {
		try {

			// Uzimam red
			Row = ExcelWSheet.getRow(RowNum);

			// odabrati datu poziciju celije i proveriti da li je prazna ili nije
			Cell = Row.getCell(ColNum, MissingCellPolicy.RETURN_BLANK_AS_NULL);

			if (Cell == null) {

				Cell = Row.createCell(ColNum);

				// rezultat ispusati
				Cell.setCellValue(Result);
			} else {

				// ako je celija popunjena, preko stare vrednosti se upisuje nova vrednost/nov
				// rezultat
				Cell.setCellValue(Result);
			}

			// Ovaj deo koda upisuje izmene u excell fajl

			FileOutputStream fileOut = new FileOutputStream(constant.PathExcel + constant.FileName);
			ExcelWBook.write(fileOut);

			fileOut.flush();

			// zatvoriti
			fileOut.close();
		} catch (Exception e) {
			throw (e);

		}

	}

	// Vraca referencu na worksheet
	public static HSSFSheet getWorkSheet() {
		return ExcelWSheet;
	}
}
