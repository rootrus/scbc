package p040o;

import java.util.List;

/* renamed from: o.proxyGetUriRtti */
public final /* synthetic */ class proxyGetUriRtti implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ RttiBillExtractor read;

    public /* synthetic */ proxyGetUriRtti(RttiBillExtractor rttiBillExtractor) {
        this.read = rttiBillExtractor;
    }

    public final void IconCompatParcelizer(Object obj) {
        isSupportFragmentClass issupportfragmentclass;
        RttiBillExtractor rttiBillExtractor = this.read;
        List<parseOs> list = (List) obj;
        rttiBillExtractor.MediaDescriptionCompat = list;
        boolean z = true;
        if (!(rttiBillExtractor.RatingCompat != null)) {
            return;
        }
        if (rttiBillExtractor.IconCompatParcelizer == null) {
            BillExtractActivity billExtractActivity = new BillExtractActivity(list);
            if (rttiBillExtractor.RatingCompat == null) {
                z = false;
            }
            if (z) {
                billExtractActivity.IconCompatParcelizer(rttiBillExtractor.RatingCompat);
                return;
            }
            return;
        }
        show show = new show(list);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new proxyGetIParameters(rttiBillExtractor)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        if ((issupportfragmentclass.IconCompatParcelizer != null) && IGoogleMapDelegate.OWN.name().equals(rttiBillExtractor.IconCompatParcelizer.ActionMenuItemView)) {
            BillCaptureModule_RttiExceptionResponseDeserializer_Factory billCaptureModule_RttiExceptionResponseDeserializer_Factory = new BillCaptureModule_RttiExceptionResponseDeserializer_Factory(issupportfragmentclass);
            if (rttiBillExtractor.RatingCompat == null) {
                z = false;
            }
            if (z) {
                billCaptureModule_RttiExceptionResponseDeserializer_Factory.IconCompatParcelizer(rttiBillExtractor.RatingCompat);
            }
        } else if (IGoogleMapDelegate.OWN.name().equals(rttiBillExtractor.IconCompatParcelizer.ActionMenuItemView)) {
            getStreetViewPanoramaAsync getstreetviewpanoramaasync = new getStreetViewPanoramaAsync();
            getstreetviewpanoramaasync.write = rttiBillExtractor.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            getstreetviewpanoramaasync.MediaBrowserCompat$CustomActionResultReceiver = rttiBillExtractor.IconCompatParcelizer.AppCompatDialogFragment;
            proxyGetUriKta proxygeturikta = new proxyGetUriKta(Shorts.read(getstreetviewpanoramaasync, rttiBillExtractor.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer.setItemInvoker()));
            if (rttiBillExtractor.RatingCompat == null) {
                z = false;
            }
            if (z) {
                proxygeturikta.IconCompatParcelizer(rttiBillExtractor.RatingCompat);
            }
        }
    }
}
