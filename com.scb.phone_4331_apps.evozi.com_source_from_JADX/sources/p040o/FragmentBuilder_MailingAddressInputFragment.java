package p040o;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: o.FragmentBuilder_MailingAddressInputFragment */
public final class FragmentBuilder_MailingAddressInputFragment implements TextWatcher {
    private final FundFactSheetActivity<Editable, HmlVerifyPhoneValidateOtpActivity> write;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public FragmentBuilder_MailingAddressInputFragment(FundFactSheetActivity<? super Editable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "afterTextChange");
        this.write = fundFactSheetActivity;
    }

    public final void afterTextChanged(Editable editable) {
        this.write.invoke(editable);
    }
}
