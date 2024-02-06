package p040o;

import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: o.injectRttiExtractionServerUrl */
public final /* synthetic */ class injectRttiExtractionServerUrl implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ KtaJsonBill_MembersInjector write;

    public /* synthetic */ injectRttiExtractionServerUrl(KtaJsonBill_MembersInjector ktaJsonBill_MembersInjector) {
        this.write = ktaJsonBill_MembersInjector;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        String str2;
        isSupportFragmentClass issupportfragmentclass;
        KtaJsonBill_MembersInjector ktaJsonBill_MembersInjector = this.write;
        List<parseFile> list = (List) obj;
        ktaJsonBill_MembersInjector.write = list;
        boolean z = true;
        if (!(ktaJsonBill_MembersInjector.RatingCompat != null)) {
            return;
        }
        if (ktaJsonBill_MembersInjector.MediaBrowserCompat$MediaItem == null && ktaJsonBill_MembersInjector.IconCompatParcelizer == null) {
            injectRttiExceptionResponseDeserializer injectrttiexceptionresponsedeserializer = new injectRttiExceptionResponseDeserializer(list);
            if (ktaJsonBill_MembersInjector.RatingCompat == null) {
                z = false;
            }
            if (z) {
                injectrttiexceptionresponsedeserializer.IconCompatParcelizer(ktaJsonBill_MembersInjector.RatingCompat);
                return;
            }
            return;
        }
        onInfoWindowLongClick oninfowindowlongclick = ktaJsonBill_MembersInjector.MediaBrowserCompat$MediaItem;
        if (oninfowindowlongclick != null) {
            str = oninfowindowlongclick.setBackgroundResource;
        } else {
            str = ktaJsonBill_MembersInjector.IconCompatParcelizer.write.read;
        }
        onInfoWindowLongClick oninfowindowlongclick2 = ktaJsonBill_MembersInjector.MediaBrowserCompat$MediaItem;
        if (oninfowindowlongclick2 != null) {
            str2 = oninfowindowlongclick2.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str2 = "";
        }
        show show = new show(list);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new newBillExtractor(str)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        if (!(issupportfragmentclass.IconCompatParcelizer != null) || !ktaJsonBill_MembersInjector.IconCompatParcelizer()) {
            if (ktaJsonBill_MembersInjector.IconCompatParcelizer()) {
                getLookAndFeelParameters getlookandfeelparameters = getLookAndFeelParameters.IconCompatParcelizer;
                if (ktaJsonBill_MembersInjector.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getlookandfeelparameters.IconCompatParcelizer(ktaJsonBill_MembersInjector.RatingCompat);
                }
            }
        } else if (ktaJsonBill_MembersInjector.write()) {
            T t = issupportfragmentclass.IconCompatParcelizer;
            if (t != null) {
                ktaJsonBill_MembersInjector.MediaMetadataCompat.read(ktaJsonBill_MembersInjector.MediaMetadataCompat.read.write(str2).map(new injectRttiExtractionServer(ktaJsonBill_MembersInjector)), new injectKtaExtractionServerUrl(ktaJsonBill_MembersInjector, ((parseFile) t).read.write), new injectKtaDeserializer(ktaJsonBill_MembersInjector));
                return;
            }
            throw new NoSuchElementException("No value present");
        } else {
            BillParameters_Factory billParameters_Factory = new BillParameters_Factory(issupportfragmentclass);
            if (ktaJsonBill_MembersInjector.RatingCompat == null) {
                z = false;
            }
            if (z) {
                billParameters_Factory.IconCompatParcelizer(ktaJsonBill_MembersInjector.RatingCompat);
            }
        }
    }
}
