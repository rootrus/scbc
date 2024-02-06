package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;

/* renamed from: o.setBinaries */
public final class setBinaries extends AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder {
    public static final Parcelable.Creator<setBinaries> CREATOR = new Parcelable.Creator<setBinaries>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setBinaries(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setBinaries[i];
        }
    };
    public boolean IconCompatParcelizer;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ setBinaries(setBinaries$MediaBrowserCompat$CustomActionResultReceiver setbinaries_mediabrowsercompat_customactionresultreceiver, byte b) {
        this(setbinaries_mediabrowsercompat_customactionresultreceiver);
    }

    private setBinaries(setBinaries$MediaBrowserCompat$CustomActionResultReceiver setbinaries_mediabrowsercompat_customactionresultreceiver) {
        read(false);
        this.f2675x50fd9e4a = setbinaries_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        this.IconCompatParcelizer = setbinaries_mediabrowsercompat_customactionresultreceiver.write;
    }

    public static setBinaries$MediaBrowserCompat$CustomActionResultReceiver write() {
        return new setBinaries$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.IconCompatParcelizer != ((setBinaries) obj).IconCompatParcelizer) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer ? 1 : 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.IconCompatParcelizer ? (byte) 1 : 0);
        parcel.writeByte(this.MediaSessionCompat$Token ? (byte) 1 : 0);
        parcel.writeInt(this.f2675x50fd9e4a);
    }

    protected setBinaries(Parcel parcel) {
        boolean z = true;
        this.IconCompatParcelizer = parcel.readByte() != 0;
        this.MediaSessionCompat$Token = parcel.readByte() == 0 ? false : z;
        this.f2675x50fd9e4a = parcel.readInt();
    }
}
