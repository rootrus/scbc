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
import p040o.FirebaseInstanceId;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlPinActivity;
import p040o.onActivityCreated;
import p040o.onGetStartedClick;

public final class MyQRCoachMarkActivity extends BaseActivity {
    public static final MyQRCoachMarkActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem = new MyQRCoachMarkActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    @HmlPinActivity
    public FirebaseInstanceId presenter;
    @BindView
    public ViewPager viewPager;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77152131492940);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        FirebaseInstanceId firebaseInstanceId = this.presenter;
        if (firebaseInstanceId == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        List<Integer> MediaBrowserCompat$CustomActionResultReceiver = firebaseInstanceId.MediaBrowserCompat$CustomActionResultReceiver();
        FirebaseInstanceId firebaseInstanceId2 = this.presenter;
        if (firebaseInstanceId2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        firebaseInstanceId2.write();
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
        coachMarkViewPagerAdapter.MediaBrowserCompat$CustomActionResultReceiver = new read(this);
    }

    static final class read implements CoachMarkViewPagerAdapter.read {
        private /* synthetic */ MyQRCoachMarkActivity IconCompatParcelizer;

        read(MyQRCoachMarkActivity myQRCoachMarkActivity) {
            this.IconCompatParcelizer = myQRCoachMarkActivity;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(View view) {
            ViewPager viewPager = this.IconCompatParcelizer.viewPager;
            if (viewPager == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewPager");
            }
            int currentItem = viewPager.getCurrentItem() + 1;
            ViewPager viewPager2 = this.IconCompatParcelizer.viewPager;
            if (viewPager2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewPager");
            }
            onActivityCreated adapter = viewPager2.getAdapter();
            if (adapter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            onGetStartedClick.IconCompatParcelizer((Object) adapter, "viewPager.adapter!!");
            if (currentItem < adapter.getCount()) {
                ViewPager viewPager3 = this.IconCompatParcelizer.viewPager;
                if (viewPager3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewPager");
                }
                viewPager3.setCurrentItem(currentItem);
                return;
            }
            this.IconCompatParcelizer.setResult(-1);
            this.IconCompatParcelizer.finish();
        }
    }

    public final void onBackPressed() {
        setResult(0);
        finish();
    }
}
