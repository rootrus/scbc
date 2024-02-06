package com.scb.phone.view.fragment.ndid;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import com.google.android.gms.location.places.PlacesStatusCodes;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.csent.SensitiveCSentActivity;
import com.scb.phone.view.activity.ndid.IdpLivenessCheckActivity;
import com.scb.phone.view.activity.ndid.IdpShareInformationActivity;
import com.scb.phone.view.activity.ntb.ReviewInfoResultActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.ActivityBuilder_ContributeFatcaActivity;
import p040o.ActivityBuilder_ContributeFatcaHelpActivity;
import p040o.ActivityBuilder_ContributeForgotPinOtpActivity;
import p040o.C7512tW;
import p040o.CrashlyticsReportJsonTransform$$Lambda$6;
import p040o.FragmentBuilder_BindDirectDebitInputMainFragment;
import p040o.HmlPinActivity;
import p040o.IVideoResourceProvider;
import p040o.MyECouponActivity_ViewBinding;
import p040o.exists;
import p040o.getAssetProvider;
import p040o.getDefaultNewRecordingFilePath;
import p040o.getKernelIDAdd;
import p040o.getStorageType;
import p040o.isVideoPlayerCameraSourceProvider;
import p040o.onCheckBoxClick;
import p040o.onDetachFromWindow;
import p040o.setLastBaselineToBottomHeight;
import p040o.setPreviewDisplay;
import p040o.setTapText;
import p040o.setupVideoParameters;

public class NdidIdpVerificationFragment extends BaseFragment implements C7512tW {
    private getKernelIDAdd IconCompatParcelizer = new getKernelIDAdd();
    @BindView
    TextView agreeTermsConditionTextView;
    @BindView
    TextView cancelNote;
    @BindView
    CheckBox consentCheckbox;
    @BindView
    Button getStartedButton;
    @HmlPinActivity
    public getAssetProvider presenter;
    @BindView
    TextView tvNoteTwo;

