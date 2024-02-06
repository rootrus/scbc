package com.scb.phone.view.adapter.etb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.mailingaddress.BulletThaiTextView;
import java.util.List;
import kotlin.TypeCastException;
import p040o.closeOpenSessions;
import p040o.closeWithoutRenamingOrLog;
import p040o.onGetStartedClick;
import p040o.onStart;

public final class ETBProductDetailAdapter extends RecyclerView.IconCompatParcelizer<ETBProductDetailViewHolder> {
    private final Context MediaBrowserCompat$ItemReceiver;
    private final List<closeOpenSessions> read;

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82712131493497, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(pare…ct_detail, parent, false)");
        return new ETBProductDetailViewHolder(inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ETBProductDetailViewHolder eTBProductDetailViewHolder = (ETBProductDetailViewHolder) setcontentview;
        onGetStartedClick.write((Object) eTBProductDetailViewHolder, "holder");
        Context context = this.MediaBrowserCompat$ItemReceiver;
        closeOpenSessions closeopensessions = this.read.get(i);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) closeopensessions, "item");
        TextView textView = eTBProductDetailViewHolder.tvTitleHeader;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTitleHeader");
        }
        textView.setText(closeopensessions.MediaBrowserCompat$CustomActionResultReceiver);
        for (closeWithoutRenamingOrLog closewithoutrenamingorlog : closeopensessions.MediaBrowserCompat$ItemReceiver) {
            LinearLayout linearLayout = eTBProductDetailViewHolder.llItemDetail;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("llItemDetail");
            }
            linearLayout.addView(ETBProductDetailViewHolder.MediaBrowserCompat$CustomActionResultReceiver(context, closewithoutrenamingorlog.IconCompatParcelizer));
        }
    }

    public final class ETBProductDetailViewHolder_ViewBinding implements Unbinder {
        private ETBProductDetailViewHolder write;

        public ETBProductDetailViewHolder_ViewBinding(ETBProductDetailViewHolder eTBProductDetailViewHolder, View view) {
            this.write = eTBProductDetailViewHolder;
            eTBProductDetailViewHolder.tvTitleHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title_header, "field 'tvTitleHeader'", TextView.class);
            eTBProductDetailViewHolder.llItemDetail = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_item_detail, "field 'llItemDetail'", LinearLayout.class);
        }

        public final void read() {
            ETBProductDetailViewHolder eTBProductDetailViewHolder = this.write;
            if (eTBProductDetailViewHolder != null) {
                this.write = null;
                eTBProductDetailViewHolder.tvTitleHeader = null;
                eTBProductDetailViewHolder.llItemDetail = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ETBProductDetailAdapter(Context context, List<closeOpenSessions> list) {
        onGetStartedClick.write((Object) context, "mContext");
        onGetStartedClick.write((Object) list, "items");
        this.MediaBrowserCompat$ItemReceiver = context;
        this.read = list;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public static final class ETBProductDetailViewHolder extends RecyclerView.setContentView {
        @BindView
        public LinearLayout llItemDetail;
        @BindView
        public TextView tvTitleHeader;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ETBProductDetailViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "inflate");
            ButterKnife.IconCompatParcelizer(this, this.write);
        }

        static BulletThaiTextView MediaBrowserCompat$CustomActionResultReceiver(Context context, String str) {
            BulletThaiTextView bulletThaiTextView = new BulletThaiTextView(context);
            bulletThaiTextView.setText(str);
            TextView textView = bulletThaiTextView.tvBullet;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvBullet");
            }
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver constraintLayout$MediaBrowserCompat$CustomActionResultReceiver = (ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) layoutParams;
                constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setMarginStart(0);
                TextView textView2 = bulletThaiTextView.tvBullet;
                if (textView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvBullet");
                }
                textView2.setLayoutParams(constraintLayout$MediaBrowserCompat$CustomActionResultReceiver);
                TextView textView3 = bulletThaiTextView.tvRemark;
                if (textView3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
                }
                ViewGroup.LayoutParams layoutParams2 = textView3.getLayoutParams();
                if (layoutParams2 != null) {
                    ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver constraintLayout$MediaBrowserCompat$CustomActionResultReceiver2 = (ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) layoutParams2;
                    constraintLayout$MediaBrowserCompat$CustomActionResultReceiver2.setMarginStart(bulletThaiTextView.getResources().getDimensionPixelOffset(R.dimen.f72472131165407));
                    TextView textView4 = bulletThaiTextView.tvRemark;
                    if (textView4 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
                    }
                    textView4.setLayoutParams(constraintLayout$MediaBrowserCompat$CustomActionResultReceiver2);
                    return bulletThaiTextView;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }
}
