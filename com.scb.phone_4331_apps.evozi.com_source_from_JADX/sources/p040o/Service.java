package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.CrashlyticsReport;

/* renamed from: o.Service */
public final class Service extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<Service> CREATOR = new Parcelable.Creator<Service>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Service(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Service[i];
        }
    };
    public double IconCompatParcelizer;
    public double MediaBrowserCompat$CustomActionResultReceiver;
    public CrashlyticsReport.FilesPayload.File.Builder MediaBrowserCompat$ItemReceiver;
    public List<CrashlyticsReport.FilesPayload.File.Builder> MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public double f2779x50fd9e4a;
    public double MediaDescriptionCompat;
    public getContents MediaMetadataCompat;
    public isTerminated MediaSessionCompat$ResultReceiverWrapper;
    public long MediaSessionCompat$Token;
    public CrashlyticsReport.FilesPayload.File.Builder ParcelableVolumeInfo;
    public String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: o.Service$State */
    public final class State extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new State[i];
            }
        };
        public int IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$SearchResultReceiver;
        public String read;

        public final int describeContents() {
            return 0;
        }

        protected State(Parcel parcel) {
            this.IconCompatParcelizer = parcel.readInt();
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
            this.read = parcel.readString();
            this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.read);
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        }

        public State() {
        }

        public static State MediaBrowserCompat$ItemReceiver() {
            return new State();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            State state = (State) obj;
            if (this.IconCompatParcelizer != state.IconCompatParcelizer) {
                return false;
            }
            String str = this.MediaBrowserCompat$ItemReceiver;
            if (str == null ? state.MediaBrowserCompat$ItemReceiver != null : !str.equals(state.MediaBrowserCompat$ItemReceiver)) {
                return false;
            }
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 == null ? state.MediaBrowserCompat$CustomActionResultReceiver != null : !str2.equals(state.MediaBrowserCompat$CustomActionResultReceiver)) {
                return false;
            }
            String str3 = this.read;
            if (str3 == null ? state.read != null : !str3.equals(state.read)) {
                return false;
            }
            String str4 = this.MediaBrowserCompat$SearchResultReceiver;
            String str5 = state.MediaBrowserCompat$SearchResultReceiver;
            if (str4 != null) {
                return str4.equals(str5);
            }
            if (str5 != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.IconCompatParcelizer;
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i2 = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.read;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$SearchResultReceiver;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return (((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BulkTransferGroupDisplay{sortSequence=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", groupId='");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append('\'');
            sb.append(", groupName='");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append('\'');
            sb.append(", noOfRecipients='");
            sb.append(this.read);
            sb.append('\'');
            sb.append(", totalAmount='");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    public Service(List<CrashlyticsReport.FilesPayload.File.Builder> list, String str, String str2) {
        this.MediaBrowserCompat$MediaItem = list;
        this.RatingCompat = str;
        this.read = str2;
    }

    protected Service(Parcel parcel) {
        this.MediaBrowserCompat$MediaItem = parcel.createTypedArrayList(CrashlyticsReport.FilesPayload.File.Builder.CREATOR);
        this.RatingCompat = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = (CrashlyticsReport.FilesPayload.File.Builder) parcel.readParcelable(CrashlyticsReport.FilesPayload.File.Builder.class.getClassLoader());
        this.ParcelableVolumeInfo = (CrashlyticsReport.FilesPayload.File.Builder) parcel.readParcelable(CrashlyticsReport.FilesPayload.File.Builder.class.getClassLoader());
        this.MediaSessionCompat$ResultReceiverWrapper = (isTerminated) parcel.readParcelable(isTerminated.class.getClassLoader());
        this.IconCompatParcelizer = parcel.readDouble();
        this.f2779x50fd9e4a = parcel.readDouble();
        this.MediaSessionCompat$Token = parcel.readLong();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readDouble();
        this.MediaDescriptionCompat = parcel.readDouble();
        this.MediaMetadataCompat = (getContents) parcel.readParcelable(getContents.class.getClassLoader());
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readByte() != 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.read);
        parcel.writeParcelable(this.MediaBrowserCompat$ItemReceiver, i);
        parcel.writeParcelable(this.ParcelableVolumeInfo, i);
        parcel.writeParcelable(this.MediaSessionCompat$ResultReceiverWrapper, i);
        parcel.writeDouble(this.IconCompatParcelizer);
        parcel.writeDouble(this.f2779x50fd9e4a);
        parcel.writeLong(this.MediaSessionCompat$Token);
        parcel.writeDouble(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeDouble(this.MediaDescriptionCompat);
        parcel.writeParcelable(this.MediaMetadataCompat, i);
        parcel.writeByte(this.MediaBrowserCompat$SearchResultReceiver ? (byte) 1 : 0);
    }
}
