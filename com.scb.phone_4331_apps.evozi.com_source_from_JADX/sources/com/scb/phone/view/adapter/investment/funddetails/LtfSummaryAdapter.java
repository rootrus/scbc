package com.scb.phone.view.adapter.investment.funddetails;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
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
import p040o.DataCollectionArbiter;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.getMinFullTransferPlans;
import p040o.onStart;
import p040o.validateGER;
import p040o.validateHERK;
import p040o.validateSPMV;

public final class LtfSummaryAdapter extends BaseExpandableRecycleViewAdapter {
    public List<DataCollectionArbiter> MediaBrowserCompat$ItemReceiver;
    private validateGER MediaMetadataCompat;
    private View.OnClickListener RatingCompat = new getMinFullTransferPlans(this);
    private String read;

    /* renamed from: a_ */
    public final boolean mo20940a_(RecyclerView.setContentView setcontentview) {
        return false;
    }

    public class LtfChildViewHolder_ViewBinding implements Unbinder {
        private LtfChildViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public LtfChildViewHolder_ViewBinding(LtfChildViewHolder ltfChildViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = ltfChildViewHolder;
            ltfChildViewHolder.llLtfChildItem = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_ltf_child_item, "field 'llLtfChildItem'", LinearLayout.class);
            ltfChildViewHolder.tvLtfInvestYear = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ltf_invest_year, "field 'tvLtfInvestYear'", TextView.class);
            ltfChildViewHolder.tvLtfCurrentYear = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ltf_current_year, "field 'tvLtfCurrentYear'", TextView.class);
            ltfChildViewHolder.tvLtfMaturityYear = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ltf_maturity_year, "field 'tvLtfMaturityYear'", TextView.class);
            ltfChildViewHolder.ltfMaturityProgressBar = (ProgressBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pb_ltf_maturity, "field 'ltfMaturityProgressBar'", ProgressBar.class);
            ltfChildViewHolder.tvLtfInvestmentUnits = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ltf_investment_units, "field 'tvLtfInvestmentUnits'", TextView.class);
            ltfChildViewHolder.tvLtfInvestmentValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ltf_investment_value, "field 'tvLtfInvestmentValue'", TextView.class);
            ltfChildViewHolder.tvLtfInvestmentGainLoss = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ltf_investment_gain_loss, "field 'tvLtfInvestmentGainLoss'", TextView.class);
            ltfChildViewHolder.tvLtfInvestmentAvailableValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ltf_investment_available_value, "field 'tvLtfInvestmentAvailableValue'", TextView.class);
        }

        public final void read() {
            LtfChildViewHolder ltfChildViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (ltfChildViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                ltfChildViewHolder.llLtfChildItem = null;
                ltfChildViewHolder.tvLtfInvestYear = null;
                ltfChildViewHolder.tvLtfCurrentYear = null;
                ltfChildViewHolder.tvLtfMaturityYear = null;
                ltfChildViewHolder.ltfMaturityProgressBar = null;
                ltfChildViewHolder.tvLtfInvestmentUnits = null;
                ltfChildViewHolder.tvLtfInvestmentValue = null;
                ltfChildViewHolder.tvLtfInvestmentGainLoss = null;
                ltfChildViewHolder.tvLtfInvestmentAvailableValue = null;
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
            parentViewHolder.container = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ltf_container, "field 'container'", RelativeLayout.class);
            parentViewHolder.year = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ltf_year, "field 'year'", TextView.class);
            parentViewHolder.line = onStart.IconCompatParcelizer(view, R.id.ltf_line, "field 'line'");
            parentViewHolder.dot = onStart.IconCompatParcelizer(view, R.id.ltf_dot, "field 'dot'");
            parentViewHolder.verticalLine = onStart.IconCompatParcelizer(view, R.id.ltf_vertical_line_view, "field 'verticalLine'");
            parentViewHolder.expandIconImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'expandIconImageView'", ImageView.class);
        }

        public final void read() {
            ParentViewHolder parentViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (parentViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                parentViewHolder.container = null;
                parentViewHolder.year = null;
                parentViewHolder.line = null;
                parentViewHolder.dot = null;
                parentViewHolder.verticalLine = null;
                parentViewHolder.expandIconImageView = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class SsfChildViewHolder_ViewBinding implements Unbinder {
        private SsfChildViewHolder IconCompatParcelizer;

        public SsfChildViewHolder_ViewBinding(SsfChildViewHolder ssfChildViewHolder, View view) {
            this.IconCompatParcelizer = ssfChildViewHolder;
            ssfChildViewHolder.llSsfChildItem = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_ssf_child_item, "field 'llSsfChildItem'", LinearLayout.class);
            ssfChildViewHolder.tvSsfInvestmentYear = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ssf_investment_year, "field 'tvSsfInvestmentYear'", TextView.class);
            ssfChildViewHolder.tvSsfCurrentYear = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ssf_current_year, "field 'tvSsfCurrentYear'", TextView.class);
            ssfChildViewHolder.tvSsfMaturityYear = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ssf_maturity_year, "field 'tvSsfMaturityYear'", TextView.class);
            ssfChildViewHolder.ssfMaturityProgressBar = (ProgressBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pb_ssf_maturity, "field 'ssfMaturityProgressBar'", ProgressBar.class);
            ssfChildViewHolder.tvSsfInvestmentValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ssf_investment_value, "field 'tvSsfInvestmentValue'", TextView.class);
            ssfChildViewHolder.tvSsfInvestmentUnit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ssf_investment_unit, "field 'tvSsfInvestmentUnit'", TextView.class);
            ssfChildViewHolder.tvSsfCurrentValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ssf_current_value, "field 'tvSsfCurrentValue'", TextView.class);
            ssfChildViewHolder.tvSsfGainLoss = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ssf_gain_loss, "field 'tvSsfGainLoss'", TextView.class);
            ssfChildViewHolder.tvSsfMaturedCost = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ssf_matured_cost, "field 'tvSsfMaturedCost'", TextView.class);
            ssfChildViewHolder.tvSsfMaturedUnit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ssf_matured_unit, "field 'tvSsfMaturedUnit'", TextView.class);
            ssfChildViewHolder.tvSsfMaturedAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ssf_matured_amount, "field 'tvSsfMaturedAmount'", TextView.class);
            ssfChildViewHolder.tvSsfMaturedPercent = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ssf_matured_percent, "field 'tvSsfMaturedPercent'", TextView.class);
        }

        public final void read() {
            SsfChildViewHolder ssfChildViewHolder = this.IconCompatParcelizer;
            if (ssfChildViewHolder != null) {
                this.IconCompatParcelizer = null;
                ssfChildViewHolder.llSsfChildItem = null;
                ssfChildViewHolder.tvSsfInvestmentYear = null;
                ssfChildViewHolder.tvSsfCurrentYear = null;
                ssfChildViewHolder.tvSsfMaturityYear = null;
                ssfChildViewHolder.ssfMaturityProgressBar = null;
                ssfChildViewHolder.tvSsfInvestmentValue = null;
                ssfChildViewHolder.tvSsfInvestmentUnit = null;
                ssfChildViewHolder.tvSsfCurrentValue = null;
                ssfChildViewHolder.tvSsfGainLoss = null;
                ssfChildViewHolder.tvSsfMaturedCost = null;
                ssfChildViewHolder.tvSsfMaturedUnit = null;
                ssfChildViewHolder.tvSsfMaturedAmount = null;
                ssfChildViewHolder.tvSsfMaturedPercent = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public LtfSummaryAdapter(Context context, List<DataCollectionArbiter> list, String str, validateGER validateger) {
        super(context);
        this.MediaBrowserCompat$ItemReceiver = list;
        this.MediaMetadataCompat = validateger;
        this.read = str;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup, int i) {
        return new ParentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82892131493515, viewGroup, false), this.RatingCompat);
    }

    public final RecyclerView.setContentView read(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (1 == i) {
            View inflate = from.inflate(R.layout.f82902131493516, viewGroup, false);
            inflate.measure(0, 0);
            return new SsfChildViewHolder(inflate);
        }
        View inflate2 = from.inflate(R.layout.f82882131493514, viewGroup, false);
        inflate2.measure(0, 0);
        return new LtfChildViewHolder(inflate2);
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof ParentViewHolder) {
            ParentViewHolder parentViewHolder = (ParentViewHolder) setcontentview;
            DataCollectionArbiter dataCollectionArbiter = this.MediaBrowserCompat$ItemReceiver.get(i);
            parentViewHolder.year.setText(dataCollectionArbiter.IconCompatParcelizer);
            parentViewHolder.dot.setBackgroundResource(dataCollectionArbiter.MediaBrowserCompat$MediaItem);
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
        DataCollectionArbiter dataCollectionArbiter = this.MediaBrowserCompat$ItemReceiver.get(i);
        if (setcontentview instanceof LtfChildViewHolder) {
            LtfChildViewHolder ltfChildViewHolder = (LtfChildViewHolder) setcontentview;
            ltfChildViewHolder.ltfMaturityProgressBar.setMax(dataCollectionArbiter.MediaSessionCompat$ResultReceiverWrapper);
            ltfChildViewHolder.ltfMaturityProgressBar.setProgress(dataCollectionArbiter.ParcelableVolumeInfo);
            ltfChildViewHolder.tvLtfInvestYear.setText(dataCollectionArbiter.IconCompatParcelizer);
            ltfChildViewHolder.tvLtfMaturityYear.setText(dataCollectionArbiter.MediaMetadataCompat);
            ltfChildViewHolder.tvLtfInvestmentUnits.setText(dataCollectionArbiter.MediaSessionCompat$QueueItem);
            ltfChildViewHolder.tvLtfInvestmentValue.setText(dataCollectionArbiter.MediaSessionCompat$Token);
            ltfChildViewHolder.tvLtfInvestmentAvailableValue.setText(dataCollectionArbiter.f2705x50fd9e4a);
            ltfChildViewHolder.tvLtfInvestmentGainLoss.setText(dataCollectionArbiter.MediaBrowserCompat$SearchResultReceiver);
            if (dataCollectionArbiter.MediaSessionCompat$ResultReceiverWrapper == dataCollectionArbiter.ParcelableVolumeInfo || dataCollectionArbiter.ParcelableVolumeInfo == 0) {
                ltfChildViewHolder.tvLtfCurrentYear.setVisibility(4);
            } else if (dataCollectionArbiter.ParcelableVolumeInfo >= dataCollectionArbiter.MediaSessionCompat$ResultReceiverWrapper) {
                ltfChildViewHolder.tvLtfCurrentYear.setVisibility(4);
                ltfChildViewHolder.tvLtfMaturityYear.setText(dataCollectionArbiter.read);
            } else {
                ltfChildViewHolder.tvLtfCurrentYear.setVisibility(0);
                ltfChildViewHolder.tvLtfCurrentYear.setText(dataCollectionArbiter.read);
                DisplayMetrics displayMetrics = ltfChildViewHolder.tvLtfCurrentYear.getContext().getResources().getDisplayMetrics();
                double paddingRight = (double) ltfChildViewHolder.llLtfChildItem.getPaddingRight();
                ltfChildViewHolder.tvLtfCurrentYear.setTranslationX((float) ((int) Math.round((((((double) displayMetrics.widthPixels) - ((double) ltfChildViewHolder.llLtfChildItem.getPaddingLeft())) - paddingRight) * (((double) dataCollectionArbiter.ParcelableVolumeInfo) / ((double) dataCollectionArbiter.MediaSessionCompat$ResultReceiverWrapper))) - paddingRight)));
            }
        } else if (setcontentview instanceof SsfChildViewHolder) {
            SsfChildViewHolder ssfChildViewHolder = (SsfChildViewHolder) setcontentview;
            ssfChildViewHolder.ssfMaturityProgressBar.setMax(dataCollectionArbiter.MediaSessionCompat$ResultReceiverWrapper);
            ssfChildViewHolder.ssfMaturityProgressBar.setProgress(dataCollectionArbiter.ParcelableVolumeInfo);
            ssfChildViewHolder.tvSsfInvestmentYear.setText(dataCollectionArbiter.IconCompatParcelizer);
            ssfChildViewHolder.tvSsfMaturityYear.setText(dataCollectionArbiter.MediaMetadataCompat);
            ssfChildViewHolder.tvSsfInvestmentValue.setText(dataCollectionArbiter.MediaSessionCompat$Token);
            ssfChildViewHolder.tvSsfInvestmentUnit.setText(dataCollectionArbiter.MediaSessionCompat$QueueItem);
            ssfChildViewHolder.tvSsfCurrentValue.setText(dataCollectionArbiter.f2705x50fd9e4a);
            ssfChildViewHolder.tvSsfGainLoss.setText(dataCollectionArbiter.MediaBrowserCompat$SearchResultReceiver);
            ssfChildViewHolder.tvSsfMaturedCost.setText(dataCollectionArbiter.MediaBrowserCompat$CustomActionResultReceiver);
            ssfChildViewHolder.tvSsfMaturedAmount.setText(dataCollectionArbiter.MediaBrowserCompat$ItemReceiver);
            ssfChildViewHolder.tvSsfMaturedUnit.setText(dataCollectionArbiter.RatingCompat);
            ssfChildViewHolder.tvSsfMaturedPercent.setText(dataCollectionArbiter.MediaDescriptionCompat);
            if (dataCollectionArbiter.MediaSessionCompat$ResultReceiverWrapper == dataCollectionArbiter.ParcelableVolumeInfo || dataCollectionArbiter.ParcelableVolumeInfo == 0) {
                ssfChildViewHolder.tvSsfCurrentYear.setVisibility(4);
            } else if (dataCollectionArbiter.ParcelableVolumeInfo >= dataCollectionArbiter.MediaSessionCompat$ResultReceiverWrapper) {
                ssfChildViewHolder.tvSsfCurrentYear.setVisibility(4);
                ssfChildViewHolder.tvSsfMaturityYear.setText(dataCollectionArbiter.read);
            } else {
                ssfChildViewHolder.tvSsfCurrentYear.setVisibility(0);
                ssfChildViewHolder.tvSsfCurrentYear.setText(dataCollectionArbiter.read);
                DisplayMetrics displayMetrics2 = ssfChildViewHolder.tvSsfCurrentYear.getContext().getResources().getDisplayMetrics();
                double paddingRight2 = (double) ssfChildViewHolder.llSsfChildItem.getPaddingRight();
                ssfChildViewHolder.tvSsfCurrentYear.setTranslationX((float) ((int) Math.round((((((double) displayMetrics2.widthPixels) - ((double) ssfChildViewHolder.llSsfChildItem.getPaddingLeft())) - paddingRight2) * (((double) dataCollectionArbiter.ParcelableVolumeInfo) / ((double) dataCollectionArbiter.MediaSessionCompat$ResultReceiverWrapper))) - paddingRight2)));
            }
        }
    }

    static class ParentViewHolder extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder {
        @BindView
        RelativeLayout container;
        @BindView
        View dot;
        @BindView
        ImageView expandIconImageView;
        @BindView
        View line;
        @BindView
        View verticalLine;
        @BindView
        TextView year;

        ParentViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.container.setOnClickListener(onClickListener);
        }
    }

    public final int write() {
        return "S".equals(this.read) ? 1 : 0;
    }

    static class LtfChildViewHolder extends validateSPMV {
        @BindView
        LinearLayout llLtfChildItem;
        @BindView
        ProgressBar ltfMaturityProgressBar;
        @BindView
        TextView tvLtfCurrentYear;
        @BindView
        TextView tvLtfInvestYear;
        @BindView
        TextView tvLtfInvestmentAvailableValue;
        @BindView
        TextView tvLtfInvestmentGainLoss;
        @BindView
        TextView tvLtfInvestmentUnits;
        @BindView
        TextView tvLtfInvestmentValue;
        @BindView
        TextView tvLtfMaturityYear;

        LtfChildViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    static class SsfChildViewHolder extends validateSPMV {
        @BindView
        LinearLayout llSsfChildItem;
        @BindView
        ProgressBar ssfMaturityProgressBar;
        @BindView
        TextView tvSsfCurrentValue;
        @BindView
        TextView tvSsfCurrentYear;
        @BindView
        TextView tvSsfGainLoss;
        @BindView
        TextView tvSsfInvestmentUnit;
        @BindView
        TextView tvSsfInvestmentValue;
        @BindView
        TextView tvSsfInvestmentYear;
        @BindView
        TextView tvSsfMaturedAmount;
        @BindView
        TextView tvSsfMaturedCost;
        @BindView
        TextView tvSsfMaturedPercent;
        @BindView
        TextView tvSsfMaturedUnit;
        @BindView
        TextView tvSsfMaturityYear;

        SsfChildViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(LtfSummaryAdapter ltfSummaryAdapter, View view) {
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
                validateHERK validateherk2 = ltfSummaryAdapter.MediaMetadataCompat.MediaDescriptionCompat;
                if (validateherk2 == null) {
                    j = -1;
                } else {
                    j = validateherk2.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
                }
                int i2 = (int) j;
                FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat mediaDescriptionCompat = ltfSummaryAdapter.MediaMetadataCompat.MediaDescriptionCompat.MediaDescriptionCompat;
                boolean z = true;
                if (!(mediaDescriptionCompat.RatingCompat == 0) && mediaDescriptionCompat.write != 0) {
                    z = false;
                }
                if (z) {
                    validateHERK validateherk3 = ltfSummaryAdapter.MediaMetadataCompat.MediaDescriptionCompat;
                    if (validateherk3 != null) {
                        boolean read2 = validateherk3.read(i2, false, (Object) null);
                        return;
                    }
                    return;
                }
                for (int i3 = 0; i3 < ltfSummaryAdapter.MediaBrowserCompat$ItemReceiver.size(); i3++) {
                    if (!(i3 == i2 || !ltfSummaryAdapter.MediaMetadataCompat.IconCompatParcelizer(i3) || (validateherk = ltfSummaryAdapter.MediaMetadataCompat.MediaDescriptionCompat) == null)) {
                        boolean MediaBrowserCompat$ItemReceiver2 = validateherk.MediaBrowserCompat$ItemReceiver(i3, false, (Object) null);
                    }
                }
                if (ltfSummaryAdapter.MediaMetadataCompat.IconCompatParcelizer(i2)) {
                    validateHERK validateherk4 = ltfSummaryAdapter.MediaMetadataCompat.MediaDescriptionCompat;
                    if (validateherk4 != null) {
                        boolean MediaBrowserCompat$ItemReceiver3 = validateherk4.MediaBrowserCompat$ItemReceiver(i2, false, (Object) null);
                        return;
                    }
                    return;
                }
                validateHERK validateherk5 = ltfSummaryAdapter.MediaMetadataCompat.MediaDescriptionCompat;
                if (validateherk5 != null) {
                    boolean read3 = validateherk5.read(i2, false, (Object) null);
                }
            }
        }
    }
}
