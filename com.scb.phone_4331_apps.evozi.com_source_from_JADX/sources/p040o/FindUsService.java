package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomDeltaInput;

/* renamed from: o.FindUsService */
public final /* synthetic */ class FindUsService implements View.OnFocusChangeListener {
    private final /* synthetic */ View.OnFocusChangeListener IconCompatParcelizer;
    private final /* synthetic */ CustomDeltaInput MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ boolean write;

    public /* synthetic */ FindUsService(CustomDeltaInput customDeltaInput, boolean z, View.OnFocusChangeListener onFocusChangeListener) {
        this.MediaBrowserCompat$ItemReceiver = customDeltaInput;
        this.write = z;
        this.IconCompatParcelizer = onFocusChangeListener;
    }

    public final void onFocusChange(View view, boolean z) {
        CustomDeltaInput customDeltaInput = this.MediaBrowserCompat$ItemReceiver;
        boolean z2 = this.write;
        View.OnFocusChangeListener onFocusChangeListener = this.IconCompatParcelizer;
        AmountEditText amountEditText = (AmountEditText) view;
        if (z2 && !z && amountEditText.getText().toString().isEmpty()) {
            amountEditText.removeTextChangedListener(customDeltaInput.MediaBrowserCompat$MediaItem);
            customDeltaInput.setActualValue(customDeltaInput.MediaBrowserCompat$CustomActionResultReceiver);
            amountEditText.addTextChangedListener(customDeltaInput.MediaBrowserCompat$MediaItem);
        }
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }
}
