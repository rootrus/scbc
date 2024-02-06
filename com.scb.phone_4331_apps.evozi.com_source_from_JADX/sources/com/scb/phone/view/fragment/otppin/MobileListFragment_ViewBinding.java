package com.scb.phone.view.fragment.otppin;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MobileListFragment_ViewBinding extends BaseFragment_ViewBinding {
    private MobileListFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public MobileListFragment_ViewBinding(final MobileListFragment mobileListFragment, View view) {
        super(mobileListFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = mobileListFragment;
        mobileListFragment.mobileList = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_mobileList, "field 'mobileList'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.go_to_otp_button, "field 'goToOtpButton' and method 'goToOtpPage'");
        mobileListFragment.goToOtpButton = (DefaultButton) onStart.write(IconCompatParcelizer, R.id.go_to_otp_button, "field 'goToOtpButton'", DefaultButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MobileListFragment.this.goToOtpPage();
            }
        });
        mobileListFragment.belowLabelTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_otp_below_label, "field 'belowLabelTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.find_us_text_view, "field 'findUsTextView' and method 'goToFindUs'");
        mobileListFragment.findUsTextView = (TextView) onStart.write(IconCompatParcelizer2, R.id.find_us_text_view, "field 'findUsTextView'", TextView.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MobileListFragment.this.goToFindUs();
            }
        });
    }

    public final void read() {
        MobileListFragment mobileListFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mobileListFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            mobileListFragment.mobileList = null;
            mobileListFragment.goToOtpButton = null;
            mobileListFragment.belowLabelTextView = null;
            mobileListFragment.findUsTextView = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
