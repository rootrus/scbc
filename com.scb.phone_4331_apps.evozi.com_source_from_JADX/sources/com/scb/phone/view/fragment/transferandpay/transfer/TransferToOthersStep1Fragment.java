package com.scb.phone.view.fragment.transferandpay.transfer;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.transferandpay.transfer.TransferToOthersStep1Adapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.BillExtractor;
import p040o.BillWorkflowActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.CoordinatorLayout;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingBlockingQueue;
import p040o.FragmentBuilder_BindActivationSuccessfulFragment;
import p040o.FragmentBuilder_BindAddAccountInfoFragment;
import p040o.FragmentBuilder_BindAdditionDocumentTakePhotoFragment;
import p040o.FragmentBuilder_BindAddressSearchFragment;
import p040o.FragmentBuilder_BindAmortizationBreakdownAmountTabFragment;
import p040o.HmlPinActivity;
import p040o.IGoogleMapDelegate;
import p040o.KtaJsonBill_MembersInjector;
import p040o.access$2300;
import p040o.eventToJson;
import p040o.getNextTransition;
import p040o.getTopLeftCornerWidth;
import p040o.injectKtaExceptionResponseDeserializer;
import p040o.injectKtaExtractionServer;
import p040o.injectRttiDeserializer;
import p040o.injectRttiExtractionServerUrl;
import p040o.isSupportFragmentClass;
import p040o.parseEventApp;
import p040o.parseFile;
import p040o.parseOs;
import p040o.parseSession;
import p040o.setChildDrawingOrderCallback;
import p040o.show;

public class TransferToOthersStep1Fragment extends BaseFragment implements getTopLeftCornerWidth.ExpandedMenuView {
    private BulkTransferDeepLinkActivity IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver = false;
    private boolean MediaDescriptionCompat = false;
    private long MediaMetadataCompat;
    private BulkTransferDeepLinkActivity RatingCompat;
    @BindView
    ConstraintLayout layoutError;
    @HmlPinActivity
    public KtaJsonBill_MembersInjector presenter;
    @BindView
    RecyclerView recyclerView;

    public static TransferToOthersStep1Fragment IconCompatParcelizer() {
        Bundle bundle = new Bundle();
        TransferToOthersStep1Fragment transferToOthersStep1Fragment = new TransferToOthersStep1Fragment();
        transferToOthersStep1Fragment.setArguments(bundle);
        return transferToOthersStep1Fragment;
    }

    public static TransferToOthersStep1Fragment MediaBrowserCompat$ItemReceiver() {
        Bundle bundle = new Bundle();
        TransferToOthersStep1Fragment transferToOthersStep1Fragment = new TransferToOthersStep1Fragment();
        transferToOthersStep1Fragment.MediaBrowserCompat$CustomActionResultReceiver = true;
        transferToOthersStep1Fragment.setArguments(bundle);
        return transferToOthersStep1Fragment;
    }

