package com.zcc.demo.demo2.exercise.List;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Dr.Z
 * @version demo
 */
public class HomeWork {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        NewClass New1 = new NewClass("\"新闻一\"456789123456789");
        NewClass New2 = new NewClass("新闻二");
        New1.setContent("新冠");
        New2.setContent("男子");
        arrayList.add(New1);
        arrayList.add(New2);
        Collections.reverse(arrayList);
        for (Object news: arrayList){
            System.out.println(news);
        }

    }
}
class NewClass{
    private String title;
    private String content;

    public NewClass(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        if (title.length() > 15){
            return "title=" + title.substring(0,15) + "...";
        }
        return "title=" + title ;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}