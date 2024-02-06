package p040o;

/* renamed from: o.bind */
public final class C4101bind extends frequency<String, bind$MediaBrowserCompat$ItemReceiver> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4101bind(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, final IIdExtractor iIdExtractor) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<bind$MediaBrowserCompat$ItemReceiver, BScanCNotificationDeepLinkActivity<String>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                bind$MediaBrowserCompat$ItemReceiver bind_mediabrowsercompat_itemreceiver = (bind$MediaBrowserCompat$ItemReceiver) obj;
                onGetStartedClick.write((Object) bind_mediabrowsercompat_itemreceiver, "params");
                IIdExtractor iIdExtractor = iIdExtractor;
                String str = bind_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
                String str2 = bind_mediabrowsercompat_itemreceiver.read;
                String str3 = bind_mediabrowsercompat_itemreceiver.write;
                String str4 = bind_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver;
                String read2 = removeIfFromRandomAccessList.read(bind_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver);
                onGetStartedClick.IconCompatParcelizer((Object) read2, "Utilities.amountDoubleWi…woDecimals(params.amount)");
                BScanCNotificationDeepLinkActivity<zzxb> IconCompatParcelizer = iIdExtractor.IconCompatParcelizer(str, str2, str3, str4, read2, bind_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver);
                DirectDebitDeepLinkActivity directDebitDeepLinkActivity = C41035.IconCompatParcelizer;
                HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
                onCopy oncopy = new onCopy(IconCompatParcelizer, directDebitDeepLinkActivity);
                onGetStartedClick.IconCompatParcelizer((Object) oncopy, "bankingAgentRepositoryCo…gType).map { it.tokenId }");
                return oncopy;
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) iIdExtractor, "bankingAgentRepositoryContractor");
    }
}