    public static TransferToOthersStep1Fragment IconCompatParcelizer(String str, parseSession parsesession) {
        Bundle bundle = new Bundle();
        bundle.putString("com.scb.phone.EXTRA_TRANSFER_FUNCTION", str);
        bundle.putParcelable("fixed_transfer_display", parsesession);
        TransferToOthersStep1Fragment transferToOthersStep1Fragment = new TransferToOthersStep1Fragment();
        transferToOthersStep1Fragment.setArguments(bundle);
        return transferToOthersStep1Fragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f90292131494256, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        this.recyclerView.setHasFixedSize(true);
        ((CoordinatorLayout) this.recyclerView.AlertController$RecycleListView).MediaSessionCompat$ResultReceiverWrapper = false;
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            String str = "TRANSFER";
            if (arguments != null) {
                str = arguments.getString("com.scb.phone.EXTRA_TRANSFER_FUNCTION", str);
            }
            if (str.equals("FIXED_TRANSFER")) {
                this.MediaDescriptionCompat = true;
            }
        }
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public void onStart() {
        super.onStart();
        this.RatingCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("FAVORITE")).subscribe(new FragmentBuilder_BindAmortizationBreakdownAmountTabFragment(this), FragmentBuilder_BindAddressSearchFragment.write);
        this.IconCompatParcelizer = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_BANK_RECEIVED")).subscribe(new FragmentBuilder_BindAdditionDocumentTakePhotoFragment(this), FragmentBuilder_BindAddressSearchFragment.write);
    }

    public void onStop() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.RatingCompat;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.RatingCompat.dispose();
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

    public final void read(List<parseFile> list) {
        if (list.isEmpty()) {
            this.layoutError.setVisibility(0);
            this.recyclerView.setVisibility(8);
            return;
        }
        this.layoutError.setVisibility(8);
        this.recyclerView.setVisibility(0);
        TransferToOthersStep1Adapter transferToOthersStep1Adapter = new TransferToOthersStep1Adapter(list, new FragmentBuilder_BindAddAccountInfoFragment(this), new FragmentBuilder_BindActivationSuccessfulFragment(this));
        transferToOthersStep1Adapter.MediaBrowserCompat$ItemReceiver(true);
        this.recyclerView.setAdapter(transferToOthersStep1Adapter);
        this.recyclerView.setNestedScrollingEnabled(false);
    }

    public final void write(parseFile parsefile) {
        read(parsefile, true);
    }

    public final void MediaBrowserCompat$ItemReceiver(parseOs parseos, String str) {
        if (SystemClock.elapsedRealtime() - this.MediaMetadataCompat >= 300) {
            this.MediaMetadataCompat = SystemClock.elapsedRealtime();
            eventToJson eventtojson = new eventToJson();
            eventtojson.MediaBrowserCompat$ItemReceiver = str;
            eventtojson.MediaBrowserCompat$CustomActionResultReceiver = parseos.write;
            eventtojson.MediaDescriptionCompat = parseos.read;
            eventtojson.write = parseos.MediaBrowserCompat$ItemReceiver;
            eventtojson.read = parseos.MediaBrowserCompat$CustomActionResultReceiver;
            eventtojson.RatingCompat = IGoogleMapDelegate.OWN;
            IconCompatParcelizer((parseSession) eventtojson, true);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.presenter.MediaBrowserCompat$ItemReceiver(R.string.bank_not_found, access$2300.write.NAVIGATE_BACK);
    }

    public final void read(parseFile parsefile, boolean z) {
        if (SystemClock.elapsedRealtime() - this.MediaMetadataCompat >= 300) {
            this.MediaMetadataCompat = SystemClock.elapsedRealtime();
            IconCompatParcelizer(ForwardingBlockingQueue.IconCompatParcelizer(parsefile), z);
        }
    }

    private void IconCompatParcelizer(parseSession parsesession, boolean z) {
        Intent intent;
        if (z) {
            intent = new Intent("com.scb.phone/BROADCAST_TRANSFER_NEXT_FAVOURITE_STEP");
        } else {
            intent = new Intent("com.scb.phone/BROADCAST_TRANSFER_NEXT_STEP");
        }
        if (getArguments() != null && this.MediaDescriptionCompat) {
            intent.putExtra("com.scb.phone.EXTRA_TRANSFER_FUNCTION", "FIXED_TRANSFER");
            intent.putExtra("fixed_transfer_display", new parseEventApp().MediaBrowserCompat$CustomActionResultReceiver((parseSession) getArguments().getParcelable("fixed_transfer_display")));
        }
        intent.putExtra("com.scb.phone.EXTRA_TRANSFER_TARGET_DATA", parsesession);
        getContext().sendBroadcast(intent);
    }

    /* access modifiers changed from: private */
    public void write() {
        DebitCardResetOtpActivity<R> debitCardResetOtpActivity;
        KtaJsonBill_MembersInjector ktaJsonBill_MembersInjector = this.presenter;
        String stackedBackground = setStackedBackground();
        boolean z = this.MediaDescriptionCompat;
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            debitCardResetOtpActivity = ktaJsonBill_MembersInjector.MediaMetadataCompat.write(stackedBackground).map(new injectKtaExceptionResponseDeserializer(ktaJsonBill_MembersInjector));
        } else {
            debitCardResetOtpActivity = ktaJsonBill_MembersInjector.MediaMetadataCompat.read.MediaBrowserCompat$ItemReceiver(stackedBackground).map(new injectKtaExtractionServer(ktaJsonBill_MembersInjector, z));
        }
        ktaJsonBill_MembersInjector.MediaMetadataCompat.read(debitCardResetOtpActivity, new injectRttiExtractionServerUrl(ktaJsonBill_MembersInjector), new BillExtractor(ktaJsonBill_MembersInjector));
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onReloadClick() {
        write();
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(TransferToOthersStep1Fragment transferToOthersStep1Fragment) {
        isSupportFragmentClass issupportfragmentclass;
        KtaJsonBill_MembersInjector ktaJsonBill_MembersInjector = transferToOthersStep1Fragment.presenter;
        String str = ktaJsonBill_MembersInjector.MediaMetadataCompat.read.write().setBackgroundResource;
        show show = new show(ktaJsonBill_MembersInjector.write);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new BillWorkflowActivity(str)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        boolean z = true;
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            injectRttiDeserializer injectrttideserializer = new injectRttiDeserializer(issupportfragmentclass);
            if (ktaJsonBill_MembersInjector.RatingCompat == null) {
                z = false;
            }
            if (z) {
                injectrttideserializer.IconCompatParcelizer(ktaJsonBill_MembersInjector.RatingCompat);
            }
        }
    }
}
