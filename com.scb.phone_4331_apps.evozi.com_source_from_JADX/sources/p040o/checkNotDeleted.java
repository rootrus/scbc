package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.checkNotDeleted */
public class checkNotDeleted implements Parcelable {
    public static final Parcelable.Creator<checkNotDeleted> CREATOR = new IconCompatParcelizer();
    private final double IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final double MediaBrowserCompat$ItemReceiver;
    private final double MediaBrowserCompat$MediaItem;
    private final String read;
    private final double write;

    public int describeContents() {
        return 0;
    }

    public checkNotDeleted(String str, String str2, double d, double d2, double d3, double d4) {
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaBrowserCompat$MediaItem = d;
        this.MediaBrowserCompat$ItemReceiver = d2;
        this.write = d3;
        this.IconCompatParcelizer = d4;
    }

    public String write() {
        return this.read;
    }

    public String IconCompatParcelizer() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public double MediaBrowserCompat$SearchResultReceiver() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public double read() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public double MediaBrowserCompat$CustomActionResultReceiver() {
        return this.write;
    }

    public double MediaBrowserCompat$ItemReceiver() {
        return this.IconCompatParcelizer;
    }

    /* renamed from: o.checkNotDeleted$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator<checkNotDeleted> {
        IconCompatParcelizer() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new checkNotDeleted(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new checkNotDeleted[i];
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public checkNotDeleted(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(write());
        parcel.writeString(IconCompatParcelizer());
        parcel.writeDouble(MediaBrowserCompat$SearchResultReceiver());
        parcel.writeDouble(read());
        parcel.writeDouble(MediaBrowserCompat$CustomActionResultReceiver());
        parcel.writeDouble(MediaBrowserCompat$ItemReceiver());
    }
}
