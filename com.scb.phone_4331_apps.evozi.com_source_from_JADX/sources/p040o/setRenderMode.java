package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setRenderMode */
public final class setRenderMode {
    @SerializedName("cardMaskedNo")
    public final String IconCompatParcelizer;
    @SerializedName("transactionToken")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountFromName")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("oldCardMaskedNo")
    public final String read;
    @SerializedName("accountNo")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setRenderMode)) {
            return false;
        }
        setRenderMode setrendermode = (setRenderMode) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setrendermode.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setrendermode.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setrendermode.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setrendermode.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setrendermode.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardActivationVerificationEntity(accountNo=");
        sb.append(this.write);
        sb.append(", accountFromName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", cardMaskedNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", oldCardMaskedNo=");
        sb.append(this.read);
        sb.append(", transactionToken=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
