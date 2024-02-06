package p040o;

import com.scb.phone.view.activity.HomeActivity;

/* renamed from: o.BundleCacheProvider */
public final /* synthetic */ class BundleCacheProvider implements Runnable {
    private final /* synthetic */ HomeActivity read;

    public /* synthetic */ BundleCacheProvider(HomeActivity homeActivity) {
        this.read = homeActivity;
    }

    public final void run() {
        HomeActivity homeActivity = this.read;
        homeActivity.moneyOutTutorial.setVisibility(8);
        homeActivity.moneyOutTutorial.setAlpha(1.0f);
        homeActivity.mBottomNavigationView.setVisibility(0);
    }
}
