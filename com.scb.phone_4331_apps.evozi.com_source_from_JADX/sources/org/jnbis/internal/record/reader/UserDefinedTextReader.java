package org.jnbis.internal.record.reader;

import com.google.android.gms.location.places.Place;
import org.jnbis.internal.NistHelper;
import org.jnbis.record.UserDefinedDescriptiveText;

public class UserDefinedTextReader extends RecordReader {
    public UserDefinedDescriptiveText read(NistHelper.Token token) {
        byte[] bArr;
        int i;
        if (token.pos < token.buffer.length) {
            UserDefinedDescriptiveText userDefinedDescriptiveText = new UserDefinedDescriptiveText();
            do {
                NistHelper.Tag tagInfo = getTagInfo(token);
                if (tagInfo.type == 2) {
                    String nextWord = nextWord(token, NistHelper.TAG_SEP_GSFS, Place.TYPE_SUBLOCALITY_LEVEL_1, true);
                    int i2 = tagInfo.field;
                    switch (i2) {
                        case 1:
                            userDefinedDescriptiveText.setLogicalRecordLength(nextWord);
                            break;
                        case 2:
                            userDefinedDescriptiveText.setImageDesignationCharacter(nextWord);
                            break;
                        case 3:
                            userDefinedDescriptiveText.setField003(nextWord);
                            break;
                        case 4:
                            userDefinedDescriptiveText.setField004(nextWord);
                            break;
                        case 5:
                            userDefinedDescriptiveText.setField005(nextWord);
                            break;
                        case 6:
                            userDefinedDescriptiveText.setField006(nextWord);
                            break;
                        case 7:
                            userDefinedDescriptiveText.setField007(nextWord);
                            break;
                        case 8:
                            userDefinedDescriptiveText.setField008(nextWord);
                            break;
                        case 9:
                            userDefinedDescriptiveText.setField009(nextWord);
                            break;
                        case 10:
                            userDefinedDescriptiveText.setField010(nextWord);
                            break;
                        case 11:
                            userDefinedDescriptiveText.setField011(nextWord);
                            break;
                        case 12:
                            userDefinedDescriptiveText.setField012(nextWord);
                            break;
                        case 13:
                            userDefinedDescriptiveText.setField013(nextWord);
                            break;
                        case 14:
                            userDefinedDescriptiveText.setField014(nextWord);
                            break;
                        case 15:
                            userDefinedDescriptiveText.setField015(nextWord);
                            break;
                        case 16:
                            userDefinedDescriptiveText.setField016(nextWord);
                            break;
                        case 17:
                            userDefinedDescriptiveText.setField017(nextWord);
                            break;
                        case 18:
                            userDefinedDescriptiveText.setField018(nextWord);
                            break;
                        default:
                            switch (i2) {
                                case 20:
                                    userDefinedDescriptiveText.setField020(nextWord);
                                    break;
                                case 21:
                                    userDefinedDescriptiveText.setField021(nextWord);
                                    break;
                                case 22:
                                    userDefinedDescriptiveText.setField022(nextWord);
                                    break;
                                case 23:
                                    userDefinedDescriptiveText.setField023(nextWord);
                                    break;
                                case 24:
                                    userDefinedDescriptiveText.setField024(nextWord);
                                    break;
                                case 25:
                                    userDefinedDescriptiveText.setField025(nextWord);
                                    break;
                                case 26:
                                    userDefinedDescriptiveText.setField026(nextWord);
                                    break;
                                case 27:
                                    userDefinedDescriptiveText.setField027(nextWord);
                                    break;
                                case 28:
                                    userDefinedDescriptiveText.setField028(nextWord);
                                    break;
                                case 29:
                                    userDefinedDescriptiveText.setField029(nextWord);
                                    break;
                                case 30:
                                    userDefinedDescriptiveText.setField030(nextWord);
                                    break;
                                case 31:
                                    userDefinedDescriptiveText.setField031(nextWord);
                                    break;
                                case 32:
                                    userDefinedDescriptiveText.setField032(nextWord);
                                    break;
                                case 33:
                                    userDefinedDescriptiveText.setField033(nextWord);
                                    break;
                                case 34:
                                    userDefinedDescriptiveText.setField034(nextWord);
                                    break;
                                case 35:
                                    userDefinedDescriptiveText.setField035(nextWord);
                                    break;
                                case 36:
                                    userDefinedDescriptiveText.setField036(nextWord);
                                    break;
                                case 37:
                                    userDefinedDescriptiveText.setField037(nextWord);
                                    break;
                                case 38:
                                    userDefinedDescriptiveText.setField038(nextWord);
                                    break;
                                case 39:
                                    userDefinedDescriptiveText.setField039(nextWord);
                                    break;
                                case 40:
                                    userDefinedDescriptiveText.setField040(nextWord);
                                    break;
                                case 41:
                                    userDefinedDescriptiveText.setField041(nextWord);
                                    break;
                                case 42:
                                    userDefinedDescriptiveText.setField042(nextWord);
                                    break;
                                case 43:
                                    userDefinedDescriptiveText.setField043(nextWord);
                                    break;
                                case 44:
                                    userDefinedDescriptiveText.setField044(nextWord);
                                    break;
                                case 45:
                                    userDefinedDescriptiveText.setField045(nextWord);
                                    break;
                                case 46:
                                    userDefinedDescriptiveText.setField046(nextWord);
                                    break;
                                case 47:
                                    userDefinedDescriptiveText.setField047(nextWord);
                                    break;
                                case 48:
                                    userDefinedDescriptiveText.setField048(nextWord);
                                    break;
                                case 49:
                                    userDefinedDescriptiveText.setField049(nextWord);
                                    break;
                                case 50:
                                    userDefinedDescriptiveText.setField050(nextWord);
                                    break;
                                case 51:
                                    userDefinedDescriptiveText.setField051(nextWord);
                                    break;
                                case 52:
                                    userDefinedDescriptiveText.setField052(nextWord);
                                    break;
                                case 53:
                                    userDefinedDescriptiveText.setField053(nextWord);
                                    break;
                                case 54:
                                    userDefinedDescriptiveText.setField054(nextWord);
                                    break;
                                case 55:
                                    userDefinedDescriptiveText.setField055(nextWord);
                                    break;
                                case 56:
                                    userDefinedDescriptiveText.setField056(nextWord);
                                    break;
                                case 57:
                                    userDefinedDescriptiveText.setField057(nextWord);
                                    break;
                                case 58:
                                    userDefinedDescriptiveText.setField058(nextWord);
                                    break;
                                case 59:
                                    userDefinedDescriptiveText.setField059(nextWord);
                                    break;
                                case 60:
                                    userDefinedDescriptiveText.setField060(nextWord);
                                    break;
                                case 61:
                                    userDefinedDescriptiveText.setField061(nextWord);
                                    break;
                                case 62:
                                    userDefinedDescriptiveText.setField062(nextWord);
                                    break;
                                case 63:
                                    userDefinedDescriptiveText.setField063(nextWord);
                                    break;
                                case 64:
                                    userDefinedDescriptiveText.setField064(nextWord);
                                    break;
                                case 65:
                                    userDefinedDescriptiveText.setField065(nextWord);
                                    break;
                                case 66:
                                    userDefinedDescriptiveText.setField066(nextWord);
                                    break;
                                case 67:
                                    userDefinedDescriptiveText.setField067(nextWord);
                                    break;
                                case 68:
                                    userDefinedDescriptiveText.setField068(nextWord);
                                    break;
                                case 69:
                                    userDefinedDescriptiveText.setField069(nextWord);
                                    break;
                                case 70:
                                    userDefinedDescriptiveText.setField070(nextWord);
                                    break;
                                case 71:
                                    userDefinedDescriptiveText.setField071(nextWord);
                                    break;
                                case 72:
                                    userDefinedDescriptiveText.setField072(nextWord);
                                    break;
                                case 73:
                                    userDefinedDescriptiveText.setField073(nextWord);
                                    break;
                                case 74:
                                    userDefinedDescriptiveText.setField074(nextWord);
                                    break;
                                case 75:
                                    userDefinedDescriptiveText.setField075(nextWord);
                                    break;
                                case 76:
                                    userDefinedDescriptiveText.setField076(nextWord);
                                    break;
                                case 77:
                                    userDefinedDescriptiveText.setField077(nextWord);
                                    break;
                                case 78:
                                    userDefinedDescriptiveText.setField078(nextWord);
                                    break;
                                case 79:
                                    userDefinedDescriptiveText.setField079(nextWord);
                                    break;
                                case 80:
                                    userDefinedDescriptiveText.setField080(nextWord);
                                    break;
                                case 81:
                                    userDefinedDescriptiveText.setField081(nextWord);
                                    break;
                                case 82:
                                    userDefinedDescriptiveText.setField082(nextWord);
                                    break;
                                case 83:
                                    userDefinedDescriptiveText.setField083(nextWord);
                                    break;
                                case 84:
                                    userDefinedDescriptiveText.setField084(nextWord);
                                    break;
                                case 85:
                                    userDefinedDescriptiveText.setField085(nextWord);
                                    break;
                                case 86:
                                    userDefinedDescriptiveText.setField086(nextWord);
                                    break;
                                case 87:
                                    userDefinedDescriptiveText.setField087(nextWord);
                                    break;
                                case 88:
                                    userDefinedDescriptiveText.setField088(nextWord);
                                    break;
                                case 89:
                                    userDefinedDescriptiveText.setField089(nextWord);
                                    break;
                                case 90:
                                    userDefinedDescriptiveText.setField090(nextWord);
                                    break;
                                case 91:
                                    userDefinedDescriptiveText.setField091(nextWord);
                                    break;
                                case 92:
                                    userDefinedDescriptiveText.setField092(nextWord);
                                    break;
                                case 93:
                                    userDefinedDescriptiveText.setField093(nextWord);
                                    break;
                                case 94:
                                    userDefinedDescriptiveText.setField094(nextWord);
                                    break;
                                case 95:
                                    userDefinedDescriptiveText.setField095(nextWord);
                                    break;
                                case 96:
                                    userDefinedDescriptiveText.setField096(nextWord);
                                    break;
                                case 97:
                                    userDefinedDescriptiveText.setField097(nextWord);
                                    break;
                                case 98:
                                    userDefinedDescriptiveText.setField098(nextWord);
                                    break;
                                case 99:
                                    userDefinedDescriptiveText.setField099(nextWord);
                                    break;
                                case 100:
                                    userDefinedDescriptiveText.setField100(nextWord);
                                    break;
                                default:
                                    switch (i2) {
                                        case 901:
                                            userDefinedDescriptiveText.setField901(nextWord);
                                            break;
                                        case 902:
                                            userDefinedDescriptiveText.setField902(nextWord);
                                            break;
                                        case 903:
                                            userDefinedDescriptiveText.setField903(nextWord);
                                            break;
                                        case 904:
                                            userDefinedDescriptiveText.setField904(nextWord);
                                            break;
                                        case 905:
                                            userDefinedDescriptiveText.setField905(nextWord);
                                            break;
                                        case 906:
                                            userDefinedDescriptiveText.setField906(nextWord);
                                            break;
                                        case 907:
                                            userDefinedDescriptiveText.setField907(nextWord);
                                            break;
                                        case 908:
                                            userDefinedDescriptiveText.setField908(nextWord);
                                            break;
                                        case 909:
                                            userDefinedDescriptiveText.setField909(nextWord);
                                            break;
                                        case 910:
                                            userDefinedDescriptiveText.setField910(nextWord);
                                            break;
                                        case 911:
                                            userDefinedDescriptiveText.setField911(nextWord);
                                            break;
                                        case 912:
                                            userDefinedDescriptiveText.setField912(nextWord);
                                            break;
                                        case 913:
                                            userDefinedDescriptiveText.setField913(nextWord);
                                            break;
                                        case 914:
                                            userDefinedDescriptiveText.setField914(nextWord);
                                            break;
                                        case 915:
                                            userDefinedDescriptiveText.setField915(nextWord);
                                            break;
                                        case 916:
                                            userDefinedDescriptiveText.setField916(nextWord);
                                            break;
                                        case 917:
                                            userDefinedDescriptiveText.setField917(nextWord);
                                            break;
                                        case 918:
                                            userDefinedDescriptiveText.setField918(nextWord);
                                            break;
                                        case 919:
                                            userDefinedDescriptiveText.setField919(nextWord);
                                            break;
                                        case 920:
                                            userDefinedDescriptiveText.setField920(nextWord);
                                            break;
                                        case 921:
                                            userDefinedDescriptiveText.setField921(nextWord);
                                            break;
                                        case 922:
                                            userDefinedDescriptiveText.setField922(nextWord);
                                            break;
                                        case 923:
                                            userDefinedDescriptiveText.setField923(nextWord);
                                            break;
                                        case 924:
                                            userDefinedDescriptiveText.setField924(nextWord);
                                            break;
                                        case 925:
                                            userDefinedDescriptiveText.setField925(nextWord);
                                            break;
                                        case 926:
                                            userDefinedDescriptiveText.setField926(nextWord);
                                            break;
                                        case 927:
                                            userDefinedDescriptiveText.setField927(nextWord);
                                            break;
                                        case 928:
                                            userDefinedDescriptiveText.setField928(nextWord);
                                            break;
                                        case 929:
                                            userDefinedDescriptiveText.setField929(nextWord);
                                            break;
                                        case 930:
                                            userDefinedDescriptiveText.setField930(nextWord);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 941:
                                                    userDefinedDescriptiveText.setField941(nextWord);
                                                    break;
                                                case 942:
                                                    userDefinedDescriptiveText.setField942(nextWord);
                                                    break;
                                                case 943:
                                                    userDefinedDescriptiveText.setField943(nextWord);
                                                    break;
                                                case 944:
                                                    userDefinedDescriptiveText.setField944(nextWord);
                                                    break;
                                                case 945:
                                                    userDefinedDescriptiveText.setField945(nextWord);
                                                    break;
                                                case 946:
                                                    userDefinedDescriptiveText.setField946(nextWord);
                                                    break;
                                                case 947:
                                                    userDefinedDescriptiveText.setField947(nextWord);
                                                    break;
                                                case 948:
                                                    userDefinedDescriptiveText.setField948(nextWord);
                                                    break;
                                                case 949:
                                                    userDefinedDescriptiveText.setField949(nextWord);
                                                    break;
                                                case 950:
                                                    userDefinedDescriptiveText.setField950(nextWord);
                                                    break;
                                                case 951:
                                                    userDefinedDescriptiveText.setField951(nextWord);
                                                    break;
                                                case 952:
                                                    userDefinedDescriptiveText.setField952(nextWord);
                                                    break;
                                                case 953:
                                                    userDefinedDescriptiveText.setField953(nextWord);
                                                    break;
                                                case 954:
                                                    userDefinedDescriptiveText.setField954(nextWord);
                                                    break;
                                                case 955:
                                                    userDefinedDescriptiveText.setField955(nextWord);
                                                    break;
                                                case 956:
                                                    userDefinedDescriptiveText.setField956(nextWord);
                                                    break;
                                            }
                                    }
                            }
                    }
                    bArr = token.buffer;
                    i = token.pos;
                    token.pos = i + 1;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("T2::Invalid Record type = ");
                    sb.append(tagInfo.type);
                    throw new RuntimeException(sb.toString());
                }
            } while (bArr[i] != 28);
            return userDefinedDescriptiveText;
        }
        throw new IllegalArgumentException("T1::NULL pointer to T2 record");
    }
}
