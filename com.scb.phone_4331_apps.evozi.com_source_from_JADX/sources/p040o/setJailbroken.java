package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setJailbroken */
public class setJailbroken implements Parcelable {
    public static final Parcelable.Creator<setJailbroken> CREATOR = new Parcelable.Creator<setJailbroken>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setJailbroken(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setJailbroken[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    private String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String RatingCompat;
    public String read;
    public String write;

    public int describeContents() {
        return 0;
    }

    public setJailbroken() {
    }

    protected setJailbroken(Parcel parcel) {
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
    }

    public static setJailbroken IconCompatParcelizer() {
        return new setJailbroken();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setJailbroken setjailbroken = (setJailbroken) obj;
        String str = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str == null ? setjailbroken.MediaSessionCompat$ResultReceiverWrapper != null : !str.equals(setjailbroken.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? setjailbroken.MediaBrowserCompat$ItemReceiver != null : !str2.equals(setjailbroken.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$MediaItem;
        if (str3 == null ? setjailbroken.MediaBrowserCompat$MediaItem != null : !str3.equals(setjailbroken.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str4 == null ? setjailbroken.MediaBrowserCompat$SearchResultReceiver != null : !str4.equals(setjailbroken.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str5 = this.MediaDescriptionCompat;
        if (str5 == null ? setjailbroken.MediaDescriptionCompat != null : !str5.equals(setjailbroken.MediaDescriptionCompat)) {
            return false;
        }
        String str6 = this.RatingCompat;
        if (str6 == null ? setjailbroken.RatingCompat != null : !str6.equals(setjailbroken.RatingCompat)) {
            return false;
        }
        String str7 = this.IconCompatParcelizer;
        if (str7 == null ? setjailbroken.IconCompatParcelizer != null : !str7.equals(setjailbroken.IconCompatParcelizer)) {
            return false;
        }
        String str8 = this.read;
        if (str8 == null ? setjailbroken.read != null : !str8.equals(setjailbroken.read)) {
            return false;
        }
        String str9 = this.MediaMetadataCompat;
        if (str9 == null ? setjailbroken.MediaMetadataCompat != null : !str9.equals(setjailbroken.MediaMetadataCompat)) {
            return false;
        }
        String str10 = this.write;
        if (str10 == null ? setjailbroken.write != null : !str10.equals(setjailbroken.write)) {
            return false;
        }
        String str11 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str11 == null ? setjailbroken.MediaBrowserCompat$CustomActionResultReceiver != null : !str11.equals(setjailbroken.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str12 = this.MediaSessionCompat$QueueItem;
        String str13 = setjailbroken.MediaSessionCompat$QueueItem;
        if (str12 != null) {
            return str12.equals(str13);
        }
        if (str13 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.MediaSessionCompat$ResultReceiverWrapper;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaDescriptionCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.RatingCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.IconCompatParcelizer;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.read;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaMetadataCompat;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.write;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.MediaSessionCompat$QueueItem;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i;
    }
}
