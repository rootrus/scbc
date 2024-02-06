package p040o;

import p040o.CrashlyticsReport;
import p040o.StreetViewPanoramaFragment;

/* renamed from: o.nativeIsEdgeSupportStrongerThanThreshold$MediaBrowserCompat$CustomActionResultReceiver */
public class C5033x1aab6002 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<HmlVerifyEmailSuccessfulActivity<getStreetNamesEnabled, StreetViewPanoramaFragment.zza>> {
    private /* synthetic */ nativeIsEdgeSupportStrongerThanThreshold MediaBrowserCompat$CustomActionResultReceiver;

    private C5033x1aab6002(nativeIsEdgeSupportStrongerThanThreshold nativeisedgesupportstrongerthanthreshold) {
        this.MediaBrowserCompat$CustomActionResultReceiver = nativeisedgesupportstrongerthanthreshold;
    }

    public /* synthetic */ C5033x1aab6002(nativeIsEdgeSupportStrongerThanThreshold nativeisedgesupportstrongerthanthreshold, byte b) {
        this(nativeisedgesupportstrongerthanthreshold);
    }

    public final /* synthetic */ void onNext(Object obj) {
        CrashlyticsReport.Session.Event.Application.Execution.Exception IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.read.IconCompatParcelizer((HmlVerifyEmailSuccessfulActivity) obj);
        nativeIsEdgeSupportStrongerThanThreshold nativeisedgesupportstrongerthanthreshold = this.MediaBrowserCompat$CustomActionResultReceiver;
        loadModel loadmodel = new loadModel(IconCompatParcelizer);
        if (nativeisedgesupportstrongerthanthreshold.RatingCompat != null) {
            loadmodel.IconCompatParcelizer(nativeisedgesupportstrongerthanthreshold.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, C6387x44179cf9 checkCaptureModule_GetProcessingParametersFactory$MediaBrowserCompat$CustomActionResultReceiver) {
        String str;
        if (!ModifyQuickTopUpReviewActivity.write(exception.setTabContainer)) {
            str = exception.setTabContainer.replaceAll(" ", "");
            if (str.length() > 100) {
                str = str.substring(0, 100);
            }
        } else {
            str = null;
        }
        checkCaptureModule_GetProcessingParametersFactory$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(exception, str);
    }

    public final void onError(Throwable th) {
        nativeIsEdgeSupportStrongerThanThreshold nativeisedgesupportstrongerthanthreshold = this.MediaBrowserCompat$CustomActionResultReceiver;
        nativeGetHorizontalMovementGuidance nativegethorizontalmovementguidance = new nativeGetHorizontalMovementGuidance(th);
        if (nativeisedgesupportstrongerthanthreshold.RatingCompat != null) {
            nativegethorizontalmovementguidance.IconCompatParcelizer(nativeisedgesupportstrongerthanthreshold.RatingCompat);
        }
    }
}
