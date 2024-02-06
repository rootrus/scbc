package com.scb.phone.view.activity.investment.scbs;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.investment.scbs.SCBSProductDetailFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;
import p040o.valueOrNull;

public class SCBSProductDetailActivity extends BaseActivityWithFragment {
    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, valueOrNull valueornull) {
        Intent intent = new Intent(context, SCBSProductDetailActivity.class);
        intent.putExtra("EXTRA_DISPLAY", valueornull);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return SCBSProductDetailFragment.IconCompatParcelizer((valueOrNull) getIntent().getParcelableExtra("EXTRA_DISPLAY"));
    }

    public final String au_() {
        return getIntent().getParcelableExtra("EXTRA_DISPLAY") instanceof valueOrNull ? ((valueOrNull) getIntent().getParcelableExtra("EXTRA_DISPLAY")).RatingCompat : "";
    }
}
