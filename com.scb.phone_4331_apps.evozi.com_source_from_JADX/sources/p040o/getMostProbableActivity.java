package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.getMostProbableActivity */
public final class getMostProbableActivity {
    public final OffsetDateTime IconCompatParcelizer;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final OffsetDateTime write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMostProbableActivity)) {
            return false;
        }
        getMostProbableActivity getmostprobableactivity = (getMostProbableActivity) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getmostprobableactivity.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getmostprobableactivity.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getmostprobableactivity.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getmostprobableactivity.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        OffsetDateTime offsetDateTime = this.IconCompatParcelizer;
        int hashCode3 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        OffsetDateTime offsetDateTime2 = this.write;
        if (offsetDateTime2 != null) {
            i = offsetDateTime2.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NTBCitizenID(number=");
        sb.append(this.read);
        sb.append(", laserCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", issueDate=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", expiryDate=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public getMostProbableActivity(String str, String str2, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.IconCompatParcelizer = offsetDateTime;
        this.write = offsetDateTime2;
    }
}
