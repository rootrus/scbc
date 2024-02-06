package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.OnEditorAction */
public final class OnEditorAction {
    @SerializedName("JUST_FOR_YOU_PARTNER_DEEPLINK")
    public final String IconCompatParcelizer;
    @SerializedName("SCBS_ONBOARD_DEEPLINK")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("JUST_FOR_YOU_WEBVIEW_URL")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnEditorAction)) {
            return false;
        }
        OnEditorAction onEditorAction = (OnEditorAction) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onEditorAction.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onEditorAction.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onEditorAction.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppConfigPartnerLinksEntity(scbsOnboardDeepLink=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", justForYouPartnerDeepLink=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", justForYouWebViewUrl=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
