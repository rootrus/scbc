package p040o;

import p040o.getImageWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.DocumentBaseCaptureExperience */
public final /* synthetic */ class DocumentBaseCaptureExperience implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean read;
    private final /* synthetic */ isAnimationTutorEnable write;

    public /* synthetic */ DocumentBaseCaptureExperience(isAnimationTutorEnable isanimationtutorenable, boolean z) {
        this.write = isanimationtutorenable;
        this.read = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        isAnimationTutorEnable isanimationtutorenable = this.write;
        boolean z = this.read;
        getImageWidth.IconCompatParcelizer.C10788IconCompatParcelizer iconCompatParcelizer = (getImageWidth.IconCompatParcelizer.C10788IconCompatParcelizer) obj;
        if (!z) {
            iconCompatParcelizer.write(false);
        }
        if (z && (!isanimationtutorenable.MediaBrowserCompat$ItemReceiver.values().contains(Boolean.FALSE))) {
            iconCompatParcelizer.write(true);
        }
    }
}
