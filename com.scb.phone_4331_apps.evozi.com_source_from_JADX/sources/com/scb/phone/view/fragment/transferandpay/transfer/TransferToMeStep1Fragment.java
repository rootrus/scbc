package com.scb.phone.view.fragment.transferandpay.transfer;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.transferandpay.transfer.TransferToMeStep1Adapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.BillCaptureModule_GetUriKtaFactory;
import p040o.BulkTransferDeepLinkActivity;
import p040o.FragmentBuilder_BindAddFavoriteTransferFragment;
import p040o.FragmentBuilder_BindAddNewRecipientFragment;
import p040o.FragmentBuilder_BindAddressSearchFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.RttiBillExtractor;
import p040o.RttiBillExtractor$MediaBrowserCompat$ItemReceiver;
import p040o.getNextTransition;
import p040o.getTopLeftCornerWidth;
import p040o.isSupportFragmentClass;
import p040o.parseEventApp;
import p040o.parseOs;
import p040o.parseSession;
import p040o.proxyGetLookAndFeelParameters;
import p040o.setChildDrawingOrderCallback;
import p040o.setLastBaselineToBottomHeight;
import p040o.show;

public class TransferToMeStep1Fragment extends BaseFragment implements getTopLeftCornerWidth.setTitle, TransferToMeStep1Adapter.write {
    private BulkTransferDeepLinkActivity IconCompatParcelizer;
    private TransferToMeStep1Adapter MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$MediaItem = false;
    private long MediaBrowserCompat$SearchResultReceiver;
    private BulkTransferDeepLinkActivity MediaMetadataCompat;
    private boolean RatingCompat;
    @BindView
    protected ImageView imageIcon;
    @HmlPinActivity
    public RttiBillExtractor presenter;
    @BindView
    RecyclerView recyclerView;
    @BindView
    protected TextView textTitle;
    @BindView
    ViewGroup viewGroupNoTargets;

    public static TransferToMeStep1Fragment read(String str, parseSession parsesession) {
        Bundle bundle = new Bundle();
        bundle.putString("account_source", str);
        bundle.putParcelable("transfer_display", parsesession);
        TransferToMeStep1Fragment transferToMeStep1Fragment = new TransferToMeStep1Fragment();
        transferToMeStep1Fragment.setArguments(bundle);
        return transferToMeStep1Fragment;
    }

