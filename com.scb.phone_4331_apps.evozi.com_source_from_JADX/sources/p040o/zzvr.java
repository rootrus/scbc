package p040o;

import java.util.List;

/* renamed from: o.zzvr */
public final class zzvr {
    private final boolean IconCompatParcelizer;
    public final List<zzvn> MediaBrowserCompat$CustomActionResultReceiver;
    private final Double MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvr)) {
            return false;
        }
        zzvr zzvr = (zzvr) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzvr.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzvr.MediaBrowserCompat$ItemReceiver) && this.IconCompatParcelizer == zzvr.IconCompatParcelizer;
    }

    public final int hashCode() {
        List<zzvn> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        Double d = this.MediaBrowserCompat$ItemReceiver;
        if (d != null) {
            i = d.hashCode();
        }
        boolean z = this.IconCompatParcelizer;
        if (z) {
            z = true;
        }
        return (((hashCode * 31) + i) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoanSummaryList(loanList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", totalRemainingBalance=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", isTotalFromAllAccounts=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public zzvr(List<? extends zzvn> list, Double d, boolean z) {
        onGetStartedClick.write((Object) list, "loanList");
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.MediaBrowserCompat$ItemReceiver = d;
        this.IconCompatParcelizer = z;
    }
}
