package p040o;

import kotlin.NoWhenBranchMatchedException;
import p040o.setContentDescription;
import p040o.zzct;
import p040o.zzfy;

/* renamed from: o.AppBarLayout */
public final class AppBarLayout extends IndoorBuilding {
    private final IdRegion MediaBrowserCompat$CustomActionResultReceiver;
    private final refreshIfEmpty read;
    final getAncestor write;

    /* renamed from: o.AppBarLayout$BaseBehavior */
    public final /* synthetic */ class BaseBehavior {
        public static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        static {
            int[] iArr = new int[zzct.zza.values().length];
            MediaBrowserCompat$ItemReceiver = iArr;
            iArr[zzct.zza.CONSUMER.ordinal()] = 1;
            MediaBrowserCompat$ItemReceiver[zzct.zza.BUSINESS_OWNER.ordinal()] = 2;
        }
    }

    /* renamed from: o.AppBarLayout$Behavior */
    public final /* synthetic */ class Behavior {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[zzct.zza.values().length];
            IconCompatParcelizer = iArr;
            iArr[zzct.zza.CONSUMER.ordinal()] = 1;
            IconCompatParcelizer[zzct.zza.BUSINESS_OWNER.ordinal()] = 2;
        }
    }

    /* renamed from: o.AppBarLayout$read */
    static final class read<T, R> implements DirectDebitDeepLinkActivity<T, DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> {
        private /* synthetic */ AppBarLayout MediaBrowserCompat$ItemReceiver;

        read(AppBarLayout appBarLayout) {
            this.MediaBrowserCompat$ItemReceiver = appBarLayout;
        }

        public final /* synthetic */ Object write(Object obj) {
            zzfy.zzf zzf = (zzfy.zzf) obj;
            onGetStartedClick.write((Object) zzf, "it");
            DebitCardCoachMarkActivity AlertController$RecycleListView = this.MediaBrowserCompat$ItemReceiver.write.AlertController$RecycleListView(zzf.MediaBrowserCompat$CustomActionResultReceiver);
            HmlLatestPersonalInformationDeepLinkActivity.write(zzf, "completionValue is null");
            return new FriendsLandingActivity_ViewBinding(new RtpDeepLinkActivity(AlertController$RecycleListView, zzf));
        }
    }

    /* renamed from: o.AppBarLayout$ScrollingViewBehavior */
    public final class ScrollingViewBehavior extends IndoorBuilding {
        private final getAncestor MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public ScrollingViewBehavior(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getAncestor getancestor) {
            super(closeAccountReviewActivity, closeAccountReviewActivity2);
            onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
            onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
            onGetStartedClick.write((Object) getancestor, "hmlRepositoryContractor");
            this.MediaBrowserCompat$CustomActionResultReceiver = getancestor;
        }

        public final DebitCardResetOtpActivity<isSupportFragmentClass<setContentDescription>> IconCompatParcelizer(setContentDescription.write write) {
            isSupportFragmentClass issupportfragmentclass;
            onGetStartedClick.write((Object) write, "type");
            setContentDescription MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(write);
            if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                issupportfragmentclass = isSupportFragmentClass.read(MediaBrowserCompat$CustomActionResultReceiver2);
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            DebitCardResetOtpActivity<isSupportFragmentClass<setContentDescription>> just = DebitCardResetOtpActivity.just(issupportfragmentclass);
            write(just);
            onGetStartedClick.IconCompatParcelizer((Object) just, "Observable.just(\n       … withObservable(it)\n    }");
            return just;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public AppBarLayout(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, IdRegion idRegion, getAncestor getancestor, refreshIfEmpty refreshifempty) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) idRegion, "repositoryContractor");
        onGetStartedClick.write((Object) getancestor, "hmlRepositoryContractor");
        onGetStartedClick.write((Object) refreshifempty, "hmlBusinessOwnerRepositoryContractor");
        this.MediaBrowserCompat$CustomActionResultReceiver = idRegion;
        this.write = getancestor;
        this.read = refreshifempty;
    }

    public final DebitCardResetOtpActivity<zzfy.zzf> read(String str) {
        DebitCardResetOtpActivity<zzfy.zzf> debitCardResetOtpActivity;
        int i = Behavior.IconCompatParcelizer[this.read.MediaBrowserCompat$SearchResultReceiver().ordinal()];
        if (i == 1) {
            debitCardResetOtpActivity = this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo(str);
        } else if (i == 2) {
            debitCardResetOtpActivity = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem(str);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        DebitCardResetOtpActivity<R> flatMap = debitCardResetOtpActivity.flatMap(new read(this));
        write(flatMap);
        onGetStartedClick.IconCompatParcelizer((Object) flatMap, "when (hmlBusinessOwnerRe…ervable(it)\n            }");
        return flatMap;
    }
}
