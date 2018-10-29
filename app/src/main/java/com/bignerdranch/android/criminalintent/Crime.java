package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;
    private String mShopName;
    private String mReceiptTitle;
    private String mComments;

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String getSuspect() { return mSuspect; }

    public void setSuspect(String suspect) { mSuspect = suspect; }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }

    public String getShopName() {return mShopName; }
    public void setShopName(String mShopName) { this.mShopName = mShopName; }

    public String getReceiptTitle() { return mReceiptTitle; }
    public void setReceiptTitle(String mReceiptTitle) { this.mReceiptTitle = mReceiptTitle; }

    public String getComments() { return mComments; }
    public void setComments(String mComments) { this.mComments = mComments; }
}
