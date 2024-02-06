package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.contains */
public final class contains {
    @SerializedName("gender")
    public final String IconCompatParcelizer;
    @SerializedName("enName")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("dateOfBirth")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("maritalStatus")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("thName")
    public final String MediaDescriptionCompat;
    @SerializedName("nationality")
    public final String RatingCompat;
    @SerializedName("citizenId")
    public final String read;
    @SerializedName("cidAddress")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof contains)) {
            return false;
        }
        contains contains = (contains) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) contains.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) contains.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) contains.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) contains.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) contains.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) contains.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) contains.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) contains.write);
    }

    public final int hashCode() {
        String str = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.RatingCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.IconCompatParcelizer;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.write;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IdpPersonalInfoEntity(thName=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", enName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", nationality=");
        sb.append(this.RatingCompat);
        sb.append(", citizenId=");
        sb.append(this.read);
        sb.append(", dateOfBirth=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", maritalStatus=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", gender=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cidAddress=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
