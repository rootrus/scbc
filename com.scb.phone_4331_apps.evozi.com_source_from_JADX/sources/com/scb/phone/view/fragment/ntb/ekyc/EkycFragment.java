package com.scb.phone.view.fragment.ntb.ekyc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ntb.ReviewInfoResultActivity;
import com.scb.phone.view.activity.ntb.ekyc.NationalIdActivity;
import com.scb.phone.view.activity.partner.PartnerLandingActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.net.URISyntaxException;
import java.security.Security;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p039io.beid.beidk.BEIDConfigurationFactory;
import p039io.beid.beidk.PassportManager;
import p039io.beid.beidk.definitions.BeIDParams;
import p039io.beid.beidk.definitions.SCBHeader;
import p039io.beid.beidk.parcelable.PassportDataParcelable;
import p039io.beid.beidk.processor.FaceProcessor;
import p040o.ActivityBuilder_ContributeHmlDocumentSubmissionActivity;
import p040o.ActivityBuilder_ContributeHmlDocumentSubmissionTutorialsActivity;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_FilesPayload;
import p040o.Barcode;
import p040o.C4180ch;
import p040o.CheckExtractor;
import p040o.CustomConcurrentHashMap;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.FragmentBuilder_BindCreditCardReviewFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.TileAdapter;
import p040o.blend;
import p040o.ch$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getIdParameters;
import p040o.onCheckBoxClick;
import p040o.setFilename;
import p040o.setTapText;

public class EkycFragment extends BaseFragment implements CheckExtractor.C63961 {
    private FragmentBuilder_BindChangeChannelStatementReviewFragment.IconCompatParcelizer IconCompatParcelizer;
    private blend MediaBrowserCompat$CustomActionResultReceiver = new blend();
    @BindView
    protected Button buttonNext;
    @HmlPinActivity
    public C4180ch ekycPresenter;
    @BindView
    protected ImageView livenessCheckedIcon;
    @BindView
    protected ImageView livenessIcon;
    @BindView
    protected ImageView livenessIndicator;
    @BindView
    protected TextView livenessText;
    @BindView
    protected ImageView scanIdCheckedIcon;
    @BindView
    protected ImageView scanIdIcon;
    @BindView
    protected ImageView scanIdIndicator;
    @BindView
    protected TextView scanIdText;
    @BindView
    protected ImageView scanPassportCheckedIcon;
    @BindView
    protected ImageView scanPassportIcon;
    @BindView
    protected ImageView scanPassportIndicator;
    @BindView
    protected TextView scanPassportText;

    /* access modifiers changed from: protected */
    public int IconCompatParcelizer() {
        return R.string.ntb_pop_up_message_exit;
    }

    /* access modifiers changed from: protected */
    public String RatingCompat() {
        return "open_account";
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindChangeChannelStatementReviewFragment.IconCompatParcelizer) {
            this.IconCompatParcelizer = (FragmentBuilder_BindChangeChannelStatementReviewFragment.IconCompatParcelizer) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87272131493954, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.IconCompatParcelizer.AppCompatDelegateImpl$ListMenuDecorView();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(BeIDParams.BEID_TRANSACTION_ID) : "";
        this.ekycPresenter.MediaBrowserCompat$ItemReceiver(this);
        C4180ch chVar = this.ekycPresenter;
        String string2 = getString(R.string.ekyc_next_button_text);
        String string3 = getString(R.string.ekyc_submit_button_text);
        chVar.MediaBrowserCompat$MediaItem = string2;
        chVar.f2805x50fd9e4a = string3;
        C4180ch chVar2 = this.ekycPresenter;
        chVar2.ParcelableVolumeInfo = string;
        Barcode.Sms sms = chVar2.MediaDescriptionCompat;
        PartnerLandingActivity.write MediaBrowserCompat$SearchResultReceiver = sms.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver();
        MediaBrowserCompat$SearchResultReceiver.write = sms.read.setCheckable();
        chVar2.MediaMetadataCompat = MediaBrowserCompat$SearchResultReceiver;
        getIdParameters getidparameters = new getIdParameters(chVar2);
        if (chVar2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getidparameters.IconCompatParcelizer(chVar2.RatingCompat);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.read("feature", RatingCompat());
        blend blend = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            blend.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_landing");
        }
        return inflate;
    }

    @OnClick
    public void onNextButtonClick() {
        this.ekycPresenter.write(CustomConcurrentHashMap.StrongExpirableEvictableEntry.DEFAULT);
    }

