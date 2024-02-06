package p040o;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import p040o.CheckCaptureModule_GetExtractionParametersFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.applyNonNullHeader */
public final class applyNonNullHeader extends writeUInt64NoTag<CheckCaptureModule_GetExtractionParametersFactory.IconCompatParcelizer> {
    private static final Map<String, List<String>> write;
    public sameThreadExecutor IconCompatParcelizer;
    public double MediaBrowserCompat$ItemReceiver;
    public String read;

    /* renamed from: o.applyNonNullHeader$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckCaptureModule_GetExtractionParametersFactory.IconCompatParcelizer> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((CheckCaptureModule_GetExtractionParametersFactory.IconCompatParcelizer) obj).IconCompatParcelizer();
        }
    }

    /* renamed from: o.applyNonNullHeader$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckCaptureModule_GetExtractionParametersFactory.IconCompatParcelizer> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((CheckCaptureModule_GetExtractionParametersFactory.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.applyNonNullHeader$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckCaptureModule_GetExtractionParametersFactory.IconCompatParcelizer> {
        private /* synthetic */ applyNonNullHeader read;

        public write(applyNonNullHeader applynonnullheader) {
            this.read = applynonnullheader;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((CheckCaptureModule_GetExtractionParametersFactory.IconCompatParcelizer) obj).write(applyNonNullHeader.IconCompatParcelizer(this.read).MediaBrowserCompat$SearchResultReceiver, applyNonNullHeader.IconCompatParcelizer(this.read).MediaBrowserCompat$ItemReceiver);
        }
    }

    public static final /* synthetic */ sameThreadExecutor IconCompatParcelizer(applyNonNullHeader applynonnullheader) {
        sameThreadExecutor samethreadexecutor = applynonnullheader.IconCompatParcelizer;
        if (samethreadexecutor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("display");
        }
        return samethreadexecutor;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public applyNonNullHeader(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }

    static {
        String[] strArr = {"00", "25", "50", "75"};
        onGetStartedClick.write((Object) strArr, "elements");
        onGetStartedClick.write((Object) strArr, "$this$asList");
        List asList = Arrays.asList(strArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        List singletonList = Collections.singletonList("00");
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        write = HmlNdidSelectIdpActivity.read((HmlVerifyEmailSuccessfulActivity<? extends K, ? extends V>[]) new HmlVerifyEmailSuccessfulActivity[]{new HmlVerifyEmailSuccessfulActivity("D", asList), new HmlVerifyEmailSuccessfulActivity("W", singletonList)});
    }

    public final boolean MediaBrowserCompat$ItemReceiver(double d) {
        sameThreadExecutor samethreadexecutor = this.IconCompatParcelizer;
        if (samethreadexecutor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("display");
        }
        if (d >= samethreadexecutor.RatingCompat) {
            sameThreadExecutor samethreadexecutor2 = this.IconCompatParcelizer;
            if (samethreadexecutor2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("display");
            }
            if (d <= samethreadexecutor2.IconCompatParcelizer) {
                return true;
            }
        }
        return false;
    }

    public final boolean read(double d) {
        String MediaBrowserCompat$ItemReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "str");
        CharSequence charSequence = MediaBrowserCompat$ItemReceiver2;
        onGetStartedClick.write((Object) charSequence, "$this$lastIndex");
        int IconCompatParcelizer2 = GoodToKnowActivity.IconCompatParcelizer(charSequence, '.', charSequence.length() - 1, false);
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            String substring = MediaBrowserCompat$ItemReceiver2.substring(IconCompatParcelizer2 + 1);
            onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.String).substring(startIndex)");
            String str = this.read;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("transactionType");
            }
            onGetStartedClick.write((Object) str, "type");
            List list = write.get(str);
            if (list == null) {
                list = HmlNationalIdActivity.IconCompatParcelizer;
            }
            return list.contains(substring);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public static final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(applyNonNullHeader applynonnullheader) {
        return applynonnullheader.MediaBrowserCompat$ItemReceiver(applynonnullheader.MediaBrowserCompat$ItemReceiver) && applynonnullheader.read(applynonnullheader.MediaBrowserCompat$ItemReceiver);
    }
}
