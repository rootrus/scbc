package p040o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.CaptureDocumentActivity_ViewBinding */
public final class CaptureDocumentActivity_ViewBinding {

    /* renamed from: o.CaptureDocumentActivity_ViewBinding$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements FundFactSheetActivity<State, Result> {
        private List<? extends Object> IconCompatParcelizer;
        private Result MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ BaseDiscoverFundFilterActivity MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ FundFactSheetActivity read;
        private /* synthetic */ FundFactSheetActivity write;

        public IconCompatParcelizer(FundFactSheetActivity fundFactSheetActivity, FundFactSheetActivity fundFactSheetActivity2, BaseDiscoverFundFilterActivity baseDiscoverFundFilterActivity) {
            this.read = fundFactSheetActivity;
            this.write = fundFactSheetActivity2;
            this.MediaBrowserCompat$ItemReceiver = baseDiscoverFundFilterActivity;
        }

        public final Result invoke(State state) {
            Object invoke = this.read.invoke(state);
            Object invoke2 = this.write.invoke(state);
            Object[] objArr = {invoke, invoke2};
            onGetStartedClick.write((Object) objArr, "elements");
            onGetStartedClick.write((Object) objArr, "$this$asList");
            List<? extends Object> asList = Arrays.asList(objArr);
            onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
            if (!CaptureDocumentActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, asList)) {
                this.MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(invoke, invoke2);
            }
            this.IconCompatParcelizer = asList;
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }
    }

    /* renamed from: o.CaptureDocumentActivity_ViewBinding$write */
    public static final class write implements FundFactSheetActivity<State, Result> {
        private /* synthetic */ FundFactSheetActivity IconCompatParcelizer;
        private /* synthetic */ BaseDiscoverDisclaimerActivity MediaBrowserCompat$CustomActionResultReceiver;
        private List<? extends Object> MediaBrowserCompat$ItemReceiver;
        private Result MediaMetadataCompat;
        private /* synthetic */ FundFactSheetActivity read;
        private /* synthetic */ FundFactSheetActivity write;

        write(FundFactSheetActivity fundFactSheetActivity, FundFactSheetActivity fundFactSheetActivity2, FundFactSheetActivity fundFactSheetActivity3, BaseDiscoverDisclaimerActivity baseDiscoverDisclaimerActivity) {
            this.write = fundFactSheetActivity;
            this.IconCompatParcelizer = fundFactSheetActivity2;
            this.read = fundFactSheetActivity3;
            this.MediaBrowserCompat$CustomActionResultReceiver = baseDiscoverDisclaimerActivity;
        }

        public final Result invoke(State state) {
            Object invoke = this.write.invoke(state);
            Object invoke2 = this.IconCompatParcelizer.invoke(state);
            Object invoke3 = this.read.invoke(state);
            Object[] objArr = {invoke, invoke2, invoke3};
            onGetStartedClick.write((Object) objArr, "elements");
            onGetStartedClick.write((Object) objArr, "$this$asList");
            List<? extends Object> asList = Arrays.asList(objArr);
            onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
            if (!CaptureDocumentActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, asList)) {
                this.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.write(invoke, invoke2, invoke3);
            }
            this.MediaBrowserCompat$ItemReceiver = asList;
            return this.MediaMetadataCompat;
        }
    }

    public static final <State, Selection1, Selection2, Selection3, Result> FundFactSheetActivity<State, Result> write(FundFactSheetActivity<? super State, ? extends Selection1> fundFactSheetActivity, FundFactSheetActivity<? super State, ? extends Selection2> fundFactSheetActivity2, FundFactSheetActivity<? super State, ? extends Selection3> fundFactSheetActivity3, BaseDiscoverDisclaimerActivity<? super Selection1, ? super Selection2, ? super Selection3, ? extends Result> baseDiscoverDisclaimerActivity) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "selector1");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "selector2");
        onGetStartedClick.write((Object) fundFactSheetActivity3, "selector3");
        onGetStartedClick.write((Object) baseDiscoverDisclaimerActivity, "compute");
        return new write(fundFactSheetActivity, fundFactSheetActivity2, fundFactSheetActivity3, baseDiscoverDisclaimerActivity);
    }

    /* renamed from: o.CaptureDocumentActivity_ViewBinding$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat implements FundFactSheetActivity<State, Result> {
        private /* synthetic */ FundFactSheetActivity IconCompatParcelizer;
        private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ FundFactSheetActivity read;
        private /* synthetic */ BaseDiscoverDisclaimerActivity write;

        public MediaDescriptionCompat(FundFactSheetActivity fundFactSheetActivity, FundFactSheetActivity fundFactSheetActivity2, FundFactSheetActivity fundFactSheetActivity3, BaseDiscoverDisclaimerActivity baseDiscoverDisclaimerActivity) {
            this.IconCompatParcelizer = fundFactSheetActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity2;
            this.read = fundFactSheetActivity3;
            this.write = baseDiscoverDisclaimerActivity;
        }

        public final Result invoke(State state) {
            return this.write.write(this.IconCompatParcelizer.invoke(state), this.MediaBrowserCompat$CustomActionResultReceiver.invoke(state), this.read.invoke(state));
        }
    }

    /* renamed from: o.CaptureDocumentActivity_ViewBinding$read */
    public static final class read implements FundFactSheetActivity<State, Result> {
        private /* synthetic */ FundFactSheetActivity IconCompatParcelizer;
        private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ BaseDiscoverSearchActivity_ViewBinding MediaBrowserCompat$ItemReceiver;
        private List<? extends Object> MediaBrowserCompat$SearchResultReceiver;
        private Result RatingCompat;
        private /* synthetic */ FundFactSheetActivity read;
        private /* synthetic */ FundFactSheetActivity write;

        read(FundFactSheetActivity fundFactSheetActivity, FundFactSheetActivity fundFactSheetActivity2, FundFactSheetActivity fundFactSheetActivity3, FundFactSheetActivity fundFactSheetActivity4, BaseDiscoverSearchActivity_ViewBinding baseDiscoverSearchActivity_ViewBinding) {
            this.MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity;
            this.IconCompatParcelizer = fundFactSheetActivity2;
            this.write = fundFactSheetActivity3;
            this.read = fundFactSheetActivity4;
            this.MediaBrowserCompat$ItemReceiver = baseDiscoverSearchActivity_ViewBinding;
        }

        public final Result invoke(State state) {
            Object invoke = this.MediaBrowserCompat$CustomActionResultReceiver.invoke(state);
            Object invoke2 = this.IconCompatParcelizer.invoke(state);
            Object invoke3 = this.write.invoke(state);
            Object invoke4 = this.read.invoke(state);
            Object[] objArr = {invoke, invoke2, invoke3, invoke4};
            onGetStartedClick.write((Object) objArr, "elements");
            onGetStartedClick.write((Object) objArr, "$this$asList");
            List<? extends Object> asList = Arrays.asList(objArr);
            onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
            if (!CaptureDocumentActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$SearchResultReceiver, asList)) {
                this.RatingCompat = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(invoke, invoke2, invoke3, invoke4);
            }
            this.MediaBrowserCompat$SearchResultReceiver = asList;
            return this.RatingCompat;
        }
    }

    public static final <State, Selection1, Selection2, Selection3, Selection4, Result> FundFactSheetActivity<State, Result> IconCompatParcelizer(FundFactSheetActivity<? super State, ? extends Selection1> fundFactSheetActivity, FundFactSheetActivity<? super State, ? extends Selection2> fundFactSheetActivity2, FundFactSheetActivity<? super State, ? extends Selection3> fundFactSheetActivity3, FundFactSheetActivity<? super State, ? extends Selection4> fundFactSheetActivity4, BaseDiscoverSearchActivity_ViewBinding<? super Selection1, ? super Selection2, ? super Selection3, ? super Selection4, ? extends Result> baseDiscoverSearchActivity_ViewBinding) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "selector1");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "selector2");
        onGetStartedClick.write((Object) fundFactSheetActivity3, "selector3");
        onGetStartedClick.write((Object) fundFactSheetActivity4, "selector4");
        onGetStartedClick.write((Object) baseDiscoverSearchActivity_ViewBinding, "compute");
        return new read(fundFactSheetActivity, fundFactSheetActivity2, fundFactSheetActivity3, fundFactSheetActivity4, baseDiscoverSearchActivity_ViewBinding);
    }

    public static final <State, Selection1, Selection2, Selection3, Selection4, Selection5, Result> FundFactSheetActivity<State, Result> MediaBrowserCompat$ItemReceiver(FundFactSheetActivity<? super State, ? extends Selection1> fundFactSheetActivity, FundFactSheetActivity<? super State, ? extends Selection2> fundFactSheetActivity2, FundFactSheetActivity<? super State, ? extends Selection3> fundFactSheetActivity3, FundFactSheetActivity<? super State, ? extends Selection4> fundFactSheetActivity4, FundFactSheetActivity<? super State, ? extends Selection5> fundFactSheetActivity5, DiscoverActivity<? super Selection1, ? super Selection2, ? super Selection3, ? super Selection4, ? super Selection5, ? extends Result> discoverActivity) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "selector1");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "selector2");
        onGetStartedClick.write((Object) fundFactSheetActivity3, "selector3");
        onGetStartedClick.write((Object) fundFactSheetActivity4, "selector4");
        onGetStartedClick.write((Object) fundFactSheetActivity5, "selector5");
        onGetStartedClick.write((Object) discoverActivity, "compute");
        return new C6352x87ff10ed(fundFactSheetActivity, fundFactSheetActivity2, fundFactSheetActivity3, fundFactSheetActivity4, fundFactSheetActivity5, discoverActivity);
    }

    /* renamed from: o.CaptureDocumentActivity_ViewBinding$MediaMetadataCompat */
    public static final class MediaMetadataCompat implements FundFactSheetActivity<State, Result> {
        private /* synthetic */ FundFactSheetActivity IconCompatParcelizer;
        private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ DiscoverDisclaimerActivity MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$SearchResultReceiver;
        private Result MediaDescriptionCompat;
        private List<? extends Object> MediaMetadataCompat;
        private /* synthetic */ FundFactSheetActivity RatingCompat;
        private /* synthetic */ FundFactSheetActivity read;
        private /* synthetic */ FundFactSheetActivity write;

        MediaMetadataCompat(FundFactSheetActivity fundFactSheetActivity, FundFactSheetActivity fundFactSheetActivity2, FundFactSheetActivity fundFactSheetActivity3, FundFactSheetActivity fundFactSheetActivity4, FundFactSheetActivity fundFactSheetActivity5, FundFactSheetActivity fundFactSheetActivity6, DiscoverDisclaimerActivity discoverDisclaimerActivity) {
            this.IconCompatParcelizer = fundFactSheetActivity;
            this.write = fundFactSheetActivity2;
            this.MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity3;
            this.read = fundFactSheetActivity4;
            this.MediaBrowserCompat$SearchResultReceiver = fundFactSheetActivity5;
            this.RatingCompat = fundFactSheetActivity6;
            this.MediaBrowserCompat$ItemReceiver = discoverDisclaimerActivity;
        }

        public final Result invoke(State state) {
            Object invoke = this.IconCompatParcelizer.invoke(state);
            Object invoke2 = this.write.invoke(state);
            Object invoke3 = this.MediaBrowserCompat$CustomActionResultReceiver.invoke(state);
            Object invoke4 = this.read.invoke(state);
            Object invoke5 = this.MediaBrowserCompat$SearchResultReceiver.invoke(state);
            Object invoke6 = this.RatingCompat.invoke(state);
            Object[] objArr = {invoke, invoke2, invoke3, invoke4, invoke5, invoke6};
            onGetStartedClick.write((Object) objArr, "elements");
            onGetStartedClick.write((Object) objArr, "$this$asList");
            List<? extends Object> asList = Arrays.asList(objArr);
            onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
            if (!CaptureDocumentActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat, asList)) {
                this.MediaDescriptionCompat = this.MediaBrowserCompat$ItemReceiver.read(invoke, invoke2, invoke3, invoke4, invoke5, invoke6);
            }
            this.MediaMetadataCompat = asList;
            return this.MediaDescriptionCompat;
        }
    }

    public static final <State, Selection1, Selection2, Selection3, Selection4, Selection5, Selection6, Result> FundFactSheetActivity<State, Result> MediaBrowserCompat$ItemReceiver(FundFactSheetActivity<? super State, ? extends Selection1> fundFactSheetActivity, FundFactSheetActivity<? super State, ? extends Selection2> fundFactSheetActivity2, FundFactSheetActivity<? super State, ? extends Selection3> fundFactSheetActivity3, FundFactSheetActivity<? super State, ? extends Selection4> fundFactSheetActivity4, FundFactSheetActivity<? super State, ? extends Selection5> fundFactSheetActivity5, FundFactSheetActivity<? super State, ? extends Selection6> fundFactSheetActivity6, DiscoverDisclaimerActivity<? super Selection1, ? super Selection2, ? super Selection3, ? super Selection4, ? super Selection5, ? super Selection6, ? extends Result> discoverDisclaimerActivity) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "selector1");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "selector2");
        onGetStartedClick.write((Object) fundFactSheetActivity3, "selector3");
        onGetStartedClick.write((Object) fundFactSheetActivity4, "selector4");
        onGetStartedClick.write((Object) fundFactSheetActivity5, "selector5");
        onGetStartedClick.write((Object) fundFactSheetActivity6, "selector6");
        onGetStartedClick.write((Object) discoverDisclaimerActivity, "compute");
        return new MediaMetadataCompat(fundFactSheetActivity, fundFactSheetActivity2, fundFactSheetActivity3, fundFactSheetActivity4, fundFactSheetActivity5, fundFactSheetActivity6, discoverDisclaimerActivity);
    }

    public static final <State, Selection1, Selection2, Selection3, Selection4, Selection5, Selection6, Selection7, Result> FundFactSheetActivity<State, Result> IconCompatParcelizer(FundFactSheetActivity<? super State, ? extends Selection1> fundFactSheetActivity, FundFactSheetActivity<? super State, ? extends Selection2> fundFactSheetActivity2, FundFactSheetActivity<? super State, ? extends Selection3> fundFactSheetActivity3, FundFactSheetActivity<? super State, ? extends Selection4> fundFactSheetActivity4, FundFactSheetActivity<? super State, ? extends Selection5> fundFactSheetActivity5, FundFactSheetActivity<? super State, ? extends Selection6> fundFactSheetActivity6, FundFactSheetActivity<? super State, ? extends Selection7> fundFactSheetActivity7, BaseDiscoverSearchActivity<? super Selection1, ? super Selection2, ? super Selection3, ? super Selection4, ? super Selection5, ? super Selection6, ? super Selection7, ? extends Result> baseDiscoverSearchActivity) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "selector1");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "selector2");
        onGetStartedClick.write((Object) fundFactSheetActivity3, "selector3");
        onGetStartedClick.write((Object) fundFactSheetActivity4, "selector4");
        onGetStartedClick.write((Object) fundFactSheetActivity5, "selector5");
        onGetStartedClick.write((Object) fundFactSheetActivity6, "selector6");
        FundFactSheetActivity<? super State, ? extends Selection7> fundFactSheetActivity8 = fundFactSheetActivity7;
        onGetStartedClick.write((Object) fundFactSheetActivity8, "selector7");
        BaseDiscoverSearchActivity<? super Selection1, ? super Selection2, ? super Selection3, ? super Selection4, ? super Selection5, ? super Selection6, ? super Selection7, ? extends Result> baseDiscoverSearchActivity2 = baseDiscoverSearchActivity;
        onGetStartedClick.write((Object) baseDiscoverSearchActivity2, "compute");
        return new C6353x8e6ee4bf(fundFactSheetActivity, fundFactSheetActivity2, fundFactSheetActivity3, fundFactSheetActivity4, fundFactSheetActivity5, fundFactSheetActivity6, fundFactSheetActivity8, baseDiscoverSearchActivity2);
    }

    public static final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        List singletonList = Collections.singletonList(obj);
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        List singletonList2 = Collections.singletonList(obj2);
        onGetStartedClick.IconCompatParcelizer((Object) singletonList2, "java.util.Collections.singletonList(element)");
        if (singletonList.size() != singletonList2.size()) {
            return false;
        }
        Collection collection = singletonList;
        onGetStartedClick.write((Object) collection, "$this$indices");
        Iterator it = new AddAccountConsentActivity(0, collection.size() - 1).iterator();
        while (it.hasNext()) {
            int write2 = ((HmlNationalIdHelpActivity) it).write();
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver(singletonList.get(write2), singletonList2.get(write2))) {
                return false;
            }
        }
        return true;
    }
}
