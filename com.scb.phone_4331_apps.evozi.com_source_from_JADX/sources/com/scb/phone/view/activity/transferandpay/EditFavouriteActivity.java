package com.scb.phone.view.activity.transferandpay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.remittance.RemittanceLandingActivity;
import com.scb.phone.view.activity.transferandpay.transfer.AddFavoriteTransferActivity;
import com.scb.phone.view.fragment.transferandpay.EditFavouriteFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.AlertController$RecycleListView;
import p040o.C3092xce3d994b;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getOversizeImage;
import p040o.setTapText;

public class EditFavouriteActivity extends BaseActivity {
    private String MediaDescriptionCompat;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77702131492995);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        String stringExtra = getIntent().getStringExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TITLE");
        this.MediaDescriptionCompat = getIntent().getStringExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TAG");
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(stringExtra);
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, EditFavouriteFragment.write(this.MediaDescriptionCompat)).write();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!"TRANSFER".equals(this.MediaDescriptionCompat)) {
            return true;
        }
        getMenuInflater().inflate(R.menu.f92982131558400, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_add_favorite) {
            return super.onOptionsItemSelected(menuItem);
        }
        if ("TRANSFER".equals(this.MediaDescriptionCompat)) {
            Intent intent = new Intent(this, AddFavoriteTransferActivity.class);
            IntentTidInjectionActivityAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivityForResult(read, 101);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return true;
            }
        } else if (!"REMITTANCE".equals(this.MediaDescriptionCompat)) {
            return true;
        } else {
            Intent write2 = RemittanceLandingActivity.write(this, C3092xce3d994b.Builder.ADD_FAVOURITE);
            IntentTidInjectionActivityAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(this, write2).read();
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                sb2.append(read2.getData());
                sb2.append("\n with context ");
                sb2.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb2.toString());
                startActivityForResult(read2, 102);
                return true;
            } catch (Throwable th2) {
                th2.printStackTrace();
                return true;
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 101 && i2 == -1) {
            write(this, R.id.success_view_container, getString(R.string.new_favorite_success), getOversizeImage.SUCCESS);
        } else if (i == 102 && i2 == -1) {
            write(this, R.id.success_view_container, getString(R.string.new_remittance_favorite_success), getOversizeImage.SUCCESS);
        }
    }
}
