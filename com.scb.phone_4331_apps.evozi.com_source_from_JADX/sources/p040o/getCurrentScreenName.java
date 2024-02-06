package p040o;

import java.util.List;

/* renamed from: o.getCurrentScreenName */
public final class getCurrentScreenName {
    private final String IconCompatParcelizer;
    public final List<setDataCollectionEnabled> MediaBrowserCompat$ItemReceiver;
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrentScreenName)) {
            return false;
        }
        getCurrentScreenName getcurrentscreenname = (getCurrentScreenName) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getcurrentscreenname.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcurrentscreenname.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcurrentscreenname.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<setDataCollectionEnabled> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashLoanCalculation(loanAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", duration=");
        sb.append(this.write);
        sb.append(", details=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getCurrentScreenName(String str, String str2, List<? extends setDataCollectionEnabled> list) {
        onGetStartedClick.write((Object) str, "loanAmount");
        onGetStartedClick.write((Object) str2, "duration");
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.MediaBrowserCompat$ItemReceiver = list;
    }
}
