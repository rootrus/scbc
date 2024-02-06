package p040o;

import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.removeFirst */
public final class removeFirst {
    public final String IconCompatParcelizer;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeFirst)) {
            return false;
        }
        removeFirst removefirst = (removeFirst) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) removefirst.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) removefirst.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) removefirst.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountTargetDisplay(title=");
        sb.append(this.write);
        sb.append(", subtitle=");
        sb.append(this.read);
        sb.append(", bankLogo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public removeFirst(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str2, "subtitle");
        onGetStartedClick.write((Object) str3, "bankLogo");
        this.write = str;
        this.read = str2;
        this.IconCompatParcelizer = str3;
    }
}
