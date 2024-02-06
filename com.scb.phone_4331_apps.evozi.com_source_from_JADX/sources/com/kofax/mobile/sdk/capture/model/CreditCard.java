package com.kofax.mobile.sdk.capture.model;

import android.os.Parcel;
import android.os.Parcelable;

public class CreditCard extends CaptureData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* renamed from: a */
        public final CreditCard createFromParcel(Parcel parcel) {
            return new CreditCard(parcel);
        }

        /* renamed from: t */
        public final CreditCard[] newArray(int i) {
            return new CreditCard[i];
        }
    };
    private String acV = new String();
    private String acW = new String();
    private String cardNumber = new String();
    private String cvv = new String();
    private String name = new String();

    public int describeContents() {
        return 0;
    }

    public CreditCard() {
    }

    public CreditCard(Parcel parcel) {
        readFromParcel(parcel);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String str) {
        this.cardNumber = str;
    }

    public String getExpirationMonth() {
        return this.acV;
    }

    public void setExpirationMonth(String str) {
        this.acV = str;
    }

    public String getExpirationYear() {
        return this.acW;
    }

    public void setExpirationYear(String str) {
        this.acW = str;
    }

    public String getCvv() {
        return this.cvv;
    }

    public void setCvv(String str) {
        this.cvv = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.cardNumber);
        parcel.writeString(this.acV);
        parcel.writeString(this.acW);
        parcel.writeString(this.cvv);
        parcel.writeString(this.capturedImageId);
        parcel.writeString(this.processedImageId);
    }

    private void readFromParcel(Parcel parcel) {
        this.name = parcel.readString();
        this.cardNumber = parcel.readString();
        this.acV = parcel.readString();
        this.acW = parcel.readString();
        this.cvv = parcel.readString();
        this.capturedImageId = parcel.readString();
        this.processedImageId = parcel.readString();
    }
}
