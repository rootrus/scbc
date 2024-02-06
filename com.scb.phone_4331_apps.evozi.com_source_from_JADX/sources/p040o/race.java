package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.race */
public class race extends ForwardingFuture implements Parcelable {
    public static final Parcelable.Creator<race> CREATOR = new Parcelable.Creator<race>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new race(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new race[i];
        }
    };
    public int MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompat$ResultReceiverWrapper;
    public boolean MediaSessionCompat$Token;
    public String RatingCompat;

    public int describeContents() {
        return 0;
    }

    protected race(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.RatingCompat = parcel.readString();
        boolean z = true;
        this.MediaMetadataCompat = parcel.readByte() != 0;
        this.MediaBrowserCompat$MediaItem = parcel.readInt();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readByte() != 0;
        this.MediaSessionCompat$Token = parcel.readByte() != 0;
        this.MediaDescriptionCompat = parcel.readByte() == 0 ? false : z;
    }

    public static write MediaBrowserCompat$ItemReceiver(CrashlyticsReportJsonTransform$$Lambda$1 crashlyticsReportJsonTransform$$Lambda$1) {
        return new write(crashlyticsReportJsonTransform$$Lambda$1);
    }

    public static write MediaBrowserCompat$ItemReceiver() {
        return new write(CrashlyticsReportJsonTransform$$Lambda$1.SIMPLE);
    }

    public static write MediaBrowserCompat$CustomActionResultReceiver() {
        return new write(CrashlyticsReportJsonTransform$$Lambda$1.SIMPLE_RIGHT_FOCUS);
    }

    public static write read() {
        return new write(CrashlyticsReportJsonTransform$$Lambda$1.REVAMP_SIMPLE);
    }

    public void write(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeByte(this.MediaMetadataCompat ? (byte) 1 : 0);
        parcel.writeInt(this.MediaBrowserCompat$MediaItem);
        parcel.writeByte(this.MediaSessionCompat$ResultReceiverWrapper ? (byte) 1 : 0);
        parcel.writeByte(this.MediaSessionCompat$Token ? (byte) 1 : 0);
        parcel.writeByte(this.MediaDescriptionCompat ? (byte) 1 : 0);
    }

    /* renamed from: o.race$write */
    public static class write<T extends write<T>> {
        public boolean MediaBrowserCompat$MediaItem = false;
        CrashlyticsReportJsonTransform$$Lambda$1 MediaBrowserCompat$SearchResultReceiver;
        public boolean MediaDescriptionCompat = false;
        public String MediaMetadataCompat;
        public boolean MediaSessionCompat$Token = false;
        public boolean ParcelableVolumeInfo = false;
        public String RatingCompat;
        public int write = -1;

        public write(CrashlyticsReportJsonTransform$$Lambda$1 crashlyticsReportJsonTransform$$Lambda$1) {
            this.MediaBrowserCompat$SearchResultReceiver = crashlyticsReportJsonTransform$$Lambda$1;
        }

        public race read() {
            return new race((write<?>) this);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        race race = (race) obj;
        if (this.MediaMetadataCompat != race.MediaMetadataCompat || this.MediaBrowserCompat$MediaItem != race.MediaBrowserCompat$MediaItem || this.MediaSessionCompat$ResultReceiverWrapper != race.MediaSessionCompat$ResultReceiverWrapper || this.MediaSessionCompat$Token != race.MediaSessionCompat$Token || this.MediaDescriptionCompat != race.MediaDescriptionCompat) {
            return false;
        }
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        if (str == null ? race.MediaBrowserCompat$SearchResultReceiver != null : !str.equals(race.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str2 = this.RatingCompat;
        String str3 = race.RatingCompat;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = super.hashCode();
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + i) * 31) + (this.MediaMetadataCompat ? 1 : 0)) * 31) + this.MediaBrowserCompat$MediaItem) * 31) + (this.MediaSessionCompat$ResultReceiverWrapper ? 1 : 0)) * 31) + (this.MediaSessionCompat$Token ? 1 : 0)) * 31) + (this.MediaDescriptionCompat ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItemSimpleCustomDisplay{componentRightLabel='");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append('\'');
        sb.append(", componentLeftLabel='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append(", lightTextColor=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", colorRightLabel=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", shouldHideSectionInSlip=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", noPaddingTop=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", noPaddingBottom=");
        sb.append(this.MediaDescriptionCompat);
        sb.append('}');
        return sb.toString();
    }

    public race(write<?> write2) {
        super(write2.MediaBrowserCompat$SearchResultReceiver);
        this.MediaBrowserCompat$SearchResultReceiver = write2.MediaMetadataCompat;
        this.RatingCompat = write2.RatingCompat;
        this.MediaMetadataCompat = write2.MediaBrowserCompat$MediaItem;
        this.MediaBrowserCompat$MediaItem = write2.write;
        this.MediaSessionCompat$ResultReceiverWrapper = write2.MediaSessionCompat$Token;
        this.MediaSessionCompat$Token = write2.ParcelableVolumeInfo;
        this.MediaDescriptionCompat = write2.MediaDescriptionCompat;
    }
}
