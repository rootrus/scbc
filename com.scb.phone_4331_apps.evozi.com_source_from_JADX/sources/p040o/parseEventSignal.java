package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import p040o.CrashlyticsReport;

/* renamed from: o.parseEventSignal */
public class parseEventSignal extends CrashlyticsReport.Session.Builder implements Parcelable, Serializable {
    public static final Parcelable.Creator<parseEventSignal> CREATOR = new Parcelable.Creator<parseEventSignal>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new parseEventSignal(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new parseEventSignal[i];
        }
    };
    public ICameraUpdateFactoryDelegate AlertController$RecycleListView;
    public String Keep;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2915x50fd9e4a;
    public Integer MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public boolean MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat$CustomAction;
    public String RatingCompat;
    public String setHasDecor;

    public int describeContents() {
        return 0;
    }

    public parseEventSignal() {
    }

    public static parseEventSignal write() {
        return new parseEventSignal();
    }

    public final parseEventSignal MediaBrowserCompat$ItemReceiver(String str) {
        this.IconCompatParcelizer = str;
        return this;
    }

    public final parseEventSignal write(String str) {
        this.read = str;
        return this;
    }

    public final parseEventSignal MediaMetadataCompat() {
        this.MediaBrowserCompat$ItemReceiver = true;
        return this;
    }

    public final parseEventSignal MediaBrowserCompat$MediaItem() {
        this.write = true;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        Integer num = this.MediaDescriptionCompat;
        parcel.writeInt(num == null ? 0 : num.intValue());
        parcel.writeString(this.RatingCompat);
        ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = this.AlertController$RecycleListView;
        parcel.writeInt(iCameraUpdateFactoryDelegate == null ? -1 : iCameraUpdateFactoryDelegate.ordinal());
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.Keep);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.setHasDecor);
        parcel.writeByte(this.MediaSessionCompat$ResultReceiverWrapper ? (byte) 1 : 0);
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.f2915x50fd9e4a);
    }

    protected parseEventSignal(Parcel parcel) {
        super(parcel);
        ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate;
        this.MediaDescriptionCompat = Integer.valueOf(parcel.readInt());
        this.RatingCompat = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            iCameraUpdateFactoryDelegate = null;
        } else {
            iCameraUpdateFactoryDelegate = ICameraUpdateFactoryDelegate.values()[readInt];
        }
        this.AlertController$RecycleListView = iCameraUpdateFactoryDelegate;
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.Keep = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.setHasDecor = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readByte() != 0;
        this.PlaybackStateCompat$CustomAction = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.f2915x50fd9e4a = parcel.readString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof parseEventSignal)) {
            return false;
        }
        parseEventSignal parseeventsignal = (parseEventSignal) obj;
        AddNewCurrencyActivity_ViewBinding addNewCurrencyActivity_ViewBinding = new AddNewCurrencyActivity_ViewBinding();
        boolean z2 = this.MediaSessionCompat$ResultReceiverWrapper;
        boolean z3 = parseeventsignal.MediaSessionCompat$ResultReceiverWrapper;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            if (z2 != z3) {
                z = false;
            }
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = z;
        }
        return addNewCurrencyActivity_ViewBinding.read(this.MediaDescriptionCompat, parseeventsignal.MediaDescriptionCompat).read(this.RatingCompat, parseeventsignal.RatingCompat).read(this.AlertController$RecycleListView, parseeventsignal.AlertController$RecycleListView).read(this.MediaSessionCompat$QueueItem, parseeventsignal.MediaSessionCompat$QueueItem).read(this.ParcelableVolumeInfo, parseeventsignal.ParcelableVolumeInfo).read(this.MediaBrowserCompat$SearchResultReceiver, parseeventsignal.MediaBrowserCompat$SearchResultReceiver).read(this.Keep, parseeventsignal.Keep).read(this.MediaBrowserCompat$MediaItem, parseeventsignal.MediaBrowserCompat$MediaItem).read(this.MediaSessionCompat$Token, parseeventsignal.MediaSessionCompat$Token).read(this.setHasDecor, parseeventsignal.setHasDecor).read(this.PlaybackStateCompat$CustomAction, parseeventsignal.PlaybackStateCompat$CustomAction).read(this.MediaMetadataCompat, parseeventsignal.MediaMetadataCompat).read(this.f2915x50fd9e4a, parseeventsignal.f2915x50fd9e4a).MediaBrowserCompat$ItemReceiver;
    }

    public int hashCode() {
        DetailsTabHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = new DetailsTabHolder_ViewBinding((byte) 0).MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat).MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat).MediaBrowserCompat$CustomActionResultReceiver(this.AlertController$RecycleListView).MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$QueueItem).MediaBrowserCompat$CustomActionResultReceiver(this.ParcelableVolumeInfo).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$SearchResultReceiver).MediaBrowserCompat$CustomActionResultReceiver(this.Keep).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem).MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$Token).MediaBrowserCompat$CustomActionResultReceiver(this.setHasDecor);
        MediaBrowserCompat$CustomActionResultReceiver.read = (MediaBrowserCompat$CustomActionResultReceiver.read * 37) + (this.MediaSessionCompat$ResultReceiverWrapper ^ true ? 1 : 0);
        return MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.PlaybackStateCompat$CustomAction).MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat).MediaBrowserCompat$CustomActionResultReceiver(this.f2915x50fd9e4a).read;
    }
}
