package com.scb.phone.view.fragment.prelogin.quickpromptpay;

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
import p040o.C4443fz;
import p040o.FragmentBuilder_BindCloseAccountSelectionFragment;
import p040o.HmlPinActivity;
import p040o.getCompressedFrontImageSize;
import p040o.immediateCheckedFuture;

public class SetupQuickPromptPayFragment extends BaseFragment implements getCompressedFrontImageSize.read, FragmentBuilder_BindCloseAccountSelectionFragment {
    private QuickAccountSelectAdapter MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    protected DefaultButton mContinueButton;
    @BindView
    protected RecyclerView mRecyclerView;
    @HmlPinActivity
    public C4443fz setupQuickPromptPayPresenter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89252131494152, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.setupQuickPromptPayPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.setupQuickPromptPayPresenter.write();
        this.mContinueButton.setText(getString(R.string.confirm));
        this.mContinueButton.setButtonEnabled(false);
        setTransitioning();
        return inflate;
    }

    public void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.set_up_quick_prompt_pay));
    }

    public void MediaBrowserCompat$ItemReceiver(List<immediateCheckedFuture> list) {
        String string = getString(R.string.select_account_for_prompt_pay);
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.mRecyclerView.setNestedScrollingEnabled(false);
        QuickAccountSelectAdapter quickAccountSelectAdapter = new QuickAccountSelectAdapter(list, string, this, false, getString(R.string.quick_prompt_pay));
        this.MediaBrowserCompat$CustomActionResultReceiver = quickAccountSelectAdapter;
        this.mRecyclerView.setAdapter(quickAccountSelectAdapter);
    }

    public void onDestroy() {
        this.setupQuickPromptPayPresenter.onDestroy();
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

    /* access modifiers changed from: package-private */
    @OnClick
    public void onConfirmButtonClicked() {
        QuickAccountSelectAdapter quickAccountSelectAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (quickAccountSelectAdapter != null) {
            C4443fz fzVar = this.setupQuickPromptPayPresenter;
            int i = quickAccountSelectAdapter.MediaMetadataCompat;
            fzVar.write((i != -1 ? quickAccountSelectAdapter.read.get(i) : null).AppCompatViewInflater);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent("com.scb.phone/BROADCAST_SHOW_QUICK_OPERATION_SNACK_BAR");
        intent.putExtra("com.scb.phone.EXTRA_SHOW_SNACK_BAR", true);
        intent.putExtra("com.scb.phone.EXTRA_IS_SUCCESS", true);
        intent.putExtra("com.scb.phone.EXTRA_MESSAGE", getString(R.string.quick_prompt_pay_setup_completed));
        if (getActivity() != null) {
            getActivity().sendBroadcast(intent);
            getActivity().finish();
        }
    }
}
