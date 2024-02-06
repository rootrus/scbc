package p040o;

import p040o.CrashlyticsReport;
import p040o.IdWorkflowActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.XVrsAutoCrop */
public final class XVrsAutoCrop extends writeUInt64NoTag<IdWorkflowActivity.C69161.write> {
    public CrashlyticsReport.FilesPayload.File.Builder read;
    public CrashlyticsReport.Session.Event.Application.Execution write;

    /* renamed from: o.XVrsAutoCrop$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<IdWorkflowActivity.C69161.write> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdWorkflowActivity.C69161.write) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* renamed from: o.XVrsAutoCrop$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<IdWorkflowActivity.C69161.write> {
        private /* synthetic */ XVrsAutoCrop read;

        public read(XVrsAutoCrop xVrsAutoCrop) {
            this.read = xVrsAutoCrop;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdWorkflowActivity.C69161.write) obj).IconCompatParcelizer(this.read.write);
        }
    }

    /* renamed from: o.XVrsAutoCrop$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<IdWorkflowActivity.C69161.write> {
        private /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution MediaBrowserCompat$CustomActionResultReceiver;

        public write(CrashlyticsReport.Session.Event.Application.Execution execution) {
            this.MediaBrowserCompat$CustomActionResultReceiver = execution;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdWorkflowActivity.C69161.write) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public XVrsAutoCrop(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }

    public static CrashlyticsReport.FilesPayload.File read() {
        CrashlyticsReport.FilesPayload.File.write write2 = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.DIRECT_DEBIT_SOURCE_FUNCTION);
        write2.MediaBrowserCompat$ItemReceiver = false;
        write2.IconCompatParcelizer = true;
        write2.MediaDescriptionCompat = true;
        write2.RatingCompat = true;
        CrashlyticsReport.FilesPayload.File file = new CrashlyticsReport.FilesPayload.File(write2, (byte) 0);
        onGetStartedClick.IconCompatParcelizer((Object) file, "AccountSourceSelectDispl…                 .build()");
        return file;
    }
}
