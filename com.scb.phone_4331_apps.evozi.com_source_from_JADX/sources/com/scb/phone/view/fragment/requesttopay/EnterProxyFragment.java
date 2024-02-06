package com.scb.phone.view.fragment.requesttopay;

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
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.requesttopay.InputDetailsActivity;
import com.scb.phone.view.custom.common.CustomProxyNumber;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.ActivityBuilder_ContributePreregistrationLandingActivity;
import p040o.C4958mU;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.FragmentBuilder_BindChubbPaySuccessFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.animateCameraWithCallback;
import p040o.drainTo;
import p040o.eventFromJson;
import p040o.getOversizeImage;
import p040o.parseNdkPayload;
import p040o.removeDependent;
import p040o.removeIfFromRandomAccessList;
import p040o.setTapText;

public class EnterProxyFragment extends BaseFragment implements FragmentBuilder_BindChubbPaySuccessFragment, CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    @BindView
    DefaultButton buttonNext;
    @BindView
    protected CustomProxyNumber customProxyNumber;
    @HmlPinActivity
    public C4958mU presenter;

    public final void IconCompatParcelizer() {
    }

    public static EnterProxyFragment RatingCompat(String str) {
        EnterProxyFragment enterProxyFragment = new EnterProxyFragment();
        Bundle bundle = new Bundle();
        bundle.putString("source", str);
        enterProxyFragment.setArguments(bundle);
        return enterProxyFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89602131494187, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ActionBarContextView();
        ParcelableVolumeInfo(getString(R.string.request_new_request));
        this.customProxyNumber.setProxyLabel(getString(R.string.request_money_from));
        this.customProxyNumber.setProxyHint(getString(R.string.request_to_pay_input_hint));
        this.customProxyNumber.setProxyNumberFieldColor(R.color.f65322131099683);
        this.customProxyNumber.setOnProxyNumberListener(this);
        ActivityBuilder_ContributePreregistrationLandingActivity.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ActionBarContextView();
        ParcelableVolumeInfo(getString(R.string.request_new_request));
    }

    public final void IconCompatParcelizer(String str) {
        MediaMetadataCompat(str);
    }

    private void MediaMetadataCompat(String str) {
        if (removeIfFromRandomAccessList.MediaBrowserCompat$CustomActionResultReceiver(str)) {
            if (removeIfFromRandomAccessList.write(str)) {
                DefaultButton defaultButton = this.buttonNext;
                if (defaultButton != null) {
                    defaultButton.setButtonEnabled(true);
                }
                this.customProxyNumber.setErrorValidationVisibility(8);
                return;
            }
            this.customProxyNumber.setErrorInLine(R.string.error_prompt_pay_mobile_validation);
            this.customProxyNumber.setErrorValidationVisibility(0);
        } else if (!removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(str)) {
            this.customProxyNumber.setErrorInLine(R.string.error_prompt_pay_validation);
            this.customProxyNumber.setErrorValidationVisibility(0);
        } else if (removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(str)) {
            DefaultButton defaultButton2 = this.buttonNext;
            if (defaultButton2 != null) {
                defaultButton2.setButtonEnabled(true);
            }
            this.customProxyNumber.setErrorValidationVisibility(8);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        PlaybackStateCompat$CustomAction();
    }

    public final void MediaBrowserCompat$ItemReceiver(removeDependent removedependent) {
        animateCameraWithCallback animatecamerawithcallback = animateCameraWithCallback.MOB;
        if (removedependent instanceof parseNdkPayload) {
            animatecamerawithcallback = animateCameraWithCallback.CID;
        }
        eventFromJson eventfromjson = (eventFromJson) drainTo.IconCompatParcelizer(removedependent, animatecamerawithcallback);
        MediaMetadataCompat(eventfromjson.MediaBrowserCompat$ItemReceiver);
        if (removeIfFromRandomAccessList.write(eventfromjson.MediaBrowserCompat$ItemReceiver) || removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(eventfromjson.MediaBrowserCompat$ItemReceiver)) {
            Intent intent = new Intent(getContext(), InputDetailsActivity.class);
            intent.putExtra("EXTRA_PROXY_NUMBER", this.customProxyNumber.proxyNumberField.getText().toString());
            intent.putExtra("EXTRA_PROXY_NAME", this.customProxyNumber.write);
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

    public final void write(String str) {
        DefaultButton defaultButton;
        if (removeIfFromRandomAccessList.read(str) && (defaultButton = this.buttonNext) != null) {
            defaultButton.setButtonEnabled(true);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.customProxyNumber.MediaBrowserCompat$CustomActionResultReceiver(i, i2, intent);
    }

    @OnClick
    public void onReviewButtonClick() {
        MediaMetadataCompat(this.customProxyNumber.proxyNumberField.getText().toString());
        if (removeIfFromRandomAccessList.write(this.customProxyNumber.proxyNumberField.getText().toString()) || removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(this.customProxyNumber.proxyNumberField.getText().toString())) {
            Intent intent = new Intent(getContext(), InputDetailsActivity.class);
            intent.putExtra("source", AbsActionBarView());
            intent.putExtra("EXTRA_PROXY_NUMBER", this.customProxyNumber.proxyNumberField.getText().toString());
            intent.putExtra("EXTRA_PROXY_NAME", this.customProxyNumber.write);
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

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ActivityBuilder_ContributePreregistrationLandingActivity.write(this, i, iArr);
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.customProxyNumber.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void IconCompatParcelizer(int i, getOversizeImage getoversizeimage) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getString(i);
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).write(activity, R.id.enter_proxy_view_container, string, getoversizeimage);
            }
        }
    }

    public final void MediaMetadataCompat() {
        CustomProxyNumber customProxyNumber2 = this.customProxyNumber;
        if (customProxyNumber2 != null) {
            customProxyNumber2.setProxyNumber("");
        }
        DefaultButton defaultButton = this.buttonNext;
        if (defaultButton != null) {
            defaultButton.setEnabled(false);
        }
    }
}
