package p040o;

import com.scb.phone.presentation.presenter.investment.accountdetail.ScbsAccountDetailPresenter;
import com.scb.phone.view.fragment.investment.scbs.ScbsAccountDetailFragment;
import p040o.TabParser$TabParserException;

/* renamed from: o.ActivityBuilder_BindRewardsHomeActivity */
public final /* synthetic */ class ActivityBuilder_BindRewardsHomeActivity implements TabParser$TabParserException.read {
    private final /* synthetic */ ScbsAccountDetailFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_BindRewardsHomeActivity(ScbsAccountDetailFragment scbsAccountDetailFragment) {
        this.IconCompatParcelizer = scbsAccountDetailFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        getMarkerFile getmarkerfile = (getMarkerFile) obj;
        ScbsAccountDetailPresenter scbsAccountDetailPresenter = this.IconCompatParcelizer.scbsAccountDetailPresenter;
        setAdditionalMetadata setadditionalmetadata = new setAdditionalMetadata(new valueOrNull(getmarkerfile.MediaBrowserCompat$SearchResultReceiver, getmarkerfile.read, getmarkerfile.MediaBrowserCompat$CustomActionResultReceiver, getmarkerfile.IconCompatParcelizer, getmarkerfile.MediaBrowserCompat$ItemReceiver, getmarkerfile.MediaBrowserCompat$MediaItem, scbsAccountDetailPresenter.read.MediaMetadataCompat, scbsAccountDetailPresenter.read.ParcelableVolumeInfo, scbsAccountDetailPresenter.read.Keep, getmarkerfile.write));
        if (scbsAccountDetailPresenter.RatingCompat != null) {
            setadditionalmetadata.IconCompatParcelizer(scbsAccountDetailPresenter.RatingCompat);
        }
    }
}
