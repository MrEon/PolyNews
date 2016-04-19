package fr.unice.polytech.polynews;

import java.net.URL;

/**
 * Created by user on 13/04/2016.
 */
public class News {
    private int id;
    private String title;
    private String content;
    private String author;
    private String date;
    private int type; //Societe = 0, Culture =1
    private int media; //Video = 0, Image = 1
    private String url;



    public News(int id, String title, String content, String author, String date, int media, int type, String url) {
        this.id= id;
        this.title= title;
        this.content=content;
        this.author=author;
        this.date=date;
        this.media=media;
        this.type=type;
        this.url=url;
    }
}
