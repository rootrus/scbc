package com.scb.phone.view.fragment.hml;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlIssuerLandingActivity;
import com.scb.phone.view.activity.hml.HmlIssuerLandingActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.easycash.issuer.EasycashIssuerInputFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.getSymbolsFound;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlIssuerInputFragment extends EasycashIssuerInputFragment {
    public static final C5990x29b355a7 MediaBrowserCompat$CustomActionResultReceiver = new C5990x29b355a7((byte) 0);

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "etb")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_issuer_input", zsyr2kArr);
        }
    }

    public final void IconCompatParcelizer() {
        getSymbolsFound getsymbolsfound = this.inputPresenter;
        CustomSpinnerWithTitle customSpinnerWithTitle = this.customSpinnerLoadType;
        onGetStartedClick.IconCompatParcelizer((Object) customSpinnerWithTitle, "customSpinnerLoadType");
        getsymbolsfound.IconCompatParcelizer(customSpinnerWithTitle.spinner.getSelectedItemPosition() - 1, (String) null, Boolean.TRUE);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (getContext() != null) {
            HmlIssuerLandingActivity$MediaBrowserCompat$ItemReceiver hmlIssuerLandingActivity$MediaBrowserCompat$ItemReceiver = HmlIssuerLandingActivity.MediaDescriptionCompat;
            Intent addFlags = new Intent(getContext(), HmlIssuerLandingActivity.class).addFlags(603979776);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    addFlags = setTapText.write(activity, addFlags).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(addFlags.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(addFlags);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void write() {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "etb")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_issuer_search", zsyr2kArr);
        }
        super.write();
    }
}
