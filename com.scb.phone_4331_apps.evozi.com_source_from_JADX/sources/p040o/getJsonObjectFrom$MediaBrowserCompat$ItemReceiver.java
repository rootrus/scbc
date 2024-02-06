package p040o;

import p040o.CheckCaptureModule_GetExtractionParametersFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.getJsonObjectFrom$MediaBrowserCompat$ItemReceiver */
public final class getJsonObjectFrom$MediaBrowserCompat$ItemReceiver<T> implements DebitCardMarketConductDeepLinkActivity<zzxa> {
    final /* synthetic */ getJsonObjectFrom write;

    public getJsonObjectFrom$MediaBrowserCompat$ItemReceiver(getJsonObjectFrom getjsonobjectfrom) {
        this.write = getjsonobjectfrom;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        final zzxa zzxa = (zzxa) obj;
        getJsonObjectFrom.read(this.write);
        getJsonObjectFrom getjsonobjectfrom = this.write;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<CheckCaptureModule_GetExtractionParametersFactory.write>(this) {
            private /* synthetic */ getJsonObjectFrom$MediaBrowserCompat$ItemReceiver read;

            {
                this.read = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                getConcurrencyLevel IconCompatParcelizer = this.read.write.MediaBrowserCompat$ItemReceiver;
                zzxa zzxa = zzxa;
                onGetStartedClick.IconCompatParcelizer((Object) zzxa, "response");
                ((CheckCaptureModule_GetExtractionParametersFactory.write) obj).read(IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(zzxa, this.read.write.write.MediaBrowserCompat$ItemReceiver.setItemInvoker()));
            }
        };
        if (getjsonobjectfrom.RatingCompat != null) {
            r1.IconCompatParcelizer(getjsonobjectfrom.RatingCompat);
        }
    }
}
