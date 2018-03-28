package com.kmccon200.keelymccone.mobilecoursework.model;

import android.os.Parcel;
import android.os.Parcelable;

public class DataItem implements Parcelable {

    private String title;
    private String description;
    private String link;
    private double georssPoint;
    private String author;
    private String comments;
    private String pubDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public double getGeorssPoint() {
        return georssPoint;
    }

    public void setGeorssPoint(double georssPoint) {
        this.georssPoint = georssPoint;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.link);
        dest.writeDouble(this.georssPoint);
        dest.writeString(this.author);
        dest.writeString(this.comments);
        dest.writeString(this.pubDate);
    }

    public DataItem() {
    }

    protected DataItem(Parcel in) {
        this.title = in.readString();
        this.description = in.readString();
        this.link = in.readString();
        this.georssPoint = in.readDouble();
        this.author = in.readString();
        this.comments = in.readString();
        this.pubDate = in.readString();
    }

    public static final Parcelable.Creator<DataItem> CREATOR = new Parcelable.Creator<DataItem>() {
        @Override
        public DataItem createFromParcel(Parcel source) {
            return new DataItem(source);
        }

        @Override
        public DataItem[] newArray(int size) {
            return new DataItem[size];
        }
    };
}