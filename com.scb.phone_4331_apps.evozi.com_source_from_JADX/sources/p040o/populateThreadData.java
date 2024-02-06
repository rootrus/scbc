package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.populateThreadData */
public final class populateThreadData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new populateThreadData$MediaBrowserCompat$CustomActionResultReceiver();
    public String IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public List<populateSessionData> MediaBrowserCompat$ItemReceiver = HmlNationalIdActivity.IconCompatParcelizer;
    public String MediaBrowserCompat$MediaItem;
    public Integer MediaBrowserCompat$SearchResultReceiver;
    public HmlVerifyEmailSuccessfulActivity<String, String> MediaDescriptionCompat;
    public boolean read = true;
    public HmlVerifyEmailSuccessfulActivity<String, String> write;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(1);
    }
}
