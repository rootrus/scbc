package com.scb.phone.view.activity.etb;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.ntb.ReviewInfoResultActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class ETBOtp9100ErrorActivity extends ReviewInfoResultActivity {
    public static Intent write(Context context) {
        Intent intent = new Intent(context, ETBOtp9100ErrorActivity.class);
        intent.putExtra("EXTRA_IMAGE_ID", R.drawable.ic_notice);
        intent.putExtra("EXTRA_PAGE_TITLE", context.getString(R.string.ntb_fillinformation_review_info_result_error_title_page));
        intent.putExtra("EXTRA_TITLE", context.getString(R.string.ntb_fillinformation_review_info_error_title));
        intent.putExtra("EXTRA_DESCRIPTION", context.getString(R.string.ntb_fillinformation_review_info_error_description));
        return intent;
    }

    public void returnHome() {
        Intent IconCompatParcelizer = HomeActivity.IconCompatParcelizer((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
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
}
