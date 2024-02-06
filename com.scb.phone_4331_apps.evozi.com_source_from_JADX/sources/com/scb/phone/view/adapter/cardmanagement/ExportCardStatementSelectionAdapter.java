package com.scb.phone.view.adapter.cardmanagement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$QueueItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.fragment.easycash.EasycashCommonReviewFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import p040o.AnalyticsConnector;
import p040o.DocumentBaseOverlayView$MediaBrowserCompat$ItemReceiver;
import p040o.FundOnboardingSuccessActivity;
import p040o.StreetViewPanorama;
import p040o.findFragmentByWho;
import p040o.getNextTransition;
import p040o.isSupportFragmentClass;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;
import p040o.show;
import p040o.zzup;
import p040o.zzvf;
import p040o.zzvo;

public final class ExportCardStatementSelectionAdapter extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> {
    /* access modifiers changed from: private */
    public static List<String> RatingCompat;
    public List<AnalyticsConnector.AnalyticsConnectorHandle> MediaBrowserCompat$ItemReceiver;
    private String MediaBrowserCompat$MediaItem;
    public read read;
    public RecyclerView$MediaSessionCompat$QueueItem write;

    public interface read {
        void IconCompatParcelizer(Integer num);

        void MediaBrowserCompat$CustomActionResultReceiver(AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener);
    }

    public final class TitleViewHolder_ViewBinding implements Unbinder {
        private TitleViewHolder IconCompatParcelizer;

        public TitleViewHolder_ViewBinding(TitleViewHolder titleViewHolder, View view) {
            this.IconCompatParcelizer = titleViewHolder;
            titleViewHolder.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'tvTitle'", TextView.class);
        }

        public final void read() {
            TitleViewHolder titleViewHolder = this.IconCompatParcelizer;
            if (titleViewHolder != null) {
                this.IconCompatParcelizer = null;
                titleViewHolder.tvTitle = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class ItemSelectionViewHolder_ViewBinding implements Unbinder {
        private ItemSelectionViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ItemSelectionViewHolder_ViewBinding(ItemSelectionViewHolder itemSelectionViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = itemSelectionViewHolder;
            itemSelectionViewHolder.tvCycleYear = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cycle_year, "field 'tvCycleYear'", TextView.class);
            itemSelectionViewHolder.rvCycleSelection = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_cycle_selection, "field 'rvCycleSelection'", RecyclerView.class);
            itemSelectionViewHolder.divider = onStart.IconCompatParcelizer(view, R.id.view_divider, "field 'divider'");
        }

        public final void read() {
            ItemSelectionViewHolder itemSelectionViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (itemSelectionViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                itemSelectionViewHolder.tvCycleYear = null;
                itemSelectionViewHolder.rvCycleSelection = null;
                itemSelectionViewHolder.divider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class MonthViewHolder_ViewBinding implements Unbinder {
        private MonthViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public MonthViewHolder_ViewBinding(MonthViewHolder monthViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = monthViewHolder;
            monthViewHolder.ckbMonth = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ckb_month, "field 'ckbMonth'", CheckBox.class);
            monthViewHolder.tvMonth = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_month, "field 'tvMonth'", TextView.class);
        }

        public final void read() {
            MonthViewHolder monthViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (monthViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                monthViewHolder.ckbMonth = null;
                monthViewHolder.tvMonth = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ExportCardStatementSelectionAdapter() {
        RatingCompat = new ArrayList();
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 0) {
            return C5733xde6cd31b.TITLE.ordinal();
        }
        List<AnalyticsConnector.AnalyticsConnectorHandle> list = this.MediaBrowserCompat$ItemReceiver;
        if (i == (list != null ? list.size() + 2 : 0) - 1) {
            return C5733xde6cd31b.REMARK.ordinal();
        }
        return C5733xde6cd31b.ITEMS.ordinal();
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        if (i == C5733xde6cd31b.TITLE.ordinal()) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90592131494286, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
            return new TitleViewHolder(inflate);
        } else if (i == C5733xde6cd31b.ITEMS.ordinal()) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90562131494283, viewGroup, false);
            RecyclerView$MediaSessionCompat$QueueItem recyclerView$MediaSessionCompat$QueueItem = this.write;
            onGetStartedClick.IconCompatParcelizer((Object) inflate2, Promotion.ACTION_VIEW);
            ItemSelectionViewHolder itemSelectionViewHolder = new ItemSelectionViewHolder(recyclerView$MediaSessionCompat$QueueItem, inflate2);
            itemSelectionViewHolder.setHasDecor = this.read;
            return itemSelectionViewHolder;
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90582131494285, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate3, Promotion.ACTION_VIEW);
            return new IconCompatParcelizer(inflate3);
        }
    }

