/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendrive;

import java.util.Arrays;
import java.util.UUID;

/**
 *
 * @author User
 */
public class Pendrive {
    private final String id;
    private String title;
    private String summary;
    private String description;
    private String brand;
    private String productCode;
    private String SKU;
    private Price price;
    private Stock status;
    private Faq[] faq;
    private Image[] image;
    private ProductSpecifications[] specifications;
    private String [] features;
    int F,I,Q,S=0;
    public Pendrive( String title, String summary, Price price) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.summary = summary;
        this.price = price;
        this.status=Stock.IN_STOCK;
        this.features=new String[5];
        this.faq=new Faq[1];
        this.specifications=new ProductSpecifications[3];
        this.image=new Image[5];
    }

    public Pendrive( String title, String summary, String brand, String productCode, String SKU, Price price) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.summary = summary;
        this.brand = brand;
        this.productCode = productCode;
        this.SKU = SKU;
        this.price = price;
        this.status=Stock.IN_STOCK;
        this.features=new String[10];
        this.faq=new Faq[10];
        this.specifications=new ProductSpecifications[10];
        this.image=new Image[10];
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Stock getStatus() {
        return status;
    }

    public void setStatus(Stock status) {
        this.status = status;
    }

    public Faq[] getFaq() {
        return faq;
    }

    public void setFaq(Faq[] faq) {
        this.faq = faq;
    }

    public Image[] getImage() {
        return image;
    }

    public void setImage(Image[] image) {
        this.image = image;
    }

    public ProductSpecifications[] getSpecifications() {
        return specifications;
    }

    public void setSpecifications(ProductSpecifications[] specifications) {
        this.specifications = specifications;
    }

    public String[] getFeatures() {
        return features;
    }

    public void setFeatures(String[] features) {
        this.features = features;
    }
    
    public void addFeatures(String feature){
           
             features[F]=feature;
            F++;
       
    }
    public void addGallery(Image images){
        
          image[I]=images;
          I++;
        }
        
        
   
    public void addSpecifications(ProductSpecifications specification){
       
           specifications[S]=specification;
          S++;
    }
    public void addFaq(Faq questions){
       
           faq[Q]=questions;
          Q++;
    }
    public void ShowProduct(){
        System.out.println(this.getTitle());
        System.out.println("Brand :"+this.getBrand());
        System.out.println(this.getPrice());
        System.out.println("Product Code :"+this.getProductCode());
        System.out.println("SKU :"+this.getSKU());
        System.out.println("=========Features========");
        for(int i=0;i<this.getFeatures().length;i++){
            System.out.println(this.getFeatures()[i]);
        }
        System.out.println("=========Specifications========");
        for(int i=0;i<this.getSpecifications().length;i++){
            System.out.println("Group :"+this.getSpecifications()[i].getGroup());
            System.out.println(this.getSpecifications()[i].getKey()+":"+this.getSpecifications()[i].getValue());
            
        }
        System.out.println("=========FAQ========");
         for(int i=0;i<this.getFaq().length;i++){
            System.out.println("Question :"+this.getFaq()[i].getQuestion());
             System.out.println("Answer :"+this.getFaq()[i].getAnswer());
            
        }
    }
    @Override
    public String toString() {
        return "Pendrive{" + "id=" + id + ", title=" + title + ", summary=" + summary + ", description=" + description + ", brand=" + brand + ", productCode=" + productCode + ", SKU=" + SKU + ", price=" + price + ", status=" + status + ", faq=" + Arrays.toString(faq) + ", image=" + Arrays.toString(image) + ", specifications=" + Arrays.toString(specifications) + ", features=" + Arrays.toString(features) + '}';
    }
    
    
    
}
