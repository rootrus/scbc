package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.setTitleMarginBottom;

public class Toolbar$MediaBrowserCompat$ItemReceiver extends setTitleMarginBottom {
    public static final Parcelable.Creator<Toolbar$MediaBrowserCompat$ItemReceiver> CREATOR = new Parcelable.ClassLoaderCreator<Toolbar$MediaBrowserCompat$ItemReceiver>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Toolbar$MediaBrowserCompat$ItemReceiver(parcel, (ClassLoader) null);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new Toolbar$MediaBrowserCompat$ItemReceiver(parcel, classLoader);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Toolbar$MediaBrowserCompat$ItemReceiver[i];
        }
    };
    boolean IconCompatParcelizer;
    int MediaBrowserCompat$ItemReceiver;

    public Toolbar$MediaBrowserCompat$ItemReceiver(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.MediaBrowserCompat$ItemReceiver = parcel.readInt();
        this.IconCompatParcelizer = parcel.readInt() != 0;
    }

    public Toolbar$MediaBrowserCompat$ItemReceiver(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
    }
}
