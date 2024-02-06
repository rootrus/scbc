package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.doOnboarding */
public final class doOnboarding extends NativeSessionFileProvider implements Parcelable {
    public static final Parcelable.Creator<doOnboarding> CREATOR = new Parcelable.Creator<doOnboarding>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new doOnboarding(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new doOnboarding[i];
        }
    };
    public Double MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2817x50fd9e4a;
    public List<onPreExecute> MediaDescriptionCompat;
    public Double MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public Double MediaSessionCompat$ResultReceiverWrapper;
    public boolean MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public Double RatingCompat;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ doOnboarding(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private doOnboarding(IconCompatParcelizer iconCompatParcelizer) {
        super((NativeSessionFileProvider$MediaBrowserCompat$ItemReceiver) iconCompatParcelizer);
        this.ParcelableVolumeInfo = iconCompatParcelizer.MediaSessionCompat$Token;
        this.f2817x50fd9e4a = iconCompatParcelizer.MediaSessionCompat$QueueItem;
        this.MediaSessionCompat$QueueItem = iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper;
        this.MediaBrowserCompat$MediaItem = iconCompatParcelizer.MediaDescriptionCompat;
        this.RatingCompat = iconCompatParcelizer.MediaBrowserCompat$MediaItem;
        this.MediaMetadataCompat = iconCompatParcelizer.RatingCompat;
        this.MediaSessionCompat$ResultReceiverWrapper = iconCompatParcelizer.f2818x50fd9e4a;
        this.MediaSessionCompat$Token = iconCompatParcelizer.ParcelableVolumeInfo;
        this.MediaDescriptionCompat = iconCompatParcelizer.MediaMetadataCompat;
        this.MediaBrowserCompat$SearchResultReceiver = iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
    }

    protected doOnboarding(Parcel parcel) {
        super(parcel);
        this.ParcelableVolumeInfo = parcel.readString();
        this.f2817x50fd9e4a = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        if (parcel.readByte() == 0) {
            this.MediaBrowserCompat$MediaItem = null;
        } else {
            this.MediaBrowserCompat$MediaItem = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 0) {
            this.RatingCompat = null;
        } else {
            this.RatingCompat = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 0) {
            this.MediaMetadataCompat = null;
        } else {
            this.MediaMetadataCompat = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 0) {
            this.MediaSessionCompat$ResultReceiverWrapper = null;
        } else {
            this.MediaSessionCompat$ResultReceiverWrapper = Double.valueOf(parcel.readDouble());
        }
        this.MediaSessionCompat$Token = parcel.readByte() != 0;
        this.MediaDescriptionCompat = parcel.createTypedArrayList(onPreExecute.CREATOR);
    }

    public static doOnboarding$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver() {
        return new doOnboarding$MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.f2817x50fd9e4a);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        if (this.MediaBrowserCompat$MediaItem == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.MediaBrowserCompat$MediaItem.doubleValue());
        }
        if (this.RatingCompat == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.RatingCompat.doubleValue());
        }
        if (this.MediaMetadataCompat == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.MediaMetadataCompat.doubleValue());
        }
        if (this.MediaSessionCompat$ResultReceiverWrapper == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.MediaSessionCompat$ResultReceiverWrapper.doubleValue());
        }
        parcel.writeByte(this.MediaSessionCompat$Token ? (byte) 1 : 0);
        parcel.writeTypedList(this.MediaDescriptionCompat);
    }

    /* renamed from: o.doOnboarding$IconCompatParcelizer */
    public static abstract class IconCompatParcelizer<T extends NativeSessionFileProvider, B extends IconCompatParcelizer<T, B>> extends NativeSessionFileProvider$MediaBrowserCompat$ItemReceiver<T, B> {
        Double MediaBrowserCompat$MediaItem;
        String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        Double f2818x50fd9e4a;
        Double MediaDescriptionCompat;
        List<onPreExecute> MediaMetadataCompat;
        String MediaSessionCompat$QueueItem;
        String MediaSessionCompat$ResultReceiverWrapper;
        String MediaSessionCompat$Token;
        boolean ParcelableVolumeInfo;
        Double RatingCompat;

        public final B MediaBrowserCompat$ItemReceiver(String str) {
            this.MediaBrowserCompat$SearchResultReceiver = str;
            return (IconCompatParcelizer) write();
        }

        public final B IconCompatParcelizer(String str) {
            this.MediaSessionCompat$Token = str;
            return (IconCompatParcelizer) write();
        }

        public final B MediaBrowserCompat$MediaItem(String str) {
            this.MediaSessionCompat$QueueItem = str;
            return (IconCompatParcelizer) write();
        }

        public final B MediaMetadataCompat(String str) {
            this.MediaSessionCompat$ResultReceiverWrapper = str;
            return (IconCompatParcelizer) write();
        }

        public final B MediaBrowserCompat$CustomActionResultReceiver(Double d) {
            this.MediaDescriptionCompat = d;
            return (IconCompatParcelizer) write();
        }

        public final B IconCompatParcelizer(Double d) {
            this.MediaBrowserCompat$MediaItem = d;
            return (IconCompatParcelizer) write();
        }

        public final B MediaBrowserCompat$ItemReceiver(Double d) {
            this.RatingCompat = d;
            return (IconCompatParcelizer) write();
        }

        public final B write(Double d) {
            this.f2818x50fd9e4a = d;
            return (IconCompatParcelizer) write();
        }

        public final B IconCompatParcelizer(boolean z) {
            this.ParcelableVolumeInfo = z;
            return (IconCompatParcelizer) write();
        }

        public final B write(List<onPreExecute> list) {
            this.MediaMetadataCompat = list;
            return (IconCompatParcelizer) write();
        }
    }
}
