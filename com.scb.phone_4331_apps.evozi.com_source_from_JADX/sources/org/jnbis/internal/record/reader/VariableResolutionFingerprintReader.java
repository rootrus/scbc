package org.jnbis.internal.record.reader;

import com.google.android.gms.location.places.Place;
import org.jnbis.internal.NistHelper;
import org.jnbis.record.VariableResolutionFingerprint;

public class VariableResolutionFingerprintReader extends RecordReader {
    public VariableResolutionFingerprint read(NistHelper.Token token) {
        if (token.pos < token.buffer.length) {
            VariableResolutionFingerprint variableResolutionFingerprint = new VariableResolutionFingerprint();
            int i = token.pos;
            NistHelper.Tag tagInfo = getTagInfo(token);
            if (tagInfo.field == 1) {
                Integer valueOf = Integer.valueOf(Integer.parseInt(nextWord(token, NistHelper.TAG_SEP_GSFS, Place.TYPE_SUBLOCALITY_LEVEL_1, false)));
                variableResolutionFingerprint.setLogicalRecordLength(valueOf.toString());
                while (true) {
                    token.pos++;
                    NistHelper.Tag tagInfo2 = getTagInfo(token);
                    if (tagInfo2.field != 999) {
                        String nextWord = nextWord(token, NistHelper.TAG_SEP_GSFS, Place.TYPE_SUBLOCALITY_LEVEL_1, false);
                        switch (tagInfo2.field) {
                            case 1:
                                variableResolutionFingerprint.setLogicalRecordLength(nextWord);
                                break;
                            case 2:
                                variableResolutionFingerprint.setImageDesignationCharacter(nextWord);
                                break;
                            case 3:
                                variableResolutionFingerprint.setImpressionType(nextWord);
                                break;
                            case 4:
                                variableResolutionFingerprint.setSourceAgency(nextWord);
                                break;
                            case 5:
                                variableResolutionFingerprint.setCaptureDate(nextWord);
                                break;
                            case 6:
                                variableResolutionFingerprint.setHorizontalLineLength(nextWord);
                                break;
                            case 7:
                                variableResolutionFingerprint.setVerticalLineLength(nextWord);
                                break;
                            case 8:
                                variableResolutionFingerprint.setScaleUnits(nextWord);
                                break;
                            case 9:
                                variableResolutionFingerprint.setHorizontalPixelScale(nextWord);
                                break;
                            case 10:
                                variableResolutionFingerprint.setVerticalPixelScale(nextWord);
                                break;
                            case 11:
                                variableResolutionFingerprint.setCompressionAlgorithm(nextWord);
                                break;
                            case 12:
                                variableResolutionFingerprint.setBitsPerPixel(nextWord);
                                break;
                            case 13:
                                variableResolutionFingerprint.setFingerPosition(nextWord);
                                break;
                            case 14:
                                variableResolutionFingerprint.setPrintPositionDescriptors(nextWord);
                                break;
                            case 15:
                                variableResolutionFingerprint.setPrintPositionCoordinates(nextWord);
                                break;
                            case 16:
                                variableResolutionFingerprint.setScannedHorizontalPixelScale(nextWord);
                                break;
                            case 17:
                                variableResolutionFingerprint.setScannedVerticalPixelScale(nextWord);
                                break;
                            case 18:
                                variableResolutionFingerprint.setAmputatedOrBandaged(nextWord);
                                break;
                            case 20:
                                variableResolutionFingerprint.setComment(nextWord);
                                break;
                            case 21:
                                variableResolutionFingerprint.setFingerprintSegmentationPosition(nextWord);
                                break;
                            case 22:
                                variableResolutionFingerprint.setNistQualityMetric(nextWord);
                                break;
                            case 23:
                                variableResolutionFingerprint.setSegmentationQualityMetric(nextWord);
                                break;
                            case 24:
                                variableResolutionFingerprint.setFingerprintQualityMetric(nextWord);
                                break;
                            case 25:
                                variableResolutionFingerprint.setAlternateFingerSegmentPosition(nextWord);
                                break;
                            case 30:
                                variableResolutionFingerprint.setDeviceMonitoringMode(nextWord);
                                break;
                        }
                    } else {
                        int intValue = valueOf.intValue() - (token.pos - i);
                        byte[] bArr = new byte[intValue];
                        System.arraycopy(token.buffer, token.pos, bArr, 0, intValue);
                        token.pos += intValue;
                        variableResolutionFingerprint.setImageData(bArr);
                        return variableResolutionFingerprint;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("T14::Invalid Record type = ");
                sb.append(tagInfo.type);
                throw new RuntimeException(sb.toString());
            }
        } else {
            throw new RuntimeException("T14::NULL pointer to T14 record");
        }
    }
}
