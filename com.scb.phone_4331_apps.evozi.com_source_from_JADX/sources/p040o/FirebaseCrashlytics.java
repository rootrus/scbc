package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.FirebaseCrashlytics */
public abstract class FirebaseCrashlytics extends getSessionFileProvider implements Parcelable {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String read;

    public int describeContents() {
        return 0;
    }

    /* renamed from: o.FirebaseCrashlytics$1 */
    public final class C33741 extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<C33741> CREATOR = new Parcelable.Creator<C33741>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C33741(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C33741[i];
            }
        };
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String read;

        public final int describeContents() {
            return 0;
        }

        public C33741() {
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.read);
        }

        protected C33741(Parcel parcel) {
            this.IconCompatParcelizer = parcel.readString();
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
            this.read = parcel.readString();
        }
    }

    public FirebaseCrashlytics() {
    }

    protected FirebaseCrashlytics(Parcel parcel) {
        super(parcel);
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
    }
}
