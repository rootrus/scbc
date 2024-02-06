package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.parseReport */
public final class parseReport implements Parcelable {
    public static final Parcelable.Creator<parseReport> CREATOR = new Parcelable.Creator<parseReport>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new parseReport(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new parseReport[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.parseReport$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String read;
    }

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ parseReport(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private parseReport(IconCompatParcelizer iconCompatParcelizer) {
        this.IconCompatParcelizer = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.read;
    }

    protected parseReport(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }
}
