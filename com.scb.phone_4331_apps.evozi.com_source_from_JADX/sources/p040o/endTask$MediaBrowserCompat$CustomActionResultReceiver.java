package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.endTask$MediaBrowserCompat$CustomActionResultReceiver */
public final class endTask$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<endTask> {
    private endTask$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ endTask$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new endTask(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new endTask[i];
    }
}
