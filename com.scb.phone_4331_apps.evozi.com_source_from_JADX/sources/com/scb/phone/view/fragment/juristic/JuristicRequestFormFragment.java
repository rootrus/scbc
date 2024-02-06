package com.scb.phone.view.fragment.juristic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.Scopes;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.juristic.C5655xbbff311b;
import com.scb.phone.view.activity.juristic.JuristicRequestFormSuccessfulActivity;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C3325x3fea8922;
import p040o.C7141hv;
import p040o.CheckEligibilityActivity;
import p040o.DocumentCaptureExperience;
import p040o.DocumentCaptureExperience$MediaBrowserCompat$ItemReceiver;
import p040o.FundActionsSuccessActivity;
import p040o.GoodToKnowActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Utils;
import p040o.ZTBSV;
import p040o.forEachDstIn;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class JuristicRequestFormFragment extends BaseFragment implements C7141hv {
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer((byte) 0);
    private final View.OnFocusChangeListener MediaBrowserCompat$CustomActionResultReceiver = new JuristicRequestFormFragment$MediaBrowserCompat$ItemReceiver(this);
    private final View.OnClickListener MediaBrowserCompat$MediaItem = new JuristicRequestFormFragment$MediaBrowserCompat$MediaItem(this);
    private final TextView.OnEditorActionListener MediaBrowserCompat$SearchResultReceiver = new write(this);
    private final HmlVerifyEmailActivity MediaDescriptionCompat;
    private final read MediaMetadataCompat = new read(this);
    private final CustomEditText.write RatingCompat = new C6072x4ce98f13(this);
    @BindView
    public Button btSend;
    @BindView
    public CommonInputViewGroup ivgEmail;
    @HmlPinActivity
    public DocumentCaptureExperience presenter;

    public JuristicRequestFormFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaDescriptionCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f88212131494048, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        DocumentCaptureExperience documentCaptureExperience = this.presenter;
        if (documentCaptureExperience == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        documentCaptureExperience.MediaBrowserCompat$ItemReceiver(this);
        CommonInputViewGroup commonInputViewGroup = this.ivgEmail;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
        }
        boolean z = false;
        commonInputViewGroup.write = false;
        commonInputViewGroup.mEditClearImageButton.setVisibility(8);
        CommonInputViewGroup commonInputViewGroup2 = this.ivgEmail;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
        }
        commonInputViewGroup2.setFocusListener(this.MediaBrowserCompat$CustomActionResultReceiver);
        CommonInputViewGroup commonInputViewGroup3 = this.ivgEmail;
        if (commonInputViewGroup3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
        }
        commonInputViewGroup3.setOnEditorActionListener(this.MediaBrowserCompat$SearchResultReceiver);
        CommonInputViewGroup commonInputViewGroup4 = this.ivgEmail;
        if (commonInputViewGroup4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
        }
        TextWatcher textWatcher = this.MediaMetadataCompat;
        commonInputViewGroup4.mEditText.addTextChangedListener(textWatcher);
        commonInputViewGroup4.MediaBrowserCompat$CustomActionResultReceiver.add(textWatcher);
        CommonInputViewGroup commonInputViewGroup5 = this.ivgEmail;
        if (commonInputViewGroup5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
        }
        commonInputViewGroup5.setOnBackListener(this.RatingCompat);
        Button button = this.btSend;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btSend");
        }
        button.setOnClickListener(this.MediaBrowserCompat$MediaItem);
        DocumentCaptureExperience documentCaptureExperience2 = this.presenter;
        if (documentCaptureExperience2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String MediaMetadataCompat2 = documentCaptureExperience2.MediaBrowserCompat$ItemReceiver.write.MediaMetadataCompat();
        if (MediaMetadataCompat2 == null) {
            MediaMetadataCompat2 = "";
        }
        if (!GoodToKnowActivity.read(MediaMetadataCompat2)) {
            writeUInt64NoTag.IconCompatParcelizer documentCaptureExperience$MediaBrowserCompat$ItemReceiver = new DocumentCaptureExperience$MediaBrowserCompat$ItemReceiver(MediaMetadataCompat2);
            if (documentCaptureExperience2.RatingCompat != null) {
                documentCaptureExperience$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(documentCaptureExperience2.RatingCompat);
            }
            onGetStartedClick.write((Object) MediaMetadataCompat2, Scopes.EMAIL);
            writeUInt64NoTag.IconCompatParcelizer documentCaptureExperience$MediaBrowserCompat$CustomActionResultReceiver = new C3325x3fea8922(documentCaptureExperience2, MediaMetadataCompat2);
            if (documentCaptureExperience2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                documentCaptureExperience$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(documentCaptureExperience2.RatingCompat);
            }
        }
        ZTBSV ztbsv = (forEachDstIn) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "juristic_enter_email");
        }
    }

    public final void onDestroyView() {
        CommonInputViewGroup commonInputViewGroup = this.ivgEmail;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
        }
        commonInputViewGroup.setFocusListener((View.OnFocusChangeListener) null);
        super.onDestroyView();
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, Scopes.EMAIL);
        CommonInputViewGroup commonInputViewGroup = this.ivgEmail;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
        }
        if (str.length() > 0) {
            CommonInputViewGroup commonInputViewGroup2 = this.ivgEmail;
            if (commonInputViewGroup2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
            }
            commonInputViewGroup2.write = true;
            commonInputViewGroup2.mEditClearImageButton.setVisibility(0);
        } else {
            CommonInputViewGroup commonInputViewGroup3 = this.ivgEmail;
            if (commonInputViewGroup3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
            }
            commonInputViewGroup3.write = false;
            commonInputViewGroup3.mEditClearImageButton.setVisibility(8);
        }
        commonInputViewGroup.setText(str);
    }

    public final void IconCompatParcelizer(boolean z) {
        if (z) {
            Button button = this.btSend;
            if (button == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("btSend");
            }
            button.setEnabled(true);
            CommonInputViewGroup commonInputViewGroup = this.ivgEmail;
            if (commonInputViewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
            }
            commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver();
            return;
        }
        Button button2 = this.btSend;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btSend");
        }
        button2.setEnabled(false);
        CommonInputViewGroup commonInputViewGroup2 = this.ivgEmail;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
        }
        commonInputViewGroup2.MediaBrowserCompat$ItemReceiver();
    }

    public final void write(Utils.C39312 r5) {
        onGetStartedClick.write((Object) r5, "display");
        Context context = getContext();
        if (context != null) {
            C5655xbbff311b juristicRequestFormSuccessfulActivity$MediaBrowserCompat$ItemReceiver = JuristicRequestFormSuccessfulActivity.MediaBrowserCompat$MediaItem;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) r5, "juristicRequestFormResponseDisplay");
            Intent intent = new Intent(context, JuristicRequestFormSuccessfulActivity.class);
            intent.putExtra("DISPLAY", r5);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(context, intent).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                context.startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    static final class write implements TextView.OnEditorActionListener {
        private /* synthetic */ JuristicRequestFormFragment read;

        write(JuristicRequestFormFragment juristicRequestFormFragment) {
            this.read = juristicRequestFormFragment;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            CommonInputViewGroup commonInputViewGroup = this.read.ivgEmail;
            if (commonInputViewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
            }
            commonInputViewGroup.clearFocus();
            this.read.PlaybackStateCompat$CustomAction();
            return true;
        }
    }

    public static final class read implements TextWatcher {
        private /* synthetic */ JuristicRequestFormFragment IconCompatParcelizer;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        read(JuristicRequestFormFragment juristicRequestFormFragment) {
            this.IconCompatParcelizer = juristicRequestFormFragment;
        }

        public final void afterTextChanged(Editable editable) {
            JuristicRequestFormFragment.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence != null) {
                if (charSequence.length() > 0) {
                    CommonInputViewGroup commonInputViewGroup = this.IconCompatParcelizer.ivgEmail;
                    if (commonInputViewGroup == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
                    }
                    commonInputViewGroup.write = true;
                    commonInputViewGroup.mEditClearImageButton.setVisibility(0);
                    return;
                }
                CommonInputViewGroup commonInputViewGroup2 = this.IconCompatParcelizer.ivgEmail;
                if (commonInputViewGroup2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
                }
                commonInputViewGroup2.write = false;
                commonInputViewGroup2.mEditClearImageButton.setVisibility(8);
            }
        }
    }

    static final class MediaDescriptionCompat extends CheckEligibilityActivity implements FundActionsSuccessActivity<forEachDstIn> {
        public static final MediaDescriptionCompat MediaBrowserCompat$ItemReceiver = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new forEachDstIn();
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(JuristicRequestFormFragment juristicRequestFormFragment) {
        DocumentCaptureExperience documentCaptureExperience = juristicRequestFormFragment.presenter;
        if (documentCaptureExperience == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CommonInputViewGroup commonInputViewGroup = juristicRequestFormFragment.ivgEmail;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
        }
        String obj = commonInputViewGroup.mEditText.getText().toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "ivgEmail.text");
        onGetStartedClick.write((Object) obj, Scopes.EMAIL);
        writeUInt64NoTag.IconCompatParcelizer documentCaptureExperience$MediaBrowserCompat$CustomActionResultReceiver = new C3325x3fea8922(documentCaptureExperience, obj);
        if (documentCaptureExperience.RatingCompat != null) {
            documentCaptureExperience$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(documentCaptureExperience.RatingCompat);
        }
    }
}
