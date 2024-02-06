package com.scb.phone.view.adapter.investment.scbs.open;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.Iterator;
import java.util.List;
import p040o.ChubbService;
import p040o.chubbConfirm;
import p040o.finalizeSessionWithNativeEvent;
import p040o.getConfirmation;
import p040o.getCreditCard;
import p040o.getSortedCustomAttributes;
import p040o.getVerification;
import p040o.onReportSendComplete;
import p040o.onStart;
import p040o.persistNonFatalEvent;
import p040o.show;

public final class SuitabilityAssessmentAdapter extends RecyclerView.IconCompatParcelizer<C5768xbcc7b6dd> implements RadioGroup.OnCheckedChangeListener {
    private final SuitabilityAssessmentAdapter$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    private final finalizeSessionWithNativeEvent read;

    public class SuitabilityFooterViewHolder_ViewBinding implements Unbinder {
        private SuitabilityFooterViewHolder IconCompatParcelizer;

        public SuitabilityFooterViewHolder_ViewBinding(SuitabilityFooterViewHolder suitabilityFooterViewHolder, View view) {
            this.IconCompatParcelizer = suitabilityFooterViewHolder;
            suitabilityFooterViewHolder.nextButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_next, "field 'nextButton'", Button.class);
        }

        public final void read() {
            SuitabilityFooterViewHolder suitabilityFooterViewHolder = this.IconCompatParcelizer;
            if (suitabilityFooterViewHolder != null) {
                this.IconCompatParcelizer = null;
                suitabilityFooterViewHolder.nextButton = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class SuitabilityHeaderViewHolder_ViewBinding implements Unbinder {
        private SuitabilityHeaderViewHolder write;

        public SuitabilityHeaderViewHolder_ViewBinding(SuitabilityHeaderViewHolder suitabilityHeaderViewHolder, View view) {
            this.write = suitabilityHeaderViewHolder;
            suitabilityHeaderViewHolder.tvSubtitle1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_subtitle_1, "field 'tvSubtitle1'", TextView.class);
            suitabilityHeaderViewHolder.tvSubtitle2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_subtitle_2, "field 'tvSubtitle2'", TextView.class);
        }

        public final void read() {
            SuitabilityHeaderViewHolder suitabilityHeaderViewHolder = this.write;
            if (suitabilityHeaderViewHolder != null) {
                this.write = null;
                suitabilityHeaderViewHolder.tvSubtitle1 = null;
                suitabilityHeaderViewHolder.tvSubtitle2 = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class SuitabilitySectionViewHolder_ViewBinding implements Unbinder {
        private SuitabilitySectionViewHolder MediaBrowserCompat$ItemReceiver;

        public SuitabilitySectionViewHolder_ViewBinding(SuitabilitySectionViewHolder suitabilitySectionViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = suitabilitySectionViewHolder;
            suitabilitySectionViewHolder.section = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_section_title, "field 'section'", TextView.class);
        }

        public final void read() {
            SuitabilitySectionViewHolder suitabilitySectionViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (suitabilitySectionViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                suitabilitySectionViewHolder.section = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class SuitabilityItemViewHolder_ViewBinding implements Unbinder {
        private SuitabilityItemViewHolder IconCompatParcelizer;

        public SuitabilityItemViewHolder_ViewBinding(SuitabilityItemViewHolder suitabilityItemViewHolder, View view) {
            this.IconCompatParcelizer = suitabilityItemViewHolder;
            suitabilityItemViewHolder.tvQuestionTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_question_title, "field 'tvQuestionTitle'", TextView.class);
            suitabilityItemViewHolder.rgAnswer = (RadioGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rg_answer, "field 'rgAnswer'", RadioGroup.class);
        }

        public final void read() {
            SuitabilityItemViewHolder suitabilityItemViewHolder = this.IconCompatParcelizer;
            if (suitabilityItemViewHolder != null) {
                this.IconCompatParcelizer = null;
                suitabilityItemViewHolder.tvQuestionTitle = null;
                suitabilityItemViewHolder.rgAnswer = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ((C5768xbcc7b6dd) setcontentview).write(this.read, i);
    }

    public SuitabilityAssessmentAdapter(finalizeSessionWithNativeEvent finalizesessionwithnativeevent, SuitabilityAssessmentAdapter$MediaBrowserCompat$ItemReceiver suitabilityAssessmentAdapter$MediaBrowserCompat$ItemReceiver) {
        this.read = finalizesessionwithnativeevent;
        this.MediaBrowserCompat$ItemReceiver = suitabilityAssessmentAdapter$MediaBrowserCompat$ItemReceiver;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        boolean z = false;
        if (i == 0) {
            return 0;
        }
        if (i == IconCompatParcelizer() - 1) {
            return 3;
        }
        int i2 = i - 1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 < this.read.MediaBrowserCompat$ItemReceiver.size()) {
                if (i2 < this.read.MediaBrowserCompat$ItemReceiver.get(i3).write.size() + i4 && i2 == i4) {
                    z = true;
                    break;
                }
                i4 += this.read.MediaBrowserCompat$ItemReceiver.get(i3).write.size() + 1;
                i3++;
            } else {
                break;
            }
        }
        if (z) {
            return 1;
        }
        return 2;
    }

    public final int IconCompatParcelizer() {
        int size = this.read.MediaBrowserCompat$ItemReceiver.size() + 2;
        int[] iArr = new int[1];
        show show = new show(this.read.MediaBrowserCompat$ItemReceiver);
        getVerification getverification = new getVerification(iArr);
        while (show.IconCompatParcelizer.hasNext()) {
            getverification.MediaBrowserCompat$ItemReceiver(show.IconCompatParcelizer.next());
        }
        return size + iArr[0];
    }

    public static /* synthetic */ void IconCompatParcelizer(int[] iArr, persistNonFatalEvent persistnonfatalevent) {
        iArr[0] = iArr[0] + persistnonfatalevent.write.size();
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        for (persistNonFatalEvent persistnonfatalevent : this.read.MediaBrowserCompat$ItemReceiver) {
            Iterator<getSortedCustomAttributes> it = persistnonfatalevent.write.iterator();
            while (true) {
                if (it.hasNext()) {
                    boolean z = false;
                    for (onReportSendComplete onreportsendcomplete : it.next().read) {
                        if (onreportsendcomplete.MediaBrowserCompat$ItemReceiver) {
                            z = true;
                        }
                    }
                    if (!z) {
                        if (this.read.read) {
                            this.read.read = false;
                            radioGroup.post(new getCreditCard(this));
                            return;
                        }
                        return;
                    }
                }
            }
        }
        if (!this.read.read) {
            this.read.read = true;
            radioGroup.post(new getConfirmation(this));
        }
    }

    public static class SuitabilityHeaderViewHolder extends C5768xbcc7b6dd {
        @BindView
        TextView tvSubtitle1;
        @BindView
        TextView tvSubtitle2;

        SuitabilityHeaderViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }

        public final void write(finalizeSessionWithNativeEvent finalizesessionwithnativeevent, int i) {
            super.write(finalizesessionwithnativeevent, i);
            List<persistNonFatalEvent> list = finalizesessionwithnativeevent.MediaBrowserCompat$ItemReceiver;
            if (list.size() <= 0) {
                return;
            }
            if (2 == list.get(0).MediaBrowserCompat$ItemReceiver) {
                this.tvSubtitle1.setVisibility(0);
                this.tvSubtitle2.setVisibility(8);
                this.tvSubtitle1.setText(R.string.scbs_questions_subtitle_section2_1);
                return;
            }
            this.tvSubtitle1.setVisibility(0);
            this.tvSubtitle2.setVisibility(0);
            this.tvSubtitle1.setText(R.string.scbs_questions_subtitle_section1_1);
            this.tvSubtitle2.setText(R.string.scbs_questions_subtitle_section1_2);
        }
    }

    public static class SuitabilitySectionViewHolder extends C5768xbcc7b6dd {
        @BindView
        TextView section;

        SuitabilitySectionViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }

        public final void write(finalizeSessionWithNativeEvent finalizesessionwithnativeevent, int i) {
            String str;
            super.write(finalizesessionwithnativeevent, i);
            TextView textView = this.section;
            Context context = textView.getContext();
            Object[] objArr = new Object[1];
            int i2 = i - 1;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 < finalizesessionwithnativeevent.MediaBrowserCompat$ItemReceiver.size()) {
                    if (i2 < finalizesessionwithnativeevent.MediaBrowserCompat$ItemReceiver.get(i3).write.size() + i4 && i2 == i4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(finalizesessionwithnativeevent.MediaBrowserCompat$ItemReceiver.get(i3).MediaBrowserCompat$ItemReceiver);
                        str = sb.toString();
                        break;
                    }
                    i4 += finalizesessionwithnativeevent.MediaBrowserCompat$ItemReceiver.get(i3).write.size() + 1;
                    i3++;
                } else {
                    str = "";
                    break;
                }
            }
            objArr[0] = str;
            textView.setText(context.getString(R.string.section, objArr));
        }
    }

