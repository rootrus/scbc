package com.scb.phone.view.adapter.creditcard;

import android.content.Context;
import android.graphics.PorterDuff;
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
import p040o.onStart;
import p040o.required;
import p040o.requiredProvider;
import p040o.setLastBaselineToBottomHeight;
import p040o.validateSPMV;

public final class CreditCardDetailUnbilledAdapter extends BaseExpandableRecycleViewAdapter {
    public required read;

    public final int MediaMetadataCompat(int i) {
        return i == 0 ? 0 : 1;
    }

    public class ChildViewHolder_ViewBinding implements Unbinder {
        private ChildViewHolder write;

        public ChildViewHolder_ViewBinding(ChildViewHolder childViewHolder, View view) {
            this.write = childViewHolder;
            childViewHolder.description = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_description_value, "field 'description'", TextView.class);
            childViewHolder.postDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_post_date_value, "field 'postDate'", TextView.class);
            childViewHolder.foreignCurrency = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_foreign_currency_value, "field 'foreignCurrency'", TextView.class);
            childViewHolder.originalCurrencyTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.original_currency_text_view, "field 'originalCurrencyTextView'", TextView.class);
            childViewHolder.postDateTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.post_date_text_view, "field 'postDateTextView'", TextView.class);
            childViewHolder.categoriesTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.categories_text_view, "field 'categoriesTextView'", TextView.class);
            childViewHolder.descriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.description_text_view, "field 'descriptionTextView'", TextView.class);
            childViewHolder.category = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_category_value, "field 'category'", TextView.class);
        }

        public final void read() {
            ChildViewHolder childViewHolder = this.write;
            if (childViewHolder != null) {
                this.write = null;
                childViewHolder.description = null;
                childViewHolder.postDate = null;
                childViewHolder.foreignCurrency = null;
                childViewHolder.originalCurrencyTextView = null;
                childViewHolder.postDateTextView = null;
                childViewHolder.categoriesTextView = null;
                childViewHolder.descriptionTextView = null;
                childViewHolder.category = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class HeaderViewHolder_ViewBinding implements Unbinder {
        private HeaderViewHolder MediaBrowserCompat$ItemReceiver;

        public HeaderViewHolder_ViewBinding(HeaderViewHolder headerViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = headerViewHolder;
            headerViewHolder.headerTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_header_title_text_view, "field 'headerTitle'", TextView.class);
            headerViewHolder.headerValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_header_value_text_view, "field 'headerValue'", TextView.class);
        }

        public final void read() {
            HeaderViewHolder headerViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (headerViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                headerViewHolder.headerTitle = null;
                headerViewHolder.headerValue = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ParentViewHolder_ViewBinding extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder_ViewBinding {
        private ParentViewHolder MediaBrowserCompat$ItemReceiver;

        public ParentViewHolder_ViewBinding(ParentViewHolder parentViewHolder, View view) {
            super(parentViewHolder, view);
            this.MediaBrowserCompat$ItemReceiver = parentViewHolder;
            parentViewHolder.container = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_container, "field 'container'", RelativeLayout.class);
            parentViewHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_title, "field 'title'", TextView.class);
            parentViewHolder.pending = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_pending, "field 'pending'", TextView.class);
            parentViewHolder.type = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_type, "field 'type'", TextView.class);
            parentViewHolder.value = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_value, "field 'value'", TextView.class);
            parentViewHolder.date = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_date, "field 'date'", TextView.class);
            parentViewHolder.line = onStart.IconCompatParcelizer(view, R.id.unbilled_line, "field 'line'");
            parentViewHolder.verticalLine = onStart.IconCompatParcelizer(view, R.id.unbilled_vertical_line_view, "field 'verticalLine'");
            parentViewHolder.expandIconImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'expandIconImageView'", ImageView.class);
        }

        public final void read() {
            ParentViewHolder parentViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (parentViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                parentViewHolder.container = null;
                parentViewHolder.title = null;
                parentViewHolder.pending = null;
                parentViewHolder.type = null;
                parentViewHolder.value = null;
                parentViewHolder.date = null;
                parentViewHolder.line = null;
                parentViewHolder.verticalLine = null;
                parentViewHolder.expandIconImageView = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public CreditCardDetailUnbilledAdapter(Context context, required required) {
        super(context);
        this.read = required;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.read.MediaBrowserCompat$CustomActionResultReceiver.size() + 1;
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new HeaderViewHolder(from.inflate(R.layout.f82522131493478, viewGroup, false));
        }
        return new ParentViewHolder(from.inflate(R.layout.f82532131493479, viewGroup, false));
    }

    public final RecyclerView.setContentView read(ViewGroup viewGroup, int i) {
        return new ChildViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82512131493477, viewGroup, false));
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof HeaderViewHolder) {
            HeaderViewHolder headerViewHolder = (HeaderViewHolder) setcontentview;
            headerViewHolder.headerTitle.setText(this.write.getString(R.string.credit_card_bills_unbilled));
            headerViewHolder.headerValue.setText(this.read.IconCompatParcelizer);
        } else if (setcontentview instanceof ParentViewHolder) {
            ParentViewHolder parentViewHolder = (ParentViewHolder) setcontentview;
            requiredProvider requiredprovider = this.read.MediaBrowserCompat$CustomActionResultReceiver.get(i - 1);
            parentViewHolder.title.setText(requiredprovider.MediaBrowserCompat$ItemReceiver);
            parentViewHolder.value.setText(requiredprovider.ParcelableVolumeInfo);
            parentViewHolder.date.setText(requiredprovider.f2929x50fd9e4a);
            parentViewHolder.pending.setVisibility(8);
            if (i <= 1 || i >= this.read.MediaBrowserCompat$CustomActionResultReceiver.size() + 1) {
                parentViewHolder.line.setVisibility(4);
            } else {
                parentViewHolder.line.setVisibility(0);
            }
            if (i == this.read.MediaBrowserCompat$CustomActionResultReceiver.size()) {
                parentViewHolder.verticalLine.setVisibility(8);
            } else {
                parentViewHolder.verticalLine.setVisibility(0);
            }
            if (requiredprovider.MediaDescriptionCompat) {
                parentViewHolder.expandIconImageView.setColorFilter(setLastBaselineToBottomHeight.read(this.write, R.color.f66402131099796), PorterDuff.Mode.SRC_ATOP);
                parentViewHolder.pending.setVisibility(0);
                parentViewHolder.value.setText(requiredprovider.read);
                parentViewHolder.title.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66402131099796));
                parentViewHolder.value.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66402131099796));
                parentViewHolder.date.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66402131099796));
            } else {
                parentViewHolder.expandIconImageView.setColorFilter(setLastBaselineToBottomHeight.read(this.write, R.color.f66092131099764), PorterDuff.Mode.SRC_ATOP);
                parentViewHolder.title.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66092131099764));
                parentViewHolder.date.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66402131099796));
                parentViewHolder.value.setTextColor(requiredprovider.MediaBrowserCompat$CustomActionResultReceiver ? this.write.getColor(R.color.f65962131099751) : this.write.getColor(R.color.f66092131099764));
            }
            BaseExpandableRecycleViewAdapter.MediaBrowserCompat$CustomActionResultReceiver(parentViewHolder);
        }
    }

    public final void write(RecyclerView.setContentView setcontentview, int i, int i2) {
        if (setcontentview instanceof ChildViewHolder) {
            ChildViewHolder childViewHolder = (ChildViewHolder) setcontentview;
            requiredProvider requiredprovider = this.read.MediaBrowserCompat$CustomActionResultReceiver.get(i - 1);
            childViewHolder.description.setText(requiredprovider.MediaBrowserCompat$ItemReceiver);
            childViewHolder.postDate.setText(requiredprovider.MediaMetadataCompat);
            childViewHolder.foreignCurrency.setText(requiredprovider.read);
            childViewHolder.category.setText(requiredprovider.IconCompatParcelizer);
            if (requiredprovider.MediaDescriptionCompat) {
                childViewHolder.originalCurrencyTextView.setVisibility(8);
                childViewHolder.foreignCurrency.setVisibility(8);
                childViewHolder.postDateTextView.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66402131099796));
                childViewHolder.description.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66402131099796));
                childViewHolder.descriptionTextView.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66402131099796));
                childViewHolder.postDate.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66402131099796));
                childViewHolder.category.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66402131099796));
                childViewHolder.categoriesTextView.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66402131099796));
            } else {
                childViewHolder.originalCurrencyTextView.setVisibility(0);
                childViewHolder.foreignCurrency.setVisibility(0);
                childViewHolder.postDateTextView.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f65772131099731));
                childViewHolder.description.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66092131099764));
                childViewHolder.descriptionTextView.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f65772131099731));
                childViewHolder.postDate.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66092131099764));
                childViewHolder.category.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66092131099764));
                childViewHolder.categoriesTextView.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f65772131099731));
            }
            if (requiredprovider.MediaBrowserCompat$SearchResultReceiver) {
                childViewHolder.originalCurrencyTextView.setVisibility(8);
                childViewHolder.foreignCurrency.setVisibility(8);
            } else if (!requiredprovider.MediaDescriptionCompat) {
                childViewHolder.originalCurrencyTextView.setVisibility(0);
                childViewHolder.foreignCurrency.setVisibility(0);
            }
        }
    }

    /* renamed from: a_ */
    public final boolean mo20940a_(RecyclerView.setContentView setcontentview) {
        return setcontentview instanceof ParentViewHolder;
    }

    static class HeaderViewHolder extends validateSPMV {
        @BindView
        TextView headerTitle;
        @BindView
        TextView headerValue;

        HeaderViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            RecyclerView.MediaDescriptionCompat mediaDescriptionCompat = (RecyclerView.MediaDescriptionCompat) view.getLayoutParams();
            mediaDescriptionCompat.height = 0;
            view.setLayoutParams(mediaDescriptionCompat);
        }
    }

    static class ParentViewHolder extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder {
        @BindView
        RelativeLayout container;
        @BindView
        TextView date;
        @BindView
        ImageView expandIconImageView;
        @BindView
        View line;
        @BindView
        TextView pending;
        @BindView
        TextView title;
        @BindView
        TextView type;
        @BindView
        TextView value;
        @BindView
        View verticalLine;

        ParentViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    static class ChildViewHolder extends validateSPMV {
        @BindView
        TextView categoriesTextView;
        @BindView
        TextView category;
        @BindView
        TextView description;
        @BindView
        TextView descriptionTextView;
        @BindView
        TextView foreignCurrency;
        @BindView
        TextView originalCurrencyTextView;
        @BindView
        TextView postDate;
        @BindView
        TextView postDateTextView;

        ChildViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
