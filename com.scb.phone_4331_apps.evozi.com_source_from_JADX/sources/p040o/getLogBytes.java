package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.QueueFileLogStore;

/* renamed from: o.getLogBytes */
public final class getLogBytes extends remainingCapacity implements Parcelable {
    public static final read CREATOR = new read((byte) 0);
    public final QueueFileLogStore.C37461 IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$MediaItem;
    private final int MediaBrowserCompat$SearchResultReceiver;
    private final String MediaDescriptionCompat;
    private final String RatingCompat;
    public final String read;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLogBytes)) {
            return false;
        }
        getLogBytes getlogbytes = (getLogBytes) obj;
        return this.MediaBrowserCompat$SearchResultReceiver == getlogbytes.MediaBrowserCompat$SearchResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getlogbytes.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getlogbytes.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getlogbytes.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getlogbytes.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getlogbytes.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getlogbytes.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getlogbytes.IconCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$SearchResultReceiver;
        String str = this.RatingCompat;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        QueueFileLogStore.C37461 r8 = this.IconCompatParcelizer;
        if (r8 != null) {
            i2 = r8.hashCode();
        }
        return (((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantWalletSweepDetailDisplay(pageNumber=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", walletId=");
        sb.append(this.RatingCompat);
        sb.append(", nickname=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", productType=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", linkedAccountNumber=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", linkedAccountName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", linkedAccountType=");
        sb.append(this.read);
        sb.append(", transactions=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public getLogBytes(int i, String str, String str2, String str3, String str4, String str5, String str6, QueueFileLogStore.C37461 r8) {
        this.MediaBrowserCompat$SearchResultReceiver = i;
        this.RatingCompat = str;
        this.MediaDescriptionCompat = str2;
        this.MediaBrowserCompat$MediaItem = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.read = str6;
        this.IconCompatParcelizer = r8;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public getLogBytes(Parcel parcel) {
        this(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (QueueFileLogStore.C37461) parcel.readParcelable(QueueFileLogStore.C37461.class.getClassLoader()));
        onGetStartedClick.write((Object) parcel, "parcel");
        this.write = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeParcelable(this.IconCompatParcelizer, i);
        parcel.writeInt(this.write ? 1 : 0);
    }

    /* renamed from: o.getLogBytes$read */
    public static final class read implements Parcelable.Creator<getLogBytes> {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new getLogBytes(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getLogBytes[i];
        }
    }
}
