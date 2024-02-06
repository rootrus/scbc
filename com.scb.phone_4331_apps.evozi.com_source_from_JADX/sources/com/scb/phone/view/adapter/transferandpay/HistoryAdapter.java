package com.scb.phone.view.adapter.transferandpay;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
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
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.BaseExpandableRecycleViewAdapter;
import java.util.ArrayList;
import kotlin.TypeCastException;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.getAllowReturnTransitionOverlap;
import p040o.getCausedBy;
import p040o.getMarker;
import p040o.getNcbMultiproduct;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.setFlat;
import p040o.setFrames;
import p040o.setLastBaselineToBottomHeight;
import p040o.validateGER;
import p040o.validateHERK;
import p040o.validateSPMV;
import p040o.zzvo;

public final class HistoryAdapter extends BaseExpandableRecycleViewAdapter {
    public String MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public FundFactSheetActivity<? super setFrames, HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public FundFactSheetActivity<? super setFrames, HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$SearchResultReceiver;
    private validateGER MediaDescriptionCompat;
    private int MediaMetadataCompat = -1;
    private View.OnClickListener MediaSessionCompat$ResultReceiverWrapper = new View.OnClickListener(this) {
        private /* synthetic */ HistoryAdapter read;

        {
            this.read = r1;
        }

        public final void onClick(View view) {
            HistoryAdapter historyAdapter = this.read;
            onGetStartedClick.IconCompatParcelizer((Object) view, "it");
            HistoryAdapter.write(historyAdapter, view);
        }
    };
    /* access modifiers changed from: private */
    public FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> MediaSessionCompat$Token;
    private IconCompatParcelizer RatingCompat = IconCompatParcelizer.NONE;
    public final ArrayList<setFrames> read = new ArrayList<>();

    public enum IconCompatParcelizer {
        LOADING,
        ERROR,
        NONE
    }

    public interface read {
        void MediaBrowserCompat$ItemReceiver(int i);
    }

    /* renamed from: a_ */
    public final boolean mo20940a_(RecyclerView.setContentView setcontentview) {
        onGetStartedClick.write((Object) setcontentview, "holder");
        return false;
    }

    public final class ChildViewHolder_ViewBinding implements Unbinder {
        private ChildViewHolder write;

        public ChildViewHolder_ViewBinding(ChildViewHolder childViewHolder, View view) {
            this.write = childViewHolder;
            childViewHolder.repeatView = onStart.IconCompatParcelizer(view, R.id.view_group_repeat, "field 'repeatView'");
            childViewHolder.regenerateView = onStart.IconCompatParcelizer(view, R.id.view_group_regenerate, "field 'regenerateView'");
        }

