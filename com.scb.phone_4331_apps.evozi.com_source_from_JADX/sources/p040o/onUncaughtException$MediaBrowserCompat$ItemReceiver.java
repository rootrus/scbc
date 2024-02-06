package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.onUncaughtException$MediaBrowserCompat$ItemReceiver */
public final class onUncaughtException$MediaBrowserCompat$ItemReceiver implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C5105xc5dfadc4();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String RatingCompat;
    public final String read;
    public final Boolean write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onUncaughtException$MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        onUncaughtException$MediaBrowserCompat$ItemReceiver onuncaughtexception_mediabrowsercompat_itemreceiver = (onUncaughtException$MediaBrowserCompat$ItemReceiver) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onuncaughtexception_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onuncaughtexception_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) onuncaughtexception_mediabrowsercompat_itemreceiver.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onuncaughtexception_mediabrowsercompat_itemreceiver.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onuncaughtexception_mediabrowsercompat_itemreceiver.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) onuncaughtexception_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) onuncaughtexception_mediabrowsercompat_itemreceiver.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) onuncaughtexception_mediabrowsercompat_itemreceiver.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onuncaughtexception_mediabrowsercompat_itemreceiver.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.RatingCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaMetadataCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaDescriptionCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        Boolean bool = this.write;
        if (bool != null) {
            i = bool.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BusinessInfo(nameAndAddress=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", contactNumber=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", years=");
        sb.append(this.RatingCompat);
        sb.append(", months=");
        sb.append(this.read);
        sb.append(", industry=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", type=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", registrationNumber=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", storeType=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", premiseOnLease=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z;
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaDescriptionCompat);
        Boolean bool = this.write;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        } else {
            z = false;
        }
        parcel.writeInt(z ? 1 : 0);
    }

    public onUncaughtException$MediaBrowserCompat$ItemReceiver(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool) {
        onGetStartedClick.write((Object) str, "nameAndAddress");
        onGetStartedClick.write((Object) str2, "contactNumber");
        onGetStartedClick.write((Object) str3, "years");
        onGetStartedClick.write((Object) str4, "months");
        onGetStartedClick.write((Object) str5, "industry");
        onGetStartedClick.write((Object) str6, "type");
        onGetStartedClick.write((Object) str8, "storeType");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.RatingCompat = str3;
        this.read = str4;
        this.IconCompatParcelizer = str5;
        this.MediaBrowserCompat$SearchResultReceiver = str6;
        this.MediaMetadataCompat = str7;
        this.MediaDescriptionCompat = str8;
        this.write = bool;
    }
}
