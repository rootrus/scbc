package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.closeWithoutRenamingOrLog */
public final class closeWithoutRenamingOrLog implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public final String IconCompatParcelizer;

    /* renamed from: o.closeWithoutRenamingOrLog$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new closeWithoutRenamingOrLog(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new closeWithoutRenamingOrLog[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof closeWithoutRenamingOrLog) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((closeWithoutRenamingOrLog) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItemDisplay(text=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
    }

    public closeWithoutRenamingOrLog(String str) {
        onGetStartedClick.write((Object) str, "text");
        this.IconCompatParcelizer = str;
    }
}
