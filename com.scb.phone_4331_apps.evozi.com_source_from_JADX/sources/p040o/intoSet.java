package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.NumberFormat;
import java.util.Locale;
import p040o.Maps;
import p040o.zzpf;

/* renamed from: o.intoSet */
public class intoSet implements Parcelable {
    public static final Parcelable.Creator<intoSet> CREATOR = new Parcelable.Creator<intoSet>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new intoSet(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new intoSet[i];
        }
    };
    public String AlertController$RecycleListView;
    public Integer IconCompatParcelizer;
    public Integer Keep;
    public Integer MediaBrowserCompat$CustomActionResultReceiver;
    public Integer MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public handle f2870x50fd9e4a;
    public String MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public Integer ParcelableVolumeInfo;
    public readString PlaybackStateCompat;
    public Integer PlaybackStateCompat$CustomAction;
    public boolean RatingCompat;
    public String read;
    public Maps.MapDifferenceImpl setBackgroundResource;
    public zzpf.zza setHasDecor = zzpf.zza.OTHER;
    public String write;

    public int describeContents() {
        return 0;
    }

    protected intoSet(Parcel parcel) {
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.PlaybackStateCompat$CustomAction = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.IconCompatParcelizer = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.ParcelableVolumeInfo = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.AlertController$RecycleListView = parcel.readString();
        this.setHasDecor = zzpf.zza.valueOf(parcel.readString());
        this.f2870x50fd9e4a = (handle) parcel.readParcelable(getClass().getClassLoader());
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.MediaBrowserCompat$ItemReceiver = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.read = parcel.readString();
        this.PlaybackStateCompat = readString.valueOf(parcel.readString());
        boolean z = false;
        this.RatingCompat = parcel.readInt() == 1;
        this.Keep = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaMetadataCompat = parcel.readInt() == 1 ? true : z;
    }

    public intoSet() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeValue(this.PlaybackStateCompat$CustomAction);
        parcel.writeValue(this.IconCompatParcelizer);
        parcel.writeValue(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.AlertController$RecycleListView);
        parcel.writeString(this.setHasDecor.name());
        parcel.writeParcelable(this.f2870x50fd9e4a, i);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.write);
        parcel.writeValue(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeValue(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.PlaybackStateCompat.name());
        parcel.writeInt(this.RatingCompat ? 1 : 0);
        parcel.writeValue(this.Keep);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeInt(this.MediaMetadataCompat ? 1 : 0);
    }

    public final String read() {
        String format = NumberFormat.getInstance(Locale.getDefault()).format(this.PlaybackStateCompat$CustomAction);
        if (this.setHasDecor.equals(zzpf.zza.MILEAGE)) {
            String format2 = NumberFormat.getInstance(Locale.getDefault()).format(this.f2870x50fd9e4a.IconCompatParcelizer);
            if (this.PlaybackStateCompat$CustomAction.intValue() <= 1) {
                Maps.MapDifferenceImpl mapDifferenceImpl = this.setBackgroundResource;
                return mapDifferenceImpl.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.mileage_points_per_miles_one_point, new Object[]{format, format2});
            }
            Maps.MapDifferenceImpl mapDifferenceImpl2 = this.setBackgroundResource;
            return mapDifferenceImpl2.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.mileage_points_per_miles, new Object[]{format, format2});
        } else if (this.PlaybackStateCompat$CustomAction.intValue() <= 1) {
            Maps.MapDifferenceImpl mapDifferenceImpl3 = this.setBackgroundResource;
            return mapDifferenceImpl3.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.product_points_one_point, new Object[]{format});
        } else {
            Maps.MapDifferenceImpl mapDifferenceImpl4 = this.setBackgroundResource;
            return mapDifferenceImpl4.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.product_points, new Object[]{format});
        }
    }
}
