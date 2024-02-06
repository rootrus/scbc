package com.scb.phone.view.fragment.prelogin.quickbalance;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.prelogin.QuickAccountSelectAdapter;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.C4433fn;
import p040o.FragmentBuilder_BindCloseAccountSelectionFragment;
import p040o.HmlPinActivity;
import p040o.getBottomRightCornerHeight;
import p040o.immediateCheckedFuture;

public class SetupQuickBalanceFragment extends BaseFragment implements getBottomRightCornerHeight.write, FragmentBuilder_BindCloseAccountSelectionFragment {
    private QuickAccountSelectAdapter MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    protected DefaultButton mContinueButton;
    @BindView
    protected RecyclerView mRecyclerView;
    @HmlPinActivity
    public C4433fn setupQuickBalancePresenter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89222131494149, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.setupQuickBalancePresenter.MediaBrowserCompat$ItemReceiver(this);
        this.setupQuickBalancePresenter.MediaBrowserCompat$ItemReceiver();
        this.mContinueButton.setText(getString(R.string.confirm));
        this.mContinueButton.setButtonEnabled(false);
        setTransitioning();
        return inflate;
    }

    public void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.set_up_quick_balance));
    }

    private void read(List<immediateCheckedFuture> list, String str) {
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.mRecyclerView.setNestedScrollingEnabled(false);
        QuickAccountSelectAdapter quickAccountSelectAdapter = new QuickAccountSelectAdapter(list, str, this, false, getString(R.string.quick_balance));
        this.MediaBrowserCompat$CustomActionResultReceiver = quickAccountSelectAdapter;
        this.mRecyclerView.setAdapter(quickAccountSelectAdapter);
    }

    public void read(List<immediateCheckedFuture> list) {
        read(list, getString(R.string.select_an_account));
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(List<immediateCheckedFuture> list) {
        read(list, getString(R.string.confirm_account_selected));
    }

    public void onDestroy() {
        this.setupQuickBalancePresenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (z) {
            RecyclerView recyclerView = this.mRecyclerView;
            recyclerView.RatingCompat(recyclerView.MediaDescriptionCompat.IconCompatParcelizer());
            return;
        }
        this.mContinueButton.setButtonEnabled(true);
    }

    public final void write() {
        this.mContinueButton.setButtonEnabled(true);
    }

    /* access modifiers changed from: protected */
    @OnClick
    public void onConfirmButtonClicked() {
        QuickAccountSelectAdapter quickAccountSelectAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (quickAccountSelectAdapter != null) {
            C4433fn fnVar = this.setupQuickBalancePresenter;
            int i = quickAccountSelectAdapter.MediaMetadataCompat;
            fnVar.IconCompatParcelizer((i != -1 ? quickAccountSelectAdapter.read.get(i) : null).AppCompatViewInflater);
        }
    }

    public final void read() {
        Intent intent = new Intent("com.scb.phone/BROADCAST_SHOW_QUICK_OPERATION_SNACK_BAR");
        intent.putExtra("com.scb.phone.EXTRA_IS_SUCCESS", true);
        intent.putExtra("com.scb.phone.EXTRA_SHOW_SNACK_BAR", true);
        intent.putExtra("com.scb.phone.EXTRA_MESSAGE", getString(R.string.quick_balance_setup_completed));
        if (getActivity() != null) {
            getActivity().sendBroadcast(intent);
            getActivity().finish();
        }
    }
}
