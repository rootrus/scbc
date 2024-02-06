package com.scb.phone.view.adapter.easycash;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.getLegacySharedPrefs;
import p040o.getMappingFileId;
import p040o.onStart;

public final class EasycashProductAdapter extends RecyclerView.IconCompatParcelizer<LoanProductViewHolder> {
    private List<getLegacySharedPrefs> MediaBrowserCompat$ItemReceiver;
    private final int read;
    private final IconCompatParcelizer write;

    public interface IconCompatParcelizer {
        void read(getMappingFileId getmappingfileid);
    }

    public class LoanProductViewHolder_ViewBinding implements Unbinder {
        private LoanProductViewHolder IconCompatParcelizer;

        public LoanProductViewHolder_ViewBinding(LoanProductViewHolder loanProductViewHolder, View view) {
            this.IconCompatParcelizer = loanProductViewHolder;
            loanProductViewHolder.card = onStart.IconCompatParcelizer(view, R.id.card, "field 'card'");
            loanProductViewHolder.image = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.easycash_product_image, "field 'image'", ImageView.class);
            loanProductViewHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.easycash_product_title, "field 'title'", TextView.class);
            loanProductViewHolder.description = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.easycash_product_description, "field 'description'", TextView.class);
            loanProductViewHolder.creditLimitLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_limit_layout, "field 'creditLimitLayout'", LinearLayout.class);
            loanProductViewHolder.creditLimitText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_limit_text, "field 'creditLimitText'", TextView.class);
            loanProductViewHolder.labelLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.easycash_label_layout, "field 'labelLayout'", RelativeLayout.class);
            loanProductViewHolder.labelText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.easycash_label_text, "field 'labelText'", TextView.class);
            loanProductViewHolder.uptoText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.up_to_text, "field 'uptoText'", TextView.class);
        }

        public final void read() {
            LoanProductViewHolder loanProductViewHolder = this.IconCompatParcelizer;
            if (loanProductViewHolder != null) {
                this.IconCompatParcelizer = null;
                loanProductViewHolder.card = null;
                loanProductViewHolder.image = null;
                loanProductViewHolder.title = null;
                loanProductViewHolder.description = null;
                loanProductViewHolder.creditLimitLayout = null;
                loanProductViewHolder.creditLimitText = null;
                loanProductViewHolder.labelLayout = null;
                loanProductViewHolder.labelText = null;
                loanProductViewHolder.uptoText = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009c, code lost:
        if (r8.equals("SPEEDY_LOAN") != false) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(androidx.recyclerview.widget.RecyclerView.setContentView r7, int r8) {
        /*
            r6 = this;
            com.scb.phone.view.adapter.easycash.EasycashProductAdapter$LoanProductViewHolder r7 = (com.scb.phone.view.adapter.easycash.EasycashProductAdapter.LoanProductViewHolder) r7
            java.util.List<o.getLegacySharedPrefs> r0 = r6.MediaBrowserCompat$ItemReceiver
            java.lang.Object r8 = r0.get(r8)
            o.getLegacySharedPrefs r8 = (p040o.getLegacySharedPrefs) r8
            int r0 = r6.read
            com.scb.phone.view.adapter.easycash.EasycashProductAdapter$IconCompatParcelizer r1 = r6.write
            android.view.View r2 = r7.setHasDecor
            android.content.Context r2 = r2.getContext()
            android.view.View r3 = r7.card
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r3.height = r0
            r0 = 2131099796(0x7f060094, float:1.7811955E38)
            android.graphics.drawable.Drawable r0 = p040o.setLastBaselineToBottomHeight.write(r2, r0)
            android.widget.ImageView r3 = r7.image
            java.lang.String r4 = r8.MediaBrowserCompat$SearchResultReceiver
            p040o.FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver((android.graphics.drawable.Drawable) r0, (android.widget.ImageView) r3, (java.lang.String) r4)
            android.widget.TextView r0 = r7.title
            java.lang.String r3 = r8.MediaBrowserCompat$MediaItem
            r0.setText(r3)
            android.widget.TextView r0 = r7.description
            java.lang.String r3 = r8.MediaBrowserCompat$ItemReceiver
            r0.setText(r3)
            java.lang.String r0 = r8.MediaSessionCompat$QueueItem
            if (r0 == 0) goto L_0x0044
            android.widget.TextView r0 = r7.labelText
            java.lang.String r3 = r8.MediaSessionCompat$QueueItem
            r0.setText(r3)
            goto L_0x004b
        L_0x0044:
            android.widget.RelativeLayout r0 = r7.labelLayout
            r3 = 8
            r0.setVisibility(r3)
        L_0x004b:
            boolean r0 = r8.RatingCompat
            if (r0 == 0) goto L_0x0061
            android.view.View r0 = r7.setHasDecor
            o.getPerformCinemaPayment r3 = new o.getPerformCinemaPayment
            r3.<init>(r1, r8)
            r0.setOnClickListener(r3)
            android.view.View r0 = r7.setHasDecor
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            goto L_0x006e
        L_0x0061:
            android.view.View r0 = r7.setHasDecor
            r1 = 0
            r0.setOnClickListener(r1)
            android.view.View r0 = r7.setHasDecor
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setAlpha(r1)
        L_0x006e:
            java.lang.String r0 = r8.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x00d5
            android.widget.LinearLayout r0 = r7.creditLimitLayout
            r1 = 0
            r0.setVisibility(r1)
            android.widget.TextView r0 = r7.creditLimitText
            java.lang.String r3 = r8.MediaBrowserCompat$CustomActionResultReceiver
            r0.setText(r3)
            java.lang.String r8 = r8.MediaDescriptionCompat
            int r0 = r8.hashCode()
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -771079065: goto L_0x00a9;
                case 1033734720: goto L_0x009f;
                case 1034015741: goto L_0x0096;
                case 1878720662: goto L_0x008c;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x00b3
        L_0x008c:
            java.lang.String r0 = "CREDIT_CARD"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x00b3
            r1 = r3
            goto L_0x00b4
        L_0x0096:
            java.lang.String r0 = "SPEEDY_LOAN"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x009f:
            java.lang.String r0 = "SPEEDY_CASH"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x00b3
            r1 = r4
            goto L_0x00b4
        L_0x00a9:
            java.lang.String r0 = "SPEEDY_LOAN_TOP_UP"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x00b3
            r1 = r5
            goto L_0x00b4
        L_0x00b3:
            r1 = -1
        L_0x00b4:
            if (r1 == 0) goto L_0x00c9
            if (r1 == r5) goto L_0x00c9
            if (r1 == r4) goto L_0x00c9
            if (r1 != r3) goto L_0x00d5
            android.widget.TextView r7 = r7.uptoText
            r8 = 2131758589(0x7f100dfd, float:1.9148146E38)
            java.lang.String r8 = r2.getString(r8)
            r7.setText(r8)
            return
        L_0x00c9:
            android.widget.TextView r7 = r7.uptoText
            r8 = 2131758590(0x7f100dfe, float:1.9148148E38)
            java.lang.String r8 = r2.getString(r8)
            r7.setText(r8)
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.adapter.easycash.EasycashProductAdapter.MediaBrowserCompat$CustomActionResultReceiver(androidx.recyclerview.widget.RecyclerView$setContentView, int):void");
    }

    public EasycashProductAdapter(List<getLegacySharedPrefs> list, int i, IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = list;
        this.write = iconCompatParcelizer;
        this.read = i;
    }

    public final int IconCompatParcelizer() {
        List<getLegacySharedPrefs> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static class LoanProductViewHolder extends RecyclerView.setContentView {
        @BindView
        View card;
        @BindView
        LinearLayout creditLimitLayout;
        @BindView
        TextView creditLimitText;
        @BindView
        TextView description;
        @BindView
        ImageView image;
        @BindView
        RelativeLayout labelLayout;
        @BindView
        TextView labelText;
        View setHasDecor;
        @BindView
        TextView title;
        @BindView
        TextView uptoText;

        LoanProductViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.setHasDecor = view;
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new LoanProductViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82662131493492, viewGroup, false));
    }
}
