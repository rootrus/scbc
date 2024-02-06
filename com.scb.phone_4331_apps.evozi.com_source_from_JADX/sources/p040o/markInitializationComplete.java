package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.CrashlyticsCore;
import p040o.Utils;

/* renamed from: o.markInitializationComplete */
public final class markInitializationComplete extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<markInitializationComplete> CREATOR = new Parcelable.Creator<markInitializationComplete>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new markInitializationComplete(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new markInitializationComplete[i];
        }
    };
    public List<migrateLegacyId> IconCompatParcelizer;
    public List<CrashlyticsCore.C32473> MediaBrowserCompat$CustomActionResultReceiver;
    public List<doBackgroundInitializationAsync> MediaBrowserCompat$ItemReceiver;
    public List<CrashlyticsCore.C32473> MediaDescriptionCompat;
    public CrashlyticsCore.C32441 MediaMetadataCompat;
    public CrashlyticsCore.C32515 RatingCompat;
    public List<Utils.C39334> read;

    public final int describeContents() {
        return 0;
    }

    public static markInitializationComplete write() {
        return new markInitializationComplete();
    }

    public markInitializationComplete() {
    }

    protected markInitializationComplete(Parcel parcel) {
        this.RatingCompat = CrashlyticsCore.C32515.CREATOR.createFromParcel(parcel);
        this.MediaMetadataCompat = CrashlyticsCore.C32441.CREATOR.createFromParcel(parcel);
        this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(doBackgroundInitializationAsync.CREATOR);
        this.MediaDescriptionCompat = parcel.createTypedArrayList(CrashlyticsCore.C32473.CREATOR);
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.createTypedArrayList(CrashlyticsCore.C32473.CREATOR);
        this.IconCompatParcelizer = parcel.createTypedArrayList(migrateLegacyId.CREATOR);
        this.read = parcel.createTypedArrayList(Utils.C39334.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.RatingCompat, i);
        parcel.writeParcelable(this.MediaMetadataCompat, i);
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeTypedList(this.MediaDescriptionCompat);
        parcel.writeTypedList(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeTypedList(this.IconCompatParcelizer);
        parcel.writeTypedList(this.read);
    }
}
