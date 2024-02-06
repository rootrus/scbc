package com.scb.phone.view.fragment.chequemanagement.stopcheque;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.chequemanagement.stopcheque.StopChequeHistoryAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.C6383x2024ce86;
import p040o.CardView;
import p040o.Group;
import p040o.HmlPinActivity;
import p040o.LazilyParsedNumber;
import p040o.SwitchCompat;
import p040o.getCcSofSpeedyCardTermsAndConditions;
import p040o.getDebitCardTermsAndConditions;
import p040o.getRoots;

public class StopChequeHistoryFragment extends BaseFragment implements C6383x2024ce86 {
    public String IconCompatParcelizer;
    public StopChequeHistoryAdapter MediaBrowserCompat$CustomActionResultReceiver;
    StopChequeFragment MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private Runnable f3079x50fd9e4a;
    private String MediaDescriptionCompat;
    private Handler MediaMetadataCompat;
    private String MediaSessionCompat$QueueItem;
    private Runnable RatingCompat;
    @BindView
    Button btnStopCheque;
    @HmlPinActivity
    public LazilyParsedNumber presenter;
    @BindView
    RecyclerView recyclerViewStopChequeHistory;
    @BindView
    LinearLayout viewError;
    @BindView
    LinearLayout viewNoHistory;

    public static StopChequeHistoryFragment IconCompatParcelizer(String str, String str2) {
        StopChequeHistoryFragment stopChequeHistoryFragment = new StopChequeHistoryFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ACCOUNT_NO", str);
        bundle.putString("PAGING_OFFSET", str2);
        stopChequeHistoryFragment.setArguments(bundle);
        return stopChequeHistoryFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f90032131494230, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaMetadataCompat = new Handler();
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.IconCompatParcelizer = getArguments().getString("ACCOUNT_NO", "");
        this.MediaSessionCompat$QueueItem = getArguments().getString("PAGING_OFFSET", "");
        if (TextUtils.isEmpty(this.IconCompatParcelizer)) {
            this.btnStopCheque.setVisibility(8);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        String str = this.MediaSessionCompat$QueueItem;
        this.MediaSessionCompat$QueueItem = str;
        this.presenter.IconCompatParcelizer(this.IconCompatParcelizer, str, false);
    }

    @OnClick
    public void onButtonStopChequeClick() {
        StopChequeFragment stopChequeFragment = this.MediaBrowserCompat$MediaItem;
        if (stopChequeFragment != null) {
            StopChequeInputFragment read = StopChequeInputFragment.read(stopChequeFragment.MediaBrowserCompat$CustomActionResultReceiver);
            CardView read2 = stopChequeFragment.getChildFragmentManager().read();
            read2.MediaBrowserCompat$SearchResultReceiver();
            read2.MediaBrowserCompat$ItemReceiver(R.id.container_stop_cheque_history, read).MediaBrowserCompat$CustomActionResultReceiver((String) null).write();
        }
    }

    @OnClick
    public void onButtonReloadClick() {
        this.viewError.setVisibility(8);
        String str = this.MediaSessionCompat$QueueItem;
        this.MediaSessionCompat$QueueItem = str;
        this.presenter.IconCompatParcelizer(this.IconCompatParcelizer, str, false);
    }

    public final void write() {
        this.viewError.setVisibility(0);
        this.viewNoHistory.setVisibility(8);
        this.recyclerViewStopChequeHistory.setVisibility(8);
    }

    public final void IconCompatParcelizer() {
        this.viewNoHistory.setVisibility(0);
        this.viewError.setVisibility(8);
        this.recyclerViewStopChequeHistory.setVisibility(8);
    }

    public final void aw_() {
        if (LazilyParsedNumber.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver) && !TextUtils.isEmpty(this.IconCompatParcelizer)) {
            String str = this.MediaDescriptionCompat;
            if (!isDetached() && this.MediaMetadataCompat != null && this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                getDebitCardTermsAndConditions getdebitcardtermsandconditions = new getDebitCardTermsAndConditions(this, str);
                this.RatingCompat = getdebitcardtermsandconditions;
                this.MediaMetadataCompat.post(getdebitcardtermsandconditions);
            }
        }
    }

    public final void read(getRoots getroots) {
        this.recyclerViewStopChequeHistory.setVisibility(0);
        this.viewNoHistory.setVisibility(8);
        this.viewError.setVisibility(8);
        this.MediaBrowserCompat$SearchResultReceiver = getroots.read;
        this.MediaDescriptionCompat = getroots.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = new StopChequeHistoryAdapter(getroots.MediaBrowserCompat$ItemReceiver);
        this.recyclerViewStopChequeHistory.IconCompatParcelizer((RecyclerView.RatingCompat) new Group(getContext()), -1);
        this.recyclerViewStopChequeHistory.setHasFixedSize(false);
        getContext();
        this.recyclerViewStopChequeHistory.setLayoutManager(new LinearLayoutManager());
        SwitchCompat.IconCompatParcelizer((View) this.recyclerViewStopChequeHistory, false);
        this.recyclerViewStopChequeHistory.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void IconCompatParcelizer(getRoots getroots) {
        if (!isDetached() && this.MediaMetadataCompat != null && this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.MediaBrowserCompat$SearchResultReceiver = getroots.read;
            this.MediaDescriptionCompat = getroots.MediaBrowserCompat$CustomActionResultReceiver;
            getCcSofSpeedyCardTermsAndConditions getccsofspeedycardtermsandconditions = new getCcSofSpeedyCardTermsAndConditions(this, getroots);
            this.f3079x50fd9e4a = getccsofspeedycardtermsandconditions;
            this.MediaMetadataCompat.post(getccsofspeedycardtermsandconditions);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.MediaMetadataCompat.removeCallbacks(this.f3079x50fd9e4a);
        this.MediaMetadataCompat.removeCallbacks(this.RatingCompat);
        this.MediaMetadataCompat = null;
        this.f3079x50fd9e4a = null;
        this.RatingCompat = null;
    }
}
