package p040o;

/* renamed from: o.AutocompletePredictionBuffer */
public final class AutocompletePredictionBuffer {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean MediaBrowserCompat$ItemReceiver;
    public final String MediaMetadataCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutocompletePredictionBuffer)) {
            return false;
        }
        AutocompletePredictionBuffer autocompletePredictionBuffer = (AutocompletePredictionBuffer) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) autocompletePredictionBuffer.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) autocompletePredictionBuffer.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) autocompletePredictionBuffer.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) autocompletePredictionBuffer.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) autocompletePredictionBuffer.IconCompatParcelizer) && this.MediaBrowserCompat$ItemReceiver == autocompletePredictionBuffer.MediaBrowserCompat$ItemReceiver;
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        if (str5 != null) {
            i = str5.hashCode();
        }
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        if (z) {
            z = true;
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentReviewInfo(sourceOfIncome=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", sourceOfFund=");
        sb.append(this.read);
        sb.append(", investPurpose=");
        sb.append(this.write);
        sb.append(", creditLimit=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", dividendWithholdingTaxFlag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", showCreditLimitFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public AutocompletePredictionBuffer(String str, String str2, String str3, String str4, String str5, boolean z) {
        onGetStartedClick.write((Object) str, "sourceOfIncome");
        onGetStartedClick.write((Object) str2, "sourceOfFund");
        onGetStartedClick.write((Object) str3, "investPurpose");
        onGetStartedClick.write((Object) str4, "creditLimit");
        onGetStartedClick.write((Object) str5, "dividendWithholdingTaxFlag");
        this.MediaMetadataCompat = str;
        this.read = str2;
        this.write = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.IconCompatParcelizer = str5;
        this.MediaBrowserCompat$ItemReceiver = z;
    }
}
