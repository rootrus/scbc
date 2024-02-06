package com.scb.phone.view.activity.easycash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.easycash.EasycashSuccessFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.CardView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.dropBreadcrumb;
import p040o.setTapText;

public class EasycashSuccessActivity extends BaseActivity {
    public void onBackPressed() {
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, List<dropBreadcrumb> list, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intent intent = new Intent(context, EasycashSuccessActivity.class);
        intent.putParcelableArrayListExtra("com.scb.phone.SUCCESS_EXTRA_DISPLAY", (ArrayList) list);
        intent.putExtra("com.scb.phone.SUCCESS_PRODUCT_GROUP", str);
        intent.putExtra("com.scb.phone.SUCCESS_PRODUCT_TYPE", str2);
        intent.putExtra("com.scb.phone.SUCCESS_TRANSACTION_ID", str3);
        intent.putExtra("com.scb.phone.SUCCESS_NCB_TRANSACTION_ID", str4);
        intent.putExtra("com.scb.phone.SUCCESS_TRANSACTION_TIME", str5);
        intent.putExtra("com.scb.phone.SUCCESS_REMAINING_BALANCE", str6);
        intent.putExtra("com.scb.phone.SUCCESS_AMOUNT", str7);
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

    public static void MediaBrowserCompat$ItemReceiver(Context context, List<dropBreadcrumb> list, String str, String str2, String str3, String str4, String str5, String str6) {
        Intent intent = new Intent(context, EasycashSuccessActivity.class);
        intent.putParcelableArrayListExtra("com.scb.phone.SUCCESS_EXTRA_DISPLAY", (ArrayList) list);
        intent.putExtra("com.scb.phone.SUCCESS_PRODUCT_GROUP", str);
        intent.putExtra("com.scb.phone.SUCCESS_PRODUCT_TYPE", str2);
        intent.putExtra("com.scb.phone.SUCCESS_TRANSACTION_ID", str3);
        intent.putExtra("com.scb.phone.SUCCESS_NCB_TRANSACTION_ID", str4);
        intent.putExtra("com.scb.phone.SUCCESS_TRANSACTION_TIME", str5);
        intent.putExtra("com.scb.phone.SUCCESS_REMAINING_BALANCE", str6);
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

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77632131492988);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        if (getIntent().getParcelableArrayListExtra("com.scb.phone.SUCCESS_EXTRA_DISPLAY") != null) {
            CardView read = getSupportFragmentManager().read();
            read.MediaBrowserCompat$CustomActionResultReceiver(R.id.fragment_container, EasycashSuccessFragment.MediaBrowserCompat$ItemReceiver(getIntent().getParcelableArrayListExtra("com.scb.phone.SUCCESS_EXTRA_DISPLAY"), getIntent().getStringExtra("com.scb.phone.SUCCESS_PRODUCT_GROUP"), getIntent().getStringExtra("com.scb.phone.SUCCESS_PRODUCT_TYPE"), getIntent().getStringExtra("com.scb.phone.SUCCESS_TRANSACTION_ID"), getIntent().getStringExtra("com.scb.phone.SUCCESS_NCB_TRANSACTION_ID"), getIntent().getStringExtra("com.scb.phone.SUCCESS_TRANSACTION_TIME"), getIntent().getStringExtra("com.scb.phone.SUCCESS_REMAINING_BALANCE"), getIntent().getStringExtra("com.scb.phone.SUCCESS_AMOUNT")));
            read.write();
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
