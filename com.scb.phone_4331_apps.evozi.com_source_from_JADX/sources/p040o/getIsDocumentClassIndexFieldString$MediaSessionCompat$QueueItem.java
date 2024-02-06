package p040o;

import java.util.List;
import p040o.PassportCaptureModule_GetUriRttiFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIsDocumentClassIndexFieldString$MediaSessionCompat$QueueItem */
final class getIsDocumentClassIndexFieldString$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetUriRttiFactory.read> {
    private /* synthetic */ List IconCompatParcelizer;

    getIsDocumentClassIndexFieldString$MediaSessionCompat$QueueItem(List list) {
        this.IconCompatParcelizer = list;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule_GetUriRttiFactory.read) obj).write(this.IconCompatParcelizer);
    }
}
