package p040o;

import p040o.AutoCrashlyticsReportEncoder;
import p040o.writeUInt64NoTag;

/* renamed from: o.ErrorEventDelegate */
public final class ErrorEventDelegate extends writeUInt64NoTag<IProjectProvider> {

    /* renamed from: o.ErrorEventDelegate$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<IProjectProvider> {
        private /* synthetic */ AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder read;

        public read(AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder) {
            this.read = crashlyticsReportSessionEventApplicationExecutionThreadEncoder;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IProjectProvider) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public ErrorEventDelegate(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
