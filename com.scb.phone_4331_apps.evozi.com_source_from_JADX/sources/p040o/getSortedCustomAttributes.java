package p040o;

import java.util.List;
import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.getSortedCustomAttributes */
public final class getSortedCustomAttributes {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final List<onReportSendComplete> read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSortedCustomAttributes)) {
            return false;
        }
        getSortedCustomAttributes getsortedcustomattributes = (getSortedCustomAttributes) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getsortedcustomattributes.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getsortedcustomattributes.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getsortedcustomattributes.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<onReportSendComplete> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SuitabilityAssessmentQuestionDisplay(title=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", summaryTitle=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", answers=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public getSortedCustomAttributes(String str, String str2, List<onReportSendComplete> list) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str2, "summaryTitle");
        onGetStartedClick.write((Object) list, "answers");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = str2;
        this.read = list;
    }
}
