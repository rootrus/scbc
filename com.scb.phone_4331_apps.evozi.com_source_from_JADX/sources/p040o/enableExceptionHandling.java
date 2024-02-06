package p040o;

import java.util.List;
import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.enableExceptionHandling */
public final class enableExceptionHandling {
    public final String IconCompatParcelizer;
    public final List<cleanInvalidTempFiles> MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enableExceptionHandling)) {
            return false;
        }
        enableExceptionHandling enableexceptionhandling = (enableExceptionHandling) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) enableexceptionhandling.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) enableexceptionhandling.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) enableexceptionhandling.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) enableexceptionhandling.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        List<cleanInvalidTempFiles> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlNTBApplyLoanEntryDisplay(title=");
        sb.append(this.write);
        sb.append(", iconPath=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", buttons=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public enableExceptionHandling(String str, String str2, String str3, List<cleanInvalidTempFiles> list) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str2, "iconPath");
        onGetStartedClick.write((Object) str3, "description");
        onGetStartedClick.write((Object) list, "buttons");
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }
}
