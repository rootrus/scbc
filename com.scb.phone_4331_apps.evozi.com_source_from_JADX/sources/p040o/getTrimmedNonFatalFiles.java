package p040o;

/* renamed from: o.getTrimmedNonFatalFiles */
public final class getTrimmedNonFatalFiles {
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTrimmedNonFatalFiles)) {
            return false;
        }
        getTrimmedNonFatalFiles gettrimmednonfatalfiles = (getTrimmedNonFatalFiles) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) gettrimmednonfatalfiles.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) gettrimmednonfatalfiles.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessIndustryDisplay(isicCode=");
        sb.append(this.write);
        sb.append(", isicDesc=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public getTrimmedNonFatalFiles(String str, String str2) {
        this.write = str;
        this.read = str2;
    }
}