package com.berkaykaanedikli.yazilihazirlik_2d1y;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class KisiBilgi implements Parcelable {
    private String userName;
    private String eMail;
    private String phoneNo;
    private String password;

    protected KisiBilgi(Parcel in) {
        userName = in.readString();
        eMail = in.readString();
        phoneNo = in.readString();
        password = in.readString();
    }

    public static final Creator<KisiBilgi> CREATOR = new Creator<KisiBilgi>() {
        @Override
        public KisiBilgi createFromParcel(Parcel in) {
            return new KisiBilgi(in);
        }

        @Override
        public KisiBilgi[] newArray(int size) {
            return new KisiBilgi[size];
        }
    };

    public KisiBilgi(String userName, String eMail, String phoneNo, String password, String passwordAgain) {
        this.userName = userName;
        this.eMail = eMail;
        this.phoneNo = phoneNo;
        this.password = password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return eMail;
    }

    public void setEmail(String email) {
        this.eMail = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(userName);
        dest.writeString(eMail);
        dest.writeString(phoneNo);
        dest.writeString(password);
    }
}
