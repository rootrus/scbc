package com.scb.phone.view.fragment.hml.businessowner;

import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomURLEditTextWithButtonView;
import p040o.ActivityBuilder_BindFundPurchaseLandingActivity;
import p040o.onGetStartedClick;
import p040o.setCertificateError;

final class HmlBusinessURLInfoFragment$MediaBrowserCompat$ItemReceiver implements View.OnClickListener, DialogInterface.OnClickListener {
    private /* synthetic */ CustomURLEditTextWithButtonView IconCompatParcelizer;
    private /* synthetic */ LinearLayout MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ HmlBusinessURLInfoFragment read;
    private /* synthetic */ setCertificateError.IconCompatParcelizer write;

    HmlBusinessURLInfoFragment$MediaBrowserCompat$ItemReceiver(HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment, LinearLayout linearLayout, CustomURLEditTextWithButtonView customURLEditTextWithButtonView, setCertificateError.IconCompatParcelizer iconCompatParcelizer) {
        this.read = hmlBusinessURLInfoFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = linearLayout;
        this.IconCompatParcelizer = customURLEditTextWithButtonView;
        this.write = iconCompatParcelizer;
    }

    public final void onClick(View view) {
        CustomDialog.IconCompatParcelizer(this.read.getContext()).IconCompatParcelizer(this.read.getString(R.string.hml_business_url_delete_string_popup_title)).MediaBrowserCompat$ItemReceiver(this.read.getString(R.string.hml_business_url_delete_string_popup_description)).write(this.read.getString(R.string.cancel), C60242.IconCompatParcelizer).IconCompatParcelizer(this.read.getString(R.string.confirm), this).show();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.MediaBrowserCompat$CustomActionResultReceiver.removeView(this.IconCompatParcelizer);
        int i2 = ActivityBuilder_BindFundPurchaseLandingActivity.read[this.write.ordinal()];
        if (i2 == 1) {
            TextView textView = this.read.addMoreProductBtn;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("addMoreProductBtn");
            }
            View view = textView;
            onGetStartedClick.write((Object) view, "$this$isVisible");
            view.setVisibility(0);
        } else if (i2 == 2) {
            TextView textView2 = this.read.addMoreStoreBtn;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("addMoreStoreBtn");
            }
            View view2 = textView2;
            onGetStartedClick.write((Object) view2, "$this$isVisible");
            view2.setVisibility(0);
        }
    }
}
