package p040o;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: o.FragmentBuilder_BindEnterProxyFragment */
public final class FragmentBuilder_BindEnterProxyFragment implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final WeakReference<ImageView> IconCompatParcelizer;
    final FragmentBuilder_BindFundDetailSummaryFragment MediaBrowserCompat$CustomActionResultReceiver;
    public FragmentBuilder_BindEkycFragment write;

    FragmentBuilder_BindEnterProxyFragment(FragmentBuilder_BindFundDetailSummaryFragment fragmentBuilder_BindFundDetailSummaryFragment, ImageView imageView, FragmentBuilder_BindEkycFragment fragmentBuilder_BindEkycFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindFundDetailSummaryFragment;
        this.IconCompatParcelizer = new WeakReference<>(imageView);
        this.write = fragmentBuilder_BindEkycFragment;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }

    public final boolean onPreDraw() {
        ImageView imageView = this.IconCompatParcelizer.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.IconCompatParcelizer.clear();
            FragmentBuilder_BindFundDetailSummaryFragment fragmentBuilder_BindFundDetailSummaryFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
            fragmentBuilder_BindFundDetailSummaryFragment.write = false;
            fragmentBuilder_BindFundDetailSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver.read(width, height);
            fragmentBuilder_BindFundDetailSummaryFragment.read(imageView, this.write);
        }
        return true;
    }
}
