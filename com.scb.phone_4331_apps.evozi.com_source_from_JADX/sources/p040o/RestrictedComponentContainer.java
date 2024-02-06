package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.RestrictedComponentContainer */
public class RestrictedComponentContainer implements Parcelable {
    public static final Parcelable.Creator<RestrictedComponentContainer> CREATOR = new Parcelable.Creator<RestrictedComponentContainer>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new RestrictedComponentContainer(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RestrictedComponentContainer[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    private boolean MediaBrowserCompat$MediaItem;
    public List<C3758xd990f62c> read;
    public String write;

    public int describeContents() {
        return 0;
    }

    /* renamed from: o.RestrictedComponentContainer$RestrictedPublisher */
    public final class RestrictedPublisher implements Parcelable {
        public static final Parcelable.Creator<RestrictedPublisher> CREATOR = new Parcelable.Creator<RestrictedPublisher>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new RestrictedPublisher(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new RestrictedPublisher[i];
            }
        };
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public boolean MediaBrowserCompat$ItemReceiver;
        public String read;

        public final int describeContents() {
            return 0;
        }

        public RestrictedPublisher() {
        }

        protected RestrictedPublisher(Parcel parcel) {
            this.MediaBrowserCompat$ItemReceiver = parcel.readByte() != 0;
            this.read = parcel.readString();
            this.IconCompatParcelizer = parcel.readString();
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.MediaBrowserCompat$ItemReceiver ? (byte) 1 : 0);
            parcel.writeString(this.read);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public RestrictedComponentContainer(String str, String str2, List<C3758xd990f62c> list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = "overview";
        this.MediaBrowserCompat$MediaItem = false;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = list;
    }

    public RestrictedComponentContainer(String str, List<C3758xd990f62c> list) {
        this(str, "", list);
    }

    protected RestrictedComponentContainer(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = "overview";
        boolean z = false;
        this.MediaBrowserCompat$MediaItem = false;
        this.MediaBrowserCompat$MediaItem = parcel.readByte() != 0 ? true : z;
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.write = parcel.readString();
        this.read = parcel.createTypedArrayList(C3758xd990f62c.CREATOR);
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.MediaBrowserCompat$MediaItem ? (byte) 1 : 0);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.write);
        parcel.writeTypedList(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public RestrictedComponentContainer(String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = "overview";
        this.MediaBrowserCompat$MediaItem = false;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}
