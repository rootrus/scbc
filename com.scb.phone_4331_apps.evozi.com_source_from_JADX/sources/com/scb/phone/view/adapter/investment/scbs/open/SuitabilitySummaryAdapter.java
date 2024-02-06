package com.scb.phone.view.adapter.investment.scbs.open;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import p040o.AbstractMultimap;
import p040o.C6514xb47b5894;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.SystemCurrentTimeProvider;
import p040o.onBeginSession;
import p040o.onEndSession;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.persistFatalEvent;
import p040o.persistUserId;

public final class SuitabilitySummaryAdapter extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> {
    private final FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> read;
    private final List<persistUserId> write;

    public final class SuitabilitySummaryAnswerViewHolder_ViewBinding implements Unbinder {
        private SuitabilitySummaryAnswerViewHolder MediaBrowserCompat$ItemReceiver;

        public SuitabilitySummaryAnswerViewHolder_ViewBinding(SuitabilitySummaryAnswerViewHolder suitabilitySummaryAnswerViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = suitabilitySummaryAnswerViewHolder;
            suitabilitySummaryAnswerViewHolder.tvQuestionTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_question_title, "field 'tvQuestionTitle'", TextView.class);
            suitabilitySummaryAnswerViewHolder.tvAnswersTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_answers_title, "field 'tvAnswersTitle'", TextView.class);
        }

        public final void read() {
            SuitabilitySummaryAnswerViewHolder suitabilitySummaryAnswerViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (suitabilitySummaryAnswerViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                suitabilitySummaryAnswerViewHolder.tvQuestionTitle = null;
                suitabilitySummaryAnswerViewHolder.tvAnswersTitle = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class SuitabilitySummaryFooterViewHolder_ViewBinding implements Unbinder {
        private SuitabilitySummaryFooterViewHolder MediaBrowserCompat$ItemReceiver;

        public SuitabilitySummaryFooterViewHolder_ViewBinding(SuitabilitySummaryFooterViewHolder suitabilitySummaryFooterViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = suitabilitySummaryFooterViewHolder;
            suitabilitySummaryFooterViewHolder.btNextButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_next, "field 'btNextButton'", Button.class);
        }

        public final void read() {
            SuitabilitySummaryFooterViewHolder suitabilitySummaryFooterViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (suitabilitySummaryFooterViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                suitabilitySummaryFooterViewHolder.btNextButton = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class SuitabilitySummaryHeaderViewHolder_ViewBinding implements Unbinder {
        private SuitabilitySummaryHeaderViewHolder write;

        public SuitabilitySummaryHeaderViewHolder_ViewBinding(SuitabilitySummaryHeaderViewHolder suitabilitySummaryHeaderViewHolder, View view) {
            this.write = suitabilitySummaryHeaderViewHolder;
            suitabilitySummaryHeaderViewHolder.tvSubtitle1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_subtitle_1, "field 'tvSubtitle1'", TextView.class);
            suitabilitySummaryHeaderViewHolder.tvSubtitle2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_subtitle_2, "field 'tvSubtitle2'", TextView.class);
        }

        public final void read() {
            SuitabilitySummaryHeaderViewHolder suitabilitySummaryHeaderViewHolder = this.write;
            if (suitabilitySummaryHeaderViewHolder != null) {
                this.write = null;
                suitabilitySummaryHeaderViewHolder.tvSubtitle1 = null;
                suitabilitySummaryHeaderViewHolder.tvSubtitle2 = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class SuitabilitySummarySectionViewHolder_ViewBinding implements Unbinder {
        private SuitabilitySummarySectionViewHolder IconCompatParcelizer;

        public SuitabilitySummarySectionViewHolder_ViewBinding(SuitabilitySummarySectionViewHolder suitabilitySummarySectionViewHolder, View view) {
            this.IconCompatParcelizer = suitabilitySummarySectionViewHolder;
            suitabilitySummarySectionViewHolder.tvSection = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_section_title, "field 'tvSection'", TextView.class);
        }

        public final void read() {
            SuitabilitySummarySectionViewHolder suitabilitySummarySectionViewHolder = this.IconCompatParcelizer;
            if (suitabilitySummarySectionViewHolder != null) {
                this.IconCompatParcelizer = null;
                suitabilitySummarySectionViewHolder.tvSection = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public SuitabilitySummaryAdapter(List<? extends persistUserId> list, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
        onGetStartedClick.write((Object) list, "summaryDisplays");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "onNextClick");
        this.write = list;
        this.read = fundActionsSuccessActivity;
    }

    public static final class read implements Callable {
        private final /* synthetic */ String IconCompatParcelizer;
        private final /* synthetic */ C6514xb47b5894 write;

        private read() {
        }

        public /* synthetic */ read(C6514xb47b5894 fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver, String str) {
            this.write = fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver;
            this.IconCompatParcelizer = str;
        }

        public final Object call() {
            C6514xb47b5894 fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver = this.write;
            String str = this.IconCompatParcelizer;
            fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = AbstractMultimap.AsMap.AsMapEntries.ERROR;
            fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat.RatingCompat = null;
            return fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat, str, fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer, fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver, fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat, fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.read);
        }
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        onGetStartedClick.write((Object) setcontentview, "holder");
        persistUserId persistuserid = this.write.get(i);
        int MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(i);
        if (MediaBrowserCompat$CustomActionResultReceiver == 1) {
            SuitabilitySummarySectionViewHolder suitabilitySummarySectionViewHolder = (SuitabilitySummarySectionViewHolder) setcontentview;
            if (persistuserid != null) {
                SystemCurrentTimeProvider systemCurrentTimeProvider = (SystemCurrentTimeProvider) persistuserid;
                onGetStartedClick.write((Object) systemCurrentTimeProvider, "display");
                TextView textView = suitabilitySummarySectionViewHolder.tvSection;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSection");
                }
                TextView textView2 = suitabilitySummarySectionViewHolder.tvSection;
                if (textView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSection");
                }
                textView.setText(textView2.getContext().getString(R.string.section, new Object[]{String.valueOf(systemCurrentTimeProvider.read)}));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.investment.scbs.open.suitabilities.SuitabilitySummarySectionDisplay");
        } else if (MediaBrowserCompat$CustomActionResultReceiver == 2) {
            SuitabilitySummaryAnswerViewHolder suitabilitySummaryAnswerViewHolder = (SuitabilitySummaryAnswerViewHolder) setcontentview;
            if (persistuserid != null) {
                persistFatalEvent persistfatalevent = (persistFatalEvent) persistuserid;
                onGetStartedClick.write((Object) persistfatalevent, "display");
                TextView textView3 = suitabilitySummaryAnswerViewHolder.tvQuestionTitle;
                if (textView3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvQuestionTitle");
                }
                textView3.setText(persistfatalevent.MediaBrowserCompat$ItemReceiver);
                TextView textView4 = suitabilitySummaryAnswerViewHolder.tvAnswersTitle;
                if (textView4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAnswersTitle");
                }
                textView4.setText(persistfatalevent.IconCompatParcelizer);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.investment.scbs.open.suitabilities.SuitabilitySummaryAnswerDisplay");
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        persistUserId persistuserid = this.write.get(i);
        if (persistuserid instanceof onEndSession) {
            return 0;
        }
        if (persistuserid instanceof onBeginSession) {
            return 3;
        }
        if (persistuserid instanceof persistFatalEvent) {
            return 2;
        }
        if (persistuserid instanceof SystemCurrentTimeProvider) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final class SuitabilitySummaryHeaderViewHolder extends RecyclerView.setContentView {
        @BindView
        public TextView tvSubtitle1;
        @BindView
        public TextView tvSubtitle2;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SuitabilitySummaryHeaderViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            ButterKnife.IconCompatParcelizer(this, view);
            TextView textView = this.tvSubtitle1;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSubtitle1");
            }
            textView.setVisibility(0);
            TextView textView2 = this.tvSubtitle2;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSubtitle2");
            }
            textView2.setVisibility(8);
            TextView textView3 = this.tvSubtitle1;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSubtitle1");
            }
            textView3.setText(R.string.auto_scbs_onboarding_suitability_summary_message);
        }
    }

    public final class SuitabilitySummarySectionViewHolder extends RecyclerView.setContentView {
        @BindView
        public TextView tvSection;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SuitabilitySummarySectionViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final class SuitabilitySummaryFooterViewHolder extends RecyclerView.setContentView {
        @BindView
        public Button btNextButton;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SuitabilitySummaryFooterViewHolder(View view, final FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            onGetStartedClick.write((Object) fundActionsSuccessActivity, "onNextClick");
            ButterKnife.IconCompatParcelizer(this, view);
            Button button = this.btNextButton;
            if (button == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("btNextButton");
            }
            button.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    fundActionsSuccessActivity.invoke();
                }
            });
        }
    }

    public final class SuitabilitySummaryAnswerViewHolder extends RecyclerView.setContentView {
        @BindView
        public TextView tvAnswersTitle;
        @BindView
        public TextView tvQuestionTitle;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SuitabilitySummaryAnswerViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            View inflate = from.inflate(R.layout.f91892131494416, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, "inflater\n               …ty_header, parent, false)");
            return new SuitabilitySummaryHeaderViewHolder(inflate);
        } else if (i == 1) {
            View inflate2 = from.inflate(R.layout.f91912131494418, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate2, "inflater\n               …y_section, parent, false)");
            return new SuitabilitySummarySectionViewHolder(inflate2);
        } else if (i != 3) {
            View inflate3 = from.inflate(R.layout.f91872131494414, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate3, "inflater\n               …ty_answer, parent, false)");
            return new SuitabilitySummaryAnswerViewHolder(inflate3);
        } else {
            View inflate4 = from.inflate(R.layout.f91882131494415, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate4, "inflater\n               …ty_footer, parent, false)");
            return new SuitabilitySummaryFooterViewHolder(inflate4, this.read);
        }
    }
}
