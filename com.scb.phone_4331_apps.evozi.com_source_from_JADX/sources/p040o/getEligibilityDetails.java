package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.CustomATMInput;

/* renamed from: o.getEligibilityDetails */
public final /* synthetic */ class getEligibilityDetails implements View.OnFocusChangeListener {
    private final /* synthetic */ CustomATMInput write;

    public /* synthetic */ getEligibilityDetails(CustomATMInput customATMInput) {
        this.write = customATMInput;
    }

    public final void onFocusChange(View view, boolean z) {
        this.write.write(z);
    }
}
