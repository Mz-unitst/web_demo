package com.mz.demo1;

public class Greeting {

    private  long id;
    private  String content;
    private static final String template = "Hello, %s!";
    public Greeting(long id, String content) {
        this.id=id;
        if (content.isEmpty())
        {
            this.content="mz";
        }
        else {
            this.content=content;
        }
    }

    public long getId() {
        return this.id;
    }

    public String getContent() {
        return String.format(template,content);
    }

}
