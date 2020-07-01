package com.csfrez.demo.i18n;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

@Service("I18nFormatter")
public class I18nFormatterImpl implements I18nFormatter {

    @Override
    public String formaFullDateTime(LocalDateTime date, Locale locale) {
        DateTimeFormatter dateFormat =DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(locale);
        return dateFormat.format(date);
    }

    @Override
    public String formatFullDate(LocalDate originalDate, Locale locale) {
        DateTimeFormatter dateFormat =DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale);
        return dateFormat.format(originalDate);
    }

    @Override
    public String formatMediumDateTime(LocalDateTime date, Locale locale) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM).withLocale(locale);
        return dateFormat.format(date);
    }

    @Override
    public String formatMediumDate(LocalDate originalDate, Locale locale) {
        DateTimeFormatter dateFormat =DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(locale);
        return dateFormat.format(originalDate);
    }

    @Override
    public String formatMediumDateShortTime(LocalDateTime date, Locale locale) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT).withLocale(locale);
        return dateFormat.format(date);
    }

    @Override
    public String formatMediumTime(LocalTime originalDate, Locale locale) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(locale);
        return dateFormat.format(originalDate);
    }

    @Override
    public String formatShortDateTime(LocalDateTime originalDate, Locale locale) {
        DateTimeFormatter dateFormat =DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(locale);
        return dateFormat.format(originalDate);
    }

    @Override
    public String formatShortDate(LocalDate originalDate, Locale locale) {
        DateTimeFormatter dateFormat =DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale);
        return dateFormat.format(originalDate);
    }

    @Override
    public String formatShortTime(LocalTime originalDate, Locale locale) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(locale);
        return dateFormat.format(originalDate);
    }

    @Override
    public String formatShortDateMediumTime(LocalDateTime originalDate, Locale locale) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.MEDIUM).withLocale(locale);
        return dateFormat.format(originalDate);
    }
}