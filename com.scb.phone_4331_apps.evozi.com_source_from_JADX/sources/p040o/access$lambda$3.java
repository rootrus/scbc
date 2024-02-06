package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.access$lambda$3 */
public final class access$lambda$3 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new access$lambda$3$MediaBrowserCompat$CustomActionResultReceiver();
    public String IconCompatParcelizer;
    public access$lambda$1 MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    private Double MediaBrowserCompat$MediaItem;
    public parseApp MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String RatingCompat;
    public String read;
    public access$lambda$6 write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access$lambda$3)) {
            return false;
        }
        access$lambda$3 access_lambda_3 = (access$lambda$3) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) access_lambda_3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) access_lambda_3.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) access_lambda_3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) access_lambda_3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) access_lambda_3.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) access_lambda_3.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) access_lambda_3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) access_lambda_3.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) access_lambda_3.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaMetadataCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.RatingCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        Double d = this.MediaBrowserCompat$MediaItem;
        int hashCode6 = d != null ? d.hashCode() : 0;
        access$lambda$1 access_lambda_1 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode7 = access_lambda_1 != null ? access_lambda_1.hashCode() : 0;
        parseApp parseapp = this.MediaDescriptionCompat;
        int hashCode8 = parseapp != null ? parseapp.hashCode() : 0;
        access$lambda$6 access_lambda_6 = this.write;
        if (access_lambda_6 != null) {
            i = access_lambda_6.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PullSlipDisplay(dateTime=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", transRef=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", ref1=");
        sb.append(this.read);
        sb.append(", ref2=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", ref3=");
        sb.append(this.RatingCompat);
        sb.append(", fee=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", function=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", sender=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", receiver=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.RatingCompat);
        Double d = this.MediaBrowserCompat$MediaItem;
        if (d != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        } else {
            parcel.writeInt(0);
        }
        access$lambda$1 access_lambda_1 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (access_lambda_1 != null) {
            parcel.writeInt(1);
            parcel.writeString(access_lambda_1.name());
        } else {
            parcel.writeInt(0);
        }
        parseApp parseapp = this.MediaDescriptionCompat;
        if (parseapp != null) {
            parcel.writeInt(1);
            parseapp.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        access$lambda$6 access_lambda_6 = this.write;
        if (access_lambda_6 != null) {
            parcel.writeInt(1);
            access_lambda_6.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public access$lambda$3(String str, String str2, String str3, String str4, String str5, Double d, access$lambda$1 access_lambda_1, parseApp parseapp, access$lambda$6 access_lambda_6) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaMetadataCompat = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
        this.RatingCompat = str5;
        this.MediaBrowserCompat$MediaItem = d;
        this.MediaBrowserCompat$CustomActionResultReceiver = access_lambda_1;
        this.MediaDescriptionCompat = parseapp;
        this.write = access_lambda_6;
    }
}
