package p040o;

import java.util.List;
import org.bouncycastle.i18n.MessageBundle;
import p040o.CrashlyticsController;
import p040o.CrashlyticsReport;

/* renamed from: o.recordFatalFirebaseEvent */
public final class recordFatalFirebaseEvent {
    public final CrashlyticsController.ReportUploaderFilesProvider IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$MediaItem;
    public final List<CrashlyticsReport.Session> read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof recordFatalFirebaseEvent)) {
            return false;
        }
        recordFatalFirebaseEvent recordfatalfirebaseevent = (recordFatalFirebaseEvent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) recordfatalfirebaseevent.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) recordfatalfirebaseevent.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) recordfatalfirebaseevent.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) recordfatalfirebaseevent.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) recordfatalfirebaseevent.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) recordfatalfirebaseevent.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        CrashlyticsController.ReportUploaderFilesProvider reportUploaderFilesProvider = this.IconCompatParcelizer;
        int hashCode5 = reportUploaderFilesProvider != null ? reportUploaderFilesProvider.hashCode() : 0;
        List<CrashlyticsReport.Session> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlCalculatorResultDisplay(title=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", duration=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", minRepayment=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", productCatalogue=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", promotion=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public recordFatalFirebaseEvent(String str, String str2, String str3, String str4, CrashlyticsController.ReportUploaderFilesProvider reportUploaderFilesProvider, List<CrashlyticsReport.Session> list) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str2, "duration");
        onGetStartedClick.write((Object) str3, "description");
        onGetStartedClick.write((Object) str4, "minRepayment");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaBrowserCompat$MediaItem = str4;
        this.IconCompatParcelizer = reportUploaderFilesProvider;
        this.read = list;
    }
}
