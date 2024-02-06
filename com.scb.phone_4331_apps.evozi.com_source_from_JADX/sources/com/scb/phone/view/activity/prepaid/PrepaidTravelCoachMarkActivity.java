package com.scb.phone.view.activity.prepaid;

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
import p040o.checkOffset;
import p040o.onActivityCreated;
import p040o.onGetStartedClick;

public final class PrepaidTravelCoachMarkActivity extends BaseActivity {
    @HmlPinActivity
    public checkOffset presenterPrepaid;
    @BindView
    public ViewPager viewPager;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77152131492940);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        checkOffset checkoffset = this.presenterPrepaid;
        if (checkoffset == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenterPrepaid");
        }
        List<Integer> MediaBrowserCompat$CustomActionResultReceiver = checkoffset.MediaBrowserCompat$CustomActionResultReceiver();
        checkOffset checkoffset2 = this.presenterPrepaid;
        if (checkoffset2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenterPrepaid");
        }
        checkoffset2.write();
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
        coachMarkViewPagerAdapter.MediaBrowserCompat$CustomActionResultReceiver = new write(this);
    }

    static final class write implements CoachMarkViewPagerAdapter.read {
        private /* synthetic */ PrepaidTravelCoachMarkActivity MediaBrowserCompat$CustomActionResultReceiver;

        write(PrepaidTravelCoachMarkActivity prepaidTravelCoachMarkActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = prepaidTravelCoachMarkActivity;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(View view) {
            ViewPager viewPager = this.MediaBrowserCompat$CustomActionResultReceiver.viewPager;
            if (viewPager == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewPager");
            }
            int currentItem = viewPager.getCurrentItem() + 1;
            ViewPager viewPager2 = this.MediaBrowserCompat$CustomActionResultReceiver.viewPager;
            if (viewPager2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewPager");
            }
            onActivityCreated adapter = viewPager2.getAdapter();
            if (adapter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            onGetStartedClick.IconCompatParcelizer((Object) adapter, "viewPager.adapter!!");
            if (currentItem < adapter.getCount()) {
                ViewPager viewPager3 = this.MediaBrowserCompat$CustomActionResultReceiver.viewPager;
                if (viewPager3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewPager");
                }
                viewPager3.setCurrentItem(currentItem);
                return;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.setResult(-1);
            this.MediaBrowserCompat$CustomActionResultReceiver.finish();
        }
    }

    public final void onBackPressed() {
        setResult(0);
        finish();
    }
}
