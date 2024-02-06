package p040o;

import com.scb.phone.view.activity.FullScreenLoadingActivity;
import com.scb.phone.view.adapter.investment.discover.C5764xf73d3f7d;
import com.scb.phone.view.adapter.investment.scbs.open.SuitabilitySummaryAdapter;
import p040o.AbstractMultimap;

/* renamed from: o.isFeaturePhone */
public final /* synthetic */ class isFeaturePhone implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C6514xb47b5894 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ isFeaturePhone(C6514xb47b5894 fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver;
        this.read = str;
    }

    public final Object write(Object obj) {
        C6514xb47b5894 fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = this.read;
        requireActivity$MediaBrowserCompat$CustomActionResultReceiver requireactivity_mediabrowsercompat_customactionresultreceiver = (requireActivity$MediaBrowserCompat$CustomActionResultReceiver) obj;
        if ((fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer == AbstractMultimap.AsMap.AsMapEntries.SUCCESS && fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver == AbstractMultimap.AsMap.AsMapEntries.SUCCESS && fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat == AbstractMultimap.AsMap.AsMapEntries.SUCCESS && fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.read == AbstractMultimap.AsMap.AsMapEntries.SUCCESS) || !fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.write) {
            return DebitCardResetOtpActivity.just(requireactivity_mediabrowsercompat_customactionresultreceiver);
        }
        fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.write = false;
        DebitCardResetOtpActivity<requireActivity$MediaBrowserCompat$CustomActionResultReceiver> empty = DebitCardResetOtpActivity.empty();
        if (fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer == AbstractMultimap.AsMap.AsMapEntries.ERROR) {
            empty = empty.mergeWith((DebitCardResetPinSuccessActivity_ViewBinding<? extends requireActivity$MediaBrowserCompat$CustomActionResultReceiver>) fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.write(str));
        }
        if (fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver == AbstractMultimap.AsMap.AsMapEntries.ERROR) {
            FullScreenLoadingActivity.write write = fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
            empty = empty.mergeWith((DebitCardResetPinSuccessActivity_ViewBinding<? extends requireActivity$MediaBrowserCompat$CustomActionResultReceiver>) write.MediaBrowserCompat$ItemReceiver.getPredictiveTiles(new offer(fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.f3137x50fd9e4a)).map(zaac.IconCompatParcelizer).doOnNext(new DeviceProperties(fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver)).map(new isUserBuild(fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver, str)).onErrorReturn(new isSidewinder(fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver, str)).startWith(DebitCardResetOtpActivity.fromCallable(new SuitabilitySummaryAdapter.read(fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver, str))));
        }
        if (fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat == AbstractMultimap.AsMap.AsMapEntries.ERROR) {
            empty = empty.mergeWith((DebitCardResetPinSuccessActivity_ViewBinding<? extends requireActivity$MediaBrowserCompat$CustomActionResultReceiver>) fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(str));
        }
        if (fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.read != AbstractMultimap.AsMap.AsMapEntries.ERROR) {
            return empty;
        }
        FullScreenLoadingActivity.write write2 = fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
        return empty.mergeWith((DebitCardResetPinSuccessActivity_ViewBinding<? extends requireActivity$MediaBrowserCompat$CustomActionResultReceiver>) write2.MediaBrowserCompat$ItemReceiver.getBannerTiles(fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.f3137x50fd9e4a).map(zaac.IconCompatParcelizer).doOnNext(new Hex(fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver)).map(new bytesToStringLowercase(fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver, str)).onErrorReturn(new isAtLeastFenacho(fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver, str)).startWith(DebitCardResetOtpActivity.fromCallable(new C5764xf73d3f7d(fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver, str))));
    }
}
