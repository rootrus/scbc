package p040o;

import java.text.SimpleDateFormat;
import java.util.Date;
import p040o.CheckExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIsgDocumentDetector */
public final /* synthetic */ class getIsgDocumentDetector implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4180ch MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ AutoValue_CrashlyticsReport_FilesPayload write;

    public /* synthetic */ getIsgDocumentDetector(C4180ch chVar, AutoValue_CrashlyticsReport_FilesPayload autoValue_CrashlyticsReport_FilesPayload) {
        this.MediaBrowserCompat$ItemReceiver = chVar;
        this.write = autoValue_CrashlyticsReport_FilesPayload;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4180ch chVar = this.MediaBrowserCompat$ItemReceiver;
        AutoValue_CrashlyticsReport_FilesPayload autoValue_CrashlyticsReport_FilesPayload = this.write;
        CheckExtractor.C63961 r1 = (CheckExtractor.C63961) obj;
        String str = chVar.read;
        String str2 = chVar.MediaBrowserCompat$SearchResultReceiver;
        Date date = chVar.write;
        r1.read(str, str2, date != null ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(date).concat(".000+07:00") : "", chVar.ParcelableVolumeInfo, chVar.MediaMetadataCompat, autoValue_CrashlyticsReport_FilesPayload);
    }
}
