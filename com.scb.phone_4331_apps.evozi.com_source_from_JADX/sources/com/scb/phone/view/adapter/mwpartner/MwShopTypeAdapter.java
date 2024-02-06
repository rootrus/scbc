package com.scb.phone.view.adapter.mwpartner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.onCreateDialog;
import p040o.onStart;

public final class MwShopTypeAdapter extends RecyclerView.IconCompatParcelizer<ShopTypeViewHolder> {
    public int MediaBrowserCompat$ItemReceiver = -1;
    public List<AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder> read;
    public read write;

    public interface read {
        void MediaBrowserCompat$ItemReceiver(AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ShopTypeViewHolder.MediaBrowserCompat$ItemReceiver((ShopTypeViewHolder) setcontentview, this.read.get(i));
    }

    public class ShopTypeViewHolder_ViewBinding implements Unbinder {
        private View IconCompatParcelizer;
        private ShopTypeViewHolder MediaBrowserCompat$ItemReceiver;

        public ShopTypeViewHolder_ViewBinding(final ShopTypeViewHolder shopTypeViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = shopTypeViewHolder;
            View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.root_view, "field 'rootView' and method 'onSelectType'");
            shopTypeViewHolder.rootView = (LinearLayout) onStart.write(IconCompatParcelizer2, R.id.root_view, "field 'rootView'", LinearLayout.class);
            this.IconCompatParcelizer = IconCompatParcelizer2;
            IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    ShopTypeViewHolder.this.onSelectType();
                }
            });
            shopTypeViewHolder.lineBorder = onStart.IconCompatParcelizer(view, R.id.line_border, "field 'lineBorder'");
            shopTypeViewHolder.radioCheck = (RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radio_mw_check, "field 'radioCheck'", RadioButton.class);
            shopTypeViewHolder.tvDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mw_description, "field 'tvDescription'", TextView.class);
            shopTypeViewHolder.tvRemarks = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mr_remarks, "field 'tvRemarks'", TextView.class);
        }

        public final void read() {
            ShopTypeViewHolder shopTypeViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (shopTypeViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                shopTypeViewHolder.rootView = null;
                shopTypeViewHolder.lineBorder = null;
                shopTypeViewHolder.radioCheck = null;
                shopTypeViewHolder.tvDescription = null;
                shopTypeViewHolder.tvRemarks = null;
                this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
                this.IconCompatParcelizer = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ShopTypeViewHolder extends RecyclerView.setContentView {
        @BindView
        View lineBorder;
        @BindView
        RadioButton radioCheck;
        @BindView
        LinearLayout rootView;
        @BindView
        TextView tvDescription;
        @BindView
        TextView tvRemarks;

        public ShopTypeViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }

        @OnClick
        public void onSelectType() {
            int i;
            MwShopTypeAdapter mwShopTypeAdapter = MwShopTypeAdapter.this;
            RecyclerView recyclerView = this.MediaMetadataCompat;
            int i2 = -1;
            if (recyclerView == null) {
                i = -1;
            } else {
                i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) this);
            }
            int unused = mwShopTypeAdapter.MediaBrowserCompat$ItemReceiver = i;
            if (MwShopTypeAdapter.this.write != null) {
                read MediaBrowserCompat$CustomActionResultReceiver = MwShopTypeAdapter.this.write;
                List write = MwShopTypeAdapter.this.read;
                RecyclerView recyclerView2 = this.MediaMetadataCompat;
                if (recyclerView2 != null) {
                    i2 = recyclerView2.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) this);
                }
                MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder) write.get(i2));
            }
            MwShopTypeAdapter.this.IconCompatParcelizer.write();
        }

        static /* synthetic */ void MediaBrowserCompat$ItemReceiver(ShopTypeViewHolder shopTypeViewHolder, AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder) {
            int i;
            shopTypeViewHolder.tvDescription.setText(crashlyticsReportSessionUserEncoder.read);
            shopTypeViewHolder.tvRemarks.setText(crashlyticsReportSessionUserEncoder.MediaBrowserCompat$ItemReceiver);
            RadioButton radioButton = shopTypeViewHolder.radioCheck;
            int IconCompatParcelizer = MwShopTypeAdapter.this.MediaBrowserCompat$ItemReceiver;
            RecyclerView recyclerView = shopTypeViewHolder.MediaMetadataCompat;
            int i2 = -1;
            if (recyclerView == null) {
                i = -1;
            } else {
                i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) shopTypeViewHolder);
            }
            int i3 = 0;
            radioButton.setChecked(IconCompatParcelizer == i);
            View view = shopTypeViewHolder.lineBorder;
            RecyclerView recyclerView2 = shopTypeViewHolder.MediaMetadataCompat;
            if (recyclerView2 != null) {
                i2 = recyclerView2.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) shopTypeViewHolder);
            }
            if (i2 == 2) {
                i3 = 8;
            }
            view.setVisibility(i3);
        }
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new ShopTypeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f84772131493704, viewGroup, false));
    }
}
