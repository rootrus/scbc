package com.scb.phone.view.fragment.investment.scbs.open;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.fragment.ScreenShotFragment;
import p040o.ActivityBuilder_BindThirdPartyWebActivity;
import p040o.ActivityBuilder_BindTransferReviewActivity;
import p040o.BankingServicesDeepLinkActivity;
import p040o.CaptureAnimationsModule_ProvideIISelfieOverlayViewFactory;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingCheckedFuture;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.RttiJsonPassport_MembersInjector;
import p040o.getOversizeImage;
import p040o.getTextColor;
import p040o.onStart;
import p040o.persistEvent;
import p040o.removeCameraEventListeners;
import p040o.setPageAreaThreshold;
import p040o.verifyRedeem;

public class OnboardingSuccessFragment extends ScreenShotFragment<persistEvent> implements RttiJsonPassport_MembersInjector {
    @BindView
    TextView accountNoTextView;
    @BindView
    TextView dateTextView;
    @BindView
    TextView emailTextView;
    @BindView
    TextView nameTextView;
    @BindView
    TextView nicknameTextView;
    @HmlPinActivity
    public getTextColor presenter;
    @BindView
    TextView returnToAccountTextView;
    @BindView
    Button saveSlipButton;

    public class ScbsRegistrationSuccessScreenshotDisplay_ViewBinding implements Unbinder {
        private ScbsRegistrationSuccessScreenshotDisplay IconCompatParcelizer;

