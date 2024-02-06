package p040o;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ScrollView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;

/* renamed from: o.FragmentBuilder_BindDeejungPlansFragment */
public final class FragmentBuilder_BindDeejungPlansFragment {
    public final getZEnd MediaBrowserCompat$ItemReceiver = getZEnd.MediaBrowserCompat$CustomActionResultReceiver;

    public static void write(final View view) {
        view.measure(-1, -2);
        final int measuredHeight = view.getMeasuredHeight();
        view.getLayoutParams().height = 1;
        view.setVisibility(0);
        C64931 r1 = new Animation() {
            public final boolean willChangeBounds() {
                return true;
            }

            /* access modifiers changed from: protected */
            public final void applyTransformation(float f, Transformation transformation) {
                super.applyTransformation(f, transformation);
                view.getLayoutParams().height = f >= 1.0f ? -2 : (int) (((float) measuredHeight) * f);
                view.requestLayout();
            }
        };
        r1.setDuration((long) ((int) (((float) measuredHeight) / view.getContext().getResources().getDisplayMetrics().density)));
        view.startAnimation(r1);
    }

    public static void read(View view) {
        Object tag = view.getTag(R.id.view_rotation);
        float floatValue = (tag == null || !(tag instanceof Float)) ? BitmapDescriptorFactory.HUE_RED : ((Float) tag).floatValue();
        float f = floatValue + 180.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", new float[]{floatValue, f});
        ofFloat.setDuration(150);
        ofFloat.start();
        view.setTag(R.id.view_rotation, Float.valueOf(f % 360.0f));
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(final View view) {
        final int measuredHeight = view.getMeasuredHeight();
        C64944 r1 = new Animation() {
            public final boolean willChangeBounds() {
                return true;
            }

            /* access modifiers changed from: protected */
            public final void applyTransformation(float f, Transformation transformation) {
                if (f >= 1.0f) {
                    view.setVisibility(8);
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int i = measuredHeight;
                layoutParams.height = i - ((int) (((float) i) * f));
                view.requestLayout();
            }
        };
        r1.setDuration((long) ((int) (((float) measuredHeight) / view.getContext().getResources().getDisplayMetrics().density)));
        view.startAnimation(r1);
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(ScrollView scrollView, int i) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(scrollView, "scrollY", new int[]{scrollView.getBottom()});
        ofInt.setDuration((long) i);
        ofInt.start();
    }
}
