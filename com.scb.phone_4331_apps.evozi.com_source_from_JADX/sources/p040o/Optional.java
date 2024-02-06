package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.Optional */
public final class Optional {
    @SerializedName("tokenId")
    public final String IconCompatParcelizer;
    @SerializedName("transactionLimit")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("remainingLimit")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("customerLimit")
    public final String read;
    @SerializedName("agentLimit")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Optional)) {
            return false;
        }
        Optional optional = (Optional) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) optional.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) optional.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) optional.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) optional.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) optional.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AgentValidationEntity(transactionLimit=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", agentLimit=");
        sb.append(this.write);
        sb.append(", customerLimit=");
        sb.append(this.read);
        sb.append(", remainingLimit=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", tokenId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
