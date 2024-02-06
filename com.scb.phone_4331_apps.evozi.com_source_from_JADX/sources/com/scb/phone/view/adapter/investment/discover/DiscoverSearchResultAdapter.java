package com.scb.phone.view.adapter.investment.discover;

import android.content.Context;
import android.text.Spannable;
import android.text.style.MetricAffectingSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.List;
import p040o.C6504x8d64215a;
import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindEBillPaymentBillerListFragment;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.findFragmentByWho;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.populateSessionData;
import p040o.setLastBaselineToBottomHeight;
import p040o.standardCount;
import p040o.zzur;

public final class DiscoverSearchResultAdapter extends RecyclerView.IconCompatParcelizer<ItemViewHolder> {
    public final HmlVerifyEmailActivity MediaBrowserCompat$ItemReceiver;
    public DiscoverSearchResultAdapter$MediaBrowserCompat$ItemReceiver read;
    public String write;

    public final class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder IconCompatParcelizer;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.IconCompatParcelizer = itemViewHolder;
            itemViewHolder.tvFundCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvFundCode, "field 'tvFundCode'", TextView.class);
            itemViewHolder.tvFundName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvFundName, "field 'tvFundName'", TextView.class);
            itemViewHolder.tvBrokerName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvBrokerName, "field 'tvBrokerName'", TextView.class);
            itemViewHolder.tvYield = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvYield, "field 'tvYield'", TextView.class);
            itemViewHolder.tvAsOfDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvAsOfDate, "field 'tvAsOfDate'", TextView.class);
            itemViewHolder.tvTag1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvTag1, "field 'tvTag1'", TextView.class);
            itemViewHolder.tvTag2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvTag2, "field 'tvTag2'", TextView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.IconCompatParcelizer;
            if (itemViewHolder != null) {
                this.IconCompatParcelizer = null;
                itemViewHolder.tvFundCode = null;
                itemViewHolder.tvFundName = null;
                itemViewHolder.tvBrokerName = null;
                itemViewHolder.tvYield = null;
                itemViewHolder.tvAsOfDate = null;
                itemViewHolder.tvTag1 = null;
                itemViewHolder.tvTag2 = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DiscoverSearchResultAdapter() {
        FundActionsSuccessActivity fundActionsSuccessActivity = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$ItemReceiver = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90522131494279, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "inflater.inflate(R.layou…ch_result, parent, false)");
        return new ItemViewHolder(this, inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ItemViewHolder itemViewHolder = (ItemViewHolder) setcontentview;
        onGetStartedClick.write((Object) itemViewHolder, "holder");
        populateSessionData populatesessiondata = (populateSessionData) ((List) this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver()).get(i);
        if (populatesessiondata != null) {
            View view = itemViewHolder.write;
            onGetStartedClick.IconCompatParcelizer((Object) view, "holder.itemView");
            Context context = view.getContext();
            if (context != null && itemViewHolder != null) {
                onGetStartedClick.write((Object) context, "context");
                onGetStartedClick.write((Object) populatesessiondata, "display");
                ButterKnife.IconCompatParcelizer(itemViewHolder, itemViewHolder.write);
                View view2 = itemViewHolder.write;
                if (view2 != null) {
                    view2.setOnClickListener(new ItemViewHolder.read(itemViewHolder, populatesessiondata));
                }
                View view3 = itemViewHolder.write;
                if (view3 != null) {
                    int read2 = setLastBaselineToBottomHeight.read(context, ItemViewHolder.read(populatesessiondata.MediaMetadataCompat));
                    TextView textView = itemViewHolder.tvFundCode;
                    if (textView == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvFundCode");
                    }
                    String str = populatesessiondata.MediaBrowserCompat$CustomActionResultReceiver;
                    String str2 = itemViewHolder.AlertController$RecycleListView.write;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = str3;
                    }
                    onGetStartedClick.IconCompatParcelizer((Object) view3, Promotion.ACTION_VIEW);
                    textView.setText(itemViewHolder.MediaBrowserCompat$ItemReceiver(str, str2, setLastBaselineToBottomHeight.read(view3.getContext(), R.color.f67252131099881), (MetricAffectingSpan) null));
                    TextView textView2 = itemViewHolder.tvFundName;
                    if (textView2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvFundName");
                    }
                    String str4 = populatesessiondata.write;
                    String str5 = itemViewHolder.AlertController$RecycleListView.write;
                    if (str5 != null) {
                        str3 = str5;
                    }
                    textView2.setText(itemViewHolder.MediaBrowserCompat$ItemReceiver(str4, str3, setLastBaselineToBottomHeight.read(view3.getContext(), R.color.f67252131099881), (MetricAffectingSpan) null));
                    TextView textView3 = itemViewHolder.tvBrokerName;
                    if (textView3 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvBrokerName");
                    }
                    textView3.setText(populatesessiondata.MediaBrowserCompat$ItemReceiver);
                    TextView textView4 = itemViewHolder.tvYield;
                    if (textView4 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvYield");
                    }
                    textView4.setText(populatesessiondata.MediaBrowserCompat$SearchResultReceiver);
                    TextView textView5 = itemViewHolder.tvAsOfDate;
                    if (textView5 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAsOfDate");
                    }
                    textView5.setText(populatesessiondata.read);
                    TextView textView6 = itemViewHolder.tvAsOfDate;
                    if (textView6 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAsOfDate");
                    }
                    textView6.setVisibility(populatesessiondata.read.length() == 0 ? 8 : 0);
                    TextView textView7 = itemViewHolder.tvYield;
                    if (textView7 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvYield");
                    }
                    textView7.setTextColor(read2);
                    List<String> list = populatesessiondata.IconCompatParcelizer;
                    TextView textView8 = itemViewHolder.tvTag1;
                    if (textView8 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTag1");
                    }
                    TextView textView9 = itemViewHolder.tvTag2;
                    if (textView9 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTag2");
                    }
                    if (list == null) {
                        textView8.setVisibility(8);
                        textView9.setVisibility(8);
                    } else if (list.size() == 1) {
                        textView8.setText(list.get(0));
                        textView8.setVisibility(0);
                        textView9.setVisibility(8);
                    } else if (list.size() >= 2) {
                        textView8.setText(list.get(0));
                        textView9.setText(list.get(1));
                        textView8.setVisibility(0);
                        textView9.setVisibility(0);
                    } else {
                        textView8.setVisibility(8);
                        textView9.setVisibility(8);
                    }
                }
            }
        }
    }

    public static final class read implements findFragmentByWho {
        private final /* synthetic */ int IconCompatParcelizer;
        private final /* synthetic */ String read;
        private final /* synthetic */ String write;

        private read() {
        }

        public /* synthetic */ read(int i, String str, String str2) {
            this.IconCompatParcelizer = i;
            this.write = str;
            this.read = str2;
        }

        public final Object IconCompatParcelizer(Object obj) {
            int i = this.IconCompatParcelizer;
            String str = this.write;
            String str2 = this.read;
            zzur zzur = (zzur) obj;
            standardCount standardcount = new standardCount();
            if (zzur != null) {
                String str3 = zzur.MediaBrowserCompat$SearchResultReceiver;
                if (str3 == null) {
                    str3 = "";
                }
                onGetStartedClick.write((Object) str3, "<set-?>");
                standardcount.read = str3;
            }
            standardcount.MediaBrowserCompat$CustomActionResultReceiver = 1;
            standardcount.IconCompatParcelizer = Integer.valueOf(i);
            standardcount.write = str;
            standardcount.MediaBrowserCompat$ItemReceiver = str2;
            return standardcount;
        }
    }

    public final class ItemViewHolder extends RecyclerView.setContentView implements FragmentBuilder_BindEBillPaymentBillerListFragment {
        final /* synthetic */ DiscoverSearchResultAdapter AlertController$RecycleListView;
        @BindView
        public TextView tvAsOfDate;
        @BindView
        public TextView tvBrokerName;
        @BindView
        public TextView tvFundCode;
        @BindView
        public TextView tvFundName;
        @BindView
        public TextView tvTag1;
        @BindView
        public TextView tvTag2;
        @BindView
        public TextView tvYield;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(DiscoverSearchResultAdapter discoverSearchResultAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.AlertController$RecycleListView = discoverSearchResultAdapter;
        }

        public final Spannable MediaBrowserCompat$ItemReceiver(String str, String str2, int i, MetricAffectingSpan metricAffectingSpan) {
            onGetStartedClick.write((Object) str, "fullWord");
            onGetStartedClick.write((Object) str2, "highlightWord");
            return C6504x8d64215a.MediaBrowserCompat$CustomActionResultReceiver(str, str2, i, (MetricAffectingSpan) null);
        }

        static final class read implements View.OnClickListener {
            private /* synthetic */ ItemViewHolder MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ populateSessionData MediaBrowserCompat$ItemReceiver;

            read(ItemViewHolder itemViewHolder, populateSessionData populatesessiondata) {
                this.MediaBrowserCompat$CustomActionResultReceiver = itemViewHolder;
                this.MediaBrowserCompat$ItemReceiver = populatesessiondata;
            }

            public final void onClick(View view) {
                DiscoverSearchResultAdapter$MediaBrowserCompat$ItemReceiver discoverSearchResultAdapter$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.AlertController$RecycleListView.read;
                if (discoverSearchResultAdapter$MediaBrowserCompat$ItemReceiver != null) {
                    discoverSearchResultAdapter$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
                }
            }
        }

        static int read(Double d) {
            if (d == null || d.doubleValue() <= 0.0d) {
                return (d == null || d.doubleValue() >= 0.0d) ? R.color.f65322131099683 : R.color.f66452131099801;
            }
            return R.color.f66422131099798;
        }
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<List<populateSessionData>> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    public final int IconCompatParcelizer() {
        return ((List) this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver()).size();
    }
}
