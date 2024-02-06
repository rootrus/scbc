package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.custom.common.CustomPhoneNumberInput;

/* renamed from: o.getEligibility */
public final /* synthetic */ class getEligibility implements View.OnFocusChangeListener {
    private final /* synthetic */ boolean IconCompatParcelizer = false;
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver = 10;
    private final /* synthetic */ View.OnFocusChangeListener read;
    private final /* synthetic */ CustomPhoneNumberInput write;

    public /* synthetic */ getEligibility(CustomPhoneNumberInput customPhoneNumberInput, View.OnFocusChangeListener onFocusChangeListener, int i, boolean z) {
        this.write = customPhoneNumberInput;
        this.read = onFocusChangeListener;
    }

    public final void onFocusChange(View view, boolean z) {
        CustomPhoneNumberInput customPhoneNumberInput = this.write;
        View.OnFocusChangeListener onFocusChangeListener = this.read;
        int i = this.MediaBrowserCompat$ItemReceiver;
        boolean z2 = this.IconCompatParcelizer;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
        String obj = customPhoneNumberInput.mEditText.getText().toString();
        if (z) {
            customPhoneNumberInput.mEditText.setFilters(CustomPhoneNumberInput.read(i));
            CustomEditText customEditText = customPhoneNumberInput.mEditText;
            if (obj != null && !obj.equals("")) {
                obj = obj.replace("-", "");
            }
            customEditText.setText(obj);
            return;
        }
        if (!(customPhoneNumberInput.mErrorTextView.getVisibility() == 0)) {
            customPhoneNumberInput.mEditText.setFilters(CustomPhoneNumberInput.read(i + 2));
            customPhoneNumberInput.mEditText.setText(getICheckDeserializerRtti.IconCompatParcelizer(z2, true, obj));
        }
    }
}
