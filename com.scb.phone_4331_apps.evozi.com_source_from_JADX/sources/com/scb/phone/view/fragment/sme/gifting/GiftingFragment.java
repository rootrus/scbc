package com.scb.phone.view.fragment.sme.gifting;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.sme.gifting.GiftPreviewActivity;
import com.scb.phone.view.adapter.sme.gifting.GiftingBaseListAdapter;
import com.scb.phone.view.adapter.sme.gifting.GiftingBaseListAdapter$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.ActivityBuilder_ContributeRemittanceCoachmarkActivity;
import p040o.AutoValue_CrashlyticsReport_Session_User;
import p040o.C4027ai;
import p040o.CheckParameters_MembersInjector;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public abstract class GiftingFragment extends BaseFragment implements CheckParameters_MembersInjector.ParcelableVolumeInfo, GiftingBaseListAdapter$MediaBrowserCompat$ItemReceiver {
    public GiftingBaseListAdapter MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    protected View giftsEmptyArea;
    @BindView
    protected TextView giftsEmptyMsg;
    @BindView
    protected RecyclerView giftsRecyclerView;
    @HmlPinActivity
    public C4027ai.C40281 presenter;

    /* access modifiers changed from: protected */
    public abstract int MediaBrowserCompat$CustomActionResultReceiver();

    /* access modifiers changed from: protected */
    public abstract GiftingBaseListAdapter MediaBrowserCompat$CustomActionResultReceiver(List<AutoValue_CrashlyticsReport_Session_User> list);

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87702131493997, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        read read2 = new read(linearLayoutManager);
        RecyclerView recyclerView = this.giftsRecyclerView;
        if (recyclerView.setGroupDividerEnabled == null) {
            recyclerView.setGroupDividerEnabled = new ArrayList();
        }
        recyclerView.setGroupDividerEnabled.add(read2);
        this.giftsRecyclerView.setLayoutManager(linearLayoutManager);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public void onResume() {
        super.onResume();
        this.presenter.read();
    }

    public final void aG_() {
        this.giftsEmptyArea.setVisibility(0);
        this.giftsEmptyMsg.setText(MediaBrowserCompat$CustomActionResultReceiver());
        this.giftsRecyclerView.setVisibility(8);
    }

    public final void write(List<AutoValue_CrashlyticsReport_Session_User> list) {
        this.giftsRecyclerView.setVisibility(0);
        this.giftsEmptyArea.setVisibility(8);
        GiftingBaseListAdapter giftingBaseListAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (giftingBaseListAdapter == null) {
            GiftingBaseListAdapter MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(list);
            this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver2;
            this.giftsRecyclerView.setAdapter(MediaBrowserCompat$CustomActionResultReceiver2);
            return;
        }
        giftingBaseListAdapter.MediaBrowserCompat$ItemReceiver(list);
        this.giftsRecyclerView.post(new ActivityBuilder_ContributeRemittanceCoachmarkActivity(this, list));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User) {
        Intent intent = new Intent(getContext(), GiftPreviewActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_GIFT_STATUS_SELECTED", autoValue_CrashlyticsReport_Session_User);
        intent.putExtras(bundle);
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

    public class read extends RecyclerView.ParcelableVolumeInfo {
        private LinearLayoutManager IconCompatParcelizer;

        public read(LinearLayoutManager linearLayoutManager) {
            this.IconCompatParcelizer = linearLayoutManager;
        }

        public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
            super.IconCompatParcelizer(recyclerView, i, i2);
            if (i2 > 0) {
                int MediaSessionCompat$ResultReceiverWrapper = this.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper();
                int MediaSessionCompat$QueueItem = this.IconCompatParcelizer.MediaSessionCompat$QueueItem();
                if (this.IconCompatParcelizer.MediaMetadataCompat() + MediaSessionCompat$ResultReceiverWrapper == MediaSessionCompat$QueueItem && MediaSessionCompat$QueueItem != 0) {
                    GiftingFragment.this.presenter.write();
                }
            }
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void aF_() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.giftsRecyclerView.setAdapter((RecyclerView.IconCompatParcelizer) null);
        }
    }
}
