package com.scb.phone.view.fragment.donations;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.donations.DonationsFoundationDetailsActivity;
import com.scb.phone.view.adapter.donations.DonationsImageSliderPagerAdapter;
import com.scb.phone.view.adapter.donations.DonationsItemListAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.CheckExtractActivity$MediaBrowserCompat$ItemReceiver;
import p040o.FragmentBuilder_BindBillPaymentBillerSelectedFragment;
import p040o.FragmentBuilder_BindCardActivationFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.XVrsImage;
import p040o.access$2200;
import p040o.access$2300;
import p040o.getBinaryImagesFile;
import p040o.setTapText;
import p059me.relex.circleindicator.CircleIndicator;

public class DonationsLandingFragment extends BaseFragment implements FragmentBuilder_BindCardActivationFragment, FragmentBuilder_BindBillPaymentBillerSelectedFragment, CheckExtractActivity$MediaBrowserCompat$ItemReceiver {
    @HmlPinActivity
    public XVrsImage donationsLandingPresenter;
    @BindView
    CircleIndicator mCircleIndicator;
    @BindView
    RecyclerView mRecyclerView;
    @BindView
    ViewPager mViewPager;

    public static DonationsLandingFragment IconCompatParcelizer() {
        return new DonationsLandingFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86832131493910, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        super.setTransitioning();
        ParcelableVolumeInfo(getString(R.string.donation));
        ActionBarContextView();
        setActionBarVisibilityCallback();
        this.donationsLandingPresenter.MediaBrowserCompat$ItemReceiver(this);
        XVrsImage xVrsImage = this.donationsLandingPresenter;
        if (xVrsImage.RatingCompat != null) {
            xVrsImage.RatingCompat.AlertController$RecycleListView();
        }
        xVrsImage.read.read();
        xVrsImage.read.IconCompatParcelizer(new XVrsImage.IconCompatParcelizer(xVrsImage, (byte) 0));
        return inflate;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ParcelableVolumeInfo(getString(R.string.donation));
        ActionBarContextView();
        setActionBarVisibilityCallback();
    }

    public final void MediaBrowserCompat$ItemReceiver(getBinaryImagesFile getbinaryimagesfile) {
        read(getbinaryimagesfile);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getBinaryImagesFile getbinaryimagesfile) {
        read(getbinaryimagesfile);
    }

    private void read(getBinaryImagesFile getbinaryimagesfile) {
        Intent intent = new Intent(getContext(), DonationsFoundationDetailsActivity.class);
        intent.putExtra("SELECTED_IMAGE_POSITION", getbinaryimagesfile);
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

    public final void MediaBrowserCompat$ItemReceiver(access$2200 access_2200) {
        access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.common_error);
        access$2300 access_2300 = new access$2300();
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        access_2300.read = access$2300.write.NAVIGATE_BACK;
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    public final void MediaBrowserCompat$ItemReceiver(List<getBinaryImagesFile> list, List<getBinaryImagesFile> list2) {
        if (list2 != null && list != null) {
            this.mViewPager.setAdapter(new DonationsImageSliderPagerAdapter(getContext(), list, this));
            this.mViewPager.setClipToPadding(false);
            this.mCircleIndicator.setViewPager(this.mViewPager);
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
            DonationsItemListAdapter donationsItemListAdapter = new DonationsItemListAdapter(getContext(), list2, this);
            this.mRecyclerView.setLayoutManager(linearLayoutManager);
            this.mRecyclerView.setAdapter(donationsItemListAdapter);
        }
    }

    public void onDestroy() {
        this.donationsLandingPresenter.onDestroy();
        super.onDestroy();
    }
}
