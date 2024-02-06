package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;
import p040o.Auth;
import p040o.FragmentBuilder_BindSCBSRiskLevelFragment;
import p040o.LottieAnimationView;

/* renamed from: o.IFragmentWrapper */
public final /* synthetic */ class IFragmentWrapper implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ IFragmentWrapper MediaBrowserCompat$ItemReceiver = new IFragmentWrapper();

    private /* synthetic */ IFragmentWrapper() {
    }

    public final Object write(Object obj) {
        return (encodedFragment) ((SingleDataEntity) obj).getData();
    }

    /* renamed from: o.IFragmentWrapper$Stub */
    public final /* synthetic */ class Stub implements DirectDebitDeepLinkActivity {
        public /* synthetic */ Stub(Auth.AuthCredentialsOptions authCredentialsOptions) {
        }

        public final Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "entity");
            String str = ((LottieAnimationView.C12344) singleDataEntity.getData()).ParcelableVolumeInfo;
            String str2 = ((LottieAnimationView.C12344) singleDataEntity.getData()).IconCompatParcelizer;
            String str3 = ((LottieAnimationView.C12344) singleDataEntity.getData()).MediaBrowserCompat$ItemReceiver;
            String str4 = ((LottieAnimationView.C12344) singleDataEntity.getData()).read;
            double parseDouble = Double.parseDouble(((LottieAnimationView.C12344) singleDataEntity.getData()).MediaDescriptionCompat);
            double parseDouble2 = Double.parseDouble(((LottieAnimationView.C12344) singleDataEntity.getData()).write);
            double parseDouble3 = Double.parseDouble(((LottieAnimationView.C12344) singleDataEntity.getData()).MediaMetadataCompat);
            double parseDouble4 = Double.parseDouble(((LottieAnimationView.C12344) singleDataEntity.getData()).MediaBrowserCompat$SearchResultReceiver);
            List<String> list = ((LottieAnimationView.C12344) singleDataEntity.getData()).MediaBrowserCompat$MediaItem;
            String str5 = ((LottieAnimationView.C12344) singleDataEntity.getData()).MediaSessionCompat$QueueItem;
            String str6 = ((LottieAnimationView.C12344) singleDataEntity.getData()).RatingCompat;
            String str7 = ((LottieAnimationView.C12344) singleDataEntity.getData()).MediaBrowserCompat$CustomActionResultReceiver;
            setOnPageChangeListener status = singleDataEntity.getStatus();
            onGetStartedClick.IconCompatParcelizer((Object) status, "entity.status");
            boolean MediaBrowserCompat$ItemReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "9003", (Object) status.write());
            setOnPageChangeListener status2 = singleDataEntity.getStatus();
            onGetStartedClick.IconCompatParcelizer((Object) status2, "entity.status");
            String MediaBrowserCompat$ItemReceiver2 = status2.MediaBrowserCompat$ItemReceiver();
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "entity.status.header");
            setOnPageChangeListener status3 = singleDataEntity.getStatus();
            onGetStartedClick.IconCompatParcelizer((Object) status3, "entity.status");
            String IconCompatParcelizer = status3.IconCompatParcelizer();
            onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "entity.status.description");
            return new setStrokePattern(str, str2, str3, str4, parseDouble, parseDouble2, parseDouble3, parseDouble4, list, str5, str6, str7, MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver2, IconCompatParcelizer);
        }

        /* renamed from: o.IFragmentWrapper$Stub$zza */
        public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
            private final /* synthetic */ FragmentBuilder_BindSCBSRiskLevelFragment.read write;

            public /* synthetic */ zza(FragmentBuilder_BindSCBSRiskLevelFragment.read read) {
                this.write = read;
            }

            public final Object write(Object obj) {
                return DebitCardResetOtpActivity.just(zabl.read((SingleDataEntity) obj));
            }
        }
    }
}
