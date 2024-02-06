package com.scb.phone.view.fragment.registration.preregistration;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class PreregistrationInformationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private PreregistrationInformationFragment MediaBrowserCompat$ItemReceiver;
    private View MediaDescriptionCompat;
    private View RatingCompat;
    private View write;

    public PreregistrationInformationFragment_ViewBinding(final PreregistrationInformationFragment preregistrationInformationFragment, View view) {
        super(preregistrationInformationFragment, view);
        this.MediaBrowserCompat$ItemReceiver = preregistrationInformationFragment;
        preregistrationInformationFragment.userNameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.username, "field 'userNameTextView'", TextView.class);
        preregistrationInformationFragment.mobileNumberTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.mobile_number, "field 'mobileNumberTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.tv_switch_to_thai, "field 'tvSwitchToThai' and method 'clickSwitchToThai'");
        preregistrationInformationFragment.tvSwitchToThai = (TextView) onStart.write(IconCompatParcelizer2, R.id.tv_switch_to_thai, "field 'tvSwitchToThai'", TextView.class);
        this.MediaDescriptionCompat = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PreregistrationInformationFragment.this.clickSwitchToThai();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.tv_switch_to_eng, "field 'tvSwitchToEng' and method 'clickSwitchToEng'");
        preregistrationInformationFragment.tvSwitchToEng = (TextView) onStart.write(IconCompatParcelizer3, R.id.tv_switch_to_eng, "field 'tvSwitchToEng'", TextView.class);
        this.RatingCompat = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PreregistrationInformationFragment.this.clickSwitchToEng();
            }
        });
        preregistrationInformationFragment.tvPrivacyNotice = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_privacy_notice, "field 'tvPrivacyNotice'", TextView.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.button_next, "method 'onNextButtonClick'");
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PreregistrationInformationFragment.this.onNextButtonClick();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.not_me_link, "method 'onNotMeLinkClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PreregistrationInformationFragment.this.onNotMeLinkClick();
            }
        });
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.back_image, "method 'onBackClick'");
        this.write = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PreregistrationInformationFragment.this.onBackClick();
            }
        });
    }

    public final void read() {
        PreregistrationInformationFragment preregistrationInformationFragment = this.MediaBrowserCompat$ItemReceiver;
        if (preregistrationInformationFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            preregistrationInformationFragment.userNameTextView = null;
            preregistrationInformationFragment.mobileNumberTextView = null;
            preregistrationInformationFragment.tvSwitchToThai = null;
            preregistrationInformationFragment.tvSwitchToEng = null;
            preregistrationInformationFragment.tvPrivacyNotice = null;
            this.MediaDescriptionCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaDescriptionCompat = null;
            this.RatingCompat.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
