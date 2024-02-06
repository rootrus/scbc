package p040o;

/* renamed from: o.cleanInvalidTempFiles */
public final class cleanInvalidTempFiles {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cleanInvalidTempFiles)) {
            return false;
        }
        cleanInvalidTempFiles cleaninvalidtempfiles = (cleanInvalidTempFiles) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) cleaninvalidtempfiles.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) cleaninvalidtempfiles.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) cleaninvalidtempfiles.write);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlNTBApplyLoanButtonDisplay(name=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", deepLink=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", trackingTag=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public cleanInvalidTempFiles(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) str2, "deepLink");
        onGetStartedClick.write((Object) str3, "trackingTag");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.write = str3;
    }
}
