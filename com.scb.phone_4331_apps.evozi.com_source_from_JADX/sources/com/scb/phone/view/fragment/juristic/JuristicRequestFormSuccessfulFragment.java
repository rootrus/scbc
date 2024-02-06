package com.scb.phone.view.fragment.juristic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.juristic.JuristicRequestFormSuccessfulActivity;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.C7137hr;
import p040o.CheckEligibilityActivity;
import p040o.FixedAspectRatioCaptureExperience;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.Utils;
import p040o.ZTBSV;
import p040o.forEachDstIn;
import p040o.getOversizeImage;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class JuristicRequestFormSuccessfulFragment extends BaseFragment implements C7137hr {
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer((byte) 0);
    private final View.OnClickListener MediaBrowserCompat$CustomActionResultReceiver = new C6073xd60ae2cd(this);
    private final HmlVerifyEmailActivity MediaBrowserCompat$MediaItem;
    private Utils.C39312 MediaMetadataCompat;
    @BindView
    public Button btBackToHome;
    @HmlPinActivity
    public FixedAspectRatioCaptureExperience presenter;
    @BindView
    public TextView tvSentEmail;
    @BindView
    public TextView tvSentTime;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public JuristicRequestFormSuccessfulFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = read.write;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$MediaItem = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.MediaMetadataCompat = (Utils.C39312) arguments.getParcelable("DISPLAY");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f88222131494049, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        FixedAspectRatioCaptureExperience fixedAspectRatioCaptureExperience = this.presenter;
        if (fixedAspectRatioCaptureExperience == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        fixedAspectRatioCaptureExperience.MediaBrowserCompat$ItemReceiver(this);
        Button button = this.btBackToHome;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btBackToHome");
        }
        button.setOnClickListener(this.MediaBrowserCompat$CustomActionResultReceiver);
        Utils.C39312 r2 = this.MediaMetadataCompat;
        if (r2 != null) {
            FixedAspectRatioCaptureExperience fixedAspectRatioCaptureExperience2 = this.presenter;
            if (fixedAspectRatioCaptureExperience2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) r2, "display");
            writeUInt64NoTag.IconCompatParcelizer write = new FixedAspectRatioCaptureExperience.write(r2);
            if (fixedAspectRatioCaptureExperience2.RatingCompat != null) {
                write.IconCompatParcelizer(fixedAspectRatioCaptureExperience2.RatingCompat);
            }
        }
        ZTBSV ztbsv = (forEachDstIn) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "juristic_successfully_sent");
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Activity activity2 = activity;
            String string = activity.getString(R.string.juristic_request_form_successful_plain_jane);
            getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).write(activity2, R.id.cl_juristic_request_form_successful_container, string, getoversizeimage);
            }
        }
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "sentEmail");
        TextView textView = this.tvSentEmail;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSentEmail");
        }
        textView.setText(str);
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "sentDate");
        TextView textView = this.tvSentTime;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSentTime");
        }
        textView.setText(str);
    }

    public final void IconCompatParcelizer() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (!(activity instanceof JuristicRequestFormSuccessfulActivity)) {
                activity = null;
            }
            JuristicRequestFormSuccessfulActivity juristicRequestFormSuccessfulActivity = (JuristicRequestFormSuccessfulActivity) activity;
            if (juristicRequestFormSuccessfulActivity != null) {
                juristicRequestFormSuccessfulActivity.RatingCompat(false);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (!(activity instanceof JuristicRequestFormSuccessfulActivity)) {
                activity = null;
            }
            JuristicRequestFormSuccessfulActivity juristicRequestFormSuccessfulActivity = (JuristicRequestFormSuccessfulActivity) activity;
            if (juristicRequestFormSuccessfulActivity != null) {
                juristicRequestFormSuccessfulActivity.RatingCompat(false);
            }
        }
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<forEachDstIn> {
        public static final read write = new read();

        read() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new forEachDstIn();
        }
    }
}
