package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.parseNdkPayload */
public final class parseNdkPayload extends removeDependent implements Parcelable {
    public static final Parcelable.Creator<parseNdkPayload> CREATOR = new Parcelable.Creator<parseNdkPayload>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new parseNdkPayload(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new parseNdkPayload[i];
        }
    };
    public String MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ parseNdkPayload(Parcel parcel, byte b) {
        this(parcel);
    }

    public parseNdkPayload() {
    }

    private parseNdkPayload(Parcel parcel) {
        super((byte) 0);
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.MediaBrowserCompat$ItemReceiver;
        String str2 = ((parseNdkPayload) obj).MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PromptPayCitizenIdDisplay{id='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
