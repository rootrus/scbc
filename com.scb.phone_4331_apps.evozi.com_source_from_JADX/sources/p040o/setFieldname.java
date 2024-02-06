package p040o;

import p040o.AutoCrashlyticsReportEncoder;
import p040o.TaskRunner;

/* renamed from: o.setFieldname */
public final /* synthetic */ class setFieldname implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String write;

    public /* synthetic */ setFieldname(String str) {
        this.write = str;
    }

    public final boolean write(Object obj) {
        return TaskRunner.C3841a.IconCompatParcelizer(this.write, (AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder) obj);
    }
}
