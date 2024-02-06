package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.HashBasedTable */
public final class HashBasedTable {
    @SerializedName("transactionToken")
    private final String MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof HashBasedTable) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((HashBasedTable) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PayNowConfirmationRequest(transactionToken=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.HashBasedTable$Factory */
    public final class Factory {
        @SerializedName("countryName")
        public final String IconCompatParcelizer;
        @SerializedName("agentType")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("currencyCode")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("amountTo")
        private final double MediaBrowserCompat$MediaItem;
        @SerializedName("purpose")
        public final String MediaDescriptionCompat;
        @SerializedName("accountFromNumber")
        private final String MediaMetadataCompat;
        @SerializedName("promptpayID")
        public final String RatingCompat;
        @SerializedName("annotation")
        public final String read;
        @SerializedName("channelType")
        public final String write;

        public Factory(String str, String str2, String str3, String str4, double d, String str5, String str6, String str7, String str8) {
            onGetStartedClick.write((Object) str, "countryName");
            onGetStartedClick.write((Object) str2, "channelType");
            onGetStartedClick.write((Object) str3, "agentType");
            onGetStartedClick.write((Object) str4, "currencyCode");
            onGetStartedClick.write((Object) str5, "accountFromNumber");
            onGetStartedClick.write((Object) str6, "promptpayID");
            onGetStartedClick.write((Object) str8, "purpose");
            this.IconCompatParcelizer = str;
            this.write = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.MediaBrowserCompat$ItemReceiver = str4;
            this.MediaBrowserCompat$MediaItem = d;
            this.MediaMetadataCompat = str5;
            this.RatingCompat = str6;
            this.read = str7;
            this.MediaDescriptionCompat = str8;
        }
    }

    public HashBasedTable(String str) {
        onGetStartedClick.write((Object) str, "transactionToken");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }
}
