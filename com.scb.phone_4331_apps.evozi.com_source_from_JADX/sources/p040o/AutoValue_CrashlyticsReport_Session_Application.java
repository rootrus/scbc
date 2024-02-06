package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.CrashlyticsReport;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Application */
public final class AutoValue_CrashlyticsReport_Session_Application implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C3065xbff53425();
    public final List<CrashlyticsReport.Session.OperatingSystem.Builder> MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AutoValue_CrashlyticsReport_Session_Application) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((AutoValue_CrashlyticsReport_Session_Application) obj).MediaBrowserCompat$ItemReceiver);
        }
        return true;
    }

    public final int hashCode() {
        List<CrashlyticsReport.Session.OperatingSystem.Builder> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdditionalMetaDataDisplay(paymentInfo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        List<CrashlyticsReport.Session.OperatingSystem.Builder> list = this.MediaBrowserCompat$ItemReceiver;
        parcel.writeInt(list.size());
        for (CrashlyticsReport.Session.OperatingSystem.Builder writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Application$Builder */
    public final class Builder implements Parcelable {
        public static final Parcelable.Creator CREATOR = new write();
        public final setUser IconCompatParcelizer;
        public final getOrganization MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final String MediaBrowserCompat$SearchResultReceiver;
        public final String MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final String RatingCompat;
        public final String read;
        public final String write;

        /* renamed from: o.AutoValue_CrashlyticsReport_Session_Application$Builder$write */
        public static final class write implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "in");
                return new Builder(parcel.readString(), (setUser) setUser.CREATOR.createFromParcel(parcel), (getOrganization) getOrganization.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final Object[] newArray(int i) {
                return new Builder[i];
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) builder.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) builder.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) builder.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) builder.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) builder.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) builder.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) builder.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) builder.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) builder.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) builder.MediaBrowserCompat$MediaItem);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$SearchResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            setUser setuser = this.IconCompatParcelizer;
            int hashCode2 = setuser != null ? setuser.hashCode() : 0;
            getOrganization getorganization = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode3 = getorganization != null ? getorganization.hashCode() : 0;
            String str2 = this.write;
            int hashCode4 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode5 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.read;
            int hashCode6 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaMetadataCompat;
            int hashCode7 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.RatingCompat;
            int hashCode8 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.MediaDescriptionCompat;
            int hashCode9 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.MediaBrowserCompat$MediaItem;
            if (str8 != null) {
                i = str8.hashCode();
            }
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PayNowReviewDisplay(transactionToken=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", accountFromDisplay=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", accountToDisplay=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", conversionRate=");
            sb.append(this.write);
            sb.append(", amountToSend=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", amountRecipientGet=");
            sb.append(this.read);
            sb.append(", fee=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", purpose=");
            sb.append(this.RatingCompat);
            sb.append(", note=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", rateExpiredTime=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
            this.IconCompatParcelizer.writeToParcel(parcel, 0);
            this.MediaBrowserCompat$CustomActionResultReceiver.writeToParcel(parcel, 0);
            parcel.writeString(this.write);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.read);
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeString(this.RatingCompat);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
        }

        public Builder(String str, setUser setuser, getOrganization getorganization, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            onGetStartedClick.write((Object) str, "transactionToken");
            onGetStartedClick.write((Object) setuser, "accountFromDisplay");
            onGetStartedClick.write((Object) getorganization, "accountToDisplay");
            onGetStartedClick.write((Object) str2, "conversionRate");
            onGetStartedClick.write((Object) str3, "amountToSend");
            onGetStartedClick.write((Object) str4, "amountRecipientGet");
            onGetStartedClick.write((Object) str5, "fee");
            onGetStartedClick.write((Object) str6, "purpose");
            onGetStartedClick.write((Object) str7, "note");
            onGetStartedClick.write((Object) str8, "rateExpiredTime");
            this.MediaBrowserCompat$SearchResultReceiver = str;
            this.IconCompatParcelizer = setuser;
            this.MediaBrowserCompat$CustomActionResultReceiver = getorganization;
            this.write = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.read = str4;
            this.MediaMetadataCompat = str5;
            this.RatingCompat = str6;
            this.MediaDescriptionCompat = str7;
            this.MediaBrowserCompat$MediaItem = str8;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Application(List<CrashlyticsReport.Session.OperatingSystem.Builder> list) {
        onGetStartedClick.write((Object) list, "paymentInfo");
        this.MediaBrowserCompat$ItemReceiver = list;
    }
}
