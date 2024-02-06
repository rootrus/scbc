package p040o;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.lite.NativeInterpreterWrapper;
import org.tensorflow.lite.Tensor;

/* renamed from: o.QuickAccountSelectAdapter$HeaderHolder */
public final class QuickAccountSelectAdapter$HeaderHolder implements AutoCloseable {
    private NativeInterpreterWrapper write;

    /* renamed from: o.QuickAccountSelectAdapter$HeaderHolder$IconCompatParcelizer */
    public static class IconCompatParcelizer {
        public int MediaBrowserCompat$CustomActionResultReceiver = -1;
    }

    public QuickAccountSelectAdapter$HeaderHolder(File file) {
        this(file, (byte) 0);
    }

    private QuickAccountSelectAdapter$HeaderHolder(File file, byte b) {
        this.write = new NativeInterpreterWrapper(file.getAbsolutePath(), (IconCompatParcelizer) null);
    }

    @Deprecated
    public QuickAccountSelectAdapter$HeaderHolder(MappedByteBuffer mappedByteBuffer) {
        this((ByteBuffer) mappedByteBuffer);
    }

    private QuickAccountSelectAdapter$HeaderHolder(ByteBuffer byteBuffer) {
        this.write = new NativeInterpreterWrapper(byteBuffer, (IconCompatParcelizer) null);
    }

    public final void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.write;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.write = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public final int read(String str) {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.write;
        if (nativeInterpreterWrapper != null) {
            if (nativeInterpreterWrapper.read == null) {
                String[] inputNames = NativeInterpreterWrapper.getInputNames(nativeInterpreterWrapper.MediaBrowserCompat$CustomActionResultReceiver);
                nativeInterpreterWrapper.read = new HashMap();
                if (inputNames != null) {
                    for (int i = 0; i < inputNames.length; i++) {
                        nativeInterpreterWrapper.read.put(inputNames[i], Integer.valueOf(i));
                    }
                }
            }
            if (nativeInterpreterWrapper.read.containsKey(str)) {
                return nativeInterpreterWrapper.read.get(str).intValue();
            }
            throw new IllegalArgumentException(String.format("Input error: '%s' is not a valid name for any input. Names of inputs and their indexes are %s", new Object[]{str, nativeInterpreterWrapper.read.toString()}));
        }
        throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
    }

    public final int IconCompatParcelizer(String str) {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.write;
        if (nativeInterpreterWrapper != null) {
            if (nativeInterpreterWrapper.MediaDescriptionCompat == null) {
                String[] outputNames = NativeInterpreterWrapper.getOutputNames(nativeInterpreterWrapper.MediaBrowserCompat$CustomActionResultReceiver);
                nativeInterpreterWrapper.MediaDescriptionCompat = new HashMap();
                if (outputNames != null) {
                    for (int i = 0; i < outputNames.length; i++) {
                        nativeInterpreterWrapper.MediaDescriptionCompat.put(outputNames[i], Integer.valueOf(i));
                    }
                }
            }
            if (nativeInterpreterWrapper.MediaDescriptionCompat.containsKey(str)) {
                return nativeInterpreterWrapper.MediaDescriptionCompat.get(str).intValue();
            }
            throw new IllegalArgumentException(String.format("Input error: '%s' is not a valid name for any output. Names of outputs and their indexes are %s", new Object[]{str, nativeInterpreterWrapper.MediaDescriptionCompat.toString()}));
        }
        throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
    }

