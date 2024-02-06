package p040o;

import p040o.CrashlyticsBackgroundWorker;
import p040o.Frame;
import p040o.ImageProcessor;
import p040o.writeUInt64NoTag;
import p040o.zzbt;

/* renamed from: o.IsgDetectionModule */
public class IsgDetectionModule extends IsgDetectionModule_GetDocumentDetectorFactory<Check$MediaBrowserCompat$CustomActionResultReceiver> {
    public final Frame.Metadata IconCompatParcelizer;
    public final MultiDetector read;
    /* access modifiers changed from: private */
    public final swap write;

    @HmlPinActivity
    public IsgDetectionModule(RegularImmutableBiMap regularImmutableBiMap, Frame.Metadata metadata, MultiDetector multiDetector, swap swap) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = metadata;
        this.read = multiDetector;
        this.write = swap;
    }

    /* renamed from: o.IsgDetectionModule$IconCompatParcelizer */
    public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<resetAnalyticsData> {
        private final getMappingFileId read;

        public final /* synthetic */ void onNext(Object obj) {
            IsgDetectionModule.write(IsgDetectionModule.this);
            CrashlyticsBackgroundWorker.C32131 read2 = IsgDetectionModule.this.write.read((resetAnalyticsData) obj, this.read);
            IsgDetectionModule isgDetectionModule = IsgDetectionModule.this;
            ImageProcessor.QaProgressClient.C34821 r1 = new writeUInt64NoTag.IconCompatParcelizer() {
                public final void IconCompatParcelizer(Object obj) {
                    ((Check$MediaBrowserCompat$CustomActionResultReceiver) obj).read(CrashlyticsBackgroundWorker.C32131.this);
                }
            };
            if (isgDetectionModule.RatingCompat != null) {
                r1.IconCompatParcelizer(isgDetectionModule.RatingCompat);
            }
        }

        public IconCompatParcelizer(getMappingFileId getmappingfileid) {
            this.read = getmappingfileid;
        }

        public final void onError(Throwable th) {
            IsgDetectionModule isgDetectionModule = IsgDetectionModule.this;
            ImageProcessor.C3484a aVar = new ImageProcessor.C3484a(this, th);
            if (isgDetectionModule.RatingCompat != null) {
                aVar.IconCompatParcelizer(isgDetectionModule.RatingCompat);
            }
        }
    }

    /* renamed from: o.IsgDetectionModule$write */
    public class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzbt.zzc> {
        public write() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzbt.zzc zzc = (zzbt.zzc) obj;
            super.onNext(zzc);
            IsgDetectionModule isgDetectionModule = IsgDetectionModule.this;
            ImageProcessor.C3485b bVar = new ImageProcessor.C3485b(zzc);
            if (isgDetectionModule.RatingCompat != null) {
                bVar.IconCompatParcelizer(isgDetectionModule.RatingCompat);
            }
        }

        static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(zzbt.zzc zzc, Check$MediaBrowserCompat$CustomActionResultReceiver check$MediaBrowserCompat$CustomActionResultReceiver) {
            check$MediaBrowserCompat$CustomActionResultReceiver.aj_();
            if (zzc.MediaBrowserCompat$CustomActionResultReceiver != null) {
                check$MediaBrowserCompat$CustomActionResultReceiver.RatingCompat(zzc.MediaBrowserCompat$ItemReceiver);
            }
        }

        public final void onError(Throwable th) {
            super.onError(th);
            IsgDetectionModule isgDetectionModule = IsgDetectionModule.this;
            handleIpProgressUpdate handleipprogressupdate = new handleIpProgressUpdate(this, th);
            if (isgDetectionModule.RatingCompat != null) {
                handleipprogressupdate.IconCompatParcelizer(isgDetectionModule.RatingCompat);
            }
        }
    }

    public void onDestroy() {
        MultiDetector multiDetector = this.read;
        if (!multiDetector.MediaBrowserCompat$MediaItem.isDisposed()) {
            multiDetector.MediaBrowserCompat$MediaItem.dispose();
        }
        Frame.Metadata metadata = this.IconCompatParcelizer;
        if (!metadata.MediaBrowserCompat$MediaItem.isDisposed()) {
            metadata.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void write(IsgDetectionModule isgDetectionModule) {
        if (isgDetectionModule.RatingCompat != null) {
            isgDetectionModule.RatingCompat.aj_();
        }
    }
}
