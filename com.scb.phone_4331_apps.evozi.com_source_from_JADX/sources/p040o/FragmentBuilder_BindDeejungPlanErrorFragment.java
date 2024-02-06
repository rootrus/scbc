package p040o;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: o.FragmentBuilder_BindDeejungPlanErrorFragment */
public final class FragmentBuilder_BindDeejungPlanErrorFragment {
    FrameLayout.LayoutParams MediaBrowserCompat$CustomActionResultReceiver = ((FrameLayout.LayoutParams) this.write.getLayoutParams());
    int read;
    View write;

    public FragmentBuilder_BindDeejungPlanErrorFragment(Activity activity) {
        View childAt = ((FrameLayout) activity.findViewById(16908290)).getChildAt(0);
        this.write = childAt;
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new FragmentBuilder_BindDebitCardFunctinSelectinFragment(this));
    }
}
