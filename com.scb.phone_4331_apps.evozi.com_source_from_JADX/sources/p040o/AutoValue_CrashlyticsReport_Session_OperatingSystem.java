package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_OperatingSystem */
public class AutoValue_CrashlyticsReport_Session_OperatingSystem extends remainingCapacity {
    public int IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public String RatingCompat;
    public int read;

    public AutoValue_CrashlyticsReport_Session_OperatingSystem(int i) {
        this.read = i;
    }

    public static AutoValue_CrashlyticsReport_Session_OperatingSystem IconCompatParcelizer(int i) {
        return new AutoValue_CrashlyticsReport_Session_OperatingSystem(i);
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_OperatingSystem$Builder */
    public final class Builder extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<Builder> CREATOR = new Parcelable.Creator<Builder>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Builder(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Builder[i];
            }
        };
        public int IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public String RatingCompat;
        public String read;

        public final int describeContents() {
            return 0;
        }

        public Builder() {
        }

        protected Builder(Parcel parcel) {
            this.MediaBrowserCompat$MediaItem = parcel.readString();
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
            this.MediaMetadataCompat = parcel.readString();
            this.MediaDescriptionCompat = parcel.readString();
            this.IconCompatParcelizer = parcel.readInt();
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
            this.RatingCompat = parcel.readString();
            this.read = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeInt(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.RatingCompat);
            parcel.writeString(this.read);
        }

        public static Builder write() {
            return new Builder();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Builder builder = (Builder) obj;
            if (this.IconCompatParcelizer != builder.IconCompatParcelizer) {
                return false;
            }
            String str = this.MediaBrowserCompat$MediaItem;
            if (str == null ? builder.MediaBrowserCompat$MediaItem != null : !str.equals(builder.MediaBrowserCompat$MediaItem)) {
                return false;
            }
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            if (str2 == null ? builder.MediaBrowserCompat$ItemReceiver != null : !str2.equals(builder.MediaBrowserCompat$ItemReceiver)) {
                return false;
            }
            String str3 = this.MediaMetadataCompat;
            if (str3 == null ? builder.MediaMetadataCompat != null : !str3.equals(builder.MediaMetadataCompat)) {
                return false;
            }
            String str4 = this.MediaDescriptionCompat;
            if (str4 == null ? builder.MediaDescriptionCompat != null : !str4.equals(builder.MediaDescriptionCompat)) {
                return false;
            }
            String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str5 == null ? builder.MediaBrowserCompat$CustomActionResultReceiver != null : !str5.equals(builder.MediaBrowserCompat$CustomActionResultReceiver)) {
                return false;
            }
            String str6 = this.RatingCompat;
            if (str6 == null ? builder.RatingCompat != null : !str6.equals(builder.RatingCompat)) {
                return false;
            }
            String str7 = this.read;
            String str8 = builder.read;
            if (str7 != null) {
                return str7.equals(str8);
            }
            if (str8 != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$MediaItem;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaMetadataCompat;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaDescriptionCompat;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            int i2 = this.IconCompatParcelizer;
            String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.RatingCompat;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.read;
            if (str7 != null) {
                i = str7.hashCode();
            }
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
        }
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_OperatingSystem$1 */
    public final class C30991 extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<C30991> CREATOR = new Parcelable.Creator<C30991>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C30991(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C30991[i];
            }
        };
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public int RatingCompat;
        public String read;

        public final int describeContents() {
            return 0;
        }

        public C30991() {
        }

        protected C30991(Parcel parcel) {
            this.MediaBrowserCompat$MediaItem = parcel.readString();
            this.RatingCompat = parcel.readInt();
            this.MediaMetadataCompat = parcel.readString();
            this.MediaDescriptionCompat = parcel.readString();
            this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
            this.read = parcel.readString();
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
            this.IconCompatParcelizer = parcel.readString();
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
            parcel.writeInt(this.RatingCompat);
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeString(this.read);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        }

        public static C30991 MediaBrowserCompat$CustomActionResultReceiver() {
            return new C30991();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C30991 r5 = (C30991) obj;
            if (this.RatingCompat != r5.RatingCompat) {
                return false;
            }
            String str = this.MediaBrowserCompat$MediaItem;
            if (str == null ? r5.MediaBrowserCompat$MediaItem != null : !str.equals(r5.MediaBrowserCompat$MediaItem)) {
                return false;
            }
            String str2 = this.MediaMetadataCompat;
            if (str2 == null ? r5.MediaMetadataCompat != null : !str2.equals(r5.MediaMetadataCompat)) {
                return false;
            }
            String str3 = this.MediaDescriptionCompat;
            if (str3 == null ? r5.MediaDescriptionCompat != null : !str3.equals(r5.MediaDescriptionCompat)) {
                return false;
            }
            String str4 = this.MediaBrowserCompat$SearchResultReceiver;
            if (str4 == null ? r5.MediaBrowserCompat$SearchResultReceiver != null : !str4.equals(r5.MediaBrowserCompat$SearchResultReceiver)) {
                return false;
            }
            String str5 = this.read;
            if (str5 == null ? r5.read != null : !str5.equals(r5.read)) {
                return false;
            }
            String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str6 == null ? r5.MediaBrowserCompat$CustomActionResultReceiver != null : !str6.equals(r5.MediaBrowserCompat$CustomActionResultReceiver)) {
                return false;
            }
            String str7 = this.IconCompatParcelizer;
            if (str7 == null ? r5.IconCompatParcelizer != null : !str7.equals(r5.IconCompatParcelizer)) {
                return false;
            }
            String str8 = this.MediaBrowserCompat$ItemReceiver;
            String str9 = r5.MediaBrowserCompat$ItemReceiver;
            if (str8 != null) {
                return str8.equals(str9);
            }
            if (str9 != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$MediaItem;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            int i2 = this.RatingCompat;
            String str2 = this.MediaMetadataCompat;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaDescriptionCompat;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.read;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.IconCompatParcelizer;
            int hashCode7 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.MediaBrowserCompat$ItemReceiver;
            if (str8 != null) {
                i = str8.hashCode();
            }
            return (((((((((((((((hashCode * 31) + i2) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
        }
    }
}
