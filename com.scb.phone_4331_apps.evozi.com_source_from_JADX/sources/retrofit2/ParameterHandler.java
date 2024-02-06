package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

abstract class ParameterHandler<T> {
    /* access modifiers changed from: package-private */
    public abstract void apply(RequestBuilder requestBuilder, T t) throws IOException;

    ParameterHandler() {
    }

    /* access modifiers changed from: package-private */
    public final ParameterHandler<Iterable<T>> iterable() {
        return new ParameterHandler<Iterable<T>>() {
            /* access modifiers changed from: package-private */
            public void apply(RequestBuilder requestBuilder, Iterable<T> iterable) throws IOException {
                if (iterable != null) {
                    for (T apply : iterable) {
                        ParameterHandler.this.apply(requestBuilder, apply);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final ParameterHandler<Object> array() {
        return new ParameterHandler<Object>() {
            /* access modifiers changed from: package-private */
            public void apply(RequestBuilder requestBuilder, Object obj) throws IOException {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        ParameterHandler.this.apply(requestBuilder, Array.get(obj, i));
                    }
                }
            }
        };
    }

    static final class RelativeUrl extends ParameterHandler<Object> {
        private final Method method;

        /* renamed from: p */
        private final int f3231p;

        RelativeUrl(Method method2, int i) {
            this.method = method2;
            this.f3231p = i;
        }

        /* access modifiers changed from: package-private */
        public final void apply(RequestBuilder requestBuilder, Object obj) {
            if (obj != null) {
                requestBuilder.setRelativeUrl(obj);
                return;
            }
            throw Utils.parameterError(this.method, this.f3231p, "@Url parameter is null.", new Object[0]);
        }
    }

    static final class Header<T> extends ParameterHandler<T> {
        private final String name;
        private final Converter<T, String> valueConverter;

        Header(String str, Converter<T, String> converter) {
            this.name = (String) Utils.checkNotNull(str, "name == null");
            this.valueConverter = converter;
        }

        /* access modifiers changed from: package-private */
        public final void apply(RequestBuilder requestBuilder, T t) throws IOException {
            String convert;
            if (t != null && (convert = this.valueConverter.convert(t)) != null) {
                requestBuilder.addHeader(this.name, convert);
            }
        }
    }

    static final class Path<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Method method;
        private final String name;

        /* renamed from: p */
        private final int f3229p;
        private final Converter<T, String> valueConverter;

        Path(Method method2, int i, String str, Converter<T, String> converter, boolean z) {
            this.method = method2;
            this.f3229p = i;
            this.name = (String) Utils.checkNotNull(str, "name == null");
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        public final void apply(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.addPathParam(this.name, this.valueConverter.convert(t), this.encoded);
                return;
            }
            Method method2 = this.method;
            int i = this.f3229p;
            StringBuilder sb = new StringBuilder();
            sb.append("Path parameter \"");
            sb.append(this.name);
            sb.append("\" value must not be null.");
            throw Utils.parameterError(method2, i, sb.toString(), new Object[0]);
        }
    }

    static final class Query<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        Query(String str, Converter<T, String> converter, boolean z) {
            this.name = (String) Utils.checkNotNull(str, "name == null");
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        public final void apply(RequestBuilder requestBuilder, T t) throws IOException {
            String convert;
            if (t != null && (convert = this.valueConverter.convert(t)) != null) {
                requestBuilder.addQueryParam(this.name, convert, this.encoded);
            }
        }
    }

    static final class QueryName<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Converter<T, String> nameConverter;

        QueryName(Converter<T, String> converter, boolean z) {
            this.nameConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        public final void apply(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.addQueryParam(this.nameConverter.convert(t), (String) null, this.encoded);
            }
        }
    }

    static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* renamed from: p */
        private final int f3230p;
        private final Converter<T, String> valueConverter;

        QueryMap(Method method2, int i, Converter<T, String> converter, boolean z) {
            this.method = method2;
            this.f3230p = i;
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        public final void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String convert = this.valueConverter.convert(value);
                            if (convert != null) {
                                requestBuilder.addQueryParam(str, convert, this.encoded);
                            } else {
                                Method method2 = this.method;
                                int i = this.f3230p;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Query map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.valueConverter.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append("'.");
                                throw Utils.parameterError(method2, i, sb.toString(), new Object[0]);
                            }
                        } else {
                            Method method3 = this.method;
                            int i2 = this.f3230p;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Query map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw Utils.parameterError(method3, i2, sb2.toString(), new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.f3230p, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.f3230p, "Query map was null", new Object[0]);
        }
    }

    static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;

        /* renamed from: p */
        private final int f3225p;
        private final Converter<T, String> valueConverter;

        HeaderMap(Method method2, int i, Converter<T, String> converter) {
            this.method = method2;
            this.f3225p = i;
            this.valueConverter = converter;
        }

