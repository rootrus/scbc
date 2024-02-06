package org.jnbis.internal;

import org.jnbis.Bitmap;
import org.jnbis.DecodedData;
import org.jnbis.ImageUtils;
import org.jnbis.internal.NistHelper;
import org.jnbis.internal.record.BaseRecord;
import org.jnbis.internal.record.reader.factory.RecordReaderFactory;
import org.jnbis.record.FacialAndSmtImage;
import org.jnbis.record.HighResolutionBinaryFingerprint;
import org.jnbis.record.HighResolutionGrayscaleFingerprint;
import org.jnbis.record.IrisImage;
import org.jnbis.record.LowResolutionBinaryFingerprint;
import org.jnbis.record.LowResolutionGrayscaleFingerprint;
import org.jnbis.record.MinutiaeData;
import org.jnbis.record.SignatureImage;
import org.jnbis.record.TransactionInformation;
import org.jnbis.record.UserDefinedDescriptiveText;
import org.jnbis.record.UserDefinedImage;
import org.jnbis.record.VariableResolutionFingerprint;
import org.jnbis.record.VariableResolutionLatentImage;
import org.jnbis.record.VariableResolutionPalmprint;

public class InternalNistDecoder {
    private ImageUtils imageUtils = new ImageUtils();
    private RecordReaderFactory readerFactory = new RecordReaderFactory();
    private InternalWsqDecoder wsqDecoder = new InternalWsqDecoder();

    public DecodedData decode(byte[] bArr, DecodedData.Format format) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("data is null or zero length");
        }
        NistHelper.Token token = new NistHelper.Token(bArr);
        InternalDecodedData internalDecodedData = new InternalDecodedData();
        internalDecodedData.putTransactionInfo(Integer.valueOf(internalDecodedData.getTransactionKeys().size()), (TransactionInformation) this.readerFactory.read(token));
        while (nextRecord(token)) {
            if (token.crt >= 2) {
                BaseRecord read = this.readerFactory.read(token);
                if (read instanceof UserDefinedDescriptiveText) {
                    internalDecodedData.putUserDefinedText(Integer.valueOf(internalDecodedData.getUserDefinedTextKeys().size()), (UserDefinedDescriptiveText) read);
                } else if (read instanceof LowResolutionGrayscaleFingerprint) {
                    internalDecodedData.putLowResGrayscaleFingerPrint(Integer.valueOf(internalDecodedData.getLowResGrayscaleFingerPrintKeys().size()), (LowResolutionGrayscaleFingerprint) read);
                } else if (read instanceof HighResolutionGrayscaleFingerprint) {
                    HighResolutionGrayscaleFingerprint highResolutionGrayscaleFingerprint = (HighResolutionGrayscaleFingerprint) read;
                    if (WsqHelper.isWsqFormat(highResolutionGrayscaleFingerprint.getImageData())) {
                        Bitmap decode = this.wsqDecoder.decode(highResolutionGrayscaleFingerprint.getImageData());
                        int i = C105061.$SwitchMap$org$jnbis$DecodedData$Format[format.ordinal()];
                        if (i == 1) {
                            highResolutionGrayscaleFingerprint.setImageData(this.imageUtils.bitmap2jpeg(decode));
                        } else if (i == 2) {
                            highResolutionGrayscaleFingerprint.setImageData(this.imageUtils.bitmap2gif(decode));
                        } else if (i == 3) {
                            highResolutionGrayscaleFingerprint.setImageData(this.imageUtils.bitmap2png(decode));
                        } else {
                            throw new RuntimeException("unsupported image format.");
                        }
                    }
                    internalDecodedData.putHiResGrayscaleFingerPrint(Integer.valueOf(internalDecodedData.getHiResGrayscaleFingerPrintKeys().size()), highResolutionGrayscaleFingerprint);
                } else if (read instanceof LowResolutionBinaryFingerprint) {
                    internalDecodedData.putLowResBinaryFingerPrint(Integer.valueOf(internalDecodedData.getLowResBinaryFingerPrintKeys().size()), (LowResolutionBinaryFingerprint) read);
                } else if (read instanceof HighResolutionBinaryFingerprint) {
                    internalDecodedData.putHiResBinaryFingerPrint(Integer.valueOf(internalDecodedData.getHiResBinaryFingerPrintKeys().size()), (HighResolutionBinaryFingerprint) read);
                } else if (read instanceof UserDefinedImage) {
                    internalDecodedData.putUserDefinedImage(Integer.valueOf(internalDecodedData.getUserDefinedImageKeys().size()), (UserDefinedImage) read);
                } else if (read instanceof SignatureImage) {
                    internalDecodedData.putSignature(Integer.valueOf(internalDecodedData.getSignatureKeys().size()), (SignatureImage) read);
                } else if (read instanceof MinutiaeData) {
                    internalDecodedData.putMinutiaeData(Integer.valueOf(internalDecodedData.getMinutiaeDataKeys().size()), (MinutiaeData) read);
                } else if (read instanceof FacialAndSmtImage) {
                    internalDecodedData.putFacialSmtImage(Integer.valueOf(internalDecodedData.getFacialSmtKeys().size()), (FacialAndSmtImage) read);
                } else if (read instanceof VariableResolutionLatentImage) {
                    internalDecodedData.putVariableResLatentImage(Integer.valueOf(internalDecodedData.getVariableResLatentImageKeys().size()), (VariableResolutionLatentImage) read);
                } else if (read instanceof VariableResolutionFingerprint) {
                    internalDecodedData.putVariableResFingerprint(Integer.valueOf(internalDecodedData.getVariableResFingerprintKeys().size()), (VariableResolutionFingerprint) read);
                } else if (read instanceof VariableResolutionPalmprint) {
                    internalDecodedData.putVariableResPalmprint(Integer.valueOf(internalDecodedData.getVariableResPalmprintKeys().size()), (VariableResolutionPalmprint) read);
                } else if (read instanceof IrisImage) {
                    internalDecodedData.putIrisImage(Integer.valueOf(internalDecodedData.getIrisImageKeys().size()), (IrisImage) read);
                }
            }
        }
        return internalDecodedData;
    }

    /* renamed from: org.jnbis.internal.InternalNistDecoder$1 */
    static /* synthetic */ class C105061 {
        static final /* synthetic */ int[] $SwitchMap$org$jnbis$DecodedData$Format;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                org.jnbis.DecodedData$Format[] r0 = org.jnbis.DecodedData.Format.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jnbis$DecodedData$Format = r0
                org.jnbis.DecodedData$Format r1 = org.jnbis.DecodedData.Format.JPEG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$org$jnbis$DecodedData$Format     // Catch:{ NoSuchFieldError -> 0x001d }
                org.jnbis.DecodedData$Format r1 = org.jnbis.DecodedData.Format.GIF     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$org$jnbis$DecodedData$Format     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.jnbis.DecodedData$Format r1 = org.jnbis.DecodedData.Format.PNG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jnbis.internal.InternalNistDecoder.C105061.<clinit>():void");
        }
    }

    private boolean nextRecord(NistHelper.Token token) {
        if (token.header.length() == 0) {
            return false;
        }
        int indexOf = token.header.indexOf(30);
        if (indexOf == -1) {
            indexOf = token.header.length() - 1;
        }
        token.crt = Integer.parseInt(token.header.substring(0, token.header.indexOf(31)));
        token.header = token.header.substring(indexOf + 1);
        return true;
    }
}
