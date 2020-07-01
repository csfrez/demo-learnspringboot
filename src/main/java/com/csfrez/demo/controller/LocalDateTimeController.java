package com.csfrez.demo.controller;

import com.csfrez.demo.i18n.I18nFormatterImpl;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

@RestController
public class LocalDateTimeController {

    @GetMapping("/time")
    public DateTime timeMapping() {
        return new DateTime();
    }

    @GetMapping("/time/json")
    public DateTime timeMappingJson() {
        return new JsonDateTime();
    }

    @GetMapping("/time/g11n")
    public G11nDateTime timeMappingG11n(@RequestParam(value = "language") String language) {
        Locale locale = new Locale("en", "US");
        if(!StringUtils.isEmpty(language)){
            String[] splits = language.split("_");
            locale = new Locale(splits[0], splits[1]);
        }
        return new G11nDateTime(locale);
    }

    public class DateTime {

        protected LocalDate localDate;
        protected LocalDateTime localDateTime;
        protected LocalTime localTime;

        public DateTime() {
            localDate = LocalDate.now();
            localDateTime = LocalDateTime.now();
            localTime = LocalTime.now();
        }

        public LocalDate getLocalDate() {
            return localDate;
        }

        public LocalDateTime getLocalDateTime() {
            return localDateTime;
        }

        public LocalTime getLocalTime() {
            return localTime;
        }
    }

    public class JsonDateTime extends DateTime {

        @Override
        @JsonFormat(pattern = "yyyy-MM-dd")
        public LocalDate getLocalDate() {
            return super.localDate;
        }

        @Override
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        public LocalDateTime getLocalDateTime() {
            return super.localDateTime;
        }

        @Override
        @JsonFormat(pattern = "HH:mm:ss")
        public LocalTime getLocalTime() {
            return localTime;
        }
    }

    public class G11nDateTime {

        protected String localDate;
        protected String localDateTime;
        protected String localTime;

        public G11nDateTime(Locale locale) {
            I18nFormatterImpl formatter = new I18nFormatterImpl();

            localDate = formatter.formatFullDate(LocalDate.now(), locale);
            localDateTime = formatter.formatMediumDateShortTime(LocalDateTime.now(), locale);
            localTime = formatter.formatShortTime(LocalTime.now(), locale);
        }


        public String getLocalDate() {
            return localDate;
        }

        public String getLocalDateTime() {
            return localDateTime;
        }

        public String getLocalTime() {
            return localTime;
        }
    }
}