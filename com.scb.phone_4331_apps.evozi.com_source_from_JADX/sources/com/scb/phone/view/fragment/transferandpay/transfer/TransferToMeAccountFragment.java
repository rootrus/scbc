package com.scb.phone.view.fragment.transferandpay.transfer;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.adapter.transferandpay.transfer.TransferToMeStep1Adapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C7038x6747425f;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.RttiBillExtractor_Factory;
import p040o.getNextTransition;
import p040o.getTopLeftCornerWidth;
import p040o.isSupportFragmentClass;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.parseOs;
import p040o.parseSession;
import p040o.setChildDrawingOrderCallback;
import p040o.show;
import p040o.writeUInt64NoTag;

public final class TransferToMeAccountFragment extends BaseFragment implements getTopLeftCornerWidth.setTitle, TransferToMeStep1Adapter.write {
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer((byte) 0);
    private TransferToMeStep1Adapter MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$MediaItem;
    private long MediaBrowserCompat$SearchResultReceiver;
    private BulkTransferDeepLinkActivity MediaDescriptionCompat;
    private BulkTransferDeepLinkActivity MediaMetadataCompat;
    @HmlPinActivity
    public RttiBillExtractor_Factory presenter;
    @BindView
    public RecyclerView recyclerView;
    @BindView
    public ViewGroup viewGroupNoTargets;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    static final class read<T> implements DebitCardMarketConductDeepLinkActivity<Intent> {
        private /* synthetic */ TransferToMeAccountFragment write;

        read(TransferToMeAccountFragment transferToMeAccountFragment) {
            this.write = transferToMeAccountFragment;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            TransferToMeAccountFragment transferToMeAccountFragment = this.write;
            onGetStartedClick.IconCompatParcelizer((Object) (Intent) obj, "it");
            TransferToMeAccountFragment.IconCompatParcelizer(transferToMeAccountFragment);
        }
    }

