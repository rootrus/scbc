package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p040o.C1390x230a8146;
import p040o.FragmentBuilder_BindInvestmentFundDetailFragment;
import p040o.SwitchCompat;
import p040o.nClosureSetGlobal;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    private Map<View, Integer> read;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final FabTransformationBehavior.read MediaBrowserCompat$CustomActionResultReceiver(Context context, boolean z) {
        int i;
        if (z) {
            i = C1390x230a8146.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C1390x230a8146.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.read read2 = new FabTransformationBehavior.read();
        read2.MediaBrowserCompat$CustomActionResultReceiver = nClosureSetGlobal.read(context, i);
        read2.read = new FragmentBuilder_BindInvestmentFundDetailFragment();
        return read2;
    }

    /* access modifiers changed from: protected */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.read = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.read) && (((CoordinatorLayout.read) childAt.getLayoutParams()).MediaDescriptionCompat instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (!z) {
                        Map<View, Integer> map = this.read;
                        if (map != null && map.containsKey(childAt)) {
                            SwitchCompat.write(childAt, this.read.get(childAt).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.read.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        SwitchCompat.write(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.read = null;
            }
        }
        return super.MediaBrowserCompat$CustomActionResultReceiver(view, view2, z, z2);
    }
}
