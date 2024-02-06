package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getHighlightLength */
public final class getHighlightLength {
    @SerializedName("merchantMetaData")
    public final getDashOffset IconCompatParcelizer;
    @SerializedName("remainingBalance")
    public final Double MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("buttons")
    public final List<setNoDataTextTypeface> MediaBrowserCompat$ItemReceiver;
    @SerializedName("transactionToken")
    public final String MediaDescriptionCompat;
    @SerializedName("paymentId")
    public final String read;
    @SerializedName("transactionDateTime")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getHighlightLength)) {
            return false;
        }
        getHighlightLength gethighlightlength = (getHighlightLength) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) gethighlightlength.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) gethighlightlength.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) gethighlightlength.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) gethighlightlength.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) gethighlightlength.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) gethighlightlength.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        List<setNoDataTextTypeface> list = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = list != null ? list.hashCode() : 0;
        Double d = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = d != null ? d.hashCode() : 0;
        getDashOffset getdashoffset = this.IconCompatParcelizer;
        if (getdashoffset != null) {
            i = getdashoffset.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InsurancePaymentConfirmationEntity(transactionDateTime=");
        sb.append(this.write);
        sb.append(", paymentId=");
        sb.append(this.read);
        sb.append(", transactionToken=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", buttons=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", remainingBalance=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", merchantMetaData=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
