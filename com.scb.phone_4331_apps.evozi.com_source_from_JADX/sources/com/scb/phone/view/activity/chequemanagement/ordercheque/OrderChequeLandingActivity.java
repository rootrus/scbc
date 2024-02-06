package com.scb.phone.view.activity.chequemanagement.ordercheque;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.chequemanagement.ordercheque.OrderChequeInputFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.CheckCaptureModule_GetIJsonExactionHelperKtaFactory;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setBaselineAligned;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.withExclusionStrategy;

public class OrderChequeLandingActivity extends BaseActivity implements CheckCaptureModule_GetIJsonExactionHelperKtaFactory.IconCompatParcelizer {
    @HmlPinActivity
    public withExclusionStrategy presenter;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79152131493140);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.order_cheque);
        setTabContainer();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        withExclusionStrategy withexclusionstrategy = this.presenter;
        withexclusionstrategy.read.write("DISPLAY_ORDER_CHEQUE");
        withexclusionstrategy.read.IconCompatParcelizer(new withExclusionStrategy.read(withexclusionstrategy, (byte) 0));
        mo13676d_("orderchq_landing");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.order_cheque);
        setTabContainer();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f93082131558413, menu);
        Drawable MediaBrowserCompat$MediaItem = setBaselineAligned.MediaBrowserCompat$MediaItem(menu.findItem(R.id.menu_action_help).getIcon().mutate());
        setBaselineAligned.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem, setLastBaselineToBottomHeight.read(this, R.color.f65582131099711));
        menu.findItem(R.id.menu_action_help).setIcon(MediaBrowserCompat$MediaItem);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_action_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent(getBaseContext(), OrderChequeHelpActivity.class);
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
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container_order_cheque, OrderChequeInputFragment.write(i)).write();
    }
}
