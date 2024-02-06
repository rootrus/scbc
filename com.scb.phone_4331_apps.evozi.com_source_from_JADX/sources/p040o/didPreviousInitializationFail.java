package p040o;

import java.util.List;

/* renamed from: o.didPreviousInitializationFail */
public final class didPreviousInitializationFail {
    public final List<CrashlyticsCore> read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof didPreviousInitializationFail) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((didPreviousInitializationFail) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        List<CrashlyticsCore> list = this.read;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PortfolioSummaryDisplay(insuranceInfoList=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public didPreviousInitializationFail(List<CrashlyticsCore> list) {
        onGetStartedClick.write((Object) list, "insuranceInfoList");
        this.read = list;
    }
}
