package org.jnbis.internal;

import java.util.HashMap;
import java.util.Set;
import org.jnbis.DecodedData;
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

public class InternalDecodedData extends DecodedData {
    private final HashMap<Integer, FacialAndSmtImage> facialAndSmtImage = new HashMap<>();
    private final HashMap<Integer, HighResolutionBinaryFingerprint> hiResolutionBinaryFingerprint = new HashMap<>();
    private final HashMap<Integer, HighResolutionGrayscaleFingerprint> hiResolutionGrayscaleFingerprint = new HashMap<>();
    private final HashMap<Integer, IrisImage> irisImage = new HashMap<>();
    private final HashMap<Integer, LowResolutionBinaryFingerprint> lowResolutionBinaryFingerprint = new HashMap<>();
    private final HashMap<Integer, LowResolutionGrayscaleFingerprint> lowResolutionGrayscaleFingerprint = new HashMap<>();
    private final HashMap<Integer, MinutiaeData> minutiaeData = new HashMap<>();
    private final HashMap<Integer, SignatureImage> signatureImage = new HashMap<>();
    private final HashMap<Integer, TransactionInformation> transactionInformation = new HashMap<>();
    private final HashMap<Integer, UserDefinedImage> userDefinedImage = new HashMap<>();
    private final HashMap<Integer, UserDefinedDescriptiveText> userDefinedText = new HashMap<>();
    private final HashMap<Integer, VariableResolutionFingerprint> variableResolutionFingerprint = new HashMap<>();
    private final HashMap<Integer, VariableResolutionLatentImage> variableResolutionLatentImage = new HashMap<>();
    private final HashMap<Integer, VariableResolutionPalmprint> variableResolutionPalmprint = new HashMap<>();

    /* access modifiers changed from: package-private */
    public void putTransactionInfo(Integer num, TransactionInformation transactionInformation2) {
        this.transactionInformation.put(num, transactionInformation2);
    }

    /* access modifiers changed from: package-private */
    public void putUserDefinedText(Integer num, UserDefinedDescriptiveText userDefinedDescriptiveText) {
        this.userDefinedText.put(num, userDefinedDescriptiveText);
    }

    /* access modifiers changed from: package-private */
    public void putLowResGrayscaleFingerPrint(Integer num, LowResolutionGrayscaleFingerprint lowResolutionGrayscaleFingerprint2) {
        this.lowResolutionGrayscaleFingerprint.put(num, lowResolutionGrayscaleFingerprint2);
    }

    /* access modifiers changed from: package-private */
    public void putHiResGrayscaleFingerPrint(Integer num, HighResolutionGrayscaleFingerprint highResolutionGrayscaleFingerprint) {
        this.hiResolutionGrayscaleFingerprint.put(num, highResolutionGrayscaleFingerprint);
    }

    /* access modifiers changed from: package-private */
    public void putLowResBinaryFingerPrint(Integer num, LowResolutionBinaryFingerprint lowResolutionBinaryFingerprint2) {
        this.lowResolutionBinaryFingerprint.put(num, lowResolutionBinaryFingerprint2);
    }

    /* access modifiers changed from: package-private */
    public void putHiResBinaryFingerPrint(Integer num, HighResolutionBinaryFingerprint highResolutionBinaryFingerprint) {
        this.hiResolutionBinaryFingerprint.put(num, highResolutionBinaryFingerprint);
    }

    /* access modifiers changed from: package-private */
    public void putUserDefinedImage(Integer num, UserDefinedImage userDefinedImage2) {
        this.userDefinedImage.put(num, userDefinedImage2);
    }

    /* access modifiers changed from: package-private */
    public void putSignature(Integer num, SignatureImage signatureImage2) {
        this.signatureImage.put(num, signatureImage2);
    }

    /* access modifiers changed from: package-private */
    public void putMinutiaeData(Integer num, MinutiaeData minutiaeData2) {
        this.minutiaeData.put(num, minutiaeData2);
    }

    /* access modifiers changed from: package-private */
    public void putFacialSmtImage(Integer num, FacialAndSmtImage facialAndSmtImage2) {
        this.facialAndSmtImage.put(num, facialAndSmtImage2);
    }

    /* access modifiers changed from: package-private */
    public void putVariableResLatentImage(Integer num, VariableResolutionLatentImage variableResolutionLatentImage2) {
        this.variableResolutionLatentImage.put(num, variableResolutionLatentImage2);
    }

    /* access modifiers changed from: package-private */
    public void putVariableResFingerprint(Integer num, VariableResolutionFingerprint variableResolutionFingerprint2) {
        this.variableResolutionFingerprint.put(num, variableResolutionFingerprint2);
    }

    /* access modifiers changed from: package-private */
    public void putVariableResPalmprint(Integer num, VariableResolutionPalmprint variableResolutionPalmprint2) {
        this.variableResolutionPalmprint.put(num, variableResolutionPalmprint2);
    }

