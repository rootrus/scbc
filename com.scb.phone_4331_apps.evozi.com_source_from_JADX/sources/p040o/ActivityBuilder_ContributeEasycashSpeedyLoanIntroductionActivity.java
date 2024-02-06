package p040o;

import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.mwpartner.MwEditCreateQrFragment;

/* renamed from: o.ActivityBuilder_ContributeEasycashSpeedyLoanIntroductionActivity */
public final /* synthetic */ class ActivityBuilder_ContributeEasycashSpeedyLoanIntroductionActivity implements NoteEditText.IconCompatParcelizer {
    private final /* synthetic */ MwEditCreateQrFragment write;

    public /* synthetic */ ActivityBuilder_ContributeEasycashSpeedyLoanIntroductionActivity(MwEditCreateQrFragment mwEditCreateQrFragment) {
        this.write = mwEditCreateQrFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        MwEditCreateQrFragment mwEditCreateQrFragment = this.write;
        removeOnTaskCompletedListener removeontaskcompletedlistener = mwEditCreateQrFragment.presenter;
        boolean z2 = false;
        removeontaskcompletedlistener.MediaBrowserCompat$SearchResultReceiver = mwEditCreateQrFragment.shopReference.mNoteEditText.getText().toString().length() == 0 || z;
        countRows countrows = new countRows(removeontaskcompletedlistener);
        if (removeontaskcompletedlistener.RatingCompat != null) {
            z2 = true;
        }
        if (z2) {
            countrows.IconCompatParcelizer(removeontaskcompletedlistener.RatingCompat);
        }
    }
}
