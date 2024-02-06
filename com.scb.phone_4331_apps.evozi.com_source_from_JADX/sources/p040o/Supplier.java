package p040o;

import com.scb.phone.view.activity.registration.C5708x2064d349;
import p040o.Suppliers;

/* renamed from: o.Supplier */
public final /* synthetic */ class Supplier implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Suppliers.SupplierFunction MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String MediaBrowserCompat$SearchResultReceiver;
    private final /* synthetic */ String MediaMetadataCompat;
    private final /* synthetic */ String RatingCompat;
    private final /* synthetic */ C5708x2064d349 read;
    private final /* synthetic */ String write;

    public /* synthetic */ Supplier(Suppliers.SupplierFunction supplierFunction, String str, C5708x2064d349 registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver, String str2, String str3, String str4, String str5, String str6) {
        this.MediaBrowserCompat$ItemReceiver = supplierFunction;
        this.write = str;
        this.read = registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.MediaMetadataCompat = str4;
        this.MediaBrowserCompat$SearchResultReceiver = str5;
        this.RatingCompat = str6;
    }

    public final Object write(Object obj) {
        Suppliers.SupplierFunction supplierFunction = this.MediaBrowserCompat$ItemReceiver;
        String str = this.write;
        C5708x2064d349 registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver = this.read;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = this.IconCompatParcelizer;
        String str4 = this.MediaMetadataCompat;
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        String str6 = this.RatingCompat;
        return new getLatLngBoundsForCameraTarget(str, registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, str2, str3, str4, str5, ((PlaceBuffer) obj).read, supplierFunction.write(str6), supplierFunction.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat() != null ? new addCopies("EASYAPP", supplierFunction.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat()) : null, registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver.write, supplierFunction.MediaBrowserCompat$ItemReceiver);
    }
}