    public static NdidIdpVerificationFragment MediaBrowserCompat$ItemReceiver(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("com.scb.phone.EXTRA_REQUEST_MESSAGE", str);
        bundle.putString("com.scb.phone.EXTRA_REQUEST_ID", str2);
        bundle.putString("com.scb.phone.EXTRA_REQUEST_TIMEOUT", str3);
        NdidIdpVerificationFragment ndidIdpVerificationFragment = new NdidIdpVerificationFragment();
        ndidIdpVerificationFragment.setArguments(bundle);
        return ndidIdpVerificationFragment;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getKernelIDAdd getkernelidadd = this.IconCompatParcelizer;
        if (getActivity() != null) {
            getkernelidadd.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ndid_idp_verification_instructions");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88632131494090, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        if (getArguments() != null) {
            getAssetProvider getassetprovider = this.presenter;
            String string = getArguments().getString("com.scb.phone.EXTRA_REQUEST_MESSAGE");
            String string2 = getArguments().getString("com.scb.phone.EXTRA_REQUEST_ID");
            getStorageType getstoragetype = new getStorageType(string);
            if (getassetprovider.RatingCompat != null) {
                getstoragetype.IconCompatParcelizer(getassetprovider.RatingCompat);
            }
            setPreviewDisplay setpreviewdisplay = setPreviewDisplay.MediaBrowserCompat$ItemReceiver;
            if (getassetprovider.RatingCompat != null) {
                setpreviewdisplay.IconCompatParcelizer(getassetprovider.RatingCompat);
            }
            getassetprovider.MediaBrowserCompat$MediaItem = string2;
            this.tvNoteTwo.setText(getString(R.string.ndid_idp_verify_identity_note_two, getArguments().getString("com.scb.phone.EXTRA_REQUEST_TIMEOUT")));
        }
        this.cancelNote.setText(FragmentBuilder_BindDirectDebitInputMainFragment.MediaBrowserCompat$ItemReceiver(getResources(), getString(R.string.ndid_idp_verify_identity_note_three_clickable), getString(R.string.ndid_idp_verify_identity_note_three_not_clickable_start), getString(R.string.ndid_idp_verify_identity_note_three_not_clickable_end), false, 0, new ActivityBuilder_ContributeFatcaActivity(this), 112));
        this.cancelNote.setMovementMethod(LinkMovementMethod.getInstance());
        this.cancelNote.setHighlightColor(0);
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        String string = getString(R.string.ndid_select_idp_terms_cond_message_left);
        String string2 = getString(R.string.ndid_select_idp_terms_cond_message_clickable);
        String string3 = getString(R.string.ndid_select_idp_terms_cond_message_right);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(string2);
        sb.append(string3);
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new ClickableSpan() {
            public final void onClick(View view) {
                getAssetProvider getassetprovider = NdidIdpVerificationFragment.this.presenter;
                exists exists = exists.write;
                if (getassetprovider.RatingCompat != null) {
                    exists.IconCompatParcelizer(getassetprovider.RatingCompat);
                }
            }

            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(true);
                if (NdidIdpVerificationFragment.this.getContext() != null) {
                    textPaint.setColor(setLastBaselineToBottomHeight.read(NdidIdpVerificationFragment.this.getContext(), R.color.f67252131099881));
                }
            }
        }, string.length(), string.length() + string2.length(), 33);
        this.agreeTermsConditionTextView.setText(spannableString);
        this.agreeTermsConditionTextView.setMovementMethod(LinkMovementMethod.getInstance());
        this.agreeTermsConditionTextView.setHighlightColor(0);
    }

    public final void write() {
        try {
            Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("th".equals(setStackedBackground()) ? "https://info.scb.co.th/scbeasy/NDID/NDID_TC_thai.html" : "https://info.scb.co.th/scbeasy/NDID/NDID_TC_eng.html"));
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    data = setTapText.write(activity, data).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(data.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(data);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (ActivityNotFoundException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    public final void IconCompatParcelizer(String str) {
        this.consentCheckbox.setText(str);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.getStartedButton.setEnabled(z);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.ndid_idp_verify_identity_cancel_dialog_title).IconCompatParcelizer((int) R.string.ndid_idp_verify_identity_cancel_dialog_text);
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), ActivityBuilder_ContributeForgotPinOtpActivity.MediaBrowserCompat$ItemReceiver);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), new ActivityBuilder_ContributeFatcaHelpActivity(this)).show();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        getActivity().finish();
    }

    public final void read() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent MediaBrowserCompat$CustomActionResultReceiver = ReviewInfoResultActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), getString(R.string.ntb_fillinformation_review_info_result_title_page), getString(R.string.ntb_phone_not_supported_title), getString(R.string.mf_onboarding_eligibility_enquiry));
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    MediaBrowserCompat$CustomActionResultReceiver = setTapText.write(activity2, MediaBrowserCompat$CustomActionResultReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(MediaBrowserCompat$CustomActionResultReceiver);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            activity.finish();
        }
    }

    @OnClick
    public void onGetStartedButtonClick() {
        getAssetProvider getassetprovider = this.presenter;
        setupVideoParameters setupvideoparameters = new setupVideoParameters(getassetprovider);
        if (getassetprovider.RatingCompat != null) {
            setupvideoparameters.IconCompatParcelizer(getassetprovider.RatingCompat);
        }
    }

    public final void IconCompatParcelizer() {
        if (getContext() != null) {
            Intent read = SensitiveCSentActivity.read(getContext(), CrashlyticsReportJsonTransform$$Lambda$6.SENSITIVE_NDID_IDP);
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
                startActivityForResult(read, PlacesStatusCodes.USAGE_LIMIT_EXCEEDED);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void read(String str) {
        Intent IconCompatParcelizer2 = IdpLivenessCheckActivity.IconCompatParcelizer(getContext(), str);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(IconCompatParcelizer2, 1003);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (!(str == null || str.length() == 0)) {
                Intent MediaBrowserCompat$ItemReceiver = IdpShareInformationActivity.MediaBrowserCompat$ItemReceiver(activity, str);
                IntentTidInjectionContextAspect.aspectOf();
                try {
                    Intent read = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
                    MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                    sb.append(read.getData());
                    sb.append("\n with context ");
                    sb.append(activity.hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                    activity.startActivity(read);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @OnCheckedChanged
    public void onConsentChecked(boolean z) {
        getAssetProvider getassetprovider = this.presenter;
        getassetprovider.IconCompatParcelizer = z;
        getDefaultNewRecordingFilePath getdefaultnewrecordingfilepath = new getDefaultNewRecordingFilePath(getassetprovider, z);
        if (getassetprovider.RatingCompat != null) {
            getdefaultnewrecordingfilepath.IconCompatParcelizer(getassetprovider.RatingCompat);
        }
    }

    @OnCheckedChanged
    public void onTermsCondChecked(boolean z) {
        getAssetProvider getassetprovider = this.presenter;
        getassetprovider.write = z;
        IVideoResourceProvider iVideoResourceProvider = new IVideoResourceProvider(getassetprovider, z);
        if (getassetprovider.RatingCompat != null) {
            iVideoResourceProvider.IconCompatParcelizer(getassetprovider.RatingCompat);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (-1 == i2) {
            boolean z = true;
            if (i == 1003) {
                getAssetProvider getassetprovider = this.presenter;
                onDetachFromWindow ondetachfromwindow = new onDetachFromWindow(getassetprovider);
                if (getassetprovider.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    ondetachfromwindow.IconCompatParcelizer(getassetprovider.RatingCompat);
                }
            } else if (i == 9001) {
                getAssetProvider getassetprovider2 = this.presenter;
                isVideoPlayerCameraSourceProvider isvideoplayercamerasourceprovider = new isVideoPlayerCameraSourceProvider(getassetprovider2);
                if (getassetprovider2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    isvideoplayercamerasourceprovider.IconCompatParcelizer(getassetprovider2.RatingCompat);
                }
            }
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
