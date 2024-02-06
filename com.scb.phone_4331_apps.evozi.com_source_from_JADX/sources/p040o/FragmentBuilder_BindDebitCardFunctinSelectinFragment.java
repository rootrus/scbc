package p040o;

import android.graphics.Rect;
import android.view.ViewTreeObserver;

/* renamed from: o.FragmentBuilder_BindDebitCardFunctinSelectinFragment */
public final /* synthetic */ class FragmentBuilder_BindDebitCardFunctinSelectinFragment implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ FragmentBuilder_BindDeejungPlanErrorFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ FragmentBuilder_BindDebitCardFunctinSelectinFragment(FragmentBuilder_BindDeejungPlanErrorFragment fragmentBuilder_BindDeejungPlanErrorFragment) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindDeejungPlanErrorFragment;
    }

    public final void onGlobalLayout() {
        FragmentBuilder_BindDeejungPlanErrorFragment fragmentBuilder_BindDeejungPlanErrorFragment = this.MediaBrowserCompat$ItemReceiver;
        Rect rect = new Rect();
        fragmentBuilder_BindDeejungPlanErrorFragment.write.getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom - rect.top;
        if (i != fragmentBuilder_BindDeejungPlanErrorFragment.read) {
            int height = fragmentBuilder_BindDeejungPlanErrorFragment.write.getRootView().getHeight();
            int i2 = height - i;
            if (i2 > height / 4) {
                fragmentBuilder_BindDeejungPlanErrorFragment.MediaBrowserCompat$CustomActionResultReceiver.height = height - i2;
            } else {
                fragmentBuilder_BindDeejungPlanErrorFragment.MediaBrowserCompat$CustomActionResultReceiver.height = -1;
            }
            fragmentBuilder_BindDeejungPlanErrorFragment.write.requestLayout();
            fragmentBuilder_BindDeejungPlanErrorFragment.read = i;
        }
    }
}
