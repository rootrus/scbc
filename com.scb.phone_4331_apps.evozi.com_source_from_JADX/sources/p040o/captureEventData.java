package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.captureEventData */
public final class captureEventData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new captureEventData$MediaBrowserCompat$CustomActionResultReceiver();
    public List<String> MediaBrowserCompat$CustomActionResultReceiver;
    public List<String> MediaBrowserCompat$ItemReceiver;
    public List<String> write;

    public captureEventData() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeStringList(this.write);
        parcel.writeStringList(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeStringList(this.MediaBrowserCompat$ItemReceiver);
    }

    public captureEventData(List<String> list, List<String> list2, List<String> list3) {
        this.write = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = list2;
        this.MediaBrowserCompat$ItemReceiver = list3;
    }

    public /* synthetic */ captureEventData(byte b) {
        this(new ArrayList(), new ArrayList(), new ArrayList());
    }
}
