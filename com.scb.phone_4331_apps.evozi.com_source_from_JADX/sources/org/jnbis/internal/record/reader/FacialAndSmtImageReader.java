package org.jnbis.internal.record.reader;

import com.google.android.gms.location.places.Place;
import org.jnbis.internal.NistHelper;
import org.jnbis.record.FacialAndSmtImage;

public class FacialAndSmtImageReader extends RecordReader {
    public FacialAndSmtImage read(NistHelper.Token token) {
        if (token.pos < token.buffer.length) {
            FacialAndSmtImage facialAndSmtImage = new FacialAndSmtImage();
            int i = token.pos;
            NistHelper.Tag tagInfo = getTagInfo(token);
            if (tagInfo.field == 1) {
                Integer valueOf = Integer.valueOf(Integer.parseInt(nextWord(token, NistHelper.TAG_SEP_GSFS, Place.TYPE_SUBLOCALITY_LEVEL_1, false)));
                facialAndSmtImage.setLogicalRecordLength(valueOf.toString());
                while (true) {
                    token.pos++;
                    NistHelper.Tag tagInfo2 = getTagInfo(token);
                    if (tagInfo2.field == 999) {
                        int intValue = valueOf.intValue() - (token.pos - i);
                        byte[] bArr = new byte[intValue];
                        System.arraycopy(token.buffer, token.pos, bArr, 0, intValue);
                        token.pos += intValue;
                        facialAndSmtImage.setImageData(bArr);
                        return facialAndSmtImage;
                    }
                    String nextWord = nextWord(token, NistHelper.TAG_SEP_GSFS, Place.TYPE_SUBLOCALITY_LEVEL_1, false);
                    int i2 = tagInfo2.field;
                    if (i2 == 16) {
                        facialAndSmtImage.setScannedHorizontalPixelScale(nextWord);
                    } else if (i2 != 17) {
                        switch (i2) {
                            case 1:
                                facialAndSmtImage.setLogicalRecordLength(nextWord);
                                break;
                            case 2:
                                facialAndSmtImage.setImageDesignationCharacter(nextWord);
                                break;
                            case 3:
                                facialAndSmtImage.setImageType(nextWord);
                                break;
                            case 4:
                                facialAndSmtImage.setSourceAgency(nextWord);
                                break;
                            case 5:
                                facialAndSmtImage.setPhotoDate(nextWord);
                                break;
                            case 6:
                                facialAndSmtImage.setHorizontalLineLength(nextWord);
                                break;
                            case 7:
                                facialAndSmtImage.setVerticalLineLength(nextWord);
                                break;
                            case 8:
                                facialAndSmtImage.setScaleUnits(nextWord);
                                break;
                            case 9:
                                facialAndSmtImage.setHorizontalPixelScale(nextWord);
                                break;
                            case 10:
                                facialAndSmtImage.setVerticalPixelScale(nextWord);
                                break;
                            case 11:
                                facialAndSmtImage.setCompressionAlgorithm(nextWord);
                                break;
                            case 12:
                                facialAndSmtImage.setColorSpace(nextWord);
                                break;
                            case 13:
                                facialAndSmtImage.setSubjectAcquisitionProfile(nextWord);
                                break;
                            default:
                                switch (i2) {
                                    case 20:
                                        facialAndSmtImage.setSubjectPose(nextWord);
                                        break;
                                    case 21:
                                        facialAndSmtImage.setPoseOffsetAngle(nextWord);
                                        break;
                                    case 22:
                                        facialAndSmtImage.setPhotoDescription(nextWord);
                                        break;
                                    case 23:
                                        facialAndSmtImage.setPhotoAcquisitionSource(nextWord);
                                        break;
                                    case 24:
                                        facialAndSmtImage.setSubjectQualityScore(nextWord);
                                        break;
                                    case 25:
                                        facialAndSmtImage.setSubjectPoseAngles(nextWord);
                                        break;
                                    case 26:
                                        facialAndSmtImage.setSubjectFacialDescription(nextWord);
                                        break;
                                    case 27:
                                        facialAndSmtImage.setSubjectEyeColor(nextWord);
                                        break;
                                    case 28:
                                        facialAndSmtImage.setSubjectHairColor(nextWord);
                                        break;
                                    case 29:
                                        facialAndSmtImage.setFacialFeaturePoints(nextWord);
                                        break;
                                    case 30:
                                        facialAndSmtImage.setDeviceMonitoringMode(nextWord);
                                        break;
                                    default:
                                        switch (i2) {
                                            case 40:
                                                facialAndSmtImage.setNcicDesignationCode(nextWord);
                                                break;
                                            case 41:
                                                facialAndSmtImage.setScarMarkTattooSize(nextWord);
                                                break;
                                            case 42:
                                                facialAndSmtImage.setSmtDescriptors(nextWord);
                                                break;
                                            case 43:
                                                facialAndSmtImage.setColorsPresent(nextWord);
                                                break;
                                        }
                                }
                        }
                    } else {
                        facialAndSmtImage.setScannedVerticalPixelScale(nextWord);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("T10::Invalid Record type = ");
                sb.append(tagInfo.type);
                throw new RuntimeException(sb.toString());
            }
        } else {
            throw new RuntimeException("T10::NULL pointer to T10 record");
        }
    }
}
