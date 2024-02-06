package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.AnalyticsReceiver */
public final class AnalyticsReceiver extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<AnalyticsReceiver> CREATOR = new Parcelable.Creator<AnalyticsReceiver>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AnalyticsReceiver(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AnalyticsReceiver[i];
        }
    };
    public String IconCompatParcelizer;
    public HashMap<String, String> MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public List<dropBreadcrumb> MediaDescriptionCompat;
    public String MediaMetadataCompat;
    private String RatingCompat;
    public String read;

    /* renamed from: o.AnalyticsReceiver$CrashlyticsOriginEventListener */
    public enum CrashlyticsOriginEventListener {
        BUSINESS_INFORMATION,
        BUSINESS_NAME,
        YEAR_MONTH_IN_BUSINESS,
        NUMBER_OF_EMPLOYEES,
        MARITAL_INFORMATION,
        MARITAL_STATUS,
        SPOUSE_NATIONAL_ID,
        SPOUSE_TITLE,
        SPOUSE_FIRST_NAME,
        SPOUSE_LAST_NAME;
        
        public static final C3017x4396634b Companion = null;

        static {
            Companion = new C3017x4396634b((byte) 0);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public AnalyticsReceiver(String str, String str2, List<dropBreadcrumb> list, String str3, String str4, Map<String, String> map, String str5, String str6, String str7) {
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.MediaBrowserCompat$MediaItem = str2;
        this.MediaDescriptionCompat = list;
        this.IconCompatParcelizer = str3;
        this.RatingCompat = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = map instanceof HashMap ? (HashMap) map : new HashMap<>(map);
        this.MediaMetadataCompat = str5;
        this.read = str6;
        this.MediaBrowserCompat$ItemReceiver = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalyticsReceiver analyticsReceiver = (AnalyticsReceiver) obj;
        if (!this.MediaBrowserCompat$SearchResultReceiver.equals(analyticsReceiver.MediaBrowserCompat$SearchResultReceiver) || !this.MediaBrowserCompat$MediaItem.equals(analyticsReceiver.MediaBrowserCompat$MediaItem) || !this.MediaDescriptionCompat.equals(analyticsReceiver.MediaDescriptionCompat) || !this.IconCompatParcelizer.equals(analyticsReceiver.IconCompatParcelizer)) {
            return false;
        }
        String str = this.RatingCompat;
        if (str == null ? analyticsReceiver.RatingCompat != null : !str.equals(analyticsReceiver.RatingCompat)) {
            return false;
        }
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.equals(analyticsReceiver.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.MediaMetadataCompat;
        if (str2 == null ? analyticsReceiver.MediaMetadataCompat != null : !str2.equals(analyticsReceiver.MediaMetadataCompat)) {
            return false;
        }
        String str3 = this.read;
        if (str3 == null ? analyticsReceiver.read == null : str3.equals(analyticsReceiver.read)) {
            return this.MediaBrowserCompat$ItemReceiver.equals(analyticsReceiver.MediaBrowserCompat$ItemReceiver);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.MediaBrowserCompat$SearchResultReceiver.hashCode();
        int hashCode2 = this.MediaBrowserCompat$MediaItem.hashCode();
        int hashCode3 = this.MediaDescriptionCompat.hashCode();
        int hashCode4 = this.IconCompatParcelizer.hashCode();
        String str = this.RatingCompat;
        int i = 0;
        int hashCode5 = str != null ? str.hashCode() : 0;
        int hashCode6 = this.MediaBrowserCompat$CustomActionResultReceiver.hashCode();
        String str2 = this.MediaMetadataCompat;
        int hashCode7 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i) * 31) + this.MediaBrowserCompat$ItemReceiver.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SummaryDisplay{productType='");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append('\'');
        sb.append(", title='");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append('\'');
        sb.append(", summaryItemDisplays=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", applicationId='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", email='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append(", consents=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", disclaimerHeader='");
        sb.append(this.MediaMetadataCompat);
        sb.append('\'');
        sb.append(", disclaimerDescription='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", amount='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeTypedList(this.MediaDescriptionCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.RatingCompat);
        parcel.writeSerializable(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    protected AnalyticsReceiver(Parcel parcel) {
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaDescriptionCompat = parcel.createTypedArrayList(dropBreadcrumb.CREATOR);
        this.IconCompatParcelizer = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = (HashMap) parcel.readSerializable();
        this.MediaMetadataCompat = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }
}
