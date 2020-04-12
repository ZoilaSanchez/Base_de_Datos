/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generarpdf;


import facturacion.*;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

/**
 *
 * @author Lopez
 */
public class GenerarPDF {
    //clase madre
    
    //tipos de fuentes
  private Font fuenteBold = new Font(Font.FontFamily.COURIER,10,Font.BOLD);
  private Font fuenteNormal= new Font(Font.FontFamily.COURIER,3,Font.NORMAL);
  private Font fuenteItalic= new Font(Font.FontFamily.COURIER,5,Font.ITALIC);
  
  
  public void generarpdf(String header,String empe, String info,String footer,String rutaimagen,String salida,String fin){
      try {
          Document document = new Document(PageSize.A7,36,36,10,10);
          PdfWriter.getInstance(document, new FileOutputStream(salida));
          document.open();
          //mandamos el titulo cabecera
          document.add(getHeader(header));
          //metemos la foto
          Image imagen = Image.getInstance(rutaimagen);
          imagen.scaleAbsolute(20,20);
          imagen.setAlignment(Element.ALIGN_CENTER);
          document.add(imagen);
          //informacion
          document.add(getempre(empe));
          
          document.add(getinfo(info));
          //parte de abajo
          document.add(getfooter(footer));
          
          document.add(getfin(fin));
          
          document.close();
      } catch (Exception e) {
      }
      
      
  }
  
  private Paragraph getHeader(String texto){
     Paragraph p=new Paragraph();
      Chunk c= new Chunk();
      p.setAlignment(Element.ALIGN_CENTER);
      c.append(texto);
      c.setFont(fuenteBold);
      p.add(c);
      return p;
  }
  private Paragraph getempre(String texto){
     Paragraph p=new Paragraph();
      Chunk c= new Chunk();
      p.setAlignment(Element.ALIGN_BOTTOM);
      c.append(texto);
      c.setFont(fuenteNormal);
      p.add(c);
      return p;
      
  }
  private Paragraph getinfo(String texto){
     Paragraph p=new Paragraph();
      Chunk c= new Chunk();
      p.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
      c.append(texto);
      c.setFont(fuenteNormal);
      p.add(c);
      return p;
      
  }
  private Paragraph getfooter(String texto){
     Paragraph p=new Paragraph();
      Chunk c= new Chunk();
      p.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
      c.append(texto);
      c.setFont(fuenteItalic);
      p.add(c);
      return p;
      
  }
  private Paragraph getfin(String texto){
     Paragraph p=new Paragraph();
      Chunk c= new Chunk();
      p.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
      c.append(texto);
      c.setFont(fuenteItalic);
      p.add(c);
      return p;
      
  }
//   g.generarpdf("FACTURA ELECTRONICA","NOMBRE DE LA EMPRESA: "+empre.getText()+"\n"+"Nit: "+ids.getText() , "NOMBRE PRODUCTO -- UNIDADES -- COSTO U --- PRECIO TOTAL ",cadenas , "/Users/Estefany/Desktop/Inventario3/src/logo.jpg", "/Users/Estefany/Pictures/'"+nombrefactura.getText()+"'.pdf","Total a cancerlar : Q."+total.getText());
     
  public void generarpdf2(String header,String empe, String footer,String salida,String fin){
      try {
          Document document = new Document(PageSize.A7,36,36,10,10);
          PdfWriter.getInstance(document, new FileOutputStream(salida));
          document.open();
          //mandamos el titulo cabecera
          document.add(getHeader(header));
          //informacion
          document.add(getempre(empe));
          //parte de abajo
          document.add(getfooter(footer));
          document.add(getfin(fin));
          document.close();
          System.out.println("genero aqui sdfaljflkasdjflk ");
      } catch (Exception e) {
      }
      
      
  }
    
}
