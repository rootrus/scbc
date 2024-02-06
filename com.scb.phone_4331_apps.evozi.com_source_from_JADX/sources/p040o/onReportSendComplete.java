package p040o;

import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.onReportSendComplete */
public final class onReportSendComplete {
    public boolean MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onReportSendComplete)) {
            return false;
        }
        onReportSendComplete onreportsendcomplete = (onReportSendComplete) obj;
        return this.MediaBrowserCompat$ItemReceiver == onreportsendcomplete.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onreportsendcomplete.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onreportsendcomplete.read);
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        if (z) {
            z = true;
        }
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((z ? 1 : 0) * true) + hashCode) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SuitabilityAssessmentAnswerDisplay(selected=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", title=");
        sb.append(this.write);
        sb.append(", score=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public onReportSendComplete(boolean z, String str, String str2) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str2, "score");
        this.MediaBrowserCompat$ItemReceiver = z;
        this.write = str;
        this.read = str2;
    }
}
