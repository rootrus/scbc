package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.CheckCaptureExperience;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getPageLongEdgeThreshold */
public final /* synthetic */ class getPageLongEdgeThreshold implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CheckCaptureExperience.C11501 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getPageLongEdgeThreshold(CheckCaptureExperience.C11501 r1, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        CheckCaptureExperience.C11501 r0 = this.MediaBrowserCompat$ItemReceiver;
        Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
        getFaceImageField getfaceimagefield = (getFaceImageField) obj;
        if (!CheckCaptureExperience.this.MediaBrowserCompat$SearchResultReceiver(th)) {
            if (th instanceof RetrofitException) {
                RetrofitException retrofitException = (RetrofitException) th;
                if (!(retrofitException.IconCompatParcelizer == null || retrofitException.IconCompatParcelizer.write == null || retrofitException.IconCompatParcelizer.write.IconCompatParcelizer == null)) {
                    String str = retrofitException.IconCompatParcelizer.write.IconCompatParcelizer;
                    if (str.equalsIgnoreCase("1035") || str.equalsIgnoreCase("1037") || str.equalsIgnoreCase("1038")) {
                        CheckCaptureExperience.MediaBrowserCompat$ItemReceiver(CheckCaptureExperience.this);
                        getfaceimagefield.mo13730i_(CheckCaptureExperience.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
                        return;
                    }
                    CheckCaptureExperience.this.MediaBrowserCompat$ItemReceiver(CheckCaptureExperience.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new setCheckCaptureExperience(getfaceimagefield)));
                    return;
                }
            }
            CheckCaptureExperience.this.MediaBrowserCompat$ItemReceiver(CheckCaptureExperience.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }
}
