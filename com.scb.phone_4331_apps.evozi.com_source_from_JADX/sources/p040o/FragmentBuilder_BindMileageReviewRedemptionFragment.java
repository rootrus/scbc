package p040o;

import android.content.Context;
import com.kony.sdk.client.KonyLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import p040o.EasycashCommercialInfoCaseModule;
import p040o.FragmentBuilder_BindMobileListFragment;

/* renamed from: o.FragmentBuilder_BindMileageReviewRedemptionFragment */
public final class FragmentBuilder_BindMileageReviewRedemptionFragment implements IdExtractActivity, Serializable {

    /* renamed from: o.FragmentBuilder_BindMileageReviewRedemptionFragment$read */
    public static final class read<S> implements FragmentBuilder_BindJuristicResetPinLandingFragment<OnBoardingTutorialActivity> {
        public static final read read = new read();

        read() {
        }

        public final /* synthetic */ Object read(Object obj, Object obj2) {
            FragmentBuilder_BindModifyQuickTopUpFragment fragmentBuilder_BindModifyQuickTopUpFragment;
            FragmentBuilder_BindMileageRedemptionSlipFragment fragmentBuilder_BindMileageRedemptionSlipFragment;
            OnBoardingTutorialActivity read2;
            FragmentBuilder_BindModifyQuickTopUpFragment fragmentBuilder_BindModifyQuickTopUpFragment2;
            FragmentBuilder_BindModifyQuickTopUpFragment fragmentBuilder_BindModifyQuickTopUpFragment3;
            FragmentBuilder_BindMileageRedemptionSlipFragment fragmentBuilder_BindMileageRedemptionSlipFragment2;
            FragmentBuilder_BindModifyQuickTopUpFragment fragmentBuilder_BindModifyQuickTopUpFragment4;
            FragmentBuilder_BindModifyQuickTopUpFragment fragmentBuilder_BindModifyQuickTopUpFragment5;
            FragmentBuilder_BindMileageRedemptionSlipFragment fragmentBuilder_BindMileageRedemptionSlipFragment3;
            FragmentBuilder_BindModifyQuickTopUpFragment fragmentBuilder_BindModifyQuickTopUpFragment6;
            FragmentBuilder_BindModifyQuickTopUpFragment fragmentBuilder_BindModifyQuickTopUpFragment7;
            FragmentBuilder_BindMileageRedemptionSlipFragment fragmentBuilder_BindMileageRedemptionSlipFragment4;
            FragmentBuilder_BindModifyQuickTopUpFragment fragmentBuilder_BindModifyQuickTopUpFragment8;
            Object obj3 = obj2;
            OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
            onGetStartedClick.write((Object) onBoardingTutorialActivity, "currentState");
            onGetStartedClick.write(obj3, "action");
            Integer num = null;
            FragmentBuilder_BindMobileListFragment fragmentBuilder_BindMobileListFragment = (FragmentBuilder_BindMobileListFragment) (!(obj3 instanceof FragmentBuilder_BindMobileListFragment) ? null : obj3);
            if (fragmentBuilder_BindMobileListFragment != null) {
                if (fragmentBuilder_BindMobileListFragment instanceof FragmentBuilder_BindMobileListFragment.RatingCompat) {
                    FragmentBuilder_BindMobileListFragment.RatingCompat ratingCompat = (FragmentBuilder_BindMobileListFragment.RatingCompat) fragmentBuilder_BindMobileListFragment;
                    FragmentBuilder_BindMileageRedemptionSlipFragment fragmentBuilder_BindMileageRedemptionSlipFragment5 = onBoardingTutorialActivity.MediaBrowserCompat$CustomActionResultReceiver;
                    read2 = OnBoardingTutorialActivity.read(onBoardingTutorialActivity, (FragmentBuilder_BindOnboardingSuccessFragment) null, false, (EasycashCardInfoCaseModule) null, (ReviewInfoCase$JobIncomeDangerousException) null, (FragmentBuilder_BindPurchaseCcSofInputFragment) null, (FragmentBuilder_BindSetDetailFragment) null, (FragmentBuilder_BindHmlOutcomeCounterOfferFragment) null, (FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment) null, fragmentBuilder_BindMileageRedemptionSlipFragment5 != null ? FragmentBuilder_BindMileageRedemptionSlipFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindMileageRedemptionSlipFragment5, ratingCompat.MediaBrowserCompat$CustomActionResultReceiver, (FragmentBuilder_BindMileageAirlineFieldDetailsFragment) null, (WeakReference) null, (FragmentBuilder_BindModifyQuickTopUpFragment) null, 14) : null, (FragmentBuilder_BindTodayTransactionsTabFragment) null, (FragmentBuilder_RegistrationAccountsFragment) null, (FragmentBuilder_BindMwShopAddressStandAloneFragment) null, (FragmentBuilder_BindPrepaidSuccessfulActivationFragment) null, (FragmentBuilder_BindTransferTargetTabFragment) null, (FragmentBuilder_BindPromptPayTargetSelectFragment) null, (FragmentBuilder_BindTabDebitCardServiceFragment) null, (FragmentBuilder_BindWifiSettingsFragment) null, (FragmentBuilder_BindPointTabFragment) null, (EasycashSummaryCaseModule) null, (FragmentBuilder_BindStopChequeHistoryFragment) null, (FragmentBuilder_BindRemittanceRecipientDetailFragment) null, (FragmentBuilder_BindSmeLoanFragment) null, (FragmentBuilder_BindRegalQuestionnaireFragment) null, 8388351);
                } else if (fragmentBuilder_BindMobileListFragment instanceof FragmentBuilder_BindMobileListFragment.IconCompatParcelizer) {
                    FragmentBuilder_BindMileageRedemptionSlipFragment fragmentBuilder_BindMileageRedemptionSlipFragment6 = onBoardingTutorialActivity.MediaBrowserCompat$CustomActionResultReceiver;
                    if (fragmentBuilder_BindMileageRedemptionSlipFragment6 == null || (fragmentBuilder_BindModifyQuickTopUpFragment8 = fragmentBuilder_BindMileageRedemptionSlipFragment6.MediaBrowserCompat$ItemReceiver) == null) {
                        FragmentBuilder_BindMileageAirlineFieldDetailsFragment fragmentBuilder_BindMileageAirlineFieldDetailsFragment = ((FragmentBuilder_BindMobileListFragment.IconCompatParcelizer) fragmentBuilder_BindMobileListFragment).read;
                        if (fragmentBuilder_BindMileageAirlineFieldDetailsFragment != null) {
                            num = Integer.valueOf(fragmentBuilder_BindMileageAirlineFieldDetailsFragment.IconCompatParcelizer);
                        }
                        fragmentBuilder_BindModifyQuickTopUpFragment7 = new FragmentBuilder_BindModifyQuickTopUpFragment((Integer) null, (Integer) null, (Integer) null, num, 7);
                    } else {
                        FragmentBuilder_BindMileageAirlineFieldDetailsFragment fragmentBuilder_BindMileageAirlineFieldDetailsFragment2 = ((FragmentBuilder_BindMobileListFragment.IconCompatParcelizer) fragmentBuilder_BindMobileListFragment).read;
                        if (fragmentBuilder_BindMileageAirlineFieldDetailsFragment2 != null) {
                            num = Integer.valueOf(fragmentBuilder_BindMileageAirlineFieldDetailsFragment2.IconCompatParcelizer);
                        }
                        fragmentBuilder_BindModifyQuickTopUpFragment7 = FragmentBuilder_BindModifyQuickTopUpFragment.read(fragmentBuilder_BindModifyQuickTopUpFragment8, (Integer) null, (Integer) null, (Integer) null, num, 7);
                    }
                    FragmentBuilder_BindModifyQuickTopUpFragment fragmentBuilder_BindModifyQuickTopUpFragment9 = fragmentBuilder_BindModifyQuickTopUpFragment7;
                    FragmentBuilder_BindMileageRedemptionSlipFragment fragmentBuilder_BindMileageRedemptionSlipFragment7 = onBoardingTutorialActivity.MediaBrowserCompat$CustomActionResultReceiver;
                    if (fragmentBuilder_BindMileageRedemptionSlipFragment7 != null) {
                        FragmentBuilder_BindMobileListFragment.IconCompatParcelizer iconCompatParcelizer = (FragmentBuilder_BindMobileListFragment.IconCompatParcelizer) fragmentBuilder_BindMobileListFragment;
                        fragmentBuilder_BindMileageRedemptionSlipFragment4 = FragmentBuilder_BindMileageRedemptionSlipFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindMileageRedemptionSlipFragment7, (FragmentBuilder_BindMileageAirlineFieldDetailsFragment) null, iconCompatParcelizer.read, new WeakReference(iconCompatParcelizer.write), fragmentBuilder_BindModifyQuickTopUpFragment9, 1);
                    } else {
                        FragmentBuilder_BindMobileListFragment.IconCompatParcelizer iconCompatParcelizer2 = (FragmentBuilder_BindMobileListFragment.IconCompatParcelizer) fragmentBuilder_BindMobileListFragment;
                        fragmentBuilder_BindMileageRedemptionSlipFragment4 = new FragmentBuilder_BindMileageRedemptionSlipFragment(iconCompatParcelizer2.read, new WeakReference(iconCompatParcelizer2.write), fragmentBuilder_BindModifyQuickTopUpFragment9, 1);
                    }
                    read2 = OnBoardingTutorialActivity.read(onBoardingTutorialActivity, (FragmentBuilder_BindOnboardingSuccessFragment) null, false, (EasycashCardInfoCaseModule) null, (ReviewInfoCase$JobIncomeDangerousException) null, (FragmentBuilder_BindPurchaseCcSofInputFragment) null, (FragmentBuilder_BindSetDetailFragment) null, (FragmentBuilder_BindHmlOutcomeCounterOfferFragment) null, (FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment) null, fragmentBuilder_BindMileageRedemptionSlipFragment4, (FragmentBuilder_BindTodayTransactionsTabFragment) null, (FragmentBuilder_RegistrationAccountsFragment) null, (FragmentBuilder_BindMwShopAddressStandAloneFragment) null, (FragmentBuilder_BindPrepaidSuccessfulActivationFragment) null, (FragmentBuilder_BindTransferTargetTabFragment) null, (FragmentBuilder_BindPromptPayTargetSelectFragment) null, (FragmentBuilder_BindTabDebitCardServiceFragment) null, (FragmentBuilder_BindWifiSettingsFragment) null, (FragmentBuilder_BindPointTabFragment) null, (EasycashSummaryCaseModule) null, (FragmentBuilder_BindStopChequeHistoryFragment) null, (FragmentBuilder_BindRemittanceRecipientDetailFragment) null, (FragmentBuilder_BindSmeLoanFragment) null, (FragmentBuilder_BindRegalQuestionnaireFragment) null, 8388351);
                } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) fragmentBuilder_BindMobileListFragment, (Object) C6563x29e247dd.MediaBrowserCompat$CustomActionResultReceiver)) {
                    FragmentBuilder_BindMileageRedemptionSlipFragment fragmentBuilder_BindMileageRedemptionSlipFragment8 = onBoardingTutorialActivity.MediaBrowserCompat$CustomActionResultReceiver;
                    read2 = OnBoardingTutorialActivity.read(onBoardingTutorialActivity, (FragmentBuilder_BindOnboardingSuccessFragment) null, false, (EasycashCardInfoCaseModule) null, (ReviewInfoCase$JobIncomeDangerousException) null, (FragmentBuilder_BindPurchaseCcSofInputFragment) null, (FragmentBuilder_BindSetDetailFragment) null, (FragmentBuilder_BindHmlOutcomeCounterOfferFragment) null, (FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment) null, fragmentBuilder_BindMileageRedemptionSlipFragment8 != null ? FragmentBuilder_BindMileageRedemptionSlipFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindMileageRedemptionSlipFragment8, (FragmentBuilder_BindMileageAirlineFieldDetailsFragment) null, (FragmentBuilder_BindMileageAirlineFieldDetailsFragment) null, (WeakReference) null, (FragmentBuilder_BindModifyQuickTopUpFragment) null, 11) : null, (FragmentBuilder_BindTodayTransactionsTabFragment) null, (FragmentBuilder_RegistrationAccountsFragment) null, (FragmentBuilder_BindMwShopAddressStandAloneFragment) null, (FragmentBuilder_BindPrepaidSuccessfulActivationFragment) null, (FragmentBuilder_BindTransferTargetTabFragment) null, (FragmentBuilder_BindPromptPayTargetSelectFragment) null, (FragmentBuilder_BindTabDebitCardServiceFragment) null, (FragmentBuilder_BindWifiSettingsFragment) null, (FragmentBuilder_BindPointTabFragment) null, (EasycashSummaryCaseModule) null, (FragmentBuilder_BindStopChequeHistoryFragment) null, (FragmentBuilder_BindRemittanceRecipientDetailFragment) null, (FragmentBuilder_BindSmeLoanFragment) null, (FragmentBuilder_BindRegalQuestionnaireFragment) null, 8388351);
                } else if (fragmentBuilder_BindMobileListFragment instanceof FragmentBuilder_BindMobileListFragment.write) {
                    FragmentBuilder_BindMileageRedemptionSlipFragment fragmentBuilder_BindMileageRedemptionSlipFragment9 = onBoardingTutorialActivity.MediaBrowserCompat$CustomActionResultReceiver;
                    if (fragmentBuilder_BindMileageRedemptionSlipFragment9 == null || (fragmentBuilder_BindModifyQuickTopUpFragment6 = fragmentBuilder_BindMileageRedemptionSlipFragment9.MediaBrowserCompat$ItemReceiver) == null) {
                        fragmentBuilder_BindModifyQuickTopUpFragment5 = new FragmentBuilder_BindModifyQuickTopUpFragment(Integer.valueOf(((FragmentBuilder_BindMobileListFragment.write) fragmentBuilder_BindMobileListFragment).write), (Integer) null, (Integer) null, (Integer) null, 14);
                    } else {
                        fragmentBuilder_BindModifyQuickTopUpFragment5 = FragmentBuilder_BindModifyQuickTopUpFragment.read(fragmentBuilder_BindModifyQuickTopUpFragment6, Integer.valueOf(((FragmentBuilder_BindMobileListFragment.write) fragmentBuilder_BindMobileListFragment).write), (Integer) null, (Integer) null, (Integer) null, 14);
                    }
                    FragmentBuilder_BindMileageRedemptionSlipFragment fragmentBuilder_BindMileageRedemptionSlipFragment10 = onBoardingTutorialActivity.MediaBrowserCompat$CustomActionResultReceiver;
                    if (fragmentBuilder_BindMileageRedemptionSlipFragment10 != null) {
                        fragmentBuilder_BindMileageRedemptionSlipFragment3 = FragmentBuilder_BindMileageRedemptionSlipFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindMileageRedemptionSlipFragment10, (FragmentBuilder_BindMileageAirlineFieldDetailsFragment) null, (FragmentBuilder_BindMileageAirlineFieldDetailsFragment) null, (WeakReference) null, fragmentBuilder_BindModifyQuickTopUpFragment5, 7);
                    } else {
                        fragmentBuilder_BindMileageRedemptionSlipFragment3 = new FragmentBuilder_BindMileageRedemptionSlipFragment((FragmentBuilder_BindMileageAirlineFieldDetailsFragment) null, (WeakReference) null, fragmentBuilder_BindModifyQuickTopUpFragment5, 7);
                    }
                    read2 = OnBoardingTutorialActivity.read(onBoardingTutorialActivity, (FragmentBuilder_BindOnboardingSuccessFragment) null, false, (EasycashCardInfoCaseModule) null, (ReviewInfoCase$JobIncomeDangerousException) null, (FragmentBuilder_BindPurchaseCcSofInputFragment) null, (FragmentBuilder_BindSetDetailFragment) null, (FragmentBuilder_BindHmlOutcomeCounterOfferFragment) null, (FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment) null, fragmentBuilder_BindMileageRedemptionSlipFragment3, (FragmentBuilder_BindTodayTransactionsTabFragment) null, (FragmentBuilder_RegistrationAccountsFragment) null, (FragmentBuilder_BindMwShopAddressStandAloneFragment) null, (FragmentBuilder_BindPrepaidSuccessfulActivationFragment) null, (FragmentBuilder_BindTransferTargetTabFragment) null, (FragmentBuilder_BindPromptPayTargetSelectFragment) null, (FragmentBuilder_BindTabDebitCardServiceFragment) null, (FragmentBuilder_BindWifiSettingsFragment) null, (FragmentBuilder_BindPointTabFragment) null, (EasycashSummaryCaseModule) null, (FragmentBuilder_BindStopChequeHistoryFragment) null, (FragmentBuilder_BindRemittanceRecipientDetailFragment) null, (FragmentBuilder_BindSmeLoanFragment) null, (FragmentBuilder_BindRegalQuestionnaireFragment) null, 8388351);
                } else if (fragmentBuilder_BindMobileListFragment instanceof C6562xf685988e) {
                    FragmentBuilder_BindMileageRedemptionSlipFragment fragmentBuilder_BindMileageRedemptionSlipFragment11 = onBoardingTutorialActivity.MediaBrowserCompat$CustomActionResultReceiver;
                    if (fragmentBuilder_BindMileageRedemptionSlipFragment11 == null || (fragmentBuilder_BindModifyQuickTopUpFragment4 = fragmentBuilder_BindMileageRedemptionSlipFragment11.MediaBrowserCompat$ItemReceiver) == null) {
                        fragmentBuilder_BindModifyQuickTopUpFragment3 = new FragmentBuilder_BindModifyQuickTopUpFragment((Integer) null, (Integer) null, Integer.valueOf(((C6562xf685988e) fragmentBuilder_BindMobileListFragment).MediaBrowserCompat$CustomActionResultReceiver), (Integer) null, 11);
                    } else {
                        fragmentBuilder_BindModifyQuickTopUpFragment3 = FragmentBuilder_BindModifyQuickTopUpFragment.read(fragmentBuilder_BindModifyQuickTopUpFragment4, (Integer) null, (Integer) null, Integer.valueOf(((C6562xf685988e) fragmentBuilder_BindMobileListFragment).MediaBrowserCompat$CustomActionResultReceiver), (Integer) null, 11);
                    }
                    FragmentBuilder_BindMileageRedemptionSlipFragment fragmentBuilder_BindMileageRedemptionSlipFragment12 = onBoardingTutorialActivity.MediaBrowserCompat$CustomActionResultReceiver;
                    if (fragmentBuilder_BindMileageRedemptionSlipFragment12 != null) {
                        fragmentBuilder_BindMileageRedemptionSlipFragment2 = FragmentBuilder_BindMileageRedemptionSlipFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindMileageRedemptionSlipFragment12, (FragmentBuilder_BindMileageAirlineFieldDetailsFragment) null, (FragmentBuilder_BindMileageAirlineFieldDetailsFragment) null, (WeakReference) null, fragmentBuilder_BindModifyQuickTopUpFragment3, 7);
                    } else {
                        fragmentBuilder_BindMileageRedemptionSlipFragment2 = new FragmentBuilder_BindMileageRedemptionSlipFragment((FragmentBuilder_BindMileageAirlineFieldDetailsFragment) null, (WeakReference) null, fragmentBuilder_BindModifyQuickTopUpFragment3, 7);
                    }
                    read2 = OnBoardingTutorialActivity.read(onBoardingTutorialActivity, (FragmentBuilder_BindOnboardingSuccessFragment) null, false, (EasycashCardInfoCaseModule) null, (ReviewInfoCase$JobIncomeDangerousException) null, (FragmentBuilder_BindPurchaseCcSofInputFragment) null, (FragmentBuilder_BindSetDetailFragment) null, (FragmentBuilder_BindHmlOutcomeCounterOfferFragment) null, (FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment) null, fragmentBuilder_BindMileageRedemptionSlipFragment2, (FragmentBuilder_BindTodayTransactionsTabFragment) null, (FragmentBuilder_RegistrationAccountsFragment) null, (FragmentBuilder_BindMwShopAddressStandAloneFragment) null, (FragmentBuilder_BindPrepaidSuccessfulActivationFragment) null, (FragmentBuilder_BindTransferTargetTabFragment) null, (FragmentBuilder_BindPromptPayTargetSelectFragment) null, (FragmentBuilder_BindTabDebitCardServiceFragment) null, (FragmentBuilder_BindWifiSettingsFragment) null, (FragmentBuilder_BindPointTabFragment) null, (EasycashSummaryCaseModule) null, (FragmentBuilder_BindStopChequeHistoryFragment) null, (FragmentBuilder_BindRemittanceRecipientDetailFragment) null, (FragmentBuilder_BindSmeLoanFragment) null, (FragmentBuilder_BindRegalQuestionnaireFragment) null, 8388351);
                } else if (fragmentBuilder_BindMobileListFragment instanceof FragmentBuilder_BindMobileListFragment.read) {
                    FragmentBuilder_BindMileageRedemptionSlipFragment fragmentBuilder_BindMileageRedemptionSlipFragment13 = onBoardingTutorialActivity.MediaBrowserCompat$CustomActionResultReceiver;
                    if (fragmentBuilder_BindMileageRedemptionSlipFragment13 == null || (fragmentBuilder_BindModifyQuickTopUpFragment2 = fragmentBuilder_BindMileageRedemptionSlipFragment13.MediaBrowserCompat$ItemReceiver) == null) {
                        fragmentBuilder_BindModifyQuickTopUpFragment = new FragmentBuilder_BindModifyQuickTopUpFragment((Integer) null, Integer.valueOf(((FragmentBuilder_BindMobileListFragment.read) fragmentBuilder_BindMobileListFragment).MediaBrowserCompat$CustomActionResultReceiver), (Integer) null, (Integer) null, 13);
                    } else {
                        fragmentBuilder_BindModifyQuickTopUpFragment = FragmentBuilder_BindModifyQuickTopUpFragment.read(fragmentBuilder_BindModifyQuickTopUpFragment2, (Integer) null, Integer.valueOf(((FragmentBuilder_BindMobileListFragment.read) fragmentBuilder_BindMobileListFragment).MediaBrowserCompat$CustomActionResultReceiver), (Integer) null, (Integer) null, 13);
                    }
                    FragmentBuilder_BindMileageRedemptionSlipFragment fragmentBuilder_BindMileageRedemptionSlipFragment14 = onBoardingTutorialActivity.MediaBrowserCompat$CustomActionResultReceiver;
                    if (fragmentBuilder_BindMileageRedemptionSlipFragment14 != null) {
                        fragmentBuilder_BindMileageRedemptionSlipFragment = FragmentBuilder_BindMileageRedemptionSlipFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindMileageRedemptionSlipFragment14, (FragmentBuilder_BindMileageAirlineFieldDetailsFragment) null, (FragmentBuilder_BindMileageAirlineFieldDetailsFragment) null, (WeakReference) null, fragmentBuilder_BindModifyQuickTopUpFragment, 7);
                    } else {
                        fragmentBuilder_BindMileageRedemptionSlipFragment = new FragmentBuilder_BindMileageRedemptionSlipFragment((FragmentBuilder_BindMileageAirlineFieldDetailsFragment) null, (WeakReference) null, fragmentBuilder_BindModifyQuickTopUpFragment, 7);
                    }
                    read2 = OnBoardingTutorialActivity.read(onBoardingTutorialActivity, (FragmentBuilder_BindOnboardingSuccessFragment) null, false, (EasycashCardInfoCaseModule) null, (ReviewInfoCase$JobIncomeDangerousException) null, (FragmentBuilder_BindPurchaseCcSofInputFragment) null, (FragmentBuilder_BindSetDetailFragment) null, (FragmentBuilder_BindHmlOutcomeCounterOfferFragment) null, (FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment) null, fragmentBuilder_BindMileageRedemptionSlipFragment, (FragmentBuilder_BindTodayTransactionsTabFragment) null, (FragmentBuilder_RegistrationAccountsFragment) null, (FragmentBuilder_BindMwShopAddressStandAloneFragment) null, (FragmentBuilder_BindPrepaidSuccessfulActivationFragment) null, (FragmentBuilder_BindTransferTargetTabFragment) null, (FragmentBuilder_BindPromptPayTargetSelectFragment) null, (FragmentBuilder_BindTabDebitCardServiceFragment) null, (FragmentBuilder_BindWifiSettingsFragment) null, (FragmentBuilder_BindPointTabFragment) null, (EasycashSummaryCaseModule) null, (FragmentBuilder_BindStopChequeHistoryFragment) null, (FragmentBuilder_BindRemittanceRecipientDetailFragment) null, (FragmentBuilder_BindSmeLoanFragment) null, (FragmentBuilder_BindRegalQuestionnaireFragment) null, 8388351);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return read2;
            } else if (!(obj3 instanceof EasycashCommercialInfoCaseModule.read)) {
                return onBoardingTutorialActivity;
            } else {
                FragmentBuilder_BindMileageRedemptionSlipFragment fragmentBuilder_BindMileageRedemptionSlipFragment15 = onBoardingTutorialActivity.MediaBrowserCompat$CustomActionResultReceiver;
                return OnBoardingTutorialActivity.read(onBoardingTutorialActivity, (FragmentBuilder_BindOnboardingSuccessFragment) null, false, (EasycashCardInfoCaseModule) null, (ReviewInfoCase$JobIncomeDangerousException) null, (FragmentBuilder_BindPurchaseCcSofInputFragment) null, (FragmentBuilder_BindSetDetailFragment) null, (FragmentBuilder_BindHmlOutcomeCounterOfferFragment) null, (FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment) null, fragmentBuilder_BindMileageRedemptionSlipFragment15 != null ? FragmentBuilder_BindMileageRedemptionSlipFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindMileageRedemptionSlipFragment15, (FragmentBuilder_BindMileageAirlineFieldDetailsFragment) null, (FragmentBuilder_BindMileageAirlineFieldDetailsFragment) null, (WeakReference) null, new FragmentBuilder_BindModifyQuickTopUpFragment((Integer) null, (Integer) null, (Integer) null, (Integer) null, 15), 3) : null, (FragmentBuilder_BindTodayTransactionsTabFragment) null, (FragmentBuilder_RegistrationAccountsFragment) null, (FragmentBuilder_BindMwShopAddressStandAloneFragment) null, (FragmentBuilder_BindPrepaidSuccessfulActivationFragment) null, (FragmentBuilder_BindTransferTargetTabFragment) null, (FragmentBuilder_BindPromptPayTargetSelectFragment) null, (FragmentBuilder_BindTabDebitCardServiceFragment) null, (FragmentBuilder_BindWifiSettingsFragment) null, (FragmentBuilder_BindPointTabFragment) null, (EasycashSummaryCaseModule) null, (FragmentBuilder_BindStopChequeHistoryFragment) null, (FragmentBuilder_BindRemittanceRecipientDetailFragment) null, (FragmentBuilder_BindSmeLoanFragment) null, (FragmentBuilder_BindRegalQuestionnaireFragment) null, 8388351);
            }
        }
    }

    public final Object read(Object obj) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(CSYR2K.MediaBrowserCompat$CustomActionResultReceiver.getFilesDir().getAbsolutePath());
            sb.append(File.separator);
            sb.append(obj);
            sb.append(".mfds");
            if (!new File(sb.toString()).exists()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("File not found: ");
                sb2.append(obj);
                KonyLogger.MediaBrowserCompat$ItemReceiver("KonyStorageManager", sb2.toString());
                return null;
            }
            Context context = CSYR2K.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(".mfds");
            FileInputStream openFileInput = context.openFileInput(sb3.toString());
            ObjectInputStream objectInputStream = new ObjectInputStream(openFileInput);
            Object readObject = objectInputStream.readObject();
            openFileInput.close();
            objectInputStream.close();
            return readObject;
        } catch (FileNotFoundException e) {
            KonyLogger.IconCompatParcelizer("KonyStorageManager", "read", e);
            return null;
        } catch (IOException e2) {
            KonyLogger.IconCompatParcelizer("KonyStorageManager", "read", e2);
            return null;
        } catch (ClassNotFoundException e3) {
            KonyLogger.IconCompatParcelizer("KonyStorageManager", "read", e3);
            return null;
        }
    }

    public final boolean IconCompatParcelizer(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(CSYR2K.MediaBrowserCompat$CustomActionResultReceiver.getFilesDir());
        sb.append(File.separator);
        sb.append(obj);
        sb.append(".mfds");
        boolean z = false;
        if (!new File(sb.toString()).exists()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("File not found: ");
            sb2.append(obj);
            KonyLogger.MediaBrowserCompat$ItemReceiver("KonyStorageManager", sb2.toString());
            return false;
        }
        try {
            Context context = CSYR2K.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(".mfds");
            z = context.deleteFile(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("File is deleted: ");
            sb4.append(z);
            KonyLogger.MediaBrowserCompat$ItemReceiver("KonyStorageManager", sb4.toString());
            return z;
        } catch (Exception e) {
            KonyLogger.IconCompatParcelizer("KonyStorageManager", e.getMessage());
            return z;
        }
    }

    public final void read(Object obj, Object obj2) {
        try {
            Context context = CSYR2K.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(".mfds");
            FileOutputStream openFileOutput = context.openFileOutput(sb.toString(), 0);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(openFileOutput);
            objectOutputStream.writeObject(obj2);
            objectOutputStream.flush();
            objectOutputStream.close();
            openFileOutput.close();
        } catch (FileNotFoundException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e.getMessage());
            KonyLogger.MediaBrowserCompat$ItemReceiver("KonyStorageManager", sb2.toString());
        } catch (IOException e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e2.getMessage());
            KonyLogger.MediaBrowserCompat$ItemReceiver("KonyStorageManager", sb3.toString());
        }
    }
}
