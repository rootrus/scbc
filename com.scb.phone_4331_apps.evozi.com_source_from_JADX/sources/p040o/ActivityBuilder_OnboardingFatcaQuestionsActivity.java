package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.transferandpay.cardlessatm.CardlessSuccessfulRequestFragment;
import p040o.setExtract;

/* renamed from: o.ActivityBuilder_OnboardingFatcaQuestionsActivity */
public final /* synthetic */ class ActivityBuilder_OnboardingFatcaQuestionsActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ CardlessSuccessfulRequestFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_OnboardingFatcaQuestionsActivity(CardlessSuccessfulRequestFragment cardlessSuccessfulRequestFragment) {
        this.MediaBrowserCompat$ItemReceiver = cardlessSuccessfulRequestFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        setExtract setextract = this.MediaBrowserCompat$ItemReceiver.cardlessATMSuccesfulRequestPresenter;
        if (setextract.RatingCompat != null) {
            setextract.RatingCompat.AlertController$RecycleListView();
        }
        setextract.IconCompatParcelizer.read(new asFunction(setextract.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver));
        setextract.IconCompatParcelizer.IconCompatParcelizer(new setExtract.write(setextract, (byte) 0));
    }
}
