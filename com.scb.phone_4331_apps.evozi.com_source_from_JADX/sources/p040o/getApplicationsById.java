package p040o;

import com.scb.phone.R;
import com.scb.phone.view.adapter.limit.PersonalLimitAdapter;
import com.scb.phone.view.custom.common.CustomDeltaInput;

/* renamed from: o.getApplicationsById */
public final /* synthetic */ class getApplicationsById implements CustomDeltaInput.read {
    private final /* synthetic */ PersonalLimitAdapter.LimitCustomViewHolder IconCompatParcelizer;
    private final /* synthetic */ expandIfNecessary MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getApplicationsById(PersonalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder, expandIfNecessary expandifnecessary) {
        this.IconCompatParcelizer = limitCustomViewHolder;
        this.MediaBrowserCompat$CustomActionResultReceiver = expandifnecessary;
    }

    public final void write(double d, boolean z) {
        PersonalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder = this.IconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = true;
        limitCustomViewHolder.limitDoneTextButton.setEnabled(z);
        if (limitCustomViewHolder.write.getContext() != null) {
            limitCustomViewHolder.limitDoneTextButton.setTextColor(setLastBaselineToBottomHeight.read(limitCustomViewHolder.write.getContext(), z ? R.color.f67252131099881 : R.color.f67262131099882));
        }
    }
}
