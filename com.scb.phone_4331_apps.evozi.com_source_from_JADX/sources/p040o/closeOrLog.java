package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.closeOrLog */
public final class closeOrLog implements Parcelable {
    public static final Parcelable.Creator<closeOrLog> CREATOR = new Parcelable.Creator<closeOrLog>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new closeOrLog(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new closeOrLog[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ closeOrLog(closeOrLog$MediaBrowserCompat$ItemReceiver closeorlog_mediabrowsercompat_itemreceiver, byte b) {
        this(closeorlog_mediabrowsercompat_itemreceiver);
    }

    protected closeOrLog(Parcel parcel) {
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }

    private closeOrLog(closeOrLog$MediaBrowserCompat$ItemReceiver closeorlog_mediabrowsercompat_itemreceiver) {
        this.write = closeorlog_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
        this.IconCompatParcelizer = closeorlog_mediabrowsercompat_itemreceiver.write;
        this.MediaBrowserCompat$ItemReceiver = closeorlog_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        closeOrLog closeorlog = (closeOrLog) obj;
        String str = this.write;
        if (str == null ? closeorlog.write == null : str.equals(closeorlog.write)) {
            String str2 = this.IconCompatParcelizer;
            if (str2 == null ? closeorlog.IconCompatParcelizer == null : str2.equals(closeorlog.IconCompatParcelizer)) {
                String str3 = this.MediaBrowserCompat$ItemReceiver;
                if (str3 != null) {
                    if (!str3.equals(closeorlog.MediaBrowserCompat$ItemReceiver)) {
                        return true;
                    }
                } else if (closeorlog.MediaBrowserCompat$ItemReceiver != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.write;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return (((i * 31) + i2) * 31) + i3;
    }
}
