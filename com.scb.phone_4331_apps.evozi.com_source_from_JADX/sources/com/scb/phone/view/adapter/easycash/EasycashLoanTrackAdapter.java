package com.scb.phone.view.adapter.easycash;

import android.content.Context;
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
import java.util.List;
import kotlin.TypeCastException;
import p040o.CheckEligibilityActivity;
import p040o.CommonUtils;
import p040o.CrashlyticsBackgroundWorker;
import p040o.FundActionsSuccessActivity;
import p040o.checkRunningOnThread;
import p040o.getRtpEBillPaymentConfirm;
import p040o.isRunningOnThread;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.resolveUnityEditorVersion;
import p040o.setLastBaselineToBottomHeight;

public final class EasycashLoanTrackAdapter extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> {
    /* access modifiers changed from: private */
    public final List<isRunningOnThread> read;

    public final class LoanInfoHeaderViewHolder_ViewBinding implements Unbinder {
        private LoanInfoHeaderViewHolder write;

        public LoanInfoHeaderViewHolder_ViewBinding(LoanInfoHeaderViewHolder loanInfoHeaderViewHolder, View view) {
            this.write = loanInfoHeaderViewHolder;
            loanInfoHeaderViewHolder.textHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_loan_header, "field 'textHeader'", TextView.class);
            loanInfoHeaderViewHolder.textSubHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_loan_sub_header, "field 'textSubHeader'", TextView.class);
        }

        public final void read() {
            LoanInfoHeaderViewHolder loanInfoHeaderViewHolder = this.write;
            if (loanInfoHeaderViewHolder != null) {
                this.write = null;
                loanInfoHeaderViewHolder.textHeader = null;
                loanInfoHeaderViewHolder.textSubHeader = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class LoanInfoItemHeaderViewHolder_ViewBinding implements Unbinder {
        private LoanInfoItemHeaderViewHolder write;

        public LoanInfoItemHeaderViewHolder_ViewBinding(LoanInfoItemHeaderViewHolder loanInfoItemHeaderViewHolder, View view) {
            this.write = loanInfoItemHeaderViewHolder;
            loanInfoItemHeaderViewHolder.textHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_loan_item_header, "field 'textHeader'", TextView.class);
            loanInfoItemHeaderViewHolder.textSubHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_loan_item_sub_header, "field 'textSubHeader'", TextView.class);
        }

        public final void read() {
            LoanInfoItemHeaderViewHolder loanInfoItemHeaderViewHolder = this.write;
            if (loanInfoItemHeaderViewHolder != null) {
                this.write = null;
                loanInfoItemHeaderViewHolder.textHeader = null;
                loanInfoItemHeaderViewHolder.textSubHeader = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class LoanInfoItemBodyViewHolder_ViewBinding implements Unbinder {
        private LoanInfoItemBodyViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public LoanInfoItemBodyViewHolder_ViewBinding(LoanInfoItemBodyViewHolder loanInfoItemBodyViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = loanInfoItemBodyViewHolder;
            loanInfoItemBodyViewHolder.lineUpper = onStart.IconCompatParcelizer(view, R.id.view_upper_line, "field 'lineUpper'");
            loanInfoItemBodyViewHolder.lineLower = onStart.IconCompatParcelizer(view, R.id.view_lower_line, "field 'lineLower'");
            loanInfoItemBodyViewHolder.dotInActive = onStart.IconCompatParcelizer(view, R.id.view_dot_inactive, "field 'dotInActive'");
            loanInfoItemBodyViewHolder.dotActive = onStart.IconCompatParcelizer(view, R.id.view_dot_active, "field 'dotActive'");
            loanInfoItemBodyViewHolder.textActive = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_dot_active, "field 'textActive'", TextView.class);
            loanInfoItemBodyViewHolder.textLoanTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_loan_item_title, "field 'textLoanTitle'", TextView.class);
            loanInfoItemBodyViewHolder.textLoanDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_loan_description, "field 'textLoanDescription'", TextView.class);
            loanInfoItemBodyViewHolder.iconLoanStatus = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.icon_loan_status, "field 'iconLoanStatus'", ImageView.class);
            loanInfoItemBodyViewHolder.dividerBottom = onStart.IconCompatParcelizer(view, R.id.view_divider_bottom, "field 'dividerBottom'");
            loanInfoItemBodyViewHolder.paddingBottom = onStart.IconCompatParcelizer(view, R.id.view_padding_bottom, "field 'paddingBottom'");
        }

        public final void read() {
            LoanInfoItemBodyViewHolder loanInfoItemBodyViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (loanInfoItemBodyViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                loanInfoItemBodyViewHolder.lineUpper = null;
                loanInfoItemBodyViewHolder.lineLower = null;
                loanInfoItemBodyViewHolder.dotInActive = null;
                loanInfoItemBodyViewHolder.dotActive = null;
                loanInfoItemBodyViewHolder.textActive = null;
                loanInfoItemBodyViewHolder.textLoanTitle = null;
                loanInfoItemBodyViewHolder.textLoanDescription = null;
                loanInfoItemBodyViewHolder.iconLoanStatus = null;
                loanInfoItemBodyViewHolder.dividerBottom = null;
                loanInfoItemBodyViewHolder.paddingBottom = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<Boolean> {
        private /* synthetic */ int MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ EasycashLoanTrackAdapter read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(EasycashLoanTrackAdapter easycashLoanTrackAdapter, int i) {
            super(0);
            this.read = easycashLoanTrackAdapter;
            this.MediaBrowserCompat$ItemReceiver = i;
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(read());
        }

        public final boolean read() {
            if (this.MediaBrowserCompat$ItemReceiver >= this.read.read.size() - 1 || this.read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver + 1) != 2) {
                return true;
            }
            return false;
        }
    }

    public EasycashLoanTrackAdapter(List<? extends isRunningOnThread> list) {
        onGetStartedClick.write((Object) list, "listItem");
        this.read = list;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        isRunningOnThread isrunningonthread = this.read.get(i);
        if (isrunningonthread instanceof resolveUnityEditorVersion) {
            return 0;
        }
        if (isrunningonthread instanceof CrashlyticsBackgroundWorker) {
            return 1;
        }
        if (isrunningonthread instanceof CommonUtils.Architecture) {
            return 2;
        }
        return super.MediaBrowserCompat$CustomActionResultReceiver(i);
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83272131493553, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(pare…ng_header, parent, false)");
            return new LoanInfoHeaderViewHolder(inflate);
        } else if (i != 1) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83282131493554, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate2, "LayoutInflater.from(pare…item_body, parent, false)");
            return new LoanInfoItemBodyViewHolder(inflate2);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83292131493555, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate3, "LayoutInflater.from(pare…em_header, parent, false)");
            return new LoanInfoItemHeaderViewHolder(inflate3);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        onGetStartedClick.write((Object) setcontentview, "viewHolder");
        isRunningOnThread isrunningonthread = this.read.get(i);
        int MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(i);
        int i2 = 8;
        boolean z = true;
        if (MediaBrowserCompat$CustomActionResultReceiver == 0) {
            LoanInfoHeaderViewHolder loanInfoHeaderViewHolder = (LoanInfoHeaderViewHolder) setcontentview;
            if (isrunningonthread != null) {
                resolveUnityEditorVersion resolveunityeditorversion = (resolveUnityEditorVersion) isrunningonthread;
                onGetStartedClick.write((Object) resolveunityeditorversion, "display");
                TextView textView = loanInfoHeaderViewHolder.textHeader;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("textHeader");
                }
                textView.setText(resolveunityeditorversion.MediaBrowserCompat$ItemReceiver);
                if (resolveunityeditorversion.MediaBrowserCompat$CustomActionResultReceiver.length() <= 0) {
                    z = false;
                }
                if (z) {
                    TextView textView2 = loanInfoHeaderViewHolder.textSubHeader;
                    if (textView2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("textSubHeader");
                    }
                    textView2.setVisibility(0);
                    TextView textView3 = loanInfoHeaderViewHolder.textSubHeader;
                    if (textView3 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("textSubHeader");
                    }
                    textView3.setText(resolveunityeditorversion.MediaBrowserCompat$CustomActionResultReceiver);
                    return;
                }
                TextView textView4 = loanInfoHeaderViewHolder.textSubHeader;
                if (textView4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("textSubHeader");
                }
                textView4.setVisibility(8);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.easycash.loantrack.EasycashLoanInfoHeaderDisplay");
        } else if (MediaBrowserCompat$CustomActionResultReceiver == 1) {
            LoanInfoItemHeaderViewHolder loanInfoItemHeaderViewHolder = (LoanInfoItemHeaderViewHolder) setcontentview;
            if (isrunningonthread != null) {
                CrashlyticsBackgroundWorker crashlyticsBackgroundWorker = (CrashlyticsBackgroundWorker) isrunningonthread;
                onGetStartedClick.write((Object) crashlyticsBackgroundWorker, "display");
                TextView textView5 = loanInfoItemHeaderViewHolder.textHeader;
                if (textView5 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("textHeader");
                }
                textView5.setText(crashlyticsBackgroundWorker.MediaBrowserCompat$CustomActionResultReceiver);
                TextView textView6 = loanInfoItemHeaderViewHolder.textSubHeader;
                if (textView6 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("textSubHeader");
                }
                textView6.setText(crashlyticsBackgroundWorker.MediaBrowserCompat$ItemReceiver);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.easycash.loantrack.EasycashLoanInfoItemHeaderDisplay");
        } else if (MediaBrowserCompat$CustomActionResultReceiver == 2) {
            LoanInfoItemBodyViewHolder loanInfoItemBodyViewHolder = (LoanInfoItemBodyViewHolder) setcontentview;
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, i);
            read read2 = new read(this, i);
            if (isrunningonthread != null) {
                CommonUtils.Architecture architecture = (CommonUtils.Architecture) isrunningonthread;
                int i3 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                boolean z2 = i3 != 0 && iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(i3 - 1) == 2;
                boolean read3 = read2.read();
                onGetStartedClick.write((Object) architecture, "display");
                TextView textView7 = loanInfoItemBodyViewHolder.textLoanTitle;
                if (textView7 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("textLoanTitle");
                }
                textView7.setText(architecture.read);
                TextView textView8 = loanInfoItemBodyViewHolder.textLoanDescription;
                if (textView8 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("textLoanDescription");
                }
                textView8.setText(architecture.MediaBrowserCompat$ItemReceiver);
                Integer num = architecture.write;
                if (num != null && num.intValue() > 0) {
                    View view = loanInfoItemBodyViewHolder.dotActive;
                    if (view == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("dotActive");
                    }
                    view.setVisibility(0);
                    View view2 = loanInfoItemBodyViewHolder.dotInActive;
                    if (view2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("dotInActive");
                    }
                    view2.setVisibility(8);
                    TextView textView9 = loanInfoItemBodyViewHolder.textActive;
                    if (textView9 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("textActive");
                    }
                    textView9.setText(String.valueOf(num));
                } else {
                    View view3 = loanInfoItemBodyViewHolder.dotActive;
                    if (view3 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("dotActive");
                    }
                    view3.setVisibility(8);
                    View view4 = loanInfoItemBodyViewHolder.dotInActive;
                    if (view4 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("dotInActive");
                    }
                    view4.setVisibility(0);
                }
                if (architecture.IconCompatParcelizer) {
                    ImageView imageView = loanInfoItemBodyViewHolder.iconLoanStatus;
                    if (imageView == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("iconLoanStatus");
                    }
                    imageView.setAlpha(1.0f);
                    TextView textView10 = loanInfoItemBodyViewHolder.textLoanTitle;
                    if (textView10 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("textLoanTitle");
                    }
                    textView10.setTextColor(loanInfoItemBodyViewHolder.AlertController$RecycleListView);
                    TextView textView11 = loanInfoItemBodyViewHolder.textLoanDescription;
                    if (textView11 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("textLoanDescription");
                    }
                    textView11.setTextColor(loanInfoItemBodyViewHolder.setHasDecor);
                } else {
                    ImageView imageView2 = loanInfoItemBodyViewHolder.iconLoanStatus;
                    if (imageView2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("iconLoanStatus");
                    }
                    imageView2.setAlpha(0.5f);
                    TextView textView12 = loanInfoItemBodyViewHolder.textLoanTitle;
                    if (textView12 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("textLoanTitle");
                    }
                    textView12.setTextColor(loanInfoItemBodyViewHolder.PlaybackStateCompat);
                    TextView textView13 = loanInfoItemBodyViewHolder.textLoanDescription;
                    if (textView13 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("textLoanDescription");
                    }
                    textView13.setTextColor(loanInfoItemBodyViewHolder.PlaybackStateCompat);
                }
                checkRunningOnThread checkrunningonthread = architecture.MediaBrowserCompat$CustomActionResultReceiver;
                ImageView imageView3 = loanInfoItemBodyViewHolder.iconLoanStatus;
                if (imageView3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("iconLoanStatus");
                }
                imageView3.setVisibility(0);
                int i4 = getRtpEBillPaymentConfirm.read[checkrunningonthread.ordinal()];
                int i5 = 4;
                if (i4 == 1) {
                    imageView3.setImageResource(R.drawable.ic_gift_background_check);
                } else if (i4 == 2) {
                    imageView3.setImageResource(R.drawable.icon_error);
                } else if (i4 == 3) {
                    imageView3.setImageResource(R.drawable.ic_loan_alert);
                } else if (i4 != 4) {
                    imageView3.setVisibility(4);
                } else {
                    imageView3.setImageResource(R.drawable.ic_onprocess);
                }
                View view5 = loanInfoItemBodyViewHolder.lineUpper;
                if (view5 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("lineUpper");
                }
                view5.setVisibility(z2 ? 0 : 4);
                View view6 = loanInfoItemBodyViewHolder.lineLower;
                if (view6 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("lineLower");
                }
                if (!read3) {
                    i5 = 0;
                }
                view6.setVisibility(i5);
                View view7 = loanInfoItemBodyViewHolder.dividerBottom;
                if (view7 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("dividerBottom");
                }
                view7.setVisibility(read3 ? 0 : 8);
                View view8 = loanInfoItemBodyViewHolder.paddingBottom;
                if (view8 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("paddingBottom");
                }
                if (read3) {
                    i2 = 0;
                }
                view8.setVisibility(i2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.easycash.loantrack.EasycashLoanInfoItemBodyDisplay");
        }
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public static final class LoanInfoHeaderViewHolder extends RecyclerView.setContentView {
        @BindView
        public TextView textHeader;
        @BindView
        public TextView textSubHeader;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LoanInfoHeaderViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public static final class LoanInfoItemHeaderViewHolder extends RecyclerView.setContentView {
        @BindView
        public TextView textHeader;
        @BindView
        public TextView textSubHeader;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LoanInfoItemHeaderViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public static final class LoanInfoItemBodyViewHolder extends RecyclerView.setContentView {
        final int AlertController$RecycleListView;
        int PlaybackStateCompat;
        @BindView
        public View dividerBottom;
        @BindView
        public View dotActive;
        @BindView
        public View dotInActive;
        @BindView
        public ImageView iconLoanStatus;
        @BindView
        public View lineLower;
        @BindView
        public View lineUpper;
        @BindView
        public View paddingBottom;
        final int setHasDecor;
        @BindView
        public TextView textActive;
        @BindView
        public TextView textLoanDescription;
        @BindView
        public TextView textLoanTitle;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LoanInfoItemBodyViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            ButterKnife.IconCompatParcelizer(this, view);
            Context context = view.getContext();
            this.PlaybackStateCompat = setLastBaselineToBottomHeight.read(context, R.color.f66402131099796);
            this.AlertController$RecycleListView = setLastBaselineToBottomHeight.read(context, R.color.f67252131099881);
            this.setHasDecor = setLastBaselineToBottomHeight.read(context, R.color.f66092131099764);
        }
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<Boolean> {
        final /* synthetic */ EasycashLoanTrackAdapter MediaBrowserCompat$CustomActionResultReceiver;
        final /* synthetic */ int MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(EasycashLoanTrackAdapter easycashLoanTrackAdapter, int i) {
            super(0);
            this.MediaBrowserCompat$CustomActionResultReceiver = easycashLoanTrackAdapter;
            this.MediaBrowserCompat$ItemReceiver = i;
        }

        public final /* synthetic */ Object invoke() {
            int i = this.MediaBrowserCompat$ItemReceiver;
            boolean z = true;
            if (i == 0 || this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(i - 1) != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }
}
