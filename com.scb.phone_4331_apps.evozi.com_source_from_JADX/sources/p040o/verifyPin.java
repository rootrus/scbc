package p040o;

import android.text.TextUtils;
import android.view.View;
import com.scb.phone.view.custom.easycash.CustomPhone;

/* renamed from: o.verifyPin */
public final /* synthetic */ class verifyPin implements View.OnFocusChangeListener {
    private final /* synthetic */ CustomPhone write;

    public /* synthetic */ verifyPin(CustomPhone customPhone) {
        this.write = customPhone;
    }

    public final void onFocusChange(View view, boolean z) {
        CustomPhone customPhone = this.write;
        if (z) {
            customPhone.proxyNumberField.setFilters(customPhone.MediaBrowserCompat$CustomActionResultReceiver);
            customPhone.read(false);
            customPhone.proxyNumberField.setText(TextUtils.isEmpty(customPhone.MediaBrowserCompat$ItemReceiver) ? "" : customPhone.MediaBrowserCompat$ItemReceiver);
            customPhone.proxyNumberField.addTextChangedListener(customPhone.read);
            return;
        }
        customPhone.proxyNumberField.removeTextChangedListener(customPhone.read);
        customPhone.MediaBrowserCompat$ItemReceiver = customPhone.proxyNumberField.getText().toString();
        customPhone.IconCompatParcelizer();
    }
}
