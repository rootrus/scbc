package com.scb.phone.view.activity.mwpartner;

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
import p040o.AuroraView;
import p040o.HmlPinActivity;
import p040o.addOnTaskCompletedListener;
import p040o.detectPreviewFrame;
import p040o.getReturnTransition;
import p040o.show;
import p040o.showNow;

public class MwCoachMarkActivity extends BaseActivity {
    private CoachMarkViewPagerAdapter MediaMetadataCompat;
    @HmlPinActivity
    public addOnTaskCompletedListener mwCoachMarkPresenter;
    @BindView
    ViewPager viewPager;

    public static Intent read(Context context) {
        return new Intent(context, MwCoachMarkActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78822131493107);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        addOnTaskCompletedListener addontaskcompletedlistener = this.mwCoachMarkPresenter;
        boolean z = addontaskcompletedlistener.IconCompatParcelizer.read.write().MediaSessionCompat$ResultReceiverWrapper.MediaSessionCompat$Token;
        List<Integer> MediaBrowserCompat$CustomActionResultReceiver = addontaskcompletedlistener.MediaBrowserCompat$CustomActionResultReceiver();
        if (!z) {
            MediaBrowserCompat$CustomActionResultReceiver.remove(5);
        }
        this.mwCoachMarkPresenter.write();
        show show = new show(MediaBrowserCompat$CustomActionResultReceiver);
        CoachMarkViewPagerAdapter coachMarkViewPagerAdapter = new CoachMarkViewPagerAdapter(this, new showNow(show.write, new getReturnTransition(show.IconCompatParcelizer, detectPreviewFrame.IconCompatParcelizer)).write());
        this.MediaMetadataCompat = coachMarkViewPagerAdapter;
        this.viewPager.setAdapter(coachMarkViewPagerAdapter);
        this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver = new AuroraView.AuroraColorChangeListener(this);
    }

    public /* synthetic */ void lambda$onCreate$0$MwCoachMarkActivity(View view) {
        int currentItem = this.viewPager.getCurrentItem() + 1;
        if (currentItem < this.viewPager.getAdapter().getCount()) {
            this.viewPager.setCurrentItem(currentItem);
        } else {
            finish();
        }
    }
}
