package p040o;

import p040o.C7435sJ;
import p040o.writeUInt64NoTag;

/* renamed from: o.sJ$MediaSessionCompat$Token */
final class sJ$MediaSessionCompat$Token<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
    private /* synthetic */ C7435sJ write;

    sJ$MediaSessionCompat$Token(C7435sJ sJVar) {
        this.write = sJVar;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        Throwable th = (Throwable) obj;
        C7435sJ sJVar = this.write;
        onGetStartedClick.IconCompatParcelizer((Object) th, "it");
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver(th);
        writeUInt64NoTag.IconCompatParcelizer ratingCompat = new C7435sJ.RatingCompat(sJVar, th);
        if (sJVar.RatingCompat != null) {
            ratingCompat.IconCompatParcelizer(sJVar.RatingCompat);
        }
    }
}
