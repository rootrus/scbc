package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.OnItemSelected */
public final class OnItemSelected {
    @SerializedName("license1")
    public final String IconCompatParcelizer;

    /* renamed from: o.OnItemSelected$Callback */
    public final class Callback {
        @SerializedName("agentName")
        public final String IconCompatParcelizer;
        @SerializedName("agentLogo")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("agentCode")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("minAmount")
        public final String MediaBrowserCompat$MediaItem;
        @SerializedName("maxAmount")
        public final String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("sortOrder")
        public final String MediaDescriptionCompat;
        @SerializedName("limitPerDay")
        public final String read;
        @SerializedName("id")
        public final int write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Callback)) {
                return false;
            }
            Callback callback = (Callback) obj;
            return this.write == callback.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) callback.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) callback.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) callback.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) callback.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) callback.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) callback.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) callback.MediaDescriptionCompat);
        }

        public final int hashCode() {
            int i = this.write;
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i2 = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.IconCompatParcelizer;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$MediaItem;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.read;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.MediaDescriptionCompat;
            if (str7 != null) {
                i2 = str7.hashCode();
            }
            return (((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AgentEntity(id=");
            sb.append(this.write);
            sb.append(", agentCode=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", agentLogo=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", agentName=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", minAmount=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", maxAmount=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", limitPerDay=");
            sb.append(this.read);
            sb.append(", sortOrder=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof OnItemSelected) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((OnItemSelected) obj).IconCompatParcelizer);
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
        sb.append("AppConfigKeysEntity(kofaxLicense=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
