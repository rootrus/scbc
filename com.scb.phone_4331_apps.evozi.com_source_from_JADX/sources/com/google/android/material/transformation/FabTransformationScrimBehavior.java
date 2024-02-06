package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p040o.FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment;
import p040o.Iterables;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    private final FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.read MediaBrowserCompat$CustomActionResultReceiver = new FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.read(0);
    private final FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.read write = new FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.read(75);

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean read(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public final boolean write(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.write(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: protected */
    public final AnimatorSet IconCompatParcelizer(View view, final View view2, final boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.read read = z ? this.write : this.MediaBrowserCompat$CustomActionResultReceiver;
        if (z) {
            if (!z2) {
                view2.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f});
        }
        read.write(objectAnimator);
        arrayList.add(objectAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        Iterables.C35273.read(animatorSet, arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                if (z) {
                    view2.setVisibility(0);
                }
            }

            public final void onAnimationEnd(Animator animator) {
                if (!z) {
                    view2.setVisibility(4);
                }
            }
        });
        return animatorSet;
    }
}
