package com.scb.phone.view.fragment.prelogin;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import butterknife.OnClick;
import butterknife.Optional;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.fragment.transferandpay.SuccessFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getUuidUtf8Bytes;
import p040o.setTapText;

public class SuccessQuickOperationFragment extends SuccessFragment {
    public static SuccessQuickOperationFragment IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_SUCCESS", getuuidutf8bytes);
        SuccessQuickOperationFragment successQuickOperationFragment = new SuccessQuickOperationFragment();
        successQuickOperationFragment.setArguments(bundle);
        return successQuickOperationFragment;
    }

    @OnClick
    @Optional
    public void onReturnHomeClick() {
        Intent intent = new Intent(getContext(), HomeActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
