package p040o;

/* renamed from: o.setActivityTransition */
public final class setActivityTransition {
    public final String MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setActivityTransition)) {
            return false;
        }
        setActivityTransition setactivitytransition = (setActivityTransition) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setactivitytransition.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setactivitytransition.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessOwnerSpouseInfo(thaiName=");
        sb.append(this.write);
        sb.append(", citizenId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setActivityTransition(String str, String str2) {
        onGetStartedClick.write((Object) str, "thaiName");
        onGetStartedClick.write((Object) str2, "citizenId");
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}
