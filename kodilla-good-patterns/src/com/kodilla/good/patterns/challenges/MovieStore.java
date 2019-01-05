package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;

class MovieStore {
    Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();

    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");
//        List<List<String>>allTranslations=new ArrayList<>();
//        allTranslations.add(ironManTranslations);
//        allTranslations.add(avengersTranslations);
//        allTranslations.add(flashTranslations);

       Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }
    public Map<String,List<String>> getMap()
    {
        return new HashMap<>(booksTitlesWithTranslations);
    }
    }

























