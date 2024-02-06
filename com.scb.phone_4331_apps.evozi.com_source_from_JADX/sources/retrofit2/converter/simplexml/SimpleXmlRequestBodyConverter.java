package retrofit2.converter.simplexml;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.simpleframework.xml.Serializer;
import p040o.SCBUniversalWebViewActivity;
import retrofit2.Converter;

final class SimpleXmlRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final String CHARSET = "UTF-8";
    private static final MediaType MEDIA_TYPE = MediaType.get("application/xml; charset=UTF-8");
    private final Serializer serializer;

    SimpleXmlRequestBodyConverter(Serializer serializer2) {
        this.serializer = serializer2;
    }

    public final RequestBody convert(T t) throws IOException {
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new SCBUniversalWebViewActivity.write(sCBUniversalWebViewActivity), CHARSET);
            this.serializer.write((Object) t, (Writer) outputStreamWriter);
            outputStreamWriter.flush();
            return RequestBody.create(MEDIA_TYPE, sCBUniversalWebViewActivity.ParcelableVolumeInfo());
        } catch (IOException | RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
