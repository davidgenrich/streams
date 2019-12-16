package com.speedment.example.domainmodel.sakila.sakila.sakila.film.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.domainmodel.sakila.sakila.sakila.film.Film;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.speedment.example.domainmodel.sakila.sakila.sakila.film.Film} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedFilmManager extends Manager<Film> {
    
    TableIdentifier<Film> IDENTIFIER = TableIdentifier.of("sakila", "sakila", "film");
    List<Field<Film>> FIELDS = unmodifiableList(asList(
        Film.FILM_ID,
        Film.TITLE,
        Film.DESCRIPTION,
        Film.RELEASE_YEAR,
        Film.LANGUAGE_ID,
        Film.ORIGINAL_LANGUAGE_ID,
        Film.RENTAL_DURATION,
        Film.RENTAL_RATE,
        Film.LENGTH,
        Film.REPLACEMENT_COST,
        Film.RATING,
        Film.SPECIAL_FEATURES,
        Film.LAST_UPDATE
    ));
    
    @Override
    default Class<Film> getEntityClass() {
        return Film.class;
    }
}