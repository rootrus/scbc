package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.FirebaseOptions$MediaBrowserCompat$CustomActionResultReceiver */
public final class FirebaseOptions$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<FirebaseOptions> {
    private FirebaseOptions$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ FirebaseOptions$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new FirebaseOptions(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FirebaseOptions[i];
    }
}
