package p040o;

import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.writeInitialPartsTo */
public final class writeInitialPartsTo extends writeSessionOS {
    public final String IconCompatParcelizer;
    public final String read;
    public final String write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public writeInitialPartsTo(String str, String str2, String str3) {
        super(str);
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str2, "extra");
        onGetStartedClick.write((Object) str3, "iconPath");
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.write = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof writeInitialPartsTo)) {
            return false;
        }
        writeInitialPartsTo writeinitialpartsto = (writeInitialPartsTo) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) writeinitialpartsto.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) writeinitialpartsto.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) writeinitialpartsto.write);
    }

    public final int hashCode() {
        String str = this.read;
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
        sb.append("HmlDocumentTypeDisplay(title=");
        sb.append(this.read);
        sb.append(", extra=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", iconPath=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
