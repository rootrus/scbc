package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsBackgroundWorker;
import p040o.writeUInt64NoTag;

/* renamed from: o.BarCodeDataFormat */
public final /* synthetic */ class BarCodeDataFormat implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsBackgroundWorker.C32131 read;

    public /* synthetic */ BarCodeDataFormat(CrashlyticsBackgroundWorker.C32131 r1) {
        this.read = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.Keep) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read);
    }
}
