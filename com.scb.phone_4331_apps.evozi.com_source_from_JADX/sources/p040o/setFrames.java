package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setFrames */
public final class setFrames implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final getCausedBy MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final int f2941x50fd9e4a;
    public boolean MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompat$ResultReceiverWrapper;
    public final String MediaSessionCompat$Token;
    public final boolean ParcelableVolumeInfo;
    public final boolean RatingCompat;
    public final String read;
    public final String write;

    /* renamed from: o.setFrames$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            onGetStartedClick.write((Object) parcel2, "in");
            return new setFrames(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0 ? (getCausedBy) getCausedBy.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new setFrames[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFrames)) {
            return false;
        }
        setFrames setframes = (setFrames) obj;
        return this.f2941x50fd9e4a == setframes.f2941x50fd9e4a && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setframes.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) setframes.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) setframes.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setframes.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setframes.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setframes.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setframes.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setframes.MediaBrowserCompat$ItemReceiver) && this.ParcelableVolumeInfo == setframes.ParcelableVolumeInfo && this.RatingCompat == setframes.RatingCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setframes.MediaBrowserCompat$SearchResultReceiver) && this.MediaDescriptionCompat == setframes.MediaDescriptionCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setframes.IconCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.f2941x50fd9e4a;
        String str = this.MediaMetadataCompat;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaSessionCompat$Token;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        boolean z = this.ParcelableVolumeInfo;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.RatingCompat;
        if (z3) {
            z3 = true;
        }
        getCausedBy getcausedby = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode9 = getcausedby != null ? getcausedby.hashCode() : 0;
        boolean z4 = this.MediaDescriptionCompat;
        if (!z4) {
            z2 = z4;
        }
        String str9 = this.IconCompatParcelizer;
        if (str9 != null) {
            i2 = str9.hashCode();
        }
        return (((((((((((((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (z ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + hashCode9) * 31) + (z2 ? 1 : 0)) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HistoryTransactionDisplay(sortSequence=");
        sb.append(this.f2941x50fd9e4a);
        sb.append(", id=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", transactionDateTime=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", serviceNumber=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", referenceNo1=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", accountTo=");
        sb.append(this.read);
        sb.append(", accountToName=");
        sb.append(this.write);
        sb.append(", bankLogo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", amount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", repeatFlag=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", regenerateFlag=");
        sb.append(this.RatingCompat);
        sb.append(", biller=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", expanded=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", accountToNumber=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.f2941x50fd9e4a);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.read);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeInt(this.ParcelableVolumeInfo ? 1 : 0);
        parcel.writeInt(this.RatingCompat ? 1 : 0);
        getCausedBy getcausedby = this.MediaBrowserCompat$SearchResultReceiver;
        if (getcausedby != null) {
            parcel.writeInt(1);
            getcausedby.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.MediaDescriptionCompat ? 1 : 0);
        parcel.writeString(this.IconCompatParcelizer);
    }

    public setFrames(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, getCausedBy getcausedby, boolean z3, String str9) {
        onGetStartedClick.write((Object) str, Name.MARK);
        onGetStartedClick.write((Object) str9, "accountToNumber");
        this.f2941x50fd9e4a = i;
        this.MediaMetadataCompat = str;
        this.MediaSessionCompat$Token = str2;
        this.MediaSessionCompat$ResultReceiverWrapper = str3;
        this.MediaBrowserCompat$MediaItem = str4;
        this.read = str5;
        this.write = str6;
        this.MediaBrowserCompat$CustomActionResultReceiver = str7;
        this.MediaBrowserCompat$ItemReceiver = str8;
        this.ParcelableVolumeInfo = z;
        this.RatingCompat = z2;
        this.MediaBrowserCompat$SearchResultReceiver = getcausedby;
        this.MediaDescriptionCompat = z3;
        this.IconCompatParcelizer = str9;
    }

    public /* synthetic */ setFrames(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, getCausedBy getcausedby, String str9) {
        this(i, str, str2, str3, str4, str5, str6, str7, str8, z, z2, getcausedby, false, str9);
    }
}
