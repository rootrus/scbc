package com.scb.phone.view.fragment.ccrredemption.product;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.ccrredemption.product.ProductDetailActivity;
import com.scb.phone.view.adapter.ccrredemption.product.OPRRewardAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import p040o.C4283discover;
import p040o.Constraints;
import p040o.HmlPinActivity;
import p040o.ModifyQuickTopUpReviewActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.confirmSuitabilityAssessment;
import p040o.eagerInDefaultApp;
import p040o.excludeFieldsWithoutExposeAnnotation;
import p040o.getBusinessList;
import p040o.getDependencies;
import p040o.getLastName;
import p040o.getNameSuffix;
import p040o.isEagerInDefaultApp;
import p040o.postProductList;
import p040o.registerTypeAdapter;
import p040o.setExclusionStrategies;
import p040o.setExclusionStrategies$MediaBrowserCompat$ItemReceiver;
import p040o.setTapText;

public class OPRRewardsFragment extends BaseFragment implements getNameSuffix, getLastName {
    public ModifyQuickTopUpReviewActivity IconCompatParcelizer;
    public C4283discover MediaBrowserCompat$CustomActionResultReceiver;
    private eagerInDefaultApp RatingCompat;
    @BindView
    ViewGroup inlineLoader;
    @BindView
    ViewGroup layoutTierRewards;
    @HmlPinActivity
    public OPRRewardAdapter oprRewardAdapter;
    @HmlPinActivity
    public setExclusionStrategies presenter;
    @BindView
    public RecyclerView rcvTierRewards;
    @BindView
    ViewGroup rewardsErrorLayout;
    @BindView
    ImageView txvErrorIcon;
    @BindView
    TextView txvErrorMessage;
    @BindView
    TextView txvErrorTitle;
    @BindView
    TextView txvRewardsTitle;

