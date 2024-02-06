package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getEndProgress */
public final class getEndProgress {
    @SerializedName("occupation")
    public final String IconCompatParcelizer;
    @SerializedName("companyPhone")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("employmentExperience")
    public final packageinfo MediaBrowserCompat$ItemReceiver;
    @SerializedName("customerGroupCode")
    private final String MediaDescriptionCompat;
    @SerializedName("workAddress")
    public final List<String> RatingCompat;
    @SerializedName("sourceOfIncome")
    public final String read;
    @SerializedName("companyName")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getEndProgress)) {
            return false;
        }
        getEndProgress getendprogress = (getEndProgress) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getendprogress.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getendprogress.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getendprogress.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getendprogress.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getendprogress.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getendprogress.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getendprogress.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        List<String> list = this.RatingCompat;
        int hashCode4 = list != null ? list.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaDescriptionCompat;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        packageinfo r7 = this.MediaBrowserCompat$ItemReceiver;
        if (r7 != null) {
            i = r7.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlAppOccupationInfoEntity(occupation=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", sourceOfIncome=");
        sb.append(this.read);
        sb.append(", companyName=");
        sb.append(this.write);
        sb.append(", workAddress=");
        sb.append(this.RatingCompat);
        sb.append(", companyPhone=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", customerGroupCode=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", experience=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
