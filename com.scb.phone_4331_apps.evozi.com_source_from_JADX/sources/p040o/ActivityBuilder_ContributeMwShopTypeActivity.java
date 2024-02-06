package p040o;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import com.scb.phone.view.fragment.registration.RegistrationCardDetailFragment;

/* renamed from: o.ActivityBuilder_ContributeMwShopTypeActivity */
public final /* synthetic */ class ActivityBuilder_ContributeMwShopTypeActivity implements View.OnFocusChangeListener {
    private final /* synthetic */ RegistrationCardDetailFragment write;

    public /* synthetic */ ActivityBuilder_ContributeMwShopTypeActivity(RegistrationCardDetailFragment registrationCardDetailFragment) {
        this.write = registrationCardDetailFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        RegistrationCardDetailFragment registrationCardDetailFragment = this.write;
        int i = 8;
        if (z) {
            ImageButton imageButton = registrationCardDetailFragment.btnClearCreditCardLimit;
            if (!TextUtils.isEmpty(registrationCardDetailFragment.creditCardLimitInput.getText())) {
                i = 0;
            }
            imageButton.setVisibility(i);
            return;
        }
        registrationCardDetailFragment.btnClearCreditCardLimit.setVisibility(8);
    }
}
