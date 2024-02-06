package p040o;

import p040o.zzcb;

/* renamed from: o.setPassword$MediaBrowserCompat$CustomActionResultReceiver */
final /* synthetic */ class setPassword$MediaBrowserCompat$CustomActionResultReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<getTypeface, zzcb.zzg.zza> {
    setPassword$MediaBrowserCompat$CustomActionResultReceiver(setPassword setpassword) {
        super(1, setpassword);
    }

    public final String getName() {
        return "transformItemDebit";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(setPassword.class);
    }

    public final String getSignature() {
        return "transformItemDebit(Lcom/scb/phone/data/entity/easycash/features/EasycashDebitCardEntity;)Lcom/scb/phone/domain/entity/easycash/features/EasycashDebitCard;";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        getTypeface gettypeface = (getTypeface) obj;
        onGetStartedClick.write((Object) gettypeface, "p1");
        return setPassword.read(gettypeface);
    }
}
