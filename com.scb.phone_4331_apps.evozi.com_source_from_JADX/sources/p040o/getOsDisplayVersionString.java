package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getOsDisplayVersionString */
public final class getOsDisplayVersionString extends waitForDataCollectionPermission implements Parcelable {
    public static final Parcelable.Creator<getOsDisplayVersionString> CREATOR = new Parcelable.Creator<getOsDisplayVersionString>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getOsDisplayVersionString(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getOsDisplayVersionString[i];
        }
    };
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2845x50fd9e4a;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String ParcelableVolumeInfo;

    public final int describeContents() {
        return 0;
    }

    public getOsDisplayVersionString(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        super(i, str, str2, str3, str4, str5, str6, str7, str8);
        this.MediaBrowserCompat$SearchResultReceiver = str9;
        this.f2845x50fd9e4a = str10;
        this.MediaSessionCompat$ResultReceiverWrapper = str11;
        this.ParcelableVolumeInfo = str12;
    }

    protected getOsDisplayVersionString(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.f2845x50fd9e4a = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.f2845x50fd9e4a);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.ParcelableVolumeInfo);
    }
}
