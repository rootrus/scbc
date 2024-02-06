package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.optional  reason: case insensitive filesystem */
public final class C10854optional implements Parcelable {
    public static final Parcelable.Creator CREATOR = new optional$MediaBrowserCompat$CustomActionResultReceiver();
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    private String read;
    public String write;

    public C10854optional() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10854optional)) {
            return false;
        }
        C10854optional optional = (C10854optional) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) optional.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) optional.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) optional.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) optional.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) optional.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThirdPartyHeaderDisplay(txnDateTime=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", txnNote=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", txnRefId=");
        sb.append(this.write);
        sb.append(", txnTitle=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", txnType=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
    }

    public C10854optional(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "txnDateTime");
        onGetStartedClick.write((Object) str2, "txnNote");
        onGetStartedClick.write((Object) str3, "txnRefId");
        onGetStartedClick.write((Object) str4, "txnTitle");
        onGetStartedClick.write((Object) str5, "txnType");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.write = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.read = str5;
    }

    private /* synthetic */ C10854optional(byte b) {
        this("", "", "", "", "");
    }
}
