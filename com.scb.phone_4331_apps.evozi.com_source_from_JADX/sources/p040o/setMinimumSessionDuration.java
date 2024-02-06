package p040o;

/* renamed from: o.setMinimumSessionDuration */
public final class setMinimumSessionDuration {
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMinimumSessionDuration)) {
            return false;
        }
        setMinimumSessionDuration setminimumsessionduration = (setMinimumSessionDuration) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setminimumsessionduration.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setminimumsessionduration.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashDisclaimer(header=");
        sb.append(this.read);
        sb.append(", description=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public setMinimumSessionDuration(String str, String str2) {
        onGetStartedClick.write((Object) str, "header");
        onGetStartedClick.write((Object) str2, "description");
        this.read = str;
        this.write = str2;
    }
}
