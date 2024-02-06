package p040o;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: o.supportFinishAfterTransition */
public final class supportFinishAfterTransition implements onCreateContextMenu<ByteBuffer> {
    private final ByteBuffer write;

    public final void IconCompatParcelizer() {
    }

    public supportFinishAfterTransition(ByteBuffer byteBuffer) {
        this.write = byteBuffer;
    }

    public final /* synthetic */ Object read() throws IOException {
        this.write.position(0);
        return this.write;
    }
}
