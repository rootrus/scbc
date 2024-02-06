package p040o;

import java.util.ArrayList;

/* renamed from: o.BillExtractor */
public final /* synthetic */ class BillExtractor implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ KtaJsonBill_MembersInjector MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ BillExtractor(KtaJsonBill_MembersInjector ktaJsonBill_MembersInjector) {
        this.MediaBrowserCompat$CustomActionResultReceiver = ktaJsonBill_MembersInjector;
    }

    public final void IconCompatParcelizer(Object obj) {
        KtaJsonBill_MembersInjector ktaJsonBill_MembersInjector = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (!ktaJsonBill_MembersInjector.MediaBrowserCompat$SearchResultReceiver((Throwable) obj)) {
            ktaJsonBill_MembersInjector.write = new ArrayList();
            BillExtractor_MembersInjector billExtractor_MembersInjector = BillExtractor_MembersInjector.MediaBrowserCompat$ItemReceiver;
            if (ktaJsonBill_MembersInjector.RatingCompat != null) {
                billExtractor_MembersInjector.IconCompatParcelizer(ktaJsonBill_MembersInjector.RatingCompat);
            }
        }
    }
}
