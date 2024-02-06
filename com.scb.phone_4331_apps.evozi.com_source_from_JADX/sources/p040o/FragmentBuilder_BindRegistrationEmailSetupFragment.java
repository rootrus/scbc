package p040o;

import p040o.FragmentBuilder_BindPurchasedTabFragment;

/* renamed from: o.FragmentBuilder_BindRegistrationEmailSetupFragment */
public final class FragmentBuilder_BindRegistrationEmailSetupFragment {
    public PlaceBuffer write;

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(C7047xf416b507 scbMapActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindPurchaseProfileManagementFragment fragmentBuilder_BindPurchaseProfileManagementFragment) {
        if (fragmentBuilder_BindPurchaseProfileManagementFragment.read == null && fragmentBuilder_BindPurchaseProfileManagementFragment.MediaBrowserCompat$ItemReceiver != null) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindLoanFragment.FETCH_NOT_CHANGED, new Object[0]);
            C6692xabecfa4f fragmentBuilder_BindPurchasedTabFragment$MediaBrowserCompat$ItemReceiver = C6692xabecfa4f.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) fragmentBuilder_BindPurchasedTabFragment$MediaBrowserCompat$ItemReceiver, "action");
            ScbMapActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(scbMapActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, fragmentBuilder_BindPurchasedTabFragment$MediaBrowserCompat$ItemReceiver);
        } else if (fragmentBuilder_BindPurchaseProfileManagementFragment.read == null || fragmentBuilder_BindPurchaseProfileManagementFragment.MediaBrowserCompat$ItemReceiver == null) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindLoanFragment.UNKNOWN_FETCH_ERROR);
            FragmentBuilder_BindPurchasedTabFragment.write write2 = new FragmentBuilder_BindPurchasedTabFragment.write(FragmentBuilder_BindLoanFragment.UNKNOWN_FETCH_ERROR, (Throwable) null, 2);
            onGetStartedClick.write((Object) write2, "action");
            ScbMapActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(scbMapActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, write2);
        } else {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindLoanFragment.FETCH_CHANGED, new Object[0]);
            if (fragmentBuilder_BindPurchaseProfileManagementFragment.read.isEmpty()) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindLoanFragment.FETCH_EMPTY, new Object[0]);
            }
            FragmentBuilder_BindPurchasedTabFragment.read read = new FragmentBuilder_BindPurchasedTabFragment.read(fragmentBuilder_BindPurchaseProfileManagementFragment);
            onGetStartedClick.write((Object) read, "action");
            ScbMapActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(scbMapActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, read);
        }
    }
}
