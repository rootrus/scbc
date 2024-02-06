package p040o;

import com.google.gson.annotations.SerializedName;
import org.threeten.p041bp.OffsetDateTime;
import p039io.beid.beidk.definitions.BeIDParams;

/* renamed from: o.stopAnimation */
public final class stopAnimation extends zzuk {
    @SerializedName("remainingCardBalance")
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("remainingCurrency")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("transactionId")
    public final String read;
    @SerializedName("transactionDateTime")
    public final OffsetDateTime write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stopAnimation)) {
            return false;
        }
        stopAnimation stopanimation = (stopAnimation) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) stopanimation.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) stopanimation.read) && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, stopanimation.MediaBrowserCompat$CustomActionResultReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) stopanimation.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        OffsetDateTime offsetDateTime = this.write;
        int i = 0;
        int hashCode = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        String str = this.read;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidCashOutConfirmation(transactionDateTime=");
        sb.append(this.write);
        sb.append(", transactionId=");
        sb.append(this.read);
        sb.append(", remainingCardBalance=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", remainingCurrency=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public stopAnimation(OffsetDateTime offsetDateTime, String str, double d, String str2) {
        onGetStartedClick.write((Object) str, BeIDParams.BEID_TRANSACTION_ID);
        onGetStartedClick.write((Object) str2, "remainingCurrency");
        this.write = offsetDateTime;
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = d;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}
