package com.scb.phone.view.activity.easycash.creditpower;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.EasycashCreditPowerInputActivity;
import com.scb.phone.view.fragment.easycash.creditpower.EasycashCreditPowerInformationFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.asGzippedBytes;
import p040o.setTapText;

public class EasycashCreditPowerInformationActivity extends BaseActivity {
    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, asGzippedBytes asgzippedbytes, String str) {
        Intent intent = new Intent(context, EasycashCreditPowerInformationActivity.class);
        intent.putExtra("CREDIT_POWER_LOAN_DISPLAY", asgzippedbytes);
        intent.putExtra("EXTRA_MONTHLY_INCOME", str);
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
        super.onCreate(bundle);
        setContentView(R.layout.f77512131492976);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        if (getSupportFragmentManager().findFragmentById(R.id.container) instanceof EasycashCreditPowerInformationFragment) {
            EasycashCreditPowerInputActivity.IconCompatParcelizer((Context) this);
        } else {
            super.onBackPressed();
        }
    }
}