    public static TransferToMeStep1Fragment read(String str, String str2, parseSession parsesession) {
        Bundle bundle = new Bundle();
        bundle.putString("account_source", str);
        bundle.putString("transfer_function", str2);
        bundle.putParcelable("fixed_transfer_display", new parseEventApp().MediaBrowserCompat$CustomActionResultReceiver(parsesession));
        TransferToMeStep1Fragment transferToMeStep1Fragment = new TransferToMeStep1Fragment();
        transferToMeStep1Fragment.setArguments(bundle);
        return transferToMeStep1Fragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f90282131494255, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.recyclerView.setNestedScrollingEnabled(false);
        if (getArguments() != null) {
            parseSession parsesession = (parseSession) getArguments().getParcelable("transfer_display");
            this.presenter.MediaBrowserCompat$CustomActionResultReceiver(getArguments().getString("account_source"));
            Bundle arguments = getArguments();
            String str = "TRANSFER";
            if (arguments != null) {
                str = arguments.getString("transfer_function", str);
            }
            if (str.equals("FIXED_TRANSFER")) {
                this.MediaBrowserCompat$MediaItem = true;
                parsesession = (parseSession) getArguments().getParcelable("fixed_transfer_display");
                this.presenter.MediaBrowserCompat$ItemReceiver = parsesession;
            }
            if (parsesession != null) {
                Context context = getContext();
                this.textTitle.setText(parsesession.MediaDescriptionCompat);
                String str2 = parsesession.read;
                if (context != null) {
                    FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, setLastBaselineToBottomHeight.write(context, R.drawable.bankicon_scb), this.imageIcon, str2, context.getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(context, R.color.f66402131099796));
                }
            }
        }
        return inflate;
    }

    public void onStart() {
        super.onStart();
        if (!this.RatingCompat) {
            getString(R.string.transfer_tab);
            this.MediaMetadataCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("FAVORITE")).subscribe(new FragmentBuilder_BindAddNewRecipientFragment(this), FragmentBuilder_BindAddressSearchFragment.write);
            this.IconCompatParcelizer = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_BANK_RECEIVED")).subscribe(new FragmentBuilder_BindAddFavoriteTransferFragment(this), FragmentBuilder_BindAddressSearchFragment.write);
        }
    }

    public void onStop() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaMetadataCompat;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaMetadataCompat.dispose();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2 = this.IconCompatParcelizer;
        if (bulkTransferDeepLinkActivity2 != null && !bulkTransferDeepLinkActivity2.isDisposed()) {
            this.IconCompatParcelizer.dispose();
        }
        super.onStop();
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<parseOs> list) {
        if (list.isEmpty()) {
            this.viewGroupNoTargets.setVisibility(0);
            this.recyclerView.setVisibility(8);
            return;
        }
        this.viewGroupNoTargets.setVisibility(8);
        this.recyclerView.setVisibility(0);
        TransferToMeStep1Adapter transferToMeStep1Adapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (transferToMeStep1Adapter == null) {
            TransferToMeStep1Adapter transferToMeStep1Adapter2 = new TransferToMeStep1Adapter(list);
            this.MediaBrowserCompat$CustomActionResultReceiver = transferToMeStep1Adapter2;
            transferToMeStep1Adapter2.MediaBrowserCompat$ItemReceiver = this;
            this.recyclerView.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver);
            return;
        }
        transferToMeStep1Adapter.write = list;
        transferToMeStep1Adapter.IconCompatParcelizer.write();
    }

    public final void MediaBrowserCompat$ItemReceiver(parseOs parseos) {
        IconCompatParcelizer(parseos, true);
        this.RatingCompat = true;
    }

    public final void MediaBrowserCompat$ItemReceiver(parseSession parsesession, boolean z) {
        Intent intent;
        if (z) {
            intent = new Intent("com.scb.phone/BROADCAST_TRANSFER_NEXT_FAVOURITE_STEP");
        } else {
            intent = new Intent("com.scb.phone/BROADCAST_TRANSFER_NEXT_STEP");
        }
        intent.putExtra("com.scb.phone.EXTRA_TRANSFER_TARGET_DATA", parsesession);
        intent.putExtra("com.scb.phone.EXTRA_FROM_TRANSFER_TO_ME_PAGE", true);
        Bundle arguments = getArguments();
        String str = "TRANSFER";
        if (arguments != null) {
            str = arguments.getString("transfer_function", str);
        }
        if (str.equals("FIXED_TRANSFER")) {
            intent.putExtra("com.scb.phone.EXTRA_TRANSFER_FUNCTION", "FIXED_TRANSFER");
            intent.putExtra("com.scb.phone.EXTRA_TRANSFER_TO_MAIN_AUTO", false);
        }
        getContext().sendBroadcast(intent);
    }

    public final void IconCompatParcelizer(parseOs parseos) {
        IconCompatParcelizer(parseos, false);
    }

    private void IconCompatParcelizer(parseOs parseos, boolean z) {
        if (SystemClock.elapsedRealtime() - this.MediaBrowserCompat$SearchResultReceiver >= 300) {
            this.MediaBrowserCompat$SearchResultReceiver = SystemClock.elapsedRealtime();
            this.presenter.MediaBrowserCompat$ItemReceiver(parseos, z);
        }
    }

    @OnClick
    public void onCloseButtonClicked() {
        Context context = getContext();
        if (context != null) {
            Intent intent = new Intent("com.scb.phone/BROADCAST_TRANSFER_BACK_STEP");
            if (this.MediaBrowserCompat$MediaItem) {
                this.MediaBrowserCompat$MediaItem = false;
                intent.putExtra("com.scb.phone.EXTRA_TRANSFER_FUNCTION", "FIXED_TRANSFER");
            }
            context.sendBroadcast(intent);
        }
    }

    public static /* synthetic */ void write(TransferToMeStep1Fragment transferToMeStep1Fragment) {
        RttiBillExtractor rttiBillExtractor = transferToMeStep1Fragment.presenter;
        rttiBillExtractor.MediaBrowserCompat$SearchResultReceiver.read.MediaBrowserCompat$ItemReceiver(transferToMeStep1Fragment.setStackedBackground());
        rttiBillExtractor.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(new RttiBillExtractor$MediaBrowserCompat$ItemReceiver(rttiBillExtractor, (byte) 0));
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(TransferToMeStep1Fragment transferToMeStep1Fragment) {
        isSupportFragmentClass issupportfragmentclass;
        RttiBillExtractor rttiBillExtractor = transferToMeStep1Fragment.presenter;
        show show = new show(rttiBillExtractor.MediaDescriptionCompat);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new proxyGetLookAndFeelParameters(rttiBillExtractor)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        boolean z = true;
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            BillCaptureModule_GetUriKtaFactory billCaptureModule_GetUriKtaFactory = new BillCaptureModule_GetUriKtaFactory(issupportfragmentclass);
            if (rttiBillExtractor.RatingCompat == null) {
                z = false;
            }
            if (z) {
                billCaptureModule_GetUriKtaFactory.IconCompatParcelizer(rttiBillExtractor.RatingCompat);
            }
        }
    }
}
