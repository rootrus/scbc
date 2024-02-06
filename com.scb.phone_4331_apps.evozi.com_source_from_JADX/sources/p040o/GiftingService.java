package p040o;

import android.text.TextUtils;
import android.view.View;
import com.scb.phone.view.custom.common.InputText;
import com.scb.phone.view.custom.common.InputText$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.GiftingService */
public final /* synthetic */ class GiftingService implements View.OnFocusChangeListener {
    private final /* synthetic */ InputText MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ GiftingService(InputText inputText) {
        this.MediaBrowserCompat$ItemReceiver = inputText;
    }

    public final void onFocusChange(View view, boolean z) {
        InputText inputText = this.MediaBrowserCompat$ItemReceiver;
        if (!z) {
            if (!TextUtils.isEmpty(inputText.inputEditText.getText().toString().trim())) {
                inputText.setText(inputText.inputEditText.getText().toString().trim());
            }
            InputText$MediaBrowserCompat$ItemReceiver inputText$MediaBrowserCompat$ItemReceiver = inputText.MediaBrowserCompat$ItemReceiver;
            if (inputText$MediaBrowserCompat$ItemReceiver != null) {
                inputText$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(inputText.inputEditText.getText().toString());
            }
        }
    }
}
