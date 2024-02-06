package com.scb.phone.view.fragment.registration;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.findus.FindUsActivity;
import com.scb.phone.view.activity.registration.RegistrationCardDetailActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.io.Serializable;
import kotlin.TypeCastException;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getKernelIDDstOver;
import p040o.onGetStartedClick;
import p040o.onMarkerClick;
import p040o.parseProcMapsJsonFromStream;
import p040o.setTapText;

public final class RegistrationFacialVerificationLockedActivity extends BaseActivity implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    public static final read MediaDescriptionCompat = new read((byte) 0);
    private getKernelIDDstOver MediaBrowserCompat$SearchResultReceiver = new getKernelIDDstOver();
    @BindView
    public Button descriptionButton;
    @BindView
    public TextView descriptionTextView;
    @BindView
    public Button returnButton;
    @BindView
    public TextView titleTextView;

    public final void onBackPressed() {
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static Intent IconCompatParcelizer(Context context, onMarkerClick onmarkerclick, parseProcMapsJsonFromStream parseprocmapsjsonfromstream) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) onmarkerclick, "method");
            onGetStartedClick.write((Object) parseprocmapsjsonfromstream, "flowType");
            Intent intent = new Intent(context, RegistrationFacialVerificationLockedActivity.class);
            intent.setFlags(268468224);
            if (onmarkerclick.write) {
                intent.putExtra("FROM_STATE", 0);
            } else {
                intent.putExtra("FROM_STATE", 1);
            }
            intent.putExtra("EXTRA_FLOW_TYPE", parseprocmapsjsonfromstream);
            return intent;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79632131493188);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        TextView textView = this.titleTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("titleTextView");
        }
        Intent intent = getIntent();
        int i = 1;
        textView.setText(getString((intent != null ? intent.getIntExtra("FROM_STATE", 0) : 1) == 0 ? R.string.registration_facial_verification_locked_has_card_title : R.string.registration_facial_verification_locked_no_card_title));
        TextView textView2 = this.descriptionTextView;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("descriptionTextView");
        }
        Intent intent2 = getIntent();
        textView2.setText(getString((intent2 != null ? intent2.getIntExtra("FROM_STATE", 0) : 1) == 0 ? R.string.registration_facial_verification_locked_has_card_description : R.string.registration_facial_verification_locked_no_card_description));
        Button button = this.descriptionButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("descriptionButton");
        }
        Intent intent3 = getIntent();
        button.setText(getString((intent3 != null ? intent3.getIntExtra("FROM_STATE", 0) : 1) == 0 ? R.string.registration_facial_verification_locked_has_card_button_next_label : R.string.registration_facial_verification_locked_no_card_button_next_label));
        Button button2 = this.returnButton;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("returnButton");
        }
        Intent intent4 = getIntent();
        if (intent4 != null) {
            i = intent4.getIntExtra("FROM_STATE", 0);
        }
        button2.setText(getString(i == 0 ? R.string.registration_facial_verification_locked_has_card_button_return_label : R.string.registration_facial_verification_locked_no_card_button_return_label));
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "registration_face_locked");
    }

    @OnClick
    public final void onReturnButtonClicked() {
        mo13803Z_();
    }

    @OnClick
    public final void onNextButtonClicked() {
        Intent intent = getIntent();
        int intExtra = intent != null ? intent.getIntExtra("FROM_STATE", 0) : 1;
        if (intExtra == 0) {
            Context context = this;
            Intent intent2 = getIntent();
            Serializable serializableExtra = intent2 != null ? intent2.getSerializableExtra("EXTRA_FLOW_TYPE") : null;
            if (serializableExtra != null) {
                Intent read2 = RegistrationCardDetailActivity.read(context, true, (parseProcMapsJsonFromStream) serializableExtra);
                IntentTidInjectionContextAspect.aspectOf();
                try {
                    Intent read3 = setTapText.write(this, read2).read();
                    MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                    sb.append(read3.getData());
                    sb.append("\n with context ");
                    sb.append(hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                    startActivity(read3);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.enums.RegistrationCardDetailFlow");
            }
        } else if (intExtra != 1) {
            RatingCompat(true);
        } else {
            FindUsActivity.MediaBrowserCompat$CustomActionResultReceiver(this, false);
            this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "registration_find_us");
        }
    }
}
