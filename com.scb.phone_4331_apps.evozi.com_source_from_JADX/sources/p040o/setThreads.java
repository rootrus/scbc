package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;

/* renamed from: o.setThreads */
public final class setThreads extends AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder {
    public static final Parcelable.Creator<setThreads> CREATOR = new Parcelable.Creator<setThreads>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setThreads(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setThreads[i];
        }
    };
    public String IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ setThreads(setThreads$MediaBrowserCompat$ItemReceiver setthreads_mediabrowsercompat_itemreceiver, byte b) {
        this(setthreads_mediabrowsercompat_itemreceiver);
    }

    private setThreads(setThreads$MediaBrowserCompat$ItemReceiver setthreads_mediabrowsercompat_itemreceiver) {
        read(false);
        this.f2675x50fd9e4a = setthreads_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = setthreads_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
        this.read = setthreads_mediabrowsercompat_itemreceiver.read;
        this.MediaBrowserCompat$ItemReceiver = false;
    }

    public static setThreads$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver() {
        return new setThreads$MediaBrowserCompat$ItemReceiver((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setThreads setthreads = (setThreads) obj;
        if (this.MediaBrowserCompat$ItemReceiver != setthreads.MediaBrowserCompat$ItemReceiver) {
            return false;
        }
        String str = this.IconCompatParcelizer;
        if (str == null ? setthreads.IconCompatParcelizer != null : !str.equals(setthreads.IconCompatParcelizer)) {
            return false;
        }
        String str2 = this.read;
        String str3 = setthreads.read;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + i) * 31) + (this.MediaBrowserCompat$ItemReceiver ? 1 : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeByte(this.MediaBrowserCompat$ItemReceiver ? (byte) 1 : 0);
        parcel.writeByte(this.MediaSessionCompat$Token ? (byte) 1 : 0);
        parcel.writeInt(this.f2675x50fd9e4a);
    }

    public setThreads() {
    }

    protected setThreads(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readString();
        boolean z = true;
        this.MediaBrowserCompat$ItemReceiver = parcel.readByte() != 0;
        this.MediaSessionCompat$Token = parcel.readByte() == 0 ? false : z;
        this.f2675x50fd9e4a = parcel.readInt();
    }
}
