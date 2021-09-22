package com.mybusinesscard.models;

public class ContactModel {
    private String businessName, businessSlogan, businessImgURL;
    private String businessAddress, businessEmail;
    private String businessNumber;

    public ContactModel(String businessName, String businessSlogan, String businessImgURL, String businessAddress, String businessEmail, String businessNumber) {
        this.businessName = businessName;
        this.businessSlogan = businessSlogan;
        this.businessImgURL = businessImgURL;
        this.businessAddress = businessAddress;
        this.businessEmail = businessEmail;
        this.businessNumber = businessNumber;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessSlogan() {
        return businessSlogan;
    }

    public void setBusinessSlogan(String businessSlogan) {
        this.businessSlogan = businessSlogan;
    }

    public String getBusinessImgURL() {
        return businessImgURL;
    }

    public void setBusinessImgURL(String businessImgURL) {
        this.businessImgURL = businessImgURL;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getBusinessEmail() {
        return businessEmail;
    }

    public void setBusinessEmail(String businessEmail) {
        this.businessEmail = businessEmail;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }
}
