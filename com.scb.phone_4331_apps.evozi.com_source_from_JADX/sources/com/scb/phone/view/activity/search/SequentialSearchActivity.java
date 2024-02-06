package com.scb.phone.view.activity.search;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import butterknife.ButterKnife;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.search.C6173xc68a8b64;
import com.scb.phone.view.fragment.search.SequentialSearchFragment;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.TypeCastException;
import org.bouncycastle.i18n.MessageBundle;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Log;
import p040o.CardView;
import p040o.WeekPagerAdapter;
import p040o.onGetStartedClick;
import p040o.setRamUsed;
import p040o.setTitleMarginStart;

public abstract class SequentialSearchActivity extends BaseActivity implements WeekPagerAdapter {
    private HashMap<String, String> MediaBrowserCompat$SearchResultReceiver = new HashMap<>();
    private AutoValue_CrashlyticsReport_Session_Event_Log MediaMetadataCompat;

    /* access modifiers changed from: protected */
    public final HashMap<String, String> MediaSessionCompat$QueueItem() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public void onCreate(Bundle bundle) {
        Activity activity = this;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(activity);
        super.onCreate(bundle);
        setContentView(R.layout.f79882131493213);
        ButterKnife.MediaBrowserCompat$ItemReceiver(activity);
        MediaSessionCompat$Token();
        super.setStackedBackground();
        setTabContainer();
        MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver(0), "");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
    }

    public void MediaSessionCompat$Token() {
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Serializable serializable = extras.getSerializable("EXTRA_SEARCH_TYPE");
            if (serializable != null) {
                this.MediaMetadataCompat = (AutoValue_CrashlyticsReport_Session_Event_Log) serializable;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.search.SequentialSearchType");
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, String str, String str2) {
        onGetStartedClick.write((Object) str, "pageKey");
        onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.MediaBrowserCompat$SearchResultReceiver.put(str, str2);
        int i2 = i + 1;
        AutoValue_CrashlyticsReport_Session_Event_Log autoValue_CrashlyticsReport_Session_Event_Log = this.MediaMetadataCompat;
        if (autoValue_CrashlyticsReport_Session_Event_Log == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchType");
        }
        if (i2 >= autoValue_CrashlyticsReport_Session_Event_Log.write().size()) {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_SEARCH_RESULT", this.MediaBrowserCompat$SearchResultReceiver);
            setResult(-1, intent);
            finish();
            return;
        }
        MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver(i2), str2);
    }

    private final void MediaBrowserCompat$ItemReceiver(setRamUsed setramused, String str) {
        CardView read = getSupportFragmentManager().read();
        C6173xc68a8b64 sequentialSearchFragment$MediaBrowserCompat$CustomActionResultReceiver = SequentialSearchFragment.MediaBrowserCompat$CustomActionResultReceiver;
        AutoValue_CrashlyticsReport_Session_Event_Log autoValue_CrashlyticsReport_Session_Event_Log = this.MediaMetadataCompat;
        if (autoValue_CrashlyticsReport_Session_Event_Log == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchType");
        }
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Log, "searchType");
        onGetStartedClick.write((Object) setramused, "item");
        onGetStartedClick.write((Object) str, "previousValue");
        SequentialSearchFragment sequentialSearchFragment = new SequentialSearchFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("EXTRA_SEARCH_TYPE", autoValue_CrashlyticsReport_Session_Event_Log);
        bundle.putParcelable("EXTRA_PAGE_ITEM", setramused);
        bundle.putString("EXTRA_VALUE", str);
        sequentialSearchFragment.setArguments(bundle);
        read.MediaBrowserCompat$ItemReceiver(R.id.fragment_container, sequentialSearchFragment);
        read.MediaBrowserCompat$CustomActionResultReceiver(setramused.IconCompatParcelizer);
        read.write();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        setTitleMarginStart supportFragmentManager = getSupportFragmentManager();
        onGetStartedClick.IconCompatParcelizer((Object) supportFragmentManager, "supportFragmentManager");
        if (supportFragmentManager.write() == 1) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    private final setRamUsed MediaBrowserCompat$CustomActionResultReceiver(int i) {
        AutoValue_CrashlyticsReport_Session_Event_Log autoValue_CrashlyticsReport_Session_Event_Log = this.MediaMetadataCompat;
        if (autoValue_CrashlyticsReport_Session_Event_Log == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchType");
        }
        setRamUsed setramused = autoValue_CrashlyticsReport_Session_Event_Log.write().get(i);
        setramused.read = this.MediaBrowserCompat$SearchResultReceiver;
        return setramused;
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        super.MediaSessionCompat$QueueItem(str);
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "pageKey");
        this.MediaBrowserCompat$SearchResultReceiver.remove(str);
    }
}
