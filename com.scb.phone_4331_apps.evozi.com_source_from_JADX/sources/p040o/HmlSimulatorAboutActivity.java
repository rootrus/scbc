package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: o.HmlSimulatorAboutActivity */
public final class HmlSimulatorAboutActivity {
    public static ExecutorService MediaBrowserCompat$ItemReceiver = Executors.newCachedThreadPool();
    /* access modifiers changed from: private */
    public WeakReference<Context> IconCompatParcelizer;
    /* access modifiers changed from: private */
    public IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public Resources MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public lambda$onCreate$0$HmlSelectedOfferReviewActivity read;
    /* access modifiers changed from: private */
    public Bitmap write;

    /* renamed from: o.HmlSimulatorAboutActivity$IconCompatParcelizer */
    public interface IconCompatParcelizer {
        void MediaBrowserCompat$ItemReceiver(BitmapDrawable bitmapDrawable);
    }

    public HmlSimulatorAboutActivity(View view, lambda$onCreate$0$HmlSelectedOfferReviewActivity lambda_oncreate_0_hmlselectedofferreviewactivity, IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$SearchResultReceiver = view.getResources();
        this.read = lambda_oncreate_0_hmlselectedofferreviewactivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.IconCompatParcelizer = new WeakReference<>(view.getContext());
        this.write = HmlSensitiveConsentActivity.IconCompatParcelizer(view);
    }
}
