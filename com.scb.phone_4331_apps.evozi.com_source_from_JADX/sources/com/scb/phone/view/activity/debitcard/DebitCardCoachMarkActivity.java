package com.scb.phone.view.activity.debitcard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.creditcard.CoachMarkViewPagerAdapter;
import java.util.List;
import p040o.C7242lu;
import p040o.C7246ly;
import p040o.HmlPinActivity;
import p040o.getReturnTransition;
import p040o.nativeGetRow;
import p040o.show;
import p040o.showNow;

public class DebitCardCoachMarkActivity extends BaseActivity {
    @HmlPinActivity
    public nativeGetRow presenter;
    @BindView
    ViewPager viewPager;

    public static Intent IconCompatParcelizer(Context context) {
        return new Intent(context, DebitCardCoachMarkActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77152131492940);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        List<Integer> MediaBrowserCompat$CustomActionResultReceiver = this.presenter.MediaBrowserCompat$CustomActionResultReceiver();
        this.presenter.write();
        show show = new show(MediaBrowserCompat$CustomActionResultReceiver);
        CoachMarkViewPagerAdapter coachMarkViewPagerAdapter = new CoachMarkViewPagerAdapter(this, new showNow(show.write, new getReturnTransition(show.IconCompatParcelizer, C7242lu.MediaBrowserCompat$ItemReceiver)).write());
        this.viewPager.setAdapter(coachMarkViewPagerAdapter);
        coachMarkViewPagerAdapter.MediaBrowserCompat$CustomActionResultReceiver = new C7246ly(this);
    }

    public /* synthetic */ void lambda$onCreate$0$DebitCardCoachMarkActivity(View view) {
        int currentItem = this.viewPager.getCurrentItem() + 1;
        if (currentItem < this.viewPager.getAdapter().getCount()) {
            this.viewPager.setCurrentItem(currentItem);
        } else {
            finish();
        }
    }
}
