package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.CrashlyticsUncaughtExceptionHandler */
public final class CrashlyticsUncaughtExceptionHandler {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrashlyticsUncaughtExceptionHandler)) {
            return false;
        }
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = (CrashlyticsUncaughtExceptionHandler) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) crashlyticsUncaughtExceptionHandler.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) crashlyticsUncaughtExceptionHandler.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) crashlyticsUncaughtExceptionHandler.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) crashlyticsUncaughtExceptionHandler.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) crashlyticsUncaughtExceptionHandler.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HighlightDisplay(picturePath=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", caption=");
        sb.append(this.write);
        sb.append(", header=");
        sb.append(this.read);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", webviewUrl=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public CrashlyticsUncaughtExceptionHandler(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "picturePath");
        onGetStartedClick.write((Object) str2, "caption");
        onGetStartedClick.write((Object) str3, "header");
        onGetStartedClick.write((Object) str4, "description");
        onGetStartedClick.write((Object) str5, "webviewUrl");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
        this.read = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.IconCompatParcelizer = str5;
    }

    /* renamed from: o.CrashlyticsUncaughtExceptionHandler$CrashListener */
    public final class CrashListener extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<CrashListener> CREATOR = new Parcelable.Creator<CrashListener>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new CrashListener(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new CrashListener[i];
            }
        };
        public String IconCompatParcelizer;
        public int MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public int MediaBrowserCompat$MediaItem;
        public int MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private String f2704x50fd9e4a;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        private String MediaSessionCompat$QueueItem;
        public String MediaSessionCompat$ResultReceiverWrapper;
        private String MediaSessionCompat$Token;
        private String ParcelableVolumeInfo;
        public String RatingCompat;
        public String read;

        public final int describeContents() {
            return 0;
        }

        protected CrashListener(Parcel parcel) {
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readInt();
            this.MediaBrowserCompat$MediaItem = parcel.readInt();
            this.MediaBrowserCompat$SearchResultReceiver = parcel.readInt();
            this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
            this.MediaMetadataCompat = parcel.readString();
            this.RatingCompat = parcel.readString();
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
            this.MediaSessionCompat$QueueItem = parcel.readString();
            this.read = parcel.readString();
            this.MediaDescriptionCompat = parcel.readString();
            this.IconCompatParcelizer = parcel.readString();
            this.f2704x50fd9e4a = parcel.readString();
            this.MediaSessionCompat$Token = parcel.readString();
            this.ParcelableVolumeInfo = parcel.readString();
        }

        private CrashListener() {
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeInt(this.MediaBrowserCompat$MediaItem);
            parcel.writeInt(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeString(this.RatingCompat);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.MediaSessionCompat$QueueItem);
            parcel.writeString(this.read);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.f2704x50fd9e4a);
            parcel.writeString(this.MediaSessionCompat$Token);
            parcel.writeString(this.ParcelableVolumeInfo);
        }
    }
}
