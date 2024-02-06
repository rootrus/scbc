package p040o;

import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.custom.common.CustomAddressInput;

/* renamed from: o.uploadNationalId */
public final /* synthetic */ class uploadNationalId implements TextView.OnEditorActionListener {
    private final /* synthetic */ CustomAddressInput write;

    public /* synthetic */ uploadNationalId(CustomAddressInput customAddressInput) {
        this.write = customAddressInput;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        CustomAddressInput customAddressInput = this.write;
        if (i != 6 && i != 5) {
            return false;
        }
        customAddressInput.setTextValue(customAddressInput.inputTextField.getText().toString().trim());
        return false;
    }
}
