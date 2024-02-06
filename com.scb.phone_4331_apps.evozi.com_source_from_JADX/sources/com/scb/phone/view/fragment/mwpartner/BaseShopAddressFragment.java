package com.scb.phone.view.fragment.mwpartner;

import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import com.scb.phone.view.activity.mwpartner.MwBankAccountActivity;
import com.scb.phone.view.activity.mwpartner.MwLandingActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getProject;
import p040o.setTapText;

public abstract class BaseShopAddressFragment extends BaseFragment implements getProject.write {
    @BindView
    protected Button btnDone;
    @BindView
    protected TextView shopTypeDescriptionLabel;

    public boolean write() {
        return false;
    }

    public final void read(String str) {
        this.shopTypeDescriptionLabel.setText(str);
    }

    public final void write(boolean z) {
        this.btnDone.setEnabled(z);
    }

    public final void read() {
        Intent read = MwBankAccountActivity.read(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent addFlags = MwLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext()).addFlags(67108864);
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
