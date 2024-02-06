package com.scb.phone.view.fragment.cardmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.cardmanagement.CCAboutActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.UncheckedTimeoutException;
import p040o.ZSYR2K;
import p040o.setTapText;

public class NoEligiblePurchasesFragment extends BaseFragment {
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88662131494093, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("screen_type", "empty_state")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("deejung_installment_selectpurchases", zsyr2kArr);
        }
        return inflate;
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onMoreInfoClick() {
        Intent IconCompatParcelizer = CCAboutActivity.IconCompatParcelizer(getActivity(), UncheckedTimeoutException.DEEJUNG_INSTALLMENT);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
