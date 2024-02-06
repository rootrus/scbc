package com.scb.phone.view.adapter.investment.discover;

import android.graphics.Bitmap;
import android.net.Uri;
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
import com.scb.phone.view.custom.ImageTextView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p040o.AbstractMultimap;
import p040o.C6514xb47b5894;
import p040o.CrashlyticsReportWithSessionId;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFixedTransferInputFormFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.ItemCustom;
import p040o.getDeejungTransferMinFullConfirmation;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.populateFrameData;
import p040o.setLastBaselineToBottomHeight;

public final class RecommendRecyclerAdapter extends ItemCustom<CrashlyticsReportWithSessionId, RecyclerView.setContentView> {
    C5766x23d1bf61<CrashlyticsReportWithSessionId> MediaBrowserCompat$ItemReceiver;
    private ArrayList<CrashlyticsReportWithSessionId> write;

    public final class IpoRecommendViewHolder_ViewBinding implements Unbinder {
        private IpoRecommendViewHolder MediaBrowserCompat$ItemReceiver;

        public IpoRecommendViewHolder_ViewBinding(IpoRecommendViewHolder ipoRecommendViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = ipoRecommendViewHolder;
            ipoRecommendViewHolder.tvNameIpo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvNameIpo, "field 'tvNameIpo'", TextView.class);
            ipoRecommendViewHolder.tvDescriptionIpo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvDescriptionIpo, "field 'tvDescriptionIpo'", TextView.class);
            ipoRecommendViewHolder.tvDateIpo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvDateIpo, "field 'tvDateIpo'", TextView.class);
            ipoRecommendViewHolder.tvRecommendCaptionIpo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvRecommendCaptionIpo, "field 'tvRecommendCaptionIpo'", TextView.class);
            ipoRecommendViewHolder.ivRecommendIpo = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivRecommendIpo, "field 'ivRecommendIpo'", ImageView.class);
        }

        public final void read() {
            IpoRecommendViewHolder ipoRecommendViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (ipoRecommendViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                ipoRecommendViewHolder.tvNameIpo = null;
                ipoRecommendViewHolder.tvDescriptionIpo = null;
                ipoRecommendViewHolder.tvDateIpo = null;
                ipoRecommendViewHolder.tvRecommendCaptionIpo = null;
                ipoRecommendViewHolder.ivRecommendIpo = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class RecommendViewHolder_ViewBinding implements Unbinder {
        private RecommendViewHolder MediaBrowserCompat$ItemReceiver;

        public RecommendViewHolder_ViewBinding(RecommendViewHolder recommendViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = recommendViewHolder;
            recommendViewHolder.tvName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvName, "field 'tvName'", TextView.class);
            recommendViewHolder.tvFundNav = (ImageTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvFundNav, "field 'tvFundNav'", ImageTextView.class);
            recommendViewHolder.tvCurrentChange = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvCurrentChange, "field 'tvCurrentChange'", TextView.class);
            recommendViewHolder.tvDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvDate, "field 'tvDate'", TextView.class);
            recommendViewHolder.tvRecommendCaption = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvRecommendCaption, "field 'tvRecommendCaption'", TextView.class);
            recommendViewHolder.ivRecommend = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivRecommend, "field 'ivRecommend'", ImageView.class);
        }

        public final void read() {
            RecommendViewHolder recommendViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (recommendViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                recommendViewHolder.tvName = null;
                recommendViewHolder.tvFundNav = null;
                recommendViewHolder.tvCurrentChange = null;
                recommendViewHolder.tvDate = null;
                recommendViewHolder.tvRecommendCaption = null;
                recommendViewHolder.ivRecommend = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendRecyclerAdapter(ArrayList<CrashlyticsReportWithSessionId> arrayList, C5766x23d1bf61<CrashlyticsReportWithSessionId> recommendRecyclerAdapter$MediaBrowserCompat$CustomActionResultReceiver) {
        super(arrayList);
        onGetStartedClick.write((Object) arrayList, "items");
        onGetStartedClick.write((Object) recommendRecyclerAdapter$MediaBrowserCompat$CustomActionResultReceiver, "onClick");
        this.write = arrayList;
        this.MediaBrowserCompat$ItemReceiver = recommendRecyclerAdapter$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static final class write implements Callable {
        private final /* synthetic */ String read;
        private final /* synthetic */ C6514xb47b5894 write;

        private write() {
        }

        public /* synthetic */ write(C6514xb47b5894 fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver, String str) {
            this.write = fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver;
            this.read = str;
        }

        public final Object call() {
            C6514xb47b5894 fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver = this.write;
            String str = this.read;
            fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = AbstractMultimap.AsMap.AsMapEntries.LOADING;
            fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat.write = null;
            return fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat, str, fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer, fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver, fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat, fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.read);
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) populateFrameData.IPO.name(), (Object) this.write.get(read(i)).write) ? 1 : 0;
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "p0");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90512131494278, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
            return new IpoRecommendViewHolder(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90502131494277, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate2, Promotion.ACTION_VIEW);
        return new RecommendViewHolder(this, inflate2);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        onGetStartedClick.write((Object) setcontentview, Promotion.ACTION_VIEW);
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = this.write.get(read(i));
        onGetStartedClick.IconCompatParcelizer((Object) crashlyticsReportWithSessionId, "items[realPosition]");
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId2 = crashlyticsReportWithSessionId;
        if (setcontentview instanceof RecommendViewHolder) {
            RecommendViewHolder recommendViewHolder = (RecommendViewHolder) setcontentview;
            onGetStartedClick.write((Object) crashlyticsReportWithSessionId2, "display");
            ButterKnife.IconCompatParcelizer(recommendViewHolder, recommendViewHolder.write);
            recommendViewHolder.write.setOnClickListener(new RecommendViewHolder.read(recommendViewHolder, crashlyticsReportWithSessionId2));
            TextView textView = recommendViewHolder.tvName;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvName");
            }
            textView.setText(crashlyticsReportWithSessionId2.MediaBrowserCompat$ItemReceiver);
            ImageTextView imageTextView = recommendViewHolder.tvFundNav;
            if (imageTextView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvFundNav");
            }
            imageTextView.setText(crashlyticsReportWithSessionId2.MediaMetadataCompat);
            CharSequence charSequence = crashlyticsReportWithSessionId2.MediaMetadataCompat;
            if (charSequence == null || charSequence.length() == 0) {
                ImageTextView imageTextView2 = recommendViewHolder.tvFundNav;
                if (imageTextView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvFundNav");
                }
                imageTextView2.setText(" ");
            }
            TextView textView2 = recommendViewHolder.tvCurrentChange;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCurrentChange");
            }
            textView2.setText(crashlyticsReportWithSessionId2.MediaBrowserCompat$CustomActionResultReceiver);
            TextView textView3 = recommendViewHolder.tvDate;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDate");
            }
            textView3.setText(crashlyticsReportWithSessionId2.RatingCompat);
            TextView textView4 = recommendViewHolder.tvRecommendCaption;
            if (textView4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRecommendCaption");
            }
            textView4.setText(crashlyticsReportWithSessionId2.IconCompatParcelizer);
            ImageTextView imageTextView3 = recommendViewHolder.tvFundNav;
            if (imageTextView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvFundNav");
            }
            int i2 = getDeejungTransferMinFullConfirmation.IconCompatParcelizer[crashlyticsReportWithSessionId2.read.ordinal()];
            if (i2 == 1) {
                imageTextView3.setDrawable(setLastBaselineToBottomHeight.write(imageTextView3.getContext(), R.drawable.ic_triangle_up_dark_gray));
                imageTextView3.setVisibility(0);
            } else if (i2 != 2) {
                imageTextView3.MediaBrowserCompat$ItemReceiver = null;
                CharSequence text = imageTextView3.getText();
                if (text != null) {
                    imageTextView3.setText(text.toString().replace("[scbImage]", ""));
                }
            } else {
                imageTextView3.setDrawable(setLastBaselineToBottomHeight.write(imageTextView3.getContext(), R.drawable.ic_triangle_down_dark_gray));
                imageTextView3.setVisibility(0);
            }
            TextView textView5 = recommendViewHolder.tvCurrentChange;
            if (textView5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCurrentChange");
            }
            int i3 = getDeejungTransferMinFullConfirmation.write[crashlyticsReportWithSessionId2.read.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (textView5 != null) {
                        textView5.setTextColor(setLastBaselineToBottomHeight.read(textView5.getContext(), R.color.f65322131099683));
                    }
                } else if (textView5 != null) {
                    textView5.setTextColor(setLastBaselineToBottomHeight.read(textView5.getContext(), R.color.f66452131099801));
                }
            } else if (textView5 != null) {
                textView5.setTextColor(setLastBaselineToBottomHeight.read(textView5.getContext(), R.color.f66422131099798));
            }
            ImageView imageView = recommendViewHolder.ivRecommend;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivRecommend");
            }
            IconCompatParcelizer(imageView, crashlyticsReportWithSessionId2.MediaBrowserCompat$SearchResultReceiver);
        } else if (setcontentview instanceof IpoRecommendViewHolder) {
            IpoRecommendViewHolder ipoRecommendViewHolder = (IpoRecommendViewHolder) setcontentview;
            onGetStartedClick.write((Object) crashlyticsReportWithSessionId2, "display");
            ButterKnife.IconCompatParcelizer(ipoRecommendViewHolder, ipoRecommendViewHolder.write);
            ipoRecommendViewHolder.write.setOnClickListener(new IpoRecommendViewHolder.read(ipoRecommendViewHolder, crashlyticsReportWithSessionId2));
            TextView textView6 = ipoRecommendViewHolder.tvNameIpo;
            if (textView6 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvNameIpo");
            }
            textView6.setText(crashlyticsReportWithSessionId2.MediaBrowserCompat$ItemReceiver);
            TextView textView7 = ipoRecommendViewHolder.tvDescriptionIpo;
            if (textView7 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDescriptionIpo");
            }
            textView7.setText(crashlyticsReportWithSessionId2.MediaBrowserCompat$MediaItem);
            TextView textView8 = ipoRecommendViewHolder.tvDateIpo;
            if (textView8 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDateIpo");
            }
            textView8.setText(crashlyticsReportWithSessionId2.MediaDescriptionCompat);
            TextView textView9 = ipoRecommendViewHolder.tvRecommendCaptionIpo;
            if (textView9 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRecommendCaptionIpo");
            }
            textView9.setText(crashlyticsReportWithSessionId2.IconCompatParcelizer);
            ImageView imageView2 = ipoRecommendViewHolder.ivRecommendIpo;
            if (imageView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivRecommendIpo");
            }
            IconCompatParcelizer(imageView2, crashlyticsReportWithSessionId2.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    public static final class read implements FragmentBuilder_BindEkycFragment {
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

        public final void MediaBrowserCompat$ItemReceiver() {
        }

        read(String str) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(Exception exc) {
            Uri parse;
            onGetStartedClick.write((Object) exc, "exception");
            Picasso read = Picasso.read();
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str != null && (parse = Uri.parse(str)) != null) {
                read.read.MediaBrowserCompat$ItemReceiver(parse.toString());
            }
        }
    }

    public final class RecommendViewHolder extends RecyclerView.setContentView {
        final /* synthetic */ RecommendRecyclerAdapter AlertController$RecycleListView;
        @BindView
        public ImageView ivRecommend;
        @BindView
        public TextView tvCurrentChange;
        @BindView
        public TextView tvDate;
        @BindView
        public ImageTextView tvFundNav;
        @BindView
        public TextView tvName;
        @BindView
        public TextView tvRecommendCaption;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RecommendViewHolder(RecommendRecyclerAdapter recommendRecyclerAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.AlertController$RecycleListView = recommendRecyclerAdapter;
        }

        static final class read implements View.OnClickListener {
            private /* synthetic */ CrashlyticsReportWithSessionId MediaBrowserCompat$ItemReceiver;
            private /* synthetic */ RecommendViewHolder write;

            read(RecommendViewHolder recommendViewHolder, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
                this.write = recommendViewHolder;
                this.MediaBrowserCompat$ItemReceiver = crashlyticsReportWithSessionId;
            }

            public final void onClick(View view) {
                this.write.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
            }
        }
    }

    public final class IpoRecommendViewHolder extends RecyclerView.setContentView {
        @BindView
        public ImageView ivRecommendIpo;
        final /* synthetic */ RecommendRecyclerAdapter setHasDecor;
        @BindView
        public TextView tvDateIpo;
        @BindView
        public TextView tvDescriptionIpo;
        @BindView
        public TextView tvNameIpo;
        @BindView
        public TextView tvRecommendCaptionIpo;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IpoRecommendViewHolder(RecommendRecyclerAdapter recommendRecyclerAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.setHasDecor = recommendRecyclerAdapter;
        }

        static final class read implements View.OnClickListener {
            private /* synthetic */ IpoRecommendViewHolder MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ CrashlyticsReportWithSessionId write;

            read(IpoRecommendViewHolder ipoRecommendViewHolder, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
                this.MediaBrowserCompat$CustomActionResultReceiver = ipoRecommendViewHolder;
                this.write = crashlyticsReportWithSessionId;
            }

            public final void onClick(View view) {
                this.MediaBrowserCompat$CustomActionResultReceiver.setHasDecor.MediaBrowserCompat$ItemReceiver.read(this.write);
            }
        }
    }

    private static /* synthetic */ void IconCompatParcelizer(ImageView imageView, String str) {
        if (str.length() > 0) {
            FragmentBuilder_BindFundDetailSummaryFragment write2 = Picasso.read().write(str);
            write2.write = true;
            Bitmap.Config config = Bitmap.Config.RGB_565;
            FragmentBuilder_BindFixedTransferInputFormFragment.read read2 = write2.MediaBrowserCompat$CustomActionResultReceiver;
            if (config != null) {
                read2.write = config;
                FragmentBuilder_BindFixedTransferInputFormFragment.read read3 = write2.MediaBrowserCompat$CustomActionResultReceiver;
                if (!read3.MediaBrowserCompat$ItemReceiver) {
                    read3.IconCompatParcelizer = true;
                    read3.read = 17;
                    write2.IconCompatParcelizer((int) R.color.f66402131099796).read(imageView, new read(str));
                    return;
                }
                throw new IllegalStateException("Center crop can not be used after calling centerInside");
            }
            throw new IllegalArgumentException("config == null");
        }
        Picasso read4 = Picasso.read();
        if (imageView != null) {
            read4.write((Object) imageView);
            imageView.setImageDrawable(setLastBaselineToBottomHeight.write(imageView.getContext(), R.color.f66402131099796));
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }
}
