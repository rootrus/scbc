package p040o;

import android.view.View;
import com.scb.phone.view.fragment.transferandpay.transfer.TransferInputAmountFragment;

/* renamed from: o.FragmentBuilder_BindActivateChequeInputFragment */
public final /* synthetic */ class FragmentBuilder_BindActivateChequeInputFragment implements View.OnFocusChangeListener {
    private final /* synthetic */ TransferInputAmountFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ FragmentBuilder_BindActivateChequeInputFragment(TransferInputAmountFragment transferInputAmountFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = transferInputAmountFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(z);
    }
}
