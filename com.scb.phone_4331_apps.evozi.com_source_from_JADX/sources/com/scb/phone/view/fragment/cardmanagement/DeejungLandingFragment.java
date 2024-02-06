package com.scb.phone.view.fragment.cardmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.cardmanagement.SelectPurchasesActivity;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C7508tR;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.chain;
import p040o.getBitmapForDebugging;
import p040o.getOnDeviceTextRecognizer;
import p040o.setTapText;

public class DeejungLandingFragment extends BaseFragment implements C7508tR {
    private chain IconCompatParcelizer;
    @BindView
    DefaultButton btnDeejungReview;
    @HmlPinActivity
    public getBitmapForDebugging presenter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86532131493880, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.IconCompatParcelizer = (chain) getActivity().getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungLandingActivity.KEY_CREDIT_CARD_DISPLAY");
        this.btnDeejungReview.setText(getString(R.string.review));
        this.btnDeejungReview.setButtonEnabled(false);
        return inflate;
    }

    public final void IconCompatParcelizer() {
        Intent read = SelectPurchasesActivity.read(getContext(), this.IconCompatParcelizer);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 112);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 112 && i2 == 118) {
            getActivity().setResult(118);
            getActivity().finish();
        }
    }

    @OnClick
    public void onClickOfSelectPurchases() {
        getBitmapForDebugging getbitmapfordebugging = this.presenter;
        getOnDeviceTextRecognizer getondevicetextrecognizer = getOnDeviceTextRecognizer.MediaBrowserCompat$CustomActionResultReceiver;
        if (getbitmapfordebugging.RatingCompat != null) {
            getondevicetextrecognizer.IconCompatParcelizer(getbitmapfordebugging.RatingCompat);
        }
    }
}
