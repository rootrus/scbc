package com.scb.phone.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.address.AddressSearchFragment;
import p040o.C10881getCAR;
import p040o.CrashlyticsReportJsonTransform$$Lambda$8;
import p040o.DefaultSettingsSpiCall;
import p040o.FeaturesSettingsData;
import p040o.HmlPinActivity;
import p040o.IndoorLevel;
import p040o.ListenableFutureTask;
import p040o.SettingsData;
import p040o.SettingsV3JsonTransform;
import p040o.addDelayedShutdownHook;
import p040o.getCodeline;
import p040o.getFeaturesData;

public class AddressSearchActivity extends BaseActivity implements C10881getCAR.IconCompatParcelizer, getCodeline {
    private addDelayedShutdownHook MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public DefaultSettingsSpiCall presenter;

    public static Intent read(Context context, String str) {
        return new Intent(context, AddressSearchActivity.class).putExtra("com.scb.phone.view.activity.easycash.EXTRA_SEARCH_TITLE", str);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f80012131493226);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        String stringExtra = getIntent().getStringExtra("com.scb.phone.view.activity.easycash.EXTRA_SEARCH_TITLE");
        boolean z = false;
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = getString(R.string.address_subsitrict_search_title);
        }
        MediaSessionCompat$QueueItem(stringExtra);
        setTabContainer();
        this.MediaBrowserCompat$SearchResultReceiver = new addDelayedShutdownHook();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        DefaultSettingsSpiCall defaultSettingsSpiCall = this.presenter;
        if (defaultSettingsSpiCall.RatingCompat != null) {
            z = true;
        }
        if (z) {
            defaultSettingsSpiCall.RatingCompat.AlertController$RecycleListView();
        }
        IndoorLevel indoorLevel = defaultSettingsSpiCall.write;
        indoorLevel.read(indoorLevel.MediaBrowserCompat$ItemReceiver.read(), new getFeaturesData(defaultSettingsSpiCall), new FeaturesSettingsData(defaultSettingsSpiCall));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    public final void IconCompatParcelizer(addDelayedShutdownHook adddelayedshutdownhook) {
        this.MediaBrowserCompat$SearchResultReceiver.RatingCompat = adddelayedshutdownhook.RatingCompat;
        this.MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat = adddelayedshutdownhook.MediaMetadataCompat;
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver = adddelayedshutdownhook.MediaBrowserCompat$SearchResultReceiver;
        this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer = null;
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver = null;
        this.MediaBrowserCompat$SearchResultReceiver.read = null;
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$MediaItem = null;
        this.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$QueueItem = null;
        this.MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat = null;
    }

    public final void read(addDelayedShutdownHook adddelayedshutdownhook) {
        this.MediaBrowserCompat$SearchResultReceiver.read = adddelayedshutdownhook.read;
        this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer = adddelayedshutdownhook.IconCompatParcelizer;
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver = adddelayedshutdownhook.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$MediaItem = null;
        this.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$QueueItem = null;
        this.MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat = null;
    }

    public final void write(addDelayedShutdownHook adddelayedshutdownhook) {
        this.MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat = adddelayedshutdownhook.MediaDescriptionCompat;
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$MediaItem = adddelayedshutdownhook.MediaBrowserCompat$MediaItem;
        this.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$QueueItem = adddelayedshutdownhook.MediaSessionCompat$QueueItem;
    }

    public final void write(String str) {
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void write(ListenableFutureTask listenableFutureTask) {
        DefaultSettingsSpiCall defaultSettingsSpiCall = this.presenter;
        addDelayedShutdownHook adddelayedshutdownhook = this.MediaBrowserCompat$SearchResultReceiver;
        CrashlyticsReportJsonTransform$$Lambda$8 crashlyticsReportJsonTransform$$Lambda$8 = listenableFutureTask.IconCompatParcelizer;
        if (defaultSettingsSpiCall.RatingCompat != null) {
            defaultSettingsSpiCall.RatingCompat.AlertController$RecycleListView();
        }
        IndoorLevel indoorLevel = defaultSettingsSpiCall.write;
        indoorLevel.read(indoorLevel.MediaBrowserCompat$ItemReceiver.write(adddelayedshutdownhook.MediaMetadataCompat, adddelayedshutdownhook.IconCompatParcelizer, adddelayedshutdownhook.MediaBrowserCompat$MediaItem), new SettingsV3JsonTransform(defaultSettingsSpiCall, crashlyticsReportJsonTransform$$Lambda$8, adddelayedshutdownhook), new SettingsData(defaultSettingsSpiCall));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent();
        intent.putExtra("SUB_DISTRICT_DISPLAY", this.MediaBrowserCompat$SearchResultReceiver);
        setResult(-1, intent);
        finish();
    }

    public final void IconCompatParcelizer(String str) {
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = str;
        Intent intent = new Intent();
        intent.putExtra("SUB_DISTRICT_DISPLAY", this.MediaBrowserCompat$SearchResultReceiver);
        setResult(-1, intent);
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(ListenableFutureTask listenableFutureTask) {
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container_address, AddressSearchFragment.IconCompatParcelizer(listenableFutureTask)).MediaBrowserCompat$CustomActionResultReceiver((String) null).write();
    }

    public final void read(ListenableFutureTask listenableFutureTask) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container_address, AddressSearchFragment.IconCompatParcelizer(listenableFutureTask)).write();
    }

    public final void IconCompatParcelizer(ListenableFutureTask listenableFutureTask, Throwable th) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container_address, AddressSearchFragment.IconCompatParcelizer(listenableFutureTask, th)).write();
    }
}
