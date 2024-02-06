package retrofit2.converter.simplexml;

import java.io.IOException;
import okhttp3.ResponseBody;
import org.simpleframework.xml.Serializer;
import retrofit2.Converter;

final class SimpleXmlResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final Class<T> cls;
    private final Serializer serializer;
    private final boolean strict;

    SimpleXmlResponseBodyConverter(Class<T> cls2, Serializer serializer2, boolean z) {
        this.cls = cls2;
        this.serializer = serializer2;
        this.strict = z;
    }

    public final T convert(ResponseBody responseBody) throws IOException {
        try {
            T read = this.serializer.read(this.cls, responseBody.charStream(), this.strict);
            if (read != null) {
                responseBody.close();
                return read;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not deserialize body as ");
            sb.append(this.cls);
            throw new IllegalStateException(sb.toString());
        } catch (RuntimeException e) {
            e = e;
            throw e;
        } catch (IOException e2) {
            e = e2;
            throw e;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        } catch (Throwable th) {
            responseBody.close();
            throw th;
        }
    }
}
