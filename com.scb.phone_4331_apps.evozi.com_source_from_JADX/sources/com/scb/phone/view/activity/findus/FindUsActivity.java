package com.scb.phone.view.activity.findus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.findus.FindUsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.CardView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class FindUsActivity extends BaseActivity {
    public static Intent IconCompatParcelizer(Context context, boolean z) {
        Intent intent = new Intent(context, FindUsActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_CARDLESS_FIND_US_ATM", false);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77922131493017);
        FindUsFragment IconCompatParcelizer = FindUsFragment.IconCompatParcelizer(getIntent().getBooleanExtra("com.scb.phone.EXTRA_CARDLESS_FIND_US_ATM", false));
        CardView read = getSupportFragmentManager().read();
        read.write(R.id.fragment_select_province_district_container, IconCompatParcelizer, getString(R.string.find_us_fragment_tag));
        read.write();
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, boolean z) {
        Intent intent = new Intent(context, FindUsActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_CARDLESS_FIND_US_ATM", z);
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
}
