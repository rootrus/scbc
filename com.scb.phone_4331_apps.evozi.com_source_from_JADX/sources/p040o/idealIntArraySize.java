package p040o;

import java.util.List;
import org.bouncycastle.i18n.MessageBundle;
import p040o.zziu;

/* renamed from: o.idealIntArraySize */
public final class idealIntArraySize {
    public final zzui<String> IconCompatParcelizer;
    public final zzui<String> MediaBrowserCompat$CustomActionResultReceiver;
    public final List<zziu.zzd> read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idealIntArraySize)) {
            return false;
        }
        idealIntArraySize idealintarraysize = (idealIntArraySize) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) idealintarraysize.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) idealintarraysize.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) idealintarraysize.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) idealintarraysize.read);
    }

    public final int hashCode() {
        zzui<String> zzui = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = zzui != null ? zzui.hashCode() : 0;
        String str = this.write;
        int hashCode2 = str != null ? str.hashCode() : 0;
        zzui<String> zzui2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = zzui2 != null ? zzui2.hashCode() : 0;
        List<zziu.zzd> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlNTBApplyLoanEntry(title=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", iconPath=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", buttons=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public idealIntArraySize(zzui<String> zzui, String str, zzui<String> zzui2, List<zziu.zzd> list) {
        onGetStartedClick.write((Object) zzui, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str, "iconPath");
        onGetStartedClick.write((Object) zzui2, "description");
        onGetStartedClick.write((Object) list, "buttons");
        this.IconCompatParcelizer = zzui;
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = zzui2;
        this.read = list;
    }
}
