package com.scb.phone.view.activity.bulktransfer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.bulktransfer.BulkTransferEmptyFragment;
import com.scb.phone.view.fragment.bulktransfer.BulkTransferGroupsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C10865shutdown;
import p040o.C7154iJ;
import p040o.C7155iK;
import p040o.C7159iO;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PersistedInstallationEntry;
import p040o.Provider;
import p040o.proxyGetICheckDeserializerRtti;
import p040o.readInstanceIdFromLocalStorage;
import p040o.setBaselineAligned;
import p040o.setChildDrawingOrderCallback;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.withFisError;

public class BulkTransferActivity extends BaseActivity implements proxyGetICheckDeserializerRtti.write {
    private BulkTransferDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;
    private BulkTransferDeepLinkActivity MediaMetadataCompat;
    @HmlPinActivity
    public withFisError bulkTransferPresenter;

    public static Intent write(Context context) {
        return new Intent(context, BulkTransferActivity.class);
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f76862131492911);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.bulkTransferPresenter.MediaBrowserCompat$ItemReceiver(this);
        withFisError withfiserror = this.bulkTransferPresenter;
        withfiserror.MediaBrowserCompat$ItemReceiver = withfiserror.write.IconCompatParcelizer.write();
        if (!withfiserror.MediaBrowserCompat$ItemReceiver) {
            withfiserror.write.IconCompatParcelizer.PlaybackStateCompat();
        }
        Provider provider = Provider.MediaBrowserCompat$CustomActionResultReceiver;
        if (withfiserror.RatingCompat != null) {
            provider.IconCompatParcelizer(withfiserror.RatingCompat);
        }
        withfiserror.write.write();
        withfiserror.write.IconCompatParcelizer(new withFisError.IconCompatParcelizer(withfiserror, (byte) 0));
        this.MediaBrowserCompat$SearchResultReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getBaseContext(), new IntentFilter("com.scb.phone/BROADCAST_SHOW_BULK_TRANSFER_TUTORIAL")).subscribe(new C7155iK(this), C7159iO.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaMetadataCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getBaseContext(), new IntentFilter("com.scb.phone/BROADCAST_RELOAD_BULK_TRANSFER")).subscribe(new C7154iJ(this), C7159iO.MediaBrowserCompat$CustomActionResultReceiver);
        setStackedBackground();
    }

    public void onDestroy() {
        super.onDestroy();
        this.bulkTransferPresenter.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$SearchResultReceiver;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$SearchResultReceiver.dispose();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2 = this.MediaMetadataCompat;
        if (bulkTransferDeepLinkActivity2 != null && !bulkTransferDeepLinkActivity2.isDisposed()) {
            this.MediaMetadataCompat.dispose();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f92992131558401, menu);
        Drawable MediaBrowserCompat$MediaItem = setBaselineAligned.MediaBrowserCompat$MediaItem(menu.findItem(R.id.menu_action_bulk_transfer_help).getIcon());
        setBaselineAligned.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem, setLastBaselineToBottomHeight.read(this, R.color.f71012131100257));
        menu.findItem(R.id.menu_action_bulk_transfer_help).setIcon(MediaBrowserCompat$MediaItem);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_action_bulk_transfer_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        withFisError withfiserror = this.bulkTransferPresenter;
        boolean z = false;
        if (withfiserror.MediaBrowserCompat$ItemReceiver) {
            PersistedInstallationEntry persistedInstallationEntry = PersistedInstallationEntry.MediaBrowserCompat$ItemReceiver;
            if (withfiserror.RatingCompat != null) {
                z = true;
            }
            if (z) {
                persistedInstallationEntry.IconCompatParcelizer(withfiserror.RatingCompat);
            }
        } else {
            withfiserror.MediaBrowserCompat$ItemReceiver = true;
            readInstanceIdFromLocalStorage readinstanceidfromlocalstorage = readInstanceIdFromLocalStorage.IconCompatParcelizer;
            if (withfiserror.RatingCompat != null) {
                readinstanceidfromlocalstorage.IconCompatParcelizer(withfiserror.RatingCompat);
            }
            PersistedInstallationEntry persistedInstallationEntry2 = PersistedInstallationEntry.MediaBrowserCompat$ItemReceiver;
            if (withfiserror.RatingCompat != null) {
                z = true;
            }
            if (z) {
                persistedInstallationEntry2.IconCompatParcelizer(withfiserror.RatingCompat);
            }
        }
        return true;
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.bulk_transfer);
        setTabContainer();
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
    }

    public final void IconCompatParcelizer(C10865shutdown shutdown) {
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.fragment_bulk_transfer_container, BulkTransferGroupsFragment.read(shutdown)).write();
    }

    public final void write(boolean z) {
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.fragment_bulk_transfer_container, BulkTransferEmptyFragment.IconCompatParcelizer(z)).write();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent(this, BulkTransferInfoActivity.class);
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

    public final void write() {
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_SHOW_BULK_TRANSFER_TUTORIAL");
        sendBroadcast(intent);
    }

    public static /* synthetic */ void read(BulkTransferActivity bulkTransferActivity) {
        withFisError withfiserror = bulkTransferActivity.bulkTransferPresenter;
        Provider provider = Provider.MediaBrowserCompat$CustomActionResultReceiver;
        if (withfiserror.RatingCompat != null) {
            provider.IconCompatParcelizer(withfiserror.RatingCompat);
        }
        withfiserror.write.write();
        withfiserror.write.IconCompatParcelizer(new withFisError.IconCompatParcelizer(withfiserror, (byte) 0));
    }
}
