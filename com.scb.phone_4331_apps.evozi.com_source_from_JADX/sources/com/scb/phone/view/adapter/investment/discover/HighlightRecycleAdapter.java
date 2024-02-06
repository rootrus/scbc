package com.scb.phone.view.adapter.investment.discover;

import android.graphics.Bitmap;
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
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import p040o.CrashlyticsUncaughtExceptionHandler;
import p040o.FragmentBuilder_BindFixedTransferInputFormFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.ItemCustom;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class HighlightRecycleAdapter extends ItemCustom<CrashlyticsUncaughtExceptionHandler, MyViewHolder> {
    HighlightRecycleAdapter$MediaBrowserCompat$ItemReceiver<CrashlyticsUncaughtExceptionHandler> MediaBrowserCompat$ItemReceiver;
    private ArrayList<CrashlyticsUncaughtExceptionHandler> write;

    public final class MyViewHolder_ViewBinding implements Unbinder {
        private MyViewHolder IconCompatParcelizer;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.IconCompatParcelizer = myViewHolder;
            myViewHolder.tvHighlightTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_highlight_title, "field 'tvHighlightTitle'", TextView.class);
            myViewHolder.tvHighlightDesc = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_highlight_desc, "field 'tvHighlightDesc'", TextView.class);
            myViewHolder.tvHighlightCaption = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_highlight_caption, "field 'tvHighlightCaption'", TextView.class);
            myViewHolder.ivHighlight = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_highlight, "field 'ivHighlight'", ImageView.class);
        }

        public final void read() {
            MyViewHolder myViewHolder = this.IconCompatParcelizer;
            if (myViewHolder != null) {
                this.IconCompatParcelizer = null;
                myViewHolder.tvHighlightTitle = null;
                myViewHolder.tvHighlightDesc = null;
                myViewHolder.tvHighlightCaption = null;
                myViewHolder.ivHighlight = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90532131494280, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        return new MyViewHolder(this, inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        MyViewHolder myViewHolder = (MyViewHolder) setcontentview;
        onGetStartedClick.write((Object) myViewHolder, Promotion.ACTION_VIEW);
        int read = read(i);
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.write.get(read);
        onGetStartedClick.IconCompatParcelizer((Object) crashlyticsUncaughtExceptionHandler, "items[realPosition]");
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler2 = crashlyticsUncaughtExceptionHandler;
        String valueOf = String.valueOf(read + 1);
        onGetStartedClick.write((Object) crashlyticsUncaughtExceptionHandler2, "display");
        onGetStartedClick.write((Object) valueOf, "position");
        ButterKnife.IconCompatParcelizer(myViewHolder, myViewHolder.write);
        myViewHolder.write.setOnClickListener(new MyViewHolder.write(myViewHolder, crashlyticsUncaughtExceptionHandler2, valueOf));
        TextView textView = myViewHolder.tvHighlightTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvHighlightTitle");
        }
        textView.setText(crashlyticsUncaughtExceptionHandler2.read);
        TextView textView2 = myViewHolder.tvHighlightDesc;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvHighlightDesc");
        }
        textView2.setText(crashlyticsUncaughtExceptionHandler2.MediaBrowserCompat$CustomActionResultReceiver);
        TextView textView3 = myViewHolder.tvHighlightCaption;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvHighlightCaption");
        }
        textView3.setText(crashlyticsUncaughtExceptionHandler2.write);
        if (crashlyticsUncaughtExceptionHandler2.MediaBrowserCompat$ItemReceiver.length() > 0) {
            FragmentBuilder_BindFundDetailSummaryFragment write2 = Picasso.read().write(crashlyticsUncaughtExceptionHandler2.MediaBrowserCompat$ItemReceiver);
            write2.write = true;
            Bitmap.Config config = Bitmap.Config.RGB_565;
            FragmentBuilder_BindFixedTransferInputFormFragment.read read2 = write2.MediaBrowserCompat$CustomActionResultReceiver;
            if (config != null) {
                read2.write = config;
                FragmentBuilder_BindFixedTransferInputFormFragment.read read3 = write2.MediaBrowserCompat$CustomActionResultReceiver;
                if (!read3.MediaBrowserCompat$ItemReceiver) {
                    read3.IconCompatParcelizer = true;
                    read3.read = 17;
                    FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer = write2.IconCompatParcelizer((int) R.color.f66402131099796);
                    ImageView imageView = myViewHolder.ivHighlight;
                    if (imageView == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivHighlight");
                    }
                    IconCompatParcelizer.read(imageView, new C5765x7bbeeed(crashlyticsUncaughtExceptionHandler2));
                    return;
                }
                throw new IllegalStateException("Center crop can not be used after calling centerInside");
            }
            throw new IllegalArgumentException("config == null");
        }
        Picasso read4 = Picasso.read();
        ImageView imageView2 = myViewHolder.ivHighlight;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivHighlight");
        }
        if (imageView2 != null) {
            read4.write((Object) imageView2);
            ImageView imageView3 = myViewHolder.ivHighlight;
            if (imageView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivHighlight");
            }
            View view = myViewHolder.write;
            onGetStartedClick.IconCompatParcelizer((Object) view, "itemView");
            imageView3.setImageDrawable(setLastBaselineToBottomHeight.write(view.getContext(), R.color.f66402131099796));
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HighlightRecycleAdapter(ArrayList<CrashlyticsUncaughtExceptionHandler> arrayList, HighlightRecycleAdapter$MediaBrowserCompat$ItemReceiver<CrashlyticsUncaughtExceptionHandler> highlightRecycleAdapter$MediaBrowserCompat$ItemReceiver) {
        super(arrayList);
        onGetStartedClick.write((Object) arrayList, "items");
        onGetStartedClick.write((Object) highlightRecycleAdapter$MediaBrowserCompat$ItemReceiver, "onClick");
        this.write = arrayList;
        this.MediaBrowserCompat$ItemReceiver = highlightRecycleAdapter$MediaBrowserCompat$ItemReceiver;
    }

    public final class MyViewHolder extends RecyclerView.setContentView {
        final /* synthetic */ HighlightRecycleAdapter Keep;
        @BindView
        public ImageView ivHighlight;
        @BindView
        public TextView tvHighlightCaption;
        @BindView
        public TextView tvHighlightDesc;
        @BindView
        public TextView tvHighlightTitle;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MyViewHolder(HighlightRecycleAdapter highlightRecycleAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.Keep = highlightRecycleAdapter;
        }

        static final class write implements View.OnClickListener {
            private /* synthetic */ String IconCompatParcelizer;
            private /* synthetic */ MyViewHolder read;
            private /* synthetic */ CrashlyticsUncaughtExceptionHandler write;

            write(MyViewHolder myViewHolder, CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler, String str) {
                this.read = myViewHolder;
                this.write = crashlyticsUncaughtExceptionHandler;
                this.IconCompatParcelizer = str;
            }

            public final void onClick(View view) {
                this.read.Keep.MediaBrowserCompat$ItemReceiver.read(this.write, this.IconCompatParcelizer);
            }
        }
    }
}
