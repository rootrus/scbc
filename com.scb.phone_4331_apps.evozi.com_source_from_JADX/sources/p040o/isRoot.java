package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.isRoot */
public final class isRoot implements Parcelable {
    public static final Parcelable.Creator CREATOR = new isRoot$MediaBrowserCompat$ItemReceiver();
    private final String IconCompatParcelizer;
    private final String read;
    private final String write;

    public isRoot() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isRoot)) {
            return false;
        }
        isRoot isroot = (isRoot) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) isroot.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) isroot.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) isroot.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThirdPartyFooterDisplay(type=");
        sb.append(this.write);
        sb.append(", text=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", image=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
    }

    public isRoot(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "type");
        onGetStartedClick.write((Object) str2, "text");
        onGetStartedClick.write((Object) str3, "image");
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
    }

    private /* synthetic */ isRoot(byte b) {
        this("", "", "");
    }
}
