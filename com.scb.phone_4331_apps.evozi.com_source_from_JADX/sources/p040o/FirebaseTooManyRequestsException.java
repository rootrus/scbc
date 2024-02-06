package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.FirebaseTooManyRequestsException */
public class FirebaseTooManyRequestsException implements Parcelable {
    public static final IconCompatParcelizer CREATOR = new IconCompatParcelizer((byte) 0);
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public List<getApplicationId> MediaDescriptionCompat;
    public String MediaMetadataCompat;

    public int describeContents() {
        return 0;
    }

    public FirebaseTooManyRequestsException() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FirebaseTooManyRequestsException(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaDescriptionCompat = parcel.createTypedArrayList(getApplicationId.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeTypedList(this.MediaDescriptionCompat);
    }

    /* renamed from: o.FirebaseTooManyRequestsException$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator<FirebaseTooManyRequestsException> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new FirebaseTooManyRequestsException(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FirebaseTooManyRequestsException[i];
        }
    }
}
