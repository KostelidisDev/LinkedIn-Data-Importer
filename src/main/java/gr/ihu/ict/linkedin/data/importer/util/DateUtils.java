package gr.ihu.ict.linkedin.data.importer.util;

import io.vavr.collection.List;
import io.vavr.control.Try;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtils {
    public static Date parseDate(final String date) {
        if(date.isEmpty()) {
            return null;
        }

        final List<SimpleDateFormat> supportedFormats = List.of(
                new SimpleDateFormat("MM d, yyyy"),
                new SimpleDateFormat("MM, yyyy"),
                new SimpleDateFormat("MMM yyyy"),
                new SimpleDateFormat("yyyy-MM-dd"),
                new SimpleDateFormat("yyyy-MM"),
                new SimpleDateFormat("yyyy")
        );

        final List<Date> possibleValidDates = supportedFormats
                .map(format -> Try.of(() -> format.parse(date)))
                .filter(Try::isSuccess)
                .map(Try::get);

        if (possibleValidDates.isEmpty()) {
            return null;
        }

        return possibleValidDates.get(0);
    }
}
