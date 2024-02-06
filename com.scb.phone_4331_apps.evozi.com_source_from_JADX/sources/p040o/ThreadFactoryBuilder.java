package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ThreadFactoryBuilder */
public final class ThreadFactoryBuilder extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<ThreadFactoryBuilder> CREATOR = new Parcelable.Creator<ThreadFactoryBuilder>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ThreadFactoryBuilder(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ThreadFactoryBuilder[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public boolean MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: o.ThreadFactoryBuilder$1 */
    public final class C38611 implements Parcelable {
        public static final Parcelable.Creator<C38611> CREATOR = new Parcelable.Creator<C38611>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C38611(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C38611[i];
            }
        };
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public boolean MediaBrowserCompat$ItemReceiver;
        public String MediaDescriptionCompat;
        public double MediaMetadataCompat;
        public TimeLimiter read;
        public String write;

        public final int describeContents() {
            return 0;
        }

        private C38611() {
        }

        public static C38611 write() {
            return new C38611();
        }

        protected C38611(Parcel parcel) {
            this.write = parcel.readString();
            this.MediaDescriptionCompat = parcel.readString();
            this.MediaMetadataCompat = parcel.readDouble();
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
            this.IconCompatParcelizer = parcel.readString();
            this.MediaBrowserCompat$ItemReceiver = parcel.readByte() != 0;
            this.read = (TimeLimiter) parcel.readParcelable(zzxm.class.getClassLoader());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.write);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeDouble(this.MediaMetadataCompat);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeByte(this.MediaBrowserCompat$ItemReceiver ? (byte) 1 : 0);
            parcel.writeParcelable(this.read, i);
        }
    }

    private ThreadFactoryBuilder() {
    }

    public static ThreadFactoryBuilder IconCompatParcelizer() {
        return new ThreadFactoryBuilder();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeByte(this.MediaDescriptionCompat ? (byte) 1 : 0);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.RatingCompat);
        parcel.writeByte(this.MediaBrowserCompat$MediaItem ? (byte) 1 : 0);
    }

    protected ThreadFactoryBuilder(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        boolean z = true;
        this.MediaDescriptionCompat = parcel.readByte() != 0;
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.read = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readByte() == 0 ? false : z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThreadFactoryBuilder threadFactoryBuilder = (ThreadFactoryBuilder) obj;
        if (this.MediaDescriptionCompat != threadFactoryBuilder.MediaDescriptionCompat || this.MediaBrowserCompat$MediaItem != threadFactoryBuilder.MediaBrowserCompat$MediaItem) {
            return false;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? threadFactoryBuilder.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(threadFactoryBuilder.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 == null ? threadFactoryBuilder.IconCompatParcelizer != null : !str2.equals(threadFactoryBuilder.IconCompatParcelizer)) {
            return false;
        }
        String str3 = this.MediaMetadataCompat;
        if (str3 == null ? threadFactoryBuilder.MediaMetadataCompat != null : !str3.equals(threadFactoryBuilder.MediaMetadataCompat)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 == null ? threadFactoryBuilder.MediaBrowserCompat$ItemReceiver != null : !str4.equals(threadFactoryBuilder.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str5 = this.MediaSessionCompat$Token;
        if (str5 == null ? threadFactoryBuilder.MediaSessionCompat$Token != null : !str5.equals(threadFactoryBuilder.MediaSessionCompat$Token)) {
            return false;
        }
        String str6 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str6 == null ? threadFactoryBuilder.MediaBrowserCompat$SearchResultReceiver != null : !str6.equals(threadFactoryBuilder.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str7 = this.read;
        if (str7 == null ? threadFactoryBuilder.read != null : !str7.equals(threadFactoryBuilder.read)) {
            return false;
        }
        String str8 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str8 == null ? threadFactoryBuilder.MediaSessionCompat$ResultReceiverWrapper != null : !str8.equals(threadFactoryBuilder.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str9 = this.RatingCompat;
        String str10 = threadFactoryBuilder.RatingCompat;
        if (str9 != null) {
            return str9.equals(str10);
        }
        if (str10 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        boolean z = this.MediaDescriptionCompat;
        String str3 = this.MediaMetadataCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaSessionCompat$Token;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.RatingCompat;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + (z ? 1 : 0)) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i) * 31) + (this.MediaBrowserCompat$MediaItem ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BulkTransferSuccessItemDisplay{bankLogo='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", accountName='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", successFlag=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", nickName='");
        sb.append(this.MediaMetadataCompat);
        sb.append('\'');
        sb.append(", accountNumber='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", transferAmount='");
        sb.append(this.MediaSessionCompat$Token);
        sb.append('\'');
        sb.append(", fee='");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append('\'');
        sb.append(", errorMessage='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", transactionId='");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append('\'');
        sb.append(", transactionDateTime='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append(", isScheduled=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append('}');
        return sb.toString();
    }
}
