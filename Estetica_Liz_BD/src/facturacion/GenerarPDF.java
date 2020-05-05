/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

import rojerusan.RSNotifyAnimated;

/**
 *
 * @author Lopez
 */
public class GenerarPDF {

    //tipos de fuentes
  private Font fuenteBold1 = new Font(Font.FontFamily.COURIER,10,Font.BOLD);
  private Font fuenteNormal1= new Font(Font.FontFamily.COURIER,3,Font.NORMAL);
  private Font fuenteItalic1= new Font(Font.FontFamily.COURIER,5,Font.ITALIC);
  
  
  public void generarpdf1(String header,String empe, String info,String footer,String rutaimagen,String salida,String fin){
      try {
          Document documentS = new Document(PageSize.A7,36,36,10,10);
          PdfWriter.getInstance(documentS, new FileOutputStream(salida));
          documentS.open();
          //mandamos el titulo cabecera
          documentS.add(getHeader1(header));
          //metemos la foto
          Image imagen = Image.getInstance(rutaimagen);
          imagen.scaleAbsolute(20,20);
          imagen.setAlignment(Element.ALIGN_CENTER);
          documentS.add(imagen);
          //informacion
          documentS.add(getempre1(empe));
          
          documentS.add(getinfo1(info));
          //parte de abajo
          documentS.add(getfooter1(footer));
          
          documentS.add(getfin1(fin));
          
          documentS.close();
         
      } catch (Exception e) {
      }
  }
  private Paragraph getHeader1(String texto){
     Paragraph p=new Paragraph();
      Chunk c= new Chunk();
      p.setAlignment(Element.ALIGN_CENTER);
      c.append(texto);
      c.setFont(fuenteBold1);
      p.add(c);
      return p;
  }
  private Paragraph getempre1(String texto){
     Paragraph p=new Paragraph();
      Chunk c= new Chunk();
      p.setAlignment(Element.ALIGN_BOTTOM);
      c.append(texto);
      c.setFont(fuenteNormal1);
      p.add(c);
      return p;
      
  }
  private Paragraph getinfo1(String texto){
     Paragraph p=new Paragraph();
      Chunk c= new Chunk();
      p.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
      c.append(texto);
      c.setFont(fuenteNormal1);
      p.add(c);
      return p;
      
  }
  private Paragraph getfooter1(String texto){
     Paragraph p=new Paragraph();
      Chunk c= new Chunk();
      p.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
      c.append(texto);
      c.setFont(fuenteItalic1);
      p.add(c);
      return p;
      
  }
  private Paragraph getfin1(String texto){
     Paragraph p=new Paragraph();
      Chunk c= new Chunk();
      p.setAlignment(Element.ALIGN_LEFT);
      c.append(texto);
      c.setFont(fuenteItalic1);
      p.add(c);
      return p;
      
  }
  
    
}
