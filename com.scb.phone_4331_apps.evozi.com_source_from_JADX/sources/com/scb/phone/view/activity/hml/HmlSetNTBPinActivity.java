package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseChangePinActivity;
import com.scb.phone.view.activity.hml.HmlSetNTBPinSuccessActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportCaptureModule_GetIPassportDeserializerKtaFactory;
import p040o.RetrieveScanSettingsResponse;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlSetNTBPinActivity extends BaseChangePinActivity<RetrieveScanSettingsResponse> implements PassportCaptureModule_GetIPassportDeserializerKtaFactory {
    public static final read MediaMetadataCompat = new read((byte) 0);

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((RetrieveScanSettingsResponse) this.presenter).MediaBrowserCompat$ItemReceiver(this);
        ((RetrieveScanSettingsResponse) this.presenter).IconCompatParcelizer();
        this.buttonNext.setText(R.string.hml_new_ntb_pin_setup_button);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.ntb_pin_setup_page_title));
        setTabContainer();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.ntb_pin_setup_page_title));
        setTabContainer();
    }

    public final void MediaDescriptionCompat() {
        MediaSessionCompat$QueueItem(getString(R.string.ntb_pin_setup_page_title));
        TextView textView = this.topTextView;
        onGetStartedClick.IconCompatParcelizer((Object) textView, "topTextView");
        textView.setText(getString(R.string.ntb_pin_setup_page_description));
        mo13676d_("ntb_pin_setup");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        setTitle(R.string.ntb_pin_setup_confirmation_page_title);
        TextView textView = this.topTextView;
        onGetStartedClick.IconCompatParcelizer((Object) textView, "topTextView");
        textView.setText(getString(R.string.ntb_pin_setup_confirmation_page_description));
        mo13676d_("ntb_pin_setup_confirmation");
    }

    public final void MediaBrowserCompat$MediaItem() {
        HmlSetNTBPinSuccessActivity.write write = HmlSetNTBPinSuccessActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlSetNTBPinSuccessActivity.class);
        intent.setFlags(1073741824);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onBackPressed() {
        ((RetrieveScanSettingsResponse) this.presenter).MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        onGetStartedClick.write((Object) menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    public final void RatingCompat() {
        super.onBackPressed();
    }
}
