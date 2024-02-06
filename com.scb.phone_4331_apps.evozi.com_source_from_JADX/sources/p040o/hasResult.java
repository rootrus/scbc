package p040o;

import com.google.gson.annotations.SerializedName;
import p040o.CustomConcurrentHashMap;

/* renamed from: o.hasResult */
public final class hasResult {
    @SerializedName("customerContactInfo")
    public final getElapsedRealtimeMillis IconCompatParcelizer;
    @SerializedName("duration")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("installment")
    private final CustomConcurrentHashMap.Strength.C33053 MediaBrowserCompat$ItemReceiver;
    @SerializedName("repaymentDate")
    private final String MediaBrowserCompat$MediaItem;
    @SerializedName("repaymentStartDate")
    private final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("principal")
    private final String MediaDescriptionCompat;
    @SerializedName("sameAddressFlag")
    private final String MediaMetadataCompat;
    @SerializedName("productType")
    private final String RatingCompat;
    @SerializedName("annualInterest")
    private final String read;
    @SerializedName("gracePeriod")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasResult)) {
            return false;
        }
        hasResult hasresult = (hasResult) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) hasresult.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) hasresult.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) hasresult.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) hasresult.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) hasresult.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) hasresult.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) hasresult.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) hasresult.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) hasresult.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) hasresult.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.RatingCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        CustomConcurrentHashMap.Strength.C33053 r4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = r4 != null ? r4.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.write;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaMetadataCompat;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        getElapsedRealtimeMillis getelapsedrealtimemillis = this.IconCompatParcelizer;
        if (getelapsedrealtimemillis != null) {
            i = getelapsedrealtimemillis.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NTBApplicationsInitiateRequest(productType=");
        sb.append(this.RatingCompat);
        sb.append(", principal=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", duration=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", installment=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", repaymentDate=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", annualInterest=");
        sb.append(this.read);
        sb.append(", repaymentStartDate=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", gracePeriod=");
        sb.append(this.write);
        sb.append(", sameAddressFlag=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", customerContactInfo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public hasResult(String str, String str2, String str3, CustomConcurrentHashMap.Strength.C33053 r5, String str4, String str5, String str6, String str7, String str8, getElapsedRealtimeMillis getelapsedrealtimemillis) {
        onGetStartedClick.write((Object) str, "productType");
        onGetStartedClick.write((Object) str2, "principal");
        onGetStartedClick.write((Object) str3, "duration");
        onGetStartedClick.write((Object) r5, "installment");
        onGetStartedClick.write((Object) str4, "repaymentDate");
        onGetStartedClick.write((Object) str5, "annualInterest");
        onGetStartedClick.write((Object) str6, "repaymentStartDate");
        onGetStartedClick.write((Object) str7, "gracePeriod");
        onGetStartedClick.write((Object) str8, "sameAddressFlag");
        onGetStartedClick.write((Object) getelapsedrealtimemillis, "customerContactInfo");
        this.RatingCompat = str;
        this.MediaDescriptionCompat = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.MediaBrowserCompat$ItemReceiver = r5;
        this.MediaBrowserCompat$MediaItem = str4;
        this.read = str5;
        this.MediaBrowserCompat$SearchResultReceiver = str6;
        this.write = str7;
        this.MediaMetadataCompat = str8;
        this.IconCompatParcelizer = getelapsedrealtimemillis;
    }
}
