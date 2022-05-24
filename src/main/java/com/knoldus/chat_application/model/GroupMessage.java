package com.knoldus.chat_application.model;
import com.sun.istack.NotNull;
import org.springframework.format.annotation.NumberFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class GroupMessage {
    @Id @GeneratedValue @Column (name = "ID", nullable = false)
    private int id;
   // @Column (name = "senderID")
    @NotNull
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private int senderID;

    //@Column (name = "groupID")
    @NotNull
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    @Column(columnDefinition = "int default false")
    private int groupID;
    //@Column (name = "message")

    @Column (name = "message")
    private String message;
   // @Column (name = "createdDate")
    private Date createdDate;
    //@Column (name = "updatedDate")
    private Date updatedDate;


    public int getSenderID() {
        return senderID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
