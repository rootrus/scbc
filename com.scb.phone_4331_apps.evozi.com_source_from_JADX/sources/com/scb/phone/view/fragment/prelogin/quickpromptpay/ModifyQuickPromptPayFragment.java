package com.scb.phone.view.fragment.prelogin.quickpromptpay;

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
import p040o.C4441fw;
import p040o.HmlPinActivity;
import p040o.getCompressedFrontImageSize$MediaBrowserCompat$ItemReceiver;
import p040o.immediateCheckedFuture;

public class ModifyQuickPromptPayFragment extends SetupQuickPromptPayFragment implements getCompressedFrontImageSize$MediaBrowserCompat$ItemReceiver {
    private String IconCompatParcelizer;
    private QuickAccountSelectAdapter MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public C4441fw modifyQuickPromptPayPresenter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89242131494151, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.modifyQuickPromptPayPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.modifyQuickPromptPayPresenter.write();
        this.IconCompatParcelizer = getActivity().getIntent().getStringExtra("com.scb.phone.EXTRA_QUICK_PROMPT_PAY_DISPLAY");
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.modify_quick_prompt_pay));
        return inflate;
    }

    public void onDestroy() {
        this.modifyQuickPromptPayPresenter.onDestroy();
        super.onDestroy();
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.modify_quick_prompt_pay));
    }

    public void onConfirmButtonClicked() {
        super.onConfirmButtonClicked();
        QuickAccountSelectAdapter quickAccountSelectAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (quickAccountSelectAdapter != null) {
            boolean z = quickAccountSelectAdapter.MediaBrowserCompat$MediaItem;
            C4441fw fwVar = this.modifyQuickPromptPayPresenter;
            QuickAccountSelectAdapter quickAccountSelectAdapter2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = quickAccountSelectAdapter2.MediaMetadataCompat;
            fwVar.IconCompatParcelizer((i != -1 ? quickAccountSelectAdapter2.read.get(i) : null).AppCompatViewInflater, z ? 1 : 0);
        }
    }

    public final void read() {
        Intent intent = new Intent("com.scb.phone/BROADCAST_SHOW_QUICK_OPERATION_SNACK_BAR");
        intent.putExtra("com.scb.phone.EXTRA_SHOW_SNACK_BAR", true);
        intent.putExtra("com.scb.phone.EXTRA_IS_SUCCESS", true);
        intent.putExtra("com.scb.phone.EXTRA_MESSAGE", getString(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem ? R.string.quick_prompt_pay_modify_completed : R.string.prompt_pay_turned_off));
        if (getActivity() != null) {
            getActivity().sendBroadcast(intent);
            getActivity().setResult(-1);
            getActivity().finish();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(List<immediateCheckedFuture> list) {
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.mRecyclerView.setNestedScrollingEnabled(false);
        this.MediaBrowserCompat$CustomActionResultReceiver = new QuickAccountSelectAdapter(list, getString(R.string.select_account_for_prompt_pay), this, true, getString(R.string.prompt_pay));
        this.mRecyclerView.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver);
        QuickAccountSelectAdapter quickAccountSelectAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (quickAccountSelectAdapter != null) {
            quickAccountSelectAdapter.write(this.IconCompatParcelizer);
        }
    }
}
