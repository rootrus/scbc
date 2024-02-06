package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.createUpdateStatement */
public final /* synthetic */ class createUpdateStatement implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AppStatsInstanceType MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Object read;

    public /* synthetic */ createUpdateStatement(AppStatsInstanceType appStatsInstanceType, Object obj) {
        this.MediaBrowserCompat$CustomActionResultReceiver = appStatsInstanceType;
        this.read = obj;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsInstanceType appStatsInstanceType = this.MediaBrowserCompat$CustomActionResultReceiver;
        Object obj2 = this.read;
        fromExtractorField fromextractorfield = (fromExtractorField) obj;
        fromextractorfield.aj_();
        List list = (List) obj2;
        if (list != null && !list.isEmpty()) {
            fromextractorfield.MediaBrowserCompat$CustomActionResultReceiver(appStatsInstanceType.write.read(list, appStatsInstanceType.read.write.setItemInvoker()));
        }
    }
}
