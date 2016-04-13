package fr.unice.polytech.polynews;

import java.net.URL;

/**
 * Created by user on 13/04/2016.
 */
public class News {
    private String id;
    private String title;
    private String content;
    private String author;
    private String date;
    private boolean type; //Societe = 0, Culture =1
    private boolean media; //Video = 0, Image = 1
    private URL url;

    public News(URL url, boolean media, boolean type, String date, String author, String content, String title, String id) {
        this.url = url;
        this.media = media;
        this.type = type;
        this.date = date;
        this.author = author;
        this.content = content;
        this.title = title;
        this.id = id;
    }
}