    public final void write(int i, int[] iArr) {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.write;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.IconCompatParcelizer(i, iArr);
            return;
        }
        throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
    }

    public final void IconCompatParcelizer(Object[] objArr, Map<Integer, Object> map) {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.write;
        if (nativeInterpreterWrapper == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        } else if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        } else if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Input error: Outputs should not be null or empty.");
        } else {
            int i = 0;
            for (int i2 = 0; i2 < objArr.length; i2++) {
                Tensor read = nativeInterpreterWrapper.read(i2);
                Object obj = objArr[i2];
                int[] iArr = null;
                if (!Tensor.write(obj)) {
                    int[] read2 = Tensor.read(obj);
                    if (!Arrays.equals(read.IconCompatParcelizer, read2)) {
                        iArr = read2;
                    }
                }
                if (iArr != null) {
                    nativeInterpreterWrapper.IconCompatParcelizer(i2, iArr);
                }
            }
            boolean z = !nativeInterpreterWrapper.MediaBrowserCompat$ItemReceiver;
            if (z) {
                NativeInterpreterWrapper.allocateTensors(nativeInterpreterWrapper.MediaBrowserCompat$CustomActionResultReceiver, nativeInterpreterWrapper.IconCompatParcelizer);
                nativeInterpreterWrapper.MediaBrowserCompat$ItemReceiver = true;
            }
            for (int i3 = 0; i3 < objArr.length; i3++) {
                Tensor read3 = nativeInterpreterWrapper.read(i3);
                ByteBuffer byteBuffer = objArr[i3];
                read3.MediaBrowserCompat$CustomActionResultReceiver(byteBuffer);
                if (Tensor.write(byteBuffer)) {
                    ByteBuffer byteBuffer2 = byteBuffer;
                    if (!byteBuffer2.isDirect() || byteBuffer2.order() != ByteOrder.nativeOrder()) {
                        Tensor.buffer(read3.MediaBrowserCompat$CustomActionResultReceiver).order(ByteOrder.nativeOrder()).put(byteBuffer2);
                    } else {
                        Tensor.writeDirectBuffer(read3.MediaBrowserCompat$CustomActionResultReceiver, byteBuffer2);
                    }
                } else {
                    Tensor.writeMultiDimensionalArray(read3.MediaBrowserCompat$CustomActionResultReceiver, byteBuffer);
                }
            }
            NativeInterpreterWrapper.run(nativeInterpreterWrapper.MediaBrowserCompat$CustomActionResultReceiver, nativeInterpreterWrapper.IconCompatParcelizer);
            if (z) {
                while (true) {
                    Tensor[] tensorArr = nativeInterpreterWrapper.write;
                    if (i >= tensorArr.length) {
                        break;
                    }
                    if (tensorArr[i] != null) {
                        Tensor tensor = tensorArr[i];
                        tensor.IconCompatParcelizer = Tensor.shape(tensor.MediaBrowserCompat$CustomActionResultReceiver);
                    }
                    i++;
                }
            }
            for (Map.Entry next : map.entrySet()) {
                int intValue = ((Integer) next.getKey()).intValue();
                if (intValue >= 0) {
                    Tensor[] tensorArr2 = nativeInterpreterWrapper.write;
                    if (intValue < tensorArr2.length) {
                        Tensor tensor2 = tensorArr2[intValue];
                        if (tensor2 == null) {
                            long j = nativeInterpreterWrapper.MediaBrowserCompat$CustomActionResultReceiver;
                            tensor2 = Tensor.read(j, NativeInterpreterWrapper.getOutputTensorIndex(j, intValue));
                            tensorArr2[intValue] = tensor2;
                        }
                        Object value = next.getValue();
                        tensor2.MediaBrowserCompat$CustomActionResultReceiver(value);
                        if (value instanceof ByteBuffer) {
                            ((ByteBuffer) value).put(Tensor.buffer(tensor2.MediaBrowserCompat$CustomActionResultReceiver).order(ByteOrder.nativeOrder()));
                        } else {
                            Tensor.readMultiDimensionalArray(tensor2.MediaBrowserCompat$CustomActionResultReceiver, value);
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid output Tensor index: ");
                sb.append(intValue);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    @Deprecated
    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.write;
        if (nativeInterpreterWrapper != null) {
            NativeInterpreterWrapper.useNNAPI(nativeInterpreterWrapper.MediaBrowserCompat$CustomActionResultReceiver, z);
            return;
        }
        throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
    }
}
