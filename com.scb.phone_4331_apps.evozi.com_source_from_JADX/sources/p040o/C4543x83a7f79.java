package p040o;

/* renamed from: o.getCurrentTimestampSeconds$MediaBrowserCompat$CustomActionResultReceiver */
public final class C4543x83a7f79 {
    public final String MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4543x83a7f79)) {
            return false;
        }
        C4543x83a7f79 getcurrenttimestampseconds_mediabrowsercompat_customactionresultreceiver = (C4543x83a7f79) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcurrenttimestampseconds_mediabrowsercompat_customactionresultreceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcurrenttimestampseconds_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver);
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
        sb.append("BusinessExperience(year=");
        sb.append(this.write);
        sb.append(", month=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public C4543x83a7f79(String str, String str2) {
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}
