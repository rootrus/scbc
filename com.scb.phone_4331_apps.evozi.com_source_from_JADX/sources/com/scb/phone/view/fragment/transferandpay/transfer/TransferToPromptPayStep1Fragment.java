package com.scb.phone.view.fragment.transferandpay.transfer;

import android.content.Intent;
import android.net.Uri;
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
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomProxyNumber;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.ScbEditText;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.BillWorkflowActivity;
import p040o.FragmentBuilder_BindAdditionDocumentScbAccountFragment;
import p040o.FragmentBuilder_BindAmortizationTotalAmountTabFragment;
import p040o.FragmentBuilder_BindBaseAddressFragment;
import p040o.FragmentBuilder_BindChubbPaySuccessFragment;
import p040o.HistoryAdapter$GroupFooterViewHolder_ViewBinding;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.animateCameraWithCallback;
import p040o.drainTo;
import p040o.eventFromJson;
import p040o.getICheckDeserializerRtti;
import p040o.getOversizeImage;
import p040o.getTopLeftCornerWidth;
import p040o.injectProcessingParameters;
import p040o.inject_jsonExactionHelper;
import p040o.parseNdkPayload;
import p040o.removeDependent;
import p040o.removeIfFromRandomAccessList;
import p040o.reportFromJson;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public class TransferToPromptPayStep1Fragment extends BaseFragment implements getTopLeftCornerWidth.setContentHeight, FragmentBuilder_BindChubbPaySuccessFragment {
    @BindView
    public DefaultButton mContinueButton;
    @BindView
    public CustomProxyNumber mCustomProxyNumber;
    @HmlPinActivity
    public inject_jsonExactionHelper presenter;

    public static TransferToPromptPayStep1Fragment MediaDescriptionCompat() {
        Bundle bundle = new Bundle();
        TransferToPromptPayStep1Fragment transferToPromptPayStep1Fragment = new TransferToPromptPayStep1Fragment();
        transferToPromptPayStep1Fragment.setArguments(bundle);
        return transferToPromptPayStep1Fragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f90302131494257, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        inject_jsonExactionHelper inject_jsonexactionhelper = this.presenter;
        if (inject_jsonexactionhelper.MediaBrowserCompat$ItemReceiver != null) {
            boolean z = true;
            if (animateCameraWithCallback.MOB.name().equals(inject_jsonexactionhelper.MediaBrowserCompat$ItemReceiver.setBackgroundResource)) {
                injectProcessingParameters injectprocessingparameters = new injectProcessingParameters(inject_jsonexactionhelper);
                if (inject_jsonexactionhelper.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    injectprocessingparameters.IconCompatParcelizer(inject_jsonexactionhelper.RatingCompat);
                }
            } else if (animateCameraWithCallback.CID.name().equals(inject_jsonexactionhelper.MediaBrowserCompat$ItemReceiver.setBackgroundResource)) {
                BillWorkflowActivity.C63361 r0 = new writeUInt64NoTag.IconCompatParcelizer() {
                    public final void IconCompatParcelizer(Object obj) {
                        inject_jsonExactionHelper inject_jsonexactionhelper = inject_jsonExactionHelper.this;
                        parseNdkPayload parsendkpayload = new parseNdkPayload();
                        parsendkpayload.MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.IconCompatParcelizer(false, false, inject_jsonexactionhelper.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
                        ((getTopLeftCornerWidth.setContentHeight) obj).mo40040a_(parsendkpayload);
                    }
                };
                if (inject_jsonexactionhelper.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    r0.IconCompatParcelizer(inject_jsonexactionhelper.RatingCompat);
                }
            }
        }
        DefaultButton defaultButton = this.mContinueButton;
        if (defaultButton != null) {
            defaultButton.setVisibility(0);
        }
        this.mCustomProxyNumber.setProxyLabel(getString(R.string.transfer_prompt_pay_input_text));
        this.mCustomProxyNumber.setProxyHint(getString(R.string.transfer_prompt_pay_input_hint));
        this.mCustomProxyNumber.setOnProxyNumberListener(this);
        this.mCustomProxyNumber.setOnPasteListener(new ScbEditText.IconCompatParcelizer());
        setUserVisibleHint(false);
        FragmentBuilder_BindBaseAddressFragment.IconCompatParcelizer(this);
        return inflate;
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (getActivity() == null) {
            return;
        }
        if (z) {
            FragmentBuilder_BindBaseAddressFragment.IconCompatParcelizer(this);
        } else {
            PlaybackStateCompat$CustomAction();
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.mCustomProxyNumber.MediaBrowserCompat$CustomActionResultReceiver(i, i2, intent);
    }

    @OnClick
    public void onContactsButtonClick() {
        Intent intent = new Intent("android.intent.action.PICK", Uri.parse("content://contacts"));
        intent.setType("vnd.android.cursor.dir/phone_v2");
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
            startActivityForResult(intent, 347);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a_ */
    public final void mo40040a_(removeDependent removedependent) {
        if (removedependent instanceof reportFromJson) {
            read(removedependent, animateCameraWithCallback.MOB, true);
        } else if (removedependent instanceof parseNdkPayload) {
            read(removedependent, animateCameraWithCallback.CID, true);
        }
    }

    public final void read(boolean z) {
        DefaultButton defaultButton = this.mContinueButton;
        if (defaultButton != null) {
            defaultButton.setButtonEnabled(z);
        }
    }

    private void read(String str) {
        if (removeIfFromRandomAccessList.MediaBrowserCompat$CustomActionResultReceiver(str)) {
            if (removeIfFromRandomAccessList.write(str)) {
                DefaultButton defaultButton = this.mContinueButton;
                if (defaultButton != null) {
                    defaultButton.setButtonEnabled(true);
                }
                this.mCustomProxyNumber.setErrorValidationVisibility(8);
                return;
            }
            this.mCustomProxyNumber.setErrorInLine(R.string.error_prompt_pay_mobile_validation);
            this.mCustomProxyNumber.setErrorValidationVisibility(0);
        } else if (!removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(str)) {
            this.mCustomProxyNumber.setErrorInLine(R.string.error_prompt_pay_validation);
            this.mCustomProxyNumber.setErrorValidationVisibility(0);
        } else if (removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(str)) {
            this.mCustomProxyNumber.setErrorValidationVisibility(8);
            DefaultButton defaultButton2 = this.mContinueButton;
            if (defaultButton2 != null) {
                defaultButton2.setButtonEnabled(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void MediaDescriptionCompat(String str) {
        if (removeIfFromRandomAccessList.write(str)) {
            String IconCompatParcelizer = getICheckDeserializerRtti.IconCompatParcelizer(false, true, str);
            reportFromJson reportfromjson = new reportFromJson();
            reportfromjson.MediaBrowserCompat$CustomActionResultReceiver = "";
            reportfromjson.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
            read(reportfromjson, animateCameraWithCallback.MOB, false);
        } else if (removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(str)) {
            String IconCompatParcelizer2 = getICheckDeserializerRtti.IconCompatParcelizer(false, false, str);
            parseNdkPayload parsendkpayload = new parseNdkPayload();
            parsendkpayload.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
            read(parsendkpayload, animateCameraWithCallback.CID, false);
        }
    }

    public void IconCompatParcelizer(String str) {
        read(str);
    }

    public final void IconCompatParcelizer() {
        PlaybackStateCompat$CustomAction();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        PlaybackStateCompat$CustomAction();
    }

    public void MediaBrowserCompat$ItemReceiver(removeDependent removedependent) {
        read(removedependent, removedependent instanceof parseNdkPayload ? animateCameraWithCallback.CID : animateCameraWithCallback.MOB, false);
    }

    public void write(String str) {
        DefaultButton defaultButton;
        if (removeIfFromRandomAccessList.read(str) && (defaultButton = this.mContinueButton) != null) {
            defaultButton.setButtonEnabled(true);
        }
    }

    public void aO_() {
        this.mCustomProxyNumber.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public void read(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        if (getUserVisibleHint()) {
            CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_read_contacts_title).IconCompatParcelizer((int) R.string.permission_read_contacts);
            CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.permission_allow), new FragmentBuilder_BindAmortizationTotalAmountTabFragment(historyAdapter$GroupFooterViewHolder_ViewBinding));
            IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.permission_deny), new FragmentBuilder_BindAdditionDocumentScbAccountFragment(historyAdapter$GroupFooterViewHolder_ViewBinding)).show();
        }
    }

    public void MediaBrowserCompat$SearchResultReceiver() {
        if (getUserVisibleHint()) {
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                String string = getString(R.string.permission_read_contacts_denied);
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).write(activity, R.id.view_group_root, string, getoversizeimage);
                }
            }
        }
    }

    public void RatingCompat() {
        if (getUserVisibleHint()) {
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                String string = getString(R.string.permission_read_contacts_never_ask_again);
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).write(activity, R.id.view_group_root, string, getoversizeimage);
                }
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        FragmentBuilder_BindBaseAddressFragment.MediaBrowserCompat$CustomActionResultReceiver(this, i, iArr);
    }

    @OnClick
    public void onNextButtonClick() {
        String obj = this.mCustomProxyNumber.proxyNumberField.getText().toString();
        read(obj);
        if (removeIfFromRandomAccessList.write(obj) || removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(obj)) {
            MediaDescriptionCompat(obj);
        }
    }

    private void read(removeDependent removedependent, animateCameraWithCallback animatecamerawithcallback, boolean z) {
        Intent intent;
        eventFromJson eventfromjson = (eventFromJson) drainTo.IconCompatParcelizer(removedependent, animatecamerawithcallback);
        read(eventfromjson.MediaBrowserCompat$ItemReceiver);
        String obj = this.mCustomProxyNumber.proxyNumberField.getText().toString();
        if ((removeIfFromRandomAccessList.write(obj) || removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(obj)) || z) {
            if (z) {
                intent = new Intent("com.scb.phone/BROADCAST_TRANSFER_NEXT_FAVOURITE_STEP");
            } else {
                intent = new Intent("com.scb.phone/BROADCAST_TRANSFER_NEXT_STEP");
            }
            intent.putExtra("com.scb.phone.EXTRA_TRANSFER_TARGET_DATA", eventfromjson);
            getContext().sendBroadcast(intent);
        }
    }
}
