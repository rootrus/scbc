package p040o;

import android.app.Activity;
import java.util.HashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.FragmentBuilder_BindMobileListFragment;

/* renamed from: o.FragmentBuilder_BindMwEditCreateQrFragment */
public final class FragmentBuilder_BindMwEditCreateQrFragment {
    public static FragmentBuilder_BindMwEditCreateQrFragment read;
    public HashMap<Object, Object> IconCompatParcelizer = new HashMap<>();

    /* renamed from: o.FragmentBuilder_BindMwEditCreateQrFragment$read */
    static final class read<S> implements onSeeInstructionsClicked<OnBoardingTutorialActivity> {
        private /* synthetic */ Activity IconCompatParcelizer;
        private /* synthetic */ FragmentBuilder_BindMwShopAddressDepartmentFragment read;

        read(Activity activity, FragmentBuilder_BindMwShopAddressDepartmentFragment fragmentBuilder_BindMwShopAddressDepartmentFragment) {
            this.IconCompatParcelizer = activity;
            this.read = fragmentBuilder_BindMwShopAddressDepartmentFragment;
        }

        public final /* synthetic */ Object write(FragmentBuilder_BindJuristicRequestFormFragment fragmentBuilder_BindJuristicRequestFormFragment, FundActionsSuccessActivity fundActionsSuccessActivity) {
            FragmentBuilder_BindMobileListFragment fragmentBuilder_BindMobileListFragment;
            onGetStartedClick.write((Object) fragmentBuilder_BindJuristicRequestFormFragment, "dispatcher");
            onGetStartedClick.write((Object) fundActionsSuccessActivity, "getState");
            try {
                if (this.IconCompatParcelizer != null) {
                    if (!FragmentBuilder_BindGiftingMoneyTransferInputFragment.read(this.IconCompatParcelizer)) {
                        if (FragmentBuilder_BindMyECouponFragment.MediaBrowserCompat$ItemReceiver.contains(this.IconCompatParcelizer.getClass())) {
                        }
                    }
                    return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
                OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) fundActionsSuccessActivity.invoke();
                if (onBoardingTutorialActivity == null) {
                    onBoardingTutorialActivity = new OnBoardingTutorialActivity((byte) 0);
                }
                Activity invoke = FragmentBuilder_BindModifyQuickBalanceFragment.MediaBrowserCompat$ItemReceiver().invoke(onBoardingTutorialActivity);
                Activity activity = this.IconCompatParcelizer;
                int hashCode = activity != null ? activity.hashCode() : PKIFailureInfo.systemUnavail;
                int i = FragmentBuilder_BindMoreOptionsFragment.IconCompatParcelizer[this.read.ordinal()];
                FragmentBuilder_BindMileageAirlineFieldDetailsFragment fragmentBuilder_BindMileageAirlineFieldDetailsFragment = null;
                if (i == 1) {
                    fragmentBuilder_BindMobileListFragment = new C6562xf685988e(hashCode);
                } else if (i == 2) {
                    Activity activity2 = this.IconCompatParcelizer;
                    fragmentBuilder_BindMobileListFragment = new FragmentBuilder_BindMobileListFragment.IconCompatParcelizer(this.IconCompatParcelizer, activity2 != null ? new FragmentBuilder_BindMileageAirlineFieldDetailsFragment(AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(activity2), activity2.hashCode(), this.read) : null);
                } else if (i == 3) {
                    fragmentBuilder_BindMobileListFragment = new FragmentBuilder_BindMobileListFragment.read(hashCode);
                } else if (i == 4) {
                    fragmentBuilder_BindMobileListFragment = new FragmentBuilder_BindMobileListFragment.write(hashCode);
                } else if (i != 5) {
                    fragmentBuilder_BindMobileListFragment = null;
                } else {
                    fragmentBuilder_BindMobileListFragment = (invoke == null || hashCode != invoke.hashCode()) ? null : C6563x29e247dd.MediaBrowserCompat$CustomActionResultReceiver;
                }
                if (fragmentBuilder_BindMobileListFragment != null) {
                    fragmentBuilder_BindJuristicRequestFormFragment.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindMobileListFragment);
                }
                Activity activity3 = this.IconCompatParcelizer;
                if (activity3 != null) {
                    fragmentBuilder_BindMileageAirlineFieldDetailsFragment = new FragmentBuilder_BindMileageAirlineFieldDetailsFragment(AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(activity3), activity3.hashCode(), this.read);
                }
                fragmentBuilder_BindJuristicRequestFormFragment.MediaBrowserCompat$ItemReceiver(new FragmentBuilder_BindMobileListFragment.RatingCompat(fragmentBuilder_BindMileageAirlineFieldDetailsFragment));
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindModifyQuickPromptPayFragment.UPDATE_ACTIVITY_LIFECYCLE_ERROR);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }
}