    public static class SuitabilityFooterViewHolder extends C5768xbcc7b6dd {
        @BindView
        Button nextButton;
        public finalizeSessionWithNativeEvent setHasDecor;

        SuitabilityFooterViewHolder(View view, SuitabilityAssessmentAdapter$MediaBrowserCompat$ItemReceiver suitabilityAssessmentAdapter$MediaBrowserCompat$ItemReceiver) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.nextButton.setOnClickListener(new ChubbService(this, suitabilityAssessmentAdapter$MediaBrowserCompat$ItemReceiver));
        }

        public final void write(finalizeSessionWithNativeEvent finalizesessionwithnativeevent, int i) {
            super.write(finalizesessionwithnativeevent, i);
            this.setHasDecor = finalizesessionwithnativeevent;
            this.nextButton.setEnabled(finalizesessionwithnativeevent.read);
        }
    }

    public static class SuitabilityItemViewHolder extends C5768xbcc7b6dd {
        @BindView
        RadioGroup rgAnswer;
        @BindView
        TextView tvQuestionTitle;

        SuitabilityItemViewHolder(View view, RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.rgAnswer.setOnCheckedChangeListener(onCheckedChangeListener);
        }

        public final void write(finalizeSessionWithNativeEvent finalizesessionwithnativeevent, int i) {
            getSortedCustomAttributes getsortedcustomattributes;
            super.write(finalizesessionwithnativeevent, i);
            int i2 = i - 1;
            int i3 = 0;
            int i4 = 1;
            while (true) {
                if (i3 >= finalizesessionwithnativeevent.MediaBrowserCompat$ItemReceiver.size()) {
                    getsortedcustomattributes = null;
                    break;
                } else if (i2 < finalizesessionwithnativeevent.MediaBrowserCompat$ItemReceiver.get(i3).write.size() + i4) {
                    getsortedcustomattributes = finalizesessionwithnativeevent.MediaBrowserCompat$ItemReceiver.get(i3).write.get(i2 - i4);
                    break;
                } else {
                    i4 += finalizesessionwithnativeevent.MediaBrowserCompat$ItemReceiver.get(i3).write.size() + 1;
                    i3++;
                }
            }
            if (getsortedcustomattributes != null) {
                this.tvQuestionTitle.setText(getsortedcustomattributes.MediaBrowserCompat$CustomActionResultReceiver);
                List<onReportSendComplete> list = getsortedcustomattributes.read;
                this.rgAnswer.removeAllViews();
                for (onReportSendComplete next : list) {
                    RadioButton radioButton = (RadioButton) LayoutInflater.from(this.rgAnswer.getContext()).inflate(R.layout.f91012131494328, (ViewGroup) null);
                    radioButton.setText(next.write);
                    this.rgAnswer.addView(radioButton);
                    if (next.MediaBrowserCompat$ItemReceiver) {
                        this.rgAnswer.check(radioButton.getId());
                    }
                    radioButton.setOnCheckedChangeListener(new chubbConfirm(list, next));
                }
            }
        }

        public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(List list, onReportSendComplete onreportsendcomplete, boolean z) {
            if (z) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((onReportSendComplete) it.next()).MediaBrowserCompat$ItemReceiver = false;
                }
                onreportsendcomplete.MediaBrowserCompat$ItemReceiver = true;
            }
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new SuitabilityHeaderViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f91892131494416, viewGroup, false));
        }
        if (i == 3) {
            return new SuitabilityFooterViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f91882131494415, viewGroup, false), this.MediaBrowserCompat$ItemReceiver);
        }
        if (i == 1) {
            return new SuitabilitySectionViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f91912131494418, viewGroup, false));
        }
        return new SuitabilityItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f91902131494417, viewGroup, false), this);
    }
}
