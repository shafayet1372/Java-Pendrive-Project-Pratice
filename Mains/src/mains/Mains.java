/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;
import Pendrive.*;
import java.util.Arrays;
/**
 *
 * @author User
 */
public class Mains {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Pendrive p1=new Pendrive("Adata UV128 USB 3.2 128GB Pendrive","Adata UV128 USB 3.2 Pendrive featured with 128GB capacity, USB 3.2 High-Speed Interface and a sliding USB connector, which smoothly extends from the drive at the push of a thumb. In this Pen Drive, the capless mechanical design eliminates the hassle of lost drive caps. It's Ultra-compact and light weight for easy carrying. Here, The USB3.2 connector ",new Price(1200,1100));
       p1.setBrand("Adata");
       p1.setProductCode("f123213");
       p1.setSKU("sdsdsd213");
       p1.setStatus(Stock.UPCOMING);
       p1.addFeatures("Model: Adata UV128");
       p1.addFeatures("Capacity: 128GB");
       p1.addFeatures("Convenient Capless Design");
       p1.addFeatures("USB 3.2 High-Speed Interface");
       p1.addFeatures("Ultra-compact");
       
       
       p1.addSpecifications(new ProductSpecifications("Capacity","128GB","Key Features"));
       p1.addSpecifications(new ProductSpecifications("Read Speed","Up to 100 MB/s read","Key Features"));
       p1.addSpecifications(new ProductSpecifications("Connectivity","USB 3.2","Key Features"));
       
       
       p1.addGallery(new Image("Adata","www.Adatat.com/1"));
       p1.addGallery(new Image("Adata","www.Adatat.com/2",false));
       p1.addGallery(new Image("Adata","www.Adatat.com/3",false));
       p1.addGallery(new Image("Adata","www.Adatat.com/4",false));
       
       p1.addFaq(new Faq("What is the price of Adata UV128 128GB Pendrive in Bangladesh?","The latest price of Adata UV128 128GB Pendrive in Bangladesh is 1,550৳. You can buy the Adata UV128 128GB Pendrive at best price from our website or visit any of our showrooms."));
       p1.ShowProduct();
    }
    
}
