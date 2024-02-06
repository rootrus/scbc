package p040o;

/* renamed from: o.setArch */
public final class setArch {
    public final String IconCompatParcelizer;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setArch)) {
            return false;
        }
        setArch setarch = (setArch) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setarch.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setarch.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidTravelWalletDisplayRateSummaryDisplay(buyRate=");
        sb.append(this.read);
        sb.append(", sellRate=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public setArch(String str, String str2) {
        onGetStartedClick.write((Object) str, "buyRate");
        onGetStartedClick.write((Object) str2, "sellRate");
        this.read = str;
        this.IconCompatParcelizer = str2;
    }
}
