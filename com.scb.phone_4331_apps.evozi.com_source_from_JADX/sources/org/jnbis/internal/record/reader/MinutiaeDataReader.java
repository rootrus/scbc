package org.jnbis.internal.record.reader;

import com.google.android.gms.location.places.Place;
import org.jnbis.internal.NistHelper;
import org.jnbis.record.MinutiaeData;

public class MinutiaeDataReader extends RecordReader {
    public MinutiaeData read(NistHelper.Token token) {
        if (token.pos < token.buffer.length) {
            MinutiaeData minutiaeData = new MinutiaeData();
            int i = token.pos;
            NistHelper.Tag tagInfo = getTagInfo(token);
            if (tagInfo.field == 1) {
                int parseInt = Integer.parseInt(nextWord(token, NistHelper.TAG_SEP_GSFS, Place.TYPE_SUBLOCALITY_LEVEL_1, false));
                token.pos++;
                getTagInfo(token);
                int i2 = parseInt - (token.pos - i);
                System.arraycopy(token.buffer, token.pos, new byte[i2], 0, i2);
                token.pos += i2;
                return minutiaeData;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("T9::Invalid Record type = ");
            sb.append(tagInfo.type);
            throw new RuntimeException(sb.toString());
        }
        throw new RuntimeException("T9::NULL pointer to T9 record");
    }

    /* access modifiers changed from: protected */
    public NistHelper.Tag getTagInfo(NistHelper.Token token) {
        String nextWord = nextWord(token, NistHelper.TAG_SEP_DOT, 2, false);
        token.pos++;
        String nextWord2 = nextWord(token, NistHelper.TAG_SEP_COLN, 10, false);
        token.pos++;
        return new NistHelper.Tag(Integer.parseInt(nextWord), Integer.parseInt(nextWord2));
    }
}
