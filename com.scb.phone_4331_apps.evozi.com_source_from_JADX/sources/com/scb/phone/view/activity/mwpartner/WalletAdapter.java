package com.scb.phone.view.activity.mwpartner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.squareup.picasso.Picasso$MediaBrowserCompat$CustomActionResultReceiver;
import java.util.ArrayList;
import java.util.List;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.getBuildVersion;
import p040o.onCreateDialog;
import p040o.onStart;
import p040o.validateSelectedDates;

public final class WalletAdapter extends RecyclerView.IconCompatParcelizer<WalletHolder> {
    /* access modifiers changed from: private */
    public final write MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final write MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final write read;
    final List<getBuildVersion> write = new ArrayList();

    public interface write {
        void write(getBuildVersion getbuildversion);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        boolean z;
        WalletHolder walletHolder = (WalletHolder) setcontentview;
        getBuildVersion getbuildversion = this.write.get(i);
        walletHolder.setHasDecor = getbuildversion;
        AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder crashlyticsReportSessionEventEncoder = getbuildversion.MediaBrowserCompat$ItemReceiver;
        walletHolder.tvShopName.setText(crashlyticsReportSessionEventEncoder.read);
        walletHolder.tvWalletId.setText(getbuildversion.write);
        ViewGroup viewGroup = walletHolder.llGoogleMyBusiness;
        if (walletHolder.setHasDecor.IconCompatParcelizer != null) {
            z = walletHolder.setHasDecor.IconCompatParcelizer.booleanValue();
        } else {
            z = false;
        }
        viewGroup.setVisibility(z ? 0 : 8);
        String str = crashlyticsReportSessionEventEncoder.IconCompatParcelizer;
        if (str == null || str.isEmpty()) {
            walletHolder.ivShopCover.setVisibility(8);
            walletHolder.llAddShopCoverContainer.setVisibility(0);
            return;
        }
        walletHolder.llAddShopCoverContainer.setVisibility(8);
        walletHolder.ivShopCover.setVisibility(0);
        FragmentBuilder_BindDepositSelectorFragment.read(str, walletHolder.ivShopCover, (Picasso$MediaBrowserCompat$CustomActionResultReceiver) new validateSelectedDates(walletHolder));
    }

    public class WalletHolder_ViewBinding implements Unbinder {
        private View IconCompatParcelizer;
        private View MediaBrowserCompat$CustomActionResultReceiver;
        private WalletHolder MediaBrowserCompat$ItemReceiver;
        private View write;

        public WalletHolder_ViewBinding(final WalletHolder walletHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = walletHolder;
            walletHolder.ivShopCover = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_shop_cover, "field 'ivShopCover'", ImageView.class);
            walletHolder.ivAddShopCover = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_add_shop_cover, "field 'ivAddShopCover'", ImageView.class);
            walletHolder.tvAddShopCover = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_add_shop_cover, "field 'tvAddShopCover'", TextView.class);
            walletHolder.tvShopName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_shop_name, "field 'tvShopName'", TextView.class);
            walletHolder.tvWalletId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_wallet_id, "field 'tvWalletId'", TextView.class);
            View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_shop_settings, "field 'btnShopSettings' and method 'onSettingsClick'");
            walletHolder.btnShopSettings = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_shop_settings, "field 'btnShopSettings'", Button.class);
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
            IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    WalletHolder.this.onSettingsClick();
                }
            });
            View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.btn_create_qr, "field 'btnCreateQr' and method 'onCreateQrClick'");
            walletHolder.btnCreateQr = (Button) onStart.write(IconCompatParcelizer3, R.id.btn_create_qr, "field 'btnCreateQr'", Button.class);
            this.IconCompatParcelizer = IconCompatParcelizer3;
            IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    WalletHolder.this.onCreateQrClick();
                }
            });
            walletHolder.llAddShopCoverContainer = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_add_shop_cover_container, "field 'llAddShopCoverContainer'", ViewGroup.class);
            walletHolder.llGoogleMyBusiness = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_gmb, "field 'llGoogleMyBusiness'", ViewGroup.class);
            View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.item_root, "method 'onClick'");
            this.write = IconCompatParcelizer4;
            IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    WalletHolder.this.onClick();
                }
            });
        }

        public final void read() {
            WalletHolder walletHolder = this.MediaBrowserCompat$ItemReceiver;
            if (walletHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                walletHolder.ivShopCover = null;
                walletHolder.ivAddShopCover = null;
                walletHolder.tvAddShopCover = null;
                walletHolder.tvShopName = null;
                walletHolder.tvWalletId = null;
                walletHolder.btnShopSettings = null;
                walletHolder.btnCreateQr = null;
                walletHolder.llAddShopCoverContainer = null;
                walletHolder.llGoogleMyBusiness = null;
                this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
                this.IconCompatParcelizer = null;
                this.write.setOnClickListener((View.OnClickListener) null);
                this.write = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public WalletAdapter(write write2, write write3, write write4) {
        this.MediaBrowserCompat$SearchResultReceiver = write2;
        this.MediaBrowserCompat$ItemReceiver = write3;
        this.read = write4;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public class WalletHolder extends RecyclerView.setContentView {
        @BindView
        Button btnCreateQr;
        @BindView
        Button btnShopSettings;
        @BindView
        ImageView ivAddShopCover;
        @BindView
        public ImageView ivShopCover;
        @BindView
        public ViewGroup llAddShopCoverContainer;
        @BindView
        ViewGroup llGoogleMyBusiness;
        getBuildVersion setHasDecor;
        @BindView
        TextView tvAddShopCover;
        @BindView
        TextView tvShopName;
        @BindView
        TextView tvWalletId;

        WalletHolder(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90712131494298, viewGroup, false));
            ButterKnife.IconCompatParcelizer(this, this.write);
        }

        /* access modifiers changed from: package-private */
        @OnClick
        public void onClick() {
            WalletAdapter.this.MediaBrowserCompat$SearchResultReceiver.write(this.setHasDecor);
        }

        /* access modifiers changed from: package-private */
        @OnClick
        public void onSettingsClick() {
            WalletAdapter.this.MediaBrowserCompat$ItemReceiver.write(this.setHasDecor);
        }

        /* access modifiers changed from: package-private */
        @OnClick
        public void onCreateQrClick() {
            WalletAdapter.this.read.write(this.setHasDecor);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new WalletHolder(viewGroup);
    }
}
