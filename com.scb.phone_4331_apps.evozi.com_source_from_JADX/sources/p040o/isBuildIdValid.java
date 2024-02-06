package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.isBuildIdValid */
public class isBuildIdValid implements Parcelable {
    public static final Parcelable.Creator<isBuildIdValid> CREATOR = new Parcelable.Creator<isBuildIdValid>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new isBuildIdValid(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new isBuildIdValid[i];
        }
    };
    public String AlertController$RecycleListView;
    private String AppCompatDelegateImpl$ListMenuDecorView;
    public String AppCompatDialogFragment;
    public String IconCompatParcelizer;
    public String Keep;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2872x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public String PlaybackStateCompat$CustomAction;
    public String RatingCompat;
    public String read;
    private String setBackgroundResource;
    public String setContentView;
    public CrashlyticsFileMarker setHasDecor;
    public String write;

    /* renamed from: o.isBuildIdValid$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public CrashlyticsFileMarker AlertController$RecycleListView;
        public String AppCompatDelegateImpl$ListMenuDecorView;
        public String AppCompatDialogFragment;
        public String IconCompatParcelizer;
        public String Keep;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2873x50fd9e4a;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public String MediaSessionCompat$QueueItem;
        public String MediaSessionCompat$ResultReceiverWrapper;
        public String MediaSessionCompat$Token;
        public String ParcelableVolumeInfo;
        public String PlaybackStateCompat;
        public String PlaybackStateCompat$CustomAction;
        public String RatingCompat;
        public String read;
        public String setContentView;
        public String setHasDecor;
        public String write;
    }

    public int describeContents() {
        return 0;
    }

    public /* synthetic */ isBuildIdValid(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    public static IconCompatParcelizer IconCompatParcelizer() {
        return new IconCompatParcelizer();
    }

    private isBuildIdValid(IconCompatParcelizer iconCompatParcelizer) {
        this.MediaMetadataCompat = iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
        this.f2872x50fd9e4a = iconCompatParcelizer.MediaSessionCompat$Token;
        this.RatingCompat = iconCompatParcelizer.MediaBrowserCompat$MediaItem;
        this.PlaybackStateCompat = iconCompatParcelizer.setHasDecor;
        this.setBackgroundResource = iconCompatParcelizer.PlaybackStateCompat$CustomAction;
        this.MediaSessionCompat$ResultReceiverWrapper = iconCompatParcelizer.ParcelableVolumeInfo;
        this.Keep = iconCompatParcelizer.Keep;
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.write;
        this.read = iconCompatParcelizer.read;
        this.IconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        this.AppCompatDelegateImpl$ListMenuDecorView = null;
        this.write = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$SearchResultReceiver = iconCompatParcelizer.RatingCompat;
        this.MediaSessionCompat$Token = iconCompatParcelizer.MediaSessionCompat$QueueItem;
        this.MediaSessionCompat$QueueItem = iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper;
        this.ParcelableVolumeInfo = iconCompatParcelizer.f2873x50fd9e4a;
        this.AppCompatDialogFragment = iconCompatParcelizer.AppCompatDialogFragment;
        this.setContentView = iconCompatParcelizer.AppCompatDelegateImpl$ListMenuDecorView;
        this.AlertController$RecycleListView = iconCompatParcelizer.PlaybackStateCompat;
        this.PlaybackStateCompat$CustomAction = iconCompatParcelizer.setContentView;
        this.MediaDescriptionCompat = iconCompatParcelizer.MediaDescriptionCompat;
        this.MediaBrowserCompat$MediaItem = iconCompatParcelizer.MediaMetadataCompat;
        this.setHasDecor = iconCompatParcelizer.AlertController$RecycleListView;
    }

    protected isBuildIdValid(Parcel parcel) {
        this.MediaMetadataCompat = parcel.readString();
        this.f2872x50fd9e4a = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.PlaybackStateCompat = parcel.readString();
        this.setBackgroundResource = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.Keep = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.read = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.AppCompatDelegateImpl$ListMenuDecorView = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.AppCompatDialogFragment = parcel.readString();
        this.setContentView = parcel.readString();
        this.AlertController$RecycleListView = parcel.readString();
        this.PlaybackStateCompat$CustomAction = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.setHasDecor = (CrashlyticsFileMarker) parcel.readParcelable(CrashlyticsFileMarker.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.f2872x50fd9e4a);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeString(this.setBackgroundResource);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.Keep);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.AppCompatDelegateImpl$ListMenuDecorView);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.AppCompatDialogFragment);
        parcel.writeString(this.setContentView);
        parcel.writeString(this.AlertController$RecycleListView);
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeParcelable(this.setHasDecor, i);
    }
}
