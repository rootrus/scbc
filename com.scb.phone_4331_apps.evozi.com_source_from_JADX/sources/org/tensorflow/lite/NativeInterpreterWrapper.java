package org.tensorflow.lite;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.Map;
import p040o.QuickAccountSelectAdapter$HeaderHolder;

public final class NativeInterpreterWrapper implements AutoCloseable {
    public long IconCompatParcelizer;
    public long MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver = false;
    private ByteBuffer MediaBrowserCompat$MediaItem;
    private long MediaBrowserCompat$SearchResultReceiver;
    public Map<String, Integer> MediaDescriptionCompat;
    private final Tensor[] RatingCompat;
    public Map<String, Integer> read;
    public final Tensor[] write;

    public static native long allocateTensors(long j, long j2);

    private static native long createErrorReporter(int i);

    private static native long createInterpreter(long j, long j2, int i);

    private static native long createModel(String str, long j);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j);

    private static native void delete(long j, long j2, long j3);

    private static native int getInputCount(long j);

    public static native String[] getInputNames(long j);

    private static native int getInputTensorIndex(long j, int i);

    private static native int getOutputCount(long j);

    public static native String[] getOutputNames(long j);

    public static native int getOutputTensorIndex(long j, int i);

    private static native boolean resizeInput(long j, long j2, int i, int[] iArr);

    public static native boolean run(long j, long j2);

    public static native void useNNAPI(long j, boolean z);

    public NativeInterpreterWrapper(String str, QuickAccountSelectAdapter$HeaderHolder.IconCompatParcelizer iconCompatParcelizer) {
        QuickAccountSelectAdapter$HeaderHolder.IconCompatParcelizer iconCompatParcelizer2 = new QuickAccountSelectAdapter$HeaderHolder.IconCompatParcelizer();
        long createErrorReporter = createErrorReporter(512);
        this.IconCompatParcelizer = createErrorReporter;
        long createModel = createModel(str, createErrorReporter);
        this.MediaBrowserCompat$SearchResultReceiver = createModel;
        long createInterpreter = createInterpreter(createModel, this.IconCompatParcelizer, iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$CustomActionResultReceiver = createInterpreter;
        this.MediaBrowserCompat$ItemReceiver = true;
        this.RatingCompat = new Tensor[getInputCount(createInterpreter)];
        this.write = new Tensor[getOutputCount(this.MediaBrowserCompat$CustomActionResultReceiver)];
    }

    public NativeInterpreterWrapper(ByteBuffer byteBuffer, QuickAccountSelectAdapter$HeaderHolder.IconCompatParcelizer iconCompatParcelizer) {
        QuickAccountSelectAdapter$HeaderHolder.IconCompatParcelizer iconCompatParcelizer2 = new QuickAccountSelectAdapter$HeaderHolder.IconCompatParcelizer();
        if (byteBuffer == null || (!(byteBuffer instanceof MappedByteBuffer) && (!byteBuffer.isDirect() || byteBuffer.order() != ByteOrder.nativeOrder()))) {
            throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
        }
        this.MediaBrowserCompat$MediaItem = byteBuffer;
        long createErrorReporter = createErrorReporter(512);
        this.IconCompatParcelizer = createErrorReporter;
        long createModelWithBuffer = createModelWithBuffer(this.MediaBrowserCompat$MediaItem, createErrorReporter);
        this.MediaBrowserCompat$SearchResultReceiver = createModelWithBuffer;
        long createInterpreter = createInterpreter(createModelWithBuffer, this.IconCompatParcelizer, iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$CustomActionResultReceiver = createInterpreter;
        this.MediaBrowserCompat$ItemReceiver = true;
        this.RatingCompat = new Tensor[getInputCount(createInterpreter)];
        this.write = new Tensor[getOutputCount(this.MediaBrowserCompat$CustomActionResultReceiver)];
    }

    public final void close() {
        int i = 0;
        while (true) {
            Tensor[] tensorArr = this.RatingCompat;
            if (i >= tensorArr.length) {
                break;
            }
            if (tensorArr[i] != null) {
                Tensor tensor = tensorArr[i];
                Tensor.delete(tensor.MediaBrowserCompat$CustomActionResultReceiver);
                tensor.MediaBrowserCompat$CustomActionResultReceiver = 0;
                this.RatingCompat[i] = null;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            Tensor[] tensorArr2 = this.write;
            if (i2 < tensorArr2.length) {
                if (tensorArr2[i2] != null) {
                    Tensor tensor2 = tensorArr2[i2];
                    Tensor.delete(tensor2.MediaBrowserCompat$CustomActionResultReceiver);
                    tensor2.MediaBrowserCompat$CustomActionResultReceiver = 0;
                    this.write[i2] = null;
                }
                i2++;
            } else {
                delete(this.IconCompatParcelizer, this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$CustomActionResultReceiver);
                this.IconCompatParcelizer = 0;
                this.MediaBrowserCompat$SearchResultReceiver = 0;
                this.MediaBrowserCompat$CustomActionResultReceiver = 0;
                this.MediaBrowserCompat$MediaItem = null;
                this.read = null;
                this.MediaDescriptionCompat = null;
                this.MediaBrowserCompat$ItemReceiver = false;
                return;
            }
        }
    }

    public final void IconCompatParcelizer(int i, int[] iArr) {
        if (resizeInput(this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer, i, iArr)) {
            this.MediaBrowserCompat$ItemReceiver = false;
            Tensor[] tensorArr = this.RatingCompat;
            if (tensorArr[i] != null) {
                Tensor tensor = tensorArr[i];
                tensor.IconCompatParcelizer = Tensor.shape(tensor.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
    }

    public final Tensor read(int i) {
        if (i >= 0) {
            Tensor[] tensorArr = this.RatingCompat;
            if (i < tensorArr.length) {
                Tensor tensor = tensorArr[i];
                if (tensor != null) {
                    return tensor;
                }
                long j = this.MediaBrowserCompat$CustomActionResultReceiver;
                Tensor read2 = Tensor.read(j, getInputTensorIndex(j, i));
                tensorArr[i] = read2;
                return read2;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid input Tensor index: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    static {
        TensorFlowLite.IconCompatParcelizer();
    }
}
