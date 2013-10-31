package models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: ehc
 * Date: 31/10/13
 * Time: 12:14 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "Feedback")
public class Feedback {

    private int id;
    private String name;
    private String email;
    private int phone;
    private String feedback_type;
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getFeedback_type() {
        return feedback_type;
    }

    public void setFeedback_type(String feedback_type) {
        this.feedback_type = feedback_type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
