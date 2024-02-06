package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.ILocationSourceDelegate;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getAddress1FieldName$MediaBrowserCompat$ItemReceiver */
final class getAddress1FieldName$MediaBrowserCompat$ItemReceiver<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
    private /* synthetic */ getAddress1FieldName write;

    getAddress1FieldName$MediaBrowserCompat$ItemReceiver(getAddress1FieldName getaddress1fieldname) {
        this.write = getaddress1fieldname;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        String str;
        ILocationSourceDelegate.zza zza;
        Throwable th = (Throwable) obj;
        boolean z = true;
        if (th instanceof RetrofitException) {
            ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
            if (iLocationSourceDelegate == null || (zza = iLocationSourceDelegate.write) == null) {
                str = null;
            } else {
                str = zza.IconCompatParcelizer;
            }
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("1002", str, true)) {
                getAddress1FieldName getaddress1fieldname = this.write;
                getaddress1fieldname.MediaBrowserCompat$ItemReceiver(getaddress1fieldname.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.LOGOUT));
                return;
            }
        }
        getAddress1FieldName getaddress1fieldname2 = this.write;
        getaddress1fieldname2.write(getaddress1fieldname2.MediaDescriptionCompat.isEmpty(), C44853.IconCompatParcelizer);
        getAddress1FieldName getaddress1fieldname3 = this.write;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C44841.IconCompatParcelizer;
        if (getaddress1fieldname3.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(getaddress1fieldname3.RatingCompat);
        }
        this.write.MediaBrowserCompat$SearchResultReceiver = false;
    }
}
