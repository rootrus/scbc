package com.scb.phone.view.fragment.otppin;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinTextInput;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.C4261dN;
import p040o.C9885dP;
import p040o.HmlPinActivity;
import p040o.MerchantService;
import p040o.getAdditionalLeftScanLinesWidth;

public class OtpPinFragment extends BaseFragment implements getAdditionalLeftScanLinesWidth, MerchantService {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$MediaItem;
    private C4261dN.read MediaBrowserCompat$SearchResultReceiver = C4261dN.read.DEFAULT;
    private write MediaDescriptionCompat;
    public String MediaMetadataCompat;
    private read RatingCompat;
    @BindView
    CustomKeypad customKeypad;
    @BindView
    CustomPinTextInput customPinInput;
    @BindView
    TextView enterOtpMessage;
    @BindView
    TextView errorMessage;
    @HmlPinActivity
    public C4261dN otpPresenter;
    @BindView
    TextView refCodeTextView;

    public interface write {
        void MediaBrowserCompat$SearchResultReceiver(String str);

        void write(String str, String str2);
    }

    public interface read {
        void IconCompatParcelizer(String str);
    }

    /* renamed from: P_ */
    public final void mo13717P_() {
    }

    public static OtpPinFragment read(C4261dN.read read2, String str, String str2, String str3, String str4) {
        OtpPinFragment otpPinFragment = new OtpPinFragment();
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLE_TITLE_TEXT", str4);
        bundle.putSerializable("BUNDLE_OTP_TYPE", read2);
        bundle.putString("BUNDLE_PHONE_NUMBER", str);
        bundle.putString("BUNDLE_MASKED_PHONE_NUMBER", str2);
        bundle.putString("BUNDLE_OTP_POLICY_ID", str3);
        otpPinFragment.setArguments(bundle);
        return otpPinFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            getActivity().getWindow().setSoftInputMode(2);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88812131494108, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaDescriptionCompat = (write) getActivity();
        setTransitioning();
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.getSerializable("BUNDLE_OTP_TYPE") != null) {
                this.MediaBrowserCompat$SearchResultReceiver = (C4261dN.read) arguments.getSerializable("BUNDLE_OTP_TYPE");
            }
            this.MediaMetadataCompat = arguments.getString("BUNDLE_PHONE_NUMBER");
            this.IconCompatParcelizer = arguments.getString("BUNDLE_MASKED_PHONE_NUMBER");
            this.MediaBrowserCompat$CustomActionResultReceiver = arguments.getString("BUNDLE_OTP_POLICY_ID");
        }
        this.enterOtpMessage.setText(getString(R.string.otp_input_message, this.IconCompatParcelizer));
        this.otpPresenter.MediaBrowserCompat$ItemReceiver(this);
        String str = this.MediaMetadataCompat;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (!z) {
            C4261dN dNVar = this.otpPresenter;
            String str2 = this.MediaMetadataCompat;
            String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            C4261dN.read read2 = this.MediaBrowserCompat$SearchResultReceiver;
            dNVar.write = SystemClock.elapsedRealtime();
            dNVar.read = read2;
            dNVar.MediaBrowserCompat$ItemReceiver(str2, str3);
        }
        this.customPinInput.setPinInputListener(this);
        this.customPinInput.MediaBrowserCompat$CustomActionResultReceiver();
        this.customKeypad.setKeypadListener(this.customPinInput);
        this.errorMessage.setText("");
        return inflate;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof read) {
            this.RatingCompat = (read) context;
        }
    }

    public void onDestroy() {
        this.otpPresenter.onDestroy();
        super.onDestroy();
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        String string = getString(R.string.otp_title);
        Bundle arguments = getArguments();
        if (arguments != null && !TextUtils.isEmpty(arguments.getString("BUNDLE_TITLE_TEXT"))) {
            string = arguments.getString("BUNDLE_TITLE_TEXT");
        }
        ParcelableVolumeInfo(string);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        this.refCodeTextView.setText(getString(R.string.reference_code_sample, str3));
        if ("0".equals(str)) {
            this.MediaBrowserCompat$MediaItem = str2;
        }
        this.errorMessage.setText("");
        this.MediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver(getString(R.string.otp_has_been_sent, this.IconCompatParcelizer));
    }

    public final void read(String str) {
        this.errorMessage.setText(str);
    }

    public final void al_() {
        this.errorMessage.setText("");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        this.customPinInput.MediaBrowserCompat$CustomActionResultReceiver();
        String str2 = this.MediaBrowserCompat$MediaItem;
        if (str2 != null) {
            this.MediaDescriptionCompat.write(str2, str);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onResendSmsClick() {
        C4261dN dNVar = this.otpPresenter;
        String str = this.MediaMetadataCompat;
        FragmentActivity activity = getActivity();
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (SystemClock.elapsedRealtime() - dNVar.write < 15000) {
            C9885dP dPVar = new C9885dP(dNVar, activity);
            if (dNVar.RatingCompat != null) {
                dPVar.IconCompatParcelizer(dNVar.RatingCompat);
                return;
            }
            return;
        }
        dNVar.write = SystemClock.elapsedRealtime();
        dNVar.MediaBrowserCompat$ItemReceiver(str, str2);
    }

    public final void write(String str) {
        read read2 = this.RatingCompat;
        if (read2 != null) {
            read2.IconCompatParcelizer(str);
        } else {
            mo13677k_(str);
        }
    }
}
