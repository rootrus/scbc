package p040o;

import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.setGmpAppId */
public final class setGmpAppId {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setGmpAppId)) {
            return false;
        }
        setGmpAppId setgmpappid = (setGmpAppId) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setgmpappid.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setgmpappid.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setgmpappid.write);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NotificationsStaticStringsDisplay(groupTitle=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", title=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", subtitle=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public setGmpAppId(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "groupTitle");
        onGetStartedClick.write((Object) str2, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str3, "subtitle");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.write = str3;
    }
}
