package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.writeNonFatalEventsTo$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5459xac62f5d7 implements Parcelable.Creator<writeNonFatalEventsTo> {
    private C5459xac62f5d7() {
    }

    public /* synthetic */ C5459xac62f5d7(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new writeNonFatalEventsTo(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new writeNonFatalEventsTo[i];
    }
}
