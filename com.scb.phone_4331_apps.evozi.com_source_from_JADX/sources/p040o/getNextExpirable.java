package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getNextExpirable */
public final class getNextExpirable {
    @SerializedName("frontEndFeeAmount")
    public final String IconCompatParcelizer;
    @SerializedName("applicationId")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("loanAmount")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("tilesVersion")
    private final String MediaBrowserCompat$MediaItem;
    @SerializedName("monthlyPayment")
    public final String MediaDescriptionCompat;
    @SerializedName("productProgram")
    public final String MediaMetadataCompat;
    @SerializedName("duration")
    public final String read;
    @SerializedName("loanType")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNextExpirable)) {
            return false;
        }
        getNextExpirable getnextexpirable = (getNextExpirable) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getnextexpirable.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getnextexpirable.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getnextexpirable.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getnextexpirable.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getnextexpirable.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getnextexpirable.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getnextexpirable.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getnextexpirable.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaMetadataCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaDescriptionCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.IconCompatParcelizer;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PostCommercialDetailRequest(tilesVersion=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", loanType=");
        sb.append(this.write);
        sb.append(", productProgram=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", applicationId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", duration=");
        sb.append(this.read);
        sb.append(", loanAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", monthlyPayment=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", frontEndFeeAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public getNextExpirable(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        onGetStartedClick.write((Object) str, "tilesVersion");
        onGetStartedClick.write((Object) str2, "loanType");
        onGetStartedClick.write((Object) str3, "productProgram");
        onGetStartedClick.write((Object) str4, "applicationId");
        onGetStartedClick.write((Object) str5, "duration");
        onGetStartedClick.write((Object) str6, "loanAmount");
        onGetStartedClick.write((Object) str7, "monthlyPayment");
        onGetStartedClick.write((Object) str8, "frontEndFeeAmount");
        this.MediaBrowserCompat$MediaItem = str;
        this.write = str2;
        this.MediaMetadataCompat = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.read = str5;
        this.MediaBrowserCompat$ItemReceiver = str6;
        this.MediaDescriptionCompat = str7;
        this.IconCompatParcelizer = str8;
    }
}
