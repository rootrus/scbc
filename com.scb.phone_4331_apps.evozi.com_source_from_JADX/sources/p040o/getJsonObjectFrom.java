package p040o;

import p040o.CheckCaptureModule_GetExtractionParametersFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.getJsonObjectFrom */
public final class getJsonObjectFrom extends writeUInt64NoTag<CheckCaptureModule_GetExtractionParametersFactory.write> {
    /* access modifiers changed from: private */
    public final getConcurrencyLevel MediaBrowserCompat$ItemReceiver;
    public final getInfoWindowAnchorU write;

    /* renamed from: o.getJsonObjectFrom$IconCompatParcelizer */
    public static final class IconCompatParcelizer<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        private /* synthetic */ getJsonObjectFrom read;

        public IconCompatParcelizer(getJsonObjectFrom getjsonobjectfrom) {
            this.read = getjsonobjectfrom;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            final Throwable th = (Throwable) obj;
            getJsonObjectFrom.read(this.read);
            getJsonObjectFrom getjsonobjectfrom = this.read;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<CheckCaptureModule_GetExtractionParametersFactory.write>() {
                public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
                    Throwable th = th;
                    onGetStartedClick.IconCompatParcelizer((Object) th, "throwable");
                    ((CheckCaptureModule_GetExtractionParametersFactory.write) obj).IconCompatParcelizer(th);
                }
            };
            if (getjsonobjectfrom.RatingCompat != null) {
                r1.IconCompatParcelizer(getjsonobjectfrom.RatingCompat);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getJsonObjectFrom(RegularImmutableBiMap regularImmutableBiMap, getInfoWindowAnchorU getinfowindowanchoru, getConcurrencyLevel getconcurrencylevel) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) getinfowindowanchoru, "deepLinkCase");
        onGetStartedClick.write((Object) getconcurrencylevel, "bankingAgentDisplayMapper");
        this.write = getinfowindowanchoru;
        this.MediaBrowserCompat$ItemReceiver = getconcurrencylevel;
    }

    public static final /* synthetic */ void read(getJsonObjectFrom getjsonobjectfrom) {
        if (getjsonobjectfrom.RatingCompat != null) {
            getjsonobjectfrom.RatingCompat.aj_();
        }
    }
}
