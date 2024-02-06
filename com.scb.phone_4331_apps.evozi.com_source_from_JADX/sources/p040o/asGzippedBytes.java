package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.asGzippedBytes */
public final class asGzippedBytes extends BackgroundPriorityRunnable {
    public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaMetadataCompat;

    /* renamed from: o.asGzippedBytes$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            if (parcel.readInt() != 0) {
                return new asGzippedBytes();
            }
            return null;
        }

        public final Object[] newArray(int i) {
            return new asGzippedBytes[i];
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(1);
    }
}
