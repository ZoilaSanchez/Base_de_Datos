/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

/**
 *
 * @author Lopez
 */
public class cambio {
    
   
       public String Cambiador(int monto){
           String vuelto="";
       int  Doscientos=0,cien=0,cincuenta=0,veinte=0,die=0,cinco=0,quetzal=0;
       //numero de billetes de 200
        Doscientos=monto/200;
        monto=monto-(Doscientos*200);
        
        //numero de 100
        cien=monto/100;
        monto=monto-(cien*100);
        
        //numero de 50
        cincuenta=monto/50;
        monto=(monto-(cincuenta*50));
        
        
        //numero de 20
        veinte=monto/20;
        monto=(monto-(veinte*20));
        
        //numero de 10
        die=monto/10;
        monto=(monto-(die*10));
        
        //numero de 5
        cinco=monto/5;
        monto=(monto-(cinco*5));
        
        //numero de 1
        quetzal=monto/1;
        monto=(monto-(quetzal*1));
        
        
         if(Doscientos>0){
             vuelto+="Q. 200 = "+Doscientos+" / ";
         }
         if(cien>0){
              vuelto+="Q. 100 = "+cien+" / ";
         }
         if(cincuenta>0){
             System.out.println("cantidad de 50 ----- "+cincuenta);
             vuelto+="Q. 50 = "+cincuenta+" / ";
         }
         if(veinte>0){
             System.out.println("cantidad de 20 ----- "+veinte);
             vuelto+="Q. 20 = "+veinte+" / ";
         }
         if(die>0){
             System.out.println("cantidad de 10 ----- "+die);
             vuelto+="Q. 10 = "+die+" / ";
         }
         if(cinco>0){
             System.out.println("cantidad de 5 ----- "+cinco);
             vuelto+="Q. 5 = "+cinco+" / ";
         }
         if(quetzal>0){
             System.out.println("cantidad de 1 ----- "+quetzal);
             vuelto+="Q. 1 = "+quetzal+" / ";
         }
         
         String cadenaNueva = vuelto.substring (0, vuelto.length () - 2);
         
        return cadenaNueva;
        
    }
   
    public void decimalcam(double monto){
        //0.5,0.10,0.05
        double  centavo1=0,centavo2=0,centavo3=0;
        
        //numero de monedas 0.5
        centavo1=monto/(0.5);
        monto=monto-(centavo1*0.5);
        System.out.println(monto);
        //numero de monedas 0.1
        centavo2=monto/0.1;
        monto=monto-(centavo2*0.1);
        System.out.println(monto);
        //numero de monedas 0.05
        centavo3=monto/0.05;
        monto=monto-(centavo3*0.05);
        System.out.println(monto);
        if(centavo1>0.0){
            System.out.println("moneda 0.5 - "+centavo1);
        }
        if(centavo2>0.0){
            System.out.println("moneda 0.1 - "+centavo2);
        }
        if(centavo3>0.0){
            System.out.println("moneda 0.05 - "+centavo3);
        }
        
    }
 
    }

    

