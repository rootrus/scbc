package p040o;

import android.view.View;
import com.scb.phone.view.adapter.investment.onboarding.SelectableChoiceAdapter;
import com.scb.phone.view.adapter.investment.onboarding.SelectableChoiceAdapter$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.getStatementCurrentChannel */
public final /* synthetic */ class getStatementCurrentChannel implements View.OnClickListener {
    private final /* synthetic */ SelectableChoiceAdapter$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ SelectableChoiceAdapter.ChoiceHolder MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getStatementCurrentChannel(SelectableChoiceAdapter.ChoiceHolder choiceHolder, SelectableChoiceAdapter$MediaBrowserCompat$ItemReceiver selectableChoiceAdapter$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$ItemReceiver = choiceHolder;
        this.MediaBrowserCompat$CustomActionResultReceiver = selectableChoiceAdapter$MediaBrowserCompat$ItemReceiver;
    }

    public final void onClick(View view) {
        SelectableChoiceAdapter.ChoiceHolder choiceHolder = this.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(choiceHolder, choiceHolder.PlaybackStateCompat);
    }
}
