package p040o;

import java.util.Arrays;
import java.util.List;
import p040o.CrashlyticsBackgroundWorker;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Log$MediaBrowserCompat$CustomActionResultReceiver */
final class C3098xeb89b694 extends AutoValue_CrashlyticsReport_Session_Event_Log {
    public final boolean IconCompatParcelizer() {
        return true;
    }

    C3098xeb89b694(String str) {
        super(str, 0, (byte) 0);
    }

    public final List<setRamUsed> write() {
        setRamUsed[] setramusedArr = {new setRamUsed(CrashlyticsBackgroundWorker.C32153.BRAND.ordinal(), Iterables$3$MediaBrowserCompat$MediaItem.auto_mcmc_brand_title, Iterables$3$MediaBrowserCompat$MediaItem.auto_mcmc_car_search_brand_label, Iterables$3$MediaBrowserCompat$MediaItem.auto_mcmc_car_search_brand_placeholder, "BRAND"), new setRamUsed(CrashlyticsBackgroundWorker.C32153.MODEL.ordinal(), Iterables$3$MediaBrowserCompat$MediaItem.auto_mcmc_model_title, Iterables$3$MediaBrowserCompat$MediaItem.auto_mcmc_car_search_model_label, Iterables$3$MediaBrowserCompat$MediaItem.auto_mcmc_car_search_model_placeholder, "MODEL"), new setRamUsed(CrashlyticsBackgroundWorker.C32153.YEAR_OF_MANUFACTURE.ordinal(), Iterables$3$MediaBrowserCompat$MediaItem.auto_mcmc_year_title, Iterables$3$MediaBrowserCompat$MediaItem.auto_mcmc_car_search_year_label, Iterables$3$MediaBrowserCompat$MediaItem.auto_mcmc_car_search_year_placeholder, "YEAROFMANUFACTURE"), new setRamUsed(CrashlyticsBackgroundWorker.C32153.SUB_MODEL.ordinal(), Iterables$3$MediaBrowserCompat$MediaItem.auto_mcmc_sub_model_title, Iterables$3$MediaBrowserCompat$MediaItem.auto_mcmc_car_search_sub_model_label, Iterables$3$MediaBrowserCompat$MediaItem.auto_mcmc_car_search_sub_model_placeholder, "SUBMODEL")};
        onGetStartedClick.write((Object) setramusedArr, "elements");
        onGetStartedClick.write((Object) setramusedArr, "$this$asList");
        List<setRamUsed> asList = Arrays.asList(setramusedArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        return asList;
    }
}
