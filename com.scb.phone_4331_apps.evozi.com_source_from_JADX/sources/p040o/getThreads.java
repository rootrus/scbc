package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;

/* renamed from: o.getThreads */
public final class getThreads extends AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder {
    public static final Parcelable.Creator<getThreads> CREATOR = new Parcelable.Creator<getThreads>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getThreads(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getThreads[i];
        }
    };
    public String MediaBrowserCompat$CustomActionResultReceiver;
    private String write;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ getThreads(getThreads$MediaBrowserCompat$CustomActionResultReceiver getthreads_mediabrowsercompat_customactionresultreceiver, byte b) {
        this(getthreads_mediabrowsercompat_customactionresultreceiver);
    }

    private getThreads(getThreads$MediaBrowserCompat$CustomActionResultReceiver getthreads_mediabrowsercompat_customactionresultreceiver) {
        read(false);
        this.f2675x50fd9e4a = getthreads_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = getthreads_mediabrowsercompat_customactionresultreceiver.read;
        this.write = null;
    }

    public static getThreads$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver() {
        return new getThreads$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getThreads getthreads = (getThreads) obj;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? getthreads.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(getthreads.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.write;
        String str3 = getthreads.write;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
        parcel.writeByte(this.MediaSessionCompat$Token ? (byte) 1 : 0);
        parcel.writeInt(this.f2675x50fd9e4a);
    }

    protected getThreads(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.write = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readByte() != 0;
        this.f2675x50fd9e4a = parcel.readInt();
    }
}
