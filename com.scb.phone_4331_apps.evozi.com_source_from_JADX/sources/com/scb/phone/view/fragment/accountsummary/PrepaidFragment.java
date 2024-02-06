package com.scb.phone.view.fragment.accountsummary;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prepaid.PrepaidDetailsActivity;
import com.scb.phone.view.adapter.accountsummary.C5726xd4cdc3cd;
import com.scb.phone.view.adapter.accountsummary.PrepaidViewPagerAdapter;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.BulkTransferDeepLinkActivity;
import p040o.CheckCaptureModule$a$MediaSessionCompat$ResultReceiverWrapper;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.cancelRpRequest;
import p040o.confirmRpRequest;
import p040o.getIdps;
import p040o.getKernelIDDstAtop;
import p040o.getModelClass;
import p040o.getStaticTiles;
import p040o.getStatusRpRequest;
import p040o.getStoredBuildInstanceIdentifier;
import p040o.isSimulator;
import p040o.setChildDrawingOrderCallback;
import p040o.setTapText;

public class PrepaidFragment extends BaseCardFragment implements CheckCaptureModule$a$MediaSessionCompat$ResultReceiverWrapper, C5726xd4cdc3cd {
    private getModelClass MediaBrowserCompat$MediaItem;
    private PrepaidViewPagerAdapter MediaBrowserCompat$SearchResultReceiver;
    private getKernelIDDstAtop MediaDescriptionCompat;
    private BulkTransferDeepLinkActivity RatingCompat;
    @HmlPinActivity
    public getStoredBuildInstanceIdentifier prepaidCardPresenter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85562131493783, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaBrowserCompat$ItemReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_SWIPE_REFRESH")).subscribe(new cancelRpRequest(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.IconCompatParcelizer = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_HOME_ACTIVITY_REFRESH")).subscribe(new confirmRpRequest(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.MediaMetadataCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_REGISTERED_ACCOUNTS_UPDATED")).subscribe(new getStaticTiles(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.RatingCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_PREPAID_LOCK_CARD_REFRESH")).subscribe(new getStatusRpRequest(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.prepaidCardPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaDescriptionCompat = new getKernelIDDstAtop();
        return inflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.prepaidCardPresenter.IconCompatParcelizer();
    }

    public void onDestroy() {
        getStoredBuildInstanceIdentifier getstoredbuildinstanceidentifier = this.prepaidCardPresenter;
        if (getstoredbuildinstanceidentifier != null) {
            getstoredbuildinstanceidentifier.onDestroy();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.RatingCompat;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.RatingCompat.dispose();
        }
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(getModelClass getmodelclass) {
        this.MediaBrowserCompat$MediaItem = getmodelclass;
        List<isSimulator> list = getmodelclass.MediaBrowserCompat$CustomActionResultReceiver;
        if (list.isEmpty()) {
            RelativeLayout relativeLayout = this.mParentLayout;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
                return;
            }
            return;
        }
        this.MediaBrowserCompat$SearchResultReceiver = new PrepaidViewPagerAdapter(getContext(), list, this);
        this.mViewPager.setAdapter(this.MediaBrowserCompat$SearchResultReceiver);
        this.mViewPager.setClipToPadding(false);
        this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0, getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0);
        this.mCircleIndicator.setViewPager(this.mViewPager);
        if (list.size() >= 10) {
            this.mCircleIndicator.setVisibility(8);
        } else {
            this.mCircleIndicator.setVisibility(0);
        }
        RelativeLayout relativeLayout2 = this.mParentLayout;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
    }

    public final void write(int i) {
        isSimulator issimulator = this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver.get(i);
        this.MediaDescriptionCompat.read("cardtype", getStoredBuildInstanceIdentifier.IconCompatParcelizer(issimulator) ? "prepaid_planetscb" : "prepaid_m");
        getKernelIDDstAtop getkerneliddstatop = this.MediaDescriptionCompat;
        if (getActivity() != null) {
            getkerneliddstatop.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "accountsummary_prepaid");
        }
        Intent MediaBrowserCompat$ItemReceiver = PrepaidDetailsActivity.MediaBrowserCompat$ItemReceiver(getContext(), this.MediaBrowserCompat$MediaItem, issimulator, i);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$ItemReceiver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
