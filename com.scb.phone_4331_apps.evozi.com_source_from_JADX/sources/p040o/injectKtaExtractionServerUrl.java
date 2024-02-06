package p040o;

import java.util.List;

/* renamed from: o.injectKtaExtractionServerUrl */
public final /* synthetic */ class injectKtaExtractionServerUrl implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ KtaJsonBill_MembersInjector IconCompatParcelizer;
    private final /* synthetic */ String read;

    public /* synthetic */ injectKtaExtractionServerUrl(KtaJsonBill_MembersInjector ktaJsonBill_MembersInjector, String str) {
        this.IconCompatParcelizer = ktaJsonBill_MembersInjector;
        this.read = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        isSupportFragmentClass issupportfragmentclass;
        KtaJsonBill_MembersInjector ktaJsonBill_MembersInjector = this.IconCompatParcelizer;
        String str = this.read;
        List list = (List) obj;
        boolean z = true;
        if (ktaJsonBill_MembersInjector.RatingCompat != null) {
            show show = new show(list);
            show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new BillParameters(ktaJsonBill_MembersInjector)));
            if (show2.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            if ((issupportfragmentclass.IconCompatParcelizer != null) && ktaJsonBill_MembersInjector.write()) {
                BillExtractor_Factory billExtractor_Factory = new BillExtractor_Factory(issupportfragmentclass, str);
                if (ktaJsonBill_MembersInjector.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    billExtractor_Factory.IconCompatParcelizer(ktaJsonBill_MembersInjector.RatingCompat);
                }
            } else if (ktaJsonBill_MembersInjector.write()) {
                getStreetViewPanoramaAsync getstreetviewpanoramaasync = new getStreetViewPanoramaAsync();
                getstreetviewpanoramaasync.write = ktaJsonBill_MembersInjector.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver;
                getstreetviewpanoramaasync.MediaBrowserCompat$CustomActionResultReceiver = ktaJsonBill_MembersInjector.MediaBrowserCompat$MediaItem.AppCompatDialogFragment;
                BillParameters_MembersInjector billParameters_MembersInjector = new BillParameters_MembersInjector(Shorts.read(getstreetviewpanoramaasync, ktaJsonBill_MembersInjector.MediaMetadataCompat.IconCompatParcelizer.setItemInvoker()), str);
                if (ktaJsonBill_MembersInjector.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    billParameters_MembersInjector.IconCompatParcelizer(ktaJsonBill_MembersInjector.RatingCompat);
                }
            }
        }
    }
}
