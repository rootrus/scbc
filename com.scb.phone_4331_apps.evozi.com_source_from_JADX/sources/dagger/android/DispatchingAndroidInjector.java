package dagger.android;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p040o.C1133x65c1ec57;
import p040o.HmlPinActivity;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

public final class DispatchingAndroidInjector<T> implements MileageQuantitySelectionActivity_ViewBinding<T> {
    private final Map<String, HmlReviewDocumentActivity<MileageQuantitySelectionActivity_ViewBinding.read<? extends T>>> write;

    @HmlPinActivity
    public DispatchingAndroidInjector(Map<Class<? extends T>, HmlReviewDocumentActivity<MileageQuantitySelectionActivity_ViewBinding.read<? extends T>>> map, Map<String, HmlReviewDocumentActivity<MileageQuantitySelectionActivity_ViewBinding.read<? extends T>>> map2) {
        this.write = MediaBrowserCompat$CustomActionResultReceiver(map, map2);
    }

    private static <C, V> Map<String, V> MediaBrowserCompat$CustomActionResultReceiver(Map<Class<? extends C>, V> map, Map<String, V> map2) {
        if (map.isEmpty()) {
            return map2;
        }
        int size = map.size() + map2.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((((float) size) / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER);
        linkedHashMap.putAll(map2);
        for (Map.Entry next : map.entrySet()) {
            linkedHashMap.put(((Class) next.getKey()).getName(), next.getValue());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver(T t) {
        HmlReviewDocumentActivity hmlReviewDocumentActivity = this.write.get(t.getClass().getName());
        if (hmlReviewDocumentActivity == null) {
            return false;
        }
        MileageQuantitySelectionActivity_ViewBinding.read read = (MileageQuantitySelectionActivity_ViewBinding.read) hmlReviewDocumentActivity.get();
        try {
            ((MileageQuantitySelectionActivity_ViewBinding) C1133x65c1ec57.IconCompatParcelizer(read.IconCompatParcelizer(t), "%s.create(I) should not return null.", read.getClass())).IconCompatParcelizer(t);
            return true;
        } catch (ClassCastException e) {
            throw new InvalidInjectorBindingException(String.format("%s does not implement AndroidInjector.Factory<%s>", new Object[]{read.getClass().getCanonicalName(), t.getClass().getCanonicalName()}), e);
        }
    }

    public final void IconCompatParcelizer(T t) {
        if (!MediaBrowserCompat$CustomActionResultReceiver(t)) {
            throw new IllegalArgumentException(read(t));
        }
    }

    public static final class InvalidInjectorBindingException extends RuntimeException {
        InvalidInjectorBindingException(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    private String read(T t) {
        ArrayList arrayList = new ArrayList();
        for (Class cls = t.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (this.write.containsKey(cls.getCanonicalName())) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        if (arrayList.isEmpty()) {
            return String.format("No injector factory bound for Class<%s>", new Object[]{t.getClass().getCanonicalName()});
        }
        return String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", new Object[]{t.getClass().getCanonicalName(), arrayList});
    }
}
