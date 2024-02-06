package com.scb.phone.view.adapter.investment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.ArrayList;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.ItemCustom;
import p040o.Utils;
import p040o.newPassportOnDeviceExtractionServer;
import p040o.onGetStartedClick;
import p040o.onStart;

public final class InvestmentContextualAdsAdapter extends ItemCustom<Utils.C39334, AdViewHolder> {
    private ArrayList<Utils.C39334> MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final newPassportOnDeviceExtractionServer write;

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        return new AdViewHolder(this, viewGroup);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        AdViewHolder adViewHolder = (AdViewHolder) setcontentview;
        onGetStartedClick.write((Object) adViewHolder, "holder");
        Utils.C39334 r4 = this.MediaBrowserCompat$ItemReceiver.get(read(i));
        onGetStartedClick.IconCompatParcelizer((Object) r4, "items[finalPosition]");
        Utils.C39334 r42 = r4;
        onGetStartedClick.write((Object) r42, "display");
        adViewHolder.write.setOnClickListener(new C5758x44f985e2(adViewHolder, r42));
        View view = adViewHolder.write;
        onGetStartedClick.IconCompatParcelizer((Object) view, "itemView");
        view.getContext();
        ImageView imageView = adViewHolder.ivAdImage;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivAdImage");
        }
        FragmentBuilder_BindDepositSelectorFragment.MediaMetadataCompat(imageView, r42.write);
    }

    public final class AdViewHolder_ViewBinding implements Unbinder {
        private AdViewHolder write;

        public AdViewHolder_ViewBinding(AdViewHolder adViewHolder, View view) {
            this.write = adViewHolder;
            adViewHolder.ivAdImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_ad_image, "field 'ivAdImage'", ImageView.class);
        }

        public final void read() {
            AdViewHolder adViewHolder = this.write;
            if (adViewHolder != null) {
                this.write = null;
                adViewHolder.ivAdImage = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvestmentContextualAdsAdapter(ArrayList<Utils.C39334> arrayList, newPassportOnDeviceExtractionServer newpassportondeviceextractionserver) {
        super(arrayList);
        onGetStartedClick.write((Object) arrayList, "items");
        onGetStartedClick.write((Object) newpassportondeviceextractionserver, "investmentContextualAdsCallbackListener");
        this.MediaBrowserCompat$ItemReceiver = arrayList;
        this.write = newpassportondeviceextractionserver;
    }

    public final class AdViewHolder extends RecyclerView.setContentView {
        @BindView
        public ImageView ivAdImage;
        final /* synthetic */ InvestmentContextualAdsAdapter setHasDecor;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AdViewHolder(InvestmentContextualAdsAdapter investmentContextualAdsAdapter, ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90702131494297, viewGroup, false));
            onGetStartedClick.write((Object) viewGroup, "parent");
            this.setHasDecor = investmentContextualAdsAdapter;
            ButterKnife.IconCompatParcelizer(this, this.write);
        }
    }
}
