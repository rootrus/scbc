package p040o;

import com.scb.phone.view.activity.registration.C5708x2064d349;
import java.util.concurrent.TimeUnit;
import p040o.Suppliers;

/* renamed from: o.padStart */
public final /* synthetic */ class padStart implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Suppliers.SupplierFunction MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String MediaBrowserCompat$MediaItem;
    private final /* synthetic */ String MediaDescriptionCompat;
    private final /* synthetic */ String read;
    private final /* synthetic */ String write;

    public /* synthetic */ padStart(Suppliers.SupplierFunction supplierFunction, String str, String str2, String str3, String str4, String str5, String str6) {
        this.MediaBrowserCompat$ItemReceiver = supplierFunction;
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.write = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.MediaBrowserCompat$MediaItem = str5;
        this.MediaDescriptionCompat = str6;
    }

    public final Object write(Object obj) {
        Suppliers.SupplierFunction supplierFunction = this.MediaBrowserCompat$ItemReceiver;
        return supplierFunction.IconCompatParcelizer.MediaBrowserCompat$MediaItem().map(new isNullOrEmpty(supplierFunction)).map(new Supplier(supplierFunction, this.read, (C5708x2064d349) obj, this.IconCompatParcelizer, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$MediaItem, this.MediaDescriptionCompat)).delay(100, TimeUnit.MILLISECONDS);
    }
}
