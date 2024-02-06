package p040o;

import p040o.AlertController$RecycleListView;
import p040o.Check;
import p040o.CrashlyticsBackgroundWorker;
import p040o.Onboarding;
import p040o.writeUInt64NoTag;

/* renamed from: o.IsgDetectionModule_GetDocumentDetectorFactory */
public abstract class IsgDetectionModule_GetDocumentDetectorFactory<T extends Check> extends writeUInt64NoTag<T> {

    /* renamed from: o.IsgDetectionModule_GetDocumentDetectorFactory$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ Onboarding.C37171 MediaBrowserCompat$CustomActionResultReceiver;

        public write(Onboarding.C37171 r1) {
            this.MediaBrowserCompat$CustomActionResultReceiver = r1;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            Check check = (Check) obj;
            check.read(this.MediaBrowserCompat$CustomActionResultReceiver.write);
            check.write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
            CrashlyticsBackgroundWorker.C32142 r0 = this.MediaBrowserCompat$CustomActionResultReceiver.read;
            if (r0 == null || AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(r0.IconCompatParcelizer)) {
                check.write();
            } else {
                check.IconCompatParcelizer(r0.IconCompatParcelizer);
            }
        }
    }

    public IsgDetectionModule_GetDocumentDetectorFactory(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }
}
