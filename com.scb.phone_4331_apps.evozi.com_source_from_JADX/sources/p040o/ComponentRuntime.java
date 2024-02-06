package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ComponentRuntime */
public final class ComponentRuntime implements Parcelable {
    public static final ComponentRuntime$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new ComponentRuntime$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
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
        if (!(obj instanceof ComponentRuntime)) {
            return false;
        }
        ComponentRuntime componentRuntime = (ComponentRuntime) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) componentRuntime.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) componentRuntime.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) componentRuntime.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) componentRuntime.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) componentRuntime.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SourceOfFundPaymentInfoDisplay(type=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", title=");
        sb.append(this.write);
        sb.append(", header=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", description=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", imageURL=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public ComponentRuntime(String str, String str2, String str3, String str4, String str5) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.IconCompatParcelizer = str4;
        this.read = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ComponentRuntime(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
    }
}
