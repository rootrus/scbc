package com.scb.phone.view.fragment.bulktransfer;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.transferandpay.transfer.TransferToOthersStep1Adapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.HmlPinActivity;
import p040o.PersistedInstallationEntry;
import p040o.getQuickBalanceStatus;
import p040o.parseFile;
import p040o.proxyGetICheckDeserializerRtti$MediaSessionCompat$QueueItem;
import p040o.readIid;

public class SelectBankFragment extends BaseFragment implements proxyGetICheckDeserializerRtti$MediaSessionCompat$QueueItem {
    @BindView
    RecyclerView recyclerView;
    @HmlPinActivity
    public PersistedInstallationEntry.Builder selectBankPresenter;

    public static SelectBankFragment write() {
        return new SelectBankFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89772131494204, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.selectBankPresenter.MediaBrowserCompat$ItemReceiver(this);
        PersistedInstallationEntry.Builder builder = this.selectBankPresenter;
        builder.MediaBrowserCompat$ItemReceiver = setStackedBackground();
        readIid readiid = readIid.read;
        if (builder.RatingCompat != null) {
            readiid.IconCompatParcelizer(builder.RatingCompat);
        }
        builder.write.MediaBrowserCompat$CustomActionResultReceiver(builder.MediaBrowserCompat$ItemReceiver);
        builder.write.IconCompatParcelizer(new PersistedInstallationEntry.Builder.read(builder, (byte) 0));
        return inflate;
    }

    public final void write(List<parseFile> list) {
        this.recyclerView.setAdapter(new TransferToOthersStep1Adapter(list, new getQuickBalanceStatus(this)));
        this.recyclerView.setNestedScrollingEnabled(false);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.selectBankPresenter.onDestroy();
    }

    public static /* synthetic */ void write(SelectBankFragment selectBankFragment, parseFile parsefile) {
        Intent intent = new Intent("com.scb.phone.ACTION_SELECT_BANK");
        intent.putExtra("com.scb.phone.EXTRA_BANK", parsefile);
        selectBankFragment.getContext().sendBroadcast(intent);
    }
}
