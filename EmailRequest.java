package com.email.emailweb.Model;

public class EmailRequest {

    private String recipient;
    private String purpose;
    private String category;

    public String getRecipient() { return recipient; }
    public void setRecipient(String recipient) { this.recipient = recipient; }

    public String getPurpose() { return purpose; }
    public void setPurpose(String purpose) { this.purpose = purpose; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}
