package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedList;
import p040o.CrashlyticsCore;

/* renamed from: o.doBackgroundInitialization */
public class doBackgroundInitialization extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<doBackgroundInitialization> CREATOR = new Parcelable.Creator<doBackgroundInitialization>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new doBackgroundInitialization(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new doBackgroundInitialization[i];
        }
    };
    public isBuildIdValid IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public LinkedList<CrashlyticsCore.C32462> MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2815x50fd9e4a;
    public boolean MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String RatingCompat;
    public String read;
    public String setHasDecor;

    public int describeContents() {
        return 0;
    }

    public doBackgroundInitialization() {
    }

    public doBackgroundInitialization(Parcel parcel) {
        this.MediaSessionCompat$Token = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.f2815x50fd9e4a = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.IconCompatParcelizer = (isBuildIdValid) parcel.readParcelable(isBuildIdValid.class.getClassLoader());
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        boolean z = true;
        this.MediaDescriptionCompat = parcel.readByte() != 0;
        this.setHasDecor = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readByte() == 0 ? false : z;
        LinkedList<CrashlyticsCore.C32462> linkedList = new LinkedList<>();
        this.MediaBrowserCompat$MediaItem = linkedList;
        parcel.readList(linkedList, CrashlyticsCore.C32462.class.getClassLoader());
    }

    public final String MediaSessionCompat$Token() {
        return this.MediaSessionCompat$Token;
    }

    public final String ParcelableVolumeInfo() {
        return this.MediaSessionCompat$QueueItem;
    }

    public final String MediaDescriptionCompat() {
        return this.MediaSessionCompat$ResultReceiverWrapper;
    }

    public final String IconCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public final String RatingCompat() {
        return this.f2815x50fd9e4a;
    }

    public final String MediaBrowserCompat$SearchResultReceiver() {
        return this.ParcelableVolumeInfo;
    }

    public final isBuildIdValid MediaBrowserCompat$CustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final String read() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String write() {
        return this.read;
    }

    public final String MediaBrowserCompat$MediaItem() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.MediaDescriptionCompat;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String mo27462x50fd9e4a() {
        return this.setHasDecor;
    }

    public final boolean MediaSessionCompat$ResultReceiverWrapper() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final LinkedList<CrashlyticsCore.C32462> MediaMetadataCompat() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.f2815x50fd9e4a);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeParcelable(this.IconCompatParcelizer, i);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeByte(this.MediaDescriptionCompat ? (byte) 1 : 0);
        parcel.writeString(this.setHasDecor);
        parcel.writeByte(this.MediaBrowserCompat$CustomActionResultReceiver ? (byte) 1 : 0);
        parcel.writeList(this.MediaBrowserCompat$MediaItem);
    }
}
