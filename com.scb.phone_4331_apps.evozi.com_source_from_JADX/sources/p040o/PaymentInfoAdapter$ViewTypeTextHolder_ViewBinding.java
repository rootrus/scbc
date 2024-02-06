package p040o;

import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: o.PaymentInfoAdapter$ViewTypeTextHolder_ViewBinding */
public final class PaymentInfoAdapter$ViewTypeTextHolder_ViewBinding implements PrepaidResetPinSuccessActivity {
    private int IconCompatParcelizer = MediaBrowserCompat$CustomActionResultReceiver(-1);
    private int MediaBrowserCompat$ItemReceiver = -1;
    private String read;
    private List<PrepaidRequestMarketConductActivity> write;

    public PaymentInfoAdapter$ViewTypeTextHolder_ViewBinding(List<PrepaidRequestMarketConductActivity> list, String str) {
        this.write = (List) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(list, "Header list");
        this.read = str;
    }

    private int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i < -1) {
            return -1;
        }
        int size = this.write.size();
        boolean z = false;
        while (!z && i < size - 1) {
            i++;
            if (this.read == null) {
                z = true;
            } else {
                z = this.read.equalsIgnoreCase(this.write.get(i).IconCompatParcelizer());
            }
        }
        if (z) {
            return i;
        }
        return -1;
    }

    public final boolean hasNext() {
        return this.IconCompatParcelizer >= 0;
    }

    public final PrepaidRequestMarketConductActivity MediaBrowserCompat$ItemReceiver() throws NoSuchElementException {
        int i = this.IconCompatParcelizer;
        if (i >= 0) {
            this.MediaBrowserCompat$ItemReceiver = i;
            this.IconCompatParcelizer = MediaBrowserCompat$CustomActionResultReceiver(i);
            return this.write.get(i);
        }
        throw new NoSuchElementException("Iteration already finished.");
    }

    public final Object next() throws NoSuchElementException {
        return MediaBrowserCompat$ItemReceiver();
    }

    public final void remove() throws UnsupportedOperationException {
        if (this.MediaBrowserCompat$ItemReceiver >= 0) {
            this.write.remove(this.MediaBrowserCompat$ItemReceiver);
            this.MediaBrowserCompat$ItemReceiver = -1;
            this.IconCompatParcelizer--;
            return;
        }
        throw new IllegalStateException("No header to remove");
    }
}
