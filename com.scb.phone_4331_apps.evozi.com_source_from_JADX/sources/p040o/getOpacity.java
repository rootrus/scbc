package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getOpacity */
public final class getOpacity {
    @SerializedName("product")
    public final List<getImageAssetManager> IconCompatParcelizer;
    @SerializedName("ncbConsent")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("repaymentAbility")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("monthlyIncome")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getOpacity)) {
            return false;
        }
        getOpacity getopacity = (getOpacity) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getopacity.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getopacity.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getopacity.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getopacity.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        List<getImageAssetManager> list = this.IconCompatParcelizer;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashCreditPowerLoanRequestResultEntity(ncbConsent=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", monthlyIncome=");
        sb.append(this.write);
        sb.append(", repaymentAbility=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", product=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
