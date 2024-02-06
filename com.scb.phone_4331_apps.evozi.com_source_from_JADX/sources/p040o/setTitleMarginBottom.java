package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setTitleMarginBottom */
public abstract class setTitleMarginBottom implements Parcelable {
    public static final Parcelable.Creator<setTitleMarginBottom> CREATOR = new Parcelable.ClassLoaderCreator<setTitleMarginBottom>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable((ClassLoader) null) == null) {
                return setTitleMarginBottom.MediaBrowserCompat$CustomActionResultReceiver;
            }
            throw new IllegalStateException("superState must be null");
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return setTitleMarginBottom.MediaBrowserCompat$CustomActionResultReceiver;
            }
            throw new IllegalStateException("superState must be null");
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setTitleMarginBottom[i];
        }
    };
    public static final setTitleMarginBottom MediaBrowserCompat$CustomActionResultReceiver = new setTitleMarginBottom() {
    };
    public final Parcelable write;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ setTitleMarginBottom(byte b) {
        this();
    }

    private setTitleMarginBottom() {
        this.write = null;
    }

    public setTitleMarginBottom(Parcelable parcelable) {
        if (parcelable != null) {
            this.write = parcelable == MediaBrowserCompat$CustomActionResultReceiver ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public setTitleMarginBottom(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.write = readParcelable == null ? MediaBrowserCompat$CustomActionResultReceiver : readParcelable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.write, i);
    }
}
