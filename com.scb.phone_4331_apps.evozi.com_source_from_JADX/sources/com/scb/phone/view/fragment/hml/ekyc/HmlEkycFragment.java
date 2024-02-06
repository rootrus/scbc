package com.scb.phone.view.fragment.hml.ekyc;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.ekyc.HmlNationalIdActivity;
import com.scb.phone.view.activity.hml.ekyc.HmlNationalIdActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.ntb.ekyc.EkycFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.CustomConcurrentHashMap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlEkycFragment extends EkycFragment {
    public final int IconCompatParcelizer() {
        return R.string.hml_ntb_ekyc_ndid_exit_dialog_text;
    }

    public final String RatingCompat() {
        return "your_loan";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        HmlNationalIdActivity$MediaBrowserCompat$ItemReceiver hmlNationalIdActivity$MediaBrowserCompat$ItemReceiver = HmlNationalIdActivity.MediaBrowserCompat$MediaItem;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlNationalIdActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(intent, 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @OnClick
    public final void onNextButtonClick() {
        this.ekycPresenter.write(CustomConcurrentHashMap.StrongExpirableEvictableEntry.HML);
    }
}
