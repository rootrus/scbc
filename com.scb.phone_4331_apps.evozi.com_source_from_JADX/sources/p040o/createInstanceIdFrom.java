package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.createInstanceIdFrom */
public final class createInstanceIdFrom implements Parcelable {
    public static final Parcelable.Creator<createInstanceIdFrom> CREATOR = new Parcelable.Creator<createInstanceIdFrom>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new createInstanceIdFrom(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new createInstanceIdFrom[i];
        }
    };
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    private String read;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ createInstanceIdFrom(write write2, byte b) {
        this(write2);
    }

    private createInstanceIdFrom(write write2) {
        this.read = write2.write;
        this.MediaBrowserCompat$ItemReceiver = write2.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = write2.read;
    }

    public static write MediaBrowserCompat$CustomActionResultReceiver() {
        return new write((byte) 0);
    }

    protected createInstanceIdFrom(Parcel parcel) {
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* renamed from: o.createInstanceIdFrom$write */
    public static final class write {
        public String MediaBrowserCompat$ItemReceiver;
        public String read;
        public String write;

        /* synthetic */ write(byte b) {
            this();
        }

        private write() {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        createInstanceIdFrom createinstanceidfrom = (createInstanceIdFrom) obj;
        String str = this.read;
        if (str == null ? createinstanceidfrom.read != null : !str.equals(createinstanceidfrom.read)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? createinstanceidfrom.MediaBrowserCompat$ItemReceiver != null : !str2.equals(createinstanceidfrom.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str4 = createinstanceidfrom.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }
}
