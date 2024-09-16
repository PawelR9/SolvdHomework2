package com.computerProject;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streams {

    private static final Logger logger = LogManager.getLogger(Streams.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Maria", "Jessie", "Leo", "Paul", "Salma", "Lisa", "Maria", "Lisa", "Anna");

        List<String> shortNames = names.stream()
                .filter(name -> name.length() <= 4).toList();
        logger.info("Short names: " + shortNames);

        List<String> namesToUpperCase = names.stream().map(name -> name.toUpperCase()).toList();
        logger.info("Upper case names: " + namesToUpperCase);

        names.stream().forEach(name -> logger.info("Name: " + name));

        List<String> sortedNames = names.stream().sorted().toList();
        logger.info("Sorted names:" + sortedNames);

        List<String> uniqueNames = names.stream().distinct().toList();
        logger.info("Unique names: " + uniqueNames);

        List<String> uniqueOrderedNames = names.stream().distinct().sorted().toList();
        logger.info("Unique and sorted names: " + uniqueOrderedNames);

        long numberOfNames = names.stream().count();
        logger.info("Number of names: " + numberOfNames);

        long numberOfUniqueNames = names.stream().distinct().count();
        logger.info("Number of unique names: " + numberOfUniqueNames);

        Optional<String> reducedNames = names.stream()
                .reduce((name1, name2) -> name1 + ", " + name2);
        reducedNames.ifPresent(result -> logger.info("Reduced names: " + result));
    }
}

