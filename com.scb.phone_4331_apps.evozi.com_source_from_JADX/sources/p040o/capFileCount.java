package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: o.capFileCount */
public class capFileCount extends ForwardingFuture implements Parcelable {
    public static final Parcelable.Creator<capFileCount> CREATOR = new Parcelable.Creator<capFileCount>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new capFileCount(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new capFileCount[i];
        }
    };
    public CharSequence IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean f2804x50fd9e4a;
    public boolean MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public boolean MediaSessionCompat$QueueItem;
    public String RatingCompat;
    public String read;

    public /* synthetic */ capFileCount(capFileCount$MediaBrowserCompat$CustomActionResultReceiver capfilecount_mediabrowsercompat_customactionresultreceiver, byte b) {
        this(capfilecount_mediabrowsercompat_customactionresultreceiver);
    }

    private capFileCount(capFileCount$MediaBrowserCompat$CustomActionResultReceiver capfilecount_mediabrowsercompat_customactionresultreceiver) {
        super(CrashlyticsReportJsonTransform$$Lambda$1.SIMPLE_BOTTOM);
        this.RatingCompat = capfilecount_mediabrowsercompat_customactionresultreceiver.MediaMetadataCompat;
        this.read = capfilecount_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$ItemReceiver = capfilecount_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        this.IconCompatParcelizer = capfilecount_mediabrowsercompat_customactionresultreceiver.read;
        this.MediaMetadataCompat = capfilecount_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$SearchResultReceiver = capfilecount_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver;
        this.f2804x50fd9e4a = capfilecount_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$Token;
        this.MediaBrowserCompat$MediaItem = capfilecount_mediabrowsercompat_customactionresultreceiver.RatingCompat;
        this.MediaDescriptionCompat = capfilecount_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem;
        this.MediaSessionCompat$QueueItem = capfilecount_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat;
        this.MediaBrowserCompat$CustomActionResultReceiver = capfilecount_mediabrowsercompat_customactionresultreceiver.write;
    }

    public static capFileCount$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver() {
        return new capFileCount$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    }

    public final void write(Parcel parcel, int i) {
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        TextUtils.writeToParcel(this.IconCompatParcelizer, parcel, i);
        parcel.writeInt(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeByte(this.f2804x50fd9e4a ? (byte) 1 : 0);
        parcel.writeByte(this.MediaBrowserCompat$MediaItem ? (byte) 1 : 0);
        parcel.writeByte(this.MediaDescriptionCompat ? (byte) 1 : 0);
        parcel.writeByte(this.MediaSessionCompat$QueueItem ? (byte) 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        capFileCount capfilecount = (capFileCount) obj;
        if (this.MediaSessionCompat$QueueItem != capfilecount.MediaSessionCompat$QueueItem || this.MediaMetadataCompat != capfilecount.MediaMetadataCompat || this.f2804x50fd9e4a != capfilecount.f2804x50fd9e4a || this.MediaBrowserCompat$MediaItem != capfilecount.MediaBrowserCompat$MediaItem || this.MediaDescriptionCompat != capfilecount.MediaDescriptionCompat || this.MediaBrowserCompat$CustomActionResultReceiver != capfilecount.MediaBrowserCompat$CustomActionResultReceiver) {
            return false;
        }
        String str = this.RatingCompat;
        if (str == null ? capfilecount.RatingCompat != null : !str.equals(capfilecount.RatingCompat)) {
            return false;
        }
        String str2 = this.read;
        if (str2 == null ? capfilecount.read != null : !str2.equals(capfilecount.read)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 == null ? capfilecount.MediaBrowserCompat$ItemReceiver != null : !str3.equals(capfilecount.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        CharSequence charSequence = this.IconCompatParcelizer;
        if (charSequence == null ? capfilecount.IconCompatParcelizer != null : !charSequence.equals(capfilecount.IconCompatParcelizer)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        String str5 = capfilecount.MediaBrowserCompat$SearchResultReceiver;
        if (str4 != null) {
            return str4.equals(str5);
        }
        if (str5 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = super.hashCode();
        String str = this.RatingCompat;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        CharSequence charSequence = this.IconCompatParcelizer;
        int hashCode5 = charSequence != null ? charSequence.hashCode() : 0;
        boolean z = this.MediaSessionCompat$QueueItem;
        int i2 = this.MediaMetadataCompat;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (z ? 1 : 0)) * 31) + i2) * 31) + i) * 31) + (this.f2804x50fd9e4a ? 1 : 0)) * 31) + (this.MediaBrowserCompat$MediaItem ? 1 : 0)) * 31) + (this.MediaDescriptionCompat ? 1 : 0)) * 31) + this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItemSimpleBottomDisplay{componentLeftLabel='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append(", componentBottomLabel='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", componentBottomExtraLabel='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", componentBottomLongLabel=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", componentIcon='");
        sb.append(this.MediaMetadataCompat);
        sb.append('\'');
        sb.append(", componentIconLabel='");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append('\'');
        sb.append(", usePSLfont='");
        sb.append(this.f2804x50fd9e4a);
        sb.append('\'');
        sb.append(", isNoPaddingBottom='");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append('\'');
        sb.append(", isNoPaddingTop='");
        sb.append(this.MediaDescriptionCompat);
        sb.append('\'');
        sb.append(", shouldHideSectionInSlip='");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    protected capFileCount(Parcel parcel) {
        super(parcel);
        this.RatingCompat = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.MediaMetadataCompat = parcel.readInt();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        boolean z = true;
        this.f2804x50fd9e4a = parcel.readByte() != 0;
        this.MediaBrowserCompat$MediaItem = parcel.readByte() != 0;
        this.MediaDescriptionCompat = parcel.readByte() != 0;
        this.MediaSessionCompat$QueueItem = parcel.readByte() == 0 ? false : z;
    }
}
