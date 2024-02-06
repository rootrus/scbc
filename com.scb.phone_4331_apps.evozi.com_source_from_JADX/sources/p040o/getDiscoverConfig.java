package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.CustomFundsActions;

/* renamed from: o.getDiscoverConfig */
public final /* synthetic */ class getDiscoverConfig implements View.OnClickListener {
    private final /* synthetic */ CustomFundsActions write;

    public /* synthetic */ getDiscoverConfig(CustomFundsActions customFundsActions) {
        this.write = customFundsActions;
    }

    public final void onClick(View view) {
        FragmentBuilder_BindBilledTabFragment fragmentBuilder_BindBilledTabFragment = this.write.IconCompatParcelizer;
        if (fragmentBuilder_BindBilledTabFragment != null) {
            fragmentBuilder_BindBilledTabFragment.write("BUTTON_SWITCH");
        }
    }
}
