package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.extractFieldFromSystemFile;

/* renamed from: o.getResourcePackageName */
public final class getResourcePackageName extends extractFieldFromSystemFile implements Parcelable {
    public static final Parcelable.Creator<getResourcePackageName> CREATOR = new Parcelable.Creator<getResourcePackageName>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getResourcePackageName(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getResourcePackageName[i];
        }
    };
    public String MediaBrowserCompat$MediaItem;
    public List<createInstanceIdFrom> MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String RatingCompat;
    private String setBackgroundResource;
    private String setContentView;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ getResourcePackageName(read read2, byte b) {
        this(read2);
    }

    private getResourcePackageName(read read2) {
        super((extractFieldFromSystemFile.write) read2);
        this.write = false;
        this.MediaSessionCompat$Token = read2.f2851x50fd9e4a;
        this.ParcelableVolumeInfo = read2.ParcelableVolumeInfo;
        this.setContentView = read2.MediaBrowserCompat$MediaItem;
        this.MediaBrowserCompat$MediaItem = read2.IconCompatParcelizer;
        this.RatingCompat = read2.RatingCompat;
        this.setBackgroundResource = read2.MediaSessionCompat$ResultReceiverWrapper;
        this.MediaDescriptionCompat = read2.MediaDescriptionCompat;
        this.MediaMetadataCompat = read2.MediaBrowserCompat$SearchResultReceiver;
        this.MediaBrowserCompat$SearchResultReceiver = read2.MediaMetadataCompat;
    }

    public static read MediaBrowserCompat$CustomActionResultReceiver() {
        return new read((byte) 0);
    }

    protected getResourcePackageName(Parcel parcel) {
        super(parcel);
        this.MediaSessionCompat$Token = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.setContentView = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.setBackgroundResource = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.createTypedArrayList(createInstanceIdFrom.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.setContentView);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.setBackgroundResource);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeTypedList(this.MediaBrowserCompat$SearchResultReceiver);
    }

    /* renamed from: o.getResourcePackageName$read */
    public static final class read extends extractFieldFromSystemFile.write {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2851x50fd9e4a;
        public String MediaDescriptionCompat;
        public List<createInstanceIdFrom> MediaMetadataCompat;
        public String MediaSessionCompat$ResultReceiverWrapper;
        public String ParcelableVolumeInfo;
        public String RatingCompat;

        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
        }

        public final /* synthetic */ extractFieldFromSystemFile read() {
            return new getResourcePackageName(this, (byte) 0);
        }

        public final /* synthetic */ getStringsFileValue MediaBrowserCompat$ItemReceiver() {
            return new getResourcePackageName(this, (byte) 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        getResourcePackageName getresourcepackagename = (getResourcePackageName) obj;
        String str = this.MediaSessionCompat$Token;
        if (str == null ? getresourcepackagename.MediaSessionCompat$Token != null : !str.equals(getresourcepackagename.MediaSessionCompat$Token)) {
            return false;
        }
        String str2 = this.ParcelableVolumeInfo;
        if (str2 == null ? getresourcepackagename.ParcelableVolumeInfo != null : !str2.equals(getresourcepackagename.ParcelableVolumeInfo)) {
            return false;
        }
        String str3 = this.setContentView;
        if (str3 == null ? getresourcepackagename.setContentView != null : !str3.equals(getresourcepackagename.setContentView)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$MediaItem;
        if (str4 == null ? getresourcepackagename.MediaBrowserCompat$MediaItem != null : !str4.equals(getresourcepackagename.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str5 = this.RatingCompat;
        if (str5 == null ? getresourcepackagename.RatingCompat != null : !str5.equals(getresourcepackagename.RatingCompat)) {
            return false;
        }
        String str6 = this.setBackgroundResource;
        if (str6 == null ? getresourcepackagename.setBackgroundResource != null : !str6.equals(getresourcepackagename.setBackgroundResource)) {
            return false;
        }
        String str7 = this.MediaDescriptionCompat;
        if (str7 == null ? getresourcepackagename.MediaDescriptionCompat != null : !str7.equals(getresourcepackagename.MediaDescriptionCompat)) {
            return false;
        }
        String str8 = this.MediaMetadataCompat;
        if (str8 == null ? getresourcepackagename.MediaMetadataCompat != null : !str8.equals(getresourcepackagename.MediaMetadataCompat)) {
            return false;
        }
        List<createInstanceIdFrom> list = this.MediaBrowserCompat$SearchResultReceiver;
        List<createInstanceIdFrom> list2 = getresourcepackagename.MediaBrowserCompat$SearchResultReceiver;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = super.hashCode();
        String str = this.MediaSessionCompat$Token;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.ParcelableVolumeInfo;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.setContentView;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.RatingCompat;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.setBackgroundResource;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaDescriptionCompat;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaMetadataCompat;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        List<createInstanceIdFrom> list = this.MediaBrowserCompat$SearchResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }
}
