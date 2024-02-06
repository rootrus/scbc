package p040o;

import kotlin.NoWhenBranchMatchedException;
import p040o.FragmentBuilder_GiftMoneySelectThemeFragment;

/* renamed from: o.FragmentBuilder_FundAddressDetailFragment */
public final class FragmentBuilder_FundAddressDetailFragment {

    /* renamed from: o.FragmentBuilder_FundAddressDetailFragment$read */
    public static final class read<S> implements FragmentBuilder_BindJuristicResetPinLandingFragment<OnBoardingTutorialActivity> {
        public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

        read() {
        }

        public final /* synthetic */ Object read(Object obj, Object obj2) {
            OnBoardingTutorialActivity onBoardingTutorialActivity;
            OnBoardingTutorialActivity onBoardingTutorialActivity2;
            Object obj3 = obj2;
            OnBoardingTutorialActivity onBoardingTutorialActivity3 = (OnBoardingTutorialActivity) obj;
            onGetStartedClick.write((Object) onBoardingTutorialActivity3, "currentState");
            onGetStartedClick.write(obj3, "action");
            if (!(obj3 instanceof FragmentBuilder_GiftMoneySelectThemeFragment)) {
                obj3 = null;
            }
            FragmentBuilder_GiftMoneySelectThemeFragment fragmentBuilder_GiftMoneySelectThemeFragment = (FragmentBuilder_GiftMoneySelectThemeFragment) obj3;
            if (fragmentBuilder_GiftMoneySelectThemeFragment != null) {
                if (fragmentBuilder_GiftMoneySelectThemeFragment instanceof FragmentBuilder_GiftMoneySelectThemeFragment.IconCompatParcelizer) {
                    onBoardingTutorialActivity = onBoardingTutorialActivity3;
                    onBoardingTutorialActivity2 = OnBoardingTutorialActivity.read(onBoardingTutorialActivity, (FragmentBuilder_BindOnboardingSuccessFragment) null, true, (EasycashCardInfoCaseModule) null, (ReviewInfoCase$JobIncomeDangerousException) null, (FragmentBuilder_BindPurchaseCcSofInputFragment) null, (FragmentBuilder_BindSetDetailFragment) null, (FragmentBuilder_BindHmlOutcomeCounterOfferFragment) null, (FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment) null, (FragmentBuilder_BindMileageRedemptionSlipFragment) null, (FragmentBuilder_BindTodayTransactionsTabFragment) null, (FragmentBuilder_RegistrationAccountsFragment) null, (FragmentBuilder_BindMwShopAddressStandAloneFragment) null, (FragmentBuilder_BindPrepaidSuccessfulActivationFragment) null, (FragmentBuilder_BindTransferTargetTabFragment) null, (FragmentBuilder_BindPromptPayTargetSelectFragment) null, (FragmentBuilder_BindTabDebitCardServiceFragment) null, (FragmentBuilder_BindWifiSettingsFragment) null, (FragmentBuilder_BindPointTabFragment) null, (EasycashSummaryCaseModule) null, (FragmentBuilder_BindStopChequeHistoryFragment) null, (FragmentBuilder_BindRemittanceRecipientDetailFragment) null, (FragmentBuilder_BindSmeLoanFragment) null, (FragmentBuilder_BindRegalQuestionnaireFragment) null, 8388605);
                } else {
                    onBoardingTutorialActivity = onBoardingTutorialActivity3;
                    if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) fragmentBuilder_GiftMoneySelectThemeFragment, (Object) C6871xd3ea8fae.read)) {
                        onBoardingTutorialActivity2 = onBoardingTutorialActivity;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (onBoardingTutorialActivity2 != null) {
                    return onBoardingTutorialActivity2;
                }
            } else {
                onBoardingTutorialActivity = onBoardingTutorialActivity3;
            }
            return onBoardingTutorialActivity;
        }
    }
}
