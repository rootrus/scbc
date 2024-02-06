package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.capSessionCount */
public class capSessionCount extends ForwardingFuture implements Parcelable {
    public static final Parcelable.Creator<capSessionCount> CREATOR = new Parcelable.Creator<capSessionCount>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new capSessionCount(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new capSessionCount[i];
        }
    };
    public int IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    public int MediaBrowserCompat$MediaItem;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String RatingCompat;
    public int read;

    public int describeContents() {
        return 0;
    }

    public /* synthetic */ capSessionCount(capSessionCount$MediaBrowserCompat$CustomActionResultReceiver capsessioncount_mediabrowsercompat_customactionresultreceiver, byte b) {
        this(capsessioncount_mediabrowsercompat_customactionresultreceiver);
    }

    public /* synthetic */ capSessionCount(capSessionCount$MediaBrowserCompat$CustomActionResultReceiver capsessioncount_mediabrowsercompat_customactionresultreceiver, CrashlyticsReportJsonTransform$$Lambda$1 crashlyticsReportJsonTransform$$Lambda$1, byte b) {
        this(capsessioncount_mediabrowsercompat_customactionresultreceiver, crashlyticsReportJsonTransform$$Lambda$1);
    }

    private capSessionCount(capSessionCount$MediaBrowserCompat$CustomActionResultReceiver capsessioncount_mediabrowsercompat_customactionresultreceiver) {
        super(CrashlyticsReportJsonTransform$$Lambda$1.SUCCESS_HEADER);
        this.MediaDescriptionCompat = capsessioncount_mediabrowsercompat_customactionresultreceiver.MediaMetadataCompat;
        this.MediaBrowserCompat$MediaItem = capsessioncount_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat;
        this.RatingCompat = capsessioncount_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem;
        this.MediaBrowserCompat$CustomActionResultReceiver = capsessioncount_mediabrowsercompat_customactionresultreceiver.read;
        this.MediaMetadataCompat = capsessioncount_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        this.read = capsessioncount_mediabrowsercompat_customactionresultreceiver.write;
        this.IconCompatParcelizer = capsessioncount_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$ItemReceiver = capsessioncount_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
    }

    private capSessionCount(capSessionCount$MediaBrowserCompat$CustomActionResultReceiver capsessioncount_mediabrowsercompat_customactionresultreceiver, CrashlyticsReportJsonTransform$$Lambda$1 crashlyticsReportJsonTransform$$Lambda$1) {
        super(crashlyticsReportJsonTransform$$Lambda$1);
        this.MediaDescriptionCompat = capsessioncount_mediabrowsercompat_customactionresultreceiver.MediaMetadataCompat;
        this.MediaBrowserCompat$MediaItem = capsessioncount_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat;
        this.RatingCompat = capsessioncount_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem;
        this.MediaBrowserCompat$CustomActionResultReceiver = capsessioncount_mediabrowsercompat_customactionresultreceiver.read;
        this.MediaMetadataCompat = capsessioncount_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        this.read = capsessioncount_mediabrowsercompat_customactionresultreceiver.write;
        this.IconCompatParcelizer = capsessioncount_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$ItemReceiver = capsessioncount_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
    }

    protected capSessionCount(Parcel parcel) {
        super(parcel);
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readInt();
        this.RatingCompat = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.read = parcel.readInt();
        this.IconCompatParcelizer = parcel.readInt();
        this.MediaBrowserCompat$ItemReceiver = parcel.readInt();
    }

    public final void write(Parcel parcel, int i) {
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeInt(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeInt(this.read);
        parcel.writeInt(this.IconCompatParcelizer);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
    }

    public static capSessionCount$MediaBrowserCompat$CustomActionResultReceiver read() {
        return new capSessionCount$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    }
}
