package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setNoDataTextTypeface */
public final class setNoDataTextTypeface {
    @SerializedName("label")
    public final String IconCompatParcelizer;
    @SerializedName("deeplink")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setNoDataTextTypeface)) {
            return false;
        }
        setNoDataTextTypeface setnodatatexttypeface = (setNoDataTextTypeface) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setnodatatexttypeface.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setnodatatexttypeface.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurchasePaymentConfirmationButtonsDataEntity(label=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", deepLink=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
