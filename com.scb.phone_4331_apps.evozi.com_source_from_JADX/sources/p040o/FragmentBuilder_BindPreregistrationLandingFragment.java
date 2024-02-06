package p040o;

import kotlin.NoWhenBranchMatchedException;
import p040o.FragmentBuilder_BindPreregistrationInfoFragment;

/* renamed from: o.FragmentBuilder_BindPreregistrationLandingFragment */
public final class FragmentBuilder_BindPreregistrationLandingFragment {
    public incrementMatteOrMaskCount MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.FragmentBuilder_BindPreregistrationLandingFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer<S> implements FragmentBuilder_BindJuristicResetPinLandingFragment<OnBoardingTutorialActivity> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ Object read(Object obj, Object obj2) {
            Object obj3 = obj2;
            OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
            onGetStartedClick.write((Object) onBoardingTutorialActivity, "currentState");
            onGetStartedClick.write(obj3, "action");
            if (!(obj3 instanceof FragmentBuilder_BindPreregistrationInfoFragment)) {
                obj3 = null;
            }
            FragmentBuilder_BindPreregistrationInfoFragment fragmentBuilder_BindPreregistrationInfoFragment = (FragmentBuilder_BindPreregistrationInfoFragment) obj3;
            if (fragmentBuilder_BindPreregistrationInfoFragment == null) {
                OnBoardingTutorialActivity onBoardingTutorialActivity2 = onBoardingTutorialActivity;
                return onBoardingTutorialActivity;
            } else if (fragmentBuilder_BindPreregistrationInfoFragment instanceof FragmentBuilder_BindPreregistrationInfoFragment.IconCompatParcelizer) {
                return OnBoardingTutorialActivity.read(onBoardingTutorialActivity, (FragmentBuilder_BindOnboardingSuccessFragment) null, false, (EasycashCardInfoCaseModule) null, (ReviewInfoCase$JobIncomeDangerousException) null, (FragmentBuilder_BindPurchaseCcSofInputFragment) null, (FragmentBuilder_BindSetDetailFragment) null, ((FragmentBuilder_BindPreregistrationInfoFragment.IconCompatParcelizer) fragmentBuilder_BindPreregistrationInfoFragment).MediaBrowserCompat$CustomActionResultReceiver, (FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment) null, (FragmentBuilder_BindMileageRedemptionSlipFragment) null, (FragmentBuilder_BindTodayTransactionsTabFragment) null, (FragmentBuilder_RegistrationAccountsFragment) null, (FragmentBuilder_BindMwShopAddressStandAloneFragment) null, (FragmentBuilder_BindPrepaidSuccessfulActivationFragment) null, (FragmentBuilder_BindTransferTargetTabFragment) null, (FragmentBuilder_BindPromptPayTargetSelectFragment) null, (FragmentBuilder_BindTabDebitCardServiceFragment) null, (FragmentBuilder_BindWifiSettingsFragment) null, (FragmentBuilder_BindPointTabFragment) null, (EasycashSummaryCaseModule) null, (FragmentBuilder_BindStopChequeHistoryFragment) null, (FragmentBuilder_BindRemittanceRecipientDetailFragment) null, (FragmentBuilder_BindSmeLoanFragment) null, (FragmentBuilder_BindRegalQuestionnaireFragment) null, 8388543);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
