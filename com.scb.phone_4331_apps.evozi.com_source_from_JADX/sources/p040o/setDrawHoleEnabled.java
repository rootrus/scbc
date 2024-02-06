package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setDrawHoleEnabled */
public final class setDrawHoleEnabled {
    @SerializedName("name")
    public final String IconCompatParcelizer;
    @SerializedName("countryName")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("logo")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("swiftCode")
    public final String MediaDescriptionCompat;
    @SerializedName("receivingBank")
    public final String RatingCompat;
    @SerializedName("accountNumber")
    public final String read;
    @SerializedName("accountDetails")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDrawHoleEnabled)) {
            return false;
        }
        setDrawHoleEnabled setdrawholeenabled = (setDrawHoleEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setdrawholeenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setdrawholeenabled.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setdrawholeenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setdrawholeenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setdrawholeenabled.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setdrawholeenabled.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setdrawholeenabled.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.RatingCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaDescriptionCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountToEntity(logo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", name=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountNumber=");
        sb.append(this.read);
        sb.append(", accountDetails=");
        sb.append(this.write);
        sb.append(", receivingBank=");
        sb.append(this.RatingCompat);
        sb.append(", swiftCode=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", countryName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
