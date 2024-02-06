package p040o;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.CameraSource;
import p040o.CommonUtils;
import p040o.Iterables;
import p040o.MultiProcessor;
import p040o.zzin;

/* renamed from: o.LinkedHashMultimap */
public final class LinkedHashMultimap extends Iterables.C35339 {
    public final CameraSource.zzc read;
    final NullsLastOrdering write;

    /* renamed from: o.LinkedHashMultimap$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<zzin.zzd, streamToString> {
        private /* synthetic */ LinkedHashMultimap IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(LinkedHashMultimap linkedHashMultimap) {
            super(1);
            this.IconCompatParcelizer = linkedHashMultimap;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List<clearConditionalUserProperty> write;
            List<beginAdUnitExposure> write2;
            String str;
            checkRunningOnThread checkrunningonthread;
            zzin.zzd zzd = (zzin.zzd) obj;
            onGetStartedClick.write((Object) zzd, "it");
            onGetStartedClick.write((Object) zzd, "easycashLoanInfo");
            List arrayList = new ArrayList();
            arrayList.add(new resolveUnityEditorVersion(zzd.write, zzd.IconCompatParcelizer));
            List<clearConditionalUserProperty> list = zzd.MediaBrowserCompat$CustomActionResultReceiver;
            if (!(list == null || (write = HmlNTBBusinessURLInformationActivity.write(list, new NullsLastOrdering$MediaBrowserCompat$ItemReceiver())) == null)) {
                for (clearConditionalUserProperty clearconditionaluserproperty : write) {
                    String str2 = clearconditionaluserproperty.MediaBrowserCompat$ItemReceiver;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = clearconditionaluserproperty.write;
                    if (str3 == null) {
                        str3 = "";
                    }
                    arrayList.add(new CrashlyticsBackgroundWorker(str2, str3));
                    List<beginAdUnitExposure> list2 = clearconditionaluserproperty.MediaBrowserCompat$CustomActionResultReceiver;
                    if (!(list2 == null || (write2 = HmlNTBBusinessURLInformationActivity.write(list2, new NullsLastOrdering$MediaBrowserCompat$CustomActionResultReceiver())) == null)) {
                        for (beginAdUnitExposure beginadunitexposure : write2) {
                            String str4 = beginadunitexposure.MediaBrowserCompat$SearchResultReceiver;
                            if (str4 == null) {
                                str = "";
                            } else {
                                str = str4;
                            }
                            String str5 = beginadunitexposure.write;
                            boolean MediaBrowserCompat$CustomActionResultReceiver = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(beginadunitexposure.read, DiskLruCache.VERSION_1, false);
                            Integer num = beginadunitexposure.MediaBrowserCompat$CustomActionResultReceiver;
                            Integer num2 = beginadunitexposure.MediaBrowserCompat$ItemReceiver;
                            if (num2 != null) {
                                if (num2.intValue() == 1) {
                                    checkrunningonthread = checkRunningOnThread.CHECK;
                                } else if (num2.intValue() == 2) {
                                    checkrunningonthread = checkRunningOnThread.ERROR;
                                } else if (num2.intValue() == 3) {
                                    checkrunningonthread = checkRunningOnThread.ALERT;
                                } else if (num2.intValue() == 4) {
                                    checkrunningonthread = checkRunningOnThread.CLOCK;
                                } else {
                                    checkrunningonthread = checkRunningOnThread.NONE;
                                }
                                if (checkrunningonthread != null) {
                                    arrayList.add(new CommonUtils.Architecture(str, str5, MediaBrowserCompat$CustomActionResultReceiver, num, checkrunningonthread));
                                }
                            }
                            checkrunningonthread = checkRunningOnThread.NONE;
                            arrayList.add(new CommonUtils.Architecture(str, str5, MediaBrowserCompat$CustomActionResultReceiver, num, checkrunningonthread));
                        }
                    }
                }
            }
            return new streamToString(arrayList);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public LinkedHashMultimap(CameraSource.zzc zzc, NullsLastOrdering nullsLastOrdering) {
        super((byte) 0);
        onGetStartedClick.write((Object) zzc, "easycashInquiryLoanInfoCase");
        onGetStartedClick.write((Object) nullsLastOrdering, "easycashLoanInfoDisplayMapper");
        this.read = zzc;
        this.write = nullsLastOrdering;
    }

    /* renamed from: o.LinkedHashMultimap$SetDecorator */
    public final class SetDecorator extends Iterables.C35339 {
        public final onUpdate IconCompatParcelizer;
        public final MultiProcessor MediaBrowserCompat$CustomActionResultReceiver;
        public final MultiProcessor.zza read;
        public final setProcessor write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public SetDecorator(setProcessor setprocessor, MultiProcessor multiProcessor, MultiProcessor.zza zza, onUpdate onupdate) {
            super((byte) 0);
            onGetStartedClick.write((Object) setprocessor, "getMHMCDetailCase");
            onGetStartedClick.write((Object) multiProcessor, "postMHMCDetailCalculationCase");
            onGetStartedClick.write((Object) zza, "getCollateralDetailCase");
            onGetStartedClick.write((Object) onupdate, "postMHMCDetailCase");
            this.write = setprocessor;
            this.MediaBrowserCompat$CustomActionResultReceiver = multiProcessor;
            this.read = zza;
            this.IconCompatParcelizer = onupdate;
        }
    }
}
