package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedList;
import p040o.CrashlyticsCore;

/* renamed from: o.ExecutorUtils */
public final class ExecutorUtils {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public int read;
    public int write;

    /* renamed from: o.ExecutorUtils$1 */
    public final class C33371 extends doBackgroundInitialization implements Parcelable {
        public static final Parcelable.Creator<C33371> CREATOR = new Parcelable.Creator<C33371>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C33371(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C33371[i];
            }
        };
        private String AlertController$RecycleListView;
        public String Keep;
        private String PlaybackStateCompat;
        public String PlaybackStateCompat$CustomAction;

        /* renamed from: o.ExecutorUtils$1$IconCompatParcelizer */
        public static final class IconCompatParcelizer {
            public String AlertController$RecycleListView;
            public String IconCompatParcelizer;
            public String Keep;
            public String MediaBrowserCompat$CustomActionResultReceiver;
            public isBuildIdValid MediaBrowserCompat$ItemReceiver;
            public String MediaBrowserCompat$MediaItem;
            public String MediaBrowserCompat$SearchResultReceiver;

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            public String f2708x50fd9e4a;
            public String MediaDescriptionCompat;
            public String MediaMetadataCompat;
            public String MediaSessionCompat$QueueItem;
            public String MediaSessionCompat$ResultReceiverWrapper;
            public String MediaSessionCompat$Token;
            public String ParcelableVolumeInfo;
            public String PlaybackStateCompat$CustomAction;
            public LinkedList<CrashlyticsCore.C32462> RatingCompat;
            public String read;
            public boolean write;
        }

        public final int describeContents() {
            return 0;
        }

        public /* synthetic */ C33371(IconCompatParcelizer iconCompatParcelizer, byte b) {
            this(iconCompatParcelizer);
        }

        protected C33371(Parcel parcel) {
            super(parcel);
            this.PlaybackStateCompat = parcel.readString();
            this.AlertController$RecycleListView = parcel.readString();
            this.PlaybackStateCompat$CustomAction = parcel.readString();
            this.Keep = parcel.readString();
        }

        private C33371(IconCompatParcelizer iconCompatParcelizer) {
            this.MediaSessionCompat$Token = iconCompatParcelizer.Keep;
            this.PlaybackStateCompat = iconCompatParcelizer.AlertController$RecycleListView;
            this.MediaSessionCompat$QueueItem = iconCompatParcelizer.f2708x50fd9e4a;
            this.PlaybackStateCompat$CustomAction = iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper;
            this.Keep = iconCompatParcelizer.MediaSessionCompat$Token;
            this.AlertController$RecycleListView = iconCompatParcelizer.MediaMetadataCompat;
            this.RatingCompat = iconCompatParcelizer.MediaBrowserCompat$MediaItem;
            this.MediaSessionCompat$ResultReceiverWrapper = iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
            this.MediaMetadataCompat = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            this.ParcelableVolumeInfo = iconCompatParcelizer.MediaSessionCompat$QueueItem;
            this.f2815x50fd9e4a = iconCompatParcelizer.ParcelableVolumeInfo;
            this.IconCompatParcelizer = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.IconCompatParcelizer;
            this.read = iconCompatParcelizer.read;
            this.MediaBrowserCompat$SearchResultReceiver = iconCompatParcelizer.MediaDescriptionCompat;
            this.MediaDescriptionCompat = iconCompatParcelizer.write;
            this.setHasDecor = iconCompatParcelizer.PlaybackStateCompat$CustomAction;
            this.MediaBrowserCompat$MediaItem = iconCompatParcelizer.RatingCompat;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.PlaybackStateCompat);
            parcel.writeString(this.AlertController$RecycleListView);
            parcel.writeString(this.PlaybackStateCompat$CustomAction);
            parcel.writeString(this.Keep);
        }
    }
}
