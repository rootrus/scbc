package p040o;

import android.view.View;
import com.scb.phone.view.adapter.demontb.IntroductionViewPagerAdapter;

/* renamed from: o.AppConfigService */
public final /* synthetic */ class AppConfigService implements View.OnClickListener {
    private final /* synthetic */ IntroductionViewPagerAdapter read;

    public /* synthetic */ AppConfigService(IntroductionViewPagerAdapter introductionViewPagerAdapter) {
        this.read = introductionViewPagerAdapter;
    }

    public final void onClick(View view) {
        this.read.IconCompatParcelizer.read(view);
    }
}
