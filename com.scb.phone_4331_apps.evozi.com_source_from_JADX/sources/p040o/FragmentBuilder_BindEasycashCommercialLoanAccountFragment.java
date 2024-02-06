package p040o;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: o.FragmentBuilder_BindEasycashCommercialLoanAccountFragment */
public final class FragmentBuilder_BindEasycashCommercialLoanAccountFragment implements TextWatcher {
    private final FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> write;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public FragmentBuilder_BindEasycashCommercialLoanAccountFragment(FundFactSheetActivity<? super String, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "afterTextChanged");
        this.write = fundFactSheetActivity;
    }

    public final void afterTextChanged(Editable editable) {
        this.write.invoke(String.valueOf(editable));
    }
}
