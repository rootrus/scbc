package p040o;

import p040o.CrashlyticsController;

/* renamed from: o.getLogFileDir */
public final class getLogFileDir extends CrashlyticsController.SendReportRunnable {
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getLogFileDir(String str, String str2, String str3) {
        super((byte) 0);
        onGetStartedClick.write((Object) str, "dueDate");
        onGetStartedClick.write((Object) str2, "dueAmount");
        onGetStartedClick.write((Object) str3, "description");
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLogFileDir)) {
            return false;
        }
        getLogFileDir getlogfiledir = (getLogFileDir) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getlogfiledir.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getlogfiledir.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getlogfiledir.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DefaultPaymentDetailDisplay(dueDate=");
        sb.append(this.write);
        sb.append(", dueAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", description=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