    public final int IconCompatParcelizer() {
        List<AnalyticsConnector.AnalyticsConnectorHandle> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.size() + 2;
        }
        return 0;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        List<AnalyticsConnector.AnalyticsConnectorHandle> list;
        AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandle;
        Context context;
        onGetStartedClick.write((Object) setcontentview, "holder");
        boolean z = true;
        int i2 = 0;
        if (setcontentview instanceof TitleViewHolder) {
            List<AnalyticsConnector.AnalyticsConnectorHandle> list2 = this.MediaBrowserCompat$ItemReceiver;
            if (list2 != null) {
                for (AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandle2 : list2) {
                    this.MediaBrowserCompat$MediaItem = String.valueOf(analyticsConnectorHandle2.read);
                }
            }
            TitleViewHolder titleViewHolder = (TitleViewHolder) setcontentview;
            String str = this.MediaBrowserCompat$MediaItem;
            if (str == null) {
                str = "";
            }
            onGetStartedClick.write((Object) str, "max");
            View view = titleViewHolder.write;
            if (view != null && (context = view.getContext()) != null) {
                TextView textView = titleViewHolder.tvTitle;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTitle");
                }
                FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
                String string = context.getString(R.string.ccm_e_statement_selection_header);
                onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.ccm_e…atement_selection_header)");
                String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
                onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
                textView.setText(format);
            }
        } else if ((setcontentview instanceof ItemSelectionViewHolder) && (list = this.MediaBrowserCompat$ItemReceiver) != null && (analyticsConnectorHandle = list.get(i - 1)) != null) {
            ItemSelectionViewHolder itemSelectionViewHolder = (ItemSelectionViewHolder) setcontentview;
            List<AnalyticsConnector.AnalyticsConnectorHandle> list3 = this.MediaBrowserCompat$ItemReceiver;
            if (i == (list3 != null ? list3.size() + 2 : 0) - 2) {
                z = false;
            }
            Integer num = analyticsConnectorHandle.read;
            onGetStartedClick.write((Object) analyticsConnectorHandle, "display");
            TextView textView2 = itemSelectionViewHolder.tvCycleYear;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCycleYear");
            }
            textView2.setText(analyticsConnectorHandle.write);
            if (itemSelectionViewHolder.PlaybackStateCompat != null) {
                RecyclerView recyclerView = itemSelectionViewHolder.rvCycleSelection;
                if (recyclerView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvCycleSelection");
                }
                recyclerView.setRecycledViewPool(itemSelectionViewHolder.PlaybackStateCompat);
            }
            RecyclerView recyclerView2 = itemSelectionViewHolder.rvCycleSelection;
            if (recyclerView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvCycleSelection");
            }
            View view2 = itemSelectionViewHolder.write;
            onGetStartedClick.IconCompatParcelizer((Object) view2, "itemView");
            recyclerView2.setLayoutManager(new GridLayoutManager(view2.getContext(), 3));
            RecyclerView recyclerView3 = itemSelectionViewHolder.rvCycleSelection;
            if (recyclerView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvCycleSelection");
            }
            C5734xea774d2a exportCardStatementSelectionAdapter$MediaBrowserCompat$ItemReceiver = new C5734xea774d2a(analyticsConnectorHandle.IconCompatParcelizer, num != null ? num.intValue() : 0);
            exportCardStatementSelectionAdapter$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = itemSelectionViewHolder.setHasDecor;
            recyclerView3.setAdapter(exportCardStatementSelectionAdapter$MediaBrowserCompat$ItemReceiver);
            View view3 = itemSelectionViewHolder.divider;
            if (view3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("divider");
            }
            if (!z) {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver() {
        List<String> list = RatingCompat;
        if (list != null) {
            list.clear();
        }
    }

    public static final class TitleViewHolder extends RecyclerView.setContentView {
        @BindView
        public TextView tvTitle;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TitleViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public static final class ItemSelectionViewHolder extends RecyclerView.setContentView {
        final RecyclerView$MediaSessionCompat$QueueItem PlaybackStateCompat;
        @BindView
        public View divider;
        @BindView
        public RecyclerView rvCycleSelection;
        read setHasDecor;
        @BindView
        public TextView tvCycleYear;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ItemSelectionViewHolder(RecyclerView$MediaSessionCompat$QueueItem recyclerView$MediaSessionCompat$QueueItem, View view) {
            super(view);
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            this.PlaybackStateCompat = recyclerView$MediaSessionCompat$QueueItem;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public static final class MonthViewHolder extends RecyclerView.setContentView {
        read AlertController$RecycleListView;
        @BindView
        public CheckBox ckbMonth;
        @BindView
        public TextView tvMonth;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MonthViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            ButterKnife.IconCompatParcelizer(this, view);
        }

        static final class read implements View.OnClickListener {
            private /* synthetic */ MonthViewHolder write;

            read(MonthViewHolder monthViewHolder) {
                this.write = monthViewHolder;
            }

            public final void onClick(View view) {
                CheckBox checkBox = this.write.ckbMonth;
                if (checkBox == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbMonth");
                }
                if (checkBox.isEnabled()) {
                    CheckBox checkBox2 = this.write.ckbMonth;
                    if (checkBox2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbMonth");
                    }
                    checkBox2.toggle();
                }
            }
        }

        static int read(Context context, boolean z) {
            if (z) {
                onGetStartedClick.write((Object) context, "$this$color");
                return setLastBaselineToBottomHeight.read(context, R.color.f66092131099764);
            }
            onGetStartedClick.write((Object) context, "$this$color");
            return setLastBaselineToBottomHeight.read(context, R.color.f66402131099796);
        }
    }

    public static final class IconCompatParcelizer extends RecyclerView.setContentView {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(View view) {
            super(view);
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        }
    }

    public static final class write implements findFragmentByWho {
        private final /* synthetic */ EasycashCommonReviewFragment.IconCompatParcelizer IconCompatParcelizer;
        private final /* synthetic */ zzvf read;

        private write() {
        }

        public /* synthetic */ write(EasycashCommonReviewFragment.IconCompatParcelizer iconCompatParcelizer, zzvf zzvf) {
            this.IconCompatParcelizer = iconCompatParcelizer;
            this.read = zzvf;
        }

        public final Object IconCompatParcelizer(Object obj) {
            isSupportFragmentClass issupportfragmentclass;
            zzup zzup;
            String str;
            zzvf zzvf = this.read;
            zzvo zzvo = (zzvo) obj;
            String str2 = zzvo.write;
            show show = new show(zzvf.MediaBrowserCompat$ItemReceiver);
            show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new DocumentBaseOverlayView$MediaBrowserCompat$ItemReceiver(str2)));
            if (show2.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            if (issupportfragmentclass.IconCompatParcelizer != null) {
                T t = issupportfragmentclass.IconCompatParcelizer;
                if (t != null) {
                    zzup = (zzup) t;
                } else {
                    throw new NoSuchElementException("No value present");
                }
            } else {
                zzup = null;
            }
            if (zzup != null) {
                str = zzup.MediaBrowserCompat$ItemReceiver;
            } else {
                str = "";
            }
            StreetViewPanorama.OnStreetViewPanoramaLongClickListener write = StreetViewPanorama.OnStreetViewPanoramaLongClickListener.write();
            write.MediaDescriptionCompat = str;
            write.f2789x50fd9e4a = zzvo.f3002x50fd9e4a;
            write.ParcelableVolumeInfo = zzvo.PlaybackStateCompat;
            write.write = zzvo.write;
            write.MediaBrowserCompat$ItemReceiver = zzvo.RatingCompat;
            write.read = zzvo.MediaBrowserCompat$CustomActionResultReceiver.status;
            write.MediaBrowserCompat$CustomActionResultReceiver = zzvo.MediaBrowserCompat$ItemReceiver;
            write.MediaBrowserCompat$SearchResultReceiver = zzvo.MediaMetadataCompat;
            write.MediaMetadataCompat = zzvo.MediaDescriptionCompat;
            write.MediaBrowserCompat$MediaItem = zzvo.read;
            write.RatingCompat = zzvo.MediaBrowserCompat$SearchResultReceiver;
            write.MediaSessionCompat$ResultReceiverWrapper = zzvo.setHasDecor;
            return write;
        }
    }
}