    public static OPRRewardsFragment IconCompatParcelizer(C4283discover discover) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("", discover);
        OPRRewardsFragment oPRRewardsFragment = new OPRRewardsFragment();
        oPRRewardsFragment.setArguments(bundle);
        return oPRRewardsFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89552131494182, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        RecyclerView recyclerView = this.rcvTierRewards;
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.rcvTierRewards.setAdapter(this.oprRewardAdapter);
        this.oprRewardAdapter.write = this;
        RecyclerView recyclerView2 = this.rcvTierRewards;
        C58855 r0 = new RecyclerView.ParcelableVolumeInfo() {
            public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
                super.IconCompatParcelizer(recyclerView, i, i2);
                if (i != 0 || i2 != 0) {
                    OPRRewardsFragment.this.MediaMetadataCompat();
                }
            }
        };
        if (recyclerView2.setGroupDividerEnabled == null) {
            recyclerView2.setGroupDividerEnabled = new ArrayList();
        }
        recyclerView2.setGroupDividerEnabled.add(r0);
        this.MediaBrowserCompat$CustomActionResultReceiver = (C4283discover) getArguments().getParcelable("");
        this.RatingCompat = (eagerInDefaultApp) getActivity().getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.OPRStatusRewardsLandingActivity.OPR_LANDING_DTO");
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver((getLastName) this);
        setExclusionStrategies setexclusionstrategies = this.presenter;
        C4283discover discover = this.MediaBrowserCompat$CustomActionResultReceiver;
        excludeFieldsWithoutExposeAnnotation excludefieldswithoutexposeannotation = new excludeFieldsWithoutExposeAnnotation(discover);
        if (setexclusionstrategies.RatingCompat != null) {
            excludefieldswithoutexposeannotation.IconCompatParcelizer(setexclusionstrategies.RatingCompat);
        }
        registerTypeAdapter registertypeadapter = registerTypeAdapter.IconCompatParcelizer;
        if (setexclusionstrategies.RatingCompat != null) {
            registertypeadapter.IconCompatParcelizer(setexclusionstrategies.RatingCompat);
        }
        setexclusionstrategies.MediaBrowserCompat$ItemReceiver.set(true);
        setexclusionstrategies.read.write(new Constraints.ConstrainedSortedSet(Integer.valueOf(discover.MediaBrowserCompat$ItemReceiver), 0), true);
        setexclusionstrategies.read.IconCompatParcelizer(new setExclusionStrategies$MediaBrowserCompat$ItemReceiver(setexclusionstrategies));
        return inflate;
    }

    /* access modifiers changed from: private */
    public void MediaMetadataCompat() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.rcvTierRewards.AppCompatActivity;
        if (this.rcvTierRewards.isShown() && !this.rcvTierRewards.canScrollVertically(1) && linearLayoutManager.RatingCompat() == linearLayoutManager.MediaSessionCompat$QueueItem() - 1) {
            this.presenter.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver(p040o.intoSet r9) {
        /*
            r8 = this;
            o.setExclusionStrategies r0 = r8.presenter
            o.eagerInDefaultApp r1 = r8.RatingCompat
            o.discover r2 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = r2.write
            o.discover r3 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r3 = r3.IconCompatParcelizer
            o.isEagerInDefaultApp r4 = new o.isEagerInDefaultApp
            r4.<init>()
            java.lang.String r5 = r1.MediaBrowserCompat$ItemReceiver
            r4.IconCompatParcelizer = r5
            java.lang.String r5 = r1.MediaSessionCompat$Token
            r4.write = r5
            java.lang.String r5 = r1.MediaBrowserCompat$MediaItem
            r4.RatingCompat = r5
            java.lang.String r5 = r1.MediaSessionCompat$QueueItem
            r4.MediaSessionCompat$Token = r5
            java.lang.String r5 = r1.IconCompatParcelizer
            r4.ParcelableVolumeInfo = r5
            r4.MediaSessionCompat$ResultReceiverWrapper = r9
            r9 = 1
            r4.MediaBrowserCompat$MediaItem = r9
            boolean r5 = r1.MediaSessionCompat$ResultReceiverWrapper
            r4.MediaSessionCompat$QueueItem = r5
            java.util.List<o.validateInterface> r5 = r1.f2820x50fd9e4a
            r6 = 0
            if (r5 == 0) goto L_0x005d
            java.util.List<o.validateInterface> r5 = r1.f2820x50fd9e4a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x005d
            java.util.List<o.validateInterface> r5 = r1.f2820x50fd9e4a
            java.util.Iterator r5 = r5.iterator()
        L_0x0041:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0057
            java.lang.Object r7 = r5.next()
            o.validateInterface r7 = (p040o.validateInterface) r7
            java.lang.String r7 = r7.IconCompatParcelizer
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0041
            r2 = r9
            goto L_0x0058
        L_0x0057:
            r2 = r6
        L_0x0058:
            if (r2 != 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r2 = r9
            goto L_0x005e
        L_0x005d:
            r2 = r6
        L_0x005e:
            r4.MediaMetadataCompat = r2
            r4.AlertController$RecycleListView = r3
            java.lang.String r2 = r1.PlaybackStateCompat
            r4.Keep = r2
            int r2 = r1.read
            r4.read = r2
            o.readStringList r2 = r1.MediaDescriptionCompat
            r4.MediaBrowserCompat$SearchResultReceiver = r2
            java.lang.String r2 = r1.MediaSessionCompat$Token
            r4.MediaBrowserCompat$ItemReceiver = r2
            java.lang.String r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            r4.MediaBrowserCompat$CustomActionResultReceiver = r2
            java.lang.String r2 = r1.ParcelableVolumeInfo
            r4.f2874x50fd9e4a = r2
            boolean r1 = r1.MediaBrowserCompat$SearchResultReceiver
            r4.MediaDescriptionCompat = r1
            o.addTypeAdaptersForDate r1 = new o.addTypeAdaptersForDate
            r1.<init>(r4)
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r9 = r6
        L_0x0089:
            if (r9 == 0) goto L_0x0090
            T r9 = r0.RatingCompat
            r1.IconCompatParcelizer(r9)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ccrredemption.product.OPRRewardsFragment.MediaBrowserCompat$ItemReceiver(o.intoSet):void");
    }

    public final void write() {
        this.txvErrorIcon.setImageResource(R.drawable.ic_generic_error);
        this.txvErrorTitle.setText(R.string.oops);
        this.layoutTierRewards.setVisibility(8);
        this.rewardsErrorLayout.setVisibility(0);
        this.txvErrorMessage.setText(getString(R.string.no_rewards_error));
    }

    public final void read(getDependencies getdependencies) {
        this.layoutTierRewards.setVisibility(0);
        this.rewardsErrorLayout.setVisibility(8);
        OPRRewardAdapter oPRRewardAdapter = this.oprRewardAdapter;
        oPRRewardAdapter.MediaBrowserCompat$ItemReceiver = getdependencies.IconCompatParcelizer;
        oPRRewardAdapter.IconCompatParcelizer.write();
        MediaMetadataCompat();
    }

    public final void read(String str) {
        this.txvRewardsTitle.setText(getString(R.string.tier_rewards_title, str));
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.inlineLoader.setVisibility(0);
        this.rcvTierRewards.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.inlineLoader.setVisibility(8);
        this.rcvTierRewards.setVisibility(0);
    }

    public final void write(ModifyQuickTopUpReviewActivity modifyQuickTopUpReviewActivity) {
        this.IconCompatParcelizer = modifyQuickTopUpReviewActivity;
    }

    public final void MediaBrowserCompat$MediaItem() {
        OPRRewardAdapter oPRRewardAdapter = this.oprRewardAdapter;
        oPRRewardAdapter.MediaDescriptionCompat = true;
        oPRRewardAdapter.MediaMetadataCompat = postProductList.SHOWING_LOADER;
        oPRRewardAdapter.MediaBrowserCompat$CustomActionResultReceiver();
        oPRRewardAdapter.IconCompatParcelizer.write();
        this.rcvTierRewards.postDelayed(new confirmSuitabilityAssessment(this), 100);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        OPRRewardAdapter oPRRewardAdapter = this.oprRewardAdapter;
        oPRRewardAdapter.MediaDescriptionCompat = false;
        oPRRewardAdapter.MediaMetadataCompat = postProductList.HIDDEN_LOADER;
        oPRRewardAdapter.MediaBrowserCompat$CustomActionResultReceiver();
        oPRRewardAdapter.IconCompatParcelizer.write();
        this.rcvTierRewards.postDelayed(new confirmSuitabilityAssessment(this), 100);
    }

    public final void MediaDescriptionCompat() {
        OPRRewardAdapter oPRRewardAdapter = this.oprRewardAdapter;
        getBusinessList getbusinesslist = new getBusinessList(this);
        oPRRewardAdapter.MediaDescriptionCompat = true;
        oPRRewardAdapter.MediaBrowserCompat$SearchResultReceiver = getbusinesslist;
        oPRRewardAdapter.MediaMetadataCompat = postProductList.SHOWING_ERROR;
        oPRRewardAdapter.MediaBrowserCompat$CustomActionResultReceiver();
        oPRRewardAdapter.IconCompatParcelizer.write();
        this.rcvTierRewards.postDelayed(new confirmSuitabilityAssessment(this), 100);
    }

    public final void read() {
        OPRRewardAdapter oPRRewardAdapter = this.oprRewardAdapter;
        oPRRewardAdapter.MediaDescriptionCompat = false;
        oPRRewardAdapter.MediaMetadataCompat = postProductList.HIDDEN_ERROR;
        oPRRewardAdapter.MediaBrowserCompat$CustomActionResultReceiver();
        oPRRewardAdapter.IconCompatParcelizer.write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getDependencies getdependencies) {
        OPRRewardAdapter oPRRewardAdapter = this.oprRewardAdapter;
        oPRRewardAdapter.MediaBrowserCompat$ItemReceiver.addAll(getdependencies.IconCompatParcelizer);
        oPRRewardAdapter.IconCompatParcelizer.write();
    }

    public final boolean IconCompatParcelizer() {
        return isAdded();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(isEagerInDefaultApp iseagerindefaultapp) {
        Intent IconCompatParcelizer2 = ProductDetailActivity.IconCompatParcelizer(getContext(), iseagerindefaultapp);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
