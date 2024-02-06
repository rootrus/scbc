package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.CrashlyticsReport;

/* renamed from: o.parseEvent */
public final class parseEvent implements Parcelable {
    public static final Parcelable.Creator<parseEvent> CREATOR = new Parcelable.Creator<parseEvent>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new parseEvent(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new parseEvent[i];
        }
    };
    public String IconCompatParcelizer;
    public CrashlyticsReport.Session.Application MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public List<String> MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2913x50fd9e4a;
    public String MediaDescriptionCompat;
    public List<parseEventBinaryImage> MediaMetadataCompat;
    public String RatingCompat;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.f2913x50fd9e4a);
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeTypedList(this.MediaMetadataCompat);
        parcel.writeStringList(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, i);
    }

    public parseEvent() {
    }

    protected parseEvent(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readString();
        this.f2913x50fd9e4a = parcel.readString();
        this.write = parcel.readString();
        this.read = parcel.readString();
        this.MediaMetadataCompat = parcel.createTypedArrayList(parseEventBinaryImage.CREATOR);
        this.MediaBrowserCompat$SearchResultReceiver = parcel.createStringArrayList();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = (CrashlyticsReport.Session.Application) parcel.readParcelable(CrashlyticsReport.Session.Application.class.getClassLoader());
    }
}
