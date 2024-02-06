package com.scb.phone.view.adapter.deposit;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.List;
import p040o.immediateCheckedFuture;
import p040o.onActivityCreated;
import p040o.onCheckBoxClick;
import p040o.onStart;

public final class DepositAccountSelectorAdapter extends onActivityCreated {
    /* access modifiers changed from: private */
    public List<immediateCheckedFuture> IconCompatParcelizer;
    public boolean read;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = itemViewHolder;
            itemViewHolder.textAccountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_number, "field 'textAccountNumber'", TextView.class);
            itemViewHolder.textAccountName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_name, "field 'textAccountName'", TextView.class);
            itemViewHolder.textBalance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_balance, "field 'textBalance'", TextView.class);
            itemViewHolder.imageIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_icon, "field 'imageIcon'", ImageView.class);
            itemViewHolder.depositTagTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deposit_tag_text_view, "field 'depositTagTextView'", TextView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (itemViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                itemViewHolder.textAccountNumber = null;
                itemViewHolder.textAccountName = null;
                itemViewHolder.textBalance = null;
                itemViewHolder.imageIcon = null;
                itemViewHolder.depositTagTextView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DepositAccountSelectorAdapter(List<immediateCheckedFuture> list) {
        this.IconCompatParcelizer = list == null ? new ArrayList<>() : list;
    }

    public final int getCount() {
        return this.IconCompatParcelizer.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83752131493601, viewGroup, false);
        new ItemViewHolder(inflate).write(i);
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    class ItemViewHolder extends RecyclerView.setContentView {
        @BindView
        protected TextView depositTagTextView;
        @BindView
        protected ImageView imageIcon;
        @BindView
        protected TextView textAccountName;
        @BindView
        protected TextView textAccountNumber;
        @BindView
        protected TextView textBalance;

        ItemViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }

        /* access modifiers changed from: package-private */
        public final void write(int i) {
            immediateCheckedFuture immediatecheckedfuture = (immediateCheckedFuture) DepositAccountSelectorAdapter.this.IconCompatParcelizer.get(i);
            String str = immediatecheckedfuture.PlaybackStateCompat;
            if (TextUtils.isEmpty(str)) {
                str = immediatecheckedfuture.AppCompatDialogFragment;
                String str2 = immediatecheckedfuture.AppCompatDelegateImpl$ListMenuDecorView;
                if (!TextUtils.isEmpty(str2)) {
                    str = String.format("%s (%s)", new Object[]{str, str2});
                }
            }
            this.textAccountName.setText(str);
            this.textAccountNumber.setText(immediatecheckedfuture.MediaBrowserCompat$ItemReceiver);
            this.depositTagTextView.setVisibility(immediatecheckedfuture.setCheckable ? 0 : 8);
            if (immediatecheckedfuture.setCheckable) {
                this.depositTagTextView.setText(immediatecheckedfuture.ParcelableVolumeInfo);
                try {
                    GradientDrawable gradientDrawable = (GradientDrawable) this.depositTagTextView.getResources().getDrawable(R.drawable.bg_rounded_rectangle_borderless);
                    gradientDrawable.setColor(Color.parseColor(immediatecheckedfuture.f2865x50fd9e4a));
                    this.depositTagTextView.setBackground(gradientDrawable);
                } catch (IllegalArgumentException e) {
                    onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("Invalid color code sent from server", e);
                }
            }
            this.textBalance.setText(immediatecheckedfuture.MediaDescriptionCompat);
            if (DepositAccountSelectorAdapter.this.read) {
                this.imageIcon.setImageResource(R.drawable.ic_account_summary_juristic);
            }
        }
    }
}
