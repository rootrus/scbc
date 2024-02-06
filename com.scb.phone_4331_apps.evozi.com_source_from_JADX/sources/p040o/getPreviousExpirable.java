package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getPreviousExpirable */
public final class getPreviousExpirable {
    @SerializedName("monthlyPayment")
    public String IconCompatParcelizer;
    @SerializedName("interestRate")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("maximumCreditLimit")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("tenor")
    public String MediaDescriptionCompat;
    @SerializedName("productType")
    public String read;
    @SerializedName("loanAmount")
    public String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPreviousExpirable)) {
            return false;
        }
        getPreviousExpirable getpreviousexpirable = (getPreviousExpirable) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getpreviousexpirable.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getpreviousexpirable.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getpreviousexpirable.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getpreviousexpirable.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getpreviousexpirable.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getpreviousexpirable.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaDescriptionCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductRequest(productType=");
        sb.append(this.read);
        sb.append(", maximumCreditLimit=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", loanAmount=");
        sb.append(this.write);
        sb.append(", monthlyPayment=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", tenor=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", interestRate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getPreviousExpirable(String str, String str2, String str3, String str4, String str5, String str6) {
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.write = str3;
        this.IconCompatParcelizer = str4;
        this.MediaDescriptionCompat = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = str6;
    }
}
