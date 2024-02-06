package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.friends.FriendsService;
import p040o.zzca;

/* renamed from: o.zzha */
public final class zzha implements tailSet {
    private final FriendsService read;

    /* renamed from: o.zzha$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "singleData");
            getTransformationMatrix gettransformationmatrix = (getTransformationMatrix) singleDataEntity.getData();
            return new zzca.zzc(gettransformationmatrix.MediaBrowserCompat$CustomActionResultReceiver, gettransformationmatrix.write, gettransformationmatrix.MediaBrowserCompat$ItemReceiver, gettransformationmatrix.read);
        }
    }

    @HmlPinActivity
    public zzha(FriendsService friendsService) {
        onGetStartedClick.write((Object) friendsService, "service");
        this.read = friendsService;
    }

    public final BScanCNotificationDeepLinkActivity<zzca.zzc> IconCompatParcelizer() {
        BScanCNotificationDeepLinkActivity<SingleDataEntity<getTransformationMatrix>> inviteFriendsInfo = this.read.getInviteFriendsInfo();
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = IconCompatParcelizer.write;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(inviteFriendsInfo, directDebitDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "service.getInviteFriends…ansformFriendsLanding() }");
        return oncopy;
    }
}
