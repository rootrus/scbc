package p040o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: o.FragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment */
public final class FragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment implements Application.ActivityLifecycleCallbacks {
    private int read;
    public FragmentBuilder_BindBaseTargetSelectedFragment write;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        FragmentBuilder_BindBaseTargetSelectedFragment fragmentBuilder_BindBaseTargetSelectedFragment;
        if (this.read == 0 && (fragmentBuilder_BindBaseTargetSelectedFragment = this.write) != null) {
            fragmentBuilder_BindBaseTargetSelectedFragment.MenuItemWrapperICS$CollapsibleActionViewWrapper();
        }
        this.read++;
    }

    public final void onActivityStopped(Activity activity) {
        FragmentBuilder_BindBaseTargetSelectedFragment fragmentBuilder_BindBaseTargetSelectedFragment;
        int i = this.read - 1;
        this.read = i;
        if (i == 0 && (fragmentBuilder_BindBaseTargetSelectedFragment = this.write) != null) {
            fragmentBuilder_BindBaseTargetSelectedFragment.AbsActionBarView();
        }
        if (this.read < 0) {
            this.read = 0;
        }
    }
}
