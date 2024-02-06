package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setDrawCenterText */
public final class setDrawCenterText {
    @SerializedName("mutualFundTcAcceptRequired")
    private final String IconCompatParcelizer;
    @SerializedName("tcAcceptVersion")
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("existingCustomer")
    private final boolean MediaBrowserCompat$ItemReceiver;
    @SerializedName("tcAcceptDate")
    private final String read;
    @SerializedName("tcAcceptRequired")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDrawCenterText)) {
            return false;
        }
        setDrawCenterText setdrawcentertext = (setDrawCenterText) obj;
        return this.MediaBrowserCompat$ItemReceiver == setdrawcentertext.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setdrawcentertext.IconCompatParcelizer) && this.MediaBrowserCompat$CustomActionResultReceiver == setdrawcentertext.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setdrawcentertext.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setdrawcentertext.write);
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        if (z) {
            z = true;
        }
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((((((z ? 1 : 0) * true) + hashCode) * 31) + i2) * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerifiedProfileEntity(existingCustomer=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", mutualFundTcAcceptRequired=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", tcAcceptVersion=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", tcAcceptDate=");
        sb.append(this.read);
        sb.append(", tcAcceptRequired=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
