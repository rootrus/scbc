package p040o;

import com.scb.phone.view.custom.common.AmountEditText;

/* renamed from: o.getProductTermCondition */
public final /* synthetic */ class getProductTermCondition implements AmountEditText.IconCompatParcelizer {
    private final /* synthetic */ AmountEditText MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getProductTermCondition(AmountEditText amountEditText) {
        this.MediaBrowserCompat$CustomActionResultReceiver = amountEditText;
    }

    public final void IconCompatParcelizer() {
        AmountEditText.write write = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        if (write != null) {
            write.write();
        }
    }
}
