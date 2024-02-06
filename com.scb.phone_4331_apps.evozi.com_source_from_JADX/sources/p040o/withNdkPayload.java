package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.withNdkPayload */
public class withNdkPayload implements Parcelable {
    public static final Parcelable.Creator<withNdkPayload> CREATOR = new Parcelable.Creator<withNdkPayload>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new withNdkPayload(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new withNdkPayload[i];
        }
    };
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ withNdkPayload(Parcel parcel, byte b) {
        this(parcel);
    }

    public withNdkPayload(String str, String str2) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }

    private withNdkPayload(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        withNdkPayload withndkpayload = (withNdkPayload) obj;
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str == null ? withndkpayload.MediaBrowserCompat$ItemReceiver == null : str.equals(withndkpayload.MediaBrowserCompat$ItemReceiver)) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.equals(withndkpayload.MediaBrowserCompat$CustomActionResultReceiver);
        }
        return false;
    }

    public int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        return ((str != null ? str.hashCode() : 0) * 31) + this.MediaBrowserCompat$CustomActionResultReceiver.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GiftStatusDisplay{description='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", type='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
