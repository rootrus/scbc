package p040o;

import android.content.Context;
import com.scb.phone.presentation.p037di.PresenterModule;
import p040o.CheckCaptureModule;

/* renamed from: o.constrainedEntrySet */
public final class constrainedEntrySet implements OPRStatusRewardsLandingActivity_ViewBinding<CheckCaptureModule.KtaExceptionResponseDeserializer> {
    public static CheckCaptureModule.KtaExceptionResponseDeserializer MediaBrowserCompat$ItemReceiver(PresenterModule presenterModule, Context context) {
        CheckCaptureModule.KtaExceptionResponseDeserializer MediaBrowserCompat$ItemReceiver = presenterModule.MediaBrowserCompat$ItemReceiver(context);
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.HmlReviewDocumentActivity, com.scb.phone.presentation.di.PresenterModule] */
    public final /* synthetic */ Object get() {
        ? r0 = 0;
        CheckCaptureModule.KtaExceptionResponseDeserializer MediaBrowserCompat$ItemReceiver = r0.MediaBrowserCompat$ItemReceiver((Context) r0.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
