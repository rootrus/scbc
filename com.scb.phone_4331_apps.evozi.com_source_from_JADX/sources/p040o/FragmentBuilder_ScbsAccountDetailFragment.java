package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import kotlin.NoWhenBranchMatchedException;
import p040o.LottieCompositionFactory;
import p040o.zzby;

/* renamed from: o.FragmentBuilder_ScbsAccountDetailFragment */
public final class FragmentBuilder_ScbsAccountDetailFragment {

    /* renamed from: o.FragmentBuilder_ScbsAccountDetailFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer<S> implements FragmentBuilder_BindJuristicResetPinLandingFragment<OnBoardingTutorialActivity> {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ Object read(Object obj, Object obj2) {
            boolean z;
            boolean z2;
            Object obj3 = obj2;
            OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
            onGetStartedClick.write((Object) onBoardingTutorialActivity, "currentState");
            onGetStartedClick.write(obj3, "action");
            if (!(obj3 instanceof FragmentBuilder_SelectInvestmentFragment)) {
                obj3 = null;
            }
            FragmentBuilder_SelectInvestmentFragment fragmentBuilder_SelectInvestmentFragment = (FragmentBuilder_SelectInvestmentFragment) obj3;
            if (fragmentBuilder_SelectInvestmentFragment == null) {
                OnBoardingTutorialActivity onBoardingTutorialActivity2 = onBoardingTutorialActivity;
                return onBoardingTutorialActivity;
            } else if (fragmentBuilder_SelectInvestmentFragment instanceof C6875x8f56b680) {
                C6875x8f56b680 fragmentBuilder_SelectInvestmentFragment$MediaBrowserCompat$CustomActionResultReceiver = (C6875x8f56b680) fragmentBuilder_SelectInvestmentFragment;
                Boolean bool = fragmentBuilder_SelectInvestmentFragment$MediaBrowserCompat$CustomActionResultReceiver.write;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = onBoardingTutorialActivity.f2553x50fd9e4a.read;
                }
                Boolean bool2 = fragmentBuilder_SelectInvestmentFragment$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
                if (bool2 != null) {
                    z2 = bool2.booleanValue();
                } else {
                    z2 = onBoardingTutorialActivity.f2553x50fd9e4a.write;
                }
                EasycashCardInfoCaseModule easycashCardInfoCaseModule = r2;
                EasycashCardInfoCaseModule easycashCardInfoCaseModule2 = new EasycashCardInfoCaseModule(z, z2);
                return OnBoardingTutorialActivity.read(onBoardingTutorialActivity, (FragmentBuilder_BindOnboardingSuccessFragment) null, false, easycashCardInfoCaseModule, (ReviewInfoCase$JobIncomeDangerousException) null, (FragmentBuilder_BindPurchaseCcSofInputFragment) null, (FragmentBuilder_BindSetDetailFragment) null, (FragmentBuilder_BindHmlOutcomeCounterOfferFragment) null, (FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment) null, (FragmentBuilder_BindMileageRedemptionSlipFragment) null, (FragmentBuilder_BindTodayTransactionsTabFragment) null, (FragmentBuilder_RegistrationAccountsFragment) null, (FragmentBuilder_BindMwShopAddressStandAloneFragment) null, (FragmentBuilder_BindPrepaidSuccessfulActivationFragment) null, (FragmentBuilder_BindTransferTargetTabFragment) null, (FragmentBuilder_BindPromptPayTargetSelectFragment) null, (FragmentBuilder_BindTabDebitCardServiceFragment) null, (FragmentBuilder_BindWifiSettingsFragment) null, (FragmentBuilder_BindPointTabFragment) null, (EasycashSummaryCaseModule) null, (FragmentBuilder_BindStopChequeHistoryFragment) null, (FragmentBuilder_BindRemittanceRecipientDetailFragment) null, (FragmentBuilder_BindSmeLoanFragment) null, (FragmentBuilder_BindRegalQuestionnaireFragment) null, 8388603);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static zzby.zza read(SingleDataEntity<LottieCompositionFactory.C36086> singleDataEntity, zzby.zza.read read, String str) {
        zzby.zza.read read2;
        onGetStartedClick.write((Object) singleDataEntity, "entity");
        onGetStartedClick.write((Object) read, "previousState");
        onGetStartedClick.write((Object) str, "statusCode");
        zzby.zza.write write = new zzby.zza.write();
        LottieCompositionFactory.C36086 data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer((Object) data, "entity.data");
        write.MediaBrowserCompat$CustomActionResultReceiver = data.MediaBrowserCompat$ItemReceiver;
        boolean z = true;
        boolean z2 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "9200") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "9201");
        boolean z3 = read == zzby.zza.read.NO_REUPLOADED;
        if (!(read == zzby.zza.read.FIRST_TIME || read == zzby.zza.read.MULTIPLE_TIMES)) {
            z = false;
        }
        if (z2 && z3) {
            read2 = zzby.zza.read.FIRST_TIME;
        } else if (!z2 || !z) {
            read2 = zzby.zza.read.NO_REUPLOADED;
        } else {
            read2 = zzby.zza.read.MULTIPLE_TIMES;
        }
        write.MediaMetadataCompat = read2;
        setOnPageChangeListener status = singleDataEntity.getStatus();
        onGetStartedClick.IconCompatParcelizer((Object) status, "entity.status");
        write.MediaBrowserCompat$SearchResultReceiver = status.MediaBrowserCompat$ItemReceiver();
        setOnPageChangeListener status2 = singleDataEntity.getStatus();
        onGetStartedClick.IconCompatParcelizer((Object) status2, "entity.status");
        write.read = status2.IconCompatParcelizer();
        write.MediaDescriptionCompat = str;
        zzby.zza zza = new zzby.zza(write, (byte) 0);
        onGetStartedClick.IconCompatParcelizer((Object) zza, "AdditionDocument.Builder…ode)\n            .build()");
        return zza;
    }
}
