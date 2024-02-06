package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.asynchronous */
public final class asynchronous {
    @SerializedName("investmentObjective")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("sourceOfFund")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("sourceOfIncome")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asynchronous)) {
            return false;
        }
        asynchronous asynchronous = (asynchronous) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) asynchronous.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) asynchronous.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) asynchronous.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentInfoRequest(sourceOfIncome=");
        sb.append(this.write);
        sb.append(", sourceOfFund=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", investmentObjective=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public asynchronous(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "sourceOfIncome");
        onGetStartedClick.write((Object) str2, "sourceOfFund");
        onGetStartedClick.write((Object) str3, "investmentObjective");
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
    }
}
