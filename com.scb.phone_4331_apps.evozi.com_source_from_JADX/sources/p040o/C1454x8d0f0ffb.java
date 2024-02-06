package p040o;

import android.view.View;
import android.view.ViewTreeObserver;
import com.drew.imaging.riff.RiffProcessingException;
import java.io.IOException;

/* renamed from: o.setBackgroundDrawable$MediaBrowserCompat$CustomActionResultReceiver */
public final class C1454x8d0f0ffb implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoField;
    public static final int cardview_compat_inset_shadow = 2131165300;
    public static final int cardview_default_elevation = 2131165301;
    public static final int cardview_default_radius = 2131165302;
    private ViewTreeObserver IconCompatParcelizer;
    private final View MediaBrowserCompat$CustomActionResultReceiver;
    private final Runnable read;

    public C1454x8d0f0ffb(View view, Runnable runnable) {
        this.MediaBrowserCompat$CustomActionResultReceiver = view;
        this.IconCompatParcelizer = view.getViewTreeObserver();
        this.read = runnable;
    }

    public final boolean onPreDraw() {
        MediaBrowserCompat$ItemReceiver();
        this.read.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.IconCompatParcelizer = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        MediaBrowserCompat$ItemReceiver();
    }

    private void MediaBrowserCompat$ItemReceiver() {
        if (this.IconCompatParcelizer.isAlive()) {
            this.IconCompatParcelizer.removeOnPreDrawListener(this);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.removeOnAttachStateChangeListener(this);
    }

    public C1454x8d0f0ffb() {
    }

    public static void read(copy1DRangeFromUnchecked copy1drangefromunchecked, getDocumentFramingError getdocumentframingerror) throws RiffProcessingException, IOException {
        copy1drangefromunchecked.IconCompatParcelizer = false;
        String str = new String(copy1drangefromunchecked.IconCompatParcelizer(4));
        if (str.equals("RIFF")) {
            int MediaBrowserCompat$CustomActionResultReceiver2 = copy1drangefromunchecked.MediaBrowserCompat$CustomActionResultReceiver() - 4;
            if (getdocumentframingerror.write(new String(copy1drangefromunchecked.IconCompatParcelizer(4)))) {
                while (MediaBrowserCompat$CustomActionResultReceiver2 != 0) {
                    String str2 = new String(copy1drangefromunchecked.IconCompatParcelizer(4));
                    int MediaBrowserCompat$CustomActionResultReceiver3 = copy1drangefromunchecked.MediaBrowserCompat$CustomActionResultReceiver();
                    int i = MediaBrowserCompat$CustomActionResultReceiver2 - 8;
                    if (MediaBrowserCompat$CustomActionResultReceiver3 < 0 || i < MediaBrowserCompat$CustomActionResultReceiver3) {
                        throw new RiffProcessingException("Invalid RIFF chunk size");
                    }
                    if (getdocumentframingerror.IconCompatParcelizer(str2)) {
                        getdocumentframingerror.MediaBrowserCompat$ItemReceiver(str2, copy1drangefromunchecked.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver3));
                    } else {
                        copy1drangefromunchecked.write((long) MediaBrowserCompat$CustomActionResultReceiver3);
                    }
                    MediaBrowserCompat$CustomActionResultReceiver2 = i - MediaBrowserCompat$CustomActionResultReceiver3;
                    if (MediaBrowserCompat$CustomActionResultReceiver3 % 2 == 1) {
                        copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver();
                        MediaBrowserCompat$CustomActionResultReceiver2--;
                    }
                }
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid RIFF header: ");
        sb.append(str);
        throw new RiffProcessingException(sb.toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    static {
        /*
            o.TierPricingInstallmentAdapter$InstallmentViewHolder[] r0 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            $SwitchMap$org$threeten$bp$temporal$ChronoField = r0
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x001d }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C1454x8d0f0ffb.<clinit>():void");
    }
}
