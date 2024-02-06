package p040o;

import p040o.CrashlyticsReport;
import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.eB */
public final class C4331eB extends writeUInt64NoTag<LocalProjectProvider.C69331.write> {

    /* renamed from: o.eB$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.C69331.write> {
        public static final read read = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            CrashlyticsReport.FilesPayload.File.write write = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.TRANSFER_AND_FIXED_TRANSFER_FUNCTION);
            write.MediaBrowserCompat$ItemReceiver = false;
            write.IconCompatParcelizer = true;
            write.MediaDescriptionCompat = true;
            write.RatingCompat = true;
            write.RatingCompat = false;
            write.MediaDescriptionCompat = false;
            write.IconCompatParcelizer = false;
            write.read = 4;
            CrashlyticsReport.FilesPayload.File file = new CrashlyticsReport.FilesPayload.File(write, (byte) 0);
            onGetStartedClick.IconCompatParcelizer((Object) file, "AccountSourceSelectDispl…                 .build()");
            ((LocalProjectProvider.C69331.write) obj).IconCompatParcelizer(file);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4331eB(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
