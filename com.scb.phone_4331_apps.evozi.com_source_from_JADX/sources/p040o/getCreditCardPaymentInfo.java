package p040o;

import android.view.View;

/* renamed from: o.getCreditCardPaymentInfo */
public final /* synthetic */ class getCreditCardPaymentInfo implements View.OnClickListener {
    private final /* synthetic */ getCustomerContact IconCompatParcelizer;

    public /* synthetic */ getCreditCardPaymentInfo(getCustomerContact getcustomercontact) {
        this.IconCompatParcelizer = getcustomercontact;
    }

    public final void onClick(View view) {
        this.IconCompatParcelizer.read(view);
    }
}
