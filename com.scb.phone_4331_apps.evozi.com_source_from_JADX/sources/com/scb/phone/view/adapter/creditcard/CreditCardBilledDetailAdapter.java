package com.scb.phone.view.adapter.creditcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.adapter.BaseExpandableRecycleViewAdapter;
import p040o.getInterface;
import p040o.isDirectInjection;
import p040o.onStart;
import p040o.validateSPMV;

public final class CreditCardBilledDetailAdapter extends BaseExpandableRecycleViewAdapter {
    private getInterface MediaBrowserCompat$ItemReceiver;

    public class ChildViewHolder_ViewBinding implements Unbinder {
        private ChildViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ChildViewHolder_ViewBinding(ChildViewHolder childViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = childViewHolder;
            childViewHolder.description = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_description_value, "field 'description'", TextView.class);
            childViewHolder.postDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_post_date_value, "field 'postDate'", TextView.class);
            childViewHolder.originalCurrency = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.original_currency_text_view, "field 'originalCurrency'", TextView.class);
            childViewHolder.foreignCurrency = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_foreign_currency_value, "field 'foreignCurrency'", TextView.class);
            childViewHolder.category = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unbilled_category_value, "field 'category'", TextView.class);
        }

        public final void read() {
            ChildViewHolder childViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (childViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                childViewHolder.description = null;
                childViewHolder.postDate = null;
                childViewHolder.originalCurrency = null;
                childViewHolder.foreignCurrency = null;
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
            parentViewHolder.container = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.billed_detail_container, "field 'container'", RelativeLayout.class);
            parentViewHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.billed_detail_title, "field 'title'", TextView.class);
            parentViewHolder.value = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.billed_detail_value, "field 'value'", TextView.class);
            parentViewHolder.date = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.billed_detail_date, "field 'date'", TextView.class);
            parentViewHolder.line = onStart.IconCompatParcelizer(view, R.id.billed_line, "field 'line'");
            parentViewHolder.verticalLine = onStart.IconCompatParcelizer(view, R.id.billed_vertical_line_view, "field 'verticalLine'");
        }

        public final void read() {
            ParentViewHolder parentViewHolder = this.IconCompatParcelizer;
            if (parentViewHolder != null) {
                this.IconCompatParcelizer = null;
                parentViewHolder.container = null;
                parentViewHolder.title = null;
                parentViewHolder.value = null;
                parentViewHolder.date = null;
                parentViewHolder.line = null;
                parentViewHolder.verticalLine = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public CreditCardBilledDetailAdapter(Context context, getInterface getinterface) {
        super(context);
        this.MediaBrowserCompat$ItemReceiver = getinterface;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.RatingCompat.size();
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup, int i) {
        return new ParentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82472131493473, viewGroup, false));
    }

    public final RecyclerView.setContentView read(ViewGroup viewGroup, int i) {
        return new ChildViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82512131493477, viewGroup, false));
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        int i2;
        Context context;
        if (setcontentview instanceof ParentViewHolder) {
            ParentViewHolder parentViewHolder = (ParentViewHolder) setcontentview;
            isDirectInjection isdirectinjection = this.MediaBrowserCompat$ItemReceiver.RatingCompat.get(i);
            parentViewHolder.title.setText(isdirectinjection.MediaBrowserCompat$CustomActionResultReceiver);
            parentViewHolder.date.setText(isdirectinjection.MediaSessionCompat$ResultReceiverWrapper);
            parentViewHolder.value.setText(isdirectinjection.MediaDescriptionCompat);
            if (i <= 0 || i >= this.MediaBrowserCompat$ItemReceiver.RatingCompat.size()) {
                parentViewHolder.line.setVisibility(4);
            } else {
                parentViewHolder.line.setVisibility(0);
            }
            if (i == this.MediaBrowserCompat$ItemReceiver.RatingCompat.size() - 1) {
                parentViewHolder.verticalLine.setVisibility(8);
            } else {
                parentViewHolder.verticalLine.setVisibility(0);
            }
            TextView textView = parentViewHolder.value;
            if (isdirectinjection.IconCompatParcelizer) {
                context = this.write;
                i2 = R.color.f65962131099751;
            } else {
                context = this.write;
                i2 = R.color.f66092131099764;
            }
            textView.setTextColor(context.getColor(i2));
            BaseExpandableRecycleViewAdapter.MediaBrowserCompat$CustomActionResultReceiver(parentViewHolder);
        }
    }

    public final void write(RecyclerView.setContentView setcontentview, int i, int i2) {
        if (setcontentview instanceof ChildViewHolder) {
            ChildViewHolder childViewHolder = (ChildViewHolder) setcontentview;
            isDirectInjection isdirectinjection = this.MediaBrowserCompat$ItemReceiver.RatingCompat.get(i);
            childViewHolder.category.setText(isdirectinjection.MediaBrowserCompat$ItemReceiver);
            childViewHolder.description.setText(isdirectinjection.MediaBrowserCompat$CustomActionResultReceiver);
            childViewHolder.postDate.setText(isdirectinjection.MediaMetadataCompat);
            if (isdirectinjection.MediaBrowserCompat$SearchResultReceiver == null || isdirectinjection.MediaBrowserCompat$SearchResultReceiver.isEmpty() || isdirectinjection.MediaBrowserCompat$SearchResultReceiver.equals("THB")) {
                childViewHolder.originalCurrency.setVisibility(8);
                childViewHolder.foreignCurrency.setVisibility(8);
                return;
            }
            childViewHolder.originalCurrency.setVisibility(0);
            childViewHolder.foreignCurrency.setVisibility(0);
            childViewHolder.originalCurrency.setText(R.string.credit_card_billed_foreign_currency);
            childViewHolder.foreignCurrency.setText(isdirectinjection.MediaBrowserCompat$MediaItem);
        }
    }

    /* renamed from: a_ */
    public final boolean mo20940a_(RecyclerView.setContentView setcontentview) {
        return setcontentview instanceof ParentViewHolder;
    }

    static class ParentViewHolder extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder {
        @BindView
        RelativeLayout container;
        @BindView
        TextView date;
        @BindView
        View line;
        @BindView
        TextView title;
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
        TextView category;
        @BindView
        TextView description;
        @BindView
        TextView foreignCurrency;
        @BindView
        TextView originalCurrency;
        @BindView
        TextView postDate;

        ChildViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
