package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.CrashlyticsFileMarker */
public class CrashlyticsFileMarker implements Parcelable {
    public static final Parcelable.Creator<CrashlyticsFileMarker> CREATOR = new Parcelable.Creator<CrashlyticsFileMarker>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CrashlyticsFileMarker(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CrashlyticsFileMarker[i];
        }
    };
    public int IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaMetadataCompat;
    public int read;
    public String write;

    public int describeContents() {
        return 0;
    }

    public /* synthetic */ CrashlyticsFileMarker(C3254x99ffbafc crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver, byte b) {
        this(crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver);
    }

    private CrashlyticsFileMarker(C3254x99ffbafc crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver) {
        this.read = crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver.read;
        this.IconCompatParcelizer = crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        this.MediaMetadataCompat = crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat;
        this.write = crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        this.MediaBrowserCompat$SearchResultReceiver = crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver;
        this.MediaBrowserCompat$ItemReceiver = crashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver.write;
    }

    protected CrashlyticsFileMarker(Parcel parcel) {
        this.read = parcel.readInt();
        this.IconCompatParcelizer = parcel.readInt();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.read);
        parcel.writeInt(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }
}
