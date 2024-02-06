package p040o;

import com.scb.phone.view.adapter.investment.scbs.open.SuitabilityAssessmentAdapter$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.investment.scbs.open.SuitabilityQuestionsPart1Fragment;

/* renamed from: o.ActivityBuilder_BindTransferActivity */
public final /* synthetic */ class ActivityBuilder_BindTransferActivity implements SuitabilityAssessmentAdapter$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ SuitabilityQuestionsPart1Fragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_BindTransferActivity(SuitabilityQuestionsPart1Fragment suitabilityQuestionsPart1Fragment) {
        this.IconCompatParcelizer = suitabilityQuestionsPart1Fragment;
    }

    public final void IconCompatParcelizer(finalizeSessionWithNativeEvent finalizesessionwithnativeevent) {
        setCenterMessage setcentermessage = this.IconCompatParcelizer.presenter;
        setcentermessage.IconCompatParcelizer.read.MediaBrowserCompat$SearchResultReceiver(setcentermessage.read.read(finalizesessionwithnativeevent.MediaBrowserCompat$ItemReceiver));
        setFocused setfocused = setFocused.read;
        if (setcentermessage.RatingCompat != null) {
            setfocused.IconCompatParcelizer(setcentermessage.RatingCompat);
        }
    }
}
