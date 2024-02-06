package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.grantDataCollectionPermission */
public final class grantDataCollectionPermission implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public final String read;

    /* renamed from: o.grantDataCollectionPermission$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new grantDataCollectionPermission(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new grantDataCollectionPermission[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof grantDataCollectionPermission) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((grantDataCollectionPermission) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TopTagDisplay(title=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.read);
    }

    public grantDataCollectionPermission(String str) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        this.read = str;
    }
}
