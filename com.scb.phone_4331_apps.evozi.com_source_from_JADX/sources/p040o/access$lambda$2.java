package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.access$lambda$2 */
public class access$lambda$2 implements Parcelable {
    public static final Parcelable.Creator<access$lambda$2> CREATOR = new Parcelable.Creator<access$lambda$2>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new access$lambda$2(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new access$lambda$2[i];
        }
    };
    public String IconCompatParcelizer;
    public Double MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String RatingCompat;
    public String read;
    public String write;

    public int describeContents() {
        return 0;
    }

    public access$lambda$2() {
    }

    protected access$lambda$2(Parcel parcel) {
        this.RatingCompat = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.write = parcel.readString();
    }

    public static access$lambda$2 MediaBrowserCompat$CustomActionResultReceiver() {
        return new access$lambda$2();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.write);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        access$lambda$2 access_lambda_2 = (access$lambda$2) obj;
        String str = this.RatingCompat;
        if (str == null ? access_lambda_2.RatingCompat != null : !str.equals(access_lambda_2.RatingCompat)) {
            return false;
        }
        String str2 = this.read;
        if (str2 == null ? access_lambda_2.read != null : !str2.equals(access_lambda_2.read)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 == null ? access_lambda_2.MediaBrowserCompat$ItemReceiver != null : !str3.equals(access_lambda_2.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str4 = this.IconCompatParcelizer;
        if (str4 == null ? access_lambda_2.IconCompatParcelizer != null : !str4.equals(access_lambda_2.IconCompatParcelizer)) {
            return false;
        }
        Double d = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (d == null ? access_lambda_2.MediaBrowserCompat$CustomActionResultReceiver != null : !d.equals(access_lambda_2.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str5 = this.write;
        String str6 = access_lambda_2.write;
        if (str5 != null) {
            return str5.equals(str6);
        }
        if (str6 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.RatingCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        Double d = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = d != null ? d.hashCode() : 0;
        String str5 = this.write;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }
}
