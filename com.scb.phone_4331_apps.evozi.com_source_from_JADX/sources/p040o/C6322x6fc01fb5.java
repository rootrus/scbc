package p040o;

import com.scb.phone.view.adapter.transferandpay.AccountSourceAdapter;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;

/* renamed from: o.ActivityBuilder_ContributesHmlBusinessOwnerDocumentSubmissionActivity */
public final /* synthetic */ class C6322x6fc01fb5 implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ AccountSourceSelectFragment read;

    public /* synthetic */ C6322x6fc01fb5(AccountSourceSelectFragment accountSourceSelectFragment) {
        this.read = accountSourceSelectFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        AccountSourceSelectFragment accountSourceSelectFragment = this.read;
        AccountSourceAdapter accountSourceAdapter = accountSourceSelectFragment.MediaBrowserCompat$SearchResultReceiver;
        if (accountSourceAdapter != null) {
            onAcceptButtonClick onacceptbuttonclick = accountSourceSelectFragment.accountSourcePresenter;
            String str = accountSourceAdapter.MediaBrowserCompat$CustomActionResultReceiver(accountSourceSelectFragment.mViewPager.getCurrentItem()).MediaSessionCompat$Token;
            boolean z = false;
            if (onacceptbuttonclick.RatingCompat != null) {
                onacceptbuttonclick.RatingCompat.Keep();
            }
            getBorderThickness getborderthickness = getBorderThickness.MediaBrowserCompat$CustomActionResultReceiver;
            if (onacceptbuttonclick.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getborderthickness.IconCompatParcelizer(onacceptbuttonclick.RatingCompat);
            }
            onacceptbuttonclick.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(onacceptbuttonclick.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.toString());
            onacceptbuttonclick.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(new C5093x84279d7c(onacceptbuttonclick, str, true, onacceptbuttonclick.MediaBrowserCompat$ItemReceiver));
        }
    }
}
