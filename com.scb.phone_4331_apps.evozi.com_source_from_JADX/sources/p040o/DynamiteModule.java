package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.prepaid.traveltab.PrepaidTravelServicesTabFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.FragmentBuilder_BindSuccessQuickOperationFragment;
import p040o.GeoDataClient;
import p040o.getTextLines;

/* renamed from: o.DynamiteModule */
public final /* synthetic */ class DynamiteModule implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindSuccessQuickOperationFragment.IconCompatParcelizer read;

    public /* synthetic */ DynamiteModule(FragmentBuilder_BindSuccessQuickOperationFragment.IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        zabj zabj = this.read.read;
        SchedulingModule schedulingModule = (SchedulingModule) ((SingleDataEntity) obj).getData();
        return DebitCardResetOtpActivity.just(new PrepaidTravelServicesTabFragment.write(zabj.MediaBrowserCompat$CustomActionResultReceiver(schedulingModule.write), zabj.MediaBrowserCompat$CustomActionResultReceiver(schedulingModule.read), zabj.MediaBrowserCompat$CustomActionResultReceiver(schedulingModule.IconCompatParcelizer), zabj.IconCompatParcelizer(schedulingModule.MediaBrowserCompat$ItemReceiver)));
    }

    /* renamed from: o.DynamiteModule$DynamiteLoaderClassLoader */
    public final /* synthetic */ class DynamiteLoaderClassLoader implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ FragmentBuilder_BindSuccessQuickOperationFragment.IconCompatParcelizer write;

        public /* synthetic */ DynamiteLoaderClassLoader(FragmentBuilder_BindSuccessQuickOperationFragment.IconCompatParcelizer iconCompatParcelizer) {
            this.write = iconCompatParcelizer;
        }

        public final Object write(Object obj) {
            return DebitCardResetOtpActivity.just(this.write.read.MediaBrowserCompat$CustomActionResultReceiver(((TimeModule) obj).write));
        }
    }

    /* renamed from: o.DynamiteModule$LoadingException */
    public final /* synthetic */ class LoadingException implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ FragmentBuilder_BindSummaryFragment MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ LoadingException(FragmentBuilder_BindSummaryFragment fragmentBuilder_BindSummaryFragment) {
            this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindSummaryFragment;
        }

        public final Object write(Object obj) {
            tempExtension tempextension = (tempExtension) ((SingleDataEntity) obj).getData();
            onGetStartedClick.write((Object) tempextension, "scbsOnboardingProductCatalogEntity");
            return DebitCardResetOtpActivity.just(new getPhoto(tempextension.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }

    /* renamed from: o.DynamiteModule$zza */
    public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
        public static final /* synthetic */ zza MediaBrowserCompat$ItemReceiver = new zza();

        private /* synthetic */ zza() {
        }

        public final Object write(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* renamed from: o.DynamiteModule$VersionPolicy */
    public final /* synthetic */ class VersionPolicy implements DirectDebitDeepLinkActivity {
        public static final /* synthetic */ VersionPolicy write = new VersionPolicy();

        private /* synthetic */ VersionPolicy() {
        }

        /* renamed from: o.DynamiteModule$VersionPolicy$zza */
        public final /* synthetic */ class zza implements DebitCardMarketConductDeepLinkActivity {
            private final /* synthetic */ FragmentBuilder_BindSummaryFragment IconCompatParcelizer;

            public /* synthetic */ zza(FragmentBuilder_BindSummaryFragment fragmentBuilder_BindSummaryFragment) {
                this.IconCompatParcelizer = fragmentBuilder_BindSummaryFragment;
            }

            public final void IconCompatParcelizer(Object obj) {
                this.IconCompatParcelizer.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver = ((AdvertisingIdClient) ((SingleDataEntity) obj).getData()).IconCompatParcelizer;
            }
        }

        /* renamed from: o.DynamiteModule$VersionPolicy$zzb */
        public final /* synthetic */ class zzb implements DirectDebitDeepLinkActivity {
            public static final /* synthetic */ zzb MediaBrowserCompat$CustomActionResultReceiver = new zzb();

            private /* synthetic */ zzb() {
            }

            public final Object write(Object obj) {
                Iterable<getTextLines.IconCompatParcelizer> iterable = ((getTextLines) ((SingleDataEntity) obj).getData()).MediaBrowserCompat$CustomActionResultReceiver;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
                for (getTextLines.IconCompatParcelizer iconCompatParcelizer : iterable) {
                    arrayList.add(new GeoDataClient.read(iconCompatParcelizer.write, iconCompatParcelizer.read));
                }
                return new GeoDataClient((List) arrayList);
            }
        }

        public final Object write(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* renamed from: o.DynamiteModule$zzb */
    public final /* synthetic */ class zzb implements DirectDebitDeepLinkActivity {
        public static final /* synthetic */ zzb read = new zzb();

        private /* synthetic */ zzb() {
        }

        public final Object write(Object obj) {
            return Boolean.TRUE;
        }
    }
}
