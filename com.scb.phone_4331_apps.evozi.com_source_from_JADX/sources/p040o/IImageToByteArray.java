package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.IImageToByteArray */
public final /* synthetic */ class IImageToByteArray implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4121bx read;
    private final /* synthetic */ getSdkVersion write;

    public /* synthetic */ IImageToByteArray(C4121bx bxVar, getSdkVersion getsdkversion) {
        this.read = bxVar;
        this.write = getsdkversion;
    }

    public final void IconCompatParcelizer(Object obj) {
        List<String> list;
        AutoValue_CrashlyticsReport autoValue_CrashlyticsReport;
        getSdkVersion getsdkversion = this.write;
        getVariant getvariant = (getVariant) obj;
        if (getsdkversion == null || (autoValue_CrashlyticsReport = getsdkversion.read) == null) {
            list = null;
        } else {
            list = autoValue_CrashlyticsReport.write;
        }
        if (list == null || list.isEmpty()) {
            getvariant.IconCompatParcelizer();
        } else if (list.size() == 1) {
            getvariant.read(list.get(0));
        } else {
            getvariant.write(list);
        }
    }
}
