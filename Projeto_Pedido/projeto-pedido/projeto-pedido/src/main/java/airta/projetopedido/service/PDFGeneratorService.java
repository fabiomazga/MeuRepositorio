package airta.projetopedido.service;

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;


import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Service

public class PDFGeneratorService {
    public void export(HttpServletResponse response) throws IOException {
        Document document = new Document(PageSize.A4);

        PdfWriter.getInstance(document, response.getOutputStream());
        document.open();

        Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        fontTitle.setSize(18);
        Paragraph paragraph = new Paragraph("Atria", fontTitle);
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);

        Font fontParagraph = FontFactory.getFont(FontFactory.HELVETICA);
        fontParagraph.setSize(12);
        Paragraph paragraph2 = new Paragraph("Pedido", fontParagraph);
        paragraph2.setAlignment(Paragraph.ALIGN_LEFT);



        Font fontParagraph3 = FontFactory.getFont(FontFactory.HELVETICA);
        fontParagraph3.setSize(10);
        Paragraph paragraph3 = new Paragraph("Numero do Pedido", fontParagraph3);
        paragraph3.setAlignment(Paragraph.ALIGN_LEFT);

        Font fontParagraph4 = FontFactory.getFont(FontFactory.HELVETICA);
        fontParagraph4.setSize(10);
        Paragraph paragraph4 = new Paragraph("Codigo do Produto", fontParagraph4);
        paragraph4.setAlignment(Paragraph.ALIGN_LEFT);

        Font fontParagraph5 = FontFactory.getFont(FontFactory.HELVETICA);
        fontParagraph5.setSize(10);
        Paragraph paragraph5 = new Paragraph("Valor do Produto", fontParagraph5);
        paragraph5.setAlignment(Paragraph.ALIGN_LEFT);

        Font fontParagraph6 = FontFactory.getFont(FontFactory.HELVETICA);
        fontParagraph6.setSize(10);
        Paragraph paragraph6 = new Paragraph("Quantidade", fontParagraph6);
        paragraph6.setAlignment(Paragraph.ALIGN_LEFT);


       document.add(paragraph);
       document.add(paragraph2);
       document.add(paragraph3);
       document.add(paragraph4);
       document.add(paragraph5);
       document.add(paragraph6);
       document.close();
    }
}
