package retrofit2;

import java.lang.annotation.Annotation;

final class SkipCallbackExecutorImpl implements SkipCallbackExecutor {
    private static final SkipCallbackExecutor INSTANCE = new SkipCallbackExecutorImpl();

    public final int hashCode() {
        return 0;
    }

    SkipCallbackExecutorImpl() {
    }

    static Annotation[] ensurePresent(Annotation[] annotationArr) {
        if (Utils.isAnnotationPresent(annotationArr, SkipCallbackExecutor.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = INSTANCE;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public final Class<? extends Annotation> annotationType() {
        return SkipCallbackExecutor.class;
    }

    public final boolean equals(Object obj) {
        return obj instanceof SkipCallbackExecutor;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@");
        sb.append(SkipCallbackExecutor.class.getName());
        sb.append("()");
        return sb.toString();
    }
}
