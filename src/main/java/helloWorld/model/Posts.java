/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloWorld.model;

public class Posts {

    private String title;
    private String post;
    private String date;
    private String username;

    public Posts() {
        setTitle("");
        setPost("");
        setDate("");
        setUsername("");
    }

    public Posts(String title, String post, String date, String username) {

        this.setTitle(title);

        this.setPost(post);

        this.setDate(date);

        this.setUsername(username);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return title + " " + post + " " + username + " " + date;
    }

    public String toFileString() {
        return title + "," + post + "," + username + "," + date;
    }

    public void loadFromFileString(String str) {
        // TODO: Validation should be done here
        String[] parts = str.split(",");

        title = parts[0];
        post = parts[1];
        date = parts[2];
        username = parts[3];
    }
}
