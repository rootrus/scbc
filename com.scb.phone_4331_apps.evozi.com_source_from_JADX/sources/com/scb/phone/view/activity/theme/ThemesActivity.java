package com.scb.phone.view.activity.theme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import p040o.AlertController$RecycleListView;
import p040o.C5192rH;
import p040o.C5415sn;
import p040o.HmlPinActivity;
import p040o.LogFileManager;
import p040o.getSpotNoise;

public class ThemesActivity extends BaseActivity implements getSpotNoise {
    @HmlPinActivity
    public C5192rH themesPresenter;

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, LogFileManager.DirectoryProvider directoryProvider) {
        Intent intent = new Intent(context, ThemesActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_PRELOAD_CHECK", directoryProvider);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        boolean z = true;
        requestWindowFeature(1);
        setContentView(R.layout.f80072131493232);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.themesPresenter.MediaBrowserCompat$ItemReceiver(this);
        if (getIntent() != null && getIntent().getExtras() != null && getIntent().getExtras().getParcelable("com.scb.phone.EXTRA_PRELOAD_CHECK") != null) {
            LogFileManager.DirectoryProvider directoryProvider = (LogFileManager.DirectoryProvider) getIntent().getExtras().getParcelable("com.scb.phone.EXTRA_PRELOAD_CHECK");
            C5192rH rHVar = this.themesPresenter;
            rHVar.IconCompatParcelizer = directoryProvider;
            C5415sn snVar = C5415sn.MediaBrowserCompat$ItemReceiver;
            if (rHVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                snVar.IconCompatParcelizer(rHVar.RatingCompat);
            }
            if (directoryProvider.f2754x50fd9e4a != null) {
                rHVar.read.IconCompatParcelizer(rHVar.write.mo26549c_(directoryProvider.f2754x50fd9e4a.IconCompatParcelizer));
                rHVar.read.IconCompatParcelizer(new C5192rH.write(directoryProvider.f2754x50fd9e4a));
            }
        }
    }

    public void onDestroy() {
        this.themesPresenter.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer(LogFileManager.DirectoryProvider directoryProvider) {
        HomeActivity.read((Context) this, directoryProvider);
        finish();
    }
}
