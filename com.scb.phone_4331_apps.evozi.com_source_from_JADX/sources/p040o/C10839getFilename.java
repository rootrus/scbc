package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getFilename  reason: case insensitive filesystem */
public final class C10839getFilename implements Parcelable {
    public static final Parcelable.Creator CREATOR = new getFilename$MediaBrowserCompat$CustomActionResultReceiver();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10839getFilename)) {
            return false;
        }
        C10839getFilename getfilename = (C10839getFilename) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getfilename.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getfilename.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getfilename.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getfilename.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getfilename.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TouchPointCidInputDisplay(cid=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", mobileNumber=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", touchPointName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", touchPointLogoPath=");
        sb.append(this.write);
        sb.append(", touchPointFacialRequiredFlag=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.read);
    }

    public C10839getFilename(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "cid");
        onGetStartedClick.write((Object) str2, "mobileNumber");
        onGetStartedClick.write((Object) str3, "touchPointName");
        onGetStartedClick.write((Object) str4, "touchPointLogoPath");
        onGetStartedClick.write((Object) str5, "touchPointFacialRequiredFlag");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.write = str4;
        this.read = str5;
    }
}