    static final class write<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        public static final write write = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            onCheckBoxClick.write((Throwable) obj);
        }
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f90272131494254, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        RttiBillExtractor_Factory rttiBillExtractor_Factory = this.presenter;
        if (rttiBillExtractor_Factory == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        rttiBillExtractor_Factory.MediaBrowserCompat$ItemReceiver(this);
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView2.setNestedScrollingEnabled(false);
        RttiBillExtractor_Factory rttiBillExtractor_Factory2 = this.presenter;
        if (rttiBillExtractor_Factory2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("account_source")) == null) {
            str = "";
        }
        rttiBillExtractor_Factory2.read(str);
    }

    public final void onStart() {
        super.onStart();
        if (!this.MediaBrowserCompat$MediaItem) {
            this.MediaDescriptionCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("FAVORITE")).subscribe(new read(this), C6200xb0fa45ec.read);
            this.MediaMetadataCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_BANK_RECEIVED")).subscribe(new TransferToMeAccountFragment$MediaBrowserCompat$ItemReceiver(this), write.write);
        }
    }

    public final void onStop() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaDescriptionCompat;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            bulkTransferDeepLinkActivity.dispose();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2 = this.MediaMetadataCompat;
        if (bulkTransferDeepLinkActivity2 != null && !bulkTransferDeepLinkActivity2.isDisposed()) {
            bulkTransferDeepLinkActivity2.dispose();
        }
        super.onStop();
    }

    public final void onDestroy() {
        RttiBillExtractor_Factory rttiBillExtractor_Factory = this.presenter;
        if (rttiBillExtractor_Factory == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        rttiBillExtractor_Factory.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<? extends parseOs> list) {
        onGetStartedClick.write((Object) list, "targets");
        if (list.isEmpty()) {
            ViewGroup viewGroup = this.viewGroupNoTargets;
            if (viewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewGroupNoTargets");
            }
            viewGroup.setVisibility(0);
            RecyclerView recyclerView2 = this.recyclerView;
            if (recyclerView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
            }
            recyclerView2.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = this.viewGroupNoTargets;
        if (viewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewGroupNoTargets");
        }
        viewGroup2.setVisibility(8);
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView3.setVisibility(0);
        TransferToMeStep1Adapter transferToMeStep1Adapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (transferToMeStep1Adapter == null) {
            TransferToMeStep1Adapter transferToMeStep1Adapter2 = new TransferToMeStep1Adapter(list, (byte) 0);
            this.MediaBrowserCompat$CustomActionResultReceiver = transferToMeStep1Adapter2;
            transferToMeStep1Adapter2.MediaBrowserCompat$ItemReceiver = this;
            RecyclerView recyclerView4 = this.recyclerView;
            if (recyclerView4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
            }
            recyclerView4.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver);
        } else if (transferToMeStep1Adapter != null) {
            transferToMeStep1Adapter.write = list;
            transferToMeStep1Adapter.IconCompatParcelizer.write();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(parseOs parseos) {
        onGetStartedClick.write((Object) parseos, "favourite");
        write(parseos, true);
        this.MediaBrowserCompat$MediaItem = true;
    }

    public final void MediaBrowserCompat$ItemReceiver(parseSession parsesession, boolean z) {
        Intent intent;
        onGetStartedClick.write((Object) parsesession, "nextStepData");
        if (z) {
            intent = new Intent("com.scb.phone/BROADCAST_TRANSFER_NEXT_FAVOURITE_STEP");
        } else {
            intent = new Intent("com.scb.phone/BROADCAST_TRANSFER_NEXT_STEP");
        }
        intent.putExtra("com.scb.phone.EXTRA_TRANSFER_TARGET_DATA", parsesession);
        Context context = getContext();
        if (context != null) {
            context.sendBroadcast(intent);
        }
    }

    public final void IconCompatParcelizer(parseOs parseos) {
        onGetStartedClick.write((Object) parseos, "display");
        write(parseos, false);
    }

    private void write(parseOs parseos, boolean z) {
        onGetStartedClick.write((Object) parseos, "display");
        if (SystemClock.elapsedRealtime() - this.MediaBrowserCompat$SearchResultReceiver >= 300) {
            this.MediaBrowserCompat$SearchResultReceiver = SystemClock.elapsedRealtime();
            RttiBillExtractor_Factory rttiBillExtractor_Factory = this.presenter;
            if (rttiBillExtractor_Factory == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            rttiBillExtractor_Factory.IconCompatParcelizer(parseos, z);
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(TransferToMeAccountFragment transferToMeAccountFragment) {
        RttiBillExtractor_Factory rttiBillExtractor_Factory = transferToMeAccountFragment.presenter;
        if (rttiBillExtractor_Factory == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String stackedBackground = transferToMeAccountFragment.setStackedBackground();
        onGetStartedClick.IconCompatParcelizer((Object) stackedBackground, "language");
        onGetStartedClick.write((Object) stackedBackground, "language");
        rttiBillExtractor_Factory.IconCompatParcelizer.write(stackedBackground);
        rttiBillExtractor_Factory.IconCompatParcelizer.IconCompatParcelizer(new RttiBillExtractor_Factory.read());
    }

    public static final /* synthetic */ void IconCompatParcelizer(TransferToMeAccountFragment transferToMeAccountFragment) {
        isSupportFragmentClass issupportfragmentclass;
        RttiBillExtractor_Factory rttiBillExtractor_Factory = transferToMeAccountFragment.presenter;
        if (rttiBillExtractor_Factory == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        List<? extends parseOs> list = rttiBillExtractor_Factory.write;
        if (list != null) {
            show show = new show(list);
            show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new RttiBillExtractor_Factory.MediaMetadataCompat(rttiBillExtractor_Factory)));
            if (show2.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
        } else {
            issupportfragmentclass = null;
        }
        if (issupportfragmentclass != null) {
            boolean z = true;
            if (issupportfragmentclass.IconCompatParcelizer != null) {
                writeUInt64NoTag.IconCompatParcelizer rttiBillExtractor_Factory$MediaBrowserCompat$SearchResultReceiver = new C7038x6747425f(issupportfragmentclass);
                if (rttiBillExtractor_Factory.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    rttiBillExtractor_Factory$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(rttiBillExtractor_Factory.RatingCompat);
                }
            }
        }
    }
}
