package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.NumberFormat;
import java.util.Locale;
import p040o.Maps;

/* renamed from: o.AnalyticsConnectorRegistrar */
public class AnalyticsConnectorRegistrar implements Parcelable {
    public static final Parcelable.Creator<AnalyticsConnectorRegistrar> CREATOR = new Parcelable.Creator<AnalyticsConnectorRegistrar>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AnalyticsConnectorRegistrar(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AnalyticsConnectorRegistrar[i];
        }
    };
    public String AlertController$RecycleListView;
    public Integer AppCompatDelegateImpl$ListMenuDecorView;
    public String IconCompatParcelizer;
    public int Keep;
    public readStringList MediaBrowserCompat$CustomActionResultReceiver = readStringList.NORMAL;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean f2669x50fd9e4a;
    public boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public int MediaSessionCompat$ResultReceiverWrapper;
    public int MediaSessionCompat$Token;
    public int ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public String PlaybackStateCompat$CustomAction;
    public String RatingCompat;
    public String read;
    public Maps.MapDifferenceImpl setBackgroundResource;
    public String setContentView;
    public String setHasDecor;
    public int write;

    public int describeContents() {
        return 0;
    }

    public AnalyticsConnectorRegistrar() {
    }

    protected AnalyticsConnectorRegistrar(Parcel parcel) {
        this.PlaybackStateCompat$CustomAction = parcel.readString();
        this.setHasDecor = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.PlaybackStateCompat = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readInt();
        this.MediaSessionCompat$Token = parcel.readInt();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readInt();
        this.Keep = parcel.readInt();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        boolean z = true;
        this.MediaDescriptionCompat = parcel.readByte() != 0;
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.write = parcel.readInt();
        this.MediaMetadataCompat = parcel.readByte() != 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = readStringList.valueOf(parcel.readString());
        this.f2669x50fd9e4a = parcel.readByte() == 0 ? false : z;
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readString();
        this.AlertController$RecycleListView = parcel.readString();
        this.setContentView = parcel.readString();
        this.AppCompatDelegateImpl$ListMenuDecorView = Integer.valueOf(parcel.readInt());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        parcel.writeString(this.setHasDecor);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeString(this.RatingCompat);
        parcel.writeInt(this.ParcelableVolumeInfo);
        parcel.writeInt(this.MediaSessionCompat$Token);
        parcel.writeInt(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeInt(this.Keep);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeByte(this.MediaDescriptionCompat ? (byte) 1 : 0);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeInt(this.write);
        parcel.writeByte(this.MediaMetadataCompat ? (byte) 1 : 0);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver.name());
        parcel.writeByte(this.f2669x50fd9e4a ? (byte) 1 : 0);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.AlertController$RecycleListView);
        parcel.writeString(this.setContentView);
        parcel.writeInt(this.AppCompatDelegateImpl$ListMenuDecorView.intValue());
    }

    public final String read() {
        String format = NumberFormat.getInstance(Locale.getDefault()).format((long) this.Keep);
        Maps.MapDifferenceImpl mapDifferenceImpl = this.setBackgroundResource;
        return mapDifferenceImpl.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.point_balance_after_redemption, new Object[]{format});
    }

    public final String IconCompatParcelizer() {
        Maps.MapDifferenceImpl mapDifferenceImpl = this.setBackgroundResource;
        return mapDifferenceImpl.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.transaction_reference_id, new Object[]{this.setHasDecor});
    }

    public final String write() {
        if (this.MediaMetadataCompat) {
            Maps.MapDifferenceImpl mapDifferenceImpl = this.setBackgroundResource;
            return mapDifferenceImpl.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.product_item_description_opr, new Object[]{this.RatingCompat});
        }
        Maps.MapDifferenceImpl mapDifferenceImpl2 = this.setBackgroundResource;
        return mapDifferenceImpl2.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.product_item_description, new Object[]{this.RatingCompat, Integer.valueOf(this.ParcelableVolumeInfo)});
    }
}
