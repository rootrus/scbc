package com.scb.phone.view.activity.forgotpin;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseOtpActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.OcrFailureData;
import p040o.access$2200;
import p040o.access$2300;
import p040o.forEachDstOver;
import p040o.getDocumentState;
import p040o.getOversizeImage;
import p040o.setTapText;

public class ForgotPinOtpActivity extends BaseOtpActivity implements getDocumentState {
    private forEachDstOver MediaBrowserCompat$MediaItem = new forEachDstOver();
    @HmlPinActivity
    public OcrFailureData presenter;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "forgot_pin_verify_mobile");
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "forgot_pin_otp");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void write(String str, String str2) {
        OcrFailureData ocrFailureData = this.presenter;
        if (ocrFailureData.RatingCompat != null) {
            ocrFailureData.RatingCompat.AlertController$RecycleListView();
        }
        ocrFailureData.write.write(str, str2);
        ocrFailureData.write.IconCompatParcelizer(new OcrFailureData.write(ocrFailureData, (byte) 0));
    }

    /* renamed from: K_ */
    public final void mo13720K_() {
        Intent intent = new Intent(this, SetupNewPinActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer(String str) {
        write(this, R.id.root_activity, str, getOversizeImage.ERROR);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.common_error);
        access_2200.IconCompatParcelizer = getString(R.string.session_expired);
        access$2300 access_2300 = new access$2300();
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        access_2300.read = access$2300.write.LOGOUT;
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }
}
