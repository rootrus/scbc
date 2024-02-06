package p040o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.xmlpull.p042v1.XmlPullParser;

/* renamed from: o.dispatchKeyEvent */
public final class dispatchKeyEvent extends setDrawerElevation {
    public dispatchKeyEvent(int i) {
        IconCompatParcelizer(i);
    }

    public dispatchKeyEvent() {
    }

    public dispatchKeyEvent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onSaveInstanceState.read);
        IconCompatParcelizer(AlertController$RecycleListView.read(obtainStyledAttributes, (XmlPullParser) (XmlResourceParser) attributeSet, "fadingMode", 0, MediaMetadataCompat()));
        obtainStyledAttributes.recycle();
    }

    public final void read(setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat) {
        super.read(setchildrendrawingorderenabledcompat);
        setchildrendrawingorderenabledcompat.MediaBrowserCompat$ItemReceiver.put("android:fade:transitionAlpha", Float.valueOf(setFillViewport.read(setchildrendrawingorderenabledcompat.MediaBrowserCompat$CustomActionResultReceiver)));
    }

    private Animator write(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        setFillViewport.MediaBrowserCompat$CustomActionResultReceiver(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, setFillViewport.write, new float[]{f2});
        ofFloat.addListener(new read(view));
        IconCompatParcelizer((BetterViewPager$MediaBrowserCompat$ItemReceiver) new AppCompatMultiAutoCompleteTextView() {
            public final void write(BetterViewPager betterViewPager) {
                setFillViewport.MediaBrowserCompat$CustomActionResultReceiver(view, 1.0f);
                setFillViewport.write(view);
                betterViewPager.read((BetterViewPager$MediaBrowserCompat$ItemReceiver) this);
            }
        });
        return ofFloat;
    }

    public final Animator MediaBrowserCompat$ItemReceiver(View view, setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat) {
        float f = BitmapDescriptorFactory.HUE_RED;
        float IconCompatParcelizer = IconCompatParcelizer(setchildrendrawingorderenabledcompat, (float) BitmapDescriptorFactory.HUE_RED);
        if (IconCompatParcelizer != 1.0f) {
            f = IconCompatParcelizer;
        }
        return write(view, f, 1.0f);
    }

    public final Animator IconCompatParcelizer(View view, setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat) {
        setFillViewport.MediaBrowserCompat$CustomActionResultReceiver(view);
        return write(view, IconCompatParcelizer(setchildrendrawingorderenabledcompat, 1.0f), BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.MediaBrowserCompat$ItemReceiver.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float IconCompatParcelizer(p040o.setChildrenDrawingOrderEnabledCompat r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.MediaBrowserCompat$ItemReceiver
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.dispatchKeyEvent.IconCompatParcelizer(o.setChildrenDrawingOrderEnabledCompat, float):float");
    }

    /* renamed from: o.dispatchKeyEvent$read */
    static class read extends AnimatorListenerAdapter {
        private final View MediaBrowserCompat$CustomActionResultReceiver;
        private boolean read = false;

        read(View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = view;
        }

        public final void onAnimationStart(Animator animator) {
            if (SwitchCompat.setChecked(this.MediaBrowserCompat$CustomActionResultReceiver) && this.MediaBrowserCompat$CustomActionResultReceiver.getLayerType() == 0) {
                this.read = true;
                this.MediaBrowserCompat$CustomActionResultReceiver.setLayerType(2, (Paint) null);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            setFillViewport.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, 1.0f);
            if (this.read) {
                this.MediaBrowserCompat$CustomActionResultReceiver.setLayerType(0, (Paint) null);
            }
        }
    }
}
