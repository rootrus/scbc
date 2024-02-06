package com.scb.phone.view.adapter.prepaid;

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

public final class PrepaidTransactionAdapter extends BaseExpandableRecycleViewAdapter {
    public boolean MediaBrowserCompat$ItemReceiver;
    private boolean MediaDescriptionCompat;
    private Context MediaMetadataCompat;
    public List<setSimulator> read;

    public class ChildViewHolder_ViewBinding implements Unbinder {
        private ChildViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ChildViewHolder_ViewBinding(ChildViewHolder childViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = childViewHolder;
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
            ChildViewHolder childViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (childViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
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
        private ParentViewHolder write;

        public ParentViewHolder_ViewBinding(ParentViewHolder parentViewHolder, View view) {
            super(parentViewHolder, view);
            this.write = parentViewHolder;
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
            ParentViewHolder parentViewHolder = this.write;
            if (parentViewHolder != null) {
                this.write = null;
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

    public PrepaidTransactionAdapter(Context context) {
        super(context);
        this.read = new ArrayList();
        this.MediaBrowserCompat$ItemReceiver = false;
    }

    public PrepaidTransactionAdapter(Context context, byte b) {
        super(context);
        this.read = new ArrayList();
        this.MediaBrowserCompat$ItemReceiver = false;
        this.MediaDescriptionCompat = true;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        if (this.MediaBrowserCompat$ItemReceiver) {
            return this.read.size() + 1;
        }
        return this.read.size();
    }

    public final int MediaMetadataCompat(int i) {
        return i < this.read.size() ? 1 : 0;
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup, int i) {
        this.MediaMetadataCompat = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new ParentViewHolder(from.inflate(R.layout.f82472131493473, viewGroup, false));
        }
        return new write(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83992131493625, viewGroup, false));
    }

    public final RecyclerView.setContentView read(ViewGroup viewGroup, int i) {
        return new ChildViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82512131493477, viewGroup, false));
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        String str;
        if (setcontentview instanceof ParentViewHolder) {
            ParentViewHolder parentViewHolder = (ParentViewHolder) setcontentview;
            setSimulator setsimulator = this.read.get(i);
            if (setsimulator == null) {
                parentViewHolder.titlePrepaid.setText("Loading");
                return;
            }
            parentViewHolder.titlePrepaid.setText(setsimulator.read);
            parentViewHolder.datePrepaid.setText(setsimulator.MediaBrowserCompat$SearchResultReceiver);
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
            if (this.MediaDescriptionCompat) {
                if ("A".equalsIgnoreCase(setsimulator.ParcelableVolumeInfo)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(setsimulator.write);
                    sb.append(" ");
                    sb.append(setsimulator.MediaBrowserCompat$ItemReceiver);
                    String obj = sb.toString();
                    if ("C".equalsIgnoreCase(setsimulator.RatingCompat)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("+");
                        sb2.append(obj);
                        str = sb2.toString();
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("-");
                        sb3.append(obj);
                        str = sb3.toString();
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(setsimulator.MediaMetadataCompat);
                    sb4.append(" ");
                    sb4.append(setsimulator.MediaDescriptionCompat);
                    String obj2 = sb4.toString();
                    if ("C".equalsIgnoreCase(setsimulator.RatingCompat)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("+");
                        sb5.append(obj2);
                        str = sb5.toString();
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("-");
                        sb6.append(obj2);
                        str = sb6.toString();
                    }
                }
            } else if ("A".equalsIgnoreCase(setsimulator.ParcelableVolumeInfo)) {
                String str2 = "THB".equalsIgnoreCase(setsimulator.MediaBrowserCompat$ItemReceiver) ? "" : setsimulator.MediaBrowserCompat$ItemReceiver;
                if ("C".equalsIgnoreCase(setsimulator.RatingCompat)) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str2);
                    sb7.append(" +");
                    sb7.append(setsimulator.write);
                    str = sb7.toString();
                } else {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str2);
                    sb8.append(" -");
                    sb8.append(setsimulator.write);
                    str = sb8.toString();
                }
            } else if ("C".equalsIgnoreCase(setsimulator.RatingCompat)) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append("+");
                sb9.append(setsimulator.MediaMetadataCompat);
                str = sb9.toString();
            } else {
                StringBuilder sb10 = new StringBuilder();
                sb10.append("-");
                sb10.append(setsimulator.MediaMetadataCompat);
                str = sb10.toString();
            }
            parentViewHolder.valuePrepaid.setText(str);
            if ("A".equalsIgnoreCase(setsimulator.ParcelableVolumeInfo)) {
                parentViewHolder.billedPending.setVisibility(0);
                parentViewHolder.expandIconImageView.setColorFilter(setLastBaselineToBottomHeight.read(this.write, R.color.f66402131099796), PorterDuff.Mode.SRC_ATOP);
                parentViewHolder.titlePrepaid.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66402131099796));
                parentViewHolder.datePrepaid.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66402131099796));
                parentViewHolder.valuePrepaid.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66402131099796));
            } else {
                parentViewHolder.billedPending.setVisibility(8);
                parentViewHolder.expandIconImageView.setColorFilter(setLastBaselineToBottomHeight.read(this.write, R.color.f66092131099764), PorterDuff.Mode.SRC_ATOP);
                parentViewHolder.titlePrepaid.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66092131099764));
                parentViewHolder.datePrepaid.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66092131099764));
                if ("C".equalsIgnoreCase(setsimulator.RatingCompat)) {
                    parentViewHolder.valuePrepaid.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66422131099798));
                } else {
                    parentViewHolder.valuePrepaid.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66452131099801));
                }
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
            childViewHolder.description.setText(setsimulator.IconCompatParcelizer);
            if (this.MediaDescriptionCompat || "A".equalsIgnoreCase(setsimulator.ParcelableVolumeInfo) || "THB".equalsIgnoreCase(setsimulator.MediaBrowserCompat$ItemReceiver) || TextUtils.isEmpty(setsimulator.MediaBrowserCompat$ItemReceiver)) {
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
                childViewHolder.titleDescription.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66402131099796));
                childViewHolder.description.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66402131099796));
                childViewHolder.originalCurrency.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66402131099796));
                childViewHolder.foreignCurrency.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66402131099796));
                childViewHolder.titlePostDate.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66402131099796));
                childViewHolder.postDate.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66402131099796));
                childViewHolder.titleCategory.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66402131099796));
                childViewHolder.category.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66402131099796));
                childViewHolder.postDate.setText("-");
                return;
            }
            childViewHolder.titleDescription.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66092131099764));
            childViewHolder.description.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66092131099764));
            childViewHolder.originalCurrency.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66092131099764));
            childViewHolder.foreignCurrency.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66092131099764));
            childViewHolder.titlePostDate.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66092131099764));
            childViewHolder.postDate.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66092131099764));
            childViewHolder.titleCategory.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66092131099764));
            childViewHolder.category.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66092131099764));
        }
    }

    /* renamed from: a_ */
    public final boolean mo20940a_(RecyclerView.setContentView setcontentview) {
        return setcontentview instanceof ParentViewHolder;
    }

    public final void write(boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
        if (z) {
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.read.size(), 1);
        } else if (!this.read.isEmpty()) {
            this.IconCompatParcelizer.write(this.read.size(), 1);
        }
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

    static class write extends validateSPMV {
        write(View view) {
            super(view);
        }
    }
}