        /* access modifiers changed from: package-private */
        public final void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            requestBuilder.addHeader(str, this.valueConverter.convert(value));
                        } else {
                            Method method2 = this.method;
                            int i = this.f3225p;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Header map contained null value for key '");
                            sb.append(str);
                            sb.append("'.");
                            throw Utils.parameterError(method2, i, sb.toString(), new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.f3225p, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.f3225p, "Header map was null.", new Object[0]);
        }
    }

    static final class Headers extends ParameterHandler<okhttp3.Headers> {
        private final Method method;

        /* renamed from: p */
        private final int f3226p;

        Headers(Method method2, int i) {
            this.method = method2;
            this.f3226p = i;
        }

        /* access modifiers changed from: package-private */
        public final void apply(RequestBuilder requestBuilder, okhttp3.Headers headers) {
            if (headers != null) {
                requestBuilder.addHeaders(headers);
                return;
            }
            throw Utils.parameterError(this.method, this.f3226p, "Headers parameter must not be null.", new Object[0]);
        }
    }

    static final class Field<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        Field(String str, Converter<T, String> converter, boolean z) {
            this.name = (String) Utils.checkNotNull(str, "name == null");
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        public final void apply(RequestBuilder requestBuilder, T t) throws IOException {
            String convert;
            if (t != null && (convert = this.valueConverter.convert(t)) != null) {
                requestBuilder.addFormField(this.name, convert, this.encoded);
            }
        }
    }

    static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* renamed from: p */
        private final int f3224p;
        private final Converter<T, String> valueConverter;

        FieldMap(Method method2, int i, Converter<T, String> converter, boolean z) {
            this.method = method2;
            this.f3224p = i;
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        public final void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String convert = this.valueConverter.convert(value);
                            if (convert != null) {
                                requestBuilder.addFormField(str, convert, this.encoded);
                            } else {
                                Method method2 = this.method;
                                int i = this.f3224p;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Field map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.valueConverter.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append("'.");
                                throw Utils.parameterError(method2, i, sb.toString(), new Object[0]);
                            }
                        } else {
                            Method method3 = this.method;
                            int i2 = this.f3224p;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Field map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw Utils.parameterError(method3, i2, sb2.toString(), new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.f3224p, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.f3224p, "Field map was null.", new Object[0]);
        }
    }

    static final class Part<T> extends ParameterHandler<T> {
        private final Converter<T, RequestBody> converter;
        private final okhttp3.Headers headers;
        private final Method method;

        /* renamed from: p */
        private final int f3227p;

        Part(Method method2, int i, okhttp3.Headers headers2, Converter<T, RequestBody> converter2) {
            this.method = method2;
            this.f3227p = i;
            this.headers = headers2;
            this.converter = converter2;
        }

        /* access modifiers changed from: package-private */
        public final void apply(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.addPart(this.headers, this.converter.convert(t));
                } catch (IOException e) {
                    Method method2 = this.method;
                    int i = this.f3227p;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw Utils.parameterError(method2, i, sb.toString(), e);
                }
            }
        }
    }

    static final class RawPart extends ParameterHandler<MultipartBody.Part> {
        static final RawPart INSTANCE = new RawPart();

        private RawPart() {
        }

        /* access modifiers changed from: package-private */
        public final void apply(RequestBuilder requestBuilder, MultipartBody.Part part) {
            if (part != null) {
                requestBuilder.addPart(part);
            }
        }
    }

    static final class PartMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;

        /* renamed from: p */
        private final int f3228p;
        private final String transferEncoding;
        private final Converter<T, RequestBody> valueConverter;

        PartMap(Method method2, int i, Converter<T, RequestBody> converter, String str) {
            this.method = method2;
            this.f3228p = i;
            this.valueConverter = converter;
            this.transferEncoding = str;
        }

        /* access modifiers changed from: package-private */
        public final void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("form-data; name=\"");
                            sb.append(str);
                            sb.append("\"");
                            requestBuilder.addPart(okhttp3.Headers.m3581of("Content-Disposition", sb.toString(), "Content-Transfer-Encoding", this.transferEncoding), this.valueConverter.convert(value));
                        } else {
                            Method method2 = this.method;
                            int i = this.f3228p;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Part map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw Utils.parameterError(method2, i, sb2.toString(), new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.f3228p, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.f3228p, "Part map was null.", new Object[0]);
        }
    }

    static final class Body<T> extends ParameterHandler<T> {
        private final Converter<T, RequestBody> converter;
        private final Method method;

        /* renamed from: p */
        private final int f3223p;

        Body(Method method2, int i, Converter<T, RequestBody> converter2) {
            this.method = method2;
            this.f3223p = i;
            this.converter = converter2;
        }

        /* access modifiers changed from: package-private */
        public final void apply(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.setBody(this.converter.convert(t));
                } catch (IOException e) {
                    Method method2 = this.method;
                    int i = this.f3223p;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw Utils.parameterError(method2, e, i, sb.toString(), new Object[0]);
                }
            } else {
                throw Utils.parameterError(this.method, this.f3223p, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    static final class Tag<T> extends ParameterHandler<T> {
        final Class<T> cls;

        Tag(Class<T> cls2) {
            this.cls = cls2;
        }

        /* access modifiers changed from: package-private */
        public final void apply(RequestBuilder requestBuilder, T t) {
            requestBuilder.addTag(this.cls, t);
        }
    }
}
