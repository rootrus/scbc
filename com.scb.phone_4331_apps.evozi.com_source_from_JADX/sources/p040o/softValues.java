package p040o;

import com.google.gson.annotations.SerializedName;
import p039io.beid.beidk.definitions.BeIDParams;

/* renamed from: o.softValues */
public final class softValues {
    @SerializedName("transactionId")
    private final String IconCompatParcelizer;
    @SerializedName("action")
    private final Number read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof softValues)) {
            return false;
        }
        softValues softvalues = (softValues) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) softvalues.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) softvalues.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Number number = this.read;
        if (number != null) {
            i = number.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PartnerConsentWithTransactionIdRequest(transactionId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", action=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public softValues(String str, Number number) {
        onGetStartedClick.write((Object) str, BeIDParams.BEID_TRANSACTION_ID);
        onGetStartedClick.write((Object) number, "action");
        this.IconCompatParcelizer = str;
        this.read = number;
    }
}
