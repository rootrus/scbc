package com.scb.phone.view.fragment.registration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.registration.onboarding.RegistrationOnboardingActivity;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.C10178z;
import p040o.C4131c;
import p040o.C4981mx;
import p040o.HmlPinActivity;
import p040o.ZSYR2K;
import p040o.getFileSHA;
import p040o.getKernelIDDstOver;
import p040o.onFieldsExtracted;

public class RegistrationSuccessFragment extends BaseFragment implements onFieldsExtracted {
    private getKernelIDDstOver IconCompatParcelizer = new getKernelIDDstOver();
    @BindView
    Button buttonNext;
    @BindView
    ImageView imageLogo;
    @HmlPinActivity
    public C4131c.C41322 presenter;
    @BindView
    TextView textMessage;

    public static RegistrationSuccessFragment write() {
        return new RegistrationSuccessFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89362131494163, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getFileSHA getfilesha = getFileSHA.REGULAR;
        if (!(getActivity() == null || getActivity().getIntent().getSerializableExtra("SUCCESS_PAGE_DYNAMIC_TYPE") == null)) {
            getfilesha = (getFileSHA) getActivity().getIntent().getSerializableExtra("SUCCESS_PAGE_DYNAMIC_TYPE");
            C4131c.C41322 r0 = this.presenter;
            if (getfilesha == getFileSHA.DEAD_CARD) {
                C10178z.C547821 r2 = C10178z.C547821.MediaBrowserCompat$ItemReceiver;
                if (r0.RatingCompat != null) {
                    r2.IconCompatParcelizer(r0.RatingCompat);
                }
            }
        }
        C4131c.C41322 r02 = this.presenter;
        if (getfilesha == getFileSHA.DEAD_CARD) {
            C4981mx mxVar = C4981mx.IconCompatParcelizer;
            if (r02.RatingCompat != null) {
                z = true;
            }
            if (z) {
                mxVar.IconCompatParcelizer(r02.RatingCompat);
            }
        } else {
            C10178z.C547312 r6 = C10178z.C547312.IconCompatParcelizer;
            if (r02.RatingCompat != null) {
                z = true;
            }
            if (z) {
                r6.IconCompatParcelizer(r02.RatingCompat);
            }
        }
        return inflate;
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onNextButtonClicked() {
        C4131c.C41322 r0 = this.presenter;
        boolean z = false;
        r0.IconCompatParcelizer.IconCompatParcelizer.write(r0.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver() == 1);
        C10178z.C1018219 r1 = C10178z.C1018219.write;
        if (r0.RatingCompat != null) {
            z = true;
        }
        if (z) {
            r1.IconCompatParcelizer(r0.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (getContext() != null) {
            RegistrationOnboardingActivity.write(getContext());
        }
    }

    public final void IconCompatParcelizer() {
        this.textMessage.setText(getResources().getString(R.string.registration_success_cc_activation_completed));
    }

    public final void read() {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("feature", "card_activation")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("registration_success", zsyr2kArr);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        getKernelIDDstOver getkerneliddstover = this.IconCompatParcelizer;
        if (getActivity() != null) {
            getkerneliddstover.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "registration_success");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
    }
}
