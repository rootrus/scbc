package com.scb.phone.view.fragment.accountsummary;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.loan.LoanDetailActivity;
import com.scb.phone.view.adapter.accountsummary.LoanViewPagerAdapter;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.CheckCaptureModule$a$MediaBrowserCompat$SearchResultReceiver;
import p040o.FragmentBuilder_BindBaseReplaceableFragment;
import p040o.Futures;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.NdidService;
import p040o.ZSYR2K;
import p040o.defaultSettings;
import p040o.defaultSettings$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getIdps;
import p040o.setChildDrawingOrderCallback;
import p040o.setTapText;

public class LoanFragment extends BaseCardFragment implements CheckCaptureModule$a$MediaBrowserCompat$SearchResultReceiver, FragmentBuilder_BindBaseReplaceableFragment {
    @HmlPinActivity
    public defaultSettings loanPresenter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85542131493781, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.loanPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$ItemReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_SWIPE_REFRESH")).subscribe(new NdidService(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.IconCompatParcelizer = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_HOME_ACTIVITY_REFRESH")).subscribe(new NdidService(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.MediaMetadataCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_REGISTERED_ACCOUNTS_UPDATED")).subscribe(new NdidService(this), getIdps.MediaBrowserCompat$ItemReceiver);
        return inflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        defaultSettings defaultsettings = this.loanPresenter;
        if (!defaultsettings.write) {
            boolean z = true;
            defaultsettings.write = true;
            if (defaultsettings.RatingCompat == null) {
                z = false;
            }
            if (z) {
                defaultsettings.RatingCompat.Keep();
            }
            defaultsettings.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
            defaultsettings.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new defaultSettings$MediaBrowserCompat$CustomActionResultReceiver(defaultsettings, (byte) 0));
        }
    }

    public void onDestroy() {
        defaultSettings defaultsettings = this.loanPresenter;
        if (defaultsettings != null) {
            defaultsettings.onDestroy();
        }
        super.onDestroy();
    }

    public final void write(List<Futures.C34051> list) {
        if (list.isEmpty()) {
            RelativeLayout relativeLayout = this.mParentLayout;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
                return;
            }
            return;
        }
        LoanViewPagerAdapter loanViewPagerAdapter = new LoanViewPagerAdapter(getActivity(), list);
        if (loanViewPagerAdapter.write == null) {
            loanViewPagerAdapter.write = this;
        }
        this.mViewPager.setAdapter(loanViewPagerAdapter);
        this.mViewPager.setClipToPadding(false);
        this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0, getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0);
        read(list);
        RelativeLayout relativeLayout2 = this.mParentLayout;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        List<Futures.C34051> list = this.loanPresenter.IconCompatParcelizer;
        Futures.C34051 r0 = (Futures.C34051) (list != null ? (ArrayList) list : new ArrayList()).get(i);
        if (!TextUtils.isEmpty(r0.ParcelableVolumeInfo)) {
            IconCompatParcelizer("click_loancard", new ZSYR2K("loanproduct", r0.ParcelableVolumeInfo));
        }
        Intent intent = new Intent(getActivity(), LoanDetailActivity.class);
        List<Futures.C34051> list2 = this.loanPresenter.IconCompatParcelizer;
        intent.putParcelableArrayListExtra("LOAN_DISPLAY_LIST", list2 != null ? (ArrayList) list2 : new ArrayList());
        intent.putExtra("SELECTED_LOAN_POSITION", i);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ void IconCompatParcelizer(LoanFragment loanFragment) {
        defaultSettings defaultsettings = loanFragment.loanPresenter;
        if (!defaultsettings.write) {
            boolean z = true;
            defaultsettings.write = true;
            if (defaultsettings.RatingCompat == null) {
                z = false;
            }
            if (z) {
                defaultsettings.RatingCompat.Keep();
            }
            defaultsettings.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat();
            defaultsettings.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new defaultSettings$MediaBrowserCompat$CustomActionResultReceiver(defaultsettings, (byte) 0));
        }
    }
}
