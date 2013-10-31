package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Feedback")
public class Feedback {


    private String name;
    private String email;
    private long phone;
    private String feedback_type;
    private String message;


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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
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


    public String toString() {
        return getName() + ", " + getEmail() + "," + getPhone() + ", " + getFeedback_type() + ", " + getMessage();
    }

}
