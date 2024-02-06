package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setCrashlyticsCollectionEnabled */
public final class setCrashlyticsCollectionEnabled extends FirebaseCrashlytics implements Parcelable {
    public static final Parcelable.Creator<setCrashlyticsCollectionEnabled> CREATOR = new Parcelable.Creator<setCrashlyticsCollectionEnabled>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setCrashlyticsCollectionEnabled(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setCrashlyticsCollectionEnabled[i];
        }
    };
    public boolean MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public int MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public int MediaSessionCompat$Token;
    public String RatingCompat;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ setCrashlyticsCollectionEnabled(Parcel parcel, byte b) {
        this(parcel);
    }

    public setCrashlyticsCollectionEnabled() {
    }

    private setCrashlyticsCollectionEnabled(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$MediaItem = parcel.readInt() != 1 ? false : true;
        this.MediaSessionCompat$Token = parcel.readInt();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readInt();
        this.RatingCompat = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.MediaBrowserCompat$MediaItem ? 1 : 0);
        parcel.writeInt(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeInt(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.RatingCompat);
    }
}
