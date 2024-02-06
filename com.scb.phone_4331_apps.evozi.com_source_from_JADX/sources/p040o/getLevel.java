package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.List;

/* renamed from: o.getLevel */
public final class getLevel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new getLevel$MediaBrowserCompat$ItemReceiver();
    public final List<RestrictedComponentContainer> IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final publish MediaDescriptionCompat;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver ? 1 : 0);
        parcel.writeParcelable(this.MediaDescriptionCompat, i);
        List<RestrictedComponentContainer> list = this.IconCompatParcelizer;
        parcel.writeInt(list.size());
        for (RestrictedComponentContainer writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.write);
    }

    public getLevel(String str, String str2, boolean z, publish publish, List<? extends RestrictedComponentContainer> list, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "sortSequence");
        onGetStartedClick.write((Object) str2, "productType");
        onGetStartedClick.write((Object) publish, "sliderDisplay");
        onGetStartedClick.write((Object) list, ProductAction.ACTION_DETAIL);
        onGetStartedClick.write((Object) str4, "logo");
        onGetStartedClick.write((Object) str5, "productName");
        this.MediaBrowserCompat$MediaItem = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaBrowserCompat$ItemReceiver = z;
        this.MediaDescriptionCompat = publish;
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$SearchResultReceiver = str3;
        this.read = str4;
        this.write = str5;
    }
}
