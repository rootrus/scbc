package org.jnbis.internal.record.reader;

import com.google.android.gms.location.places.Place;
import org.jnbis.internal.NistHelper;
import org.jnbis.record.VariableResolutionLatentImage;

public class VariableResolutionLatentImageReader extends RecordReader {
    public VariableResolutionLatentImage read(NistHelper.Token token) {
        if (token.pos < token.buffer.length) {
            VariableResolutionLatentImage variableResolutionLatentImage = new VariableResolutionLatentImage();
            int i = token.pos;
            NistHelper.Tag tagInfo = getTagInfo(token);
            if (tagInfo.field == 1) {
                Integer valueOf = Integer.valueOf(Integer.parseInt(nextWord(token, NistHelper.TAG_SEP_GSFS, Place.TYPE_SUBLOCALITY_LEVEL_1, false)));
                variableResolutionLatentImage.setLogicalRecordLength(valueOf.toString());
                while (true) {
                    token.pos++;
                    NistHelper.Tag tagInfo2 = getTagInfo(token);
                    if (tagInfo2.field == 999) {
                        int intValue = valueOf.intValue() - (token.pos - i);
                        byte[] bArr = new byte[intValue];
                        System.arraycopy(token.buffer, token.pos, bArr, 0, intValue);
                        token.pos += intValue;
                        variableResolutionLatentImage.setImageData(bArr);
                        return variableResolutionLatentImage;
                    }
                    String nextWord = nextWord(token, NistHelper.TAG_SEP_GSFS, Place.TYPE_SUBLOCALITY_LEVEL_1, false);
                    int i2 = tagInfo2.field;
                    if (i2 == 20) {
                        variableResolutionLatentImage.setComment(nextWord);
                    } else if (i2 != 24) {
                        switch (i2) {
                            case 1:
                                variableResolutionLatentImage.setLogicalRecordLength(nextWord);
                                break;
                            case 2:
                                variableResolutionLatentImage.setImageDesignationCharacter(nextWord);
                                break;
                            case 3:
                                variableResolutionLatentImage.setImpressionType(nextWord);
                                break;
                            case 4:
                                variableResolutionLatentImage.setSourceAgency(nextWord);
                                break;
                            case 5:
                                variableResolutionLatentImage.setCaptureDate(nextWord);
                                break;
                            case 6:
                                variableResolutionLatentImage.setHorizontalLineLength(nextWord);
                                break;
                            case 7:
                                variableResolutionLatentImage.setVerticalLineLength(nextWord);
                                break;
                            case 8:
                                variableResolutionLatentImage.setScaleUnits(nextWord);
                                break;
                            case 9:
                                variableResolutionLatentImage.setHorizontalPixelScale(nextWord);
                                break;
                            case 10:
                                variableResolutionLatentImage.setVerticalPixelScale(nextWord);
                                break;
                            case 11:
                                variableResolutionLatentImage.setCompressionAlgorithm(nextWord);
                                break;
                            case 12:
                                variableResolutionLatentImage.setBitsPerPixel(nextWord);
                                break;
                            case 13:
                                variableResolutionLatentImage.setFingerPalmPosition(nextWord);
                                break;
                            case 14:
                                variableResolutionLatentImage.setSearchPositionDescriptors(nextWord);
                                break;
                            case 15:
                                variableResolutionLatentImage.setPrintPositionCoordinates(nextWord);
                                break;
                            case 16:
                                variableResolutionLatentImage.setScannedHorizontalPixelScale(nextWord);
                                break;
                            case 17:
                                variableResolutionLatentImage.setScannedVerticalPixelScale(nextWord);
                                break;
                        }
                    } else {
                        variableResolutionLatentImage.setLatentQualityMetric(nextWord);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("T13::Invalid Record type = ");
                sb.append(tagInfo.type);
                throw new RuntimeException(sb.toString());
            }
        } else {
            throw new RuntimeException("T13::NULL pointer to T13 record");
        }
    }
}
