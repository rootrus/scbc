package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;

/* renamed from: o.setSignal */
public final class setSignal extends AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder {
    public static final Parcelable.Creator<setSignal> CREATOR = new Parcelable.Creator<setSignal>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setSignal(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setSignal[i];
        }
    };
    public String read;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ setSignal(setSignal$MediaBrowserCompat$CustomActionResultReceiver setsignal_mediabrowsercompat_customactionresultreceiver, byte b) {
        this(setsignal_mediabrowsercompat_customactionresultreceiver);
    }

    private setSignal(setSignal$MediaBrowserCompat$CustomActionResultReceiver setsignal_mediabrowsercompat_customactionresultreceiver) {
        read(false);
        this.f2675x50fd9e4a = setsignal_mediabrowsercompat_customactionresultreceiver.read;
        this.read = setsignal_mediabrowsercompat_customactionresultreceiver.write;
    }

    public static setSignal$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer() {
        return new setSignal$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.read;
        String str2 = ((setSignal) obj).read;
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
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeByte(this.MediaSessionCompat$Token ? (byte) 1 : 0);
        parcel.writeInt(this.f2675x50fd9e4a);
    }

    protected setSignal(Parcel parcel) {
        this.read = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readByte() != 0;
        this.f2675x50fd9e4a = parcel.readInt();
    }
}
