package com.scb.phone.view.activity.remittance;

import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.creditcard.CoachMarkViewPagerAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.C5080ny;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlPinActivity;
import p040o.getKernelIDDstOver;
import p040o.onGetStartedClick;

public final class RemittanceCoachmarkActivity extends BaseActivity {
    public static final write MediaBrowserCompat$MediaItem = new write((byte) 0);
    @HmlPinActivity
    public C5080ny presenter;
    @BindView
    public ViewPager viewPager;

    public RemittanceCoachmarkActivity() {
        new getKernelIDDstOver();
    }

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
        C5080ny nyVar = this.presenter;
        if (nyVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        List<Integer> MediaBrowserCompat$CustomActionResultReceiver = nyVar.MediaBrowserCompat$CustomActionResultReceiver();
        C5080ny nyVar2 = this.presenter;
        if (nyVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nyVar2.write();
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
        coachMarkViewPagerAdapter.MediaBrowserCompat$CustomActionResultReceiver = new RemittanceCoachmarkActivity$MediaBrowserCompat$ItemReceiver(this);
    }

    public final void onBackPressed() {
        setResult(0);
        finish();
    }
}
