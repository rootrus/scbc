package com.scb.phone.view.activity.debitatm;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
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
import java.util.ArrayList;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Device;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;
import p040o.setSimulator;
import p040o.validateSPMV;

public final class DebitTransactionAdapter extends BaseExpandableRecycleViewAdapter {
    private Context MediaBrowserCompat$ItemReceiver;
    public List<setSimulator> read = new ArrayList();

    public class ChildViewHolder_ViewBinding implements Unbinder {
        private ChildViewHolder IconCompatParcelizer;

        public ChildViewHolder_ViewBinding(ChildViewHolder childViewHolder, View view) {
            this.IconCompatParcelizer = childViewHolder;
            childViewHolder.description = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_description_value, "field 'description'", TextView.class);
            childViewHolder.titleDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.description_text_view, "field 'titleDescription'", TextView.class);
            childViewHolder.titlePostDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.post_date_text_view, "field 'titlePostDate'", TextView.class);
            childViewHolder.postDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_post_date_value, "field 'postDate'", TextView.class);
            childViewHolder.originalCurrency = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.original_currency_text_view, "field 'originalCurrency'", TextView.class);
            childViewHolder.foreignCurrency = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_foreign_currency_value, "field 'foreignCurrency'", TextView.class);
            childViewHolder.titleCategory = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.categories_text_view, "field 'titleCategory'", TextView.class);
            childViewHolder.category = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_category_value, "field 'category'", TextView.class);
        }

        public final void read() {
            ChildViewHolder childViewHolder = this.IconCompatParcelizer;
            if (childViewHolder != null) {
                this.IconCompatParcelizer = null;
                childViewHolder.description = null;
                childViewHolder.titleDescription = null;
                childViewHolder.titlePostDate = null;
                childViewHolder.postDate = null;
                childViewHolder.originalCurrency = null;
                childViewHolder.foreignCurrency = null;
                childViewHolder.titleCategory = null;
                childViewHolder.category = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ParentViewHolder_ViewBinding extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder_ViewBinding {
        private ParentViewHolder IconCompatParcelizer;

        public ParentViewHolder_ViewBinding(ParentViewHolder parentViewHolder, View view) {
            super(parentViewHolder, view);
            this.IconCompatParcelizer = parentViewHolder;
            parentViewHolder.containerPrepaid = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.billed_detail_container, "field 'containerPrepaid'", RelativeLayout.class);
            parentViewHolder.titlePrepaid = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.billed_detail_title, "field 'titlePrepaid'", TextView.class);
            parentViewHolder.valuePrepaid = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.billed_detail_value, "field 'valuePrepaid'", TextView.class);
            parentViewHolder.datePrepaid = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.billed_detail_date, "field 'datePrepaid'", TextView.class);
            parentViewHolder.billedPending = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.billed_pending, "field 'billedPending'", TextView.class);
            parentViewHolder.expandIconImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'expandIconImageView'", ImageView.class);
            parentViewHolder.linePrepaid = onStart.IconCompatParcelizer(view, R.id.billed_line, "field 'linePrepaid'");
            parentViewHolder.verticalLinePrepaid = onStart.IconCompatParcelizer(view, R.id.billed_vertical_line_view, "field 'verticalLinePrepaid'");
        }

        public final void read() {
            ParentViewHolder parentViewHolder = this.IconCompatParcelizer;
            if (parentViewHolder != null) {
                this.IconCompatParcelizer = null;
                parentViewHolder.containerPrepaid = null;
                parentViewHolder.titlePrepaid = null;
                parentViewHolder.valuePrepaid = null;
                parentViewHolder.datePrepaid = null;
                parentViewHolder.billedPending = null;
                parentViewHolder.expandIconImageView = null;
                parentViewHolder.linePrepaid = null;
                parentViewHolder.verticalLinePrepaid = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DebitTransactionAdapter(Context context) {
        super(context);
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.read.size();
    }

    public final int MediaMetadataCompat(int i) {
        return i < this.read.size() ? 1 : 0;
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup, int i) {
        this.MediaBrowserCompat$ItemReceiver = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new ParentViewHolder(from.inflate(R.layout.f82472131493473, viewGroup, false));
        }
        return new IconCompatParcelizer(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83992131493625, viewGroup, false));
    }

    public final RecyclerView.setContentView read(ViewGroup viewGroup, int i) {
        return new ChildViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82512131493477, viewGroup, false));
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof ParentViewHolder) {
            ParentViewHolder parentViewHolder = (ParentViewHolder) setcontentview;
            setSimulator setsimulator = this.read.get(i);
            if (setsimulator == null) {
                parentViewHolder.titlePrepaid.setText("Loading");
                return;
            }
            parentViewHolder.titlePrepaid.setText(setsimulator.read);
            parentViewHolder.datePrepaid.setText(setsimulator.MediaBrowserCompat$SearchResultReceiver);
            if ("C".equalsIgnoreCase(setsimulator.RatingCompat)) {
                TextView textView = parentViewHolder.valuePrepaid;
                StringBuilder sb = new StringBuilder();
                sb.append("+");
                sb.append(setsimulator.MediaMetadataCompat);
                textView.setText(sb.toString());
                parentViewHolder.valuePrepaid.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66422131099798));
            } else {
                TextView textView2 = parentViewHolder.valuePrepaid;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("-");
                sb2.append(setsimulator.MediaMetadataCompat);
                textView2.setText(sb2.toString());
                parentViewHolder.valuePrepaid.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66452131099801));
            }
            if (i <= 0 || i >= this.read.size()) {
                parentViewHolder.linePrepaid.setVisibility(4);
            } else {
                parentViewHolder.linePrepaid.setVisibility(0);
            }
            if (i == this.read.size() - 1) {
                parentViewHolder.verticalLinePrepaid.setVisibility(8);
            } else {
                parentViewHolder.verticalLinePrepaid.setVisibility(0);
            }
            if ("A".equalsIgnoreCase(setsimulator.ParcelableVolumeInfo)) {
                parentViewHolder.billedPending.setVisibility(0);
                parentViewHolder.expandIconImageView.setColorFilter(setLastBaselineToBottomHeight.read(this.write, R.color.f66402131099796), PorterDuff.Mode.SRC_ATOP);
                parentViewHolder.titlePrepaid.setTextColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$ItemReceiver, R.color.f66402131099796));
                parentViewHolder.datePrepaid.setTextColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$ItemReceiver, R.color.f66402131099796));
                parentViewHolder.valuePrepaid.setTextColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$ItemReceiver, R.color.f66402131099796));
            }
            BaseExpandableRecycleViewAdapter.MediaBrowserCompat$CustomActionResultReceiver(parentViewHolder);
        }
    }

    public final void write(RecyclerView.setContentView setcontentview, int i, int i2) {
        String str;
        if (setcontentview instanceof ChildViewHolder) {
            ChildViewHolder childViewHolder = (ChildViewHolder) setcontentview;
            setSimulator setsimulator = this.read.get(i);
            TextView textView = childViewHolder.category;
            AutoValue_CrashlyticsReport_Session_Device autoValue_CrashlyticsReport_Session_Device = setsimulator.MediaBrowserCompat$CustomActionResultReceiver;
            if (autoValue_CrashlyticsReport_Session_Device != null) {
                str = autoValue_CrashlyticsReport_Session_Device.MediaBrowserCompat$ItemReceiver;
            } else {
                str = null;
            }
            textView.setText(str);
            childViewHolder.description.setText(setsimulator.read);
            if ("THB".equalsIgnoreCase(setsimulator.MediaBrowserCompat$ItemReceiver) || TextUtils.isEmpty(setsimulator.MediaBrowserCompat$ItemReceiver)) {
                childViewHolder.originalCurrency.setVisibility(8);
                childViewHolder.foreignCurrency.setVisibility(8);
            } else {
                childViewHolder.originalCurrency.setVisibility(0);
                childViewHolder.foreignCurrency.setVisibility(0);
                TextView textView2 = childViewHolder.foreignCurrency;
                StringBuilder sb = new StringBuilder();
                sb.append(setsimulator.MediaBrowserCompat$ItemReceiver);
                sb.append(" ");
                sb.append(setsimulator.write);
                textView2.setText(sb.toString());
            }
            childViewHolder.postDate.setText(setsimulator.MediaBrowserCompat$MediaItem);
            if ("A".equalsIgnoreCase(setsimulator.ParcelableVolumeInfo)) {
                childViewHolder.titleDescription.setTextColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$ItemReceiver, R.color.f66402131099796));
                childViewHolder.description.setTextColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$ItemReceiver, R.color.f66402131099796));
                childViewHolder.originalCurrency.setTextColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$ItemReceiver, R.color.f66402131099796));
                childViewHolder.foreignCurrency.setTextColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$ItemReceiver, R.color.f66402131099796));
                childViewHolder.titlePostDate.setTextColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$ItemReceiver, R.color.f66402131099796));
                childViewHolder.postDate.setTextColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$ItemReceiver, R.color.f66402131099796));
                childViewHolder.titleCategory.setTextColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$ItemReceiver, R.color.f66402131099796));
                childViewHolder.category.setTextColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$ItemReceiver, R.color.f66402131099796));
            }
        }
    }

    /* renamed from: a_ */
    public final boolean mo20940a_(RecyclerView.setContentView setcontentview) {
        return setcontentview instanceof ParentViewHolder;
    }

    static class ParentViewHolder extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder {
        @BindView
        TextView billedPending;
        @BindView
        RelativeLayout containerPrepaid;
        @BindView
        TextView datePrepaid;
        @BindView
        ImageView expandIconImageView;
        @BindView
        View linePrepaid;
        @BindView
        TextView titlePrepaid;
        @BindView
        TextView valuePrepaid;
        @BindView
        View verticalLinePrepaid;

        ParentViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    static class ChildViewHolder extends validateSPMV {
        @BindView
        TextView category;
        @BindView
        TextView description;
        @BindView
        TextView foreignCurrency;
        @BindView
        TextView originalCurrency;
        @BindView
        TextView postDate;
        @BindView
        TextView titleCategory;
        @BindView
        TextView titleDescription;
        @BindView
        TextView titlePostDate;

        ChildViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    static class IconCompatParcelizer extends validateSPMV {
        IconCompatParcelizer(View view) {
            super(view);
        }
    }
}
