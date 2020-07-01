package com.csfrez.demo.i18n;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

public interface I18nFormatter {

    String formaFullDateTime(LocalDateTime date, Locale locale);
    String formatFullDate(LocalDate originalDate, Locale locale);

    String formatMediumDateTime(LocalDateTime date, Locale locale);
    String formatMediumDate(LocalDate originalDate, Locale locale);
    String formatMediumDateShortTime(LocalDateTime date, Locale locale);
    String formatMediumTime(LocalTime originalDate, Locale locale);

    String formatShortDateTime(LocalDateTime originalDate, Locale locale);
    String formatShortDate(LocalDate originalDate, Locale locale);
    String formatShortTime(LocalTime originalDate, Locale locale);
    String formatShortDateMediumTime(LocalDateTime originalDate, Locale locale);
}
