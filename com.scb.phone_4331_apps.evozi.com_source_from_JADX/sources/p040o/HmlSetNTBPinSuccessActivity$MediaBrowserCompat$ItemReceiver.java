package p040o;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;

/* renamed from: o.HmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver */
public class HmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver {
    private boolean IconCompatParcelizer;
    private Context MediaBrowserCompat$CustomActionResultReceiver;
    private lambda$onCreate$0$HmlSelectedOfferReviewActivity MediaBrowserCompat$ItemReceiver;
    private View read;
    C6897xeb950f47 write = null;

    public HmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver(Context context, View view, lambda$onCreate$0$HmlSelectedOfferReviewActivity lambda_oncreate_0_hmlselectedofferreviewactivity, boolean z, C6897xeb950f47 hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.read = view;
        this.MediaBrowserCompat$ItemReceiver = lambda_oncreate_0_hmlselectedofferreviewactivity;
        this.IconCompatParcelizer = z;
    }

    public final void IconCompatParcelizer(final ImageView imageView) {
        this.MediaBrowserCompat$ItemReceiver.read = this.read.getMeasuredWidth();
        this.MediaBrowserCompat$ItemReceiver.write = this.read.getMeasuredHeight();
        if (this.IconCompatParcelizer) {
            HmlSimulatorAboutActivity.MediaBrowserCompat$ItemReceiver.execute(new Runnable() {
                public final void run() {
                    final BitmapDrawable bitmapDrawable = new BitmapDrawable(HmlSimulatorAboutActivity.this.MediaBrowserCompat$SearchResultReceiver, HmlSensitiveConsentActivity.read((Context) HmlSimulatorAboutActivity.this.IconCompatParcelizer.get(), HmlSimulatorAboutActivity.this.write, HmlSimulatorAboutActivity.this.read));
                    if (HmlSimulatorAboutActivity.this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public final void run() {
                                HmlSimulatorAboutActivity.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(bitmapDrawable);
                            }
                        });
                    }
                }
            });
            return;
        }
        imageView.setImageDrawable(new BitmapDrawable(this.MediaBrowserCompat$CustomActionResultReceiver.getResources(), HmlSensitiveConsentActivity.write(this.read, this.MediaBrowserCompat$ItemReceiver)));
    }
}
