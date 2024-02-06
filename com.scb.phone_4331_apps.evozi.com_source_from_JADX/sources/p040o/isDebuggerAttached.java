package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.isDebuggerAttached */
public final class isDebuggerAttached extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<isDebuggerAttached> CREATOR = new Parcelable.Creator<isDebuggerAttached>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new isDebuggerAttached(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new isDebuggerAttached[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ isDebuggerAttached(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private isDebuggerAttached(IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer.read;
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        this.IconCompatParcelizer = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static IconCompatParcelizer write() {
        return new IconCompatParcelizer((byte) 0);
    }

    /* renamed from: o.isDebuggerAttached$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String read;

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        private IconCompatParcelizer() {
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
    }

    protected isDebuggerAttached(Parcel parcel) {
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        isDebuggerAttached isdebuggerattached = (isDebuggerAttached) obj;
        String str = this.read;
        if (str == null ? isdebuggerattached.read != null : !str.equals(isdebuggerattached.read)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        String str3 = isdebuggerattached.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashSpeedyLoanAccountDisplay{name='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", accountNumber='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
