package p040o;

import p040o.Check;
import p040o.Frame;

/* renamed from: o.IsgMrzDocumentDetector */
public class IsgMrzDocumentDetector extends IsgDetectionModule_GetDocumentDetectorFactory<Check.IconCompatParcelizer> {
    /* access modifiers changed from: private */
    public final fillArray IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final detectorIsOperational MediaBrowserCompat$ItemReceiver;
    public final Frame.Metadata read;
    public getLegacySharedPrefs write;

    @HmlPinActivity
    public IsgMrzDocumentDetector(RegularImmutableBiMap regularImmutableBiMap, Frame.Metadata metadata, detectorIsOperational detectorisoperational, fillArray fillarray) {
        super(regularImmutableBiMap);
        this.read = metadata;
        this.MediaBrowserCompat$ItemReceiver = detectorisoperational;
        this.IconCompatParcelizer = fillarray;
    }

    static /* synthetic */ void write(IsgMrzDocumentDetector isgMrzDocumentDetector) {
        if (isgMrzDocumentDetector.RatingCompat != null) {
            isgMrzDocumentDetector.RatingCompat.aj_();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void read(p040o.getLegacySharedPrefs r3, p040o.Check.IconCompatParcelizer r4) {
        /*
            java.lang.String r3 = r3.MediaDescriptionCompat
            int r0 = r3.hashCode()
            r1 = 1
            r2 = 2365553(0x241871, float:3.314846E-39)
            if (r0 == r2) goto L_0x001b
            r2 = 277399877(0x1088c945, float:5.3952646E-29)
            if (r0 != r2) goto L_0x0025
            java.lang.String r0 = "HOME_TOP_UP"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0025
            r3 = r1
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "MHMC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0025
            r3 = 0
            goto L_0x0026
        L_0x0025:
            r3 = -1
        L_0x0026:
            if (r3 == 0) goto L_0x0030
            if (r3 != r1) goto L_0x0035
            int r3 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.easycash_introduction_home_top_up_title
            r4.MediaBrowserCompat$CustomActionResultReceiver((int) r3)
            return
        L_0x0030:
            int r3 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.easycash_introduction_mhmc_title
            r4.MediaBrowserCompat$CustomActionResultReceiver((int) r3)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.IsgMrzDocumentDetector.read(o.getLegacySharedPrefs, o.Check$IconCompatParcelizer):void");
    }
}
