package p040o;

import java.lang.reflect.Constructor;
import kotlin.TypeCastException;
import p040o.HmlVerifyIdentifyActivity;

/* renamed from: o.onCheckedConsent$MediaBrowserCompat$ItemReceiver */
public final class onCheckedConsent$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, Throwable> {
    private /* synthetic */ Constructor read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public onCheckedConsent$MediaBrowserCompat$ItemReceiver(Constructor constructor) {
        super(1);
        this.read = constructor;
    }

    /* access modifiers changed from: private */
    /* renamed from: write */
    public Throwable invoke(Throwable th) {
        Object obj;
        onGetStartedClick.write((Object) th, "e");
        try {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            Object newInstance = this.read.newInstance(new Object[]{th});
            if (newInstance != null) {
                obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver((Throwable) newInstance);
                if (HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver(obj)) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
        } catch (Throwable th2) {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) th2, "exception");
            obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th2));
        }
    }
}
