package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.CustomCardInformationInput;

/* renamed from: o.updateFastPayProfile */
public final /* synthetic */ class updateFastPayProfile implements View.OnFocusChangeListener {
    private final /* synthetic */ CustomCardInformationInput write;

    public /* synthetic */ updateFastPayProfile(CustomCardInformationInput customCardInformationInput) {
        this.write = customCardInformationInput;
    }

    public final void onFocusChange(View view, boolean z) {
        this.write.IconCompatParcelizer(z);
    }
}
