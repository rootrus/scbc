package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ComparisonChain */
public final class ComparisonChain {
    @SerializedName("accountFromNo")
    private final String IconCompatParcelizer;
    @SerializedName("agentName")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("amount")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("transactionType")
    private final String RatingCompat;
    @SerializedName("postingType")
    private final String read;
    @SerializedName("agentCode")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparisonChain)) {
            return false;
        }
        ComparisonChain comparisonChain = (ComparisonChain) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) comparisonChain.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) comparisonChain.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) comparisonChain.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) comparisonChain.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) comparisonChain.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) comparisonChain.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.RatingCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AgentValidationRequest(accountFromNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", agentCode=");
        sb.append(this.write);
        sb.append(", agentName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", transactionType=");
        sb.append(this.RatingCompat);
        sb.append(", amount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", postingType=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.ComparisonChain$InactiveComparisonChain */
    public final class InactiveComparisonChain {
        @SerializedName("userMode")
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("tilesVersion")
        private final String read;
        @SerializedName("allTilesFlag")
        private final int write = 0;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InactiveComparisonChain)) {
                return false;
            }
            InactiveComparisonChain inactiveComparisonChain = (InactiveComparisonChain) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) inactiveComparisonChain.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) inactiveComparisonChain.MediaBrowserCompat$CustomActionResultReceiver) && this.write == inactiveComparisonChain.write;
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (((hashCode * 31) + i) * 31) + this.write;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BankingServiceTilesRequest(tilesVersion=");
            sb.append(this.read);
            sb.append(", userMode=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", allTilesFlag=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public InactiveComparisonChain(String str, String str2) {
            onGetStartedClick.write((Object) str, "tilesVersion");
            onGetStartedClick.write((Object) str2, "userMode");
            this.read = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }
    }

    public ComparisonChain(String str, String str2, String str3, String str4, String str5, String str6) {
        onGetStartedClick.write((Object) str, "accountFromNo");
        onGetStartedClick.write((Object) str2, "agentCode");
        onGetStartedClick.write((Object) str3, "agentName");
        onGetStartedClick.write((Object) str4, "transactionType");
        onGetStartedClick.write((Object) str5, "amount");
        onGetStartedClick.write((Object) str6, "postingType");
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.RatingCompat = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.read = str6;
    }
}
