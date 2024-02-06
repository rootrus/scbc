package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setHighlighter */
public final class setHighlighter {
    @SerializedName("paymentAmount")
    public final Double IconCompatParcelizer;
    @SerializedName("ref2")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountFrom")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("ref3")
    public final String MediaMetadataCompat;
    @SerializedName("ref1")
    public final String read;
    @SerializedName("accountTo")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setHighlighter)) {
            return false;
        }
        setHighlighter sethighlighter = (setHighlighter) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) sethighlighter.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) sethighlighter.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) sethighlighter.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) sethighlighter.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) sethighlighter.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) sethighlighter.MediaMetadataCompat);
    }

    public final int hashCode() {
        Double d = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = d != null ? d.hashCode() : 0;
        String str = this.write;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BillPaymentEntity(paymentAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountTo=");
        sb.append(this.write);
        sb.append(", accountFrom=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", ref1=");
        sb.append(this.read);
        sb.append(", ref2=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", ref3=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }
}
