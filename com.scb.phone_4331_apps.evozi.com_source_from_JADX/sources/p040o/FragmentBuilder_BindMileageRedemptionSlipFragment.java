package p040o;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: o.FragmentBuilder_BindMileageRedemptionSlipFragment */
public final class FragmentBuilder_BindMileageRedemptionSlipFragment {
    final WeakReference<Activity> IconCompatParcelizer;
    final FragmentBuilder_BindMileageAirlineFieldDetailsFragment MediaBrowserCompat$CustomActionResultReceiver;
    final FragmentBuilder_BindModifyQuickTopUpFragment MediaBrowserCompat$ItemReceiver;
    final FragmentBuilder_BindMileageAirlineFieldDetailsFragment read;

    public FragmentBuilder_BindMileageRedemptionSlipFragment() {
        this((FragmentBuilder_BindMileageAirlineFieldDetailsFragment) null, (WeakReference) null, (FragmentBuilder_BindModifyQuickTopUpFragment) null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindMileageRedemptionSlipFragment)) {
            return false;
        }
        FragmentBuilder_BindMileageRedemptionSlipFragment fragmentBuilder_BindMileageRedemptionSlipFragment = (FragmentBuilder_BindMileageRedemptionSlipFragment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fragmentBuilder_BindMileageRedemptionSlipFragment.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindMileageRedemptionSlipFragment.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindMileageRedemptionSlipFragment.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindMileageRedemptionSlipFragment.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        FragmentBuilder_BindMileageAirlineFieldDetailsFragment fragmentBuilder_BindMileageAirlineFieldDetailsFragment = this.read;
        int i = 0;
        int hashCode = fragmentBuilder_BindMileageAirlineFieldDetailsFragment != null ? fragmentBuilder_BindMileageAirlineFieldDetailsFragment.hashCode() : 0;
        FragmentBuilder_BindMileageAirlineFieldDetailsFragment fragmentBuilder_BindMileageAirlineFieldDetailsFragment2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = fragmentBuilder_BindMileageAirlineFieldDetailsFragment2 != null ? fragmentBuilder_BindMileageAirlineFieldDetailsFragment2.hashCode() : 0;
        WeakReference<Activity> weakReference = this.IconCompatParcelizer;
        int hashCode3 = weakReference != null ? weakReference.hashCode() : 0;
        FragmentBuilder_BindModifyQuickTopUpFragment fragmentBuilder_BindModifyQuickTopUpFragment = this.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindModifyQuickTopUpFragment != null) {
            i = fragmentBuilder_BindModifyQuickTopUpFragment.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    private FragmentBuilder_BindMileageRedemptionSlipFragment(FragmentBuilder_BindMileageAirlineFieldDetailsFragment fragmentBuilder_BindMileageAirlineFieldDetailsFragment, FragmentBuilder_BindMileageAirlineFieldDetailsFragment fragmentBuilder_BindMileageAirlineFieldDetailsFragment2, WeakReference<Activity> weakReference, FragmentBuilder_BindModifyQuickTopUpFragment fragmentBuilder_BindModifyQuickTopUpFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindModifyQuickTopUpFragment, "appBackGrounded");
        this.read = fragmentBuilder_BindMileageAirlineFieldDetailsFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindMileageAirlineFieldDetailsFragment2;
        this.IconCompatParcelizer = weakReference;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindModifyQuickTopUpFragment;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentBuilder_BindMileageRedemptionSlipFragment(FragmentBuilder_BindMileageAirlineFieldDetailsFragment fragmentBuilder_BindMileageAirlineFieldDetailsFragment, WeakReference weakReference, FragmentBuilder_BindModifyQuickTopUpFragment fragmentBuilder_BindModifyQuickTopUpFragment, int i) {
        this((FragmentBuilder_BindMileageAirlineFieldDetailsFragment) null, (i & 2) != 0 ? null : fragmentBuilder_BindMileageAirlineFieldDetailsFragment, (WeakReference<Activity>) (i & 4) != 0 ? null : weakReference, (i & 8) != 0 ? new FragmentBuilder_BindModifyQuickTopUpFragment((Integer) null, (Integer) null, (Integer) null, (Integer) null, 15) : fragmentBuilder_BindModifyQuickTopUpFragment);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
        r1 = r1.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\n        |ActivityLifecycleState(\n        |   activityLifecycleInfo = "
            r0.append(r1)
            o.FragmentBuilder_BindMileageAirlineFieldDetailsFragment r1 = r3.read
            r0.append(r1)
            java.lang.String r1 = ",\n        |   onResumedActivityInfo = "
            r0.append(r1)
            o.FragmentBuilder_BindMileageAirlineFieldDetailsFragment r1 = r3.MediaBrowserCompat$CustomActionResultReceiver
            r0.append(r1)
            java.lang.String r1 = ",\n        |   onResumedActivity = "
            r0.append(r1)
            java.lang.ref.WeakReference<android.app.Activity> r1 = r3.IconCompatParcelizer
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 == 0) goto L_0x002f
            android.content.ComponentName r1 = r1.getComponentName()
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            r0.append(r1)
            java.lang.String r1 = ",\n        |   appBackgrounded = "
            r0.append(r1)
            o.FragmentBuilder_BindModifyQuickTopUpFragment r1 = r3.MediaBrowserCompat$ItemReceiver
            boolean r1 = r1.read()
            r0.append(r1)
            java.lang.String r1 = "\n        |)\n    "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "|"
            java.lang.String r2 = "$this$trimMargin"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r2)
            java.lang.String r2 = "marginPrefix"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r2)
            java.lang.String r2 = ""
            java.lang.String r0 = p040o.GoodToKnowActivity.write(r0, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindMileageRedemptionSlipFragment.toString():java.lang.String");
    }

    public static /* synthetic */ FragmentBuilder_BindMileageRedemptionSlipFragment MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMileageRedemptionSlipFragment fragmentBuilder_BindMileageRedemptionSlipFragment, FragmentBuilder_BindMileageAirlineFieldDetailsFragment fragmentBuilder_BindMileageAirlineFieldDetailsFragment, FragmentBuilder_BindMileageAirlineFieldDetailsFragment fragmentBuilder_BindMileageAirlineFieldDetailsFragment2, WeakReference<Activity> weakReference, FragmentBuilder_BindModifyQuickTopUpFragment fragmentBuilder_BindModifyQuickTopUpFragment, int i) {
        if ((i & 1) != 0) {
            fragmentBuilder_BindMileageAirlineFieldDetailsFragment = fragmentBuilder_BindMileageRedemptionSlipFragment.read;
        }
        if ((i & 2) != 0) {
            fragmentBuilder_BindMileageAirlineFieldDetailsFragment2 = fragmentBuilder_BindMileageRedemptionSlipFragment.MediaBrowserCompat$CustomActionResultReceiver;
        }
        if ((i & 4) != 0) {
            weakReference = fragmentBuilder_BindMileageRedemptionSlipFragment.IconCompatParcelizer;
        }
        if ((i & 8) != 0) {
            fragmentBuilder_BindModifyQuickTopUpFragment = fragmentBuilder_BindMileageRedemptionSlipFragment.MediaBrowserCompat$ItemReceiver;
        }
        onGetStartedClick.write((Object) fragmentBuilder_BindModifyQuickTopUpFragment, "appBackGrounded");
        return new FragmentBuilder_BindMileageRedemptionSlipFragment(fragmentBuilder_BindMileageAirlineFieldDetailsFragment, fragmentBuilder_BindMileageAirlineFieldDetailsFragment2, weakReference, fragmentBuilder_BindModifyQuickTopUpFragment);
    }
}
