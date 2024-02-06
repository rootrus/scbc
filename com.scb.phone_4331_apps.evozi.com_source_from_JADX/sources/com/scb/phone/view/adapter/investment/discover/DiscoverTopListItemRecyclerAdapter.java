package com.scb.phone.view.adapter.investment.discover;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.adapter.investment.discover.DiscoverTopListRecyclerAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.grantDataCollectionPermission;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.setCrashlyticsDataCollectionEnabled;
import p040o.setLastBaselineToBottomHeight;

public final class DiscoverTopListItemRecyclerAdapter extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> {
    private final List<setCrashlyticsDataCollectionEnabled> MediaBrowserCompat$ItemReceiver;
    private final String read;
    /* access modifiers changed from: private */
    public final FundFactSheetActivity<setCrashlyticsDataCollectionEnabled, HmlVerifyPhoneValidateOtpActivity> write;

    public final class ChildRemarkViewHolder_ViewBinding implements Unbinder {
        private ChildRemarkViewHolder write;

        public ChildRemarkViewHolder_ViewBinding(ChildRemarkViewHolder childRemarkViewHolder, View view) {
            this.write = childRemarkViewHolder;
            childRemarkViewHolder.tvGroupRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvGroupRemark, "field 'tvGroupRemark'", TextView.class);
        }

