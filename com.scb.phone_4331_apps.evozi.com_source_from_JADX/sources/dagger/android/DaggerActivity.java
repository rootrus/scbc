package dagger.android;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import p040o.AlertController$RecycleListView;
import p040o.HmlPinActivity;

public abstract class DaggerActivity extends Activity {
    @HmlPinActivity
    DispatchingAndroidInjector<Fragment> fragmentInjector;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
    }
}
