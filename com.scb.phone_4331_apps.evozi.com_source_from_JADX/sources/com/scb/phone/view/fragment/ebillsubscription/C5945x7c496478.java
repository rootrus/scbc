package com.scb.phone.view.fragment.ebillsubscription;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.adapter.transferandpay.BillerAdapter;
import p040o.ImagePerfectionProfile;
import p040o.getStreetViewPanoramaCamera;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.ebillsubscription.EBillSubscriptionBillerListFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5945x7c496478 extends RecyclerView.ParcelableVolumeInfo {
    private LinearLayoutManager MediaBrowserCompat$CustomActionResultReceiver;
    final /* synthetic */ EBillSubscriptionBillerListFragment read;

    public C5945x7c496478(EBillSubscriptionBillerListFragment eBillSubscriptionBillerListFragment, LinearLayoutManager linearLayoutManager) {
        onGetStartedClick.write((Object) linearLayoutManager, "layoutManager");
        this.read = eBillSubscriptionBillerListFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = linearLayoutManager;
    }

    public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        onGetStartedClick.write((Object) recyclerView, "recyclerView");
        super.IconCompatParcelizer(recyclerView, i, i2);
        if (i2 > 0) {
            int MediaSessionCompat$ResultReceiverWrapper = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper();
            int MediaSessionCompat$QueueItem = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem();
            int MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat();
            ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection = this.read.eBillSubscriptionBillerListPresenter;
            if (useMRZPassportDetection == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("eBillSubscriptionBillerListPresenter");
            }
            getStreetViewPanoramaCamera getstreetviewpanoramacamera = useMRZPassportDetection.IconCompatParcelizer;
            if (getstreetviewpanoramacamera != null) {
                ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection2 = this.read.eBillSubscriptionBillerListPresenter;
                if (useMRZPassportDetection2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("eBillSubscriptionBillerListPresenter");
                }
                if (!useMRZPassportDetection2.MediaMetadataCompat && MediaMetadataCompat + MediaSessionCompat$ResultReceiverWrapper == MediaSessionCompat$QueueItem && MediaSessionCompat$QueueItem != 0) {
                    BillerAdapter unused = this.read.IconCompatParcelizer;
                    BillerAdapter.IconCompatParcelizer((BillerAdapter.IconCompatParcelizer) new write(this, getstreetviewpanoramacamera));
                }
            }
        }
    }

    /* renamed from: com.scb.phone.view.fragment.ebillsubscription.EBillSubscriptionBillerListFragment$MediaBrowserCompat$CustomActionResultReceiver$write */
    static final class write implements BillerAdapter.IconCompatParcelizer {
        private /* synthetic */ C5945x7c496478 IconCompatParcelizer;
        private /* synthetic */ getStreetViewPanoramaCamera MediaBrowserCompat$CustomActionResultReceiver;

        write(C5945x7c496478 eBillSubscriptionBillerListFragment$MediaBrowserCompat$CustomActionResultReceiver, getStreetViewPanoramaCamera getstreetviewpanoramacamera) {
            this.IconCompatParcelizer = eBillSubscriptionBillerListFragment$MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = getstreetviewpanoramacamera;
        }

        public final void IconCompatParcelizer() {
            ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection = this.IconCompatParcelizer.read.eBillSubscriptionBillerListPresenter;
            if (useMRZPassportDetection == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("eBillSubscriptionBillerListPresenter");
            }
            String MediaBrowserCompat$ItemReceiver = EBillSubscriptionBillerListFragment.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.read);
            String str = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) str, "billPaymentBillerPagination.scrollId");
            useMRZPassportDetection.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver, str, false);
        }
    }
}