        public final void read() {
            ChildRemarkViewHolder childRemarkViewHolder = this.write;
            if (childRemarkViewHolder != null) {
                this.write = null;
                childRemarkViewHolder.tvGroupRemark = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class FundViewHolder_ViewBinding implements Unbinder {
        private FundViewHolder write;

        public FundViewHolder_ViewBinding(FundViewHolder fundViewHolder, View view) {
            this.write = fundViewHolder;
            fundViewHolder.tvDiscoverFundCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvDiscoverFundCode, "field 'tvDiscoverFundCode'", TextView.class);
            fundViewHolder.tvBrokerName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvBrokerName, "field 'tvBrokerName'", TextView.class);
            fundViewHolder.tvNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvNo, "field 'tvNo'", TextView.class);
            fundViewHolder.ivRightArrow = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivRightArrow, "field 'ivRightArrow'", ImageView.class);
            fundViewHolder.tvRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvRemark, "field 'tvRemark'", TextView.class);
            fundViewHolder.tvAsOfDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvAsOfDate, "field 'tvAsOfDate'", TextView.class);
            fundViewHolder.tvYield = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvYield, "field 'tvYield'", TextView.class);
            fundViewHolder.tvTag1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvTag1, "field 'tvTag1'", TextView.class);
            fundViewHolder.tvTag2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvTag2, "field 'tvTag2'", TextView.class);
        }

        public final void read() {
            FundViewHolder fundViewHolder = this.write;
            if (fundViewHolder != null) {
                this.write = null;
                fundViewHolder.tvDiscoverFundCode = null;
                fundViewHolder.tvBrokerName = null;
                fundViewHolder.tvNo = null;
                fundViewHolder.ivRightArrow = null;
                fundViewHolder.tvRemark = null;
                fundViewHolder.tvAsOfDate = null;
                fundViewHolder.tvYield = null;
                fundViewHolder.tvTag1 = null;
                fundViewHolder.tvTag2 = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DiscoverTopListItemRecyclerAdapter(List<setCrashlyticsDataCollectionEnabled> list, String str, FundFactSheetActivity<? super setCrashlyticsDataCollectionEnabled, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) str, "remark");
        onGetStartedClick.write((Object) fundFactSheetActivity, "onItemClick");
        this.MediaBrowserCompat$ItemReceiver = list;
        this.read = str;
        this.write = fundFactSheetActivity;
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == DiscoverTopListRecyclerAdapter.write.Item.ordinal()) {
            View inflate = from.inflate(R.layout.f82922131493518, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
            return new FundViewHolder(this, inflate);
        }
        View inflate2 = from.inflate(R.layout.f82932131493519, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate2, Promotion.ACTION_VIEW);
        return new ChildRemarkViewHolder(inflate2);
    }

    public final int IconCompatParcelizer() {
        List<setCrashlyticsDataCollectionEnabled> list = this.MediaBrowserCompat$ItemReceiver;
        return (list != null ? list.size() : 0) + 1;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        List list;
        onGetStartedClick.write((Object) setcontentview, "holder");
        List<setCrashlyticsDataCollectionEnabled> list2 = this.MediaBrowserCompat$ItemReceiver;
        if (list2 == null) {
            return;
        }
        if (setcontentview instanceof FundViewHolder) {
            FundViewHolder fundViewHolder = (FundViewHolder) setcontentview;
            setCrashlyticsDataCollectionEnabled setcrashlyticsdatacollectionenabled = list2.get(i);
            onGetStartedClick.write((Object) setcrashlyticsdatacollectionenabled, "display");
            ButterKnife.IconCompatParcelizer(fundViewHolder, fundViewHolder.write);
            TextView textView = fundViewHolder.tvDiscoverFundCode;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDiscoverFundCode");
            }
            textView.setText(setcrashlyticsdatacollectionenabled.IconCompatParcelizer);
            TextView textView2 = fundViewHolder.tvBrokerName;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvBrokerName");
            }
            textView2.setText(setcrashlyticsdatacollectionenabled.write);
            TextView textView3 = fundViewHolder.tvNo;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvNo");
            }
            textView3.setText(String.valueOf(i + 1));
            ImageView imageView = fundViewHolder.ivRightArrow;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivRightArrow");
            }
            imageView.setVisibility(setcrashlyticsdatacollectionenabled.MediaBrowserCompat$ItemReceiver ? 4 : 0);
            TextView textView4 = fundViewHolder.tvRemark;
            if (textView4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
            }
            textView4.setVisibility(setcrashlyticsdatacollectionenabled.MediaBrowserCompat$ItemReceiver ? 0 : 8);
            TextView textView5 = fundViewHolder.tvAsOfDate;
            if (textView5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAsOfDate");
            }
            textView5.setText(setcrashlyticsdatacollectionenabled.MediaBrowserCompat$MediaItem);
            TextView textView6 = fundViewHolder.tvAsOfDate;
            if (textView6 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAsOfDate");
            }
            textView6.setVisibility(setcrashlyticsdatacollectionenabled.MediaBrowserCompat$MediaItem.length() == 0 ? 8 : 0);
            TextView textView7 = fundViewHolder.tvYield;
            if (textView7 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvYield");
            }
            textView7.setText(setcrashlyticsdatacollectionenabled.MediaDescriptionCompat);
            TextView textView8 = fundViewHolder.tvYield;
            if (textView8 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvYield");
            }
            View view = fundViewHolder.write;
            onGetStartedClick.IconCompatParcelizer((Object) view, "itemView");
            textView8.setTextColor(setLastBaselineToBottomHeight.read(view.getContext(), FundViewHolder.IconCompatParcelizer(setcrashlyticsdatacollectionenabled.MediaBrowserCompat$SearchResultReceiver)));
            List<grantDataCollectionPermission> list3 = setcrashlyticsdatacollectionenabled.read;
            if (list3 != null) {
                Iterable<grantDataCollectionPermission> iterable = list3;
                int i2 = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i2 = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i2);
                for (grantDataCollectionPermission grantdatacollectionpermission : iterable) {
                    arrayList.add(grantdatacollectionpermission.read);
                }
                list = (List) arrayList;
            } else {
                list = null;
            }
            TextView textView9 = fundViewHolder.tvTag1;
            if (textView9 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTag1");
            }
            TextView textView10 = fundViewHolder.tvTag2;
            if (textView10 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTag2");
            }
            if (list == null) {
                textView9.setVisibility(8);
                textView10.setVisibility(8);
            } else if (list.size() == 1) {
                textView9.setText((CharSequence) list.get(0));
                textView9.setVisibility(0);
                textView10.setVisibility(8);
            } else if (list.size() >= 2) {
                textView9.setText((CharSequence) list.get(0));
                textView10.setText((CharSequence) list.get(1));
                textView9.setVisibility(0);
                textView10.setVisibility(0);
            } else {
                textView9.setVisibility(8);
                textView10.setVisibility(8);
            }
            if (!setcrashlyticsdatacollectionenabled.MediaBrowserCompat$ItemReceiver) {
                TypedValue typedValue = new TypedValue();
                View view2 = fundViewHolder.write;
                onGetStartedClick.IconCompatParcelizer((Object) view2, "itemView");
                Context context = view2.getContext();
                onGetStartedClick.IconCompatParcelizer((Object) context, "itemView.context");
                context.getTheme().resolveAttribute(16843534, typedValue, true);
                fundViewHolder.write.setBackgroundResource(typedValue.resourceId);
                fundViewHolder.write.setOnClickListener(new FundViewHolder.IconCompatParcelizer(fundViewHolder, setcrashlyticsdatacollectionenabled));
                return;
            }
            fundViewHolder.write.setBackgroundResource(R.color.f66142131099769);
            fundViewHolder.write.setOnClickListener((View.OnClickListener) null);
        } else if (setcontentview instanceof ChildRemarkViewHolder) {
            ChildRemarkViewHolder childRemarkViewHolder = (ChildRemarkViewHolder) setcontentview;
            String str = this.read;
            onGetStartedClick.write((Object) str, "remark");
            ButterKnife.IconCompatParcelizer(childRemarkViewHolder, childRemarkViewHolder.write);
            TextView textView11 = childRemarkViewHolder.tvGroupRemark;
            if (textView11 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvGroupRemark");
            }
            textView11.setText(str);
        }
    }

    public final class FundViewHolder extends RecyclerView.setContentView {
        final /* synthetic */ DiscoverTopListItemRecyclerAdapter PlaybackStateCompat;
        @BindView
        public ImageView ivRightArrow;
        @BindView
        public TextView tvAsOfDate;
        @BindView
        public TextView tvBrokerName;
        @BindView
        public TextView tvDiscoverFundCode;
        @BindView
        public TextView tvNo;
        @BindView
        public TextView tvRemark;
        @BindView
        public TextView tvTag1;
        @BindView
        public TextView tvTag2;
        @BindView
        public TextView tvYield;

        static int IconCompatParcelizer(double d) {
            return d > 0.0d ? R.color.f66422131099798 : d < 0.0d ? R.color.f66452131099801 : R.color.f65322131099683;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FundViewHolder(DiscoverTopListItemRecyclerAdapter discoverTopListItemRecyclerAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.PlaybackStateCompat = discoverTopListItemRecyclerAdapter;
        }

        static final class IconCompatParcelizer implements View.OnClickListener {
            private /* synthetic */ setCrashlyticsDataCollectionEnabled MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ FundViewHolder MediaBrowserCompat$ItemReceiver;

            IconCompatParcelizer(FundViewHolder fundViewHolder, setCrashlyticsDataCollectionEnabled setcrashlyticsdatacollectionenabled) {
                this.MediaBrowserCompat$ItemReceiver = fundViewHolder;
                this.MediaBrowserCompat$CustomActionResultReceiver = setcrashlyticsdatacollectionenabled;
            }

            public final void onClick(View view) {
                this.MediaBrowserCompat$ItemReceiver.PlaybackStateCompat.write.invoke(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
    }

    public final class ChildRemarkViewHolder extends RecyclerView.setContentView {
        @BindView
        public TextView tvGroupRemark;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ChildRemarkViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        List<setCrashlyticsDataCollectionEnabled> list = this.MediaBrowserCompat$ItemReceiver;
        if (((list != null ? list.size() : 0) + 1) - 1 == i) {
            return DiscoverTopListRecyclerAdapter.write.ItemRemark.ordinal();
        }
        return DiscoverTopListRecyclerAdapter.write.Item.ordinal();
    }
}
