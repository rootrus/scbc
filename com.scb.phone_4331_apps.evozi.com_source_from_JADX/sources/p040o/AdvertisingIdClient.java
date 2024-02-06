package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.AdvertisingIdClient */
public final class AdvertisingIdClient {
    @SerializedName("applicationType")
    public final String IconCompatParcelizer;

    /* renamed from: o.AdvertisingIdClient$Info */
    public class Info {
        @SerializedName("active")
        public String IconCompatParcelizer;
        @SerializedName("billerLogo")
        public String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("id")
        public Integer MediaBrowserCompat$ItemReceiver;
        @SerializedName("limitTopUpPerDay")
        public Double MediaBrowserCompat$MediaItem;
        @SerializedName("type")
        public String MediaDescriptionCompat;
        @SerializedName("reference1Label")
        public String MediaMetadataCompat;
        @SerializedName("serviceType")
        public String RatingCompat;
        @SerializedName("accountNumber")
        public String read;
        @SerializedName("billerName")
        public String write;
    }

    /* renamed from: o.AdvertisingIdClient$zza */
    public class zza {
        @SerializedName("maxAmount")
        public Double IconCompatParcelizer;
        @SerializedName("minAmount")
        public Double read;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AdvertisingIdClient) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((AdvertisingIdClient) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SecuritiesRegistrationsStatusEntity(applicationType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
