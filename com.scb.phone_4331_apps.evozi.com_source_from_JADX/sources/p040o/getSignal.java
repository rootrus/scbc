package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;

/* renamed from: o.getSignal */
public final class getSignal extends AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder {
    public static final Parcelable.Creator<getSignal> CREATOR = new Parcelable.Creator<getSignal>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getSignal(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getSignal[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public String RatingCompat;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ getSignal(read read2, byte b) {
        this(read2);
    }

    private getSignal(read read2) {
        read(false);
        this.f2675x50fd9e4a = read2.MediaDescriptionCompat;
        this.IconCompatParcelizer = read2.IconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = read2.MediaBrowserCompat$CustomActionResultReceiver;
        this.read = read2.read;
        this.MediaBrowserCompat$SearchResultReceiver = read2.MediaMetadataCompat;
        this.write = read2.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$MediaItem = read2.MediaSessionCompat$Token;
        this.MediaMetadataCompat = false;
        this.RatingCompat = read2.RatingCompat;
        this.MediaDescriptionCompat = read2.MediaBrowserCompat$SearchResultReceiver;
        this.MediaBrowserCompat$ItemReceiver = read2.write;
    }

    public static read MediaBrowserCompat$CustomActionResultReceiver() {
        return new read((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getSignal getsignal = (getSignal) obj;
        if (this.MediaMetadataCompat != getsignal.MediaMetadataCompat || this.MediaDescriptionCompat != getsignal.MediaDescriptionCompat) {
            return false;
        }
        String str = this.IconCompatParcelizer;
        if (str == null ? getsignal.IconCompatParcelizer != null : !str.equals(getsignal.IconCompatParcelizer)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 == null ? getsignal.MediaBrowserCompat$CustomActionResultReceiver != null : !str2.equals(getsignal.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str3 = this.read;
        if (str3 == null ? getsignal.read != null : !str3.equals(getsignal.read)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str4 == null ? getsignal.MediaBrowserCompat$SearchResultReceiver != null : !str4.equals(getsignal.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str5 = this.write;
        if (str5 == null ? getsignal.write != null : !str5.equals(getsignal.write)) {
            return false;
        }
        String str6 = this.MediaBrowserCompat$MediaItem;
        if (str6 == null ? getsignal.MediaBrowserCompat$MediaItem != null : !str6.equals(getsignal.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str7 = this.RatingCompat;
        String str8 = getsignal.RatingCompat;
        if (str7 != null) {
            return str7.equals(str8);
        }
        if (str8 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$MediaItem;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        boolean z = this.MediaMetadataCompat;
        String str7 = this.RatingCompat;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (z ? 1 : 0)) * 31) + i) * 31) + (this.MediaDescriptionCompat ? 1 : 0);
    }

    /* renamed from: o.getSignal$read */
    public static final class read {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public boolean MediaBrowserCompat$MediaItem;
        public boolean MediaBrowserCompat$SearchResultReceiver;
        public int MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public String MediaSessionCompat$Token;
        public String RatingCompat;
        public String read;
        public String write;

        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeByte(this.MediaMetadataCompat ? (byte) 1 : 0);
        parcel.writeString(this.RatingCompat);
        parcel.writeByte(this.MediaSessionCompat$Token ? (byte) 1 : 0);
        parcel.writeInt(this.f2675x50fd9e4a);
        parcel.writeByte(this.MediaDescriptionCompat ? (byte) 1 : 0);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    protected getSignal(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        boolean z = true;
        this.MediaMetadataCompat = parcel.readByte() != 0;
        this.RatingCompat = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readByte() != 0;
        this.f2675x50fd9e4a = parcel.readInt();
        this.MediaDescriptionCompat = parcel.readByte() == 0 ? false : z;
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }
}
