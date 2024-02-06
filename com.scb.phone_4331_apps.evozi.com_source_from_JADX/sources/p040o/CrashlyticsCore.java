package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.CrashlyticsController;

/* renamed from: o.CrashlyticsCore */
public final class CrashlyticsCore {
    public final boolean IconCompatParcelizer;
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final List<CrashlyticsController.SessionPartFileFilter> read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrashlyticsCore)) {
            return false;
        }
        CrashlyticsCore crashlyticsCore = (CrashlyticsCore) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == crashlyticsCore.MediaBrowserCompat$CustomActionResultReceiver && this.IconCompatParcelizer == crashlyticsCore.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) crashlyticsCore.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) crashlyticsCore.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) crashlyticsCore.read);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = this.IconCompatParcelizer;
        if (z) {
            z = true;
        }
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<CrashlyticsController.SessionPartFileFilter> list = this.read;
        if (list != null) {
            i2 = list.hashCode();
        }
        return (((((((i * 31) + (z ? 1 : 0)) * 31) + hashCode) * 31) + hashCode2) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InsuranceInfoDisplay(id=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", isSelected=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", partnerLabel=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", partnerIconUrl=");
        sb.append(this.write);
        sb.append(", policyInfoList=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public CrashlyticsCore(int i, boolean z, String str, String str2, List<CrashlyticsController.SessionPartFileFilter> list) {
        onGetStartedClick.write((Object) str, "partnerLabel");
        onGetStartedClick.write((Object) str2, "partnerIconUrl");
        onGetStartedClick.write((Object) list, "policyInfoList");
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
        this.read = list;
    }

    /* renamed from: o.CrashlyticsCore$4 */
    public final class C32494 implements Parcelable {
        public static final Parcelable.Creator<C32494> CREATOR = new Parcelable.Creator<C32494>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C32494(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C32494[i];
            }
        };
        public getDeviceArchitecture IconCompatParcelizer;
        public getDiskUsed MediaBrowserCompat$CustomActionResultReceiver;
        public LocationCallback MediaBrowserCompat$ItemReceiver;

        public final int describeContents() {
            return 0;
        }

        public /* synthetic */ C32494(write write2, byte b) {
            this(write2);
        }

        private C32494(write write2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = write2.MediaBrowserCompat$ItemReceiver;
            this.IconCompatParcelizer = write2.read;
            this.MediaBrowserCompat$ItemReceiver = write2.IconCompatParcelizer;
        }

        public static write write() {
            return new write((byte) 0);
        }

        /* renamed from: o.CrashlyticsCore$4$write */
        public static final class write {
            public LocationCallback IconCompatParcelizer;
            public getDiskUsed MediaBrowserCompat$ItemReceiver;
            public getDeviceArchitecture read;

            /* synthetic */ write(byte b) {
                this();
            }

            private write() {
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, i);
            parcel.writeParcelable(this.IconCompatParcelizer, i);
            LocationCallback locationCallback = this.MediaBrowserCompat$ItemReceiver;
            parcel.writeInt(locationCallback == null ? -1 : locationCallback.ordinal());
        }

        protected C32494(Parcel parcel) {
            LocationCallback locationCallback;
            this.MediaBrowserCompat$CustomActionResultReceiver = (getDiskUsed) parcel.readParcelable(getDiskUsed.class.getClassLoader());
            this.IconCompatParcelizer = (getDeviceArchitecture) parcel.readParcelable(getDeviceArchitecture.class.getClassLoader());
            int readInt = parcel.readInt();
            if (readInt == -1) {
                locationCallback = null;
            } else {
                locationCallback = LocationCallback.values()[readInt];
            }
            this.MediaBrowserCompat$ItemReceiver = locationCallback;
        }
    }

    /* renamed from: o.CrashlyticsCore$5 */
    public final class C32515 extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<C32515> CREATOR = new Parcelable.Creator<C32515>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C32515(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C32515[i];
            }
        };
        public String IconCompatParcelizer;
        public List<markInitializationStarted> MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public int MediaBrowserCompat$SearchResultReceiver;
        public int MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public String RatingCompat;
        public String read;

        public final int describeContents() {
            return 0;
        }

        public static C32515 read() {
            return new C32515();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.RatingCompat);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.read);
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeInt(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeInt(this.MediaDescriptionCompat);
        }

        public C32515() {
        }

        protected C32515(Parcel parcel) {
            this.RatingCompat = parcel.readString();
            this.IconCompatParcelizer = parcel.readString();
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
            this.read = parcel.readString();
            this.MediaMetadataCompat = parcel.readString();
            this.MediaDescriptionCompat = parcel.readInt();
            this.MediaBrowserCompat$SearchResultReceiver = parcel.readInt();
        }
    }

    /* renamed from: o.CrashlyticsCore$1 */
    public final class C32441 extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<C32441> CREATOR = new Parcelable.Creator<C32441>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C32441(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C32441[i];
            }
        };
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public int MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2693x50fd9e4a;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public String MediaSessionCompat$ResultReceiverWrapper;
        public int RatingCompat;
        public String read;

        public final int describeContents() {
            return 0;
        }

        public C32441() {
        }

        protected C32441(Parcel parcel) {
            this.IconCompatParcelizer = parcel.readString();
            this.MediaDescriptionCompat = parcel.readString();
            this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
            this.f2693x50fd9e4a = parcel.readString();
            this.MediaMetadataCompat = parcel.readString();
            this.MediaBrowserCompat$SearchResultReceiver = parcel.readInt();
            this.RatingCompat = parcel.readInt();
            this.MediaBrowserCompat$MediaItem = parcel.readString();
            this.read = parcel.readString();
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
            parcel.writeString(this.f2693x50fd9e4a);
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeInt(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeInt(this.RatingCompat);
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
            parcel.writeString(this.read);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        }

        public static C32441 MediaBrowserCompat$CustomActionResultReceiver() {
            return new C32441();
        }
    }

    /* renamed from: o.CrashlyticsCore$3 */
    public final class C32473 extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<C32473> CREATOR = new Parcelable.Creator<C32473>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C32473(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C32473[i];
            }
        };
        private String AlertController$RecycleListView;
        public String IconCompatParcelizer;
        public String Keep;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public boolean MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2694x50fd9e4a;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public String MediaSessionCompat$QueueItem;
        public String MediaSessionCompat$ResultReceiverWrapper;
        public String MediaSessionCompat$Token;
        public Integer ParcelableVolumeInfo;
        public String RatingCompat;
        public String read;
        private String setHasDecor;

        public final int describeContents() {
            return 0;
        }

        public C32473() {
        }

        protected C32473(Parcel parcel) {
            this.ParcelableVolumeInfo = Integer.valueOf(parcel.readInt());
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
            this.MediaSessionCompat$QueueItem = parcel.readString();
            this.MediaSessionCompat$Token = parcel.readString();
            this.Keep = parcel.readString();
            this.MediaDescriptionCompat = parcel.readString();
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
            this.MediaMetadataCompat = parcel.readString();
            this.AlertController$RecycleListView = parcel.readString();
            this.MediaBrowserCompat$MediaItem = parcel.readString();
            this.f2694x50fd9e4a = parcel.readString();
            this.setHasDecor = parcel.readString();
            this.RatingCompat = parcel.readString();
            this.IconCompatParcelizer = parcel.readString();
            this.read = parcel.readString();
            this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.ParcelableVolumeInfo.intValue());
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.MediaSessionCompat$QueueItem);
            parcel.writeString(this.MediaSessionCompat$Token);
            parcel.writeString(this.Keep);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeString(this.AlertController$RecycleListView);
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
            parcel.writeString(this.f2694x50fd9e4a);
            parcel.writeString(this.setHasDecor);
            parcel.writeString(this.RatingCompat);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.read);
            parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        }

        public static C32473 MediaBrowserCompat$ItemReceiver() {
            return new C32473();
        }
    }

    public static /* synthetic */ CrashlyticsCore read(CrashlyticsCore crashlyticsCore, boolean z) {
        int i = crashlyticsCore.MediaBrowserCompat$CustomActionResultReceiver;
        String str = crashlyticsCore.MediaBrowserCompat$ItemReceiver;
        String str2 = crashlyticsCore.write;
        List<CrashlyticsController.SessionPartFileFilter> list = crashlyticsCore.read;
        onGetStartedClick.write((Object) str, "partnerLabel");
        onGetStartedClick.write((Object) str2, "partnerIconUrl");
        onGetStartedClick.write((Object) list, "policyInfoList");
        return new CrashlyticsCore(i, z, str, str2, list);
    }
}
