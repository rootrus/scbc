package p040o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: o.FragmentBuilder_BindPrepaidActivateEmptyStateFragment */
public class FragmentBuilder_BindPrepaidActivateEmptyStateFragment implements IInterface {
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final IBinder write;

    /* renamed from: o.FragmentBuilder_BindPrepaidActivateEmptyStateFragment$read */
    public static final class read<S> implements FragmentBuilder_BindJuristicResetPinLandingFragment<OnBoardingTutorialActivity> {
        public static final read write = new read();

        read() {
        }

        public final /* synthetic */ Object read(Object obj, Object obj2) {
            Object obj3 = obj2;
            OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
            onGetStartedClick.write((Object) onBoardingTutorialActivity, "currentState");
            onGetStartedClick.write(obj3, "action");
            if (!(obj3 instanceof FragmentBuilder_BindPredictiveTilesLearnMoreFragment)) {
                obj3 = null;
            }
            FragmentBuilder_BindPredictiveTilesLearnMoreFragment fragmentBuilder_BindPredictiveTilesLearnMoreFragment = (FragmentBuilder_BindPredictiveTilesLearnMoreFragment) obj3;
            if (fragmentBuilder_BindPredictiveTilesLearnMoreFragment == null) {
                OnBoardingTutorialActivity onBoardingTutorialActivity2 = onBoardingTutorialActivity;
                return onBoardingTutorialActivity;
            } else if (fragmentBuilder_BindPredictiveTilesLearnMoreFragment instanceof C6641xecf1ebb0) {
                return OnBoardingTutorialActivity.read(onBoardingTutorialActivity, (FragmentBuilder_BindOnboardingSuccessFragment) null, false, (EasycashCardInfoCaseModule) null, (ReviewInfoCase$JobIncomeDangerousException) null, (FragmentBuilder_BindPurchaseCcSofInputFragment) null, (FragmentBuilder_BindSetDetailFragment) null, (FragmentBuilder_BindHmlOutcomeCounterOfferFragment) null, (FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment) null, (FragmentBuilder_BindMileageRedemptionSlipFragment) null, (FragmentBuilder_BindTodayTransactionsTabFragment) null, (FragmentBuilder_RegistrationAccountsFragment) null, (FragmentBuilder_BindMwShopAddressStandAloneFragment) null, (FragmentBuilder_BindPrepaidSuccessfulActivationFragment) null, (FragmentBuilder_BindTransferTargetTabFragment) null, (FragmentBuilder_BindPromptPayTargetSelectFragment) null, (FragmentBuilder_BindTabDebitCardServiceFragment) null, (FragmentBuilder_BindWifiSettingsFragment) null, (FragmentBuilder_BindPointTabFragment) null, (EasycashSummaryCaseModule) null, (FragmentBuilder_BindStopChequeHistoryFragment) null, (FragmentBuilder_BindRemittanceRecipientDetailFragment) null, (FragmentBuilder_BindSmeLoanFragment) null, (FragmentBuilder_BindRegalQuestionnaireFragment) null, 8388479);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    FragmentBuilder_BindPrepaidActivateEmptyStateFragment() {
    }

    public FragmentBuilder_BindPrepaidActivateEmptyStateFragment(IBinder iBinder, String str) {
        this.write = iBinder;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel MediaBrowserCompat$ItemReceiver() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.MediaBrowserCompat$CustomActionResultReceiver);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(int i, Parcel parcel) throws RemoteException {
        try {
            this.write.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.write;
    }
}
