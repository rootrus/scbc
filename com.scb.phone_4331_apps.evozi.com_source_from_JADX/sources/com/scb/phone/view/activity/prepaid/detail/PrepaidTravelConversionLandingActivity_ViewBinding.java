package com.scb.phone.view.activity.prepaid.detail;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class PrepaidTravelConversionLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private PrepaidTravelConversionLandingActivity IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public PrepaidTravelConversionLandingActivity_ViewBinding(final PrepaidTravelConversionLandingActivity prepaidTravelConversionLandingActivity, View view) {
        super(prepaidTravelConversionLandingActivity, view);
        this.IconCompatParcelizer = prepaidTravelConversionLandingActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btnReview, "method 'onClickButtonReview'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PrepaidTravelConversionLandingActivity.this.onClickButtonReview();
            }
        });
    }

    public final void read() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
