package com.scb.phone.view.fragment.chequemanagement.stopcheque;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.chequemanagement.stopcheque.StopChequeReviewActivity;
import com.scb.phone.view.custom.common.CustomProxyNumber;
import com.scb.phone.view.custom.common.ScbEditText;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C6384xbfeacfd5;
import p040o.FragmentBuilder_BindChubbPaySuccessFragment;
import p040o.HmlPinActivity;
import p040o.LinkedTreeMap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.enqueueNotification;
import p040o.removeDependent;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class StopChequeInputFragment extends BaseFragment implements C6384xbfeacfd5, FragmentBuilder_BindChubbPaySuccessFragment, CustomProxyNumber.write {
    private int IconCompatParcelizer = 8;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$SearchResultReceiver = "";
    @BindView
    Button btnStopChequeReview;
    @BindView
    CustomProxyNumber editTextChequeNo;
    @HmlPinActivity
    public LinkedTreeMap.C35881 presenter;
    @BindView
    RelativeLayout rootView;

    public final void IconCompatParcelizer(String str) {
    }

    public final void MediaBrowserCompat$ItemReceiver() {
    }

    public final void MediaBrowserCompat$ItemReceiver(removeDependent removedependent) {
    }

    public final void write() {
    }

    public static StopChequeInputFragment read(String str) {
        StopChequeInputFragment stopChequeInputFragment = new StopChequeInputFragment();
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_ACCOUNT_NO_FROM", str);
        stopChequeInputFragment.setArguments(bundle);
        return stopChequeInputFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f90042131494231, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$CustomActionResultReceiver = getArguments().getString("EXTRA_ACCOUNT_NO_FROM");
        this.editTextChequeNo.setProxyLabel(getString(R.string.stop_cheque_input_label));
        this.editTextChequeNo.setProxyHint(getString(R.string.stop_cheque_input_hint));
        this.editTextChequeNo.setErrorInLine(R.string.incomplete_information);
        this.editTextChequeNo.setOnProxyNumberListener(this);
        this.editTextChequeNo.setOnFocusChangeListener(this);
        this.editTextChequeNo.setMaxLength(8);
        this.editTextChequeNo.write();
        this.editTextChequeNo.setOnPasteListener(new ScbEditText.IconCompatParcelizer());
        this.btnStopChequeReview.setEnabled(false);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("stopchq_input");
        }
        return inflate;
    }

    @OnClick
    public void onReviewButtonClick() {
        String obj = this.editTextChequeNo.proxyNumberField.getText().toString();
        this.editTextChequeNo.setFieldToOriginBackground();
        String string = getArguments().getString("EXTRA_ACCOUNT_NO_FROM", "");
        LinkedTreeMap.C35881 r2 = this.presenter;
        r2.read.MediaBrowserCompat$CustomActionResultReceiver(new enqueueNotification(string, obj));
        r2.read.IconCompatParcelizer(new LinkedTreeMap.C35881.read(string, obj));
    }

    public final void read(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        setuuidfromutf8bytes.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
        Intent intent = new Intent(getContext(), StopChequeReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
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

    public final void IconCompatParcelizer() {
        ((BaseActivity) getActivity()).PlaybackStateCompat$CustomAction();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ((BaseActivity) getActivity()).PlaybackStateCompat$CustomAction();
    }

    public final void write(String str) {
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.editTextChequeNo.setFieldToOriginBackground();
        if (str.length() == this.IconCompatParcelizer) {
            this.btnStopChequeReview.setEnabled(true);
        } else {
            this.btnStopChequeReview.setEnabled(false);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (z || this.MediaBrowserCompat$SearchResultReceiver.length() == this.IconCompatParcelizer) {
            this.editTextChequeNo.setFieldToOriginBackground();
            this.editTextChequeNo.setErrorValidationVisibility(8);
            return;
        }
        this.editTextChequeNo.setFieldToErrorRedBackground();
        this.editTextChequeNo.setErrorValidationVisibility(0);
    }
}
