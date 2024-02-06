package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.natural;

/* renamed from: o.createEntry$MediaBrowserCompat$ItemReceiver */
public final /* synthetic */ class createEntry$MediaBrowserCompat$ItemReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<setUserProperty, dispatchBreadcrumbEvent> {
    public createEntry$MediaBrowserCompat$ItemReceiver(natural natural) {
        super(1, natural);
    }

    public final String getName() {
        return "transformMHMCSummaryDisplay";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(natural.class);
    }

    public final String getSignature() {
        return "transformMHMCSummaryDisplay(Lcom/scb/phone/domain/entity/easycash/summary/EasycashSummary;)Lcom/scb/phone/presentation/model/display/easycash/EasycashSummaryDisplay;";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        setUserProperty setuserproperty = (setUserProperty) obj;
        onGetStartedClick.write((Object) setuserproperty, "p1");
        natural natural = (natural) this.receiver;
        onGetStartedClick.write((Object) setuserproperty, "easycashSummary");
        List<setDataCollectionEnabled> list = setuserproperty.IconCompatParcelizer;
        List arrayList = new ArrayList();
        arrayList.add(natural.read(Iterables$3$MediaBrowserCompat$MediaItem.easycash_mhmc_feature_information_collateral_header, list, "COLLATERAL", new natural$MediaBrowserCompat$SearchResultReceiver(natural)));
        arrayList.add(natural.read(Iterables$3$MediaBrowserCompat$MediaItem.easycash_mhmc_feature_information_loan_information, list, "LOAN_INFO", natural.RatingCompat.read));
        arrayList.add(natural.read(Iterables$3$MediaBrowserCompat$MediaItem.easycash_summary_cost_overview_header, list, "COST", new natural.MediaMetadataCompat(natural)));
        return new dispatchBreadcrumbEvent(arrayList, (List<? extends dropBreadcrumb>) null, setuserproperty.write.read, setuserproperty.write.write);
    }
}
