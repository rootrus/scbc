package com.scb.phone.view.fragment.prelogin.quickbalance;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.prelogin.QuickAccountSelectAdapter;
import java.util.List;
import p040o.C4436fq;
import p040o.HmlPinActivity;
import p040o.getBottomRightCornerHeight$MediaBrowserCompat$ItemReceiver;
import p040o.immediateCheckedFuture;

public class ModifyQuickBalanceFragment extends SetupQuickBalanceFragment implements getBottomRightCornerHeight$MediaBrowserCompat$ItemReceiver {
    private String IconCompatParcelizer;
    private QuickAccountSelectAdapter MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public C4436fq modifyQuickBalancePresenter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89212131494148, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.modifyQuickBalancePresenter.MediaBrowserCompat$ItemReceiver(this);
        this.modifyQuickBalancePresenter.MediaBrowserCompat$ItemReceiver();
        this.IconCompatParcelizer = getActivity().getIntent().getStringExtra("com.scb.phone.EXTRA_QUICK_BALANCE_MODIFY_DISPLAY");
        this.mContinueButton.setText(getString(R.string.confirm));
        this.mContinueButton.setButtonEnabled(false);
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.quick_balance_modify));
        return inflate;
    }

    public void onDestroy() {
        this.modifyQuickBalancePresenter.onDestroy();
        super.onDestroy();
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.quick_balance_modify));
    }

    private void MediaBrowserCompat$ItemReceiver(List<immediateCheckedFuture> list) {
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.mRecyclerView.setNestedScrollingEnabled(false);
        this.MediaBrowserCompat$CustomActionResultReceiver = new QuickAccountSelectAdapter(list, getString(R.string.select_an_account), this, true, getString(R.string.quick_balance));
        this.mRecyclerView.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver);
        QuickAccountSelectAdapter quickAccountSelectAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (quickAccountSelectAdapter != null) {
            quickAccountSelectAdapter.write(this.IconCompatParcelizer);
        }
    }

    public final void read(List<immediateCheckedFuture> list) {
        MediaBrowserCompat$ItemReceiver(list);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<immediateCheckedFuture> list) {
        MediaBrowserCompat$ItemReceiver(list);
    }

    /* access modifiers changed from: protected */
    public void onConfirmButtonClicked() {
        super.onConfirmButtonClicked();
        QuickAccountSelectAdapter quickAccountSelectAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (quickAccountSelectAdapter != null) {
            boolean z = quickAccountSelectAdapter.MediaBrowserCompat$MediaItem;
            C4436fq fqVar = this.modifyQuickBalancePresenter;
            QuickAccountSelectAdapter quickAccountSelectAdapter2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = quickAccountSelectAdapter2.MediaMetadataCompat;
            fqVar.write((i != -1 ? quickAccountSelectAdapter2.read.get(i) : null).AppCompatViewInflater, z ? 1 : 0);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent("com.scb.phone/BROADCAST_SHOW_QUICK_OPERATION_SNACK_BAR");
        intent.putExtra("com.scb.phone.EXTRA_SHOW_SNACK_BAR", true);
        intent.putExtra("com.scb.phone.EXTRA_IS_SUCCESS", true);
        intent.putExtra("com.scb.phone.EXTRA_MESSAGE", getString(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem ? R.string.quick_balance_modify_completed : R.string.quick_balance_turned_off));
        if (getActivity() != null) {
            getActivity().sendBroadcast(intent);
            getActivity().setResult(-1);
            getActivity().finish();
        }
    }
}
