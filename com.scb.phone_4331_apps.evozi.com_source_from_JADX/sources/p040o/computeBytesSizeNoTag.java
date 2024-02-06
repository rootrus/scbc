package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.computeBytesSizeNoTag */
public final /* synthetic */ class computeBytesSizeNoTag implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List read;

    public /* synthetic */ computeBytesSizeNoTag(List list) {
        this.read = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetIExtractionServerRttiFactory) obj).IconCompatParcelizer(!this.read.isEmpty());
    }
}
