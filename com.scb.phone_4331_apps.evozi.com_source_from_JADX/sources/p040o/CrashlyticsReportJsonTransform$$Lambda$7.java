package p040o;

/* renamed from: o.CrashlyticsReportJsonTransform$$Lambda$7 */
public final class CrashlyticsReportJsonTransform$$Lambda$7 {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReportJsonTransform$$Lambda$7)) {
            return false;
        }
        CrashlyticsReportJsonTransform$$Lambda$7 crashlyticsReportJsonTransform$$Lambda$7 = (CrashlyticsReportJsonTransform$$Lambda$7) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) crashlyticsReportJsonTransform$$Lambda$7.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) crashlyticsReportJsonTransform$$Lambda$7.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) crashlyticsReportJsonTransform$$Lambda$7.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) crashlyticsReportJsonTransform$$Lambda$7.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) crashlyticsReportJsonTransform$$Lambda$7.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashInputIncome(productType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", productGroup=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", flowType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", inputIncome=");
        sb.append(this.read);
        sb.append(", inputRepayment=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public CrashlyticsReportJsonTransform$$Lambda$7(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "productType");
        onGetStartedClick.write((Object) str2, "productGroup");
        onGetStartedClick.write((Object) str3, "flowType");
        onGetStartedClick.write((Object) str4, "inputIncome");
        onGetStartedClick.write((Object) str5, "inputRepayment");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.read = str4;
        this.write = str5;
    }
}
