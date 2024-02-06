package com.scb.phone.view.activity.transferandpay.billpayment;

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
import p040o.C7490sz;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory;
import p040o.TreeTypeAdapter;
import p040o.TypeAdapterRuntimeTypeWrapper;
import p040o.getReturnTransition;
import p040o.onActivityCreated;
import p040o.onGetStartedClick;
import p040o.show;
import p040o.showNow;

public final class BillPaymentSearchCoachMarkActivity extends BaseActivity implements IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory.write {
    @HmlPinActivity
    public C7490sz presenter;
    @BindView
    public ViewPager viewPager;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77152131492940);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        C7490sz szVar = this.presenter;
        if (szVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        szVar.MediaBrowserCompat$ItemReceiver(this);
        C7490sz szVar2 = this.presenter;
        if (szVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        show show = new show(szVar2.MediaBrowserCompat$CustomActionResultReceiver());
        TypeAdapterRuntimeTypeWrapper typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper(new showNow(show.write, new getReturnTransition(show.IconCompatParcelizer, TreeTypeAdapter.C38741.write)).write());
        if (szVar2.RatingCompat != null) {
            typeAdapterRuntimeTypeWrapper.IconCompatParcelizer(szVar2.RatingCompat);
        }
    }

    public final void read(int[] iArr) {
        onGetStartedClick.write((Object) iArr, "unSeenCoachMarkIds");
        CoachMarkViewPagerAdapter coachMarkViewPagerAdapter = new CoachMarkViewPagerAdapter(this, iArr);
        ViewPager viewPager2 = this.viewPager;
        if (viewPager2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewPager");
        }
        viewPager2.setAdapter(coachMarkViewPagerAdapter);
        coachMarkViewPagerAdapter.MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer(this);
    }

    static final class IconCompatParcelizer implements CoachMarkViewPagerAdapter.read {
        private /* synthetic */ BillPaymentSearchCoachMarkActivity write;

        IconCompatParcelizer(BillPaymentSearchCoachMarkActivity billPaymentSearchCoachMarkActivity) {
            this.write = billPaymentSearchCoachMarkActivity;
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

    public final void onDestroy() {
        C7490sz szVar = this.presenter;
        if (szVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        szVar.onDestroy();
        super.onDestroy();
    }

    public static final Intent MediaBrowserCompat$ItemReceiver(Context context) {
        onGetStartedClick.write((Object) context, "context");
        return new Intent(context, BillPaymentSearchCoachMarkActivity.class);
    }
}
