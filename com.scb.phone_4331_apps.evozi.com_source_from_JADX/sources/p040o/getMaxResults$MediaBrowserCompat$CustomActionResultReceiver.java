package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.getMaxResults$MediaBrowserCompat$CustomActionResultReceiver */
public final class getMaxResults$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<CreditCardParameters_MembersInjector> {
    private /* synthetic */ List IconCompatParcelizer;
    private /* synthetic */ int MediaBrowserCompat$ItemReceiver;

    public getMaxResults$MediaBrowserCompat$CustomActionResultReceiver(List list, int i) {
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        CreditCardParameters_MembersInjector creditCardParameters_MembersInjector = (CreditCardParameters_MembersInjector) obj;
        FirebaseOptions firebaseOptions = (FirebaseOptions) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver);
        if (firebaseOptions != null) {
            creditCardParameters_MembersInjector.read(firebaseOptions);
        }
    }
}