        public final void read() {
            ChildViewHolder childViewHolder = this.write;
            if (childViewHolder != null) {
                this.write = null;
                childViewHolder.repeatView = null;
                childViewHolder.regenerateView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class GroupFooterViewHolder_ViewBinding implements Unbinder {
        private GroupFooterViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public GroupFooterViewHolder_ViewBinding(GroupFooterViewHolder groupFooterViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = groupFooterViewHolder;
            groupFooterViewHolder.remarkTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.history_remark_text_view, "field 'remarkTextView'", TextView.class);
        }

        public final void read() {
            GroupFooterViewHolder groupFooterViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (groupFooterViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                groupFooterViewHolder.remarkTextView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class GroupErrorViewHolder_ViewBinding implements Unbinder {
        private GroupErrorViewHolder MediaBrowserCompat$ItemReceiver;

        public GroupErrorViewHolder_ViewBinding(GroupErrorViewHolder groupErrorViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = groupErrorViewHolder;
            groupErrorViewHolder.emptyCard = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container_relative_layout, "field 'emptyCard'", RelativeLayout.class);
            groupErrorViewHolder.emptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'emptyTitle'", TextView.class);
            groupErrorViewHolder.emptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'emptyDescription'", TextView.class);
            groupErrorViewHolder.emptyImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_button_image_view, "field 'emptyImage'", ImageView.class);
        }

        public final void read() {
            GroupErrorViewHolder groupErrorViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (groupErrorViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                groupErrorViewHolder.emptyCard = null;
                groupErrorViewHolder.emptyTitle = null;
                groupErrorViewHolder.emptyDescription = null;
                groupErrorViewHolder.emptyImage = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class GroupItemViewHolder_ViewBinding extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder_ViewBinding {
        private GroupItemViewHolder IconCompatParcelizer;

        public GroupItemViewHolder_ViewBinding(GroupItemViewHolder groupItemViewHolder, View view) {
            super(groupItemViewHolder, view);
            this.IconCompatParcelizer = groupItemViewHolder;
            groupItemViewHolder.container = onStart.IconCompatParcelizer(view, R.id.container, "field 'container'");
            groupItemViewHolder.billerImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_biller_image, "field 'billerImageView'", ImageView.class);
            groupItemViewHolder.textReference = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_reference, "field 'textReference'", TextView.class);
            groupItemViewHolder.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
            groupItemViewHolder.textAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_amount, "field 'textAmount'", TextView.class);
            groupItemViewHolder.textTimestamp = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_timestamp, "field 'textTimestamp'", TextView.class);
            groupItemViewHolder.dividerView = onStart.IconCompatParcelizer(view, R.id.v_divider, "field 'dividerView'");
            groupItemViewHolder.endOfTableView = onStart.IconCompatParcelizer(view, R.id.v_end_of_table, "field 'endOfTableView'");
        }

        public final void read() {
            GroupItemViewHolder groupItemViewHolder = this.IconCompatParcelizer;
            if (groupItemViewHolder != null) {
                this.IconCompatParcelizer = null;
                groupItemViewHolder.container = null;
                groupItemViewHolder.billerImageView = null;
                groupItemViewHolder.textReference = null;
                groupItemViewHolder.textTitle = null;
                groupItemViewHolder.textAmount = null;
                groupItemViewHolder.textTimestamp = null;
                groupItemViewHolder.dividerView = null;
                groupItemViewHolder.endOfTableView = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HistoryAdapter(Context context, validateGER validateger, FundFactSheetActivity<? super setFrames, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity, FundFactSheetActivity<? super setFrames, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity2, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
        super(context);
        onGetStartedClick.write((Object) validateger, "itemManager");
        onGetStartedClick.write((Object) fundFactSheetActivity, "onClickRepeat");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "onClickRegenerate");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "onClickRetry");
        this.MediaDescriptionCompat = validateger;
        this.MediaBrowserCompat$MediaItem = fundFactSheetActivity;
        this.MediaBrowserCompat$SearchResultReceiver = fundFactSheetActivity2;
        this.MediaSessionCompat$Token = fundActionsSuccessActivity;
    }

    public static final class write implements getAllowReturnTransitionOverlap {
        private final /* synthetic */ setFlat write;

        private write() {
        }

        public /* synthetic */ write(setFlat setflat) {
            this.write = setflat;
        }

        public final boolean write(Object obj) {
            return ((zzvo) obj).MediaDescriptionCompat.contains(getMarker.IconCompatParcelizer(this.write).allow);
        }
    }

    public final void write(IconCompatParcelizer iconCompatParcelizer) {
        onGetStartedClick.write((Object) iconCompatParcelizer, "state");
        if (iconCompatParcelizer != this.RatingCompat) {
            int size = this.read.size() > 0 ? this.read.size() - 1 : 0;
            this.RatingCompat = iconCompatParcelizer;
            int i = getNcbMultiproduct.write[iconCompatParcelizer.ordinal()];
            if (i == 1 || i == 2) {
                if (this.read.size() <= 0 || this.read.get(size) != null) {
                    this.read.add((Object) null);
                    this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(size, 1);
                    return;
                }
                this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(size, 1);
            } else if (i == 3) {
                this.read.remove(size);
                this.IconCompatParcelizer.write(this.read.size(), 1);
            }
        }
    }

    public final int MediaMetadataCompat(int i) {
        if (i >= this.read.size()) {
            return 2;
        }
        if (this.read.get(i) == null && this.RatingCompat == IconCompatParcelizer.LOADING) {
            return 0;
        }
        return (this.read.get(i) == null && this.RatingCompat == IconCompatParcelizer.ERROR) ? 3 : 1;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        CharSequence charSequence = this.MediaBrowserCompat$ItemReceiver;
        return charSequence == null || charSequence.length() == 0 ? this.read.size() : this.read.size() + 1;
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83972131493623, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
            return new HistoryAdapter$MediaBrowserCompat$CustomActionResultReceiver(inflate);
        } else if (i == 1) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83942131493620, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate2, Promotion.ACTION_VIEW);
            return new GroupItemViewHolder(this, inflate2, this.MediaSessionCompat$ResultReceiverWrapper);
        } else if (i == 2) {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83962131493622, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate3, Promotion.ACTION_VIEW);
            return new GroupFooterViewHolder(this, inflate3);
        } else if (i != 3) {
            return IconCompatParcelizer(viewGroup);
        } else {
            return IconCompatParcelizer(viewGroup);
        }
    }

    public final RecyclerView.setContentView read(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83952131493621, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        return new ChildViewHolder(this, inflate);
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        onGetStartedClick.write((Object) setcontentview, "holder");
        if (setcontentview instanceof read) {
            ((read) setcontentview).MediaBrowserCompat$ItemReceiver(i);
        }
    }

    public final void write(RecyclerView.setContentView setcontentview, int i, int i2) {
        onGetStartedClick.write((Object) setcontentview, "holder");
        if (setcontentview instanceof ChildViewHolder) {
            ChildViewHolder childViewHolder = (ChildViewHolder) setcontentview;
            setFrames setframes = childViewHolder.PlaybackStateCompat.read.get(i);
            View view = childViewHolder.repeatView;
            if (view == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("repeatView");
            }
            int i3 = 0;
            view.setVisibility((setframes == null || !setframes.ParcelableVolumeInfo) ? 8 : 0);
            View view2 = childViewHolder.regenerateView;
            if (view2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("regenerateView");
            }
            if (setframes == null || !setframes.RatingCompat) {
                i3 = 8;
            }
            view2.setVisibility(i3);
            if (setframes != null) {
                View view3 = childViewHolder.repeatView;
                if (view3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("repeatView");
                }
                view3.setOnClickListener(new HistoryAdapter$ChildViewHolder$MediaBrowserCompat$ItemReceiver(childViewHolder, setframes));
                View view4 = childViewHolder.regenerateView;
                if (view4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("regenerateView");
                }
                view4.setOnClickListener(new ChildViewHolder.IconCompatParcelizer(childViewHolder, setframes));
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean MediaBrowserCompat$SearchResultReceiver(int i) {
        setFrames setframes;
        if (i > this.read.size() || (setframes = this.read.get(i)) == null) {
            return false;
        }
        onGetStartedClick.IconCompatParcelizer((Object) setframes, "transactions[position] ?: return false");
        if (setframes.ParcelableVolumeInfo || setframes.RatingCompat) {
            return true;
        }
        return false;
    }

    private final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83012131493527, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        return new GroupErrorViewHolder(this, inflate);
    }

    protected final class GroupFooterViewHolder extends validateSPMV implements read {
        private /* synthetic */ HistoryAdapter Keep;
        @BindView
        public TextView remarkTextView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GroupFooterViewHolder(HistoryAdapter historyAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.Keep = historyAdapter;
            ButterKnife.IconCompatParcelizer(this, view);
        }

        public final void MediaBrowserCompat$ItemReceiver(int i) {
            TextView textView = this.remarkTextView;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("remarkTextView");
            }
            textView.setText(this.Keep.MediaBrowserCompat$ItemReceiver);
        }
    }

    protected final class GroupErrorViewHolder extends validateSPMV implements read {
        @BindView
        public RelativeLayout emptyCard;
        @BindView
        public TextView emptyDescription;
        @BindView
        public ImageView emptyImage;
        @BindView
        public TextView emptyTitle;
        final /* synthetic */ HistoryAdapter setHasDecor;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GroupErrorViewHolder(HistoryAdapter historyAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.setHasDecor = historyAdapter;
            ButterKnife.IconCompatParcelizer(this, view);
        }

        static final class IconCompatParcelizer implements View.OnClickListener {
            private /* synthetic */ GroupErrorViewHolder MediaBrowserCompat$ItemReceiver;

            IconCompatParcelizer(GroupErrorViewHolder groupErrorViewHolder) {
                this.MediaBrowserCompat$ItemReceiver = groupErrorViewHolder;
            }

            public final void onClick(View view) {
                this.MediaBrowserCompat$ItemReceiver.setHasDecor.MediaSessionCompat$Token.invoke();
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(int i) {
            RelativeLayout relativeLayout = this.emptyCard;
            if (relativeLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("emptyCard");
            }
            relativeLayout.setOnClickListener(new IconCompatParcelizer(this));
            RelativeLayout relativeLayout2 = this.emptyCard;
            if (relativeLayout2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("emptyCard");
            }
            relativeLayout2.setVisibility(0);
            TextView textView = this.emptyTitle;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("emptyTitle");
            }
            Context MediaBrowserCompat$ItemReceiver = this.setHasDecor.write;
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "mContext");
            textView.setText(MediaBrowserCompat$ItemReceiver.getResources().getString(R.string.auto_regen_repeat_history_error_state_title));
            TextView textView2 = this.emptyDescription;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("emptyDescription");
            }
            Context MediaBrowserCompat$ItemReceiver2 = this.setHasDecor.write;
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "mContext");
            textView2.setText(MediaBrowserCompat$ItemReceiver2.getResources().getString(R.string.auto_regen_repeat_history_error_state_message));
        }
    }

    protected final class GroupItemViewHolder extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder implements read {
        private /* synthetic */ HistoryAdapter Keep;
        @BindView
        public ImageView billerImageView;
        @BindView
        public View container;
        @BindView
        public View dividerView;
        @BindView
        public View endOfTableView;
        @BindView
        public TextView textAmount;
        @BindView
        public TextView textReference;
        @BindView
        public TextView textTimestamp;
        @BindView
        public TextView textTitle;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GroupItemViewHolder(HistoryAdapter historyAdapter, View view, View.OnClickListener onClickListener) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            onGetStartedClick.write((Object) onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.Keep = historyAdapter;
            ButterKnife.IconCompatParcelizer(this, view);
            View view2 = this.container;
            if (view2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("container");
            }
            view2.setOnClickListener(onClickListener);
        }

        public final void MediaBrowserCompat$ItemReceiver(int i) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            getCausedBy getcausedby;
            String str6;
            getCausedBy getcausedby2;
            setFrames setframes = (setFrames) this.Keep.read.get(i);
            TextView textView = this.textTitle;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("textTitle");
            }
            String str7 = null;
            if (setframes == null || (getcausedby2 = setframes.MediaBrowserCompat$SearchResultReceiver) == null || (str = getcausedby2.read) == null) {
                if (setframes != null) {
                    str = setframes.write;
                } else {
                    str = null;
                }
            }
            textView.setText(str);
            TextView textView2 = this.textAmount;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("textAmount");
            }
            if (setframes != null) {
                str2 = setframes.MediaBrowserCompat$ItemReceiver;
            } else {
                str2 = null;
            }
            textView2.setText(str2);
            TextView textView3 = this.textTimestamp;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("textTimestamp");
            }
            if (setframes != null) {
                str3 = setframes.MediaSessionCompat$Token;
            } else {
                str3 = null;
            }
            textView3.setText(str3);
            TextView textView4 = this.textReference;
            if (textView4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("textReference");
            }
            if (setframes != null) {
                str4 = setframes.IconCompatParcelizer;
            } else {
                str4 = null;
            }
            textView4.setText(str4);
            boolean z = i == this.Keep.read.size() - 1;
            View view = this.dividerView;
            if (view == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("dividerView");
            }
            view.setVisibility(z ? 8 : 0);
            View view2 = this.endOfTableView;
            if (view2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("endOfTableView");
            }
            view2.setVisibility(z ? 0 : 8);
            Context MediaBrowserCompat$ItemReceiver = this.Keep.write;
            if (MediaBrowserCompat$ItemReceiver != null) {
                Drawable write = setLastBaselineToBottomHeight.write(MediaBrowserCompat$ItemReceiver, R.drawable.biller_place_holder);
                ImageView imageView = this.billerImageView;
                if (imageView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("billerImageView");
                }
                if (setframes == null || (getcausedby = setframes.MediaBrowserCompat$SearchResultReceiver) == null || (str6 = getcausedby.MediaBrowserCompat$ItemReceiver) == null) {
                    if (setframes != null) {
                        str7 = setframes.MediaBrowserCompat$CustomActionResultReceiver;
                    }
                    str5 = str7;
                } else {
                    str5 = str6;
                }
                FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver, write, imageView, str5, MediaBrowserCompat$ItemReceiver.getResources().getDimensionPixelOffset(R.dimen.f74412131165877), setLastBaselineToBottomHeight.read(MediaBrowserCompat$ItemReceiver, R.color.f66402131099796));
            }
            if (!this.Keep.MediaBrowserCompat$SearchResultReceiver(i)) {
                View view3 = this.write;
                onGetStartedClick.IconCompatParcelizer((Object) view3, "itemView");
                view3.setClickable(false);
                ImageView imageView2 = this.expandIcon;
                onGetStartedClick.IconCompatParcelizer((Object) imageView2, "expandIcon");
                imageView2.setVisibility(8);
            } else {
                View view4 = this.write;
                onGetStartedClick.IconCompatParcelizer((Object) view4, "itemView");
                view4.setClickable(true);
                ImageView imageView3 = this.expandIcon;
                onGetStartedClick.IconCompatParcelizer((Object) imageView3, "expandIcon");
                imageView3.setVisibility(0);
            }
            BaseExpandableRecycleViewAdapter.MediaBrowserCompat$CustomActionResultReceiver(this);
        }
    }

    protected final class ChildViewHolder extends validateSPMV {
        final /* synthetic */ HistoryAdapter PlaybackStateCompat;
        @BindView
        public View regenerateView;
        @BindView
        public View repeatView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ChildViewHolder(HistoryAdapter historyAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.PlaybackStateCompat = historyAdapter;
            ButterKnife.IconCompatParcelizer(this, view);
        }

        static final class IconCompatParcelizer implements View.OnClickListener {
            private /* synthetic */ setFrames MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ ChildViewHolder write;

            IconCompatParcelizer(ChildViewHolder childViewHolder, setFrames setframes) {
                this.write = childViewHolder;
                this.MediaBrowserCompat$CustomActionResultReceiver = setframes;
            }

            public final void onClick(View view) {
                this.write.PlaybackStateCompat.MediaBrowserCompat$SearchResultReceiver.invoke(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
    }

    public static final /* synthetic */ void write(HistoryAdapter historyAdapter, View view) {
        RecyclerView.setContentView IconCompatParcelizer2;
        int i;
        long j;
        int i2;
        if (view.getId() == R.id.container && (IconCompatParcelizer2 = AlertController$RecycleListView.IconCompatParcelizer(view)) != null) {
            onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "RecyclerViewAdapterUtils…iewHolder(view) ?: return");
            RecyclerView recyclerView = IconCompatParcelizer2.MediaMetadataCompat;
            if (recyclerView == null) {
                i = -1;
            } else {
                i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2);
            }
            if (i != -1) {
                validateHERK validateherk = historyAdapter.MediaDescriptionCompat.MediaDescriptionCompat;
                if (validateherk == null) {
                    j = -1;
                } else {
                    j = validateherk.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
                }
                int i3 = (int) j;
                if (historyAdapter.MediaBrowserCompat$SearchResultReceiver(i3)) {
                    if (historyAdapter.write instanceof BaseActivity) {
                        Context context = historyAdapter.write;
                        if (context != null) {
                            ((BaseActivity) context).PlaybackStateCompat$CustomAction();
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.activity.BaseActivity");
                        }
                    }
                    if (((int) (j >>> 32)) == -1) {
                        Context context2 = historyAdapter.write;
                        if (context2 != null) {
                            View currentFocus = ((Activity) context2).getCurrentFocus();
                            if (currentFocus != null) {
                                currentFocus.clearFocus();
                            }
                            if (historyAdapter.MediaDescriptionCompat.IconCompatParcelizer(i3)) {
                                validateHERK validateherk2 = historyAdapter.MediaDescriptionCompat.MediaDescriptionCompat;
                                if (validateherk2 != null) {
                                    boolean MediaBrowserCompat$ItemReceiver2 = validateherk2.MediaBrowserCompat$ItemReceiver(i3, false, (Object) null);
                                }
                            } else {
                                historyAdapter.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
                                validateHERK validateherk3 = historyAdapter.MediaDescriptionCompat.MediaDescriptionCompat;
                                if (validateherk3 != null) {
                                    boolean read2 = validateherk3.read(i3, false, (Object) null);
                                }
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                        }
                    }
                    if ((IconCompatParcelizer2 instanceof GroupItemViewHolder) && (i2 = historyAdapter.MediaMetadataCompat) >= 0 && i2 != i) {
                        historyAdapter.IconCompatParcelizer.write();
                    }
                    historyAdapter.MediaMetadataCompat = i;
                }
            }
        }
    }
}
