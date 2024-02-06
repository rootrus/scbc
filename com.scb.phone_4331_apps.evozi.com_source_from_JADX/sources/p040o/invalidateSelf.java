package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.invalidateSelf */
public final class invalidateSelf {
    @SerializedName("creditAmount")
    private final String IconCompatParcelizer;
    @SerializedName("duration")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("applicationId")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("ncbTransactionId")
    private final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("productType")
    private final String MediaDescriptionCompat;
    @SerializedName("interestRate")
    private final String read;
    @SerializedName("monthlyPayment")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof invalidateSelf)) {
            return false;
        }
        invalidateSelf invalidateself = (invalidateSelf) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) invalidateself.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) invalidateself.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) invalidateself.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) invalidateself.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) invalidateself.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) invalidateself.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) invalidateself.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashCreditPowerProductEntity(productType=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", applicationId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", ncbTransactionId=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", creditAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", monthlyPayment=");
        sb.append(this.write);
        sb.append(", interestRate=");
        sb.append(this.read);
        sb.append(", duration=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
