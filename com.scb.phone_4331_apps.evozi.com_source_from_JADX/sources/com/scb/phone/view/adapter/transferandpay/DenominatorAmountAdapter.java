package com.scb.phone.view.adapter.transferandpay;

import android.content.Context;
import android.os.Build;
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
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p040o.AbstractMultimap;
import p040o.BankingAgentReviewActivity;
import p040o.FragmentBuilder_BindDeejungTransferSlipFragment;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class DenominatorAmountAdapter extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> {
    public double MediaBrowserCompat$ItemReceiver;
    public write MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: package-private */
    public int MediaMetadataCompat = -1;
    List<Integer> read;
    boolean write;

    public interface write {
        void IconCompatParcelizer(double d);

        void read();
    }

    public final class BubbleViewDisableHolder_ViewBinding implements Unbinder {
        private BubbleViewDisableHolder MediaBrowserCompat$CustomActionResultReceiver;

        public BubbleViewDisableHolder_ViewBinding(BubbleViewDisableHolder bubbleViewDisableHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bubbleViewDisableHolder;
            bubbleViewDisableHolder.textDenominator = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_text_view, "field 'textDenominator'", TextView.class);
        }

        public final void read() {
            BubbleViewDisableHolder bubbleViewDisableHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (bubbleViewDisableHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                bubbleViewDisableHolder.textDenominator = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class BubbleViewHolder_ViewBinding implements Unbinder {
        private BubbleViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public BubbleViewHolder_ViewBinding(BubbleViewHolder bubbleViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bubbleViewHolder;
            bubbleViewHolder.viewContainer = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_container_relative_layout, "field 'viewContainer'", RelativeLayout.class);
            bubbleViewHolder.textDenominator = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_text_view, "field 'textDenominator'", TextView.class);
        }

        public final void read() {
            BubbleViewHolder bubbleViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (bubbleViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                bubbleViewHolder.viewContainer = null;
                bubbleViewHolder.textDenominator = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class PencilViewHolder_ViewBinding implements Unbinder {
        private PencilViewHolder write;

        public PencilViewHolder_ViewBinding(PencilViewHolder pencilViewHolder, View view) {
            this.write = pencilViewHolder;
            pencilViewHolder.viewContainer = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_container_relative_layout, "field 'viewContainer'", RelativeLayout.class);
            pencilViewHolder.icPencil = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ic_pencil, "field 'icPencil'", ImageView.class);
        }

        public final void read() {
            PencilViewHolder pencilViewHolder = this.write;
            if (pencilViewHolder != null) {
                this.write = null;
                pencilViewHolder.viewContainer = null;
                pencilViewHolder.icPencil = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DenominatorAmountAdapter(boolean z, List<Integer> list, double d) {
        onGetStartedClick.write((Object) list, "amountList");
        this.write = z;
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = d;
    }

    public static final class read implements Callable {
        private final /* synthetic */ BankingAgentReviewActivity MediaBrowserCompat$CustomActionResultReceiver;
        private final /* synthetic */ String read;

        private read() {
        }

        public /* synthetic */ read(BankingAgentReviewActivity bankingAgentReviewActivity, String str) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentReviewActivity;
            this.read = str;
        }

        public final Object call() {
            BankingAgentReviewActivity bankingAgentReviewActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
            String str = this.read;
            AbstractMultimap.AsMap.AsMapEntries asMapEntries = AbstractMultimap.AsMap.AsMapEntries.LOADING;
            bankingAgentReviewActivity.IconCompatParcelizer = asMapEntries;
            return bankingAgentReviewActivity.write.MediaBrowserCompat$CustomActionResultReceiver(bankingAgentReviewActivity.ParcelableVolumeInfo, str, bankingAgentReviewActivity.MediaBrowserCompat$ItemReceiver, asMapEntries, bankingAgentReviewActivity.MediaBrowserCompat$MediaItem, bankingAgentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82332131493459, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
            return new PencilViewHolder(this, inflate);
        } else if (i != 2) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82322131493458, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate2, Promotion.ACTION_VIEW);
            return new BubbleViewDisableHolder(this, inflate2);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82312131493457, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate3, Promotion.ACTION_VIEW);
            return new BubbleViewHolder(this, inflate3);
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (this.write && i == 0) {
            return 1;
        }
        List<Integer> list = this.read;
        if (this.write) {
            i--;
        }
        return list.get(i).doubleValue() <= this.MediaBrowserCompat$ItemReceiver ? 2 : 3;
    }

    public final int IconCompatParcelizer() {
        if (this.read.isEmpty()) {
            return 0;
        }
        return this.read.size() + (this.write ? 1 : 0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        onGetStartedClick.write((Object) setcontentview, "holder");
        int MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(i);
        int i6 = R.color.f71012131100257;
        int i7 = R.drawable.bg_button_amount_purple;
        boolean z = false;
        int i8 = -1;
        if (MediaBrowserCompat$CustomActionResultReceiver == 1) {
            PencilViewHolder pencilViewHolder = (PencilViewHolder) setcontentview;
            RelativeLayout relativeLayout = pencilViewHolder.viewContainer;
            if (relativeLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewContainer");
            }
            Context context = pencilViewHolder.AlertController$RecycleListView.getContext();
            DenominatorAmountAdapter denominatorAmountAdapter = pencilViewHolder.setHasDecor;
            RecyclerView recyclerView = pencilViewHolder.MediaMetadataCompat;
            if (recyclerView == null) {
                i5 = -1;
            } else {
                i5 = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) pencilViewHolder);
            }
            if (!(i5 == denominatorAmountAdapter.MediaMetadataCompat)) {
                i7 = R.drawable.bg_button_amount;
            }
            relativeLayout.setBackground(setLastBaselineToBottomHeight.write(context, i7));
            ImageView imageView = pencilViewHolder.icPencil;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("icPencil");
            }
            Context context2 = pencilViewHolder.AlertController$RecycleListView.getContext();
            DenominatorAmountAdapter denominatorAmountAdapter2 = pencilViewHolder.setHasDecor;
            RecyclerView recyclerView2 = pencilViewHolder.MediaMetadataCompat;
            if (recyclerView2 != null) {
                i8 = recyclerView2.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) pencilViewHolder);
            }
            if (i8 == denominatorAmountAdapter2.MediaMetadataCompat) {
                z = true;
            }
            if (!z) {
                i6 = R.color.f67252131099881;
            }
            imageView.setColorFilter(setLastBaselineToBottomHeight.read(context2, i6));
        } else if (MediaBrowserCompat$CustomActionResultReceiver(i) == 2) {
            BubbleViewHolder bubbleViewHolder = (BubbleViewHolder) setcontentview;
            TextView textView = bubbleViewHolder.textDenominator;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("textDenominator");
            }
            DenominatorAmountAdapter denominatorAmountAdapter3 = bubbleViewHolder.AlertController$RecycleListView;
            if (denominatorAmountAdapter3.write) {
                RecyclerView recyclerView3 = bubbleViewHolder.MediaMetadataCompat;
                if (recyclerView3 == null) {
                    i4 = -1;
                } else {
                    i4 = recyclerView3.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) bubbleViewHolder);
                }
                i2 = i4 - 1;
            } else {
                RecyclerView recyclerView4 = bubbleViewHolder.MediaMetadataCompat;
                i2 = recyclerView4 == null ? -1 : recyclerView4.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) bubbleViewHolder);
            }
            textView.setText(String.valueOf(denominatorAmountAdapter3.read.get(i2).intValue()));
            TextView textView2 = bubbleViewHolder.textDenominator;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("textDenominator");
            }
            Context context3 = bubbleViewHolder.Keep.getContext();
            DenominatorAmountAdapter denominatorAmountAdapter4 = bubbleViewHolder.AlertController$RecycleListView;
            RecyclerView recyclerView5 = bubbleViewHolder.MediaMetadataCompat;
            if (recyclerView5 == null) {
                i3 = -1;
            } else {
                i3 = recyclerView5.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) bubbleViewHolder);
            }
            if (!(i3 == denominatorAmountAdapter4.MediaMetadataCompat)) {
                i6 = R.color.f67252131099881;
            }
            textView2.setTextColor(setLastBaselineToBottomHeight.read(context3, i6));
            RelativeLayout relativeLayout2 = bubbleViewHolder.viewContainer;
            if (relativeLayout2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewContainer");
            }
            Context context4 = bubbleViewHolder.Keep.getContext();
            DenominatorAmountAdapter denominatorAmountAdapter5 = bubbleViewHolder.AlertController$RecycleListView;
            RecyclerView recyclerView6 = bubbleViewHolder.MediaMetadataCompat;
            if (recyclerView6 != null) {
                i8 = recyclerView6.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) bubbleViewHolder);
            }
            if (i8 == denominatorAmountAdapter5.MediaMetadataCompat) {
                z = true;
            }
            if (!z) {
                i7 = R.drawable.bg_button_amount;
            }
            relativeLayout2.setBackground(setLastBaselineToBottomHeight.write(context4, i7));
        } else {
            BubbleViewDisableHolder bubbleViewDisableHolder = (BubbleViewDisableHolder) setcontentview;
            TextView textView3 = bubbleViewDisableHolder.textDenominator;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("textDenominator");
            }
            DenominatorAmountAdapter denominatorAmountAdapter6 = bubbleViewDisableHolder.AlertController$RecycleListView;
            if (denominatorAmountAdapter6.write) {
                RecyclerView recyclerView7 = bubbleViewDisableHolder.MediaMetadataCompat;
                if (recyclerView7 != null) {
                    i8 = recyclerView7.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) bubbleViewDisableHolder);
                }
                i8--;
            } else {
                RecyclerView recyclerView8 = bubbleViewDisableHolder.MediaMetadataCompat;
                if (recyclerView8 != null) {
                    i8 = recyclerView8.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) bubbleViewDisableHolder);
                }
            }
            textView3.setText(String.valueOf(denominatorAmountAdapter6.read.get(i8).intValue()));
        }
    }

    public final void IconCompatParcelizer(double d) {
        Iterator<Integer> it = this.read.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((double) it.next().intValue()) == d) {
                break;
            }
            i++;
        }
        if (this.write) {
            i++;
        }
        this.MediaMetadataCompat = i;
        this.IconCompatParcelizer.write();
    }

    public final class PencilViewHolder extends RecyclerView.setContentView implements View.OnClickListener {
        View AlertController$RecycleListView;
        @BindView
        public ImageView icPencil;
        final /* synthetic */ DenominatorAmountAdapter setHasDecor;
        @BindView
        public RelativeLayout viewContainer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PencilViewHolder(DenominatorAmountAdapter denominatorAmountAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            this.setHasDecor = denominatorAmountAdapter;
            this.AlertController$RecycleListView = view;
            ButterKnife.IconCompatParcelizer(this, view);
            RelativeLayout relativeLayout = this.viewContainer;
            if (relativeLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewContainer");
            }
            relativeLayout.setOnClickListener(this);
            FragmentBuilder_BindDeejungTransferSlipFragment.read read = FragmentBuilder_BindDeejungTransferSlipFragment.MediaBrowserCompat$ItemReceiver;
            if (Build.VERSION.SDK_INT >= 26) {
                this.AlertController$RecycleListView.setDefaultFocusHighlightEnabled(false);
            }
        }

        public final void onClick(View view) {
            int i;
            DenominatorAmountAdapter denominatorAmountAdapter = this.setHasDecor;
            RecyclerView recyclerView = this.MediaMetadataCompat;
            if (recyclerView == null) {
                i = -1;
            } else {
                i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) this);
            }
            denominatorAmountAdapter.MediaMetadataCompat = i;
            write MediaBrowserCompat$CustomActionResultReceiver = this.setHasDecor.MediaBrowserCompat$MediaItem;
            if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                MediaBrowserCompat$CustomActionResultReceiver.read();
            }
            this.setHasDecor.IconCompatParcelizer.write();
        }
    }

    public final class BubbleViewHolder extends RecyclerView.setContentView implements View.OnClickListener {
        final /* synthetic */ DenominatorAmountAdapter AlertController$RecycleListView;
        final View Keep;
        @BindView
        public TextView textDenominator;
        @BindView
        public RelativeLayout viewContainer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BubbleViewHolder(DenominatorAmountAdapter denominatorAmountAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            this.AlertController$RecycleListView = denominatorAmountAdapter;
            this.Keep = view;
            ButterKnife.IconCompatParcelizer(this, view);
            RelativeLayout relativeLayout = this.viewContainer;
            if (relativeLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewContainer");
            }
            relativeLayout.setOnClickListener(this);
        }

        public final void onClick(View view) {
            int i;
            double d;
            DenominatorAmountAdapter denominatorAmountAdapter = this.AlertController$RecycleListView;
            RecyclerView recyclerView = this.MediaMetadataCompat;
            if (recyclerView == null) {
                i = -1;
            } else {
                i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) this);
            }
            denominatorAmountAdapter.MediaMetadataCompat = i;
            write MediaBrowserCompat$CustomActionResultReceiver = this.AlertController$RecycleListView.MediaBrowserCompat$MediaItem;
            if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                DenominatorAmountAdapter denominatorAmountAdapter2 = this.AlertController$RecycleListView;
                int i2 = denominatorAmountAdapter2.MediaMetadataCompat;
                if (i2 >= 0) {
                    List<Integer> list = denominatorAmountAdapter2.read;
                    if (denominatorAmountAdapter2.write) {
                        i2--;
                    }
                    d = (double) list.get(i2).intValue();
                } else {
                    d = 0.0d;
                }
                MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(d);
            }
            this.AlertController$RecycleListView.IconCompatParcelizer.write();
        }
    }

    public final class BubbleViewDisableHolder extends RecyclerView.setContentView {
        final /* synthetic */ DenominatorAmountAdapter AlertController$RecycleListView;
        @BindView
        public TextView textDenominator;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BubbleViewDisableHolder(DenominatorAmountAdapter denominatorAmountAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            this.AlertController$RecycleListView = denominatorAmountAdapter;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
