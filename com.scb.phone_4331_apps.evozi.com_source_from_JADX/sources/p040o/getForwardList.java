package p040o;

import java.util.List;
import p040o.Iterables;
import p040o.Suppliers;

/* renamed from: o.getForwardList */
public final class getForwardList extends Iterables.C35339 {
    public final Suppliers.SupplierOfInstance IconCompatParcelizer;
    public final Suppliers.SupplierComposition MediaBrowserCompat$CustomActionResultReceiver;
    final isValidLenient write;

    /* renamed from: o.getForwardList$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<List<? extends getCamera>, C3085x7c929f5b> {
        private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ getForwardList MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(getForwardList getforwardlist, boolean z) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = getforwardlist;
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            onGetStartedClick.write((Object) list, "countryList");
            return this.MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$ItemReceiver(list, this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.getForwardList$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<List<? extends getCamera>, C3085x7c929f5b> {
        private /* synthetic */ getForwardList MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ boolean write = true;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(getForwardList getforwardlist, boolean z) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = getforwardlist;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            onGetStartedClick.write((Object) list, "countryList");
            return this.MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$ItemReceiver(list, this.write);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getForwardList(Suppliers.SupplierComposition supplierComposition, isValidLenient isvalidlenient, Suppliers.SupplierOfInstance supplierOfInstance) {
        super((byte) 0);
        onGetStartedClick.write((Object) supplierComposition, "getCountryListCase");
        onGetStartedClick.write((Object) isvalidlenient, "countryListDisplayMapper");
        onGetStartedClick.write((Object) supplierOfInstance, "searchCountryCase");
        this.MediaBrowserCompat$CustomActionResultReceiver = supplierComposition;
        this.write = isvalidlenient;
        this.IconCompatParcelizer = supplierOfInstance;
    }
}
