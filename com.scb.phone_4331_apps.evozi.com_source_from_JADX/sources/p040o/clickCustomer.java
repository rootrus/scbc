package p040o;

import java.util.Iterator;

/* renamed from: o.clickCustomer */
public final class clickCustomer<T> implements Iterable<T> {
    private int read;
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends T> write;

    public clickCustomer(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, int i) {
        this.write = debitCardResetPinSuccessActivity_ViewBinding;
        this.read = i;
    }

    public final Iterator<T> iterator() {
        clickCustomer$MediaBrowserCompat$CustomActionResultReceiver clickcustomer_mediabrowsercompat_customactionresultreceiver = new clickCustomer$MediaBrowserCompat$CustomActionResultReceiver(this.read);
        this.write.subscribe(clickcustomer_mediabrowsercompat_customactionresultreceiver);
        return clickcustomer_mediabrowsercompat_customactionresultreceiver;
    }
}
