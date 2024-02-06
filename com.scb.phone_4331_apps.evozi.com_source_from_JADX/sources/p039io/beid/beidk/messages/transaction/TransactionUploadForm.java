package p039io.beid.beidk.messages.transaction;

import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.util.EnumMap;
import java.util.UUID;
import org.jmrtd.lds.ImageInfo;
import p039io.beid.beidk.definitions.BeIDParams;
import p039io.beid.beidk.definitions.TransactionUploadFileType;
import p040o.nScriptSetVarJ;
import p040o.nScriptSetVarVE;
import p040o.rsnAllocationCopyFromBitmap;
import p040o.rsnAllocationCopyToBitmap;

/* renamed from: io.beid.beidk.messages.transaction.TransactionUploadForm */
public final class TransactionUploadForm {
    private static final EnumMap<TransactionUploadFileType, String> read;
    private TransactionUploadFileType IconCompatParcelizer;
    private InputStream MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$ItemReceiver;
    private String write;

    static {
        EnumMap<TransactionUploadFileType, String> enumMap = new EnumMap<>(TransactionUploadFileType.class);
        read = enumMap;
        enumMap.put(TransactionUploadFileType.CITIZEN, "citizen.jpg");
        read.put(TransactionUploadFileType.EPASSPORT, "epassport.jpg");
        read.put(TransactionUploadFileType.LIVENESS_1, "liveness1.jpg");
        read.put(TransactionUploadFileType.LIVENESS_2, "liveness2.jpg");
        read.put(TransactionUploadFileType.LIVENESS_3, "liveness3.jpg");
        read.put(TransactionUploadFileType.LIVENESS_4, "liveness4.jpg");
        read.put(TransactionUploadFileType.LIVENESS_5, "liveness5.jpg");
        read.put(TransactionUploadFileType.LIVENESS_6, "liveness6.jpg");
        read.put(TransactionUploadFileType.LIVENESS_7, "liveness7.jpg");
        read.put(TransactionUploadFileType.LIVENESS_8, "liveness8.jpg");
        read.put(TransactionUploadFileType.LIVENESS_9, "liveness9.jpg");
    }

    public final TransactionUploadForm setFileType(TransactionUploadFileType transactionUploadFileType) {
        this.IconCompatParcelizer = transactionUploadFileType;
        return this;
    }

    public final TransactionUploadForm setInputStream(InputStream inputStream) {
        this.MediaBrowserCompat$CustomActionResultReceiver = inputStream;
        return this;
    }

    public final TransactionUploadForm setMeta(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
        return this;
    }

    public final TransactionUploadForm setTransactionId(String str) {
        this.write = str;
        return this;
    }

    public final rsnAllocationCopyToBitmap asMultiplePartFormData() {
        rsnAllocationCopyToBitmap rsnallocationcopytobitmap = new rsnAllocationCopyToBitmap();
        new rsnAllocationCopyFromBitmap("multipart/form-data").read("boundary", UUID.randomUUID().toString());
        rsnAllocationCopyToBitmap.read read2 = new rsnAllocationCopyToBitmap.read();
        new nScriptSetVarVE().MediaBrowserCompat$CustomActionResultReceiver("Content-Disposition", String.format("form-data; name=\"%s\"", new Object[]{BeIDParams.BEID_TRANSACTION_ID}));
        nScriptSetVarJ.IconCompatParcelizer(this.write);
        rsnallocationcopytobitmap.read.add(Preconditions.checkNotNull(read2));
        rsnAllocationCopyToBitmap.read read3 = new rsnAllocationCopyToBitmap.read();
        new nScriptSetVarVE().MediaBrowserCompat$CustomActionResultReceiver("Content-Disposition", String.format("form-data; name=\"%s\"", new Object[]{"fileType"}));
        nScriptSetVarJ.IconCompatParcelizer(this.IconCompatParcelizer.getValue().toString());
        rsnallocationcopytobitmap.read.add(Preconditions.checkNotNull(read3));
        rsnAllocationCopyToBitmap.read read4 = new rsnAllocationCopyToBitmap.read();
        new nScriptSetVarVE().MediaBrowserCompat$CustomActionResultReceiver("Content-Disposition", String.format("form-data; name=\"%s\"", new Object[]{"meta"}));
        nScriptSetVarJ.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
        rsnallocationcopytobitmap.read.add(Preconditions.checkNotNull(read4));
        rsnAllocationCopyToBitmap.read read5 = new rsnAllocationCopyToBitmap.read();
        new nScriptSetVarVE().MediaBrowserCompat$CustomActionResultReceiver("Content-Disposition", String.format("form-data; name=\"file\"; filename=\"%s\"", new Object[]{read.get(this.IconCompatParcelizer)}));
        new nScriptSetVarJ(ImageInfo.JPEG_MIME_TYPE, this.MediaBrowserCompat$CustomActionResultReceiver);
        rsnallocationcopytobitmap.read.add(Preconditions.checkNotNull(read5));
        return rsnallocationcopytobitmap;
    }
}
