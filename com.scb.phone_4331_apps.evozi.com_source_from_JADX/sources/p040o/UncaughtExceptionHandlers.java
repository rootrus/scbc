package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.UncaughtExceptionHandlers */
public final class UncaughtExceptionHandlers extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<UncaughtExceptionHandlers> CREATOR = new Parcelable.Creator<UncaughtExceptionHandlers>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new UncaughtExceptionHandlers(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new UncaughtExceptionHandlers[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public long MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String RatingCompat;
    public String read;

    /* renamed from: o.UncaughtExceptionHandlers$Exiter */
    public final class Exiter {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$ItemReceiver;
        public String read;
        public String write;
    }

    public final int describeContents() {
        return 0;
    }

    protected UncaughtExceptionHandlers(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readByte() != 0;
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaDescriptionCompat = parcel.readLong();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeByte(this.MediaBrowserCompat$MediaItem ? (byte) 1 : 0);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeLong(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
    }

    public UncaughtExceptionHandlers(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.MediaDescriptionCompat = j;
        this.RatingCompat = str;
        this.MediaMetadataCompat = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.IconCompatParcelizer = str4;
        this.read = str5;
        this.MediaBrowserCompat$MediaItem = true;
        this.MediaBrowserCompat$ItemReceiver = str6;
        this.MediaBrowserCompat$SearchResultReceiver = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UncaughtExceptionHandlers uncaughtExceptionHandlers = (UncaughtExceptionHandlers) obj;
        if (this.MediaDescriptionCompat == uncaughtExceptionHandlers.MediaDescriptionCompat && this.MediaBrowserCompat$MediaItem == uncaughtExceptionHandlers.MediaBrowserCompat$MediaItem && this.RatingCompat.equals(uncaughtExceptionHandlers.RatingCompat) && this.MediaMetadataCompat.equals(uncaughtExceptionHandlers.MediaMetadataCompat) && this.MediaBrowserCompat$CustomActionResultReceiver.equals(uncaughtExceptionHandlers.MediaBrowserCompat$CustomActionResultReceiver) && this.IconCompatParcelizer.equals(uncaughtExceptionHandlers.IconCompatParcelizer) && this.read.equals(uncaughtExceptionHandlers.read) && this.MediaBrowserCompat$ItemReceiver.equals(uncaughtExceptionHandlers.MediaBrowserCompat$ItemReceiver)) {
            return this.MediaBrowserCompat$SearchResultReceiver.equals(uncaughtExceptionHandlers.MediaBrowserCompat$SearchResultReceiver);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.MediaDescriptionCompat;
        int hashCode = this.RatingCompat.hashCode();
        int hashCode2 = this.MediaMetadataCompat.hashCode();
        int hashCode3 = this.MediaBrowserCompat$CustomActionResultReceiver.hashCode();
        int hashCode4 = this.IconCompatParcelizer.hashCode();
        int hashCode5 = this.read.hashCode();
        boolean z = this.MediaBrowserCompat$MediaItem;
        return (((((((((((((((((int) (j ^ (j >>> 32))) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (z ? 1 : 0)) * 31) + this.MediaBrowserCompat$ItemReceiver.hashCode()) * 31) + this.MediaBrowserCompat$SearchResultReceiver.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecipientDisplay{recipientId=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", subFunction='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append(", nickName='");
        sb.append(this.MediaMetadataCompat);
        sb.append('\'');
        sb.append(", bankName='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", bankLogo='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", accountNumber='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", selected=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", amount='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", errorDescription='");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
