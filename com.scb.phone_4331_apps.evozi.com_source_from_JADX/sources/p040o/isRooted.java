package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.isRooted */
public final class isRooted extends canTryConnection implements Parcelable {
    public static final Parcelable.Creator<isRooted> CREATOR = new Parcelable.Creator<isRooted>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new isRooted(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new isRooted[i];
        }
    };
    public List<extractFieldFromSystemFile> RatingCompat;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ isRooted(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private isRooted(IconCompatParcelizer iconCompatParcelizer) {
        super((canTryConnection$MediaBrowserCompat$ItemReceiver<?>) iconCompatParcelizer);
        this.RatingCompat = iconCompatParcelizer.MediaBrowserCompat$MediaItem;
    }

    protected isRooted(Parcel parcel) {
        super(parcel);
        this.RatingCompat = parcel.createTypedArrayList(extractFieldFromSystemFile.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.RatingCompat);
    }

    public static IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver() {
        return new IconCompatParcelizer();
    }

    /* renamed from: o.isRooted$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends canTryConnection$MediaBrowserCompat$ItemReceiver<IconCompatParcelizer> {
        public List<extractFieldFromSystemFile> MediaBrowserCompat$MediaItem;

        protected IconCompatParcelizer() {
        }
    }
}
