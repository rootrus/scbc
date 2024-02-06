package com.scb.phone.view.activity.prelogin.quicktopup;

import android.content.Intent;
import com.scb.phone.R;
import com.scb.phone.view.activity.prelogin.QuickOperationSuccessActivity;
import com.scb.phone.view.activity.transferandpay.topup.TopUpReviewActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getUuidUtf8Bytes;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class QuickTopUpReviewActivity extends TopUpReviewActivity {
    public final String MediaSessionCompat$QueueItem() {
        return getString(R.string.review_quick_top_up);
    }

    public final void IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        Intent intent = new Intent(this, QuickOperationSuccessActivity.class);
        if (!(getuuidutf8bytes == null || getuuidutf8bytes.PlaybackStateCompat == null)) {
            setUuidFromUtf8Bytes setuuidfromutf8bytes = getuuidutf8bytes.PlaybackStateCompat;
            setuuidfromutf8bytes.setPadding = false;
            getuuidutf8bytes.PlaybackStateCompat = setuuidfromutf8bytes;
            intent.putExtra("com.scb.phone.EXTRA_SUCCESS", getuuidutf8bytes);
        }
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
        aj_();
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        setuuidfromutf8bytes.setActionBarHideOffset = setuuidfromutf8bytes.setActionBarHideOffset;
        super.write(setuuidfromutf8bytes);
    }
}
