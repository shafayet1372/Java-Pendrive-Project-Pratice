/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendrive;

import java.util.UUID;

/**
 *
 * @author User
 */
public class Image {
    private final String id;
    private String title;
    private String url;
    private boolean isPrimary;
    public Image( String title, String url) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.url = url;
        this.isPrimary=true;
    }

    public Image( String title, String url, boolean isPrimary) {
       this.id = UUID.randomUUID().toString();
        this.title = title;
        this.url = url;
        this.isPrimary = isPrimary;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    @Override
    public String toString() {
        return "Image{" + "id=" + id + ", title=" + title + ", url=" + url + ", isPrimary=" + isPrimary + '}';
    }
  
}
