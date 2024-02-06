package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.reportToJson */
public final class reportToJson implements Parcelable {
    public static final Parcelable.Creator CREATOR = new reportToJson$MediaBrowserCompat$CustomActionResultReceiver();
    public final String IconCompatParcelizer;
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final animateCameraWithCallback MediaDescriptionCompat;
    public final IGoogleMapDelegate RatingCompat;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof reportToJson)) {
            return false;
        }
        reportToJson reporttojson = (reportToJson) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) reporttojson.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) reporttojson.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) reporttojson.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) reporttojson.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) reporttojson.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) reporttojson.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) reporttojson.read) && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, reporttojson.MediaBrowserCompat$CustomActionResultReceiver) == 0;
    }

    public final int hashCode() {
        IGoogleMapDelegate iGoogleMapDelegate = this.RatingCompat;
        int i = 0;
        int hashCode = iGoogleMapDelegate != null ? iGoogleMapDelegate.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        animateCameraWithCallback animatecamerawithcallback = this.MediaDescriptionCompat;
        int hashCode4 = animatecamerawithcallback != null ? animatecamerawithcallback.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode6 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        if (str5 != null) {
            i = str5.hashCode();
        }
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i) * 31) + ((int) ((doubleToLongBits >>> 32) ^ doubleToLongBits));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransferGiftingInputDisplay(transferType=");
        sb.append(this.RatingCompat);
        sb.append(", accountFrom=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountTo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", promptPayType=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", promptPayID=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", accountToBankCode=");
        sb.append(this.write);
        sb.append(", favoriteName=");
        sb.append(this.read);
        sb.append(", amount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.RatingCompat.name());
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        animateCameraWithCallback animatecamerawithcallback = this.MediaDescriptionCompat;
        if (animatecamerawithcallback != null) {
            parcel.writeInt(1);
            parcel.writeString(animatecamerawithcallback.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeDouble(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public reportToJson(IGoogleMapDelegate iGoogleMapDelegate, String str, String str2, animateCameraWithCallback animatecamerawithcallback, String str3, String str4, String str5, double d) {
        onGetStartedClick.write((Object) iGoogleMapDelegate, "transferType");
        onGetStartedClick.write((Object) str, "accountFrom");
        this.RatingCompat = iGoogleMapDelegate;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
        this.MediaDescriptionCompat = animatecamerawithcallback;
        this.MediaBrowserCompat$MediaItem = str3;
        this.write = str4;
        this.read = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = d;
    }
}
