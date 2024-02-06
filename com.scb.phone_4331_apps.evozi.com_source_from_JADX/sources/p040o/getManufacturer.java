package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.getManufacturer */
public final class getManufacturer implements Parcelable {
    public static final Parcelable.Creator<getManufacturer> CREATOR = new getManufacturer$MediaBrowserCompat$ItemReceiver();
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    public final double MediaBrowserCompat$ItemReceiver;
    public final double write;

    public final int describeContents() {
        return 0;
    }

    public getManufacturer(double d, double d2, double d3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = d;
        this.write = d2;
        this.MediaBrowserCompat$ItemReceiver = d3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public getManufacturer(Parcel parcel) {
        this(parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        onGetStartedClick.write((Object) parcel, "source");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeDouble(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeDouble(this.write);
        parcel.writeDouble(this.MediaBrowserCompat$ItemReceiver);
    }

    /* renamed from: o.getManufacturer$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements newCheckExtractor {
        private final /* synthetic */ getRemoteContext IconCompatParcelizer;
        private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
        private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;
        private final /* synthetic */ int MediaDescriptionCompat;
        private final /* synthetic */ List read;
        private final /* synthetic */ String write;

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(getRemoteContext getremotecontext, List list, int i, List list2, String str, int i2) {
            this.IconCompatParcelizer = getremotecontext;
            this.read = list;
            this.MediaBrowserCompat$ItemReceiver = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = list2;
            this.write = str;
            this.MediaDescriptionCompat = i2;
        }

        public final void IconCompatParcelizer(int i) {
            getRemoteContext getremotecontext = this.IconCompatParcelizer;
            List list = this.read;
            int i2 = this.MediaBrowserCompat$ItemReceiver;
            List list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            String str = this.write;
            int i3 = this.MediaDescriptionCompat;
            if (i < list.size() && i < i2) {
                list2.add(getremotecontext.MediaBrowserCompat$ItemReceiver((getOpacityAtPosition) list.get(i), str, i3 + i));
            }
            if (i == list.size() && i != 0 && i < i2) {
                list2.add(PlaceLikelihoodBuffer.read().MediaBrowserCompat$ItemReceiver(0).write(setLocale.LEARN_MORE).IconCompatParcelizer(i3 + i).mo26268x50fd9e4a(3 - (list.size() % 3)));
            }
        }
    }
}
