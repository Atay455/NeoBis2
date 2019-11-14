package com.atay.kg.neobis.NoteUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class NoteUtils {
    public static String dateFromLong(long time) {
        DateFormat format = new SimpleDateFormat("EEE, dd MMM yyyy 'a' hh:mm aaa", Locale.US);
        return format.format(new Date(time));
    }
}
