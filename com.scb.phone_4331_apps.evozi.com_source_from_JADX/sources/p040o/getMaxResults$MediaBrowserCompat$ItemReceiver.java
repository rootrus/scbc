package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getMaxResults$MediaBrowserCompat$ItemReceiver */
public final class getMaxResults$MediaBrowserCompat$ItemReceiver<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
    final /* synthetic */ getMaxResults write;

    public getMaxResults$MediaBrowserCompat$ItemReceiver(getMaxResults getmaxresults) {
        this.write = getmaxresults;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        final Throwable th = (Throwable) obj;
        getMaxResults getmaxresults = this.write;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<CreditCardParameters_MembersInjector>(this) {
            private /* synthetic */ getMaxResults$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

            {
                this.MediaBrowserCompat$CustomActionResultReceiver = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                CreditCardParameters_MembersInjector creditCardParameters_MembersInjector = (CreditCardParameters_MembersInjector) obj;
                creditCardParameters_MembersInjector.aj_();
                if (!this.MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$SearchResultReceiver(th)) {
                    creditCardParameters_MembersInjector.write(this.MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                }
            }
        };
        if (getmaxresults.RatingCompat != null) {
            r1.IconCompatParcelizer(getmaxresults.RatingCompat);
        }
    }
}
