package p040o;

import android.view.View;
import com.scb.phone.view.fragment.transferandpay.topuptab.TopUpBillerSelectedFragment;

/* renamed from: o.FragmentBuilder_BindAccountManagementFragment */
public final /* synthetic */ class FragmentBuilder_BindAccountManagementFragment implements View.OnFocusChangeListener {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ TopUpBillerSelectedFragment read;

    public /* synthetic */ FragmentBuilder_BindAccountManagementFragment(TopUpBillerSelectedFragment topUpBillerSelectedFragment, String str) {
        this.read = topUpBillerSelectedFragment;
        this.IconCompatParcelizer = str;
    }

    public final void onFocusChange(View view, boolean z) {
        this.read.IconCompatParcelizer(this.IconCompatParcelizer, z);
    }
}
