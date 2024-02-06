package com.scb.phone.view.activity.bankingagent;

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
import p040o.isRepeatingSequence;
import p040o.onActivityCreated;
import p040o.onGetStartedClick;

public final class ServiceAtBankingAgentCoachMarkActivity extends BaseActivity {
    public static final read MediaDescriptionCompat = new read((byte) 0);
    @HmlPinActivity
    public isRepeatingSequence presenter;
    @BindView
    public ViewPager viewPager;

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77152131492940);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        isRepeatingSequence isrepeatingsequence = this.presenter;
        if (isrepeatingsequence == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        List<Integer> MediaBrowserCompat$CustomActionResultReceiver = isrepeatingsequence.MediaBrowserCompat$CustomActionResultReceiver();
        isRepeatingSequence isrepeatingsequence2 = this.presenter;
        if (isrepeatingsequence2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        isrepeatingsequence2.write();
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
        private /* synthetic */ ServiceAtBankingAgentCoachMarkActivity IconCompatParcelizer;

        IconCompatParcelizer(ServiceAtBankingAgentCoachMarkActivity serviceAtBankingAgentCoachMarkActivity) {
            this.IconCompatParcelizer = serviceAtBankingAgentCoachMarkActivity;
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
            if (currentItem < (adapter != null ? adapter.getCount() : 0)) {
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
}
