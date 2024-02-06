package com.scb.phone.view.activity.ntb.fatca;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.findus.FindUsActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.lang.ref.WeakReference;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_BindDepositMoreInfoFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class FatcaErrorActivity extends BaseActivity {
    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77892131493014);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        Intent intent = getIntent();
        if (intent != null) {
            setTitle(intent.getIntExtra("EXTRA_TITLE", 0));
        }
    }

    @OnClick
    public void openFindUs() {
        Intent intent = new Intent(this, FindUsActivity.class);
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

    @OnClick
    public void openHome() {
        FragmentBuilder_BindDepositMoreInfoFragment.write((WeakReference<BaseActivity>) new WeakReference(this));
    }
}
