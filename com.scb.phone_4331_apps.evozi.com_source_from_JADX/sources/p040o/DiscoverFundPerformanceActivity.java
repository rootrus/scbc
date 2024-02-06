package p040o;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p040o.HmlMoaActivity;
import p040o.lambda$new$0;

/* renamed from: o.DiscoverFundPerformanceActivity */
public final class DiscoverFundPerformanceActivity implements ScbsAccountDetailActivity<Object>, DiscoverFundFilterListActivity {
    private static final HashMap<String, String> IconCompatParcelizer;
    private static final HashMap<String, String> MediaBrowserCompat$CustomActionResultReceiver;
    private static final Map<Class<? extends HmlSummaryActivity<?>>, Integer> MediaBrowserCompat$ItemReceiver;
    private final Class<?> read;

    public DiscoverFundPerformanceActivity(Class<?> cls) {
        onGetStartedClick.write((Object) cls, "jClass");
        this.read = cls;
    }

    public final Class<?> MediaBrowserCompat$CustomActionResultReceiver() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof DiscoverFundPerformanceActivity) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) AlertController$RecycleListView.write(this), (Object) AlertController$RecycleListView.write((ScbsAccountDetailActivity) obj));
    }

    public final int hashCode() {
        return AlertController$RecycleListView.write(this).hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read.toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    /* renamed from: o.DiscoverFundPerformanceActivity$read */
    public static final class read {
        public final List<HmlMoaActivity.write.C10783write> MediaBrowserCompat$ItemReceiver;

        private read() {
        }

        public read(List<HmlMoaActivity.write.C10783write> list) {
            this.MediaBrowserCompat$ItemReceiver = list;
        }
    }

    static {
        int i = 0;
        int i2 = 10;
        Class[] clsArr = {FundActionsSuccessActivity.class, FundFactSheetActivity.class, BaseDiscoverFundFilterActivity.class, BaseDiscoverDisclaimerActivity.class, BaseDiscoverSearchActivity_ViewBinding.class, DiscoverActivity.class, DiscoverDisclaimerActivity.class, BaseDiscoverSearchActivity.class, DiscoverFundFilterActivity.class, DiscoverFundPerformanceActivity_ViewBinding.class, lambda$new$0.AssessmentPopupActivity.class, QuestionnaireActivity.class, AssessmentPopupActivity.class, onCloseClicked.class, AssessmentPopupActivity_ViewBinding.class, RiskLevelAssessmentActivity_ViewBinding.class, RiskLevelAssessmentActivity.class, onSaveSlipClicked.class, RiskAssessmentSuccessActivity.class, RiskAssessmentSuccessActivity_ViewBinding.class, BaseDiscoverFundFilterListActivity.class, onAcceptButtonClicked.class, BaseDiscoverDisclaimerActivity_ViewBinding.class};
        onGetStartedClick.write((Object) clsArr, "elements");
        onGetStartedClick.write((Object) clsArr, "$this$asList");
        List asList = Arrays.asList(clsArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        Iterable iterable = asList;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i2 = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i2);
        for (Object next : iterable) {
            if (i >= 0) {
                arrayList.add(new HmlVerifyEmailSuccessfulActivity((Class) next, Integer.valueOf(i)));
                i++;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        MediaBrowserCompat$ItemReceiver = HmlNdidSelectIdpActivity.read((List) arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        MediaBrowserCompat$CustomActionResultReceiver = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        IconCompatParcelizer = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("o.FundOnboardingSuccessActivity", "kotlin.String.Companion");
        hashMap3.put("o.NtbDiscoverDisclaimerActivity", "kotlin.Enum.Companion");
        hashMap3.putAll(MediaBrowserCompat$CustomActionResultReceiver);
        hashMap3.putAll(IconCompatParcelizer);
        Collection<String> values = MediaBrowserCompat$CustomActionResultReceiver.values();
        onGetStartedClick.IconCompatParcelizer((Object) values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            onGetStartedClick.IconCompatParcelizer((Object) str, "kotlinName");
            sb.append(GoodToKnowActivity.MediaDescriptionCompat(str));
            sb.append("CompanionObject");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(".Companion");
            HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity = new HmlVerifyEmailSuccessfulActivity(obj, sb2.toString());
            hashMap3.put(hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver, hmlVerifyEmailSuccessfulActivity.write);
        }
        for (Map.Entry next2 : MediaBrowserCompat$ItemReceiver.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("o.HmlSummaryActivity");
            sb3.append(intValue);
            hashMap3.put(name, sb3.toString());
        }
        Map map = hashMap3;
        Map linkedHashMap = new LinkedHashMap(HmlNdidSelectIdpActivity.read(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), GoodToKnowActivity.MediaDescriptionCompat((String) entry.getValue()));
        }
    }

    public final List<Annotation> getAnnotations() {
        throw new InvestmentDetailsActivity();
    }
}
