package com.scb.phone.view.adapter.investment.funddetails;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.adapter.BaseExpandableRecycleViewAdapter;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.getCurrentTimeMillis;
import p040o.getDeejungTransactionPlans;
import p040o.onStart;
import p040o.validateGER;
import p040o.validateHERK;
import p040o.validateSPMV;

public final class DividendSummaryAdapter extends BaseExpandableRecycleViewAdapter {
    public List<getCurrentTimeMillis> MediaBrowserCompat$ItemReceiver;
    private View.OnClickListener MediaMetadataCompat = new getDeejungTransactionPlans(this);
    private validateGER read;

    /* renamed from: a_ */
    public final boolean mo20940a_(RecyclerView.setContentView setcontentview) {
        return false;
    }

    public class ChildViewHolder_ViewBinding implements Unbinder {
        private ChildViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ChildViewHolder_ViewBinding(ChildViewHolder childViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = childViewHolder;
            childViewHolder.paymentDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dividend_child_payment_date_value, "field 'paymentDate'", TextView.class);
            childViewHolder.tax = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dividend_child_tax_value, "field 'tax'", TextView.class);
            childViewHolder.afterTax = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dividend_child_after_tax_value, "field 'afterTax'", TextView.class);
        }

        public final void read() {
            ChildViewHolder childViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (childViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                childViewHolder.paymentDate = null;
                childViewHolder.tax = null;
                childViewHolder.afterTax = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ParentViewHolder_ViewBinding extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder_ViewBinding {
        private ParentViewHolder write;

        public ParentViewHolder_ViewBinding(ParentViewHolder parentViewHolder, View view) {
            super(parentViewHolder, view);
            this.write = parentViewHolder;
            parentViewHolder.container = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dividend_container, "field 'container'", RelativeLayout.class);
            parentViewHolder.exDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dividend_execute_date, "field 'exDate'", TextView.class);
            parentViewHolder.line = onStart.IconCompatParcelizer(view, R.id.dividend_line, "field 'line'");
            parentViewHolder.verticalLine = onStart.IconCompatParcelizer(view, R.id.dividend_vertical_line_view, "field 'verticalLine'");
            parentViewHolder.expandIconImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'expandIconImageView'", ImageView.class);
        }

        public final void read() {
            ParentViewHolder parentViewHolder = this.write;
            if (parentViewHolder != null) {
                this.write = null;
                parentViewHolder.container = null;
                parentViewHolder.exDate = null;
                parentViewHolder.line = null;
                parentViewHolder.verticalLine = null;
                parentViewHolder.expandIconImageView = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DividendSummaryAdapter(Context context, List<getCurrentTimeMillis> list, validateGER validateger) {
        super(context);
        this.write = context;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.read = validateger;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup, int i) {
        return new ParentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82872131493513, viewGroup, false), this.MediaMetadataCompat);
    }

    public final RecyclerView.setContentView read(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82862131493512, viewGroup, false);
        inflate.measure(0, 0);
        return new ChildViewHolder(inflate);
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof ParentViewHolder) {
            ParentViewHolder parentViewHolder = (ParentViewHolder) setcontentview;
            parentViewHolder.exDate.setText(this.MediaBrowserCompat$ItemReceiver.get(i).IconCompatParcelizer);
            if (i > 0) {
                parentViewHolder.line.setVisibility(0);
            } else {
                parentViewHolder.line.setVisibility(4);
            }
            if (i == this.MediaBrowserCompat$ItemReceiver.size() - 1) {
                parentViewHolder.verticalLine.setVisibility(8);
            } else {
                parentViewHolder.verticalLine.setVisibility(0);
            }
            BaseExpandableRecycleViewAdapter.MediaBrowserCompat$CustomActionResultReceiver(parentViewHolder);
        }
    }

    public final void write(RecyclerView.setContentView setcontentview, int i, int i2) {
        if (setcontentview instanceof ChildViewHolder) {
            ChildViewHolder childViewHolder = (ChildViewHolder) setcontentview;
            getCurrentTimeMillis getcurrenttimemillis = this.MediaBrowserCompat$ItemReceiver.get(i);
            childViewHolder.paymentDate.setText(getcurrenttimemillis.MediaBrowserCompat$CustomActionResultReceiver);
            childViewHolder.tax.setText(getcurrenttimemillis.MediaBrowserCompat$MediaItem);
            childViewHolder.afterTax.setText(getcurrenttimemillis.read);
        }
    }

    static class ParentViewHolder extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder {
        @BindView
        RelativeLayout container;
        @BindView
        TextView exDate;
        @BindView
        ImageView expandIconImageView;
        @BindView
        View line;
        @BindView
        View verticalLine;

        ParentViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.container.setOnClickListener(onClickListener);
        }
    }

    static class ChildViewHolder extends validateSPMV {
        @BindView
        TextView afterTax;
        @BindView
        TextView paymentDate;
        @BindView
        TextView tax;

        ChildViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public static /* synthetic */ void write(DividendSummaryAdapter dividendSummaryAdapter, View view) {
        int i;
        long j;
        validateHERK validateherk;
        RecyclerView.setContentView IconCompatParcelizer = AlertController$RecycleListView.IconCompatParcelizer(view);
        if (IconCompatParcelizer != null) {
            RecyclerView recyclerView = IconCompatParcelizer.MediaMetadataCompat;
            if (recyclerView == null) {
                i = -1;
            } else {
                i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer);
            }
            if (i != -1) {
                validateHERK validateherk2 = dividendSummaryAdapter.read.MediaDescriptionCompat;
                if (validateherk2 == null) {
                    j = -1;
                } else {
                    j = validateherk2.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
                }
                int i2 = (int) j;
                FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat mediaDescriptionCompat = dividendSummaryAdapter.read.MediaDescriptionCompat.MediaDescriptionCompat;
                boolean z = true;
                if (!(mediaDescriptionCompat.RatingCompat == 0) && mediaDescriptionCompat.write != 0) {
                    z = false;
                }
                if (z) {
                    validateHERK validateherk3 = dividendSummaryAdapter.read.MediaDescriptionCompat;
                    if (validateherk3 != null) {
                        boolean read2 = validateherk3.read(i2, false, (Object) null);
                        return;
                    }
                    return;
                }
                for (int i3 = 0; i3 < dividendSummaryAdapter.MediaBrowserCompat$ItemReceiver.size(); i3++) {
                    if (!(i3 == i2 || !dividendSummaryAdapter.read.IconCompatParcelizer(i3) || (validateherk = dividendSummaryAdapter.read.MediaDescriptionCompat) == null)) {
                        boolean MediaBrowserCompat$ItemReceiver2 = validateherk.MediaBrowserCompat$ItemReceiver(i3, false, (Object) null);
                    }
                }
                if (dividendSummaryAdapter.read.IconCompatParcelizer(i2)) {
                    validateHERK validateherk4 = dividendSummaryAdapter.read.MediaDescriptionCompat;
                    if (validateherk4 != null) {
                        boolean MediaBrowserCompat$ItemReceiver3 = validateherk4.MediaBrowserCompat$ItemReceiver(i2, false, (Object) null);
                        return;
                    }
                    return;
                }
                validateHERK validateherk5 = dividendSummaryAdapter.read.MediaDescriptionCompat;
                if (validateherk5 != null) {
                    boolean read3 = validateherk5.read(i2, false, (Object) null);
                }
            }
        }
    }
}
