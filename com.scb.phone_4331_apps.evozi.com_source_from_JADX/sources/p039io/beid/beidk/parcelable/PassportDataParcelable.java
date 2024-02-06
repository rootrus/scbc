package p039io.beid.beidk.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: io.beid.beidk.parcelable.PassportDataParcelable */
public class PassportDataParcelable implements Parcelable {
    public static final Parcelable.Creator<PassportDataParcelable> CREATOR = new Parcelable.Creator<PassportDataParcelable>() {
        public final PassportDataParcelable createFromParcel(Parcel parcel) {
            return new PassportDataParcelable(parcel);
        }

        public final PassportDataParcelable[] newArray(int i) {
            return new PassportDataParcelable[i];
        }
    };
    private static final SimpleDateFormat MediaBrowserCompat$CustomActionResultReceiver = new SimpleDateFormat("yyMMdd", Locale.US);
    public String citizenID;
    public Date dateOfBirth;
    public Date dateOfExpiry;
    public String dg1;
    public String dg13;
    public String dg2;
    public String error;
    public String errorCode;
    public String firstNameEng;
    public String gender;
    public String issuingAuthority;
    public String lastNameEng;
    public String nameThai;
    public String nationality;
    public String passportNumber;
    public String placeOfBirth;
    public String profileId;
    public String result;
    public String sod;
    public boolean verificationResult;

    public PassportDataParcelable() {
    }

    protected PassportDataParcelable(Parcel parcel) {
        this.dg1 = parcel.readString();
        this.dg2 = parcel.readString();
        this.dg13 = parcel.readString();
        this.sod = parcel.readString();
        this.passportNumber = parcel.readString();
        this.firstNameEng = parcel.readString();
        this.lastNameEng = parcel.readString();
        this.nameThai = parcel.readString();
        this.gender = parcel.readString();
        this.nationality = parcel.readString();
        this.placeOfBirth = parcel.readString();
        this.issuingAuthority = parcel.readString();
        this.citizenID = parcel.readString();
        this.dateOfBirth = parseDate(parcel.readString());
        this.dateOfExpiry = parseDate(parcel.readString());
        this.verificationResult = parcel.readByte() != 0;
        this.profileId = parcel.readString();
        this.result = parcel.readString();
        this.errorCode = parcel.readString();
        this.error = parcel.readString();
    }

    public PassportDataParcelable(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Date date, Date date2, boolean z, String str14, String str15, String str16, String str17) {
        this.dg1 = str;
        this.dg2 = str2;
        this.dg13 = str3;
        this.sod = str4;
        this.passportNumber = str5;
        this.firstNameEng = str6;
        this.lastNameEng = str7;
        this.nameThai = str8;
        this.gender = str9;
        this.nationality = str10;
        this.placeOfBirth = str11;
        this.issuingAuthority = str12;
        this.citizenID = str13;
        this.dateOfBirth = date;
        this.dateOfExpiry = date2;
        this.verificationResult = z;
        this.profileId = str14;
        this.result = str15;
        this.errorCode = str16;
        this.error = str17;
    }

    public static Date parseDate(String str) {
        try {
            return MediaBrowserCompat$CustomActionResultReceiver.parse(str);
        } catch (NullPointerException | ParseException unused) {
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.dg1);
        parcel.writeString(this.dg2);
        parcel.writeString(this.dg13);
        parcel.writeString(this.sod);
        parcel.writeString(this.passportNumber);
        parcel.writeString(this.firstNameEng);
        parcel.writeString(this.lastNameEng);
        parcel.writeString(this.nameThai);
        parcel.writeString(this.gender);
        parcel.writeString(this.nationality);
        parcel.writeString(this.placeOfBirth);
        parcel.writeString(this.issuingAuthority);
        parcel.writeString(this.citizenID);
        Date date = this.dateOfBirth;
        String str = null;
        parcel.writeString(date != null ? MediaBrowserCompat$CustomActionResultReceiver.format(date) : null);
        Date date2 = this.dateOfExpiry;
        if (date2 != null) {
            str = MediaBrowserCompat$CustomActionResultReceiver.format(date2);
        }
        parcel.writeString(str);
        parcel.writeByte(this.verificationResult ? (byte) 1 : 0);
        parcel.writeString(this.profileId);
        parcel.writeString(this.result);
        parcel.writeString(this.errorCode);
        parcel.writeString(this.error);
    }
}
