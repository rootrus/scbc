package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.natural;

/* renamed from: o.createEntry$MediaBrowserCompat$CustomActionResultReceiver */
public final /* synthetic */ class createEntry$MediaBrowserCompat$CustomActionResultReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<setUserProperty, dispatchBreadcrumbEvent> {
    public createEntry$MediaBrowserCompat$CustomActionResultReceiver(natural natural) {
        super(1, natural);
    }

    public final String getName() {
        return "transformMCMCSummaryDisplay";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(natural.class);
    }

    public final String getSignature() {
        return "transformMCMCSummaryDisplay(Lcom/scb/phone/domain/entity/easycash/summary/EasycashSummary;)Lcom/scb/phone/presentation/model/display/easycash/EasycashSummaryDisplay;";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        setUserProperty setuserproperty = (setUserProperty) obj;
        onGetStartedClick.write((Object) setuserproperty, "p1");
        natural natural = (natural) this.receiver;
        onGetStartedClick.write((Object) setuserproperty, "easycashSummary");
        List<setDataCollectionEnabled> list = setuserproperty.IconCompatParcelizer;
        List arrayList = new ArrayList();
        arrayList.add(natural.read(Iterables$3$MediaBrowserCompat$MediaItem.review_loan_information_header, list, "LOAN_INFORMATION", new natural.IconCompatParcelizer(natural)));
        arrayList.add(natural.read(Iterables$3$MediaBrowserCompat$MediaItem.easycash_summary_cost_overview_header, list, "COST", new natural.read(natural)));
        arrayList.add(natural.read(Iterables$3$MediaBrowserCompat$MediaItem.auto_mcmc_car_information_section_title, list, "COLLATERAL", new natural$MediaBrowserCompat$ItemReceiver(natural)));
        arrayList.add(natural.read(Iterables$3$MediaBrowserCompat$MediaItem.auto_mcmc_review_car_registration_details_section_title, list, "CAR_REGISTRATION", new natural$MediaBrowserCompat$MediaItem(natural)));
        return new dispatchBreadcrumbEvent(arrayList, (List<? extends dropBreadcrumb>) null, setuserproperty.write.read, setuserproperty.write.write);
    }
}
