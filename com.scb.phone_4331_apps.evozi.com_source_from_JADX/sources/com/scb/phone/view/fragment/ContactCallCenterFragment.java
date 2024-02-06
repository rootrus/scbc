package com.scb.phone.view.fragment;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.R;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class ContactCallCenterFragment extends BaseFragment {
    public final void aK_() {
        Intent intent = new Intent("android.intent.action.DIAL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append(getResources().getString(R.string.easycash_contact_number));
        intent.setData(Uri.parse(sb.toString()));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb2 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb2.append(intent.getData());
            sb2.append("\n with context ");
            sb2.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb2.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
