public class _09_GenerateAPDFByExternalLibrary {

    public static void main(String[] args) {
	char hearts = '\u2665';
	char diamonds = '\u2666';
	char clubs = '\u2663';
	char spades = '\u2660';
	char[] suits = {clubs,diamonds,hearts,spades};
	String[] cards = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	for (int i = 0; i < 13; i++) {
	    for (int j = 0; j < 4; j++) {
		System.out.print(cards[i]+suits[j]+ " ");
	    }
	    System.out.println();
	}
    }
}
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.IOException;
//
// import com.itextpdf.text.BaseColor;
// import com.itextpdf.text.Chunk;
// import com.itextpdf.text.Document;
// import com.itextpdf.text.DocumentException;
// import com.itextpdf.text.Element;
// import com.itextpdf.text.Font;
// import com.itextpdf.text.Paragraph;
// import com.itextpdf.text.pdf.BaseFont;
// import com.itextpdf.text.pdf.PdfPCell;
// import com.itextpdf.text.pdf.PdfPTable;
// import com.itextpdf.text.pdf.PdfWriter;
//
// public class _09_GeneratePDF {
//
// public static void main(String[] args) throws DocumentException,
// IOException {
//
// // Program will create a file called Deck.pdf in the main folder
// // (Homewrok1-Intro-Java).
// // An example file is added there, called ExampleDeck.pdf
//
// Document document = new Document();
// try {
// PdfWriter.getInstance(document, new FileOutputStream("Deck.pdf"));
// } catch (FileNotFoundException e) {
// e.printStackTrace();
// } catch (DocumentException e) {
// e.printStackTrace();
// }
//
// document.open();
// BaseFont baseFont = BaseFont.createFont("times.ttf",
// BaseFont.IDENTITY_H, true);
//
// Paragraph header = new Paragraph("STANDARD DECK OF 52 CARDS");
// header.setAlignment(Element.ALIGN_CENTER);
// document.add(header);
//
// document.add(Chunk.NEWLINE);
//
// PdfPTable table = new PdfPTable(4);
//
// Font black = new Font(baseFont, 40f, 0, BaseColor.BLACK);
// Font red = new Font(baseFont, 40f, 0, BaseColor.RED);
//
// String[] colors = { "\u2660", "\u2665", "\u2666", "\u2663" };
// String[] values = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
// "Q", "K", "A" };
//
// for (int value = 0; value < 13; value++) {
// for (int color = 0; color < 4; color++) {
//
// Paragraph card = new Paragraph();
//
// if (color == 0 || color == 3) {
// card = new Paragraph(values[value] + colors[color], black);
// } else {
// card = new Paragraph(values[value] + colors[color], red);
// }
//
// PdfPCell cell = new PdfPCell(card);
// cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
// cell.setHorizontalAlignment(Element.ALIGN_CENTER);
// cell.setFixedHeight(150f);
// table.addCell(cell);
// }
// }
//
// document.add(table);
// document.close();
// }
// }