    public final void write(String str, PartnerLandingActivity.write write) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(BeIDParams.BEID_BASE_URL, write.read);
            hashMap.put(BeIDParams.BEID_TRANSACTION_ID, str);
            hashMap.put(SCBHeader.SCB_REQ_HEADER_API_AUTH, write.IconCompatParcelizer);
            hashMap.put(SCBHeader.SCB_REQ_HEADER_ACCEPT_LANGUAGE, write.write);
            hashMap.put(SCBHeader.SCB_REQ_HEADER_SESSION_ID, write.MediaBrowserCompat$CustomActionResultReceiver);
            BEIDConfigurationFactory.Builder Builder = BEIDConfigurationFactory.Builder();
            Builder.setBaseUrl(write.read).setUseSSL(Boolean.valueOf(write.RatingCompat)).setSSLPublicKey(write.MediaBrowserCompat$ItemReceiver).setApiTimeOut(30000).setUserAgent(AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver());
            this.MediaBrowserCompat$CustomActionResultReceiver.read("feature", RatingCompat());
            blend blend = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (getActivity() != null) {
                blend.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_passport");
            }
            Security.insertProviderAt(new TileAdapter.StaticShortcutHolder(), 1);
            PassportManager.startPassportScanner((Activity) getActivity(), 1, (Map<String, String>) hashMap, Builder);
        } catch (URISyntaxException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent(getActivity(), NationalIdActivity.class);
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
            startActivityForResult(intent, 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(ch$MediaBrowserCompat$CustomActionResultReceiver ch_mediabrowsercompat_customactionresultreceiver) {
        String str;
        float f = 1.0f;
        this.scanIdText.setAlpha(ch_mediabrowsercompat_customactionresultreceiver == ch$MediaBrowserCompat$CustomActionResultReceiver.SCANNING_ID_STATE ? 1.0f : 0.4f);
        this.scanPassportText.setAlpha(ch_mediabrowsercompat_customactionresultreceiver == ch$MediaBrowserCompat$CustomActionResultReceiver.SCANNING_PASSPORT_STATE ? 1.0f : 0.4f);
        this.livenessText.setAlpha(ch_mediabrowsercompat_customactionresultreceiver == ch$MediaBrowserCompat$CustomActionResultReceiver.LIVENESS_CHECK_STATE ? 1.0f : 0.4f);
        this.scanIdIcon.setAlpha(ch_mediabrowsercompat_customactionresultreceiver == ch$MediaBrowserCompat$CustomActionResultReceiver.SCANNING_ID_STATE ? 1.0f : 0.4f);
        this.scanPassportIcon.setAlpha((ch_mediabrowsercompat_customactionresultreceiver == ch$MediaBrowserCompat$CustomActionResultReceiver.SCANNING_PASSPORT_STATE || ch_mediabrowsercompat_customactionresultreceiver == ch$MediaBrowserCompat$CustomActionResultReceiver.SCANNING_ID_STATE) ? 1.0f : 0.4f);
        ImageView imageView = this.livenessIcon;
        if (ch_mediabrowsercompat_customactionresultreceiver == ch$MediaBrowserCompat$CustomActionResultReceiver.FINISHED_FLOW_STATE) {
            f = 0.4f;
        }
        imageView.setAlpha(f);
        ImageView imageView2 = this.scanIdIndicator;
        ch$MediaBrowserCompat$CustomActionResultReceiver ch_mediabrowsercompat_customactionresultreceiver2 = ch$MediaBrowserCompat$CustomActionResultReceiver.SCANNING_ID_STATE;
        int i = R.drawable.circle_indicator_purple;
        imageView2.setImageResource(ch_mediabrowsercompat_customactionresultreceiver == ch_mediabrowsercompat_customactionresultreceiver2 ? R.drawable.circle_indicator_purple : R.drawable.shape_circle_white_purple_border);
        this.scanPassportIndicator.setImageResource(ch_mediabrowsercompat_customactionresultreceiver == ch$MediaBrowserCompat$CustomActionResultReceiver.SCANNING_PASSPORT_STATE ? R.drawable.circle_indicator_purple : R.drawable.shape_circle_white_purple_border);
        ImageView imageView3 = this.livenessIndicator;
        if (ch_mediabrowsercompat_customactionresultreceiver != ch$MediaBrowserCompat$CustomActionResultReceiver.LIVENESS_CHECK_STATE) {
            i = R.drawable.shape_circle_white_purple_border;
        }
        imageView3.setImageResource(i);
        int i2 = 0;
        this.scanIdCheckedIcon.setVisibility(ch_mediabrowsercompat_customactionresultreceiver != ch$MediaBrowserCompat$CustomActionResultReceiver.SCANNING_ID_STATE ? 0 : 8);
        this.scanPassportCheckedIcon.setVisibility((ch_mediabrowsercompat_customactionresultreceiver == ch$MediaBrowserCompat$CustomActionResultReceiver.SCANNING_PASSPORT_STATE || ch_mediabrowsercompat_customactionresultreceiver == ch$MediaBrowserCompat$CustomActionResultReceiver.SCANNING_ID_STATE) ? 8 : 0);
        ImageView imageView4 = this.livenessCheckedIcon;
        if (ch_mediabrowsercompat_customactionresultreceiver != ch$MediaBrowserCompat$CustomActionResultReceiver.FINISHED_FLOW_STATE) {
            i2 = 8;
        }
        imageView4.setVisibility(i2);
        Button button = this.buttonNext;
        if (ch_mediabrowsercompat_customactionresultreceiver == ch$MediaBrowserCompat$CustomActionResultReceiver.FINISHED_FLOW_STATE) {
            str = this.ekycPresenter.f2805x50fd9e4a;
        } else {
            str = this.ekycPresenter.MediaBrowserCompat$MediaItem;
        }
        button.setText(str);
    }

    public final void read() {
        blend blend = new blend();
        blend.read("ekyc");
        blend.read("feature", RatingCompat());
        if (getActivity() != null) {
            blend.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_verifysuccess");
        }
        this.IconCompatParcelizer.setContentView();
    }

    public final void read(String str, String str2, String str3, String str4, PartnerLandingActivity.write write, AutoValue_CrashlyticsReport_FilesPayload autoValue_CrashlyticsReport_FilesPayload) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(SCBHeader.SCB_REQ_HEADER_API_AUTH, write.IconCompatParcelizer);
            hashMap.put(SCBHeader.SCB_REQ_HEADER_ACCEPT_LANGUAGE, write.write);
            hashMap.put(SCBHeader.SCB_REQ_HEADER_SESSION_ID, write.MediaBrowserCompat$CustomActionResultReceiver);
            List<Integer> list = autoValue_CrashlyticsReport_FilesPayload.read;
            int i = autoValue_CrashlyticsReport_FilesPayload.MediaBrowserCompat$ItemReceiver;
            BEIDConfigurationFactory.Builder Builder = BEIDConfigurationFactory.Builder();
            Builder.setBaseUrl(write.read).setUseSSL(Boolean.valueOf(write.RatingCompat)).setSSLPublicKey(write.MediaBrowserCompat$ItemReceiver).setApiTimeOut(30000).setUserAgent(AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver());
            FaceProcessor.FaceProcessorParameterBuilder Builder2 = FaceProcessor.FaceProcessorParameter.Builder();
            Builder2.setTransactionId(str4).setUrlServer(write.read).setFirstName(str).setLastName(str2).setDateOfBirth(str3).setJpegQuality(80).setIsIncludeImage(Boolean.TRUE).setIsIncludeVoice(Boolean.FALSE).setLivenessActivities(list).setLivenessAcceptance(Integer.valueOf(i)).setParams(hashMap).setLanguage(write.write).setConfig(Builder);
            this.MediaBrowserCompat$CustomActionResultReceiver.read("feature", RatingCompat());
            blend blend = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (getActivity() != null) {
                blend.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_selfie");
            }
            FaceProcessor.startActivityForResult((Activity) getActivity(), Builder2);
        } catch (URISyntaxException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    public final void write() {
        setFilename setfilename = new setFilename();
        setfilename.MediaDescriptionCompat = R.drawable.ic_notice;
        setfilename.MediaBrowserCompat$SearchResultReceiver = getString(R.string.ntb_ekyc_title);
        setfilename.MediaMetadataCompat = getString(R.string.error_default_title);
        setfilename.IconCompatParcelizer = getString(R.string.ekyc_user_exists_description);
        setfilename.MediaBrowserCompat$CustomActionResultReceiver = getString(R.string.ekyc_register_scb_easy_app);
        setfilename.write = new FragmentBuilder_BindCreditCardReviewFragment();
        setfilename.MediaBrowserCompat$ItemReceiver = false;
        Intent MediaBrowserCompat$ItemReceiver = ReviewInfoResultActivity.MediaBrowserCompat$ItemReceiver(getContext(), setfilename);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$ItemReceiver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        getActivity().finish();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent(getActivity(), ReviewInfoResultActivity.class);
        intent.putExtra("EXTRA_IMAGE_ID", R.drawable.ic_notice);
        intent.putExtra("EXTRA_PAGE_TITLE", getString(R.string.ntb_ekyc_title));
        intent.putExtra("EXTRA_TITLE", getString(R.string.error_default_title));
        intent.putExtra("EXTRA_DESCRIPTION", getString(R.string.error_ekyc_passport_1004_text));
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
        getActivity().finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 2) {
            AutoValue_CrashlyticsReport_FilesPayload.Builder builder = (AutoValue_CrashlyticsReport_FilesPayload.Builder) intent.getParcelableExtra("idDisplay");
            C4180ch chVar = this.ekycPresenter;
            if (builder != null) {
                chVar.MediaBrowserCompat$ItemReceiver = ch$MediaBrowserCompat$CustomActionResultReceiver.SCANNING_PASSPORT_STATE;
                getIdParameters getidparameters = new getIdParameters(chVar);
                if (chVar.RatingCompat != null) {
                    getidparameters.IconCompatParcelizer(chVar.RatingCompat);
                }
            }
        }
    }

    public final void read(Intent intent) {
        try {
            FaceProcessor.FaceProcessorResult parse = FaceProcessor.FaceProcessorResult.parse(intent);
            if (parse.getResponseStatus().equals("error")) {
                StringBuilder sb = new StringBuilder();
                sb.append(parse.getErrorCode());
                sb.append(" - ");
                sb.append(parse.getErrorText());
                Log.e("Liveness", sb.toString());
                this.ekycPresenter.IconCompatParcelizer(parse.getErrorCode());
                return;
            }
            C4180ch chVar = this.ekycPresenter;
            chVar.MediaBrowserCompat$ItemReceiver = ch$MediaBrowserCompat$CustomActionResultReceiver.FINISHED_FLOW_STATE;
            getIdParameters getidparameters = new getIdParameters(chVar);
            if (chVar.RatingCompat != null) {
                getidparameters.IconCompatParcelizer(chVar.RatingCompat);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e);
            Log.e("EkycFragment", sb2.toString());
            this.ekycPresenter.IconCompatParcelizer("");
        }
    }

    public final void write(Intent intent) {
        Integer valueOf = Integer.valueOf(intent.getIntExtra(PassportManager.KEY_PASSPORT_EXIT_CODE, -1));
        PassportDataParcelable passportDataParcelable = (PassportDataParcelable) intent.getParcelableExtra(PassportManager.KEY_PASSPORT_DATA);
        boolean z = true;
        if (valueOf.intValue() == 0) {
            if ("pass".equals(passportDataParcelable.result)) {
                C4180ch chVar = this.ekycPresenter;
                String str = passportDataParcelable.firstNameEng;
                String str2 = passportDataParcelable.lastNameEng;
                Date date = passportDataParcelable.dateOfBirth;
                chVar.read = str;
                chVar.MediaBrowserCompat$SearchResultReceiver = str2;
                chVar.write = date;
                chVar.MediaBrowserCompat$ItemReceiver = ch$MediaBrowserCompat$CustomActionResultReceiver.LIVENESS_CHECK_STATE;
                getIdParameters getidparameters = new getIdParameters(chVar);
                if (chVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getidparameters.IconCompatParcelizer(chVar.RatingCompat);
                    return;
                }
                return;
            }
            this.ekycPresenter.IconCompatParcelizer(passportDataParcelable.errorCode);
        } else if (valueOf.intValue() == 2) {
            this.ekycPresenter.IconCompatParcelizer(passportDataParcelable.errorCode);
        } else if (valueOf.intValue() == 1) {
            this.ekycPresenter.IconCompatParcelizer(passportDataParcelable.errorCode);
        }
    }

    public final void MediaMetadataCompat() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.ntb_pop_up_title_exit).IconCompatParcelizer(IconCompatParcelizer());
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), ActivityBuilder_ContributeHmlDocumentSubmissionActivity.IconCompatParcelizer);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), new ActivityBuilder_ContributeHmlDocumentSubmissionTutorialsActivity(this)).show();
    }

    public void onResume() {
        super.onResume();
        this.ekycPresenter.IconCompatParcelizer = Boolean.TRUE;
    }
}
