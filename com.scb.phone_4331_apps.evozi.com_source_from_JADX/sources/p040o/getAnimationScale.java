package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getAnimationScale */
public final class getAnimationScale {
    @SerializedName("transactionId")
    public final String IconCompatParcelizer;
    @SerializedName("accountFrom")
    public final applyTrimPathIfNeeded MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("annotation")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("txnDetails")
    public final renderPath MediaBrowserCompat$MediaItem;
    @SerializedName("transactionDateTime")
    public final String read;
    @SerializedName("accountTo")
    public final dpScale write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAnimationScale)) {
            return false;
        }
        getAnimationScale getanimationscale = (getAnimationScale) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getanimationscale.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getanimationscale.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getanimationscale.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getanimationscale.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getanimationscale.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getanimationscale.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        applyTrimPathIfNeeded applytrimpathifneeded = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = applytrimpathifneeded != null ? applytrimpathifneeded.hashCode() : 0;
        dpScale dpscale = this.write;
        int hashCode4 = dpscale != null ? dpscale.hashCode() : 0;
        renderPath renderpath = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = renderpath != null ? renderpath.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PayNowTransactionEntity(transactionDateTime=");
        sb.append(this.read);
        sb.append(", transactionId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountFromEntity=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountToEntity=");
        sb.append(this.write);
        sb.append(", txnDetailsEntity=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", annotation=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