    /* access modifiers changed from: package-private */
    public void putIrisImage(Integer num, IrisImage irisImage2) {
        this.irisImage.put(num, irisImage2);
    }

    public Set<Integer> getTransactionKeys() {
        return this.transactionInformation.keySet();
    }

    public Set<Integer> getUserDefinedTextKeys() {
        return this.userDefinedText.keySet();
    }

    public Set<Integer> getLowResBinaryFingerPrintKeys() {
        return this.lowResolutionBinaryFingerprint.keySet();
    }

    public Set<Integer> getHiResBinaryFingerPrintKeys() {
        return this.hiResolutionBinaryFingerprint.keySet();
    }

    public Set<Integer> getLowResGrayscaleFingerPrintKeys() {
        return this.lowResolutionGrayscaleFingerprint.keySet();
    }

    public Set<Integer> getHiResGrayscaleFingerPrintKeys() {
        return this.hiResolutionGrayscaleFingerprint.keySet();
    }

    public Set<Integer> getUserDefinedImageKeys() {
        return this.userDefinedImage.keySet();
    }

    public Set<Integer> getSignatureKeys() {
        return this.signatureImage.keySet();
    }

    public Set<Integer> getMinutiaeDataKeys() {
        return this.minutiaeData.keySet();
    }

    public Set<Integer> getFacialSmtKeys() {
        return this.facialAndSmtImage.keySet();
    }

    public Set<Integer> getVariableResLatentImageKeys() {
        return this.variableResolutionLatentImage.keySet();
    }

    public Set<Integer> getVariableResFingerprintKeys() {
        return this.variableResolutionFingerprint.keySet();
    }

    public Set<Integer> getVariableResPalmprintKeys() {
        return this.variableResolutionPalmprint.keySet();
    }

    public Set<Integer> getIrisImageKeys() {
        return this.irisImage.keySet();
    }

    public TransactionInformation getTransactionInfo(Integer num) {
        if (this.transactionInformation.containsKey(num)) {
            return this.transactionInformation.get(num);
        }
        return null;
    }

    public UserDefinedDescriptiveText getUserDefinedText(Integer num) {
        if (this.userDefinedText.containsKey(num)) {
            return this.userDefinedText.get(num);
        }
        return null;
    }

    public LowResolutionGrayscaleFingerprint getLowResGrayscaleFingerprint(Integer num) {
        if (this.lowResolutionGrayscaleFingerprint.containsKey(num)) {
            return this.lowResolutionGrayscaleFingerprint.get(num);
        }
        return null;
    }

    public HighResolutionGrayscaleFingerprint getHiResGrayscaleFingerprint(Integer num) {
        if (this.hiResolutionGrayscaleFingerprint.containsKey(num)) {
            return this.hiResolutionGrayscaleFingerprint.get(num);
        }
        return null;
    }

    public LowResolutionBinaryFingerprint getLowResBinaryFingerprint(Integer num) {
        if (this.lowResolutionBinaryFingerprint.containsKey(num)) {
            return this.lowResolutionBinaryFingerprint.get(num);
        }
        return null;
    }

    public HighResolutionBinaryFingerprint getHiResBinaryFingerprint(Integer num) {
        if (this.hiResolutionBinaryFingerprint.containsKey(num)) {
            return this.hiResolutionBinaryFingerprint.get(num);
        }
        return null;
    }

    public UserDefinedImage getUserDefinedImage(Integer num) {
        if (this.userDefinedImage.containsKey(num)) {
            return this.userDefinedImage.get(num);
        }
        return null;
    }

    public SignatureImage getSignature(Integer num) {
        if (this.signatureImage.containsKey(num)) {
            return this.signatureImage.get(num);
        }
        return null;
    }

    public MinutiaeData getMinutiaeData(Integer num) {
        if (this.minutiaeData.containsKey(num)) {
            return this.minutiaeData.get(num);
        }
        return null;
    }

    public FacialAndSmtImage getFacialAndSmtImage(Integer num) {
        if (this.facialAndSmtImage.containsKey(num)) {
            return this.facialAndSmtImage.get(num);
        }
        return null;
    }

    public VariableResolutionLatentImage getVariableResLatentImage(Integer num) {
        if (this.variableResolutionLatentImage.containsKey(num)) {
            return this.variableResolutionLatentImage.get(num);
        }
        return null;
    }

    public VariableResolutionFingerprint getVariableResFingerprint(Integer num) {
        if (this.variableResolutionFingerprint.containsKey(num)) {
            return this.variableResolutionFingerprint.get(num);
        }
        return null;
    }

    public VariableResolutionPalmprint getVariableResPalmprint(Integer num) {
        if (this.variableResolutionPalmprint.containsKey(num)) {
            return this.variableResolutionPalmprint.get(num);
        }
        return null;
    }

    public IrisImage getIrisImage(Integer num) {
        if (this.irisImage.containsKey(num)) {
            return this.irisImage.get(num);
        }
        return null;
    }
}
