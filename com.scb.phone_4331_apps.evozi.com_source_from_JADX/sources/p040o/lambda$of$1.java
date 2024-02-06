package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.lambda$of$1 */
public final class lambda$of$1 implements Parcelable {
    public static final Parcelable.Creator<lambda$of$1> CREATOR = new Parcelable.Creator<lambda$of$1>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new lambda$of$1(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new lambda$of$1[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public intoSet MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2886x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String RatingCompat;
    public int read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public lambda$of$1() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.MediaBrowserCompat$SearchResultReceiver, i);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeInt(this.read);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.f2886x50fd9e4a);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.write);
        parcel.writeByte(this.MediaBrowserCompat$ItemReceiver ? (byte) 1 : 0);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
    }

    protected lambda$of$1(Parcel parcel) {
        this.MediaBrowserCompat$SearchResultReceiver = (intoSet) parcel.readParcelable(intoSet.class.getClassLoader());
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readInt();
        this.MediaMetadataCompat = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.f2886x50fd9e4a = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readByte() != 0;
        this.MediaSessionCompat$QueueItem = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambda$of$1)) {
            return false;
        }
        lambda$of$1 lambda_of_1 = (lambda$of$1) obj;
        if (this.read != lambda_of_1.read || this.MediaBrowserCompat$ItemReceiver != lambda_of_1.MediaBrowserCompat$ItemReceiver) {
            return false;
        }
        intoSet intoset = this.MediaBrowserCompat$SearchResultReceiver;
        if (intoset == null ? lambda_of_1.MediaBrowserCompat$SearchResultReceiver != null : !intoset.equals(lambda_of_1.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? lambda_of_1.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(lambda_of_1.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 == null ? lambda_of_1.IconCompatParcelizer != null : !str2.equals(lambda_of_1.IconCompatParcelizer)) {
            return false;
        }
        String str3 = this.MediaMetadataCompat;
        if (str3 == null ? lambda_of_1.MediaMetadataCompat != null : !str3.equals(lambda_of_1.MediaMetadataCompat)) {
            return false;
        }
        String str4 = this.RatingCompat;
        if (str4 == null ? lambda_of_1.RatingCompat != null : !str4.equals(lambda_of_1.RatingCompat)) {
            return false;
        }
        String str5 = this.MediaDescriptionCompat;
        if (str5 == null ? lambda_of_1.MediaDescriptionCompat != null : !str5.equals(lambda_of_1.MediaDescriptionCompat)) {
            return false;
        }
        String str6 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str6 == null ? lambda_of_1.MediaSessionCompat$ResultReceiverWrapper != null : !str6.equals(lambda_of_1.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str7 = this.f2886x50fd9e4a;
        if (str7 == null ? lambda_of_1.f2886x50fd9e4a != null : !str7.equals(lambda_of_1.f2886x50fd9e4a)) {
            return false;
        }
        String str8 = this.MediaBrowserCompat$MediaItem;
        if (str8 == null ? lambda_of_1.MediaBrowserCompat$MediaItem != null : !str8.equals(lambda_of_1.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str9 = this.write;
        if (str9 == null ? lambda_of_1.write != null : !str9.equals(lambda_of_1.write)) {
            return false;
        }
        String str10 = this.MediaSessionCompat$QueueItem;
        if (str10 != null) {
            return str10.equals(lambda_of_1.MediaSessionCompat$QueueItem);
        }
        if (lambda_of_1.MediaSessionCompat$QueueItem != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        intoSet intoset = this.MediaBrowserCompat$SearchResultReceiver;
        int i11 = 0;
        if (intoset != null) {
            i = intoset.hashCode();
        } else {
            i = 0;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = this.read;
        String str3 = this.MediaMetadataCompat;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        String str4 = this.RatingCompat;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        String str5 = this.MediaDescriptionCompat;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        String str6 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str6 != null) {
            i7 = str6.hashCode();
        } else {
            i7 = 0;
        }
        String str7 = this.f2886x50fd9e4a;
        if (str7 != null) {
            i8 = str7.hashCode();
        } else {
            i8 = 0;
        }
        String str8 = this.MediaBrowserCompat$MediaItem;
        if (str8 != null) {
            i9 = str8.hashCode();
        } else {
            i9 = 0;
        }
        String str9 = this.write;
        if (str9 != null) {
            i10 = str9.hashCode();
        } else {
            i10 = 0;
        }
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        String str10 = this.MediaSessionCompat$QueueItem;
        if (str10 != null) {
            i11 = str10.hashCode();
        }
        return (((((((((((((((((((((((i * 31) + i2) * 31) + i3) * 31) + i12) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + i9) * 31) + i10) * 31) + (z ? 1 : 0)) * 31) + i11;
    }
}
