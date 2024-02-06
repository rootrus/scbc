package com.scb.phone.view.fragment.ccrredemption.product;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnEditorAction;
import butterknife.OnTextChanged;
import com.scb.phone.R;
import com.scb.phone.view.activity.ccrredemption.review.ReviewRedemptionActivity;
import com.scb.phone.view.custom.ccrredemption.CustomEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.text.NumberFormat;
import java.util.Locale;
import p040o.HmlPinActivity;
import p040o.IdCaptureActivity_MembersInjector;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getEkycRegistration;
import p040o.getMapKeyAndValueTypes;
import p040o.isEagerInDefaultApp;
import p040o.lambda$intoSet$2;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;

public class QuantityPointsPlusMoneyFragment extends BaseFragment implements IdCaptureActivity_MembersInjector, getEkycRegistration {
    @BindView
    DefaultButton btnContinue;
    @BindView
    DefaultButton btnQuantityMinus;
    @BindView
    DefaultButton btnQuantityPlus;
    @BindView
    CustomEditText edtQuantity;
    @HmlPinActivity
    public getMapKeyAndValueTypes presenter;
    @BindView
    TextView txvCurrency;
    @BindView
    TextView txvMoneyPerUnit;
    @BindView
    TextView txvPointsError;
    @BindView
    TextView txvPointsPerUnit;
    @BindView
    TextView txvTotalPayable;
    @BindView
    TextView txvTotalPoints;

    public static Fragment MediaBrowserCompat$CustomActionResultReceiver() {
        return new QuantityPointsPlusMoneyFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89192131494146, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.edtQuantity.setKeyboardBackPressListener(this);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver((isEagerInDefaultApp) getActivity().getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.KEY_REWARD_PRODUCT_DTO"));
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver();
        return inflate;
    }

    public final void IconCompatParcelizer(int i, String str, String str2) {
        this.txvPointsPerUnit.setText(getString(R.string.points_value_per_unit, str2, Integer.valueOf(i)));
        this.txvTotalPoints.setText(str);
        this.edtQuantity.setText(String.valueOf(i));
        CustomEditText customEditText = this.edtQuantity;
        customEditText.setSelection(customEditText.getText().length());
        String format = NumberFormat.getInstance(Locale.getDefault()).format(this.presenter.read.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer);
        this.txvMoneyPerUnit.setText(getString(R.string.points_value_per_unit, format, Integer.valueOf(i)));
        this.txvTotalPayable.setText(NumberFormat.getInstance(Locale.getDefault()).format((long) (this.presenter.read.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer.intValue() * i)));
        this.txvCurrency.setText(this.presenter.read.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$MediaItem);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onQuantityPlusClick() {
        this.presenter.MediaMetadataCompat();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onQuantityMinusClick() {
        this.presenter.MediaDescriptionCompat();
    }

    /* access modifiers changed from: package-private */
    @OnTextChanged
    public void onQuantityChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!TextUtils.isEmpty(this.edtQuantity.getText().toString().trim())) {
            this.presenter.IconCompatParcelizer(Integer.parseInt(this.edtQuantity.getText().toString()));
        } else {
            this.presenter.IconCompatParcelizer(0);
        }
    }

    @OnEditorAction
    public boolean onQuantityDoneClick(int i) {
        if (i != 6) {
            return false;
        }
        PlaybackStateCompat$CustomAction();
        this.edtQuantity.clearFocus();
        return false;
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onContinueClick() {
        this.presenter.write();
    }

    public final void write(boolean z) {
        this.btnQuantityMinus.setButtonEnabled(z);
    }

    public final void read(boolean z) {
        this.btnQuantityPlus.setButtonEnabled(z);
    }

    public final void IconCompatParcelizer(boolean z) {
        this.btnContinue.setButtonEnabled(z);
    }

    public final void write() {
        this.txvPointsError.setVisibility(0);
        this.edtQuantity.getBackground().mutate().setColorFilter(setLastBaselineToBottomHeight.read(getContext(), R.color.f67152131099871), PorterDuff.Mode.SRC_ATOP);
    }

    public final void read() {
        this.txvPointsError.setVisibility(8);
        this.edtQuantity.getBackground().mutate().clearColorFilter();
    }

    public final void IconCompatParcelizer(lambda$intoSet$2 lambda_intoset_2) {
        Intent MediaBrowserCompat$ItemReceiver = ReviewRedemptionActivity.MediaBrowserCompat$ItemReceiver(getContext(), lambda_intoset_2);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$ItemReceiver, 111);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 111 && intent != null) {
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        PlaybackStateCompat$CustomAction();
        this.edtQuantity.clearFocus();
    }
}
