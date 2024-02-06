package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.flushOrLog */
public final class flushOrLog implements Parcelable {
    public static final Parcelable.Creator<flushOrLog> CREATOR = new Parcelable.Creator<flushOrLog>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new flushOrLog(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new flushOrLog[i];
        }
    };
    public extractFieldFromSystemFile IconCompatParcelizer;
    private String MediaBrowserCompat$ItemReceiver;
    private String write;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ flushOrLog(flushOrLog$MediaBrowserCompat$CustomActionResultReceiver flushorlog_mediabrowsercompat_customactionresultreceiver, byte b) {
        this(flushorlog_mediabrowsercompat_customactionresultreceiver);
    }

    private flushOrLog(flushOrLog$MediaBrowserCompat$CustomActionResultReceiver flushorlog_mediabrowsercompat_customactionresultreceiver) {
        this.write = flushorlog_mediabrowsercompat_customactionresultreceiver.read;
        this.MediaBrowserCompat$ItemReceiver = flushorlog_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        this.IconCompatParcelizer = flushorlog_mediabrowsercompat_customactionresultreceiver.write;
    }

    protected flushOrLog(Parcel parcel) {
        this.write = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = (extractFieldFromSystemFile) parcel.readParcelable(extractFieldFromSystemFile.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeParcelable(this.IconCompatParcelizer, i);
    }

    public static flushOrLog$MediaBrowserCompat$CustomActionResultReceiver write() {
        return new flushOrLog$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        flushOrLog flushorlog = (flushOrLog) obj;
        String str = this.write;
        if (str == null ? flushorlog.write != null : !str.equals(flushorlog.write)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? flushorlog.MediaBrowserCompat$ItemReceiver != null : !str2.equals(flushorlog.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        extractFieldFromSystemFile extractfieldfromsystemfile = this.IconCompatParcelizer;
        extractFieldFromSystemFile extractfieldfromsystemfile2 = flushorlog.IconCompatParcelizer;
        if (extractfieldfromsystemfile != null) {
            return extractfieldfromsystemfile.equals(extractfieldfromsystemfile2);
        }
        if (extractfieldfromsystemfile2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        extractFieldFromSystemFile extractfieldfromsystemfile = this.IconCompatParcelizer;
        if (extractfieldfromsystemfile != null) {
            i = extractfieldfromsystemfile.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }
}
