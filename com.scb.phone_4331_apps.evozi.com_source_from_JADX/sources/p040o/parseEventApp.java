package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.parseEventApp */
public final class parseEventApp extends parseSession implements Parcelable {
    public static final Parcelable.Creator<parseEventApp> CREATOR = new Parcelable.Creator<parseEventApp>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new parseEventApp(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new parseEventApp[i];
        }
    };
    public List<parseEventExecutionException> MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public parseEventApp() {
    }

    public final parseEventApp MediaBrowserCompat$CustomActionResultReceiver(parseSession parsesession) {
        if (parsesession instanceof parseEventApp) {
            this.MediaBrowserCompat$ItemReceiver = ((parseEventApp) parsesession).MediaBrowserCompat$ItemReceiver;
        }
        super.read(parsesession);
        return this;
    }

    public parseEventApp(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(parseEventExecutionException.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
    }

    public final /* bridge */ /* synthetic */ parseSession read(parseSession parsesession) {
        if (parsesession instanceof parseEventApp) {
            this.MediaBrowserCompat$ItemReceiver = ((parseEventApp) parsesession).MediaBrowserCompat$ItemReceiver;
        }
        super.read(parsesession);
        return this;
    }
}
