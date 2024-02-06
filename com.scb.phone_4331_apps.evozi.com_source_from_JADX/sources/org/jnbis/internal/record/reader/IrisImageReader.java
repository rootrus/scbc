package org.jnbis.internal.record.reader;

import com.google.android.gms.location.places.Place;
import org.jnbis.internal.NistHelper;
import org.jnbis.record.IrisImage;

public class IrisImageReader extends RecordReader {
    public IrisImage read(NistHelper.Token token) {
        if (token.pos < token.buffer.length) {
            IrisImage irisImage = new IrisImage();
            int i = token.pos;
            NistHelper.Tag tagInfo = getTagInfo(token);
            if (tagInfo.field == 1) {
                Integer valueOf = Integer.valueOf(Integer.parseInt(nextWord(token, NistHelper.TAG_SEP_GSFS, Place.TYPE_SUBLOCALITY_LEVEL_1, false)));
                irisImage.setLogicalRecordLength(valueOf.toString());
                while (true) {
                    token.pos++;
                    NistHelper.Tag tagInfo2 = getTagInfo(token);
                    if (tagInfo2.field == 999) {
                        int intValue = valueOf.intValue() - (token.pos - i);
                        byte[] bArr = new byte[intValue];
                        System.arraycopy(token.buffer, token.pos, bArr, 0, intValue);
                        token.pos += intValue;
                        irisImage.setImageData(bArr);
                        return irisImage;
                    }
                    String nextWord = nextWord(token, NistHelper.TAG_SEP_GSFS, Place.TYPE_SUBLOCALITY_LEVEL_1, false);
                    int i2 = tagInfo2.field;
                    if (i2 != 30) {
                        switch (i2) {
                            case 1:
                                irisImage.setLogicalRecordLength(nextWord);
                                break;
                            case 2:
                                irisImage.setImageDesignationCharacter(nextWord);
                                break;
                            case 3:
                                irisImage.setFeatureIdentifier(nextWord);
                                break;
                            case 4:
                                irisImage.setSourceAgency(nextWord);
                                break;
                            case 5:
                                irisImage.setCaptureDate(nextWord);
                                break;
                            case 6:
                                irisImage.setHorizontalLineLength(nextWord);
                                break;
                            case 7:
                                irisImage.setVerticalLineLength(nextWord);
                                break;
                            case 8:
                                irisImage.setScaleUnits(nextWord);
                                break;
                            case 9:
                                irisImage.setHorizontalPixelScale(nextWord);
                                break;
                            case 10:
                                irisImage.setVerticalPixelScale(nextWord);
                                break;
                            case 11:
                                irisImage.setCompressionAlgorithm(nextWord);
                                break;
                            case 12:
                                irisImage.setBitsPerPixel(nextWord);
                                break;
                            case 13:
                                irisImage.setColorSpace(nextWord);
                                break;
                            case 14:
                                irisImage.setRotationAngleOfEye(nextWord);
                                break;
                            case 15:
                                irisImage.setRotationUncertainty(nextWord);
                                break;
                            case 16:
                                irisImage.setImagePropertyCode(nextWord);
                                break;
                            case 17:
                                irisImage.setDeviceUniqueIdentifier(nextWord);
                                break;
                            case 18:
                                irisImage.setGlobalUniqueIdentifier(nextWord);
                                break;
                            case 19:
                                irisImage.setMakeModelSerialNumber(nextWord);
                                break;
                            case 20:
                                irisImage.setEyeColor(nextWord);
                                break;
                            case 21:
                                irisImage.setComment(nextWord);
                                break;
                            case 22:
                                irisImage.setScannedHorizontalPixelScale(nextWord);
                                break;
                            case 23:
                                irisImage.setScannedVerticalPixelScale(nextWord);
                                break;
                            case 24:
                                irisImage.setImageQualityScore(nextWord);
                                break;
                            case 25:
                                irisImage.setAcquisitionLightingSpectrum(nextWord);
                                break;
                            case 26:
                                irisImage.setIrisDiameter(nextWord);
                                break;
                        }
                    } else {
                        irisImage.setDeviceMonitoringMode(nextWord);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("T17::Invalid Record type = ");
                sb.append(tagInfo.type);
                throw new RuntimeException(sb.toString());
            }
        } else {
            throw new RuntimeException("T17::NULL pointer to T17 record");
        }
    }
}
