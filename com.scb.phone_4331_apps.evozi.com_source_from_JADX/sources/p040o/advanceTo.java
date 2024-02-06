package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.advanceTo */
public final class advanceTo {
    @SerializedName("duration")
    private final String IconCompatParcelizer;
    @SerializedName("annualInterestRate")
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("loanAmount")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("productType")
    private final String MediaBrowserCompat$MediaItem;
    @SerializedName("tilesVersion")
    private final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("applicationId")
    private final String read;
    @SerializedName("monthlyPayment")
    private String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof advanceTo)) {
            return false;
        }
        advanceTo advanceto = (advanceTo) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) advanceto.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) advanceto.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) advanceto.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) advanceto.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) advanceto.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) advanceto.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) advanceto.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashMCMCPostDetailRequest(tilesVersion=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", productType=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", applicationId=");
        sb.append(this.read);
        sb.append(", duration=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", loanAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", monthlyPayment=");
        sb.append(this.write);
        sb.append(", annualInterestRate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public advanceTo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        onGetStartedClick.write((Object) str, "tilesVersion");
        onGetStartedClick.write((Object) str2, "productType");
        onGetStartedClick.write((Object) str3, "applicationId");
        onGetStartedClick.write((Object) str4, "duration");
        onGetStartedClick.write((Object) str5, "loanAmount");
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.MediaBrowserCompat$MediaItem = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.write = str6;
        this.MediaBrowserCompat$CustomActionResultReceiver = str7;
    }
}
