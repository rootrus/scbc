package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setBackground */
public final class setBackground implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
    public final setLog MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.setBackground$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new setBackground((setLog) setLog.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i) {
            return new setBackground[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof setBackground) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((setBackground) obj).MediaBrowserCompat$ItemReceiver);
        }
        return true;
    }

    public final int hashCode() {
        setLog setlog = this.MediaBrowserCompat$ItemReceiver;
        if (setlog != null) {
            return setlog.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserAddressDisplay(currentAddress=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        this.MediaBrowserCompat$ItemReceiver.writeToParcel(parcel, 0);
    }

    public setBackground(setLog setlog) {
        onGetStartedClick.write((Object) setlog, "currentAddress");
        this.MediaBrowserCompat$ItemReceiver = setlog;
    }
}
