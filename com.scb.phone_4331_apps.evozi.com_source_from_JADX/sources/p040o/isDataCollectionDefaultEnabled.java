package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.isDataCollectionDefaultEnabled */
public final class isDataCollectionDefaultEnabled implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4816x7253351f();
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    private boolean MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String RatingCompat;
    public String read;
    public String write;

    public isDataCollectionDefaultEnabled() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isDataCollectionDefaultEnabled)) {
            return false;
        }
        isDataCollectionDefaultEnabled isdatacollectiondefaultenabled = (isDataCollectionDefaultEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) isdatacollectiondefaultenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) isdatacollectiondefaultenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) isdatacollectiondefaultenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) isdatacollectiondefaultenabled.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) isdatacollectiondefaultenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) isdatacollectiondefaultenabled.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) isdatacollectiondefaultenabled.RatingCompat) && this.MediaDescriptionCompat == isdatacollectiondefaultenabled.MediaDescriptionCompat;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaMetadataCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.RatingCompat;
        if (str7 != null) {
            i = str7.hashCode();
        }
        boolean z = this.MediaDescriptionCompat;
        if (z) {
            z = true;
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantConfirmationDetail(statusCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", statusDescription=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", merchantName=");
        sb.append(this.write);
        sb.append(", monthlyPayment=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", currAmount=");
        sb.append(this.read);
        sb.append(", totalPayment=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", totalInterest=");
        sb.append(this.RatingCompat);
        sb.append(", success=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.RatingCompat);
        parcel.writeInt(this.MediaDescriptionCompat ? 1 : 0);
    }

    public isDataCollectionDefaultEnabled(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.write = str3;
        this.IconCompatParcelizer = str4;
        this.read = str5;
        this.MediaMetadataCompat = str6;
        this.RatingCompat = str7;
        this.MediaDescriptionCompat = z;
    }

    public /* synthetic */ isDataCollectionDefaultEnabled(byte b) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
    }
}
