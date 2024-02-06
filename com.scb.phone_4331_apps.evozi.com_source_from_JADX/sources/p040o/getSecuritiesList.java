package p040o;

import android.view.View;
import com.scb.phone.view.adapter.prelogin.PreLoginTutorialViewPagerAdapter;

/* renamed from: o.getSecuritiesList */
public final /* synthetic */ class getSecuritiesList implements View.OnClickListener {
    private final /* synthetic */ PreLoginTutorialViewPagerAdapter.TutorialItemHolder read;

    public /* synthetic */ getSecuritiesList(PreLoginTutorialViewPagerAdapter.TutorialItemHolder tutorialItemHolder) {
        this.read = tutorialItemHolder;
    }

    public final void onClick(View view) {
        PreLoginTutorialViewPagerAdapter.TutorialItemHolder tutorialItemHolder = this.read;
        if (PreLoginTutorialViewPagerAdapter.this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            PreLoginTutorialViewPagerAdapter.this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token();
        }
    }
}
