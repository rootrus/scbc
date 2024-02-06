package dagger.android.support;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import dagger.android.DispatchingAndroidInjector;
import p040o.AlertController$RecycleListView;
import p040o.HmlPinActivity;
import p040o.ProductDetailActivity;

public abstract class DaggerAppCompatActivity extends AppCompatActivity implements ProductDetailActivity {
    @HmlPinActivity
    DispatchingAndroidInjector<Fragment> frameworkFragmentInjector;
    @HmlPinActivity
    DispatchingAndroidInjector<androidx.fragment.app.Fragment> supportFragmentInjector;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
    }
}
