package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setThreadFactory */
public final class setThreadFactory extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<setThreadFactory> CREATOR = new Parcelable.Creator<setThreadFactory>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setThreadFactory(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setThreadFactory[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public long MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$Token;
    public String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public setThreadFactory() {
    }

    public static setThreadFactory MediaBrowserCompat$ItemReceiver() {
        return new setThreadFactory();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setThreadFactory setthreadfactory = (setThreadFactory) obj;
        if (this.MediaBrowserCompat$MediaItem != setthreadfactory.MediaBrowserCompat$MediaItem || this.MediaBrowserCompat$SearchResultReceiver != setthreadfactory.MediaBrowserCompat$SearchResultReceiver) {
            return false;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? setthreadfactory.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(setthreadfactory.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.RatingCompat;
        if (str2 == null ? setthreadfactory.RatingCompat != null : !str2.equals(setthreadfactory.RatingCompat)) {
            return false;
        }
        String str3 = this.IconCompatParcelizer;
        if (str3 == null ? setthreadfactory.IconCompatParcelizer != null : !str3.equals(setthreadfactory.IconCompatParcelizer)) {
            return false;
        }
        String str4 = this.MediaMetadataCompat;
        if (str4 == null ? setthreadfactory.MediaMetadataCompat != null : !str4.equals(setthreadfactory.MediaMetadataCompat)) {
            return false;
        }
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        if (str5 == null ? setthreadfactory.MediaBrowserCompat$ItemReceiver != null : !str5.equals(setthreadfactory.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str6 = this.MediaDescriptionCompat;
        if (str6 == null ? setthreadfactory.MediaDescriptionCompat != null : !str6.equals(setthreadfactory.MediaDescriptionCompat)) {
            return false;
        }
        String str7 = this.MediaSessionCompat$Token;
        if (str7 == null ? setthreadfactory.MediaSessionCompat$Token != null : !str7.equals(setthreadfactory.MediaSessionCompat$Token)) {
            return false;
        }
        String str8 = this.read;
        String str9 = setthreadfactory.read;
        if (str8 != null) {
            return str8.equals(str9);
        }
        if (str9 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.MediaBrowserCompat$MediaItem;
        int i = (int) (j ^ (j >>> 32));
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaMetadataCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaDescriptionCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        boolean z = this.MediaBrowserCompat$SearchResultReceiver;
        String str7 = this.MediaSessionCompat$Token;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.read;
        if (str8 != null) {
            i2 = str8.hashCode();
        }
        return (((((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (z ? 1 : 0)) * 31) + hashCode7) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecipientReviewDisplay{recipientId=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", bankLogo='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", bankName='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append(", accountNumber='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", nickName='");
        sb.append(this.MediaMetadataCompat);
        sb.append('\'');
        sb.append(", amount='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", fee='");
        sb.append(this.MediaDescriptionCompat);
        sb.append('\'');
        sb.append(", isScheduled=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", transferSubFunction='");
        sb.append(this.MediaSessionCompat$Token);
        sb.append('\'');
        sb.append(", accountNumberOriginal='");
        sb.append(this.read);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeByte(this.MediaBrowserCompat$SearchResultReceiver ? (byte) 1 : 0);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.read);
    }

    protected setThreadFactory(Parcel parcel) {
        this.MediaBrowserCompat$MediaItem = parcel.readLong();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readByte() != 0;
        this.MediaSessionCompat$Token = parcel.readString();
        this.read = parcel.readString();
    }
}
