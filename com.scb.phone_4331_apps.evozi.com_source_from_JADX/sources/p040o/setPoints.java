package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.setPoints */
public final class setPoints {
    public final OffsetDateTime IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final zzvl MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setPoints)) {
            return false;
        }
        setPoints setpoints = (setPoints) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setpoints.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setpoints.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setpoints.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setpoints.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        OffsetDateTime offsetDateTime = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        String str = this.write;
        int hashCode2 = str != null ? str.hashCode() : 0;
        zzvl zzvl = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = zzvl != null ? zzvl.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardActivationConfirmation(transactionDateTime=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", transactionId=");
        sb.append(this.write);
        sb.append(", additionalInfo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", remark=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setPoints(OffsetDateTime offsetDateTime, String str, zzvl zzvl, String str2) {
        onGetStartedClick.write((Object) zzvl, "additionalInfo");
        this.IconCompatParcelizer = offsetDateTime;
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = zzvl;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }
}
