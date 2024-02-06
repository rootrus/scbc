package com.scb.phone.view.custom.common;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.AssetManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;
import kotlin.TypeCastException;
import p040o.HmlPinActivity;
import p040o.PassportExtractActivity;
import p040o.onGetStartedClick;

public final class CustomViewProgressAnimation extends FrameLayout {
    private AnimatorSet MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public ProgressBar halfCircleProgressBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomViewProgressAnimation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) attributeSet, "attrs");
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            onGetStartedClick.IconCompatParcelizer((Object) ((LayoutInflater) systemService).inflate(R.layout.f85162131493743, this, true), "inflater.inflate(R.layou…ss_animation, this, true)");
            this.MediaBrowserCompat$CustomActionResultReceiver = new AnimatorSet();
            ButterKnife.IconCompatParcelizer(this);
            this.MediaBrowserCompat$CustomActionResultReceiver.cancel();
            AnimatorSet animatorSet = new AnimatorSet();
            ProgressBar progressBar = this.halfCircleProgressBar;
            if (progressBar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("halfCircleProgressBar");
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(progressBar, "rotation", new float[]{360.0f, BitmapDescriptorFactory.HUE_RED});
            ofFloat.setDuration(700);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(-1);
            animatorSet.playTogether(new Animator[]{ofFloat});
            this.MediaBrowserCompat$CustomActionResultReceiver = animatorSet;
            animatorSet.start();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final void setHalfCircleProgressBar(ProgressBar progressBar) {
        onGetStartedClick.write((Object) progressBar, "<set-?>");
        this.halfCircleProgressBar = progressBar;
    }

    public static final class IconCompatParcelizer implements PassportExtractActivity {
        private final AssetManager MediaBrowserCompat$CustomActionResultReceiver;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(AssetManager assetManager) {
            this.MediaBrowserCompat$CustomActionResultReceiver = assetManager;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0063, code lost:
            if (r2 != null) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
            throw r3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p040o.BScanCNotificationDeepLinkActivity<java.util.List<p040o.zzwh>> IconCompatParcelizer() {
            /*
                r6 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                com.google.gson.Gson r1 = new com.google.gson.Gson
                r1.<init>()
                android.content.res.AssetManager r2 = r6.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x006e }
                java.lang.String r3 = "location/scb_fasteasy_country_list.json"
                java.io.InputStream r2 = r2.open(r3)     // Catch:{ Exception -> 0x006e }
                int r3 = r2.available()     // Catch:{ all -> 0x0060 }
                byte[] r3 = new byte[r3]     // Catch:{ all -> 0x0060 }
                int r4 = r2.read(r3)     // Catch:{ all -> 0x0060 }
                if (r2 == 0) goto L_0x0021
                r2.close()     // Catch:{ Exception -> 0x006e }
            L_0x0021:
                if (r4 <= 0) goto L_0x0072
                java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x006e }
                java.lang.String r4 = "UTF-8"
                r2.<init>(r3, r4)     // Catch:{ Exception -> 0x006e }
                java.lang.Class<o.BindBitmap> r3 = p040o.BindBitmap.class
                java.lang.Object r1 = r1.fromJson((java.lang.String) r2, r3)     // Catch:{ Exception -> 0x006e }
                o.BindBitmap r1 = (p040o.BindBitmap) r1     // Catch:{ Exception -> 0x006e }
                java.util.List<o.BindDimen> r1 = r1.write     // Catch:{ Exception -> 0x006e }
                o.show r2 = new o.show     // Catch:{ Exception -> 0x006e }
                r2.<init>(r1)     // Catch:{ Exception -> 0x006e }
                o.checkNotZero r1 = p040o.checkNotZero.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x006e }
                o.show r3 = new o.show     // Catch:{ Exception -> 0x006e }
                o.AppCompatSeekBar r4 = r2.write     // Catch:{ Exception -> 0x006e }
                o.getSharedElementEnterTransition r5 = new o.getSharedElementEnterTransition     // Catch:{ Exception -> 0x006e }
                java.util.Iterator<? extends T> r2 = r2.IconCompatParcelizer     // Catch:{ Exception -> 0x006e }
                r5.<init>(r2, r1)     // Catch:{ Exception -> 0x006e }
                r3.<init>(r4, r5)     // Catch:{ Exception -> 0x006e }
                o.setupDialog$IconCompatParcelizer r1 = new o.setupDialog$IconCompatParcelizer     // Catch:{ Exception -> 0x006e }
                o.setupDialog$1 r2 = new o.setupDialog$1     // Catch:{ Exception -> 0x006e }
                r2.<init>()     // Catch:{ Exception -> 0x006e }
                o.setupDialog$8 r4 = new o.setupDialog$8     // Catch:{ Exception -> 0x006e }
                r4.<init>()     // Catch:{ Exception -> 0x006e }
                r1.<init>(r2, r4)     // Catch:{ Exception -> 0x006e }
                java.lang.Object r1 = r3.write(r1)     // Catch:{ Exception -> 0x006e }
                java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x006e }
                r0 = r1
                goto L_0x0072
            L_0x0060:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0062 }
            L_0x0062:
                r3 = move-exception
                if (r2 == 0) goto L_0x006d
                r2.close()     // Catch:{ all -> 0x0069 }
                goto L_0x006d
            L_0x0069:
                r2 = move-exception
                r1.addSuppressed(r2)     // Catch:{ Exception -> 0x006e }
            L_0x006d:
                throw r3     // Catch:{ Exception -> 0x006e }
            L_0x006e:
                r1 = move-exception
                p040o.onCheckBoxClick.write((java.lang.Throwable) r1)
            L_0x0072:
                o.BScanCNotificationDeepLinkActivity r0 = p040o.BScanCNotificationDeepLinkActivity.read(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.custom.common.CustomViewProgressAnimation.IconCompatParcelizer.IconCompatParcelizer():o.BScanCNotificationDeepLinkActivity");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
            if (r2 != null) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
            throw r3;
         */
        @java.lang.Deprecated
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p040o.DebitCardResetOtpActivity<p040o.zzwg> MediaBrowserCompat$ItemReceiver() {
            /*
                r5 = this;
                o.zzwg r0 = new o.zzwg
                r0.<init>()
                com.google.gson.Gson r1 = new com.google.gson.Gson
                r1.<init>()
                android.content.res.AssetManager r2 = r5.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0049 }
                java.lang.String r3 = "location/scb_fasteasy_country_list.json"
                java.io.InputStream r2 = r2.open(r3)     // Catch:{ Exception -> 0x0049 }
                int r3 = r2.available()     // Catch:{ all -> 0x003b }
                byte[] r3 = new byte[r3]     // Catch:{ all -> 0x003b }
                int r4 = r2.read(r3)     // Catch:{ all -> 0x003b }
                if (r2 == 0) goto L_0x0021
                r2.close()     // Catch:{ Exception -> 0x0049 }
            L_0x0021:
                if (r4 <= 0) goto L_0x0033
                java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x0049 }
                java.lang.String r4 = "UTF-8"
                r2.<init>(r3, r4)     // Catch:{ Exception -> 0x0049 }
                java.lang.Class<o.BindDrawable> r3 = p040o.BindDrawable.class
                java.lang.Object r1 = r1.fromJson((java.lang.String) r2, r3)     // Catch:{ Exception -> 0x0049 }
                o.BindDrawable r1 = (p040o.BindDrawable) r1     // Catch:{ Exception -> 0x0049 }
                goto L_0x0034
            L_0x0033:
                r1 = 0
            L_0x0034:
                if (r1 == 0) goto L_0x004d
                o.zzwg r0 = r1.read()     // Catch:{ Exception -> 0x0049 }
                goto L_0x004d
            L_0x003b:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x003d }
            L_0x003d:
                r3 = move-exception
                if (r2 == 0) goto L_0x0048
                r2.close()     // Catch:{ all -> 0x0044 }
                goto L_0x0048
            L_0x0044:
                r2 = move-exception
                r1.addSuppressed(r2)     // Catch:{ Exception -> 0x0049 }
            L_0x0048:
                throw r3     // Catch:{ Exception -> 0x0049 }
            L_0x0049:
                r1 = move-exception
                p040o.onCheckBoxClick.write((java.lang.Throwable) r1)
            L_0x004d:
                o.DebitCardResetOtpActivity r0 = p040o.DebitCardResetOtpActivity.just(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.custom.common.CustomViewProgressAnimation.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver():o.DebitCardResetOtpActivity");
        }
    }
}
