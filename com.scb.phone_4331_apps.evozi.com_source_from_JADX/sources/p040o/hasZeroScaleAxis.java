package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.hasZeroScaleAxis */
public final class hasZeroScaleAxis {
    @SerializedName("accountTo")
    public final dpScale IconCompatParcelizer;
    @SerializedName("accountFrom")
    public final applyTrimPathIfNeeded MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("rateExpiredTime")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("txnDetails")
    public final renderPath MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("transactionToken")
    public final String MediaMetadataCompat;
    @SerializedName("annotation")
    public final String read;
    @SerializedName("transactionDateTime")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasZeroScaleAxis)) {
            return false;
        }
        hasZeroScaleAxis haszeroscaleaxis = (hasZeroScaleAxis) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) haszeroscaleaxis.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) haszeroscaleaxis.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) haszeroscaleaxis.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) haszeroscaleaxis.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) haszeroscaleaxis.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) haszeroscaleaxis.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) haszeroscaleaxis.read);
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        applyTrimPathIfNeeded applytrimpathifneeded = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = applytrimpathifneeded != null ? applytrimpathifneeded.hashCode() : 0;
        dpScale dpscale = this.IconCompatParcelizer;
        int hashCode3 = dpscale != null ? dpscale.hashCode() : 0;
        renderPath renderpath = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode4 = renderpath != null ? renderpath.hashCode() : 0;
        String str2 = this.write;
        int hashCode5 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PayNowVerificationEntity(transactionToken=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", accountFromEntity=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountToEntity=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", txnDetailsEntity=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", transactionDateTime=");
        sb.append(this.write);
        sb.append(", rateExpiredTime=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", annotation=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
