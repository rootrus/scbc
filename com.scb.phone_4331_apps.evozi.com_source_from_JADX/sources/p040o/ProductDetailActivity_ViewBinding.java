package p040o;

import android.app.Application;
import android.content.Context;
import com.google.firebase.FirebaseApp;
import java.security.Security;
import p040o.TileAdapter;

/* renamed from: o.ProductDetailActivity_ViewBinding */
public final class ProductDetailActivity_ViewBinding extends Application {
    public static Context MediaBrowserCompat$CustomActionResultReceiver;

    public final void onCreate() {
        super.onCreate();
        Security.insertProviderAt(new TileAdapter.StaticShortcutHolder(), 1);
        onFilterButtonClick onfilterbuttonclick = new onFilterButtonClick();
        onfilterbuttonclick.write = "https://api.beid.io";
        RewardSearchResultActivity_ViewBinding.IconCompatParcelizer(onfilterbuttonclick);
        Context applicationContext = getApplicationContext();
        MediaBrowserCompat$CustomActionResultReceiver = applicationContext;
        FirebaseApp.initializeApp(applicationContext);
    }
}
