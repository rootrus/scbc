package com.scb.phone.view.adapter.investment.accountdetail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.TabParser$TabParserException;
import p040o.getCardTransactions;
import p040o.getMarkerFile;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class ScbsProductAdapter extends TabParser$TabParserException<getMarkerFile> {

    public class ScbsProductViewHolder_ViewBinding implements Unbinder {
        private ScbsProductViewHolder MediaBrowserCompat$ItemReceiver;

        public ScbsProductViewHolder_ViewBinding(ScbsProductViewHolder scbsProductViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = scbsProductViewHolder;
            scbsProductViewHolder.productNameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_product_name, "field 'productNameTextView'", TextView.class);
            scbsProductViewHolder.arrowImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_arrow, "field 'arrowImageView'", ImageView.class);
            scbsProductViewHolder.productValueTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_product_value, "field 'productValueTextView'", TextView.class);
            scbsProductViewHolder.productUnrealizedAmountTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_product_unrealized_amount, "field 'productUnrealizedAmountTextView'", TextView.class);
            scbsProductViewHolder.productSideTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_product_side, "field 'productSideTextView'", TextView.class);
            scbsProductViewHolder.productSymbolPriceTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_product_symbol_price, "field 'productSymbolPriceTextView'", TextView.class);
            scbsProductViewHolder.productArrowImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_product_arrow, "field 'productArrowImageView'", ImageView.class);
        }

        public final void read() {
            ScbsProductViewHolder scbsProductViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (scbsProductViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                scbsProductViewHolder.productNameTextView = null;
                scbsProductViewHolder.arrowImageView = null;
                scbsProductViewHolder.productValueTextView = null;
                scbsProductViewHolder.productUnrealizedAmountTextView = null;
                scbsProductViewHolder.productSideTextView = null;
                scbsProductViewHolder.productSymbolPriceTextView = null;
                scbsProductViewHolder.productArrowImageView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ScbsProductAdapter(Context context, View view, View view2) {
        super(context, view, view2);
    }

    public final TabParser$TabParserException<getMarkerFile>.CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver(ViewGroup viewGroup) {
        return new ScbsProductViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90972131494324, viewGroup, false));
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [androidx.recyclerview.widget.RecyclerView$setContentView, com.scb.phone.view.adapter.investment.accountdetail.ScbsProductAdapter$ScbsProductViewHolder] */
    public final void write(TabParser$TabParserException<getMarkerFile>.CustomActionResultReceiver customActionResultReceiver, int i) {
        ? r4 = (ScbsProductViewHolder) customActionResultReceiver;
        getMarkerFile getmarkerfile = this.write.get(i);
        r4.write.setOnClickListener(new getCardTransactions(r4, getmarkerfile));
        r4.productNameTextView.setText(getmarkerfile.read);
        r4.productValueTextView.setText(getmarkerfile.MediaBrowserCompat$SearchResultReceiver);
        r4.productUnrealizedAmountTextView.setText(getmarkerfile.MediaBrowserCompat$MediaItem);
        r4.productUnrealizedAmountTextView.setTextColor(setLastBaselineToBottomHeight.read(ScbsProductAdapter.this.MediaBrowserCompat$ItemReceiver, getmarkerfile.f2841x50fd9e4a));
        r4.arrowImageView.setImageResource(getmarkerfile.MediaDescriptionCompat);
        r4.productSymbolPriceTextView.setText(getmarkerfile.RatingCompat);
        r4.productSideTextView.setText(getmarkerfile.MediaMetadataCompat);
    }

    public class ScbsProductViewHolder extends TabParser$TabParserException<getMarkerFile>.CustomActionResultReceiver {
        @BindView
        ImageView arrowImageView;
        @BindView
        ImageView productArrowImageView;
        @BindView
        TextView productNameTextView;
        @BindView
        TextView productSideTextView;
        @BindView
        TextView productSymbolPriceTextView;
        @BindView
        TextView productUnrealizedAmountTextView;
        @BindView
        TextView productValueTextView;

        public ScbsProductViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
