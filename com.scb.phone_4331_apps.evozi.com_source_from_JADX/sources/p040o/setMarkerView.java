package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setMarkerView */
public final class setMarkerView {
    @SerializedName("orderReference")
    public final String IconCompatParcelizer;
    @SerializedName("paymentAmount")
    public final Double MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("creditcardInstallmentPlans")
    public final List<setMaxHighlightDistance> MediaBrowserCompat$ItemReceiver;
    @SerializedName("terminalId")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("speedycashInstallmentPlans")
    public final List<setMaxHighlightDistance> MediaDescriptionCompat;
    @SerializedName("speedycashDefaultTenor")
    public final Integer RatingCompat;
    @SerializedName("creditcardDefaultTenor")
    public final Integer read;
    @SerializedName("merchantId")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMarkerView)) {
            return false;
        }
        setMarkerView setmarkerview = (setMarkerView) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setmarkerview.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setmarkerview.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setmarkerview.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setmarkerview.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setmarkerview.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setmarkerview.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setmarkerview.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setmarkerview.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        List<setMaxHighlightDistance> list = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<setMaxHighlightDistance> list2 = this.MediaDescriptionCompat;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        Integer num = this.read;
        int hashCode3 = num != null ? num.hashCode() : 0;
        Integer num2 = this.RatingCompat;
        int hashCode4 = num2 != null ? num2.hashCode() : 0;
        String str = this.write;
        int hashCode5 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode6 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode7 = str3 != null ? str3.hashCode() : 0;
        Double d = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (d != null) {
            i = d.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreditCardInstallmentEntity(creditCardInstallmentPlans=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", speedyCashInstallmentPlans=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", creditCardDefaultTenor=");
        sb.append(this.read);
        sb.append(", speedyCashDefaultTenor=");
        sb.append(this.RatingCompat);
        sb.append(", merchantId=");
        sb.append(this.write);
        sb.append(", terminalId=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", orderReference=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", paymentAmount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
