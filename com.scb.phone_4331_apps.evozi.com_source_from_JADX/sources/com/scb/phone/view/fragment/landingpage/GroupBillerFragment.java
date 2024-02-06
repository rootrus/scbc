package com.scb.phone.view.fragment.landingpage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.personalize.ShortcutRouterActivity;
import com.scb.phone.view.adapter.landingpage.ShortcutAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.C3972aI;
import p040o.CameraType;
import p040o.CheckWorkflowActivity;
import p040o.FragmentBuilder_BindCardlessCreditCardSelectorFragment;
import p040o.HmlPinActivity;
import p040o.ZSYR2K;
import p040o.discardOldLogFiles;
import p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver;
import p040o.forEachDstOut;
import p040o.forEachSrc;

public class GroupBillerFragment extends BaseFragment implements CheckWorkflowActivity.C6401a, FragmentBuilder_BindCardlessCreditCardSelectorFragment {
    private ShortcutAdapter IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver = false;
    private discardOldLogFiles$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat;
    private GridLayoutManager MediaMetadataCompat;
    @HmlPinActivity
    public C3972aI groupBillerPresenter;
    @BindView
    RecyclerView mRecyclerView;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87712131493998, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver = (discardOldLogFiles$MediaBrowserCompat$ItemReceiver) getActivity().getIntent().getParcelableExtra("EXTRA_TILE_PROPERTIES");
        this.MediaDescriptionCompat = discardoldlogfiles_mediabrowsercompat_itemreceiver;
        if (discardoldlogfiles_mediabrowsercompat_itemreceiver == null) {
            getActivity().finish();
        }
        String IconCompatParcelizer2 = forEachDstOut.IconCompatParcelizer((int) this.MediaDescriptionCompat.setBackgroundResource);
        if (IconCompatParcelizer2 != null) {
            ((BaseActivity) getActivity()).mo13676d_(IconCompatParcelizer2);
        }
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ActionBarContextView();
        ParcelableVolumeInfo(this.MediaDescriptionCompat.ListMenuItemView);
        this.groupBillerPresenter.MediaBrowserCompat$ItemReceiver(this);
        C3972aI aIVar = this.groupBillerPresenter;
        long j = this.MediaDescriptionCompat.setBackgroundResource;
        if (aIVar.RatingCompat != null) {
            aIVar.RatingCompat.Keep();
        }
        aIVar.IconCompatParcelizer.write(j, false);
        aIVar.IconCompatParcelizer.IconCompatParcelizer(new C3972aI.read(aIVar, (byte) 0));
        return inflate;
    }

    public void onDestroyView() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((RecyclerView.MediaMetadataCompat) null);
            this.mRecyclerView.setAdapter((RecyclerView.IconCompatParcelizer) null);
            this.mRecyclerView = null;
        }
        this.IconCompatParcelizer = null;
        this.MediaMetadataCompat = null;
        super.onDestroyView();
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ActionBarContextView();
        ParcelableVolumeInfo(this.MediaDescriptionCompat.ListMenuItemView);
    }

    public final void MediaBrowserCompat$ItemReceiver(final discardOldLogFiles discardoldlogfiles) {
        this.IconCompatParcelizer = new ShortcutAdapter(getContext(), discardoldlogfiles, this);
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3, 1, false);
        this.MediaMetadataCompat = gridLayoutManager;
        gridLayoutManager.MediaBrowserCompat$CustomActionResultReceiver = new GridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver() {
            public final int IconCompatParcelizer(int i) {
                return discardOldLogFiles.this.MediaBrowserCompat$ItemReceiver(i).setPadding;
            }
        };
        this.mRecyclerView.setLayoutManager(this.MediaMetadataCompat);
        this.mRecyclerView.setAdapter(this.IconCompatParcelizer);
    }

    public final void read(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            ShortcutRouterActivity.MediaBrowserCompat$ItemReceiver(getContext(), discardoldlogfiles_mediabrowsercompat_itemreceiver);
            String MediaBrowserCompat$CustomActionResultReceiver2 = forEachSrc.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver.setBackgroundResource);
            if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                ((BaseActivity) getActivity()).scbAnalytics.write(forEachSrc.write(), new ZSYR2K(forEachSrc.read(), MediaBrowserCompat$CustomActionResultReceiver2));
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(long j) {
        C3972aI aIVar = this.groupBillerPresenter;
        CameraType cameraType = new CameraType(aIVar.read.write(j));
        if (aIVar.RatingCompat != null) {
            cameraType.IconCompatParcelizer(aIVar.RatingCompat);
        }
    }

    public final void Keep() {
        this.mRecyclerView.setVisibility(8);
        super.Keep();
    }

    public final void ay_() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        super.ay_();
    }

    public void onResume() {
        super.onResume();
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
    }
}
