package com.scb.phone.view.activity.fastpay;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.BaseOtpActivity;
import p040o.HmlPinActivity;
import p040o.finalizePreviousNativeSession;
import p040o.nativeReleaseFileBuffer;
import p040o.nativeWriteJpegImage;
import p040o.recordLockedRead;
import p040o.setExpirationMonth;

public class FastPayOtpActivity extends BaseOtpActivity implements setExpirationMonth {
    @HmlPinActivity
    public nativeWriteJpegImage presenter;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(String str, String str2) {
        nativeWriteJpegImage nativewritejpegimage = this.presenter;
        String stringExtra = getIntent().getStringExtra("com.scb.phone.FastPaySettingActivity.EXTRA_FAST_PAY_SELECTED_ACCOUNT");
        String stringExtra2 = getIntent().getStringExtra("com.scb.phone.FastPaySettingActivity.EXTRA_FAST_PAY_SELECTED_LIMIT_AMOUNT");
        nativeReleaseFileBuffer nativereleasefilebuffer = nativeReleaseFileBuffer.read;
        if (nativewritejpegimage.RatingCompat != null) {
            nativereleasefilebuffer.IconCompatParcelizer(nativewritejpegimage.RatingCompat);
        }
        nativewritejpegimage.read.MediaBrowserCompat$CustomActionResultReceiver(recordLockedRead.write(stringExtra, stringExtra2), str, str2);
        nativewritejpegimage.read.IconCompatParcelizer(new nativeWriteJpegImage.IconCompatParcelizer(nativewritejpegimage, (byte) 0));
    }

    public final void write(finalizePreviousNativeSession finalizepreviousnativesession) {
        Intent intent = new Intent();
        intent.putExtra("com.scb.phone.FastPaySettingActivity.EXTRA_FAST_PAY_PROFILE", finalizepreviousnativesession);
        setResult(-1, intent);
        finish();
    }
}
