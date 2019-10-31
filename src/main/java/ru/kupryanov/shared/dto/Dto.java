package ru.kupryanov.shared.dto;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.googlecode.objectify.annotation.Id;

import java.io.Serializable;

public class Dto implements IsSerializable, Serializable {
    @Id
    private Long id;
    private static final long serialVersionUID = 1L;

    private boolean isLoggedIn;

    private String login;

    private String email;

    private String googleId;

    private boolean isAdmin;

    private String pictureURL;
    private String time;
    private String timeModified;
    public Dto() {

    }
    public void setAttributes(boolean isLoggedIn, Long id, String login, boolean isAdmin, String pictureURL, String time ,String timeModified, String googleId , String email) {
        setId(id);
        this.isLoggedIn = isLoggedIn;
        this.login = login;
        this.isAdmin = isAdmin;
        this.pictureURL = pictureURL;
        this.time = time;
        this.googleId = googleId;
        this.email = email;
        this.timeModified = timeModified;
    }
    public boolean isLoggedIn() {
        return isLoggedIn;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public boolean isAdmin() {
        return isAdmin;
    }
}
