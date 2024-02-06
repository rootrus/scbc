package com.scb.phone.view.activity.profilemanagement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.fragment.profilemanagement.ProfileManagementFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_BindCloseAccountSuccessFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setSelectedDate;
import p040o.setTapText;
import p040o.setTitleMarginStart;

public class ProfileManagementActivity extends BaseActivity implements FragmentBuilder_BindCloseAccountSuccessFragment {
    public final int ExpandedMenuView() {
        return R.style.f95812131820798;
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context) {
        return new Intent(context, ProfileManagementActivity.class).putExtra("com.scb.phone.HANDLE_BACK_NAVIGATION_EXTRA", true);
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79472131493172);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.settings_profile_management));
        setTabContainer();
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.fragment_profile_management, new ProfileManagementFragment(), "PROFILE_MANAGEMENT_FRAGMENT_TAG").write();
        getSupportFragmentManager().MediaBrowserCompat$ItemReceiver((setTitleMarginStart.IconCompatParcelizer) new setSelectedDate(this));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.settings_profile_management));
        setTabContainer();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        if (getIntent().getBooleanExtra("com.scb.phone.HANDLE_BACK_NAVIGATION_EXTRA", false)) {
            Intent addFlags = new Intent(this, HomeActivity.class).putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.more_options_tab).addFlags(603979776);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, addFlags).read();
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
        } else {
            super.onBackPressed();
        }
    }

    public final void IconCompatParcelizer(String str) {
        setResult(-1);
        mo3028a_(str);
        MenuItemImpl();
    }
}
