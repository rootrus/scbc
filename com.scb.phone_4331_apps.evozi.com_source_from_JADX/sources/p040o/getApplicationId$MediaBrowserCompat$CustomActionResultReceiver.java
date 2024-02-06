package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getApplicationId$MediaBrowserCompat$CustomActionResultReceiver */
public final class getApplicationId$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<getApplicationId> {
    private getApplicationId$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ getApplicationId$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new getApplicationId(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new getApplicationId[i];
    }
}
