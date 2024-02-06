package com.scb.phone.view.activity.bscanc;

import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.creditcard.CoachMarkViewPagerAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlPinActivity;
import p040o.onActivityCreated;
import p040o.onGetStartedClick;
import p040o.shouldSendSdkHeartBeat;

public final class QRPaymentCoachMarkActivity extends BaseActivity {
    public static final write MediaDescriptionCompat = new write((byte) 0);
    @HmlPinActivity
    public shouldSendSdkHeartBeat presenter;
    @BindView
    public ViewPager viewPager;

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77152131492940);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        shouldSendSdkHeartBeat shouldsendsdkheartbeat = this.presenter;
        if (shouldsendsdkheartbeat == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        List<Integer> MediaBrowserCompat$CustomActionResultReceiver = shouldsendsdkheartbeat.MediaBrowserCompat$CustomActionResultReceiver();
        shouldSendSdkHeartBeat shouldsendsdkheartbeat2 = this.presenter;
        if (shouldsendsdkheartbeat2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        shouldsendsdkheartbeat2.write();
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "unseenCoachMarks");
        Iterable<Integer> iterable = MediaBrowserCompat$CustomActionResultReceiver;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (Integer intValue : iterable) {
            arrayList.add(Integer.valueOf(intValue.intValue()));
        }
        CoachMarkViewPagerAdapter coachMarkViewPagerAdapter = new CoachMarkViewPagerAdapter(this, HmlNTBBusinessURLInformationActivity.IconCompatParcelizer((Collection<Integer>) (List) arrayList));
        ViewPager viewPager2 = this.viewPager;
        if (viewPager2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewPager");
        }
        viewPager2.setAdapter(coachMarkViewPagerAdapter);
        coachMarkViewPagerAdapter.MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer(this);
    }

    static final class IconCompatParcelizer implements CoachMarkViewPagerAdapter.read {
        private /* synthetic */ QRPaymentCoachMarkActivity write;

        IconCompatParcelizer(QRPaymentCoachMarkActivity qRPaymentCoachMarkActivity) {
            this.write = qRPaymentCoachMarkActivity;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(View view) {
            ViewPager viewPager = this.write.viewPager;
            if (viewPager == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewPager");
            }
            int currentItem = viewPager.getCurrentItem() + 1;
            ViewPager viewPager2 = this.write.viewPager;
            if (viewPager2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewPager");
            }
            onActivityCreated adapter = viewPager2.getAdapter();
            if (currentItem < (adapter != null ? adapter.getCount() : 0)) {
                ViewPager viewPager3 = this.write.viewPager;
                if (viewPager3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewPager");
                }
                viewPager3.setCurrentItem(currentItem);
                return;
            }
            this.write.setResult(-1);
            this.write.finish();
        }
    }
}
