package org.jnbis.internal.record.reader;

import com.google.android.gms.location.places.Place;
import org.jnbis.internal.NistHelper;
import org.jnbis.record.TransactionInformation;

public class TransactionInfoReader extends RecordReader {
    public TransactionInformation read(NistHelper.Token token) {
        byte[] bArr;
        int i;
        if (token.pos < token.buffer.length) {
            TransactionInformation transactionInformation = new TransactionInformation();
            do {
                NistHelper.Tag tagInfo = getTagInfo(token);
                if (tagInfo.type == 1) {
                    String nextWord = nextWord(token, NistHelper.TAG_SEP_GSFS, Place.TYPE_SUBLOCALITY_LEVEL_1, false);
                    switch (tagInfo.field) {
                        case 1:
                            transactionInformation.setLogicalRecordLength(nextWord);
                            break;
                        case 2:
                            transactionInformation.setVersion(nextWord);
                            break;
                        case 3:
                            token.header = nextWord;
                            transactionInformation.setFileContent(nextWord);
                            break;
                        case 4:
                            transactionInformation.setTypeOfTransaction(nextWord);
                            break;
                        case 5:
                            transactionInformation.setDate(nextWord);
                            break;
                        case 6:
                            transactionInformation.setPriority(nextWord);
                            break;
                        case 7:
                            transactionInformation.setDestinationAgencyId(nextWord);
                            break;
                        case 8:
                            transactionInformation.setOriginatingAgencyId(nextWord);
                            break;
                        case 9:
                            transactionInformation.setControlNumber(nextWord);
                            break;
                        case 10:
                            transactionInformation.setControlReferenceNumber(nextWord);
                            break;
                        case 11:
                            transactionInformation.setNativeScanningResolution(nextWord);
                            break;
                        case 12:
                            transactionInformation.setNominalTransmittingResolution(nextWord);
                            break;
                        case 13:
                            transactionInformation.setDomainName(nextWord);
                            break;
                        case 14:
                            transactionInformation.setGreenwichMeanTime(nextWord);
                            break;
                        case 15:
                            token.setCharSetDecoder(nextWord);
                            transactionInformation.setDirectoryOfCharsets(nextWord);
                            break;
                    }
                    bArr = token.buffer;
                    i = token.pos;
                    token.pos = i + 1;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("T1::Invalid Record Type : ");
                    sb.append(tagInfo.type);
                    throw new RuntimeException(sb.toString());
                }
            } while (bArr[i] != 28);
            return transactionInformation;
        }
        throw new RuntimeException("T1::NULL pointer to T1 record");
    }
}
