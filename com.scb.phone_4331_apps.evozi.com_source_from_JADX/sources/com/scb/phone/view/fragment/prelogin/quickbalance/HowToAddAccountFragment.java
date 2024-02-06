package com.scb.phone.view.fragment.prelogin.quickbalance;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.prelogin.HowToAddAccountStep2Activity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class HowToAddAccountFragment extends BaseFragment {
    private String IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaMetadataCompat;
    @BindView
    TextView mTextView1;
    @BindView
    TextView mTextView2;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88142131494041, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (!(getActivity() == null || getActivity().getIntent() == null)) {
            this.MediaMetadataCompat = getActivity().getIntent().getStringExtra("com.scb.phone.EXTRA_HOW_TO_ADD_ACCOUNT_TITLE");
            this.MediaBrowserCompat$CustomActionResultReceiver = getActivity().getIntent().getStringExtra("com.scb.phone.EXTRA_HOW_TO_ADD_ACCOUNT_TEXT_1");
            this.IconCompatParcelizer = getActivity().getIntent().getStringExtra("com.scb.phone.EXTRA_HOW_TO_ADD_ACCOUNT_TEXT_2");
        }
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(this.MediaMetadataCompat);
        this.mTextView1.setText(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.mTextView2.setText(this.IconCompatParcelizer);
        return inflate;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(this.MediaMetadataCompat);
    }

    @OnClick
    public void onButtonClicked() {
        Intent intent = new Intent(getContext(), HowToAddAccountStep2Activity.class);
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
