package com.scb.phone.view.adapter.debitatm;

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
import com.scb.phone.view.custom.common.CustomDeltaInput;
import com.scb.phone.view.custom.common.CustomDeltaInput$MediaBrowserCompat$CustomActionResultReceiver;
import java.util.ArrayList;
import java.util.List;
import p040o.AddressService;
import p040o.FragmentBuilder_BindBondInputFragment;
import p040o.FragmentBuilder_BindDeejungPlansFragment;
import p040o.PrepaidServiceModule;
import p040o.findByAnyAddress;
import p040o.getAddressProvince;
import p040o.getICheckDeserializerRtti;
import p040o.nonNull;
import p040o.onStart;

public final class PurchaseWithdrawalLimitAdapter extends RecyclerView.IconCompatParcelizer<LimitCustomViewHolder> {
    public FragmentBuilder_BindBondInputFragment MediaBrowserCompat$ItemReceiver;
    public LimitCustomViewHolder MediaDescriptionCompat;
    public read read;
    public List<nonNull> write = new ArrayList(1);

    public interface read {
        void MediaBrowserCompat$ItemReceiver();
    }

    public class LimitCustomViewHolder_ViewBinding implements Unbinder {
        private LimitCustomViewHolder MediaBrowserCompat$ItemReceiver;

        public LimitCustomViewHolder_ViewBinding(LimitCustomViewHolder limitCustomViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = limitCustomViewHolder;
            limitCustomViewHolder.accountTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_title, "field 'accountTitle'", TextView.class);
            limitCustomViewHolder.limitAccountValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.limit_account_value, "field 'limitAccountValue'", TextView.class);
            limitCustomViewHolder.expandArrow = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.limit_expand_arrow, "field 'expandArrow'", ImageView.class);
            limitCustomViewHolder.limitDoneTextButton = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.limit_done, "field 'limitDoneTextButton'", TextView.class);
            limitCustomViewHolder.limitInput = (CustomDeltaInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_set_limit, "field 'limitInput'", CustomDeltaInput.class);
        }

        public final void read() {
            LimitCustomViewHolder limitCustomViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (limitCustomViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                limitCustomViewHolder.accountTitle = null;
                limitCustomViewHolder.limitAccountValue = null;
                limitCustomViewHolder.expandArrow = null;
                limitCustomViewHolder.limitDoneTextButton = null;
                limitCustomViewHolder.limitInput = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        LimitCustomViewHolder limitCustomViewHolder = (LimitCustomViewHolder) setcontentview;
        nonNull nonnull = this.write.get(i);
        this.MediaDescriptionCompat = limitCustomViewHolder;
        TextView textView = limitCustomViewHolder.accountTitle;
        StringBuilder sb = new StringBuilder();
        sb.append(nonnull.MediaBrowserCompat$MediaItem);
        sb.append(" ");
        sb.append(LimitCustomViewHolder.write(nonnull));
        textView.setText(sb.toString());
        limitCustomViewHolder.limitAccountValue.setText(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver((double) nonnull.MediaBrowserCompat$SearchResultReceiver.intValue()));
        limitCustomViewHolder.write.setOnClickListener(new getAddressProvince(limitCustomViewHolder));
        limitCustomViewHolder.limitInput.setMinValue(0.0d);
        limitCustomViewHolder.limitInput.setMaxValue((double) nonnull.IconCompatParcelizer.intValue());
        if (limitCustomViewHolder.write.getContext() != null) {
            limitCustomViewHolder.limitInput.setErrorMessage(limitCustomViewHolder.write.getContext().getString(R.string.fastpay_setting_range_limit_error_message));
        }
        limitCustomViewHolder.limitInput.setDelta(1000.0d);
        limitCustomViewHolder.limitInput.setActualValue((double) nonnull.MediaBrowserCompat$SearchResultReceiver.intValue());
        limitCustomViewHolder.limitInput.setOnValueChangedListener(new findByAnyAddress(limitCustomViewHolder));
        limitCustomViewHolder.limitInput.setOnIncrementChangeListener(new CustomDeltaInput$MediaBrowserCompat$CustomActionResultReceiver() {
            public final void MediaSessionCompat$Token() {
                LimitCustomViewHolder.this.limitAccountValue.setText(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(LimitCustomViewHolder.this.limitInput.IconCompatParcelizer));
            }

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            public final void mo13975x50fd9e4a() {
                LimitCustomViewHolder.this.limitAccountValue.setText(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(LimitCustomViewHolder.this.limitInput.IconCompatParcelizer));
            }
        });
        limitCustomViewHolder.limitInput.setOnFocusLostListener(new AddressService(limitCustomViewHolder));
        limitCustomViewHolder.limitInput.IconCompatParcelizer();
        limitCustomViewHolder.limitDoneTextButton.setOnClickListener(new PrepaidServiceModule(limitCustomViewHolder, nonnull));
        limitCustomViewHolder.limitInput.MediaBrowserCompat$ItemReceiver();
        limitCustomViewHolder.MediaBrowserCompat$ItemReceiver(false);
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public class LimitCustomViewHolder extends RecyclerView.setContentView {
        public boolean AlertController$RecycleListView = false;
        @BindView
        TextView accountTitle;
        @BindView
        ImageView expandArrow;
        @BindView
        public TextView limitAccountValue;
        @BindView
        public TextView limitDoneTextButton;
        @BindView
        public CustomDeltaInput limitInput;

        LimitCustomViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }

        public final void MediaBrowserCompat$ItemReceiver(boolean z) {
            this.AlertController$RecycleListView = z;
            if (z) {
                this.expandArrow.setVisibility(8);
                this.limitDoneTextButton.setVisibility(0);
                FragmentBuilder_BindDeejungPlansFragment.write(this.limitInput);
                this.accountTitle.setFocusable(true);
                this.accountTitle.setFocusableInTouchMode(true);
                this.accountTitle.requestFocus();
                if (PurchaseWithdrawalLimitAdapter.this.read != null) {
                    PurchaseWithdrawalLimitAdapter.this.read.MediaBrowserCompat$ItemReceiver();
                    return;
                }
                return;
            }
            this.expandArrow.setVisibility(0);
            this.limitDoneTextButton.setVisibility(8);
            FragmentBuilder_BindDeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(this.limitInput);
        }

        static String write(nonNull nonnull) {
            if (nonnull.MediaBrowserCompat$CustomActionResultReceiver == null || nonnull.MediaBrowserCompat$CustomActionResultReceiver.length() <= 5) {
                return "";
            }
            String replaceAll = nonnull.MediaBrowserCompat$CustomActionResultReceiver.replaceAll(" ", "");
            return replaceAll.substring(replaceAll.length() - 5).toLowerCase();
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new LimitCustomViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82552131493481, (ViewGroup) null));
    }
}
