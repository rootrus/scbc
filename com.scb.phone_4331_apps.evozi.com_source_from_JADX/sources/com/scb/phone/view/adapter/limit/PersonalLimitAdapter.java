package com.scb.phone.view.adapter.limit;

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
import p040o.DeepLinkService;
import p040o.FragmentBuilder_BindCardlessReviewFragment;
import p040o.FragmentBuilder_BindDeejungPlansFragment;
import p040o.ctaVerify;
import p040o.expandIfNecessary;
import p040o.getApplicationsById;
import p040o.getApplicationsLatest;
import p040o.getICheckDeserializerRtti;
import p040o.onStart;
import p040o.standardAdd;

public final class PersonalLimitAdapter extends RecyclerView.IconCompatParcelizer<LimitCustomViewHolder> {
    public FragmentBuilder_BindCardlessReviewFragment MediaBrowserCompat$ItemReceiver;
    public List<expandIfNecessary> read = new ArrayList(1);
    /* access modifiers changed from: private */
    public List<standardAdd> write;

    public class LimitCustomViewHolder_ViewBinding implements Unbinder {
        private LimitCustomViewHolder MediaBrowserCompat$ItemReceiver;

        public LimitCustomViewHolder_ViewBinding(LimitCustomViewHolder limitCustomViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = limitCustomViewHolder;
            limitCustomViewHolder.accountTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_title, "field 'accountTitle'", TextView.class);
            limitCustomViewHolder.limitAccountValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.limit_account_value, "field 'limitAccountValue'", TextView.class);
            limitCustomViewHolder.expandArrow = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.limit_expand_arrow, "field 'expandArrow'", ImageView.class);
            limitCustomViewHolder.limitDoneTextButton = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.limit_done, "field 'limitDoneTextButton'", TextView.class);
            limitCustomViewHolder.limitInput = (CustomDeltaInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_set_limit, "field 'limitInput'", CustomDeltaInput.class);
            limitCustomViewHolder.viewCloseLine = onStart.IconCompatParcelizer(view, R.id.view_close_line, "field 'viewCloseLine'");
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
                limitCustomViewHolder.viewCloseLine = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        LimitCustomViewHolder limitCustomViewHolder = (LimitCustomViewHolder) setcontentview;
        expandIfNecessary expandifnecessary = this.read.get(i);
        limitCustomViewHolder.accountTitle.setText(expandifnecessary.read);
        limitCustomViewHolder.limitAccountValue.setText(expandifnecessary.MediaBrowserCompat$CustomActionResultReceiver);
        limitCustomViewHolder.write.setOnClickListener(new DeepLinkService(limitCustomViewHolder));
        limitCustomViewHolder.limitInput.setMinValue(expandifnecessary.MediaDescriptionCompat.doubleValue());
        limitCustomViewHolder.limitInput.setMaxValue(expandifnecessary.MediaMetadataCompat.doubleValue());
        if (limitCustomViewHolder.write.getContext() != null) {
            limitCustomViewHolder.limitInput.setErrorMessage(limitCustomViewHolder.write.getContext().getString(R.string.limit_setting_range_error_message));
        }
        limitCustomViewHolder.limitInput.setDelta(expandifnecessary.MediaBrowserCompat$SearchResultReceiver.doubleValue());
        limitCustomViewHolder.limitInput.setActualValue(expandifnecessary.MediaBrowserCompat$ItemReceiver.doubleValue());
        limitCustomViewHolder.limitInput.setOnValueChangedListener(new getApplicationsById(limitCustomViewHolder, expandifnecessary));
        limitCustomViewHolder.limitInput.setOnIncrementChangeListener(new CustomDeltaInput$MediaBrowserCompat$CustomActionResultReceiver() {
            public final void MediaSessionCompat$Token() {
                LimitCustomViewHolder.this.limitAccountValue.setText(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(LimitCustomViewHolder.this.limitInput.IconCompatParcelizer));
            }

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            public final void mo13975x50fd9e4a() {
                LimitCustomViewHolder.this.limitAccountValue.setText(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(LimitCustomViewHolder.this.limitInput.IconCompatParcelizer));
            }
        });
        limitCustomViewHolder.limitInput.setOnFocusLostListener(new ctaVerify(limitCustomViewHolder));
        limitCustomViewHolder.limitInput.IconCompatParcelizer();
        limitCustomViewHolder.limitDoneTextButton.setOnClickListener(new getApplicationsLatest(limitCustomViewHolder, expandifnecessary, i));
        limitCustomViewHolder.limitInput.MediaBrowserCompat$ItemReceiver();
        limitCustomViewHolder.IconCompatParcelizer(false);
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public class LimitCustomViewHolder extends RecyclerView.setContentView {
        public boolean Keep = false;
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
        @BindView
        View viewCloseLine;

        LimitCustomViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }

        public final void IconCompatParcelizer(boolean z) {
            this.Keep = z;
            if (z) {
                this.expandArrow.setVisibility(8);
                this.limitDoneTextButton.setVisibility(0);
                FragmentBuilder_BindDeejungPlansFragment.write(this.limitInput);
                this.accountTitle.setFocusable(true);
                this.accountTitle.setFocusableInTouchMode(true);
                this.accountTitle.requestFocus();
                this.viewCloseLine.setVisibility(8);
                return;
            }
            this.expandArrow.setVisibility(0);
            this.limitDoneTextButton.setVisibility(8);
            FragmentBuilder_BindDeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(this.limitInput);
            this.viewCloseLine.setVisibility(0);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new LimitCustomViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83232131493549, (ViewGroup) null));
    }
}
