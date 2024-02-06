package p040o;

import android.content.SharedPreferences;
import com.scb.phone.data.p033di.RepositoryModule;
import p040o.AccountPicker;
import p040o.ClearcutLogger;
import p040o.getObject;

/* renamed from: o.getPageTitle */
public final class getPageTitle implements OPRStatusRewardsLandingActivity_ViewBinding<newLocalProjectProvider> {
    private final HmlReviewDocumentActivity<AccountPicker> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<ClearcutLogger> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<C4943log> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<ClearcutLogger.zzc> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<newChooseAccountIntent> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<AccountPicker.AccountChooserOptions.Builder> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<setSelectedAccount> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<SharedPreferences> MediaSessionCompat$QueueItem;
    private final RepositoryModule MediaSessionCompat$Token;
    private final HmlReviewDocumentActivity<setAllowableAccountsTypes> RatingCompat;
    private final HmlReviewDocumentActivity<anonymousLogger> read;
    private final HmlReviewDocumentActivity<getObject.read> write;

    private getPageTitle(RepositoryModule repositoryModule, HmlReviewDocumentActivity<getObject.read> hmlReviewDocumentActivity, HmlReviewDocumentActivity<ClearcutLogger> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<setSelectedAccount> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<anonymousLogger> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<setAllowableAccountsTypes> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<newChooseAccountIntent> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C4943log> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<AccountPicker> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<AccountPicker.AccountChooserOptions.Builder> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<ClearcutLogger.zzc> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity11) {
        this.MediaSessionCompat$Token = repositoryModule;
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.MediaMetadataCompat = hmlReviewDocumentActivity3;
        this.read = hmlReviewDocumentActivity4;
        this.RatingCompat = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity6;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity7;
        this.IconCompatParcelizer = hmlReviewDocumentActivity8;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity9;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity10;
        this.MediaSessionCompat$QueueItem = hmlReviewDocumentActivity11;
    }

    public static getPageTitle write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<getObject.read> hmlReviewDocumentActivity, HmlReviewDocumentActivity<ClearcutLogger> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<setSelectedAccount> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<anonymousLogger> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<setAllowableAccountsTypes> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<newChooseAccountIntent> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C4943log> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<AccountPicker> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<AccountPicker.AccountChooserOptions.Builder> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<ClearcutLogger.zzc> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity11) {
        return new getPageTitle(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9, hmlReviewDocumentActivity10, hmlReviewDocumentActivity11);
    }

    public final /* synthetic */ Object get() {
        newLocalProjectProvider write2 = this.MediaSessionCompat$Token.write(this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaMetadataCompat.get(), this.read.get(), this.RatingCompat.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get(), this.MediaDescriptionCompat.get(), this.MediaBrowserCompat$MediaItem.get(), this.MediaSessionCompat$QueueItem.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
