package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.CrashlyticsReport;

/* renamed from: o.parseEventExecution */
public class parseEventExecution implements Parcelable {
    public static final Parcelable.Creator<parseEventExecution> CREATOR = new Parcelable.Creator<parseEventExecution>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new parseEventExecution(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new parseEventExecution[i];
        }
    };
    public CrashlyticsReport.Session.Application IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String ParcelableVolumeInfo;
    public String RatingCompat;
    public String read;
    public String write;

    public int describeContents() {
        return 0;
    }

    public parseEventExecution() {
    }

    protected parseEventExecution(Parcel parcel) {
        this.RatingCompat = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.write = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.IconCompatParcelizer = (CrashlyticsReport.Session.Application) parcel.readParcelable(CrashlyticsReport.Session.Application.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeParcelable(this.IconCompatParcelizer, i);
    }

    public static parseEventExecution read() {
        return new parseEventExecution();
    }
}