        public ScbsRegistrationSuccessScreenshotDisplay_ViewBinding(ScbsRegistrationSuccessScreenshotDisplay scbsRegistrationSuccessScreenshotDisplay, View view) {
            this.IconCompatParcelizer = scbsRegistrationSuccessScreenshotDisplay;
            scbsRegistrationSuccessScreenshotDisplay.dateTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_onboarding_slip_date, "field 'dateTextView'", TextView.class);
            scbsRegistrationSuccessScreenshotDisplay.nameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_onboarding_slip_name, "field 'nameTextView'", TextView.class);
            scbsRegistrationSuccessScreenshotDisplay.accountNameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_onboarding_slip_account, "field 'accountNameTextView'", TextView.class);
            scbsRegistrationSuccessScreenshotDisplay.accountNumberTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_onboarding_slip_account_number, "field 'accountNumberTextView'", TextView.class);
            scbsRegistrationSuccessScreenshotDisplay.emailTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_onboarding_slip_email, "field 'emailTextView'", TextView.class);
        }

        public final void read() {
            ScbsRegistrationSuccessScreenshotDisplay scbsRegistrationSuccessScreenshotDisplay = this.IconCompatParcelizer;
            if (scbsRegistrationSuccessScreenshotDisplay != null) {
                this.IconCompatParcelizer = null;
                scbsRegistrationSuccessScreenshotDisplay.dateTextView = null;
                scbsRegistrationSuccessScreenshotDisplay.nameTextView = null;
                scbsRegistrationSuccessScreenshotDisplay.accountNameTextView = null;
                scbsRegistrationSuccessScreenshotDisplay.accountNumberTextView = null;
                scbsRegistrationSuccessScreenshotDisplay.emailTextView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void IconCompatParcelizer(ForwardingCheckedFuture.SimpleForwardingCheckedFuture simpleForwardingCheckedFuture, boolean z, boolean z2) {
        persistEvent persistevent = (persistEvent) simpleForwardingCheckedFuture;
        C6057x51be4a45 onboardingSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver = new C6057x51be4a45();
        String str = persistevent.IconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(onboardingSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver, new ScbsRegistrationSuccessScreenshotDisplay(String.format(getString(R.string.scbs_onboarding_slip), new Object[]{str}), persistevent, z2), getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new ActivityBuilder_BindTransferReviewActivity(this), new ActivityBuilder_BindThirdPartyWebActivity(this));
    }

    public static OnboardingSuccessFragment MediaBrowserCompat$CustomActionResultReceiver(persistEvent persistevent) {
        OnboardingSuccessFragment onboardingSuccessFragment = new OnboardingSuccessFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUCCESS_DISPLAY", persistevent);
        onboardingSuccessFragment.setArguments(bundle);
        return onboardingSuccessFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89672131494194, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("SUCCESS_DISPLAY")) {
            getTextColor gettextcolor = this.presenter;
            persistEvent persistevent = (persistEvent) arguments.getParcelable("SUCCESS_DISPLAY");
            gettextcolor.write = persistevent;
            removeCameraEventListeners removecameraeventlisteners = new removeCameraEventListeners(gettextcolor, persistevent);
            if (gettextcolor.RatingCompat != null) {
                z = true;
            }
            if (z) {
                removecameraeventlisteners.IconCompatParcelizer(gettextcolor.RatingCompat);
            }
        }
        return inflate;
    }

    public void onDestroy() {
        this.MediaBrowserCompat$ItemReceiver.dispose();
        this.presenter.onDestroy();
        super.onDestroy();
    }

    @OnClick
    public void clickSaveSlip() {
        getTextColor gettextcolor = this.presenter;
        boolean z = true;
        CaptureAnimationsModule_ProvideIISelfieOverlayViewFactory captureAnimationsModule_ProvideIISelfieOverlayViewFactory = new CaptureAnimationsModule_ProvideIISelfieOverlayViewFactory(gettextcolor, true);
        if (gettextcolor.RatingCompat == null) {
            z = false;
        }
        if (z) {
            captureAnimationsModule_ProvideIISelfieOverlayViewFactory.IconCompatParcelizer(gettextcolor.RatingCompat);
        }
    }

    @OnClick
    public void clickReturnToAccount() {
        getTextColor gettextcolor = this.presenter;
        setPageAreaThreshold setpageareathreshold = setPageAreaThreshold.MediaBrowserCompat$ItemReceiver;
        if (gettextcolor.RatingCompat != null) {
            setpageareathreshold.IconCompatParcelizer(gettextcolor.RatingCompat);
        }
    }

    public final void write(boolean z) {
        this.saveSlipButton.setVisibility(z ? 0 : 8);
    }

    public final void read(persistEvent persistevent) {
        this.dateTextView.setText(persistevent.IconCompatParcelizer);
        this.nameTextView.setText(persistevent.read);
        this.nicknameTextView.setText(persistevent.MediaBrowserCompat$ItemReceiver);
        this.accountNoTextView.setText(persistevent.MediaBrowserCompat$CustomActionResultReceiver);
        this.emailTextView.setText(persistevent.write);
    }

    public final void read() {
        if (getActivity() != null) {
            HomeActivity.write((Context) getActivity(), true);
            getActivity().finish();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            String string = getString(R.string.onboarding_success_save_slip_to_your_gallery);
            getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).write(activity, R.id.root_view, string, getoversizeimage);
            }
        }
    }

    public final void write() {
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            String string = getString(R.string.onboarding_success_auto_saved_slip_to_your_gallery);
            getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).write(activity, R.id.root_view, string, getoversizeimage);
            }
        }
    }

    public static class ScbsRegistrationSuccessScreenshotDisplay extends ForwardingListenableFuture.SimpleForwardingListenableFuture {
        @BindView
        TextView accountNameTextView;
        @BindView
        TextView accountNumberTextView;
        @BindView
        TextView dateTextView;
        @BindView
        TextView emailTextView;
        @BindView
        TextView nameTextView;
        persistEvent read;

        public ScbsRegistrationSuccessScreenshotDisplay(String str, persistEvent persistevent, boolean z) {
            super(R.layout.f91862131494413, str, false, z);
            this.read = persistevent;
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(persistEvent persistevent, boolean z) {
        verifyRedeem.read(this, persistevent, false, z);
    }
}
