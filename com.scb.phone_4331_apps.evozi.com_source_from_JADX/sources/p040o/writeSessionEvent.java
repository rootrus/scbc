package p040o;

import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.writeSessionEvent */
public final class writeSessionEvent extends writeSessionOS {
    public final String read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public writeSessionEvent(String str) {
        super(str);
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        this.read = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof writeSessionEvent) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((writeSessionEvent) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlDocumentGroupDisplay(title=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
