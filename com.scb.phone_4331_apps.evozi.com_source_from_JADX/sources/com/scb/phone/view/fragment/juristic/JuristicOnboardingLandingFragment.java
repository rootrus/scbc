package com.scb.phone.view.fragment.juristic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.juristic.JuristicBusinessPinActivity;
import com.scb.phone.view.activity.juristic.JuristicOtpActivity;
import com.scb.phone.view.custom.common.ClearableEditText;
import com.scb.phone.view.custom.common.ClearableEditText$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.custom.common.ClearableOutLineEditText;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C7134hH;
import p040o.CheckEligibilityActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.DocumentBaseOverlayView;
import p040o.DocumentBaseOverlayView$MediaBrowserCompat$SearchResultReceiver;
import p040o.DocumentBaseOverlayView_MembersInjector;
import p040o.FundActionsSuccessActivity;
import p040o.GoodToKnowActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Utils;
import p040o.ZTBSV;
import p040o.forEachDstIn;
import p040o.getOversizeImage;
import p040o.getPlaceIds;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.toLowerCase;
import p040o.writeUInt64NoTag;

public final class JuristicOnboardingLandingFragment extends BaseFragment implements C7134hH {
    public static final C6068xd559db9c IconCompatParcelizer = new C6068xd559db9c((byte) 0);
    private final HmlVerifyEmailActivity MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public Utils.C39323.C12941 MediaBrowserCompat$MediaItem;
    private final View.OnClickListener MediaBrowserCompat$SearchResultReceiver = new C6069x13fedb6b(this);
    private final View.OnClickListener MediaDescriptionCompat = new IconCompatParcelizer(this);
    @BindView
    public ImageView backButton;
    @BindView
    public Button buttonNext;
    @BindView
    public ClearableOutLineEditText editTextPin;
    @BindView
    public ClearableOutLineEditText editTextRegistrationNo;
    @HmlPinActivity
    public DocumentBaseOverlayView presenter;
    @BindView
    public TextView tvRefId;
    @BindView
    public TextView tvRemark;
    @BindView
    public TextView tvResendPin;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public JuristicOnboardingLandingFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = read.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$CustomActionResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f88202131494047, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        DocumentBaseOverlayView documentBaseOverlayView = this.presenter;
        if (documentBaseOverlayView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        documentBaseOverlayView.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Button button = this.buttonNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonNext");
        }
        boolean z = false;
        button.setEnabled(false);
        Bundle arguments = getArguments();
        Utils.C39323.C12941 r12 = arguments != null ? (Utils.C39323.C12941) arguments.getParcelable("STATE_DISPLAY") : null;
        this.MediaBrowserCompat$MediaItem = r12;
        if (r12 != null) {
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) r12.write, (Object) "PRE_REGISTERED")) {
                if ((!GoodToKnowActivity.read(r12.read)) && (!GoodToKnowActivity.read(r12.MediaBrowserCompat$CustomActionResultReceiver))) {
                    DocumentBaseOverlayView documentBaseOverlayView = this.presenter;
                    if (documentBaseOverlayView == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                    }
                    String str = r12.read;
                    onGetStartedClick.write((Object) str, "mobileNo");
                    documentBaseOverlayView.MediaBrowserCompat$ItemReceiver = SystemClock.elapsedRealtime();
                    onGetStartedClick.write((Object) str, "mobileNo");
                    writeUInt64NoTag.IconCompatParcelizer ratingCompat = new DocumentBaseOverlayView.RatingCompat(documentBaseOverlayView, str);
                    if (documentBaseOverlayView.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        ratingCompat.IconCompatParcelizer(documentBaseOverlayView.RatingCompat);
                    }
                }
                write(r12.MediaBrowserCompat$CustomActionResultReceiver);
                ClearableOutLineEditText clearableOutLineEditText = this.editTextPin;
                if (clearableOutLineEditText == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextPin");
                }
                clearableOutLineEditText.setHint(getString(R.string.juristic_hint_starting_pin));
                ClearableOutLineEditText clearableOutLineEditText2 = this.editTextPin;
                if (clearableOutLineEditText2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextPin");
                }
                getResources();
                clearableOutLineEditText2.setMaxLength(6);
                TextView textView = this.tvRemark;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
                }
                textView.setVisibility(8);
                TextView textView2 = this.tvResendPin;
                if (textView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvResendPin");
                }
                textView2.setOnClickListener(new write(this));
            } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) r12.write, (Object) "DEVICE_NOT_REGISTERED")) {
                CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext());
                onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "CustomDialog.create(context)");
                IconCompatParcelizer2.setCancelable(false);
                CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.IconCompatParcelizer(getString(R.string.juristic_unlink_device_title)).MediaBrowserCompat$ItemReceiver(getString(R.string.juristic_unlink_device_message));
                CustomDialog MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver.read.getString(R.string.juristic_unlink_device_negative_button), new C6071xdb791d0c(this));
                MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2.read.getString(R.string.juristic_unlink_device_positive_button), JuristicOnboardingLandingFragment$MediaSessionCompat$Token.read).show();
                TextView textView3 = this.tvRefId;
                if (textView3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRefId");
                }
                textView3.setVisibility(8);
                ClearableOutLineEditText clearableOutLineEditText3 = this.editTextPin;
                if (clearableOutLineEditText3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextPin");
                }
                clearableOutLineEditText3.setHint(getString(R.string.juristic_hint_account_no));
                ClearableOutLineEditText clearableOutLineEditText4 = this.editTextPin;
                if (clearableOutLineEditText4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextPin");
                }
                getResources();
                clearableOutLineEditText4.setMaxLength(10);
                TextView textView4 = this.tvRemark;
                if (textView4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
                }
                textView4.setText(getString(R.string.juristic_business_remark_description));
                TextView textView5 = this.tvResendPin;
                if (textView5 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvResendPin");
                }
                textView5.setVisibility(8);
            }
            forEachDstIn.read read2 = forEachDstIn.write;
            ((forEachDstIn) this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).read("user_state", forEachDstIn.read.read(r12.write));
            ZTBSV ztbsv = (forEachDstIn) this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            if (getActivity() != null) {
                ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "juristic_onboarding_landing");
            }
        }
        ClearableOutLineEditText clearableOutLineEditText5 = this.editTextRegistrationNo;
        if (clearableOutLineEditText5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextRegistrationNo");
        }
        clearableOutLineEditText5.setValidateInputListener(new C6070xa4b3513d(this));
        ClearableOutLineEditText clearableOutLineEditText6 = this.editTextRegistrationNo;
        if (clearableOutLineEditText6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextRegistrationNo");
        }
        clearableOutLineEditText6.inputEditText.addTextChangedListener(new MediaMetadataCompat(this));
        ClearableOutLineEditText clearableOutLineEditText7 = this.editTextPin;
        if (clearableOutLineEditText7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextPin");
        }
        clearableOutLineEditText7.setValidateInputListener(new MediaDescriptionCompat(this));
        ClearableOutLineEditText clearableOutLineEditText8 = this.editTextPin;
        if (clearableOutLineEditText8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextPin");
        }
        clearableOutLineEditText8.inputEditText.addTextChangedListener(new JuristicOnboardingLandingFragment$MediaBrowserCompat$MediaItem(this));
        ClearableOutLineEditText clearableOutLineEditText9 = this.editTextPin;
        if (clearableOutLineEditText9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextPin");
        }
        clearableOutLineEditText9.setKeyInputListener(new RatingCompat(this));
        Button button2 = this.buttonNext;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonNext");
        }
        button2.setOnClickListener(this.MediaBrowserCompat$SearchResultReceiver);
        ImageView imageView = this.backButton;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("backButton");
        }
        imageView.setOnClickListener(this.MediaDescriptionCompat);
    }

    static final class write implements View.OnClickListener {
        private /* synthetic */ JuristicOnboardingLandingFragment MediaBrowserCompat$ItemReceiver;

        write(JuristicOnboardingLandingFragment juristicOnboardingLandingFragment) {
            this.MediaBrowserCompat$ItemReceiver = juristicOnboardingLandingFragment;
        }

        public final void onClick(View view) {
            JuristicOnboardingLandingFragment.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    public static final class MediaMetadataCompat implements TextWatcher {
        private /* synthetic */ JuristicOnboardingLandingFragment IconCompatParcelizer;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        MediaMetadataCompat(JuristicOnboardingLandingFragment juristicOnboardingLandingFragment) {
            this.IconCompatParcelizer = juristicOnboardingLandingFragment;
        }

        public final void afterTextChanged(Editable editable) {
            DocumentBaseOverlayView documentBaseOverlayView = this.IconCompatParcelizer.presenter;
            if (documentBaseOverlayView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String valueOf = String.valueOf(editable);
            ClearableOutLineEditText clearableOutLineEditText = this.IconCompatParcelizer.editTextRegistrationNo;
            if (clearableOutLineEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextRegistrationNo");
            }
            documentBaseOverlayView.MediaBrowserCompat$ItemReceiver(valueOf, clearableOutLineEditText.IconCompatParcelizer);
        }
    }

    static final class MediaDescriptionCompat implements ClearableEditText$MediaBrowserCompat$CustomActionResultReceiver {
        private /* synthetic */ JuristicOnboardingLandingFragment read;

        MediaDescriptionCompat(JuristicOnboardingLandingFragment juristicOnboardingLandingFragment) {
            this.read = juristicOnboardingLandingFragment;
        }

        public final boolean MediaBrowserCompat$ItemReceiver(String str) {
            DocumentBaseOverlayView documentBaseOverlayView = this.read.presenter;
            if (documentBaseOverlayView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            ClearableOutLineEditText clearableOutLineEditText = this.read.editTextPin;
            if (clearableOutLineEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextPin");
            }
            String obj = clearableOutLineEditText.inputEditText.getText().toString().toString();
            ClearableOutLineEditText clearableOutLineEditText2 = this.read.editTextPin;
            if (clearableOutLineEditText2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextPin");
            }
            return documentBaseOverlayView.IconCompatParcelizer(obj, clearableOutLineEditText2.IconCompatParcelizer);
        }
    }

    static final class RatingCompat implements ClearableEditText.read {
        private /* synthetic */ JuristicOnboardingLandingFragment MediaBrowserCompat$CustomActionResultReceiver;

        RatingCompat(JuristicOnboardingLandingFragment juristicOnboardingLandingFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = juristicOnboardingLandingFragment;
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction();
        }
    }

    static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ JuristicOnboardingLandingFragment IconCompatParcelizer;

        IconCompatParcelizer(JuristicOnboardingLandingFragment juristicOnboardingLandingFragment) {
            this.IconCompatParcelizer = juristicOnboardingLandingFragment;
        }

        /* JADX WARNING: type inference failed for: r1v4, types: [o.newDocumentBaseOverlayView] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r3) {
            /*
                r2 = this;
                com.scb.phone.view.fragment.juristic.JuristicOnboardingLandingFragment r3 = r2.IconCompatParcelizer
                o.DocumentBaseOverlayView r3 = r3.presenter
                if (r3 != 0) goto L_0x000b
                java.lang.String r0 = "presenter"
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
            L_0x000b:
                o.DocumentBaseOverlayView$IconCompatParcelizer r0 = p040o.DocumentBaseOverlayView.IconCompatParcelizer.read
                o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
                if (r0 == 0) goto L_0x0017
                o.newDocumentBaseOverlayView r1 = new o.newDocumentBaseOverlayView
                r1.<init>(r0)
                r0 = r1
            L_0x0017:
                o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
                T r1 = r3.RatingCompat
                if (r1 == 0) goto L_0x001f
                r1 = 1
                goto L_0x0020
            L_0x001f:
                r1 = 0
            L_0x0020:
                if (r1 == 0) goto L_0x0027
                T r3 = r3.RatingCompat
                r0.IconCompatParcelizer(r3)
            L_0x0027:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.juristic.JuristicOnboardingLandingFragment.IconCompatParcelizer.onClick(android.view.View):void");
        }
    }

    public final void IconCompatParcelizer() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void IconCompatParcelizer(String str) {
        Utils.C39323.C12941 r1;
        String str2;
        onGetStartedClick.write((Object) str, "preregistrationTokenId");
        Context context = getContext();
        if (context != null && (r1 = this.MediaBrowserCompat$MediaItem) != null && (str2 = r1.write) != null) {
            JuristicOtpActivity.IconCompatParcelizer iconCompatParcelizer = JuristicOtpActivity.MediaBrowserCompat$MediaItem;
            onGetStartedClick.IconCompatParcelizer((Object) context, "context");
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(context, str2, str);
        }
    }

    public final void read(String str) {
        Utils.C39323.C12941 r2;
        String str2;
        onGetStartedClick.write((Object) str, "preregistrationTokenId");
        Context context = getContext();
        if (context != null && (r2 = this.MediaBrowserCompat$MediaItem) != null && (str2 = r2.write) != null) {
            JuristicBusinessPinActivity.write write2 = JuristicBusinessPinActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "context");
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str2, "deviceState");
            onGetStartedClick.write((Object) str, "preregistrationTokenId");
            Intent intent = new Intent(context, JuristicBusinessPinActivity.class);
            intent.putExtra("EXTRA_DEVICE_STATE", str2);
            intent.putExtra("EXTRA_TOKEN_ID", str);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(context, intent).read();
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                context.startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void read(boolean z) {
        Button button = this.buttonNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonNext");
        }
        button.setEnabled(z);
    }

    public final void MediaBrowserCompat$ItemReceiver(long j) {
        TextView textView = this.tvRemark;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
        }
        textView.setVisibility(0);
        textView.setText(getString(R.string.juristic_onboarding_error_description, String.valueOf(j)));
        Context context = getContext();
        if (context != null) {
            textView.setTextColor(setLastBaselineToBottomHeight.read(context, R.color.f67152131099871));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        TextView textView = this.tvRemark;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
        }
        textView.setText("");
    }

    private final void write(String str) {
        TextView textView = this.tvRefId;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRefId");
        }
        textView.setText(getString(R.string.juristic_ref_id, str));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, "mobileNo");
        onGetStartedClick.write((Object) str2, "refId");
        write(str2);
        DocumentBaseOverlayView documentBaseOverlayView = this.presenter;
        if (documentBaseOverlayView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.write((Object) str, "mobileNo");
        writeUInt64NoTag.IconCompatParcelizer ratingCompat = new DocumentBaseOverlayView.RatingCompat(documentBaseOverlayView, str);
        if (documentBaseOverlayView.RatingCompat != null) {
            ratingCompat.IconCompatParcelizer(documentBaseOverlayView.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, getOversizeImage getoversizeimage) {
        onGetStartedClick.write((Object) getoversizeimage, "snackBarType");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Activity activity2 = activity;
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).write(activity2, R.id.container, str, getoversizeimage);
            }
        }
    }

    public final void onDestroy() {
        ClearableOutLineEditText clearableOutLineEditText = this.editTextPin;
        if (clearableOutLineEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextPin");
        }
        clearableOutLineEditText.setKeyInputListener((ClearableEditText.read) null);
        super.onDestroy();
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<forEachDstIn> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new forEachDstIn();
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(JuristicOnboardingLandingFragment juristicOnboardingLandingFragment) {
        DocumentBaseOverlayView documentBaseOverlayView = juristicOnboardingLandingFragment.presenter;
        if (documentBaseOverlayView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        if (SystemClock.elapsedRealtime() - documentBaseOverlayView.MediaBrowserCompat$ItemReceiver < 15000) {
            writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new DocumentBaseOverlayView.MediaDescriptionCompat(documentBaseOverlayView);
            if (documentBaseOverlayView.RatingCompat == null) {
                z = false;
            }
            if (z) {
                mediaDescriptionCompat.IconCompatParcelizer(documentBaseOverlayView.RatingCompat);
                return;
            }
            return;
        }
        if (documentBaseOverlayView.RatingCompat == null) {
            z = false;
        }
        if (z) {
            documentBaseOverlayView.RatingCompat.AlertController$RecycleListView();
        }
        documentBaseOverlayView.MediaBrowserCompat$ItemReceiver = SystemClock.elapsedRealtime();
        DebitCardResetOtpActivity<getPlaceIds> MediaBrowserCompat$ItemReceiver = documentBaseOverlayView.write.write.MediaBrowserCompat$ItemReceiver();
        toLowerCase tolowercase = documentBaseOverlayView.write;
        DocumentBaseOverlayView documentBaseOverlayView2 = documentBaseOverlayView;
        tolowercase.read(MediaBrowserCompat$ItemReceiver, new DocumentBaseOverlayView_MembersInjector(new DocumentBaseOverlayView.MediaMetadataCompat(documentBaseOverlayView2)), new DocumentBaseOverlayView_MembersInjector(new DocumentBaseOverlayView$MediaBrowserCompat$SearchResultReceiver(documentBaseOverlayView2)));
    }
}
