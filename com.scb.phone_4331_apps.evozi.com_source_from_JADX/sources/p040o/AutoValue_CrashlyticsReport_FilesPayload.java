package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.AutoValue_CrashlyticsReport_FilesPayload */
public final class AutoValue_CrashlyticsReport_FilesPayload extends remainingCapacity {
    public int MediaBrowserCompat$ItemReceiver;
    public List<Integer> read;

    public static AutoValue_CrashlyticsReport_FilesPayload IconCompatParcelizer() {
        return new AutoValue_CrashlyticsReport_FilesPayload();
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_FilesPayload$Builder */
    public class Builder extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<Builder> CREATOR = new Parcelable.Creator<Builder>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Builder(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Builder[i];
            }
        };

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2673x50fd9e4a;
        public String MediaSessionCompat$ResultReceiverWrapper;
        public String MediaSessionCompat$Token;

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
            parcel.writeString(this.f2673x50fd9e4a);
            parcel.writeString(this.MediaSessionCompat$Token);
        }

        public Builder() {
        }

        public Builder(Parcel parcel) {
            this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
            this.f2673x50fd9e4a = parcel.readString();
            this.MediaSessionCompat$Token = parcel.readString();
        }

        public Builder(String str, String str2) {
            this.f2673x50fd9e4a = str;
            this.MediaSessionCompat$Token = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Builder builder = (Builder) obj;
            String str = this.MediaSessionCompat$ResultReceiverWrapper;
            if (str == null ? builder.MediaSessionCompat$ResultReceiverWrapper != null : !str.equals(builder.MediaSessionCompat$ResultReceiverWrapper)) {
                return false;
            }
            String str2 = this.f2673x50fd9e4a;
            if (str2 == null ? builder.f2673x50fd9e4a != null : !str2.equals(builder.f2673x50fd9e4a)) {
                return false;
            }
            String str3 = this.MediaSessionCompat$Token;
            String str4 = builder.MediaSessionCompat$Token;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.MediaSessionCompat$ResultReceiverWrapper;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.f2673x50fd9e4a;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaSessionCompat$Token;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NationalIdDisplay{nationalIdImageUri='");
            sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
            sb.append('\'');
            sb.append(", laserCode='");
            sb.append(this.f2673x50fd9e4a);
            sb.append('\'');
            sb.append(", issueDate='");
            sb.append(this.MediaSessionCompat$Token);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }
}
