package com.scb.phone.view.fragment.transferandpay;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.transferandpay.AccountSourceAdapter;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.scb.phone.view.fragment.transferandpay.AddFavoriteTransferTargetTabFragment;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.getEasycashLoanTypesList;
import p040o.getShortName;
import p040o.onGetStartedClick;
import p040o.parseSession;

public class AddFavoriteTransferFragment extends BaseTransferAndPayTabFragment implements AccountSourceSelectFragment.write {
    private AccountSourceSelectFragment IconCompatParcelizer;
    private AddFavoriteTransferTargetTabFragment MediaBrowserCompat$CustomActionResultReceiver;
    private getShortName MediaBrowserCompat$MediaItem;
    private AddFavoriteTransferInputFragment MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaDescriptionCompat = false;
    private double MediaMetadataCompat;
    private String RatingCompat;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final void mo13978c_(boolean z) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85612131493788, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        CrashlyticsReport.FilesPayload.File.write write = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.TRANSFER_FUNCTION);
        write.MediaBrowserCompat$ItemReceiver = false;
        write.IconCompatParcelizer = true;
        write.MediaDescriptionCompat = true;
        write.RatingCompat = true;
        this.IconCompatParcelizer = AccountSourceSelectFragment.read(new CrashlyticsReport.FilesPayload.File(write, (byte) 0));
        MediaBrowserCompat$ItemReceiver("com.scb.phone/BROADCAST_TRANSFER_NEXT_STEP", "com.scb.phone/BROADCAST_TRANSFER_BACK_STEP");
        getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, this.IconCompatParcelizer).write();
        return inflate;
    }

    /* access modifiers changed from: package-private */
    public final void write(Intent intent) {
        PlaybackStateCompat$CustomAction();
        parseSession parsesession = (parseSession) intent.getParcelableExtra("com.scb.phone.EXTRA_TRANSFER_TARGET_DATA");
        this.IconCompatParcelizer.IconCompatParcelizer(parsesession.MediaBrowserCompat$CustomActionResultReceiver);
        AddFavoriteTransferInputFragment IconCompatParcelizer2 = AddFavoriteTransferInputFragment.IconCompatParcelizer(parsesession, this.RatingCompat, this.MediaBrowserCompat$MediaItem, this.MediaMetadataCompat);
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer2;
        AccountSourceSelectFragment accountSourceSelectFragment = this.IconCompatParcelizer;
        AccountSourceAdapter accountSourceAdapter = accountSourceSelectFragment.MediaBrowserCompat$SearchResultReceiver;
        IconCompatParcelizer2.MediaBrowserCompat$MediaItem = (accountSourceAdapter != null ? accountSourceAdapter.MediaBrowserCompat$CustomActionResultReceiver(accountSourceSelectFragment.mViewPager.getCurrentItem()) : null).MediaSessionCompat$Token;
        aA_();
        read(this.MediaBrowserCompat$SearchResultReceiver, R.id.container, "com.scb.phone.TransferTabFragment.TAG_ADD_FAV_NEXT_STEP", true, true);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent) {
        super.IconCompatParcelizer(intent);
        this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver();
        read(this.MediaBrowserCompat$CustomActionResultReceiver, R.id.container, getString(R.string.transfer_target_tab), true);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        if (builder != null) {
            this.RatingCompat = builder.MediaSessionCompat$Token;
            this.MediaBrowserCompat$MediaItem = builder.MediaSessionCompat$ResultReceiverWrapper;
            this.MediaMetadataCompat = builder.MediaBrowserCompat$CustomActionResultReceiver.doubleValue();
            AddFavoriteTransferInputFragment addFavoriteTransferInputFragment = this.MediaBrowserCompat$SearchResultReceiver;
            if (addFavoriteTransferInputFragment != null) {
                addFavoriteTransferInputFragment.MediaBrowserCompat$MediaItem = builder.MediaSessionCompat$Token;
            }
            AddFavoriteTransferTargetTabFragment addFavoriteTransferTargetTabFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (addFavoriteTransferTargetTabFragment != null) {
                String str = builder.MediaSessionCompat$Token;
                onGetStartedClick.write((Object) str, "accountSource");
                getEasycashLoanTypesList geteasycashloantypeslist = addFavoriteTransferTargetTabFragment.IconCompatParcelizer;
                if (geteasycashloantypeslist != null) {
                    geteasycashloantypeslist.MediaBrowserCompat$ItemReceiver(str);
                }
            }
            if (!this.MediaDescriptionCompat) {
                this.MediaDescriptionCompat = true;
                AddFavoriteTransferTargetTabFragment.IconCompatParcelizer iconCompatParcelizer = AddFavoriteTransferTargetTabFragment.MediaBrowserCompat$CustomActionResultReceiver;
                String str2 = builder.MediaSessionCompat$Token;
                onGetStartedClick.write((Object) str2, "accountSource");
                AddFavoriteTransferTargetTabFragment addFavoriteTransferTargetTabFragment2 = new AddFavoriteTransferTargetTabFragment();
                Bundle bundle = new Bundle();
                bundle.putString("account_extra", str2);
                addFavoriteTransferTargetTabFragment2.setArguments(bundle);
                this.MediaBrowserCompat$CustomActionResultReceiver = addFavoriteTransferTargetTabFragment2;
                read(addFavoriteTransferTargetTabFragment2, R.id.container, getString(R.string.transfer_target_tab), true);
            }
        }
    }
}
