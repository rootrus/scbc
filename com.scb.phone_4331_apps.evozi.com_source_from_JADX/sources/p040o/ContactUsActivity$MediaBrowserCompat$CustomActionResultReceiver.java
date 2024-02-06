package p040o;

import p040o.Suppliers;

/* renamed from: o.ContactUsActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class ContactUsActivity$MediaBrowserCompat$CustomActionResultReceiver implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ Suppliers.SupplierOfInstance.write MediaBrowserCompat$CustomActionResultReceiver;

    private ContactUsActivity$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ ContactUsActivity$MediaBrowserCompat$CustomActionResultReceiver(Suppliers.SupplierOfInstance.write write) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write;
    }

    public final boolean write(Object obj) {
        String str;
        Suppliers.SupplierOfInstance.write write = this.MediaBrowserCompat$CustomActionResultReceiver;
        getCamera getcamera = (getCamera) obj;
        if (write.MediaBrowserCompat$ItemReceiver) {
            str = getcamera.write;
        } else {
            str = getcamera.MediaBrowserCompat$CustomActionResultReceiver.toLowerCase();
        }
        return str.contains(write.write.toLowerCase());
    }
}
