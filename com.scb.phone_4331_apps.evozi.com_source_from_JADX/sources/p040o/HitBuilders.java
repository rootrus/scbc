package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.C1251R;
import p040o.StreetViewPanoramaFragment;

/* renamed from: o.HitBuilders */
public final class HitBuilders extends FragmentBuilder_BindSummaryFragment {
    private final onActivityStopped MediaBrowserCompat$CustomActionResultReceiver = new onActivityStopped();

    /* renamed from: o.HitBuilders$TransactionBuilder */
    public final class TransactionBuilder extends FragmentBuilder_BindSummaryFragment {
    }

    /* renamed from: o.HitBuilders$AppViewBuilder */
    public final class AppViewBuilder implements OPRStatusRewardsLandingActivity_ViewBinding<HitBuilders> {
        private static final AppViewBuilder MediaBrowserCompat$ItemReceiver = new AppViewBuilder();

        public static AppViewBuilder MediaBrowserCompat$ItemReceiver() {
            return MediaBrowserCompat$ItemReceiver;
        }

        public final /* synthetic */ Object get() {
            return new HitBuilders();
        }
    }

    /* renamed from: o.HitBuilders$EventBuilder */
    public final class EventBuilder implements OPRStatusRewardsLandingActivity_ViewBinding<setLabel> {
        private static final EventBuilder IconCompatParcelizer = new EventBuilder();

        public static EventBuilder MediaBrowserCompat$CustomActionResultReceiver() {
            return IconCompatParcelizer;
        }

        public final /* synthetic */ Object get() {
            return new setLabel();
        }
    }

    /* renamed from: o.HitBuilders$ExceptionBuilder */
    public final class ExceptionBuilder implements OPRStatusRewardsLandingActivity_ViewBinding<setAction> {
        private static final ExceptionBuilder MediaBrowserCompat$CustomActionResultReceiver = new ExceptionBuilder();

        public static ExceptionBuilder read() {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final /* synthetic */ Object get() {
            return new setAction();
        }
    }

    /* renamed from: o.HitBuilders$HitBuilder */
    public final class HitBuilder implements OPRStatusRewardsLandingActivity_ViewBinding<setFatal> {
        private static final HitBuilder MediaBrowserCompat$ItemReceiver = new HitBuilder();

        public static HitBuilder IconCompatParcelizer() {
            return MediaBrowserCompat$ItemReceiver;
        }

        public final /* synthetic */ Object get() {
            return new setFatal();
        }
    }

    /* renamed from: o.HitBuilders$ItemBuilder */
    public final class ItemBuilder implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindTransferInputAmountFragment> {
        private static final ItemBuilder MediaBrowserCompat$CustomActionResultReceiver = new ItemBuilder();

        public static ItemBuilder write() {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final /* synthetic */ Object get() {
            return new FragmentBuilder_BindTransferInputAmountFragment();
        }
    }

    /* renamed from: o.HitBuilders$ScreenViewBuilder */
    public final class ScreenViewBuilder implements OPRStatusRewardsLandingActivity_ViewBinding<setTarget> {
        private static final ScreenViewBuilder read = new ScreenViewBuilder();

        public static ScreenViewBuilder write() {
            return read;
        }

        public final /* synthetic */ Object get() {
            return new setTarget();
        }
    }

    /* renamed from: o.HitBuilders$SocialBuilder */
    public final class SocialBuilder implements OPRStatusRewardsLandingActivity_ViewBinding<setTransactionId> {
        private static final SocialBuilder MediaBrowserCompat$ItemReceiver = new SocialBuilder();

        public static SocialBuilder read() {
            return MediaBrowserCompat$ItemReceiver;
        }

        public final /* synthetic */ Object get() {
            return new setTransactionId();
        }
    }

    /* renamed from: o.HitBuilders$TimingBuilder */
    public final class TimingBuilder implements OPRStatusRewardsLandingActivity_ViewBinding<TransactionBuilder> {
        private static final TimingBuilder MediaBrowserCompat$ItemReceiver = new TimingBuilder();

        public static TimingBuilder MediaBrowserCompat$ItemReceiver() {
            return MediaBrowserCompat$ItemReceiver;
        }

        public final /* synthetic */ Object get() {
            return new TransactionBuilder();
        }
    }

    public final StreetViewPanoramaFragment.zza MediaBrowserCompat$CustomActionResultReceiver(C1251R.color color) {
        if (color == null) {
            StreetViewPanoramaFragment.zza MediaBrowserCompat$ItemReceiver = StreetViewPanoramaFragment.zza.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver.write = this.MediaBrowserCompat$CustomActionResultReceiver.write((List<C1251R.color>) new ArrayList());
            return MediaBrowserCompat$ItemReceiver;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(color);
        StreetViewPanoramaFragment.zza MediaBrowserCompat$ItemReceiver2 = StreetViewPanoramaFragment.zza.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver2.write = this.MediaBrowserCompat$CustomActionResultReceiver.write((List<C1251R.color>) arrayList);
        return MediaBrowserCompat$ItemReceiver2;
    }

    public final StreetViewPanoramaFragment.zza MediaBrowserCompat$CustomActionResultReceiver(C1251R.dimen dimen) {
        if (dimen == null || dimen.MediaBrowserCompat$ItemReceiver == null) {
            StreetViewPanoramaFragment.zza MediaBrowserCompat$ItemReceiver = StreetViewPanoramaFragment.zza.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver.write = this.MediaBrowserCompat$CustomActionResultReceiver.write((List<C1251R.color>) new ArrayList());
            return MediaBrowserCompat$ItemReceiver;
        }
        StreetViewPanoramaFragment.zza MediaBrowserCompat$ItemReceiver2 = StreetViewPanoramaFragment.zza.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver2.write = this.MediaBrowserCompat$CustomActionResultReceiver.write(dimen.MediaBrowserCompat$ItemReceiver);
        return MediaBrowserCompat$ItemReceiver2;
    }

    private static getStreetViewPanoramaCamera MediaBrowserCompat$ItemReceiver(C1251R.integer integer) {
        if (integer == null) {
            return null;
        }
        getStreetViewPanoramaCamera getstreetviewpanoramacamera = new getStreetViewPanoramaCamera();
        getstreetviewpanoramacamera.MediaBrowserCompat$ItemReceiver = integer.MediaBrowserCompat$CustomActionResultReceiver;
        getstreetviewpanoramacamera.read = integer.MediaBrowserCompat$ItemReceiver;
        return getstreetviewpanoramacamera;
    }

    public final getUserNavigationEnabled MediaBrowserCompat$ItemReceiver(C1251R.C1253id idVar) {
        getUserNavigationEnabled getusernavigationenabled = new getUserNavigationEnabled();
        if (idVar == null) {
            getusernavigationenabled.read = this.MediaBrowserCompat$CustomActionResultReceiver.write((List<C1251R.color>) new ArrayList());
            getusernavigationenabled.IconCompatParcelizer = null;
        } else if (idVar.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
            getusernavigationenabled.read = this.MediaBrowserCompat$CustomActionResultReceiver.write((List<C1251R.color>) new ArrayList());
            getusernavigationenabled.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver(idVar.read);
        } else {
            getusernavigationenabled.read = this.MediaBrowserCompat$CustomActionResultReceiver.write(idVar.MediaBrowserCompat$CustomActionResultReceiver);
            getusernavigationenabled.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver(idVar.read);
        }
        return getusernavigationenabled;
    }
}
