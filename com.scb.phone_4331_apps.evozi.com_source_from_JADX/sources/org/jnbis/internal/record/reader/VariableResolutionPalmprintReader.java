package org.jnbis.internal.record.reader;

import com.google.android.gms.location.places.Place;
import org.jnbis.internal.NistHelper;
import org.jnbis.record.VariableResolutionPalmprint;

public class VariableResolutionPalmprintReader extends RecordReader {
    public VariableResolutionPalmprint read(NistHelper.Token token) {
        if (token.pos < token.buffer.length) {
            VariableResolutionPalmprint variableResolutionPalmprint = new VariableResolutionPalmprint();
            int i = token.pos;
            NistHelper.Tag tagInfo = getTagInfo(token);
            if (tagInfo.field == 1) {
                Integer valueOf = Integer.valueOf(Integer.parseInt(nextWord(token, NistHelper.TAG_SEP_GSFS, Place.TYPE_SUBLOCALITY_LEVEL_1, false)));
                variableResolutionPalmprint.setLogicalRecordLength(valueOf.toString());
                while (true) {
                    token.pos++;
                    NistHelper.Tag tagInfo2 = getTagInfo(token);
                    if (tagInfo2.field == 999) {
                        int intValue = valueOf.intValue() - (token.pos - i);
                        byte[] bArr = new byte[intValue];
                        System.arraycopy(token.buffer, token.pos, bArr, 0, intValue);
                        token.pos += intValue;
                        variableResolutionPalmprint.setImageData(bArr);
                        return variableResolutionPalmprint;
                    }
                    String nextWord = nextWord(token, NistHelper.TAG_SEP_GSFS, Place.TYPE_SUBLOCALITY_LEVEL_1, false);
                    int i2 = tagInfo2.field;
                    if (i2 == 16) {
                        variableResolutionPalmprint.setScannedHorizontalPixelScale(nextWord);
                    } else if (i2 == 17) {
                        variableResolutionPalmprint.setScannedVerticalPixelScale(nextWord);
                    } else if (i2 == 20) {
                        variableResolutionPalmprint.setComment(nextWord);
                    } else if (i2 == 24) {
                        variableResolutionPalmprint.setPalmprintQualityMetric(nextWord);
                    } else if (i2 != 30) {
                        switch (i2) {
                            case 1:
                                variableResolutionPalmprint.setLogicalRecordLength(nextWord);
                                break;
                            case 2:
                                variableResolutionPalmprint.setImageDesignationCharacter(nextWord);
                                break;
                            case 3:
                                variableResolutionPalmprint.setImpressionType(nextWord);
                                break;
                            case 4:
                                variableResolutionPalmprint.setSourceAgency(nextWord);
                                break;
                            case 5:
                                variableResolutionPalmprint.setCaptureDate(nextWord);
                                break;
                            case 6:
                                variableResolutionPalmprint.setHorizontalLineLength(nextWord);
                                break;
                            case 7:
                                variableResolutionPalmprint.setVerticalLineLength(nextWord);
                                break;
                            case 8:
                                variableResolutionPalmprint.setScaleUnits(nextWord);
                                break;
                            case 9:
                                variableResolutionPalmprint.setHorizontalPixelScale(nextWord);
                                break;
                            case 10:
                                variableResolutionPalmprint.setVerticalPixelScale(nextWord);
                                break;
                            case 11:
                                variableResolutionPalmprint.setCompressionAlgorithm(nextWord);
                                break;
                            case 12:
                                variableResolutionPalmprint.setBitsPerPixel(nextWord);
                                break;
                            case 13:
                                variableResolutionPalmprint.setPalmprintPosition(nextWord);
                                break;
                        }
                    } else {
                        variableResolutionPalmprint.setDeviceMonitoringMode(nextWord);
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
