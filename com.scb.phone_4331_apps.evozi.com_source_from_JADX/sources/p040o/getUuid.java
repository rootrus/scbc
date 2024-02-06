package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;

/* renamed from: o.getUuid */
public final class getUuid extends AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder {
    public static final Parcelable.Creator<getUuid> CREATOR = new Parcelable.Creator<getUuid>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getUuid(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getUuid[i];
        }
    };
    public String write;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ getUuid(getUuid$MediaBrowserCompat$ItemReceiver getuuid_mediabrowsercompat_itemreceiver, byte b) {
        this(getuuid_mediabrowsercompat_itemreceiver);
    }

    private getUuid(getUuid$MediaBrowserCompat$ItemReceiver getuuid_mediabrowsercompat_itemreceiver) {
        read(getuuid_mediabrowsercompat_itemreceiver.read);
        this.f2675x50fd9e4a = getuuid_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
        this.write = getuuid_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static getUuid$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver() {
        return new getUuid$MediaBrowserCompat$ItemReceiver((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.write;
        String str2 = ((getUuid) obj).write;
        if (str != null) {
            if (!str.equals(str2)) {
                return true;
            }
        } else if (str2 != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.write;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.write);
        parcel.writeByte(this.MediaSessionCompat$Token ? (byte) 1 : 0);
        parcel.writeInt(this.f2675x50fd9e4a);
    }

    protected getUuid(Parcel parcel) {
        this.write = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readByte() != 0;
        this.f2675x50fd9e4a = parcel.readInt();
    }
}
